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
 * The base condition-query of WHITE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteTypeMappingCQ extends AbstractBsWhiteTypeMappingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteTypeMappingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_TYPE_MAPPING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteTypeMappingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteTypeMappingCIQ xcreateCIQ() {
        WhiteTypeMappingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteTypeMappingCIQ xnewCIQ() {
        return new WhiteTypeMappingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_TYPE_MAPPING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteTypeMappingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteTypeMappingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _typeMappingId;
    public ConditionValue xdfgetTypeMappingId()
    { if (_typeMappingId == null) { _typeMappingId = nCV(); }
      return _typeMappingId; }
    protected ConditionValue xgetCValueTypeMappingId() { return xdfgetTypeMappingId(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingId_Asc() { regOBA("TYPE_MAPPING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingId_Desc() { regOBD("TYPE_MAPPING_ID"); return this; }

    protected ConditionValue _typeMappingName;
    public ConditionValue xdfgetTypeMappingName()
    { if (_typeMappingName == null) { _typeMappingName = nCV(); }
      return _typeMappingName; }
    protected ConditionValue xgetCValueTypeMappingName() { return xdfgetTypeMappingName(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingName_Asc() { regOBA("TYPE_MAPPING_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingName_Desc() { regOBD("TYPE_MAPPING_NAME"); return this; }

    protected ConditionValue _typeMappingCount;
    public ConditionValue xdfgetTypeMappingCount()
    { if (_typeMappingCount == null) { _typeMappingCount = nCV(); }
      return _typeMappingCount; }
    protected ConditionValue xgetCValueTypeMappingCount() { return xdfgetTypeMappingCount(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingCount_Asc() { regOBA("TYPE_MAPPING_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingCount_Desc() { regOBD("TYPE_MAPPING_COUNT"); return this; }

    protected ConditionValue _typeMappingDate;
    public ConditionValue xdfgetTypeMappingDate()
    { if (_typeMappingDate == null) { _typeMappingDate = nCV(); }
      return _typeMappingDate; }
    protected ConditionValue xgetCValueTypeMappingDate() { return xdfgetTypeMappingDate(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingDate_Asc() { regOBA("TYPE_MAPPING_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingDate_Desc() { regOBD("TYPE_MAPPING_DATE"); return this; }

    protected ConditionValue _typeMappingDatetime;
    public ConditionValue xdfgetTypeMappingDatetime()
    { if (_typeMappingDatetime == null) { _typeMappingDatetime = nCV(); }
      return _typeMappingDatetime; }
    protected ConditionValue xgetCValueTypeMappingDatetime() { return xdfgetTypeMappingDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingDatetime_Asc() { regOBA("TYPE_MAPPING_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_TypeMappingDatetime_Desc() { regOBD("TYPE_MAPPING_DATETIME"); return this; }

    protected ConditionValue _pointMappingDate;
    public ConditionValue xdfgetPointMappingDate()
    { if (_pointMappingDate == null) { _pointMappingDate = nCV(); }
      return _pointMappingDate; }
    protected ConditionValue xgetCValuePointMappingDate() { return xdfgetPointMappingDate(); }

    /**
     * Add order-by as ascend. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_PointMappingDate_Asc() { regOBA("POINT_MAPPING_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingCQ addOrderBy_PointMappingDate_Desc() { regOBD("POINT_MAPPING_DATE"); return this; }

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
    public BsWhiteTypeMappingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteTypeMappingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteTypeMappingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteTypeMappingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteTypeMappingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteTypeMappingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteTypeMappingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteTypeMappingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteTypeMappingCQ> _myselfExistsMap;
    public Map<String, WhiteTypeMappingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteTypeMappingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteTypeMappingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteTypeMappingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteTypeMappingCB.class.getName(); }
    protected String xCQ() { return WhiteTypeMappingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
