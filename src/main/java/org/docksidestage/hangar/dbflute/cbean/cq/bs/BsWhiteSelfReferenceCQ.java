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
 * The base condition-query of WHITE_SELF_REFERENCE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReferenceCQ extends AbstractBsWhiteSelfReferenceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSelfReferenceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_SELF_REFERENCE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSelfReferenceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSelfReferenceCIQ xcreateCIQ() {
        WhiteSelfReferenceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSelfReferenceCIQ xnewCIQ() {
        return new WhiteSelfReferenceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_SELF_REFERENCE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSelfReferenceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSelfReferenceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _selfReferenceId;
    public ConditionValue xdfgetSelfReferenceId()
    { if (_selfReferenceId == null) { _selfReferenceId = nCV(); }
      return _selfReferenceId; }
    protected ConditionValue xgetCValueSelfReferenceId() { return xdfgetSelfReferenceId(); }

    public Map<String, WhiteSelfReferenceCQ> xdfgetSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList", sq); }

    public Map<String, WhiteSelfReferenceCQ> xdfgetSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList", sq); }

    public Map<String, WhiteSelfReferenceCQ> xdfgetSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList", sq); }

    public Map<String, WhiteSelfReferenceCQ> xdfgetSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList() { return xgetSQueMap("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq) { return xkeepSQue("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList", sq); }
    public Map<String, Object> xdfgetSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter() { return xgetSQuePmMap("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList"); }
    public String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(Object pm) { return xkeepSQuePm("selfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceId_Asc() { regOBA("SELF_REFERENCE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceId_Desc() { regOBD("SELF_REFERENCE_ID"); return this; }

    protected ConditionValue _selfReferenceName;
    public ConditionValue xdfgetSelfReferenceName()
    { if (_selfReferenceName == null) { _selfReferenceName = nCV(); }
      return _selfReferenceName; }
    protected ConditionValue xgetCValueSelfReferenceName() { return xdfgetSelfReferenceName(); }

    /**
     * Add order-by as ascend. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceName_Asc() { regOBA("SELF_REFERENCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_SelfReferenceName_Desc() { regOBD("SELF_REFERENCE_NAME"); return this; }

    protected ConditionValue _parentId;
    public ConditionValue xdfgetParentId()
    { if (_parentId == null) { _parentId = nCV(); }
      return _parentId; }
    protected ConditionValue xgetCValueParentId() { return xdfgetParentId(); }

    /**
     * Add order-by as ascend. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_ParentId_Asc() { regOBA("PARENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @return this. (NotNull)
     */
    public BsWhiteSelfReferenceCQ addOrderBy_ParentId_Desc() { regOBD("PARENT_ID"); return this; }

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
    public BsWhiteSelfReferenceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSelfReferenceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteSelfReferenceCQ bq = (WhiteSelfReferenceCQ)bqs;
        WhiteSelfReferenceCQ uq = (WhiteSelfReferenceCQ)uqs;
        if (bq.hasConditionQueryWhiteSelfReferenceSelf()) {
            uq.queryWhiteSelfReferenceSelf().reflectRelationOnUnionQuery(bq.queryWhiteSelfReferenceSelf(), uq.queryWhiteSelfReferenceSelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_SELF_REFERENCE by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteSelfReferenceCQ queryWhiteSelfReferenceSelf() {
        return xdfgetConditionQueryWhiteSelfReferenceSelf();
    }
    public WhiteSelfReferenceCQ xdfgetConditionQueryWhiteSelfReferenceSelf() {
        String prop = "whiteSelfReferenceSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteSelfReferenceSelf()); xsetupOuterJoinWhiteSelfReferenceSelf(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteSelfReferenceCQ xcreateQueryWhiteSelfReferenceSelf() {
        String nrp = xresolveNRP("WHITE_SELF_REFERENCE", "whiteSelfReferenceSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteSelfReferenceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteSelfReferenceSelf", nrp);
    }
    protected void xsetupOuterJoinWhiteSelfReferenceSelf() { xregOutJo("whiteSelfReferenceSelf"); }
    public boolean hasConditionQueryWhiteSelfReferenceSelf() { return xhasQueRlMap("whiteSelfReferenceSelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteSelfReferenceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSelfReferenceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSelfReferenceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSelfReferenceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSelfReferenceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSelfReferenceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSelfReferenceCQ> _myselfExistsMap;
    public Map<String, WhiteSelfReferenceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSelfReferenceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSelfReferenceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSelfReferenceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSelfReferenceCB.class.getName(); }
    protected String xCQ() { return WhiteSelfReferenceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
