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
 * The base condition-query of WHITE_DEPRECATED.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDeprecatedCQ extends AbstractBsWhiteDeprecatedCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDeprecatedCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_DEPRECATED) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDeprecatedCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDeprecatedCIQ xcreateCIQ() {
        WhiteDeprecatedCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDeprecatedCIQ xnewCIQ() {
        return new WhiteDeprecatedCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_DEPRECATED on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDeprecatedCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDeprecatedCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _deprecatedId;
    public ConditionValue xdfgetDeprecatedId()
    { if (_deprecatedId == null) { _deprecatedId = nCV(); }
      return _deprecatedId; }
    protected ConditionValue xgetCValueDeprecatedId() { return xdfgetDeprecatedId(); }

    public Map<String, WhiteDeprecatedRefCQ> xdfgetDeprecatedId_ExistsReferrer_WhiteDeprecatedRefList() { return xgetSQueMap("deprecatedId_ExistsReferrer_WhiteDeprecatedRefList"); }
    public String keepDeprecatedId_ExistsReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq) { return xkeepSQue("deprecatedId_ExistsReferrer_WhiteDeprecatedRefList", sq); }

    public Map<String, WhiteDeprecatedRefCQ> xdfgetDeprecatedId_NotExistsReferrer_WhiteDeprecatedRefList() { return xgetSQueMap("deprecatedId_NotExistsReferrer_WhiteDeprecatedRefList"); }
    public String keepDeprecatedId_NotExistsReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq) { return xkeepSQue("deprecatedId_NotExistsReferrer_WhiteDeprecatedRefList", sq); }

    public Map<String, WhiteDeprecatedRefCQ> xdfgetDeprecatedId_SpecifyDerivedReferrer_WhiteDeprecatedRefList() { return xgetSQueMap("deprecatedId_SpecifyDerivedReferrer_WhiteDeprecatedRefList"); }
    public String keepDeprecatedId_SpecifyDerivedReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq) { return xkeepSQue("deprecatedId_SpecifyDerivedReferrer_WhiteDeprecatedRefList", sq); }

    public Map<String, WhiteDeprecatedRefCQ> xdfgetDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList() { return xgetSQueMap("deprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList"); }
    public String keepDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq) { return xkeepSQue("deprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList", sq); }
    public Map<String, Object> xdfgetDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefListParameter() { return xgetSQuePmMap("deprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList"); }
    public String keepDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefListParameter(Object pm) { return xkeepSQuePm("deprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList", pm); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedCQ addOrderBy_DeprecatedId_Asc() { regOBA("DEPRECATED_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedCQ addOrderBy_DeprecatedId_Desc() { regOBD("DEPRECATED_ID"); return this; }

    protected ConditionValue _deprecatedName;
    public ConditionValue xdfgetDeprecatedName()
    { if (_deprecatedName == null) { _deprecatedName = nCV(); }
      return _deprecatedName; }
    protected ConditionValue xgetCValueDeprecatedName() { return xdfgetDeprecatedName(); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedCQ addOrderBy_DeprecatedName_Asc() { regOBA("DEPRECATED_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedCQ addOrderBy_DeprecatedName_Desc() { regOBD("DEPRECATED_NAME"); return this; }

    protected ConditionValue _deprecatedCode;
    public ConditionValue xdfgetDeprecatedCode()
    { if (_deprecatedCode == null) { _deprecatedCode = nCV(); }
      return _deprecatedCode; }
    protected ConditionValue xgetCValueDeprecatedCode() { return xdfgetDeprecatedCode(); }

    /**
     * Add order-by as ascend. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedCQ addOrderBy_DeprecatedCode_Asc() { regOBA("DEPRECATED_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedCQ addOrderBy_DeprecatedCode_Desc() { regOBD("DEPRECATED_CODE"); return this; }

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
    public BsWhiteDeprecatedCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDeprecatedCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDeprecatedCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDeprecatedCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDeprecatedCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDeprecatedCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDeprecatedCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDeprecatedCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDeprecatedCQ> _myselfExistsMap;
    public Map<String, WhiteDeprecatedCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDeprecatedCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDeprecatedCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDeprecatedCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDeprecatedCB.class.getName(); }
    protected String xCQ() { return WhiteDeprecatedCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
