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
 * The base condition-query of WHITE_ON_PARADE_REF.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnParadeRefCQ extends AbstractBsWhiteOnParadeRefCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteOnParadeRefCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnParadeRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_ON_PARADE_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteOnParadeRefCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteOnParadeRefCIQ xcreateCIQ() {
        WhiteOnParadeRefCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteOnParadeRefCIQ xnewCIQ() {
        return new WhiteOnParadeRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_ON_PARADE_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteOnParadeRefCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteOnParadeRefCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _refId;
    public ConditionValue xdfgetRefId()
    { if (_refId == null) { _refId = nCV(); }
      return _refId; }
    protected ConditionValue xgetCValueRefId() { return xdfgetRefId(); }

    /**
     * Add order-by as ascend. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_RefId_Asc() { regOBA("REF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_RefId_Desc() { regOBD("REF_ID"); return this; }

    protected ConditionValue _refName;
    public ConditionValue xdfgetRefName()
    { if (_refName == null) { _refName = nCV(); }
      return _refName; }
    protected ConditionValue xgetCValueRefName() { return xdfgetRefName(); }

    /**
     * Add order-by as ascend. <br>
     * REF_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_RefName_Asc() { regOBA("REF_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REF_NAME: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_RefName_Desc() { regOBD("REF_NAME"); return this; }

    protected ConditionValue _nullableFkOnParadeId;
    public ConditionValue xdfgetNullableFkOnParadeId()
    { if (_nullableFkOnParadeId == null) { _nullableFkOnParadeId = nCV(); }
      return _nullableFkOnParadeId; }
    protected ConditionValue xgetCValueNullableFkOnParadeId() { return xdfgetNullableFkOnParadeId(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_NullableFkOnParadeId_Asc() { regOBA("NULLABLE_FK_ON_PARADE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_NullableFkOnParadeId_Desc() { regOBD("NULLABLE_FK_ON_PARADE_ID"); return this; }

    protected ConditionValue _nullableFkToManyId;
    public ConditionValue xdfgetNullableFkToManyId()
    { if (_nullableFkToManyId == null) { _nullableFkToManyId = nCV(); }
      return _nullableFkToManyId; }
    protected ConditionValue xgetCValueNullableFkToManyId() { return xdfgetNullableFkToManyId(); }

    /**
     * Add order-by as ascend. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_NullableFkToManyId_Asc() { regOBA("NULLABLE_FK_TO_MANY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @return this. (NotNull)
     */
    public BsWhiteOnParadeRefCQ addOrderBy_NullableFkToManyId_Desc() { regOBD("NULLABLE_FK_TO_MANY_ID"); return this; }

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
    public BsWhiteOnParadeRefCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteOnParadeRefCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteOnParadeRefCQ bq = (WhiteOnParadeRefCQ)bqs;
        WhiteOnParadeRefCQ uq = (WhiteOnParadeRefCQ)uqs;
        if (bq.hasConditionQueryWhiteOnParade()) {
            uq.queryWhiteOnParade().reflectRelationOnUnionQuery(bq.queryWhiteOnParade(), uq.queryWhiteOnParade());
        }
        if (bq.hasConditionQueryWhiteOnParadeNullableToMany()) {
            uq.queryWhiteOnParadeNullableToMany().reflectRelationOnUnionQuery(bq.queryWhiteOnParadeNullableToMany(), uq.queryWhiteOnParadeNullableToMany());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteOnParadeCQ queryWhiteOnParade() {
        return xdfgetConditionQueryWhiteOnParade();
    }
    public WhiteOnParadeCQ xdfgetConditionQueryWhiteOnParade() {
        String prop = "whiteOnParade";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteOnParade()); xsetupOuterJoinWhiteOnParade(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteOnParadeCQ xcreateQueryWhiteOnParade() {
        String nrp = xresolveNRP("WHITE_ON_PARADE_REF", "whiteOnParade"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteOnParadeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteOnParade", nrp);
    }
    protected void xsetupOuterJoinWhiteOnParade() { xregOutJo("whiteOnParade"); }
    public boolean hasConditionQueryWhiteOnParade() { return xhasQueRlMap("whiteOnParade"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteOnParadeNullableToManyCQ queryWhiteOnParadeNullableToMany() {
        return xdfgetConditionQueryWhiteOnParadeNullableToMany();
    }
    public WhiteOnParadeNullableToManyCQ xdfgetConditionQueryWhiteOnParadeNullableToMany() {
        String prop = "whiteOnParadeNullableToMany";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteOnParadeNullableToMany()); xsetupOuterJoinWhiteOnParadeNullableToMany(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteOnParadeNullableToManyCQ xcreateQueryWhiteOnParadeNullableToMany() {
        String nrp = xresolveNRP("WHITE_ON_PARADE_REF", "whiteOnParadeNullableToMany"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteOnParadeNullableToManyCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteOnParadeNullableToMany", nrp);
    }
    protected void xsetupOuterJoinWhiteOnParadeNullableToMany() { xregOutJo("whiteOnParadeNullableToMany"); }
    public boolean hasConditionQueryWhiteOnParadeNullableToMany() { return xhasQueRlMap("whiteOnParadeNullableToMany"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteOnParadeRefCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteOnParadeRefCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteOnParadeRefCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteOnParadeRefCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteOnParadeRefCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteOnParadeRefCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteOnParadeRefCQ> _myselfExistsMap;
    public Map<String, WhiteOnParadeRefCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteOnParadeRefCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteOnParadeRefCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteOnParadeRefCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteOnParadeRefCB.class.getName(); }
    protected String xCQ() { return WhiteOnParadeRefCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
