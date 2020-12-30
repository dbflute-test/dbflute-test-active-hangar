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
 * The condition-query for in-line of WHITE_BASE_ONE04_BONVO_PARKSIDE.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne04BonvoParksideCIQ extends AbstractBsWhiteBaseOne04BonvoParksideCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteBaseOne04BonvoParksideCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteBaseOne04BonvoParksideCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteBaseOne04BonvoParksideCQ myCQ) {
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
    protected ConditionValue xgetCValueParksideId() { return _myCQ.xdfgetParksideId(); }
    public String keepParksideId_ExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepParksideId_NotExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepParksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueParksideName() { return _myCQ.xdfgetParksideName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteBaseOne04BonvoParksideCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoParksideCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteBaseOne04BonvoParksideCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteBaseOne04BonvoParksideCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteBaseOne04BonvoParksideCB.class.getName(); }
    protected String xinCQ() { return WhiteBaseOne04BonvoParksideCQ.class.getName(); }
}
