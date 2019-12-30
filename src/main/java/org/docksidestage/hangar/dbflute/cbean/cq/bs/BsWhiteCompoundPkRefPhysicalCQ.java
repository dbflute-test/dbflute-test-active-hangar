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
 * The base condition-query of WHITE_COMPOUND_PK_REF_PHYSICAL.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefPhysicalCQ extends AbstractBsWhiteCompoundPkRefPhysicalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefPhysicalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefPhysicalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_COMPOUND_PK_REF_PHYSICAL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteCompoundPkRefPhysicalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteCompoundPkRefPhysicalCIQ xcreateCIQ() {
        WhiteCompoundPkRefPhysicalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteCompoundPkRefPhysicalCIQ xnewCIQ() {
        return new WhiteCompoundPkRefPhysicalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_COMPOUND_PK_REF_PHYSICAL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteCompoundPkRefPhysicalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteCompoundPkRefPhysicalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _refFirstId;
    public ConditionValue xdfgetRefFirstId()
    { if (_refFirstId == null) { _refFirstId = nCV(); }
      return _refFirstId; }
    protected ConditionValue xgetCValueRefFirstId() { return xdfgetRefFirstId(); }

    /**
     * Add order-by as ascend. <br>
     * REF_FIRST_ID: {PK, IX+, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_RefFirstId_Asc() { regOBA("REF_FIRST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REF_FIRST_ID: {PK, IX+, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_RefFirstId_Desc() { regOBD("REF_FIRST_ID"); return this; }

    protected ConditionValue _refSecondId;
    public ConditionValue xdfgetRefSecondId()
    { if (_refSecondId == null) { _refSecondId = nCV(); }
      return _refSecondId; }
    protected ConditionValue xgetCValueRefSecondId() { return xdfgetRefSecondId(); }

    /**
     * Add order-by as ascend. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_RefSecondId_Asc() { regOBA("REF_SECOND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_RefSecondId_Desc() { regOBD("REF_SECOND_ID"); return this; }

    protected ConditionValue _refThirdId;
    public ConditionValue xdfgetRefThirdId()
    { if (_refThirdId == null) { _refThirdId = nCV(); }
      return _refThirdId; }
    protected ConditionValue xgetCValueRefThirdId() { return xdfgetRefThirdId(); }

    /**
     * Add order-by as ascend. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_RefThirdId_Asc() { regOBA("REF_THIRD_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_RefThirdId_Desc() { regOBD("REF_THIRD_ID"); return this; }

    protected ConditionValue _compoundRefName;
    public ConditionValue xdfgetCompoundRefName()
    { if (_compoundRefName == null) { _compoundRefName = nCV(); }
      return _compoundRefName; }
    protected ConditionValue xgetCValueCompoundRefName() { return xdfgetCompoundRefName(); }

    /**
     * Add order-by as ascend. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_CompoundRefName_Asc() { regOBA("COMPOUND_REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteCompoundPkRefPhysicalCQ addOrderBy_CompoundRefName_Desc() { regOBD("COMPOUND_REF_NAME"); return this; }

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
    public BsWhiteCompoundPkRefPhysicalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteCompoundPkRefPhysicalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteCompoundPkRefPhysicalCQ bq = (WhiteCompoundPkRefPhysicalCQ)bqs;
        WhiteCompoundPkRefPhysicalCQ uq = (WhiteCompoundPkRefPhysicalCQ)uqs;
        if (bq.hasConditionQueryWhiteCompoundPk()) {
            uq.queryWhiteCompoundPk().reflectRelationOnUnionQuery(bq.queryWhiteCompoundPk(), uq.queryWhiteCompoundPk());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteCompoundPkCQ queryWhiteCompoundPk() {
        return xdfgetConditionQueryWhiteCompoundPk();
    }
    public WhiteCompoundPkCQ xdfgetConditionQueryWhiteCompoundPk() {
        String prop = "whiteCompoundPk";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteCompoundPk()); xsetupOuterJoinWhiteCompoundPk(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteCompoundPkCQ xcreateQueryWhiteCompoundPk() {
        String nrp = xresolveNRP("WHITE_COMPOUND_PK_REF_PHYSICAL", "whiteCompoundPk"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteCompoundPkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteCompoundPk", nrp);
    }
    protected void xsetupOuterJoinWhiteCompoundPk() { xregOutJo("whiteCompoundPk"); }
    public boolean hasConditionQueryWhiteCompoundPk() { return xhasQueRlMap("whiteCompoundPk"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteCompoundPkRefPhysicalCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteCompoundPkRefPhysicalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteCompoundPkRefPhysicalCB.class.getName(); }
    protected String xCQ() { return WhiteCompoundPkRefPhysicalCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
