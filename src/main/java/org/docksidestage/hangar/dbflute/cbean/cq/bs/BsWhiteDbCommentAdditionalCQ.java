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
 * The base condition-query of WHITE_DB_COMMENT_ADDITIONAL.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDbCommentAdditionalCQ extends AbstractBsWhiteDbCommentAdditionalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDbCommentAdditionalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDbCommentAdditionalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_DB_COMMENT_ADDITIONAL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDbCommentAdditionalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDbCommentAdditionalCIQ xcreateCIQ() {
        WhiteDbCommentAdditionalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDbCommentAdditionalCIQ xnewCIQ() {
        return new WhiteDbCommentAdditionalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_DB_COMMENT_ADDITIONAL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDbCommentAdditionalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDbCommentAdditionalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dbCommentId;
    public ConditionValue xdfgetDbCommentId()
    { if (_dbCommentId == null) { _dbCommentId = nCV(); }
      return _dbCommentId; }
    protected ConditionValue xgetCValueDbCommentId() { return xdfgetDbCommentId(); }

    /**
     * Add order-by as ascend. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentId_Asc() { regOBA("DB_COMMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentId_Desc() { regOBD("DB_COMMENT_ID"); return this; }

    protected ConditionValue _dbCommentName;
    public ConditionValue xdfgetDbCommentName()
    { if (_dbCommentName == null) { _dbCommentName = nCV(); }
      return _dbCommentName; }
    protected ConditionValue xgetCValueDbCommentName() { return xdfgetDbCommentName(); }

    /**
     * Add order-by as ascend. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentName_Asc() { regOBA("DB_COMMENT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentName_Desc() { regOBD("DB_COMMENT_NAME"); return this; }

    protected ConditionValue _dbCommentCount;
    public ConditionValue xdfgetDbCommentCount()
    { if (_dbCommentCount == null) { _dbCommentCount = nCV(); }
      return _dbCommentCount; }
    protected ConditionValue xgetCValueDbCommentCount() { return xdfgetDbCommentCount(); }

    /**
     * Add order-by as ascend. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentCount_Asc() { regOBA("DB_COMMENT_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentCount_Desc() { regOBD("DB_COMMENT_COUNT"); return this; }

    protected ConditionValue _dbCommentDate;
    public ConditionValue xdfgetDbCommentDate()
    { if (_dbCommentDate == null) { _dbCommentDate = nCV(); }
      return _dbCommentDate; }
    protected ConditionValue xgetCValueDbCommentDate() { return xdfgetDbCommentDate(); }

    /**
     * Add order-by as ascend. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentDate_Asc() { regOBA("DB_COMMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentDate_Desc() { regOBD("DB_COMMENT_DATE"); return this; }

    protected ConditionValue _dbCommentDatetime;
    public ConditionValue xdfgetDbCommentDatetime()
    { if (_dbCommentDatetime == null) { _dbCommentDatetime = nCV(); }
      return _dbCommentDatetime; }
    protected ConditionValue xgetCValueDbCommentDatetime() { return xdfgetDbCommentDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentDatetime_Asc() { regOBA("DB_COMMENT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsWhiteDbCommentAdditionalCQ addOrderBy_DbCommentDatetime_Desc() { regOBD("DB_COMMENT_DATETIME"); return this; }

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
    public BsWhiteDbCommentAdditionalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDbCommentAdditionalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDbCommentAdditionalCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDbCommentAdditionalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDbCommentAdditionalCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDbCommentAdditionalCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDbCommentAdditionalCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDbCommentAdditionalCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDbCommentAdditionalCQ> _myselfExistsMap;
    public Map<String, WhiteDbCommentAdditionalCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDbCommentAdditionalCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDbCommentAdditionalCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDbCommentAdditionalCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDbCommentAdditionalCB.class.getName(); }
    protected String xCQ() { return WhiteDbCommentAdditionalCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
