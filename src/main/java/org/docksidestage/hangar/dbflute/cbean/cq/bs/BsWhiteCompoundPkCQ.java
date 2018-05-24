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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
