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
 * The condition-query for in-line of WHITE_BASE_ONE01_SEA.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaCIQ extends AbstractBsWhiteBaseOne01SeaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWhiteBaseOne01SeaCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WhiteBaseOne01SeaCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWhiteBaseOne01SeaCQ myCQ) {
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
    protected ConditionValue xgetCValueSeaId() { return _myCQ.xdfgetSeaId(); }
    public String keepSeaId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSeaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSeaId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSeaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSeaId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSeaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueSeaName() { return _myCQ.xdfgetSeaName(); }
    protected ConditionValue xgetCValueBroadwayId() { return _myCQ.xdfgetBroadwayId(); }
    protected ConditionValue xgetCValueDocksideId() { return _myCQ.xdfgetDocksideId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WhiteBaseOne01SeaCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WhiteBaseOne01SeaCB.class.getName(); }
    protected String xinCQ() { return WhiteBaseOne01SeaCQ.class.getName(); }
}
