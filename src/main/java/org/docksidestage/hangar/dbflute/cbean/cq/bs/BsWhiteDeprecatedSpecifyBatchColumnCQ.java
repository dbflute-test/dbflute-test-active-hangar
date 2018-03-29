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
 * The base condition-query of WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDeprecatedSpecifyBatchColumnCQ extends AbstractBsWhiteDeprecatedSpecifyBatchColumnCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteDeprecatedSpecifyBatchColumnCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedSpecifyBatchColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteDeprecatedSpecifyBatchColumnCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteDeprecatedSpecifyBatchColumnCIQ xcreateCIQ() {
        WhiteDeprecatedSpecifyBatchColumnCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteDeprecatedSpecifyBatchColumnCIQ xnewCIQ() {
        return new WhiteDeprecatedSpecifyBatchColumnCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteDeprecatedSpecifyBatchColumnCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteDeprecatedSpecifyBatchColumnCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _specifyBatchColumnId;
    public ConditionValue xdfgetSpecifyBatchColumnId()
    { if (_specifyBatchColumnId == null) { _specifyBatchColumnId = nCV(); }
      return _specifyBatchColumnId; }
    protected ConditionValue xgetCValueSpecifyBatchColumnId() { return xdfgetSpecifyBatchColumnId(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSpecifyBatchColumnCQ addOrderBy_SpecifyBatchColumnId_Asc() { regOBA("SPECIFY_BATCH_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSpecifyBatchColumnCQ addOrderBy_SpecifyBatchColumnId_Desc() { regOBD("SPECIFY_BATCH_COLUMN_ID"); return this; }

    protected ConditionValue _specifyBatchColumnName;
    public ConditionValue xdfgetSpecifyBatchColumnName()
    { if (_specifyBatchColumnName == null) { _specifyBatchColumnName = nCV(); }
      return _specifyBatchColumnName; }
    protected ConditionValue xgetCValueSpecifyBatchColumnName() { return xdfgetSpecifyBatchColumnName(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSpecifyBatchColumnCQ addOrderBy_SpecifyBatchColumnName_Asc() { regOBA("SPECIFY_BATCH_COLUMN_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteDeprecatedSpecifyBatchColumnCQ addOrderBy_SpecifyBatchColumnName_Desc() { regOBD("SPECIFY_BATCH_COLUMN_NAME"); return this; }

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
    public BsWhiteDeprecatedSpecifyBatchColumnCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteDeprecatedSpecifyBatchColumnCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteDeprecatedSpecifyBatchColumnCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteDeprecatedSpecifyBatchColumnCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteDeprecatedSpecifyBatchColumnCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteDeprecatedSpecifyBatchColumnCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteDeprecatedSpecifyBatchColumnCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteDeprecatedSpecifyBatchColumnCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteDeprecatedSpecifyBatchColumnCQ> _myselfExistsMap;
    public Map<String, WhiteDeprecatedSpecifyBatchColumnCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteDeprecatedSpecifyBatchColumnCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteDeprecatedSpecifyBatchColumnCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteDeprecatedSpecifyBatchColumnCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteDeprecatedSpecifyBatchColumnCB.class.getName(); }
    protected String xCQ() { return WhiteDeprecatedSpecifyBatchColumnCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
