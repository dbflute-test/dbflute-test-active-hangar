package org.docksidestage.hangar.dbflute.nogen;

import org.dbflute.Entity;
import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.ConditionBean;

/**
 * @param <ENTITY> The type of entity handled by this behavior.
 * @param <CB> The type of condition-bean handled by this behavior.
 * @author jflute
 */
public abstract class ExtendedAbstractBehaviorWritable<ENTITY extends Entity, CB extends ConditionBean>
        extends AbstractBehaviorWritable<ENTITY, CB> {
}
