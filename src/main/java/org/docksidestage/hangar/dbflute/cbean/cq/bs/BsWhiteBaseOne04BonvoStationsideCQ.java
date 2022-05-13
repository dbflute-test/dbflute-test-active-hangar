/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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
 * The base condition-query of WHITE_BASE_ONE04_BONVO_STATIONSIDE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne04BonvoStationsideCQ extends AbstractBsWhiteBaseOne04BonvoStationsideCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne04BonvoStationsideCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne04BonvoStationsideCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE04_BONVO_STATIONSIDE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne04BonvoStationsideCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne04BonvoStationsideCIQ xcreateCIQ() {
        WhiteBaseOne04BonvoStationsideCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne04BonvoStationsideCIQ xnewCIQ() {
        return new WhiteBaseOne04BonvoStationsideCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE04_BONVO_STATIONSIDE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne04BonvoStationsideCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne04BonvoStationsideCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stationsideId;
    public ConditionValue xdfgetStationsideId()
    { if (_stationsideId == null) { _stationsideId = nCV(); }
      return _stationsideId; }
    protected ConditionValue xgetCValueStationsideId() { return xdfgetStationsideId(); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetStationsideId_ExistsReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("stationsideId_ExistsReferrer_WhiteBaseOne04BonvoList"); }
    public String keepStationsideId_ExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("stationsideId_ExistsReferrer_WhiteBaseOne04BonvoList", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetStationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("stationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList"); }
    public String keepStationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("stationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetStationsideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("stationsideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList"); }
    public String keepStationsideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("stationsideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList", sq); }

    public Map<String, WhiteBaseOne04BonvoCQ> xdfgetStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList() { return xgetSQueMap("stationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList"); }
    public String keepStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq) { return xkeepSQue("stationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList", sq); }
    public Map<String, Object> xdfgetStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter() { return xgetSQuePmMap("stationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList"); }
    public String keepStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(Object pm) { return xkeepSQuePm("stationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoStationsideCQ addOrderBy_StationsideId_Asc() { regOBA("STATIONSIDE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoStationsideCQ addOrderBy_StationsideId_Desc() { regOBD("STATIONSIDE_ID"); return this; }

    protected ConditionValue _stationsideName;
    public ConditionValue xdfgetStationsideName()
    { if (_stationsideName == null) { _stationsideName = nCV(); }
      return _stationsideName; }
    protected ConditionValue xgetCValueStationsideName() { return xdfgetStationsideName(); }

    /**
     * Add order-by as ascend. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoStationsideCQ addOrderBy_StationsideName_Asc() { regOBA("STATIONSIDE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne04BonvoStationsideCQ addOrderBy_StationsideName_Desc() { regOBD("STATIONSIDE_NAME"); return this; }

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
    public BsWhiteBaseOne04BonvoStationsideCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne04BonvoStationsideCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteBaseOne04BonvoStationsideCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne04BonvoStationsideCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne04BonvoStationsideCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoStationsideCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne04BonvoStationsideCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne04BonvoStationsideCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne04BonvoStationsideCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne04BonvoStationsideCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne04BonvoStationsideCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne04BonvoStationsideCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne04BonvoStationsideCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne04BonvoStationsideCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne04BonvoStationsideCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
