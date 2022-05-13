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
 * The base condition-query of WHITE_BASE_ONE01_SEA_MAGICLAMP.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaMagiclampCQ extends AbstractBsWhiteBaseOne01SeaMagiclampCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne01SeaMagiclampCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaMagiclampCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE_ONE01_SEA_MAGICLAMP) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseOne01SeaMagiclampCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseOne01SeaMagiclampCIQ xcreateCIQ() {
        WhiteBaseOne01SeaMagiclampCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseOne01SeaMagiclampCIQ xnewCIQ() {
        return new WhiteBaseOne01SeaMagiclampCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE_ONE01_SEA_MAGICLAMP on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseOne01SeaMagiclampCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseOne01SeaMagiclampCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _magiclampId;
    public ConditionValue xdfgetMagiclampId()
    { if (_magiclampId == null) { _magiclampId = nCV(); }
      return _magiclampId; }
    protected ConditionValue xgetCValueMagiclampId() { return xdfgetMagiclampId(); }

    /**
     * Add order-by as ascend. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaMagiclampCQ addOrderBy_MagiclampId_Asc() { regOBA("MAGICLAMP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaMagiclampCQ addOrderBy_MagiclampId_Desc() { regOBD("MAGICLAMP_ID"); return this; }

    protected ConditionValue _magiclampName;
    public ConditionValue xdfgetMagiclampName()
    { if (_magiclampName == null) { _magiclampName = nCV(); }
      return _magiclampName; }
    protected ConditionValue xgetCValueMagiclampName() { return xdfgetMagiclampName(); }

    /**
     * Add order-by as ascend. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaMagiclampCQ addOrderBy_MagiclampName_Asc() { regOBA("MAGICLAMP_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaMagiclampCQ addOrderBy_MagiclampName_Desc() { regOBD("MAGICLAMP_NAME"); return this; }

    protected ConditionValue _seaId;
    public ConditionValue xdfgetSeaId()
    { if (_seaId == null) { _seaId = nCV(); }
      return _seaId; }
    protected ConditionValue xgetCValueSeaId() { return xdfgetSeaId(); }

    /**
     * Add order-by as ascend. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaMagiclampCQ addOrderBy_SeaId_Asc() { regOBA("SEA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseOne01SeaMagiclampCQ addOrderBy_SeaId_Desc() { regOBD("SEA_ID"); return this; }

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
    public BsWhiteBaseOne01SeaMagiclampCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseOne01SeaMagiclampCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseOne01SeaMagiclampCQ bq = (WhiteBaseOne01SeaMagiclampCQ)bqs;
        WhiteBaseOne01SeaMagiclampCQ uq = (WhiteBaseOne01SeaMagiclampCQ)uqs;
        if (bq.hasConditionQueryWhiteBaseOne01Sea()) {
            uq.queryWhiteBaseOne01Sea().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne01Sea(), uq.queryWhiteBaseOne01Sea());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne01SeaCQ queryWhiteBaseOne01Sea() {
        return xdfgetConditionQueryWhiteBaseOne01Sea();
    }
    public WhiteBaseOne01SeaCQ xdfgetConditionQueryWhiteBaseOne01Sea() {
        String prop = "whiteBaseOne01Sea";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne01Sea()); xsetupOuterJoinWhiteBaseOne01Sea(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne01SeaCQ xcreateQueryWhiteBaseOne01Sea() {
        String nrp = xresolveNRP("WHITE_BASE_ONE01_SEA_MAGICLAMP", "whiteBaseOne01Sea"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne01SeaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne01Sea", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne01Sea() { xregOutJo("whiteBaseOne01Sea"); }
    public boolean hasConditionQueryWhiteBaseOne01Sea() { return xhasQueRlMap("whiteBaseOne01Sea"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseOne01SeaMagiclampCQ> _myselfExistsMap;
    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseOne01SeaMagiclampCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseOne01SeaMagiclampCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseOne01SeaMagiclampCB.class.getName(); }
    protected String xCQ() { return WhiteBaseOne01SeaMagiclampCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
