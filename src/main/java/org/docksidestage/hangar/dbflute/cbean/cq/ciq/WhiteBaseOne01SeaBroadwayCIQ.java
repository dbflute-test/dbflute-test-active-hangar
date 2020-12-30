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
 * The condition-query for in-line of WHITE_BASE_ONE01_SEA_BROADWAY.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaBroadwayCIQ extends AbstractBsWhiteBaseOne01SeaBroadwayCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteBaseOne01SeaBroadwayCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteBaseOne01SeaBroadwayCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteBaseOne01SeaBroadwayCQ myCQ) {
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
    protected ConditionValue xgetCValueBroadwayId() { return _myCQ.xdfgetBroadwayId(); }
    public String keepBroadwayId_ExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBroadwayId_NotExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBroadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueBroadwayName() { return _myCQ.xdfgetBroadwayName(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteBaseOne01SeaBroadwayCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaBroadwayCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaBroadwayCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteBaseOne01SeaBroadwayCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteBaseOne01SeaBroadwayCB.class.getName(); }
    protected String xinCQ() { return WhiteBaseOne01SeaBroadwayCQ.class.getName(); }
}
