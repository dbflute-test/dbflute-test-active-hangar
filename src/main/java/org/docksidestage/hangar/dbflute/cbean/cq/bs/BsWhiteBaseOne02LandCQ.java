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
 * The base condition-query of WHITE_BASE_ONE02_LAND.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne02LandCQ extends AbstractBsWhiteBaseOne02LandCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne02LandCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne02LandCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE02_LAND) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne02LandCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne02LandCIQ xcreateCIQ() {
        WhiteBaseOne02LandCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne02LandCIQ xnewCIQ() {
        return new WhiteBaseOne02LandCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE02_LAND on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne02LandCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne02LandCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _landId;
    public ConditionValue xdfgetLandId()
    { if (_landId == null) { _landId = nCV(); }
      return _landId; }
    protected ConditionValue xgetCValueLandId() { return xdfgetLandId(); }

    public Map<String, WhiteBaseCQ> xdfgetLandId_ExistsReferrer_WhiteBaseList() { return xgetSQueMap("landId_ExistsReferrer_WhiteBaseList"); }
    public String keepLandId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("landId_ExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetLandId_NotExistsReferrer_WhiteBaseList() { return xgetSQueMap("landId_NotExistsReferrer_WhiteBaseList"); }
    public String keepLandId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("landId_NotExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetLandId_SpecifyDerivedReferrer_WhiteBaseList() { return xgetSQueMap("landId_SpecifyDerivedReferrer_WhiteBaseList"); }
    public String keepLandId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("landId_SpecifyDerivedReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetLandId_QueryDerivedReferrer_WhiteBaseList() { return xgetSQueMap("landId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepLandId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("landId_QueryDerivedReferrer_WhiteBaseList", sq); }
    public Map<String, Object> xdfgetLandId_QueryDerivedReferrer_WhiteBaseListParameter() { return xgetSQuePmMap("landId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepLandId_QueryDerivedReferrer_WhiteBaseListParameter(Object pm) { return xkeepSQuePm("landId_QueryDerivedReferrer_WhiteBaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne02LandCQ addOrderBy_LandId_Asc() { regOBA("LAND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne02LandCQ addOrderBy_LandId_Desc() { regOBD("LAND_ID"); return this; }

    protected ConditionValue _landName;
    public ConditionValue xdfgetLandName()
    { if (_landName == null) { _landName = nCV(); }
      return _landName; }
    protected ConditionValue xgetCValueLandName() { return xdfgetLandName(); }

    /**
     * Add order-by as ascend. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne02LandCQ addOrderBy_LandName_Asc() { regOBA("LAND_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne02LandCQ addOrderBy_LandName_Desc() { regOBD("LAND_NAME"); return this; }

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
    public BsWhiteBaseOne02LandCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne02LandCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteBaseOne02LandCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne02LandCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne02LandCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne02LandCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne02LandCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne02LandCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne02LandCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne02LandCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne02LandCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne02LandCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne02LandCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne02LandCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne02LandCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
