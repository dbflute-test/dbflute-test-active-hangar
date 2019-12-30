package org.docksidestage.hangar.dbflute.nogen;

import java.time.Duration;
import java.util.concurrent.Executor;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.bhv.readable.CBCall;
import org.dbflute.bhv.readable.EntityRowHandler;
import org.dbflute.cbean.ConditionBean;
import org.docksidestage.hangar.dbflute.nogen.akka.AkkaSourceHelper;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * @param <ENTITY> The type of entity handled by this behavior.
 * @param <CB> The type of condition-bean handled by this behavior.
 * @author jflute (2019/12/30 Monday at sheraton)
 */
public abstract class ExtendedAbstractBehaviorWritable<ENTITY extends Entity, CB extends ConditionBean>
        extends AbstractBehaviorWritable<ENTITY, CB> implements ExtendedBehaviorWritable<ENTITY, CB> {

    // ===================================================================================
    //                                                                             Gateway
    //                                                                             =======
    // gateway to generated methods in behavior implementation
    protected abstract void selectCursor(CBCall<CB> cbLambda, EntityRowHandler<ENTITY> entityLambda);

    // ===================================================================================
    //                                                                               Akka
    //                                                                              ======
    @Override
    public Source<ENTITY, NotUsed> source(CBCall<CB> cbLambda, Executor executor) {
        return AkkaSourceHelper.<ENTITY> generator(Duration.ofSeconds(5)).mapMaterializedValue(generator -> {
            return generator.runAsync(() -> {
                selectCursor(cbLambda, generator::pushNext);
            }, executor);
        });
    }
}
