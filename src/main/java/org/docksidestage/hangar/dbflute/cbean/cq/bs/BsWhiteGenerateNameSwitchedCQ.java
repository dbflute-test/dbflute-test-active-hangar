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
 * The base condition-query of WHITE_GENERATE_NAME_SWITCHED.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteGenerateNameSwitchedCQ extends AbstractBsWhiteGenerateNameSwitchedCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteGenerateNameSwitchedCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteGenerateNameSwitchedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_GENERATE_NAME_SWITCHED) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteGenerateNameSwitchedCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteGenerateNameSwitchedCIQ xcreateCIQ() {
        WhiteGenerateNameSwitchedCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteGenerateNameSwitchedCIQ xnewCIQ() {
        return new WhiteGenerateNameSwitchedCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_GENERATE_NAME_SWITCHED on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteGenerateNameSwitchedCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteGenerateNameSwitchedCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _generateNameSwitchedId;
    public ConditionValue xdfgetGenerateNameSwitchedId()
    { if (_generateNameSwitchedId == null) { _generateNameSwitchedId = nCV(); }
      return _generateNameSwitchedId; }
    protected ConditionValue xgetCValueGenerateNameSwitchedId() { return xdfgetGenerateNameSwitchedId(); }

    /**
     * Add order-by as ascend. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedId_Asc() { regOBA("GENERATE_NAME_SWITCHED_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedId_Desc() { regOBD("GENERATE_NAME_SWITCHED_ID"); return this; }

    protected ConditionValue _generateNameSwitchedName;
    public ConditionValue xdfgetGenerateNameSwitchedName()
    { if (_generateNameSwitchedName == null) { _generateNameSwitchedName = nCV(); }
      return _generateNameSwitchedName; }
    protected ConditionValue xgetCValueGenerateNameSwitchedName() { return xdfgetGenerateNameSwitchedName(); }

    /**
     * Add order-by as ascend. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedName_Asc() { regOBA("GENERATE_NAME_SWITCHED_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedName_Desc() { regOBD("GENERATE_NAME_SWITCHED_NAME"); return this; }

    protected ConditionValue _generateNameSwitchedCount;
    public ConditionValue xdfgetGenerateNameSwitchedCount()
    { if (_generateNameSwitchedCount == null) { _generateNameSwitchedCount = nCV(); }
      return _generateNameSwitchedCount; }
    protected ConditionValue xgetCValueGenerateNameSwitchedCount() { return xdfgetGenerateNameSwitchedCount(); }

    /**
     * Add order-by as ascend. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedCount_Asc() { regOBA("GENERATE_NAME_SWITCHED_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedCount_Desc() { regOBD("GENERATE_NAME_SWITCHED_COUNT"); return this; }

    protected ConditionValue _generateNameSwitchedDate;
    public ConditionValue xdfgetGenerateNameSwitchedDate()
    { if (_generateNameSwitchedDate == null) { _generateNameSwitchedDate = nCV(); }
      return _generateNameSwitchedDate; }
    protected ConditionValue xgetCValueGenerateNameSwitchedDate() { return xdfgetGenerateNameSwitchedDate(); }

    /**
     * Add order-by as ascend. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedDate_Asc() { regOBA("GENERATE_NAME_SWITCHED_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedDate_Desc() { regOBD("GENERATE_NAME_SWITCHED_DATE"); return this; }

    protected ConditionValue _generateNameSwitchedDatetime;
    public ConditionValue xdfgetGenerateNameSwitchedDatetime()
    { if (_generateNameSwitchedDatetime == null) { _generateNameSwitchedDatetime = nCV(); }
      return _generateNameSwitchedDatetime; }
    protected ConditionValue xgetCValueGenerateNameSwitchedDatetime() { return xdfgetGenerateNameSwitchedDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedDatetime_Asc() { regOBA("GENERATE_NAME_SWITCHED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteGenerateNameSwitchedCQ addOrderBy_GenerateNameSwitchedDatetime_Desc() { regOBD("GENERATE_NAME_SWITCHED_DATETIME"); return this; }

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
    public BsWhiteGenerateNameSwitchedCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteGenerateNameSwitchedCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteGenerateNameSwitchedCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteGenerateNameSwitchedCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteGenerateNameSwitchedCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteGenerateNameSwitchedCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteGenerateNameSwitchedCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteGenerateNameSwitchedCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteGenerateNameSwitchedCQ> _myselfExistsMap;
    public Map<String, WhiteGenerateNameSwitchedCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteGenerateNameSwitchedCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteGenerateNameSwitchedCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteGenerateNameSwitchedCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteGenerateNameSwitchedCB.class.getName(); }
    protected String xCQ() { return WhiteGenerateNameSwitchedCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
