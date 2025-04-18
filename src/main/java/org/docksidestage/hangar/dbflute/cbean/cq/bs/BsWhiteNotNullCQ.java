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
 * The base condition-query of WHITE_NOT_NULL.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteNotNullCQ extends AbstractBsWhiteNotNullCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteNotNullCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteNotNullCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_NOT_NULL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteNotNullCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteNotNullCIQ xcreateCIQ() {
        WhiteNotNullCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteNotNullCIQ xnewCIQ() {
        return new WhiteNotNullCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_NOT_NULL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteNotNullCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteNotNullCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _notNullId;
    public ConditionValue xdfgetNotNullId()
    { if (_notNullId == null) { _notNullId = nCV(); }
      return _notNullId; }
    protected ConditionValue xgetCValueNotNullId() { return xdfgetNotNullId(); }

    /**
     * Add order-by as ascend. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullId_Asc() { regOBA("NOT_NULL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullId_Desc() { regOBD("NOT_NULL_ID"); return this; }

    protected ConditionValue _notNullName;
    public ConditionValue xdfgetNotNullName()
    { if (_notNullName == null) { _notNullName = nCV(); }
      return _notNullName; }
    protected ConditionValue xgetCValueNotNullName() { return xdfgetNotNullName(); }

    /**
     * Add order-by as ascend. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullName_Asc() { regOBA("NOT_NULL_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullName_Desc() { regOBD("NOT_NULL_NAME"); return this; }

    protected ConditionValue _notNullCount;
    public ConditionValue xdfgetNotNullCount()
    { if (_notNullCount == null) { _notNullCount = nCV(); }
      return _notNullCount; }
    protected ConditionValue xgetCValueNotNullCount() { return xdfgetNotNullCount(); }

    /**
     * Add order-by as ascend. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullCount_Asc() { regOBA("NOT_NULL_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullCount_Desc() { regOBD("NOT_NULL_COUNT"); return this; }

    protected ConditionValue _notNullDate;
    public ConditionValue xdfgetNotNullDate()
    { if (_notNullDate == null) { _notNullDate = nCV(); }
      return _notNullDate; }
    protected ConditionValue xgetCValueNotNullDate() { return xdfgetNotNullDate(); }

    /**
     * Add order-by as ascend. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullDate_Asc() { regOBA("NOT_NULL_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullDate_Desc() { regOBD("NOT_NULL_DATE"); return this; }

    protected ConditionValue _notNullDatetime;
    public ConditionValue xdfgetNotNullDatetime()
    { if (_notNullDatetime == null) { _notNullDatetime = nCV(); }
      return _notNullDatetime; }
    protected ConditionValue xgetCValueNotNullDatetime() { return xdfgetNotNullDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullDatetime_Asc() { regOBA("NOT_NULL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteNotNullCQ addOrderBy_NotNullDatetime_Desc() { regOBD("NOT_NULL_DATETIME"); return this; }

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
    public BsWhiteNotNullCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteNotNullCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteNotNullCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteNotNullCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteNotNullCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteNotNullCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteNotNullCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteNotNullCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteNotNullCQ> _myselfExistsMap;
    public Map<String, WhiteNotNullCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteNotNullCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteNotNullCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteNotNullCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteNotNullCB.class.getName(); }
    protected String xCQ() { return WhiteNotNullCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
