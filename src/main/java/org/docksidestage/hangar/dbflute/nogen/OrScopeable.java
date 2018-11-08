package org.docksidestage.hangar.dbflute.nogen;

import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.scoping.AndQuery;
import org.dbflute.cbean.scoping.OrQuery;

/**
 * @param <CB> The type of condition-bean.
 * @author jflute
 */
public interface OrScopeable<CB extends ConditionBean> {

    void orScopeQuery(OrQuery<CB> orCBLambda);

    void orScopeQueryAndPart(AndQuery<CB> andCBLambda);
}
