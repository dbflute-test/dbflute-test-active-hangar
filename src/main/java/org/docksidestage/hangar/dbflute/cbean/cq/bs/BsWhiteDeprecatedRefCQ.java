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
 * The base condition-query of WHITE_DEPRECATED_REF.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDeprecatedRefCQ extends AbstractBsWhiteDeprecatedRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDeprecatedRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_DEPRECATED_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDeprecatedRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDeprecatedRefCIQ xcreateCIQ() {
        WhiteDeprecatedRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDeprecatedRefCIQ xnewCIQ() {
        return new WhiteDeprecatedRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_DEPRECATED_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDeprecatedRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDeprecatedRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _deprecatedRefId;
    public ConditionValue xdfgetDeprecatedRefId()
    { if (_deprecatedRefId == null) { _deprecatedRefId = nCV(); }
      return _deprecatedRefId; }
    protected ConditionValue xgetCValueDeprecatedRefId() { return xdfgetDeprecatedRefId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedRefId_Asc() { regOBA("DEPRECATED_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedRefId_Desc() { regOBD("DEPRECATED_REF_ID"); return this; }

    protected ConditionValue _deprecatedId;
    public ConditionValue xdfgetDeprecatedId()
    { if (_deprecatedId == null) { _deprecatedId = nCV(); }
      return _deprecatedId; }
    protected ConditionValue xgetCValueDeprecatedId() { return xdfgetDeprecatedId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedId_Asc() { regOBA("DEPRECATED_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedId_Desc() { regOBD("DEPRECATED_ID"); return this; }

    protected ConditionValue _deprecatedRefName;
    public ConditionValue xdfgetDeprecatedRefName()
    { if (_deprecatedRefName == null) { _deprecatedRefName = nCV(); }
      return _deprecatedRefName; }
    protected ConditionValue xgetCValueDeprecatedRefName() { return xdfgetDeprecatedRefName(); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedRefName_Asc() { regOBA("DEPRECATED_REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedRefName_Desc() { regOBD("DEPRECATED_REF_NAME"); return this; }

    protected ConditionValue _deprecatedRefCode;
    public ConditionValue xdfgetDeprecatedRefCode()
    { if (_deprecatedRefCode == null) { _deprecatedRefCode = nCV(); }
      return _deprecatedRefCode; }
    protected ConditionValue xgetCValueDeprecatedRefCode() { return xdfgetDeprecatedRefCode(); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedRefCode_Asc() { regOBA("DEPRECATED_REF_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_DeprecatedRefCode_Desc() { regOBD("DEPRECATED_REF_CODE"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedRefCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsWhiteDeprecatedRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDeprecatedRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteDeprecatedRefCQ bq = (WhiteDeprecatedRefCQ)bqs;
        WhiteDeprecatedRefCQ uq = (WhiteDeprecatedRefCQ)uqs;
        if (bq.hasConditionQueryWhiteDeprecated()) {
            uq.queryWhiteDeprecated().reflectRelationOnUnionQuery(bq.queryWhiteDeprecated(), uq.queryWhiteDeprecated());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (非推奨テスト)WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteDeprecatedCQ queryWhiteDeprecated() {
        return xdfgetConditionQueryWhiteDeprecated();
    }
    public WhiteDeprecatedCQ xdfgetConditionQueryWhiteDeprecated() {
        String prop = "whiteDeprecated";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteDeprecated()); xsetupOuterJoinWhiteDeprecated(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteDeprecatedCQ xcreateQueryWhiteDeprecated() {
        String nrp = xresolveNRP("WHITE_DEPRECATED_REF", "whiteDeprecated"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteDeprecatedCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteDeprecated", nrp);
    }
    protected void xsetupOuterJoinWhiteDeprecated() { xregOutJo("whiteDeprecated"); }
    public boolean hasConditionQueryWhiteDeprecated() { return xhasQueRlMap("whiteDeprecated"); }

    /**
     * Get the condition-query for relation table. <br>
     * (眠い商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductCQ queryProduct() {
        return xdfgetConditionQueryProduct();
    }
    public ProductCQ xdfgetConditionQueryProduct() {
        String prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected ProductCQ xcreateQueryProduct() {
        String nrp = xresolveNRP("WHITE_DEPRECATED_REF", "product"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected void xsetupOuterJoinProduct() { xregOutJo("product"); }
    public boolean hasConditionQueryProduct() { return xhasQueRlMap("product"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteDeprecatedRefCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDeprecatedRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDeprecatedRefCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDeprecatedRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDeprecatedRefCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDeprecatedRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDeprecatedRefCQ> _myselfExistsMap;
    public Map<String, WhiteDeprecatedRefCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDeprecatedRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDeprecatedRefCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDeprecatedRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDeprecatedRefCB.class.getName(); }
    protected String xCQ() { return WhiteDeprecatedRefCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
