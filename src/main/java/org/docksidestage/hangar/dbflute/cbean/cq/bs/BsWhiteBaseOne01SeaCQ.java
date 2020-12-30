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
 * The base condition-query of WHITE_BASE_ONE01_SEA.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaCQ extends AbstractBsWhiteBaseOne01SeaCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne01SeaCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE01_SEA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne01SeaCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne01SeaCIQ xcreateCIQ() {
        WhiteBaseOne01SeaCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne01SeaCIQ xnewCIQ() {
        return new WhiteBaseOne01SeaCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE01_SEA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne01SeaCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne01SeaCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _seaId;
    public ConditionValue xdfgetSeaId()
    { if (_seaId == null) { _seaId = nCV(); }
      return _seaId; }
    protected ConditionValue xgetCValueSeaId() { return xdfgetSeaId(); }

    public Map<String, WhiteBaseCQ> xdfgetSeaId_ExistsReferrer_WhiteBaseList() { return xgetSQueMap("seaId_ExistsReferrer_WhiteBaseList"); }
    public String keepSeaId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("seaId_ExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetSeaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList() { return xgetSQueMap("seaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList"); }
    public String keepSeaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("seaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetSeaId_NotExistsReferrer_WhiteBaseList() { return xgetSQueMap("seaId_NotExistsReferrer_WhiteBaseList"); }
    public String keepSeaId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("seaId_NotExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetSeaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList() { return xgetSQueMap("seaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList"); }
    public String keepSeaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("seaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetSeaId_SpecifyDerivedReferrer_WhiteBaseList() { return xgetSQueMap("seaId_SpecifyDerivedReferrer_WhiteBaseList"); }
    public String keepSeaId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("seaId_SpecifyDerivedReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetSeaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList() { return xgetSQueMap("seaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList"); }
    public String keepSeaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("seaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetSeaId_QueryDerivedReferrer_WhiteBaseList() { return xgetSQueMap("seaId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("seaId_QueryDerivedReferrer_WhiteBaseList", sq); }
    public Map<String, Object> xdfgetSeaId_QueryDerivedReferrer_WhiteBaseListParameter() { return xgetSQuePmMap("seaId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseListParameter(Object pm) { return xkeepSQuePm("seaId_QueryDerivedReferrer_WhiteBaseList", pm); }

    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList() { return xgetSQueMap("seaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList"); }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("seaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList", sq); }
    public Map<String, Object> xdfgetSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampListParameter() { return xgetSQuePmMap("seaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList"); }
    public String keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampListParameter(Object pm) { return xkeepSQuePm("seaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_SeaId_Asc() { regOBA("SEA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_SeaId_Desc() { regOBD("SEA_ID"); return this; }

    protected ConditionValue _seaName;
    public ConditionValue xdfgetSeaName()
    { if (_seaName == null) { _seaName = nCV(); }
      return _seaName; }
    protected ConditionValue xgetCValueSeaName() { return xdfgetSeaName(); }

    /**
     * Add order-by as ascend. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_SeaName_Asc() { regOBA("SEA_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_SeaName_Desc() { regOBD("SEA_NAME"); return this; }

    protected ConditionValue _broadwayId;
    public ConditionValue xdfgetBroadwayId()
    { if (_broadwayId == null) { _broadwayId = nCV(); }
      return _broadwayId; }
    protected ConditionValue xgetCValueBroadwayId() { return xdfgetBroadwayId(); }

    /**
     * Add order-by as ascend. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_BroadwayId_Asc() { regOBA("BROADWAY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_BroadwayId_Desc() { regOBD("BROADWAY_ID"); return this; }

    protected ConditionValue _docksideId;
    public ConditionValue xdfgetDocksideId()
    { if (_docksideId == null) { _docksideId = nCV(); }
      return _docksideId; }
    protected ConditionValue xgetCValueDocksideId() { return xdfgetDocksideId(); }

    /**
     * Add order-by as ascend. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_DocksideId_Asc() { regOBA("DOCKSIDE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaCQ addOrderBy_DocksideId_Desc() { regOBD("DOCKSIDE_ID"); return this; }

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
    public BsWhiteBaseOne01SeaCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne01SeaCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseOne01SeaCQ bq = (WhiteBaseOne01SeaCQ)bqs;
        WhiteBaseOne01SeaCQ uq = (WhiteBaseOne01SeaCQ)uqs;
        if (bq.hasConditionQueryWhiteBaseOne01SeaBroadway()) {
            uq.queryWhiteBaseOne01SeaBroadway().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne01SeaBroadway(), uq.queryWhiteBaseOne01SeaBroadway());
        }
        if (bq.hasConditionQueryWhiteBaseOne01SeaDockside()) {
            uq.queryWhiteBaseOne01SeaDockside().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne01SeaDockside(), uq.queryWhiteBaseOne01SeaDockside());
        }
        if (bq.hasConditionQueryWhiteBaseOne01SeaHangarAsOne()) {
            uq.queryWhiteBaseOne01SeaHangarAsOne().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne01SeaHangarAsOne(), uq.queryWhiteBaseOne01SeaHangarAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne01SeaBroadwayCQ queryWhiteBaseOne01SeaBroadway() {
        return xdfgetConditionQueryWhiteBaseOne01SeaBroadway();
    }
    public WhiteBaseOne01SeaBroadwayCQ xdfgetConditionQueryWhiteBaseOne01SeaBroadway() {
        String prop = "whiteBaseOne01SeaBroadway";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne01SeaBroadway()); xsetupOuterJoinWhiteBaseOne01SeaBroadway(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne01SeaBroadwayCQ xcreateQueryWhiteBaseOne01SeaBroadway() {
        String nrp = xresolveNRP("WHITE_BASE_ONE01_SEA", "whiteBaseOne01SeaBroadway"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne01SeaBroadwayCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne01SeaBroadway", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne01SeaBroadway() { xregOutJo("whiteBaseOne01SeaBroadway"); }
    public boolean hasConditionQueryWhiteBaseOne01SeaBroadway() { return xhasQueRlMap("whiteBaseOne01SeaBroadway"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne01SeaDocksideCQ queryWhiteBaseOne01SeaDockside() {
        return xdfgetConditionQueryWhiteBaseOne01SeaDockside();
    }
    public WhiteBaseOne01SeaDocksideCQ xdfgetConditionQueryWhiteBaseOne01SeaDockside() {
        String prop = "whiteBaseOne01SeaDockside";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne01SeaDockside()); xsetupOuterJoinWhiteBaseOne01SeaDockside(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne01SeaDocksideCQ xcreateQueryWhiteBaseOne01SeaDockside() {
        String nrp = xresolveNRP("WHITE_BASE_ONE01_SEA", "whiteBaseOne01SeaDockside"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne01SeaDocksideCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne01SeaDockside", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne01SeaDockside() { xregOutJo("whiteBaseOne01SeaDockside"); }
    public boolean hasConditionQueryWhiteBaseOne01SeaDockside() { return xhasQueRlMap("whiteBaseOne01SeaDockside"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne01SeaHangarCQ queryWhiteBaseOne01SeaHangarAsOne() { return xdfgetConditionQueryWhiteBaseOne01SeaHangarAsOne(); }
    public WhiteBaseOne01SeaHangarCQ xdfgetConditionQueryWhiteBaseOne01SeaHangarAsOne() {
        String prop = "whiteBaseOne01SeaHangarAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne01SeaHangarAsOne()); xsetupOuterJoinWhiteBaseOne01SeaHangarAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne01SeaHangarCQ xcreateQueryWhiteBaseOne01SeaHangarAsOne() {
        String nrp = xresolveNRP("WHITE_BASE_ONE01_SEA", "whiteBaseOne01SeaHangarAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne01SeaHangarCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne01SeaHangarAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne01SeaHangarAsOne() { xregOutJo("whiteBaseOne01SeaHangarAsOne"); }
    public boolean hasConditionQueryWhiteBaseOne01SeaHangarAsOne() { return xhasQueRlMap("whiteBaseOne01SeaHangarAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseOne01SeaCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne01SeaCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne01SeaCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne01SeaCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne01SeaCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
