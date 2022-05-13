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
 * The base condition-query of WHITE_BASE_ONE01_SEA_DOCKSIDE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaDocksideCQ extends AbstractBsWhiteBaseOne01SeaDocksideCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne01SeaDocksideCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaDocksideCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE01_SEA_DOCKSIDE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne01SeaDocksideCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne01SeaDocksideCIQ xcreateCIQ() {
        WhiteBaseOne01SeaDocksideCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne01SeaDocksideCIQ xnewCIQ() {
        return new WhiteBaseOne01SeaDocksideCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE01_SEA_DOCKSIDE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne01SeaDocksideCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne01SeaDocksideCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _docksideId;
    public ConditionValue xdfgetDocksideId()
    { if (_docksideId == null) { _docksideId = nCV(); }
      return _docksideId; }
    protected ConditionValue xgetCValueDocksideId() { return xdfgetDocksideId(); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetDocksideId_ExistsReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("docksideId_ExistsReferrer_WhiteBaseOne01SeaList"); }
    public String keepDocksideId_ExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("docksideId_ExistsReferrer_WhiteBaseOne01SeaList", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetDocksideId_NotExistsReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("docksideId_NotExistsReferrer_WhiteBaseOne01SeaList"); }
    public String keepDocksideId_NotExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("docksideId_NotExistsReferrer_WhiteBaseOne01SeaList", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetDocksideId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("docksideId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList"); }
    public String keepDocksideId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("docksideId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList", sq); }

    public Map<String, WhiteBaseOne01SeaCQ> xdfgetDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList() { return xgetSQueMap("docksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList"); }
    public String keepDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq) { return xkeepSQue("docksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList", sq); }
    public Map<String, Object> xdfgetDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter() { return xgetSQuePmMap("docksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList"); }
    public String keepDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(Object pm) { return xkeepSQuePm("docksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList", pm); }

    /**
     * Add order-by as ascend. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaDocksideCQ addOrderBy_DocksideId_Asc() { regOBA("DOCKSIDE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaDocksideCQ addOrderBy_DocksideId_Desc() { regOBD("DOCKSIDE_ID"); return this; }

    protected ConditionValue _docksideName;
    public ConditionValue xdfgetDocksideName()
    { if (_docksideName == null) { _docksideName = nCV(); }
      return _docksideName; }
    protected ConditionValue xgetCValueDocksideName() { return xdfgetDocksideName(); }

    /**
     * Add order-by as ascend. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaDocksideCQ addOrderBy_DocksideName_Asc() { regOBA("DOCKSIDE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaDocksideCQ addOrderBy_DocksideName_Desc() { regOBD("DOCKSIDE_NAME"); return this; }

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
    public BsWhiteBaseOne01SeaDocksideCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne01SeaDocksideCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteBaseOne01SeaDocksideCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne01SeaDocksideCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaDocksideCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaDocksideCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne01SeaDocksideCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaDocksideCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne01SeaDocksideCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne01SeaDocksideCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne01SeaDocksideCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaDocksideCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne01SeaDocksideCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne01SeaDocksideCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne01SeaDocksideCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
