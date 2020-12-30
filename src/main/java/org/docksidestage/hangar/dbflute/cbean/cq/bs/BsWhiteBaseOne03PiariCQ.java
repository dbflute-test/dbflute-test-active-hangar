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
 * The base condition-query of WHITE_BASE_ONE03_PIARI.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne03PiariCQ extends AbstractBsWhiteBaseOne03PiariCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne03PiariCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne03PiariCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE03_PIARI) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne03PiariCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne03PiariCIQ xcreateCIQ() {
        WhiteBaseOne03PiariCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne03PiariCIQ xnewCIQ() {
        return new WhiteBaseOne03PiariCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE03_PIARI on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne03PiariCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne03PiariCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _piariId;
    public ConditionValue xdfgetPiariId()
    { if (_piariId == null) { _piariId = nCV(); }
      return _piariId; }
    protected ConditionValue xgetCValuePiariId() { return xdfgetPiariId(); }

    public Map<String, WhiteBaseCQ> xdfgetPiariId_ExistsReferrer_WhiteBaseList() { return xgetSQueMap("piariId_ExistsReferrer_WhiteBaseList"); }
    public String keepPiariId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("piariId_ExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetPiariId_NotExistsReferrer_WhiteBaseList() { return xgetSQueMap("piariId_NotExistsReferrer_WhiteBaseList"); }
    public String keepPiariId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("piariId_NotExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetPiariId_SpecifyDerivedReferrer_WhiteBaseList() { return xgetSQueMap("piariId_SpecifyDerivedReferrer_WhiteBaseList"); }
    public String keepPiariId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("piariId_SpecifyDerivedReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetPiariId_QueryDerivedReferrer_WhiteBaseList() { return xgetSQueMap("piariId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepPiariId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("piariId_QueryDerivedReferrer_WhiteBaseList", sq); }
    public Map<String, Object> xdfgetPiariId_QueryDerivedReferrer_WhiteBaseListParameter() { return xgetSQuePmMap("piariId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepPiariId_QueryDerivedReferrer_WhiteBaseListParameter(Object pm) { return xkeepSQuePm("piariId_QueryDerivedReferrer_WhiteBaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne03PiariCQ addOrderBy_PiariId_Asc() { regOBA("PIARI_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne03PiariCQ addOrderBy_PiariId_Desc() { regOBD("PIARI_ID"); return this; }

    protected ConditionValue _piariName;
    public ConditionValue xdfgetPiariName()
    { if (_piariName == null) { _piariName = nCV(); }
      return _piariName; }
    protected ConditionValue xgetCValuePiariName() { return xdfgetPiariName(); }

    /**
     * Add order-by as ascend. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne03PiariCQ addOrderBy_PiariName_Asc() { regOBA("PIARI_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne03PiariCQ addOrderBy_PiariName_Desc() { regOBD("PIARI_NAME"); return this; }

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
    public BsWhiteBaseOne03PiariCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne03PiariCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteBaseOne03PiariCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne03PiariCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne03PiariCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne03PiariCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne03PiariCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne03PiariCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne03PiariCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne03PiariCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne03PiariCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne03PiariCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne03PiariCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne03PiariCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne03PiariCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
