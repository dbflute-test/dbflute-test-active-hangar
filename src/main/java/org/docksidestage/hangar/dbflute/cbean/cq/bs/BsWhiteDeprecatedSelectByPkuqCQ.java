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
 * The base condition-query of WHITE_DEPRECATED_SELECT_BY_PKUQ.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDeprecatedSelectByPkuqCQ extends AbstractBsWhiteDeprecatedSelectByPkuqCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDeprecatedSelectByPkuqCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedSelectByPkuqCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_DEPRECATED_SELECT_BY_PKUQ) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDeprecatedSelectByPkuqCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDeprecatedSelectByPkuqCIQ xcreateCIQ() {
        WhiteDeprecatedSelectByPkuqCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDeprecatedSelectByPkuqCIQ xnewCIQ() {
        return new WhiteDeprecatedSelectByPkuqCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_DEPRECATED_SELECT_BY_PKUQ on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDeprecatedSelectByPkuqCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDeprecatedSelectByPkuqCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _selectByPkuqId;
    public ConditionValue xdfgetSelectByPkuqId()
    { if (_selectByPkuqId == null) { _selectByPkuqId = nCV(); }
      return _selectByPkuqId; }
    protected ConditionValue xgetCValueSelectByPkuqId() { return xdfgetSelectByPkuqId(); }

    /**
     * Add order-by as ascend. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSelectByPkuqCQ addOrderBy_SelectByPkuqId_Asc() { regOBA("SELECT_BY_PKUQ_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSelectByPkuqCQ addOrderBy_SelectByPkuqId_Desc() { regOBD("SELECT_BY_PKUQ_ID"); return this; }

    protected ConditionValue _selectByPkuqName;
    public ConditionValue xdfgetSelectByPkuqName()
    { if (_selectByPkuqName == null) { _selectByPkuqName = nCV(); }
      return _selectByPkuqName; }
    protected ConditionValue xgetCValueSelectByPkuqName() { return xdfgetSelectByPkuqName(); }

    /**
     * Add order-by as ascend. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSelectByPkuqCQ addOrderBy_SelectByPkuqName_Asc() { regOBA("SELECT_BY_PKUQ_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSelectByPkuqCQ addOrderBy_SelectByPkuqName_Desc() { regOBD("SELECT_BY_PKUQ_NAME"); return this; }

    protected ConditionValue _selectByPkuqCode;
    public ConditionValue xdfgetSelectByPkuqCode()
    { if (_selectByPkuqCode == null) { _selectByPkuqCode = nCV(); }
      return _selectByPkuqCode; }
    protected ConditionValue xgetCValueSelectByPkuqCode() { return xdfgetSelectByPkuqCode(); }

    /**
     * Add order-by as ascend. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSelectByPkuqCQ addOrderBy_SelectByPkuqCode_Asc() { regOBA("SELECT_BY_PKUQ_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSelectByPkuqCQ addOrderBy_SelectByPkuqCode_Desc() { regOBD("SELECT_BY_PKUQ_CODE"); return this; }

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
    public BsWhiteDeprecatedSelectByPkuqCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDeprecatedSelectByPkuqCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDeprecatedSelectByPkuqCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDeprecatedSelectByPkuqCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDeprecatedSelectByPkuqCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDeprecatedSelectByPkuqCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDeprecatedSelectByPkuqCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDeprecatedSelectByPkuqCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDeprecatedSelectByPkuqCQ> _myselfExistsMap;
    public Map<String, WhiteDeprecatedSelectByPkuqCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDeprecatedSelectByPkuqCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDeprecatedSelectByPkuqCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDeprecatedSelectByPkuqCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDeprecatedSelectByPkuqCB.class.getName(); }
    protected String xCQ() { return WhiteDeprecatedSelectByPkuqCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
