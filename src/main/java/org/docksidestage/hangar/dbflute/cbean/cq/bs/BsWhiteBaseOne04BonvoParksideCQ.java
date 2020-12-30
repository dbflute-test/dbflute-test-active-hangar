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
 * The base condition-query of WHITE_BASE_ONE04_BONVO_PARKSIDE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne04BonvoParksideCQ extends AbstractBsWhiteBaseOne04BonvoParksideCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne04BonvoParksideCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne04BonvoParksideCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE04_BONVO_PARKSIDE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne04BonvoParksideCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne04BonvoParksideCIQ xcreateCIQ() {
        WhiteBaseOne04BonvoParksideCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne04BonvoParksideCIQ xnewCIQ() {
        return new WhiteBaseOne04BonvoParksideCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE04_BONVO_PARKSIDE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne04BonvoParksideCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne04BonvoParksideCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _parksideId;
    public ConditionValue xdfgetParksideId()
    { if (_parksideId == null) { _parksideId = nCV(); }
      return _parksideId; }
    protected ConditionValue xgetCValueParksideId() { return xdfgetParksideId(); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetParksideId_ExistsReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("parksideId_ExistsReferrer_WhiteBaseOne04BonvoList"); }
    public String keepParksideId_ExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("parksideId_ExistsReferrer_WhiteBaseOne04BonvoList", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetParksideId_NotExistsReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("parksideId_NotExistsReferrer_WhiteBaseOne04BonvoList"); }
    public String keepParksideId_NotExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("parksideId_NotExistsReferrer_WhiteBaseOne04BonvoList", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetParksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("parksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList"); }
    public String keepParksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("parksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("parksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList"); }
    public String keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("parksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList", sq); }
    public Map<String, Object> xdfgetParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter() { return xgetSQuePmMap("parksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList"); }
    public String keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(Object pm) { return xkeepSQuePm("parksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoParksideCQ addOrderBy_ParksideId_Asc() { regOBA("PARKSIDE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoParksideCQ addOrderBy_ParksideId_Desc() { regOBD("PARKSIDE_ID"); return this; }

    protected ConditionValue _parksideName;
    public ConditionValue xdfgetParksideName()
    { if (_parksideName == null) { _parksideName = nCV(); }
      return _parksideName; }
    protected ConditionValue xgetCValueParksideName() { return xdfgetParksideName(); }

    /**
     * Add order-by as ascend. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoParksideCQ addOrderBy_ParksideName_Asc() { regOBA("PARKSIDE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoParksideCQ addOrderBy_ParksideName_Desc() { regOBD("PARKSIDE_NAME"); return this; }

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
    public BsWhiteBaseOne04BonvoParksideCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne04BonvoParksideCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteBaseOne04BonvoParksideCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne04BonvoParksideCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne04BonvoParksideCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoParksideCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne04BonvoParksideCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne04BonvoParksideCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne04BonvoParksideCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne04BonvoParksideCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne04BonvoParksideCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne04BonvoParksideCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne04BonvoParksideCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne04BonvoParksideCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne04BonvoParksideCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
