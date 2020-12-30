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
 * The base condition-query of WHITE_BASE_ONE09_PALM.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne09PalmCQ extends AbstractBsWhiteBaseOne09PalmCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne09PalmCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne09PalmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE09_PALM) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne09PalmCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne09PalmCIQ xcreateCIQ() {
        WhiteBaseOne09PalmCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne09PalmCIQ xnewCIQ() {
        return new WhiteBaseOne09PalmCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE09_PALM on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne09PalmCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne09PalmCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _palmId;
    public ConditionValue xdfgetPalmId()
    { if (_palmId == null) { _palmId = nCV(); }
      return _palmId; }
    protected ConditionValue xgetCValuePalmId() { return xdfgetPalmId(); }

    /**
     * Add order-by as ascend. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne09PalmCQ addOrderBy_PalmId_Asc() { regOBA("PALM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne09PalmCQ addOrderBy_PalmId_Desc() { regOBD("PALM_ID"); return this; }

    protected ConditionValue _palmName;
    public ConditionValue xdfgetPalmName()
    { if (_palmName == null) { _palmName = nCV(); }
      return _palmName; }
    protected ConditionValue xgetCValuePalmName() { return xdfgetPalmName(); }

    /**
     * Add order-by as ascend. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne09PalmCQ addOrderBy_PalmName_Asc() { regOBA("PALM_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne09PalmCQ addOrderBy_PalmName_Desc() { regOBD("PALM_NAME"); return this; }

    protected ConditionValue _baseId;
    public ConditionValue xdfgetBaseId()
    { if (_baseId == null) { _baseId = nCV(); }
      return _baseId; }
    protected ConditionValue xgetCValueBaseId() { return xdfgetBaseId(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne09PalmCQ addOrderBy_BaseId_Asc() { regOBA("BASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne09PalmCQ addOrderBy_BaseId_Desc() { regOBD("BASE_ID"); return this; }

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
    public BsWhiteBaseOne09PalmCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne09PalmCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseOne09PalmCQ bq = (WhiteBaseOne09PalmCQ)bqs;
        WhiteBaseOne09PalmCQ uq = (WhiteBaseOne09PalmCQ)uqs;
        if (bq.hasConditionQueryWhiteBase()) {
            uq.queryWhiteBase().reflectRelationOnUnionQuery(bq.queryWhiteBase(), uq.queryWhiteBase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE by my BASE_ID, named 'whiteBase'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseCQ queryWhiteBase() {
        return xdfgetConditionQueryWhiteBase();
    }
    public WhiteBaseCQ xdfgetConditionQueryWhiteBase() {
        String prop = "whiteBase";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBase()); xsetupOuterJoinWhiteBase(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseCQ xcreateQueryWhiteBase() {
        String nrp = xresolveNRP("WHITE_BASE_ONE09_PALM", "whiteBase"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBase", nrp);
    }
    protected void xsetupOuterJoinWhiteBase() { xregOutJo("whiteBase"); }
    public boolean hasConditionQueryWhiteBase() { return xhasQueRlMap("whiteBase"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseOne09PalmCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne09PalmCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne09PalmCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne09PalmCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne09PalmCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne09PalmCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne09PalmCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne09PalmCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne09PalmCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne09PalmCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne09PalmCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne09PalmCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne09PalmCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
