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
 * The base condition-query of WHITE_DEFAULT_CONSTRAINT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDefaultConstraintCQ extends AbstractBsWhiteDefaultConstraintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDefaultConstraintCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDefaultConstraintCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_DEFAULT_CONSTRAINT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDefaultConstraintCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDefaultConstraintCIQ xcreateCIQ() {
        WhiteDefaultConstraintCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDefaultConstraintCIQ xnewCIQ() {
        return new WhiteDefaultConstraintCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_DEFAULT_CONSTRAINT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDefaultConstraintCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDefaultConstraintCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _defaultId;
    public ConditionValue xdfgetDefaultId()
    { if (_defaultId == null) { _defaultId = nCV(); }
      return _defaultId; }
    protected ConditionValue xgetCValueDefaultId() { return xdfgetDefaultId(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultId_Asc() { regOBA("DEFAULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultId_Desc() { regOBD("DEFAULT_ID"); return this; }

    protected ConditionValue _defaultName;
    public ConditionValue xdfgetDefaultName()
    { if (_defaultName == null) { _defaultName = nCV(); }
      return _defaultName; }
    protected ConditionValue xgetCValueDefaultName() { return xdfgetDefaultName(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultName_Asc() { regOBA("DEFAULT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultName_Desc() { regOBD("DEFAULT_NAME"); return this; }

    protected ConditionValue _defaultCount;
    public ConditionValue xdfgetDefaultCount()
    { if (_defaultCount == null) { _defaultCount = nCV(); }
      return _defaultCount; }
    protected ConditionValue xgetCValueDefaultCount() { return xdfgetDefaultCount(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultCount_Asc() { regOBA("DEFAULT_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultCount_Desc() { regOBD("DEFAULT_COUNT"); return this; }

    protected ConditionValue _defaultDate;
    public ConditionValue xdfgetDefaultDate()
    { if (_defaultDate == null) { _defaultDate = nCV(); }
      return _defaultDate; }
    protected ConditionValue xgetCValueDefaultDate() { return xdfgetDefaultDate(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultDate_Asc() { regOBA("DEFAULT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultDate_Desc() { regOBD("DEFAULT_DATE"); return this; }

    protected ConditionValue _defaultJudge;
    public ConditionValue xdfgetDefaultJudge()
    { if (_defaultJudge == null) { _defaultJudge = nCV(); }
      return _defaultJudge; }
    protected ConditionValue xgetCValueDefaultJudge() { return xdfgetDefaultJudge(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultJudge_Asc() { regOBA("DEFAULT_JUDGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultJudge_Desc() { regOBD("DEFAULT_JUDGE"); return this; }

    protected ConditionValue _defaultEmptyString;
    public ConditionValue xdfgetDefaultEmptyString()
    { if (_defaultEmptyString == null) { _defaultEmptyString = nCV(); }
      return _defaultEmptyString; }
    protected ConditionValue xgetCValueDefaultEmptyString() { return xdfgetDefaultEmptyString(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultEmptyString_Asc() { regOBA("DEFAULT_EMPTY_STRING"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDefaultConstraintCQ addOrderBy_DefaultEmptyString_Desc() { regOBD("DEFAULT_EMPTY_STRING"); return this; }

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
    public BsWhiteDefaultConstraintCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDefaultConstraintCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDefaultConstraintCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDefaultConstraintCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDefaultConstraintCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDefaultConstraintCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDefaultConstraintCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDefaultConstraintCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDefaultConstraintCQ> _myselfExistsMap;
    public Map<String, WhiteDefaultConstraintCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDefaultConstraintCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDefaultConstraintCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDefaultConstraintCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDefaultConstraintCB.class.getName(); }
    protected String xCQ() { return WhiteDefaultConstraintCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
