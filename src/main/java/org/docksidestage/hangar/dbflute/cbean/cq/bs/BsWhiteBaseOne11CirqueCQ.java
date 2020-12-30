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
 * The base condition-query of WHITE_BASE_ONE11_CIRQUE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne11CirqueCQ extends AbstractBsWhiteBaseOne11CirqueCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne11CirqueCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne11CirqueCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE11_CIRQUE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne11CirqueCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne11CirqueCIQ xcreateCIQ() {
        WhiteBaseOne11CirqueCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne11CirqueCIQ xnewCIQ() {
        return new WhiteBaseOne11CirqueCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE11_CIRQUE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne11CirqueCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne11CirqueCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _cirqueId;
    public ConditionValue xdfgetCirqueId()
    { if (_cirqueId == null) { _cirqueId = nCV(); }
      return _cirqueId; }
    protected ConditionValue xgetCValueCirqueId() { return xdfgetCirqueId(); }

    /**
     * Add order-by as ascend. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne11CirqueCQ addOrderBy_CirqueId_Asc() { regOBA("CIRQUE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne11CirqueCQ addOrderBy_CirqueId_Desc() { regOBD("CIRQUE_ID"); return this; }

    protected ConditionValue _cirqueName;
    public ConditionValue xdfgetCirqueName()
    { if (_cirqueName == null) { _cirqueName = nCV(); }
      return _cirqueName; }
    protected ConditionValue xgetCValueCirqueName() { return xdfgetCirqueName(); }

    /**
     * Add order-by as ascend. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne11CirqueCQ addOrderBy_CirqueName_Asc() { regOBA("CIRQUE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne11CirqueCQ addOrderBy_CirqueName_Desc() { regOBD("CIRQUE_NAME"); return this; }

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
    public BsWhiteBaseOne11CirqueCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne11CirqueCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseOne11CirqueCQ bq = (WhiteBaseOne11CirqueCQ)bqs;
        WhiteBaseOne11CirqueCQ uq = (WhiteBaseOne11CirqueCQ)uqs;
        if (bq.hasConditionQueryWhiteBase()) {
            uq.queryWhiteBase().reflectRelationOnUnionQuery(bq.queryWhiteBase(), uq.queryWhiteBase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE by my CIRQUE_ID, named 'whiteBase'.
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
        String nrp = xresolveNRP("WHITE_BASE_ONE11_CIRQUE", "whiteBase"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, WhiteBaseOne11CirqueCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne11CirqueCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne11CirqueCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne11CirqueCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne11CirqueCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne11CirqueCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne11CirqueCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne11CirqueCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne11CirqueCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne11CirqueCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne11CirqueCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne11CirqueCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne11CirqueCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
