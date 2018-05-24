package org.docksidestage.hangar.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.bs.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of WHITE_COMPOUND_PK.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkCIQ extends AbstractBsWhiteCompoundPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteCompoundPkCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteCompoundPkCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteCompoundPkCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValuePkFirstId() { return _myCQ.xdfgetPkFirstId(); }
    protected ConditionValue xgetCValuePkSecondId() { return _myCQ.xdfgetPkSecondId(); }
    protected ConditionValue xgetCValueCompoundPkName() { return _myCQ.xdfgetCompoundPkName(); }
    protected ConditionValue xgetCValueReferredId() { return _myCQ.xdfgetReferredId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteCompoundPkCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xinCQ() { return WhiteCompoundPkCQ.class.getName(); }
}
