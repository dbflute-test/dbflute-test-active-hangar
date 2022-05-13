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
 * The base condition-query of WHITE_ON_PARADE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnParadeCQ extends AbstractBsWhiteOnParadeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteOnParadeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnParadeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_ON_PARADE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteOnParadeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteOnParadeCIQ xcreateCIQ() {
        WhiteOnParadeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteOnParadeCIQ xnewCIQ() {
        return new WhiteOnParadeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_ON_PARADE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteOnParadeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteOnParadeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _onParadeId;
    public ConditionValue xdfgetOnParadeId()
    { if (_onParadeId == null) { _onParadeId = nCV(); }
      return _onParadeId; }
    protected ConditionValue xgetCValueOnParadeId() { return xdfgetOnParadeId(); }

    public Map<String, WhiteOnParadeRefCQ> xdfgetOnParadeId_ExistsReferrer_WhiteOnParadeRefList() { return xgetSQueMap("onParadeId_ExistsReferrer_WhiteOnParadeRefList"); }
    public String keepOnParadeId_ExistsReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq) { return xkeepSQue("onParadeId_ExistsReferrer_WhiteOnParadeRefList", sq); }

    public Map<String, WhiteOnParadeRefCQ> xdfgetOnParadeId_NotExistsReferrer_WhiteOnParadeRefList() { return xgetSQueMap("onParadeId_NotExistsReferrer_WhiteOnParadeRefList"); }
    public String keepOnParadeId_NotExistsReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq) { return xkeepSQue("onParadeId_NotExistsReferrer_WhiteOnParadeRefList", sq); }

    public Map<String, WhiteOnParadeRefCQ> xdfgetOnParadeId_SpecifyDerivedReferrer_WhiteOnParadeRefList() { return xgetSQueMap("onParadeId_SpecifyDerivedReferrer_WhiteOnParadeRefList"); }
    public String keepOnParadeId_SpecifyDerivedReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq) { return xkeepSQue("onParadeId_SpecifyDerivedReferrer_WhiteOnParadeRefList", sq); }

    public Map<String, WhiteOnParadeRefCQ> xdfgetOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefList() { return xgetSQueMap("onParadeId_QueryDerivedReferrer_WhiteOnParadeRefList"); }
    public String keepOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq) { return xkeepSQue("onParadeId_QueryDerivedReferrer_WhiteOnParadeRefList", sq); }
    public Map<String, Object> xdfgetOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefListParameter() { return xgetSQuePmMap("onParadeId_QueryDerivedReferrer_WhiteOnParadeRefList"); }
    public String keepOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefListParameter(Object pm) { return xkeepSQuePm("onParadeId_QueryDerivedReferrer_WhiteOnParadeRefList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeCQ addOrderBy_OnParadeId_Asc() { regOBA("ON_PARADE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeCQ addOrderBy_OnParadeId_Desc() { regOBD("ON_PARADE_ID"); return this; }

    protected ConditionValue _onParadeName;
    public ConditionValue xdfgetOnParadeName()
    { if (_onParadeName == null) { _onParadeName = nCV(); }
      return _onParadeName; }
    protected ConditionValue xgetCValueOnParadeName() { return xdfgetOnParadeName(); }

    /**
     * Add order-by as ascend. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeCQ addOrderBy_OnParadeName_Asc() { regOBA("ON_PARADE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeCQ addOrderBy_OnParadeName_Desc() { regOBD("ON_PARADE_NAME"); return this; }

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
    public BsWhiteOnParadeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteOnParadeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteOnParadeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteOnParadeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteOnParadeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteOnParadeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteOnParadeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteOnParadeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteOnParadeCQ> _myselfExistsMap;
    public Map<String, WhiteOnParadeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteOnParadeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteOnParadeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteOnParadeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteOnParadeCB.class.getName(); }
    protected String xCQ() { return WhiteOnParadeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
