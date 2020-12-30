package org.docksidestage.hangar.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.hangar.dbflute.cbean.cq.ciq.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_BASE_ONE01_SEA_BROADWAY.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaBroadwayCQ extends AbstractBsWhiteBaseOne01SeaBroadwayCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne01SeaBroadwayCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaBroadwayCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE01_SEA_BROADWAY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne01SeaBroadwayCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne01SeaBroadwayCIQ xcreateCIQ() {
        WhiteBaseOne01SeaBroadwayCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne01SeaBroadwayCIQ xnewCIQ() {
        return new WhiteBaseOne01SeaBroadwayCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE01_SEA_BROADWAY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne01SeaBroadwayCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne01SeaBroadwayCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _broadwayId;
    public ConditionValue xdfgetBroadwayId()
    { if (_broadwayId == null) { _broadwayId = nCV(); }
      return _broadwayId; }
    protected ConditionValue xgetCValueBroadwayId() { return xdfgetBroadwayId(); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetBroadwayId_ExistsReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("broadwayId_ExistsReferrer_WhiteBaseOne01SeaList"); }
    public String keepBroadwayId_ExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("broadwayId_ExistsReferrer_WhiteBaseOne01SeaList", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetBroadwayId_NotExistsReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("broadwayId_NotExistsReferrer_WhiteBaseOne01SeaList"); }
    public String keepBroadwayId_NotExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("broadwayId_NotExistsReferrer_WhiteBaseOne01SeaList", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetBroadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("broadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList"); }
    public String keepBroadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("broadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("broadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList"); }
    public String keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("broadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList", sq); }
    public Map<String, Object> xdfgetBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter() { return xgetSQuePmMap("broadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList"); }
    public String keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(Object pm) { return xkeepSQuePm("broadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList", pm); }

    /**
     * Add order-by as ascend. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaBroadwayCQ addOrderBy_BroadwayId_Asc() { regOBA("BROADWAY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaBroadwayCQ addOrderBy_BroadwayId_Desc() { regOBD("BROADWAY_ID"); return this; }

    protected ConditionValue _broadwayName;
    public ConditionValue xdfgetBroadwayName()
    { if (_broadwayName == null) { _broadwayName = nCV(); }
      return _broadwayName; }
    protected ConditionValue xgetCValueBroadwayName() { return xdfgetBroadwayName(); }

    /**
     * Add order-by as ascend. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaBroadwayCQ addOrderBy_BroadwayName_Asc() { regOBA("BROADWAY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaBroadwayCQ addOrderBy_BroadwayName_Desc() { regOBD("BROADWAY_NAME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaBroadwayCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaBroadwayCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseOne01SeaBroadwayCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne01SeaBroadwayCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaBroadwayCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaBroadwayCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne01SeaBroadwayCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaBroadwayCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne01SeaBroadwayCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne01SeaBroadwayCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne01SeaBroadwayCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaBroadwayCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne01SeaBroadwayCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne01SeaBroadwayCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne01SeaBroadwayCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
