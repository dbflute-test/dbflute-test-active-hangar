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
 * The base condition-query of WHITE_BASE_ONE05_DSTORE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne05DstoreCQ extends AbstractBsWhiteBaseOne05DstoreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne05DstoreCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne05DstoreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE05_DSTORE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne05DstoreCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne05DstoreCIQ xcreateCIQ() {
        WhiteBaseOne05DstoreCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne05DstoreCIQ xnewCIQ() {
        return new WhiteBaseOne05DstoreCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE05_DSTORE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne05DstoreCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne05DstoreCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _dstoreId;
    public ConditionValue xdfgetDstoreId()
    { if (_dstoreId == null) { _dstoreId = nCV(); }
      return _dstoreId; }
    protected ConditionValue xgetCValueDstoreId() { return xdfgetDstoreId(); }

    public Map<String, WhiteBaseCQ> xdfgetDstoreId_ExistsReferrer_WhiteBaseList() { return xgetSQueMap("dstoreId_ExistsReferrer_WhiteBaseList"); }
    public String keepDstoreId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("dstoreId_ExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetDstoreId_NotExistsReferrer_WhiteBaseList() { return xgetSQueMap("dstoreId_NotExistsReferrer_WhiteBaseList"); }
    public String keepDstoreId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("dstoreId_NotExistsReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetDstoreId_SpecifyDerivedReferrer_WhiteBaseList() { return xgetSQueMap("dstoreId_SpecifyDerivedReferrer_WhiteBaseList"); }
    public String keepDstoreId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("dstoreId_SpecifyDerivedReferrer_WhiteBaseList", sq); }

    public Map<String, WhiteBaseCQ> xdfgetDstoreId_QueryDerivedReferrer_WhiteBaseList() { return xgetSQueMap("dstoreId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepDstoreId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq) { return xkeepSQue("dstoreId_QueryDerivedReferrer_WhiteBaseList", sq); }
    public Map<String, Object> xdfgetDstoreId_QueryDerivedReferrer_WhiteBaseListParameter() { return xgetSQuePmMap("dstoreId_QueryDerivedReferrer_WhiteBaseList"); }
    public String keepDstoreId_QueryDerivedReferrer_WhiteBaseListParameter(Object pm) { return xkeepSQuePm("dstoreId_QueryDerivedReferrer_WhiteBaseList", pm); }

    /**
     * Add order-by as ascend. <br>
     * DSTORE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne05DstoreCQ addOrderBy_DstoreId_Asc() { regOBA("DSTORE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSTORE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne05DstoreCQ addOrderBy_DstoreId_Desc() { regOBD("DSTORE_ID"); return this; }

    protected ConditionValue _dstoreName;
    public ConditionValue xdfgetDstoreName()
    { if (_dstoreName == null) { _dstoreName = nCV(); }
      return _dstoreName; }
    protected ConditionValue xgetCValueDstoreName() { return xdfgetDstoreName(); }

    /**
     * Add order-by as ascend. <br>
     * DSTORE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne05DstoreCQ addOrderBy_DstoreName_Asc() { regOBA("DSTORE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSTORE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne05DstoreCQ addOrderBy_DstoreName_Desc() { regOBD("DSTORE_NAME"); return this; }

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
    public BsWhiteBaseOne05DstoreCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne05DstoreCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteBaseOne05DstoreCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne05DstoreCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne05DstoreCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne05DstoreCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne05DstoreCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne05DstoreCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne05DstoreCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne05DstoreCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne05DstoreCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne05DstoreCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne05DstoreCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne05DstoreCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne05DstoreCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
