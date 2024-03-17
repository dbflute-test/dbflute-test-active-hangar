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
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.hangar.dbflute.cbean.cq.ciq.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_COMPOUND_PK.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkCQ extends AbstractBsWhiteCompoundPkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_COMPOUND_PK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkCIQ xcreateCIQ() {
        WhiteCompoundPkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkCIQ xnewCIQ() {
        return new WhiteCompoundPkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_COMPOUND_PK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pkFirstId;
    public ConditionValue xdfgetPkFirstId()
    { if (_pkFirstId == null) { _pkFirstId = nCV(); }
      return _pkFirstId; }
    protected ConditionValue xgetCValuePkFirstId() { return xdfgetPkFirstId(); }

    /**
     * Add order-by as ascend. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Asc() { regOBA("PK_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkFirstId_Desc() { regOBD("PK_FIRST_ID"); return this; }

    protected ConditionValue _pkSecondId;
    public ConditionValue xdfgetPkSecondId()
    { if (_pkSecondId == null) { _pkSecondId = nCV(); }
      return _pkSecondId; }
    protected ConditionValue xgetCValuePkSecondId() { return xdfgetPkSecondId(); }

    /**
     * Add order-by as ascend. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Asc() { regOBA("PK_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_PkSecondId_Desc() { regOBD("PK_SECOND_ID"); return this; }

    protected ConditionValue _compoundPkName;
    public ConditionValue xdfgetCompoundPkName()
    { if (_compoundPkName == null) { _compoundPkName = nCV(); }
      return _compoundPkName; }
    protected ConditionValue xgetCValueCompoundPkName() { return xdfgetCompoundPkName(); }

    /**
     * Add order-by as ascend. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_CompoundPkName_Asc() { regOBA("COMPOUND_PK_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_CompoundPkName_Desc() { regOBD("COMPOUND_PK_NAME"); return this; }

    protected ConditionValue _referredId;
    public ConditionValue xdfgetReferredId()
    { if (_referredId == null) { _referredId = nCV(); }
      return _referredId; }
    protected ConditionValue xgetCValueReferredId() { return xdfgetReferredId(); }

    /**
     * Add order-by as ascend. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_ReferredId_Asc() { regOBA("REFERRED_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkCQ addOrderBy_ReferredId_Desc() { regOBD("REFERRED_ID"); return this; }

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
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteCompoundPkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteCompoundPkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundPkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                      ExistsReferrer for Compound PK
    //                                                      ==============================
    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br>
     * {exists (select ... from WHITE_COMPOUND_PK_REF_PHYSICAL where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefPhysicalList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefPhysical(SubQuery<WhiteCompoundPkRefPhysicalCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefPhysicalCB>", subQuery);
        WhiteCompoundPkRefPhysicalCB cb = new WhiteCompoundPkRefPhysicalCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefPhysicalList(cb.query());
        registerExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefPhysicalList");
    }
    public Map<String, WhiteCompoundPkRefPhysicalCQ> xdfgetTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefPhysicalList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefPhysicalList"); }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefPhysicalList(WhiteCompoundPkRefPhysicalCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefPhysicalList", sq); }

    /**
     * Set up ExistsReferrer (correlated sub-query by compound key). <br>
     * {exists (select ... from WHITE_COMPOUND_PK_REF_VIRTUAL where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefVirtualList for 'exists'. (NotNull)
     */
    public void existsWhiteCompoundPkRefVirtual(SubQuery<WhiteCompoundPkRefVirtualCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefVirtualCB>", subQuery);
        WhiteCompoundPkRefVirtualCB cb = new WhiteCompoundPkRefVirtualCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefVirtualList(cb.query());
        registerExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefVirtualList");
    }
    public Map<String, WhiteCompoundPkRefVirtualCQ> xdfgetTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefVirtualList() { return xgetSQueMap("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefVirtualList"); }
    public String keepTwoOrMorePk_ExistsReferrer_WhiteCompoundPkRefVirtualList(WhiteCompoundPkRefVirtualCQ sq) { return xkeepSQue("twoOrMorePk_ExistsReferrer_WhiteCompoundPkRefVirtualList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br>
     * {not exists (select ... from WHITE_COMPOUND_PK_REF_PHYSICAL where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefPhysicalList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefPhysical(SubQuery<WhiteCompoundPkRefPhysicalCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefPhysicalCB>", subQuery);
        WhiteCompoundPkRefPhysicalCB cb = new WhiteCompoundPkRefPhysicalCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefPhysicalList(cb.query());
        registerNotExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefPhysicalList");
    }
    public Map<String, WhiteCompoundPkRefPhysicalCQ> xdfgetTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefPhysicalList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefPhysicalList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefPhysicalList(WhiteCompoundPkRefPhysicalCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefPhysicalList", sq); }

    /**
     * Set up NotExistsReferrer (correlated sub-query by compound key). <br>
     * {not exists (select ... from WHITE_COMPOUND_PK_REF_VIRTUAL where ...)}
     * @param subQuery The sub-query of WhiteCompoundPkRefVirtualList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteCompoundPkRefVirtual(SubQuery<WhiteCompoundPkRefVirtualCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteCompoundPkRefVirtualCB>", subQuery);
        WhiteCompoundPkRefVirtualCB cb = new WhiteCompoundPkRefVirtualCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefVirtualList(cb.query());
        registerNotExistsReferrer(cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefVirtualList");
    }
    public Map<String, WhiteCompoundPkRefVirtualCQ> xdfgetTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefVirtualList() { return xgetSQueMap("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefVirtualList"); }
    public String keepTwoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefVirtualList(WhiteCompoundPkRefVirtualCQ sq) { return xkeepSQue("twoOrMorePk_NotExistsReferrer_WhiteCompoundPkRefVirtualList", sq); }

    // ===================================================================================
    //                                            (Specify)DerivedReferrer for Compound PK
    //                                            ========================================
    public void xsderiveWhiteCompoundPkRefPhysicalList(String fn, SubQuery<WhiteCompoundPkRefPhysicalCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefPhysicalCB cb = new WhiteCompoundPkRefPhysicalCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefPhysicalList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefPhysicalList", al, op);
    }
    public Map<String, WhiteCompoundPkRefPhysicalCQ> xdfgetTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefPhysicalList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefPhysicalList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefPhysicalList(WhiteCompoundPkRefPhysicalCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefPhysicalList", sq); }

    public void xsderiveWhiteCompoundPkRefVirtualList(String fn, SubQuery<WhiteCompoundPkRefVirtualCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefVirtualCB cb = new WhiteCompoundPkRefVirtualCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefVirtualList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", pp, "whiteCompoundPkRefVirtualList", al, op);
    }
    public Map<String, WhiteCompoundPkRefVirtualCQ> xdfgetTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefVirtualList() { return xgetSQueMap("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefVirtualList"); }
    public String keepTwoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefVirtualList(WhiteCompoundPkRefVirtualCQ sq) { return xkeepSQue("twoOrMorePk_SpecifyDerivedReferrer_WhiteCompoundPkRefVirtualList", sq); }

    // ===================================================================================
    //                                              (Query)DerivedReferrer for Compound PK
    //                                              ======================================
    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_COMPOUND_PK_REF_PHYSICAL where ...)} <br>
     * WHITE_COMPOUND_PK_REF_PHYSICAL by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefPhysicalAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteCompoundPkRefPhysical()</span>.<span style="color: #CC4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefPhysicalCB&gt;() {
     *     public void query(WhiteCompoundPkRefPhysicalCB subCB) {
     *         subCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefPhysicalCB> derivedWhiteCompoundPkRefPhysical() {
        return xcreateQDRFunctionWhiteCompoundPkRefPhysicalList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefPhysicalCB> xcreateQDRFunctionWhiteCompoundPkRefPhysicalList() {
        return xcQDRFunc(new HpQDRSetupper<WhiteCompoundPkRefPhysicalCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefPhysicalCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefPhysicalList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefPhysicalList(String fn, SubQuery<WhiteCompoundPkRefPhysicalCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefPhysicalCB cb = new WhiteCompoundPkRefPhysicalCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", sqpp, "whiteCompoundPkRefPhysicalList", rd, vl, prpp, op);
    }
    public Map<String, WhiteCompoundPkRefPhysicalCQ> xdfgetTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList() { return xgetSQueMap("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList(WhiteCompoundPkRefPhysicalCQ sq) { return xkeepSQue("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList", sq); }
    public Map<String, Object> xdfgetTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalListParameter() { return xgetSQuePmMap("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalListParameter(Object pm) { return xkeepSQuePm("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefPhysicalList", pm); }

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_COMPOUND_PK_REF_VIRTUAL where ...)} <br>
     * WHITE_COMPOUND_PK_REF_VIRTUAL by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefVirtualAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteCompoundPkRefVirtual()</span>.<span style="color: #CC4747">max</span>(new SubQuery&lt;WhiteCompoundPkRefVirtualCB&gt;() {
     *     public void query(WhiteCompoundPkRefVirtualCB subCB) {
     *         subCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteCompoundPkRefVirtualCB> derivedWhiteCompoundPkRefVirtual() {
        return xcreateQDRFunctionWhiteCompoundPkRefVirtualList();
    }
    protected HpQDRFunction<WhiteCompoundPkRefVirtualCB> xcreateQDRFunctionWhiteCompoundPkRefVirtualList() {
        return xcQDRFunc(new HpQDRSetupper<WhiteCompoundPkRefVirtualCB>() {
            public void setup(String fn, SubQuery<WhiteCompoundPkRefVirtualCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveWhiteCompoundPkRefVirtualList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveWhiteCompoundPkRefVirtualList(String fn, SubQuery<WhiteCompoundPkRefVirtualCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefVirtualCB cb = new WhiteCompoundPkRefVirtualCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList(cb.query()); String prpp = keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PK_FIRST_ID, PK_SECOND_ID", "REF_FIRST_ID, REF_SECOND_ID", sqpp, "whiteCompoundPkRefVirtualList", rd, vl, prpp, op);
    }
    public Map<String, WhiteCompoundPkRefVirtualCQ> xdfgetTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList() { return xgetSQueMap("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList(WhiteCompoundPkRefVirtualCQ sq) { return xkeepSQue("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList", sq); }
    public Map<String, Object> xdfgetTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualListParameter() { return xgetSQuePmMap("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList"); }
    public String keepTwoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualListParameter(Object pm) { return xkeepSQuePm("twoOrMorePk_QueryDerivedReferrer_WhiteCompoundPkRefVirtualList", pm); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
