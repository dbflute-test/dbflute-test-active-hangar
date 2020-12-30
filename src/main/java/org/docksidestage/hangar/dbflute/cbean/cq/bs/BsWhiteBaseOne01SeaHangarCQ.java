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
 * The base condition-query of WHITE_BASE_ONE01_SEA_HANGAR.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaHangarCQ extends AbstractBsWhiteBaseOne01SeaHangarCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne01SeaHangarCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaHangarCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE01_SEA_HANGAR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne01SeaHangarCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne01SeaHangarCIQ xcreateCIQ() {
        WhiteBaseOne01SeaHangarCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne01SeaHangarCIQ xnewCIQ() {
        return new WhiteBaseOne01SeaHangarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE01_SEA_HANGAR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne01SeaHangarCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne01SeaHangarCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _hangarId;
    public ConditionValue xdfgetHangarId()
    { if (_hangarId == null) { _hangarId = nCV(); }
      return _hangarId; }
    protected ConditionValue xgetCValueHangarId() { return xdfgetHangarId(); }

    /**
     * Add order-by as ascend. <br>
     * HANGAR_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaHangarCQ addOrderBy_HangarId_Asc() { regOBA("HANGAR_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANGAR_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaHangarCQ addOrderBy_HangarId_Desc() { regOBD("HANGAR_ID"); return this; }

    protected ConditionValue _hangarName;
    public ConditionValue xdfgetHangarName()
    { if (_hangarName == null) { _hangarName = nCV(); }
      return _hangarName; }
    protected ConditionValue xgetCValueHangarName() { return xdfgetHangarName(); }

    /**
     * Add order-by as ascend. <br>
     * HANGAR_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaHangarCQ addOrderBy_HangarName_Asc() { regOBA("HANGAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * HANGAR_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaHangarCQ addOrderBy_HangarName_Desc() { regOBD("HANGAR_NAME"); return this; }

    protected ConditionValue _seaId;
    public ConditionValue xdfgetSeaId()
    { if (_seaId == null) { _seaId = nCV(); }
      return _seaId; }
    protected ConditionValue xgetCValueSeaId() { return xdfgetSeaId(); }

    /**
     * Add order-by as ascend. <br>
     * SEA_ID: {UQ, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaHangarCQ addOrderBy_SeaId_Asc() { regOBA("SEA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEA_ID: {UQ, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaHangarCQ addOrderBy_SeaId_Desc() { regOBD("SEA_ID"); return this; }

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
    public BsWhiteBaseOne01SeaHangarCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne01SeaHangarCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseOne01SeaHangarCQ bq = (WhiteBaseOne01SeaHangarCQ)bqs;
        WhiteBaseOne01SeaHangarCQ uq = (WhiteBaseOne01SeaHangarCQ)uqs;
        if (bq.hasConditionQueryWhiteBaseOne01Sea()) {
            uq.queryWhiteBaseOne01Sea().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne01Sea(), uq.queryWhiteBaseOne01Sea());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne01SeaCQ queryWhiteBaseOne01Sea() {
        return xdfgetConditionQueryWhiteBaseOne01Sea();
    }
    public WhiteBaseOne01SeaCQ xdfgetConditionQueryWhiteBaseOne01Sea() {
        String prop = "whiteBaseOne01Sea";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne01Sea()); xsetupOuterJoinWhiteBaseOne01Sea(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne01SeaCQ xcreateQueryWhiteBaseOne01Sea() {
        String nrp = xresolveNRP("WHITE_BASE_ONE01_SEA_HANGAR", "whiteBaseOne01Sea"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne01SeaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne01Sea", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne01Sea() { xregOutJo("whiteBaseOne01Sea"); }
    public boolean hasConditionQueryWhiteBaseOne01Sea() { return xhasQueRlMap("whiteBaseOne01Sea"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseOne01SeaHangarCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne01SeaHangarCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaHangarCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaHangarCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne01SeaHangarCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaHangarCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne01SeaHangarCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne01SeaHangarCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne01SeaHangarCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaHangarCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne01SeaHangarCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne01SeaHangarCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne01SeaHangarCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
