package org.docksidestage.hangar.dbflute.nogen;

import java.util.concurrent.Executor;

import org.dbflute.Entity;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.readable.CBCall;
import org.dbflute.cbean.ConditionBean;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * @param <ENTITY> The type of entity handled by this behavior.
 * @param <CB> The type of condition-bean handled by this behavior.
 * @author jflute (2019/12/30 Monday at sheraton)
 */
public interface ExtendedBehaviorWritable<ENTITY extends Entity, CB extends ConditionBean> extends BehaviorWritable {

    // ===================================================================================
    //                                                                               Akka
    //                                                                              ======
    /**
     * Create Source of Akka Streams by selectCursor() <br>
     * referring https://gist.github.com/XenonAbe/667de82ae11bf3a15e7e8b15b410ed35
     * @param cbLambda The callback for condition-bean of target table. (NotNull)
     * @param executor The executor of handler (NotNull)
     * @return The source of entity. (NotNull)
     */
    Source<ENTITY, NotUsed> source(CBCall<CB> cbLambda, Executor executor);
}
