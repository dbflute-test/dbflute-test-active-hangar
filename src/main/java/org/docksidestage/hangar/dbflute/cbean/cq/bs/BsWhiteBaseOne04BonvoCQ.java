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
 * The base condition-query of WHITE_BASE_ONE04_BONVO.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne04BonvoCQ extends AbstractBsWhiteBaseOne04BonvoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne04BonvoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne04BonvoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE04_BONVO) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne04BonvoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne04BonvoCIQ xcreateCIQ() {
        WhiteBaseOne04BonvoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne04BonvoCIQ xnewCIQ() {
        return new WhiteBaseOne04BonvoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE04_BONVO on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne04BonvoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne04BonvoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bonvoId;
    public ConditionValue xdfgetBonvoId()
    { if (_bonvoId == null) { _bonvoId = nCV(); }
      return _bonvoId; }
    protected ConditionValue xgetCValueBonvoId() { return xdfgetBonvoId(); }

    public Map<String, WhiteBaseCQ> xdfgetBonvoId_ExistsReferrer_WhiteBaseList() { return xgetSQueMap("bonvoId_ExistsReferrer_WhiteBaseList"); }
    public String keepBonvoId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("bonvoId_ExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetBonvoId_NotExistsReferrer_WhiteBaseList() { return xgetSQueMap("bonvoId_NotExistsReferrer_WhiteBaseList"); }
    public String keepBonvoId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("bonvoId_NotExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetBonvoId_SpecifyDerivedReferrer_WhiteBaseList() { return xgetSQueMap("bonvoId_SpecifyDerivedReferrer_WhiteBaseList"); }
    public String keepBonvoId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("bonvoId_SpecifyDerivedReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetBonvoId_QueryDerivedReferrer_WhiteBaseList() { return xgetSQueMap("bonvoId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepBonvoId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("bonvoId_QueryDerivedReferrer_WhiteBaseList", sq); }
    public Map<String, Object> xdfgetBonvoId_QueryDerivedReferrer_WhiteBaseListParameter() { return xgetSQuePmMap("bonvoId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepBonvoId_QueryDerivedReferrer_WhiteBaseListParameter(Object pm) { return xkeepSQuePm("bonvoId_QueryDerivedReferrer_WhiteBaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_BonvoId_Asc() { regOBA("BONVO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_BonvoId_Desc() { regOBD("BONVO_ID"); return this; }

    protected ConditionValue _bonvoName;
    public ConditionValue xdfgetBonvoName()
    { if (_bonvoName == null) { _bonvoName = nCV(); }
      return _bonvoName; }
    protected ConditionValue xgetCValueBonvoName() { return xdfgetBonvoName(); }

    /**
     * Add order-by as ascend. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_BonvoName_Asc() { regOBA("BONVO_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_BonvoName_Desc() { regOBD("BONVO_NAME"); return this; }

    protected ConditionValue _parksideId;
    public ConditionValue xdfgetParksideId()
    { if (_parksideId == null) { _parksideId = nCV(); }
      return _parksideId; }
    protected ConditionValue xgetCValueParksideId() { return xdfgetParksideId(); }

    /**
     * Add order-by as ascend. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_ParksideId_Asc() { regOBA("PARKSIDE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_ParksideId_Desc() { regOBD("PARKSIDE_ID"); return this; }

    protected ConditionValue _stationsideId;
    public ConditionValue xdfgetStationsideId()
    { if (_stationsideId == null) { _stationsideId = nCV(); }
      return _stationsideId; }
    protected ConditionValue xgetCValueStationsideId() { return xdfgetStationsideId(); }

    /**
     * Add order-by as ascend. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_StationsideId_Asc() { regOBA("STATIONSIDE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoCQ addOrderBy_StationsideId_Desc() { regOBD("STATIONSIDE_ID"); return this; }

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
    public BsWhiteBaseOne04BonvoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne04BonvoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseOne04BonvoCQ bq = (WhiteBaseOne04BonvoCQ)bqs;
        WhiteBaseOne04BonvoCQ uq = (WhiteBaseOne04BonvoCQ)uqs;
        if (bq.hasConditionQueryWhiteBaseOne04BonvoParkside()) {
            uq.queryWhiteBaseOne04BonvoParkside().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne04BonvoParkside(), uq.queryWhiteBaseOne04BonvoParkside());
        }
        if (bq.hasConditionQueryWhiteBaseOne04BonvoStationside()) {
            uq.queryWhiteBaseOne04BonvoStationside().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne04BonvoStationside(), uq.queryWhiteBaseOne04BonvoStationside());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE04_BONVO_PARKSIDE by my PARKSIDE_ID, named 'whiteBaseOne04BonvoParkside'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne04BonvoParksideCQ queryWhiteBaseOne04BonvoParkside() {
        return xdfgetConditionQueryWhiteBaseOne04BonvoParkside();
    }
    public WhiteBaseOne04BonvoParksideCQ xdfgetConditionQueryWhiteBaseOne04BonvoParkside() {
        String prop = "whiteBaseOne04BonvoParkside";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne04BonvoParkside()); xsetupOuterJoinWhiteBaseOne04BonvoParkside(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne04BonvoParksideCQ xcreateQueryWhiteBaseOne04BonvoParkside() {
        String nrp = xresolveNRP("WHITE_BASE_ONE04_BONVO", "whiteBaseOne04BonvoParkside"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne04BonvoParksideCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne04BonvoParkside", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne04BonvoParkside() { xregOutJo("whiteBaseOne04BonvoParkside"); }
    public boolean hasConditionQueryWhiteBaseOne04BonvoParkside() { return xhasQueRlMap("whiteBaseOne04BonvoParkside"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE04_BONVO_STATIONSIDE by my STATIONSIDE_ID, named 'whiteBaseOne04BonvoStationside'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne04BonvoStationsideCQ queryWhiteBaseOne04BonvoStationside() {
        return xdfgetConditionQueryWhiteBaseOne04BonvoStationside();
    }
    public WhiteBaseOne04BonvoStationsideCQ xdfgetConditionQueryWhiteBaseOne04BonvoStationside() {
        String prop = "whiteBaseOne04BonvoStationside";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne04BonvoStationside()); xsetupOuterJoinWhiteBaseOne04BonvoStationside(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne04BonvoStationsideCQ xcreateQueryWhiteBaseOne04BonvoStationside() {
        String nrp = xresolveNRP("WHITE_BASE_ONE04_BONVO", "whiteBaseOne04BonvoStationside"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne04BonvoStationsideCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne04BonvoStationside", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne04BonvoStationside() { xregOutJo("whiteBaseOne04BonvoStationside"); }
    public boolean hasConditionQueryWhiteBaseOne04BonvoStationside() { return xhasQueRlMap("whiteBaseOne04BonvoStationside"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne04BonvoCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne04BonvoCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne04BonvoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
