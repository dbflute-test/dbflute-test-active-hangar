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
 * The base condition-query of WHITE_LOADING_DATE_ADJUSTMENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteLoadingDateAdjustmentCQ extends AbstractBsWhiteLoadingDateAdjustmentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteLoadingDateAdjustmentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteLoadingDateAdjustmentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_LOADING_DATE_ADJUSTMENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteLoadingDateAdjustmentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteLoadingDateAdjustmentCIQ xcreateCIQ() {
        WhiteLoadingDateAdjustmentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteLoadingDateAdjustmentCIQ xnewCIQ() {
        return new WhiteLoadingDateAdjustmentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_LOADING_DATE_ADJUSTMENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteLoadingDateAdjustmentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteLoadingDateAdjustmentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dateAdjustmentId;
    public ConditionValue xdfgetDateAdjustmentId()
    { if (_dateAdjustmentId == null) { _dateAdjustmentId = nCV(); }
      return _dateAdjustmentId; }
    protected ConditionValue xgetCValueDateAdjustmentId() { return xdfgetDateAdjustmentId(); }

    /**
     * Add order-by as ascend. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_DateAdjustmentId_Asc() { regOBA("DATE_ADJUSTMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_DateAdjustmentId_Desc() { regOBD("DATE_ADJUSTMENT_ID"); return this; }

    protected ConditionValue _adjustedDate;
    public ConditionValue xdfgetAdjustedDate()
    { if (_adjustedDate == null) { _adjustedDate = nCV(); }
      return _adjustedDate; }
    protected ConditionValue xgetCValueAdjustedDate() { return xdfgetAdjustedDate(); }

    /**
     * Add order-by as ascend. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedDate_Asc() { regOBA("ADJUSTED_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedDate_Desc() { regOBD("ADJUSTED_DATE"); return this; }

    protected ConditionValue _adjustedDatetime;
    public ConditionValue xdfgetAdjustedDatetime()
    { if (_adjustedDatetime == null) { _adjustedDatetime = nCV(); }
      return _adjustedDatetime; }
    protected ConditionValue xgetCValueAdjustedDatetime() { return xdfgetAdjustedDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedDatetime_Asc() { regOBA("ADJUSTED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedDatetime_Desc() { regOBD("ADJUSTED_DATETIME"); return this; }

    protected ConditionValue _adjustedTime;
    public ConditionValue xdfgetAdjustedTime()
    { if (_adjustedTime == null) { _adjustedTime = nCV(); }
      return _adjustedTime; }
    protected ConditionValue xgetCValueAdjustedTime() { return xdfgetAdjustedTime(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedTime_Asc() { regOBA("ADJUSTED_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedTime_Desc() { regOBD("ADJUSTED_TIME"); return this; }

    protected ConditionValue _adjustedInteger;
    public ConditionValue xdfgetAdjustedInteger()
    { if (_adjustedInteger == null) { _adjustedInteger = nCV(); }
      return _adjustedInteger; }
    protected ConditionValue xgetCValueAdjustedInteger() { return xdfgetAdjustedInteger(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedInteger_Asc() { regOBA("ADJUSTED_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedInteger_Desc() { regOBD("ADJUSTED_INTEGER"); return this; }

    protected ConditionValue _adjustedPlainLong;
    public ConditionValue xdfgetAdjustedPlainLong()
    { if (_adjustedPlainLong == null) { _adjustedPlainLong = nCV(); }
      return _adjustedPlainLong; }
    protected ConditionValue xgetCValueAdjustedPlainLong() { return xdfgetAdjustedPlainLong(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedPlainLong_Asc() { regOBA("ADJUSTED_PLAIN_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedPlainLong_Desc() { regOBD("ADJUSTED_PLAIN_LONG"); return this; }

    protected ConditionValue _adjustedStringLong;
    public ConditionValue xdfgetAdjustedStringLong()
    { if (_adjustedStringLong == null) { _adjustedStringLong = nCV(); }
      return _adjustedStringLong; }
    protected ConditionValue xgetCValueAdjustedStringLong() { return xdfgetAdjustedStringLong(); }

    /**
     * Add order-by as ascend. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedStringLong_Asc() { regOBA("ADJUSTED_STRING_LONG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_AdjustedStringLong_Desc() { regOBD("ADJUSTED_STRING_LONG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteLoadingDateAdjustmentCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsWhiteLoadingDateAdjustmentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteLoadingDateAdjustmentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteLoadingDateAdjustmentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteLoadingDateAdjustmentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteLoadingDateAdjustmentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteLoadingDateAdjustmentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteLoadingDateAdjustmentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteLoadingDateAdjustmentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteLoadingDateAdjustmentCQ> _myselfExistsMap;
    public Map<String, WhiteLoadingDateAdjustmentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteLoadingDateAdjustmentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteLoadingDateAdjustmentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteLoadingDateAdjustmentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteLoadingDateAdjustmentCB.class.getName(); }
    protected String xCQ() { return WhiteLoadingDateAdjustmentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
