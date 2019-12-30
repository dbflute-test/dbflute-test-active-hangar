package org.docksidestage.hangar.dbflute.nogen.akka;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import akka.NotUsed;
import akka.stream.Attributes;
import akka.stream.Outlet;
import akka.stream.Shape;
import akka.stream.SourceShape;
import akka.stream.javadsl.Source;
import akka.stream.stage.AbstractOutHandler;
import akka.stream.stage.AsyncCallback;
import akka.stream.stage.GraphStageLogic;
import akka.stream.stage.GraphStageWithMaterializedValue;
import scala.Tuple2;
import scala.concurrent.Await;
import scala.runtime.BoxedUnit;

/**
 * @author jflute (2019/12/30 Monday at sheraton) (referring https://gist.github.com/XenonAbe/667de82ae11bf3a15e7e8b15b410ed35)
 */
public class AkkaSourceHelper {

    /**
     * Creates a `Source` that is materialized as an [[stream.SourceGenerator]].
     *
     * 非同期でアクションを実行してSource値を生成する
     *
     * <p>例
     * <pre>{@code
     *    final var entitySource = StreamHelper.<ENTITY>generator()
     *        .mapMaterializedValue(generator -> generator.runAsync(() -> {
     *            behavior.selectCursor(cb -> {
     *                cb.query().addOrderBy_Ymd_Asc();
     *            }, generator::pushNext);
     *        }, future.executors().database()));
     * }</pre>
     *
     * <p>表面的には以下の動作と同様
     * <pre>{@code
     *    final var entitySource = Source.<ENTITY>queue(16, OverflowStrategy.fail())
     *        .mapMaterializedValue(queue -> {
     *                CompletableFuture.runAsync(() -> {
     *                    behavior.selectCursor(cb -> {
     *                        cb.query().addOrderBy_Ymd_Asc();
     *                    }, queue::offer);
     *                  }, future.executors().database())
     *                .whenComplete((aVoid, throwable) -> {
     *                    if (throwable == null)
     *                        queue.complete();
     *                    else
     *                        queue.fail(throwable);
     *                });
     *                return NotUsed.notUsed();
     *            });
     * }</pre>
     *
     * <p>しかし、queueではなくSemaphoreによるブロッキングを用いているので、内部動作は次のものに近い
     * <pre>{@code
     *    final var entitySourceS = StreamConverters.asOutputStream()
     *        .mapMaterializedValue(outputStream -> {
     *            CompletableFuture.runAsync(() -> {
     *                try(outputStream) {
     *                    outputStream.write();
     *                }
     *            });
     *            return NotUsed.notUsed();
     *        });
     * }</pre>
     *
     * @param writeTimeout the max time the write operation on the materialized OutputStream should block (NotNull)
     * @return The source of generator. (NotNull)
     */
    public static <T> Source<T, AkkaSourceGenerator<T>> generator(Duration writeTimeout) {
        return Source.fromGraph(new GeneratorSourceStage<>(writeTimeout));
    }

    public static class GeneratorSourceStage<T> extends GraphStageWithMaterializedValue<SourceShape<T>, AkkaSourceGenerator<T>> {
        //private static final Logger.ALogger logger = Logger.of(GeneratorSourceStage.class);
        private final Duration writeTimeout;
        // Define the (sole) output port of this stage
        public final Outlet<T> out = Outlet.create("GeneratorSource.out");
        // Define the shape of this stage, which is SourceShape with the port we defined above
        private final SourceShape<T> shape = SourceShape.of(out);

        public GeneratorSourceStage(Duration writeTimeout) {
            this.writeTimeout = writeTimeout;
        }

        @Override
        public SourceShape<T> shape() {
            return shape;
        }

        @Override
        public Tuple2<GraphStageLogic, AkkaSourceGenerator<T>> createLogicAndMaterializedValue(Attributes inheritedAttributes) {
            final int maxBuffer = inheritedAttributes.getAttribute(Attributes.InputBuffer.class, new Attributes.InputBuffer(16, 16)).max();
            final Semaphore semaphore = new Semaphore(maxBuffer, true);
            final QueueRunnerSourceLogic logic = new QueueRunnerSourceLogic(shape(), semaphore);
            final AkkaSourceGenerator<T> queueRunner = new SourceGeneratorImpl<>(semaphore, logic.upstreamCallback, writeTimeout);
            return new Tuple2<>(logic, queueRunner);
        }

        private class QueueRunnerSourceLogic extends GraphStageLogic {
            private final AsyncCallback<AdapterToStageMessage> upstreamCallback = createAsyncCallback(this::onAsyncMessage);
            private final Semaphore semaphore;

            public QueueRunnerSourceLogic(Shape shape, Semaphore semaphore) {
                super(shape);
                this.semaphore = semaphore;
            }

            @SuppressWarnings("unchecked")
            private void onAsyncMessage(AdapterToStageMessage event) {
                if (event instanceof Next) {
                    final T elem = ((Next<T>) event).elem;
                    emit(out, elem, () -> {
                        semaphore.release();
                        return BoxedUnit.UNIT;
                    });
                } else if (event instanceof Complete) {
                    completeStage();
                } else if (event instanceof Fail) {
                    failStage(((Fail) event).throwable);
                }
            }

            {
                setHandler(out, new AbstractOutHandler() {
                    @Override
                    public void onPull() {
                    }
                });
            }
        }
    }

    private interface AdapterToStageMessage {
    }

    private static class Next<T> implements AdapterToStageMessage {
        final T elem;

        private Next(T elem) {
            this.elem = elem;
        }
    }

    private static class Complete implements AdapterToStageMessage {
    }

    private static class Fail implements AdapterToStageMessage {
        final Throwable throwable;

        private Fail(Throwable throwable) {
            this.throwable = throwable;
        }
    }

    private static class SourceGeneratorImpl<T> implements AkkaSourceGenerator<T> {
        private final Semaphore unfulfilledDemand;
        private final AsyncCallback<AdapterToStageMessage> sendToStage;
        private final Duration writeTimeout;

        private SourceGeneratorImpl(Semaphore unfulfilledDemand, AsyncCallback<AdapterToStageMessage> sendToStage, Duration writeTimeout) {
            this.unfulfilledDemand = unfulfilledDemand;
            this.sendToStage = sendToStage;
            this.writeTimeout = writeTimeout;
        }

        @Override
        public NotUsed runAsync(Runnable runnable, Executor executor) {
            CompletableFuture.runAsync(runnable, executor).whenComplete((aVoid, throwable) -> {
                if (throwable == null)
                    complete();
                else
                    fail(throwable);
            });
            return NotUsed.notUsed();
        }

        @Override
        public void pushNext(T elem) {
            try {
                if (!unfulfilledDemand.tryAcquire(writeTimeout.toMillis(), TimeUnit.MILLISECONDS)) {
                    throw new IOException("Timed out trying to write data to stream");
                }
                Await.result(sendToStage.invokeWithFeedback(new Next<>(elem)),
                        scala.concurrent.duration.Duration.fromNanos(writeTimeout.toNanos()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private void complete() {
            try {
                Await.result(sendToStage.invokeWithFeedback(new Complete()),
                        scala.concurrent.duration.Duration.fromNanos(writeTimeout.toNanos()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private void fail(Throwable throwable) {
            try {
                Await.result(sendToStage.invokeWithFeedback(new Fail(throwable)),
                        scala.concurrent.duration.Duration.fromNanos(writeTimeout.toNanos()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}