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
 * The base condition-query of WHITE_BASE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseCQ extends AbstractBsWhiteBaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_BASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteBaseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteBaseCIQ xcreateCIQ() {
        WhiteBaseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteBaseCIQ xnewCIQ() {
        return new WhiteBaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_BASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteBaseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteBaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _baseId;
    public ConditionValue xdfgetBaseId()
    { if (_baseId == null) { _baseId = nCV(); }
      return _baseId; }
    protected ConditionValue xgetCValueBaseId() { return xdfgetBaseId(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_BaseId_Asc() { regOBA("BASE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_BaseId_Desc() { regOBD("BASE_ID"); return this; }

    protected ConditionValue _baseName;
    public ConditionValue xdfgetBaseName()
    { if (_baseName == null) { _baseName = nCV(); }
      return _baseName; }
    protected ConditionValue xgetCValueBaseName() { return xdfgetBaseName(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_BaseName_Asc() { regOBA("BASE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_BaseName_Desc() { regOBD("BASE_NAME"); return this; }

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
    public BsWhiteBaseCQ addOrderBy_SeaId_Asc() { regOBA("SEA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_SeaId_Desc() { regOBD("SEA_ID"); return this; }

    protected ConditionValue _landId;
    public ConditionValue xdfgetLandId()
    { if (_landId == null) { _landId = nCV(); }
      return _landId; }
    protected ConditionValue xgetCValueLandId() { return xdfgetLandId(); }

    /**
     * Add order-by as ascend. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_LandId_Asc() { regOBA("LAND_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_LandId_Desc() { regOBD("LAND_ID"); return this; }

    protected ConditionValue _piariId;
    public ConditionValue xdfgetPiariId()
    { if (_piariId == null) { _piariId = nCV(); }
      return _piariId; }
    protected ConditionValue xgetCValuePiariId() { return xdfgetPiariId(); }

    /**
     * Add order-by as ascend. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_PiariId_Asc() { regOBA("PIARI_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_PiariId_Desc() { regOBD("PIARI_ID"); return this; }

    protected ConditionValue _bonvoId;
    public ConditionValue xdfgetBonvoId()
    { if (_bonvoId == null) { _bonvoId = nCV(); }
      return _bonvoId; }
    protected ConditionValue xgetCValueBonvoId() { return xdfgetBonvoId(); }

    /**
     * Add order-by as ascend. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_BonvoId_Asc() { regOBA("BONVO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_BonvoId_Desc() { regOBD("BONVO_ID"); return this; }

    protected ConditionValue _dstoreId;
    public ConditionValue xdfgetDstoreId()
    { if (_dstoreId == null) { _dstoreId = nCV(); }
      return _dstoreId; }
    protected ConditionValue xgetCValueDstoreId() { return xdfgetDstoreId(); }

    /**
     * Add order-by as ascend. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_DstoreId_Asc() { regOBA("DSTORE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_DstoreId_Desc() { regOBD("DSTORE_ID"); return this; }

    protected ConditionValue _ambaId;
    public ConditionValue xdfgetAmbaId()
    { if (_ambaId == null) { _ambaId = nCV(); }
      return _ambaId; }
    protected ConditionValue xgetCValueAmbaId() { return xdfgetAmbaId(); }

    /**
     * Add order-by as ascend. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_AmbaId_Asc() { regOBA("AMBA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_AmbaId_Desc() { regOBD("AMBA_ID"); return this; }

    protected ConditionValue _miracoId;
    public ConditionValue xdfgetMiracoId()
    { if (_miracoId == null) { _miracoId = nCV(); }
      return _miracoId; }
    protected ConditionValue xgetCValueMiracoId() { return xdfgetMiracoId(); }

    /**
     * Add order-by as ascend. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_MiracoId_Asc() { regOBA("MIRACO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_MiracoId_Desc() { regOBD("MIRACO_ID"); return this; }

    protected ConditionValue _dohotelId;
    public ConditionValue xdfgetDohotelId()
    { if (_dohotelId == null) { _dohotelId = nCV(); }
      return _dohotelId; }
    protected ConditionValue xgetCValueDohotelId() { return xdfgetDohotelId(); }

    /**
     * Add order-by as ascend. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_DohotelId_Asc() { regOBA("DOHOTEL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @return this. (NotNull)
     */
    public BsWhiteBaseCQ addOrderBy_DohotelId_Desc() { regOBD("DOHOTEL_ID"); return this; }

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
    public BsWhiteBaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteBaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WhiteBaseCQ bq = (WhiteBaseCQ)bqs;
        WhiteBaseCQ uq = (WhiteBaseCQ)uqs;
        if (bq.hasConditionQueryWhiteBaseOne06Amba()) {
            uq.queryWhiteBaseOne06Amba().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne06Amba(), uq.queryWhiteBaseOne06Amba());
        }
        if (bq.hasConditionQueryWhiteBaseOne04Bonvo()) {
            uq.queryWhiteBaseOne04Bonvo().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne04Bonvo(), uq.queryWhiteBaseOne04Bonvo());
        }
        if (bq.hasConditionQueryWhiteBaseOne05Dstore()) {
            uq.queryWhiteBaseOne05Dstore().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne05Dstore(), uq.queryWhiteBaseOne05Dstore());
        }
        if (bq.hasConditionQueryWhiteBaseOne02Land()) {
            uq.queryWhiteBaseOne02Land().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne02Land(), uq.queryWhiteBaseOne02Land());
        }
        if (bq.hasConditionQueryWhiteBaseOne07Miraco()) {
            uq.queryWhiteBaseOne07Miraco().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne07Miraco(), uq.queryWhiteBaseOne07Miraco());
        }
        if (bq.hasConditionQueryWhiteBaseOne03Piari()) {
            uq.queryWhiteBaseOne03Piari().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne03Piari(), uq.queryWhiteBaseOne03Piari());
        }
        if (bq.hasConditionQueryWhiteBaseOne01Sea()) {
            uq.queryWhiteBaseOne01Sea().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne01Sea(), uq.queryWhiteBaseOne01Sea());
        }
        if (bq.hasConditionQueryWhiteBaseOne08Dohotel()) {
            uq.queryWhiteBaseOne08Dohotel().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne08Dohotel(), uq.queryWhiteBaseOne08Dohotel());
        }
        if (bq.hasConditionQueryWhiteBaseOne09PalmAsOne()) {
            uq.queryWhiteBaseOne09PalmAsOne().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne09PalmAsOne(), uq.queryWhiteBaseOne09PalmAsOne());
        }
        if (bq.hasConditionQueryWhiteBaseOne10CelebAsOne()) {
            uq.queryWhiteBaseOne10CelebAsOne().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne10CelebAsOne(), uq.queryWhiteBaseOne10CelebAsOne());
        }
        if (bq.hasConditionQueryWhiteBaseOne11CirqueAsOne()) {
            uq.queryWhiteBaseOne11CirqueAsOne().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne11CirqueAsOne(), uq.queryWhiteBaseOne11CirqueAsOne());
        }
        if (bq.hasConditionQueryWhiteBaseOne12AmphiAsOne()) {
            uq.queryWhiteBaseOne12AmphiAsOne().reflectRelationOnUnionQuery(bq.queryWhiteBaseOne12AmphiAsOne(), uq.queryWhiteBaseOne12AmphiAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne06AmbaCQ queryWhiteBaseOne06Amba() {
        return xdfgetConditionQueryWhiteBaseOne06Amba();
    }
    public WhiteBaseOne06AmbaCQ xdfgetConditionQueryWhiteBaseOne06Amba() {
        String prop = "whiteBaseOne06Amba";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne06Amba()); xsetupOuterJoinWhiteBaseOne06Amba(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne06AmbaCQ xcreateQueryWhiteBaseOne06Amba() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne06Amba"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne06AmbaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne06Amba", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne06Amba() { xregOutJo("whiteBaseOne06Amba"); }
    public boolean hasConditionQueryWhiteBaseOne06Amba() { return xhasQueRlMap("whiteBaseOne06Amba"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne04BonvoCQ queryWhiteBaseOne04Bonvo() {
        return xdfgetConditionQueryWhiteBaseOne04Bonvo();
    }
    public WhiteBaseOne04BonvoCQ xdfgetConditionQueryWhiteBaseOne04Bonvo() {
        String prop = "whiteBaseOne04Bonvo";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne04Bonvo()); xsetupOuterJoinWhiteBaseOne04Bonvo(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne04BonvoCQ xcreateQueryWhiteBaseOne04Bonvo() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne04Bonvo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne04BonvoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne04Bonvo", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne04Bonvo() { xregOutJo("whiteBaseOne04Bonvo"); }
    public boolean hasConditionQueryWhiteBaseOne04Bonvo() { return xhasQueRlMap("whiteBaseOne04Bonvo"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne05DstoreCQ queryWhiteBaseOne05Dstore() {
        return xdfgetConditionQueryWhiteBaseOne05Dstore();
    }
    public WhiteBaseOne05DstoreCQ xdfgetConditionQueryWhiteBaseOne05Dstore() {
        String prop = "whiteBaseOne05Dstore";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne05Dstore()); xsetupOuterJoinWhiteBaseOne05Dstore(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne05DstoreCQ xcreateQueryWhiteBaseOne05Dstore() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne05Dstore"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne05DstoreCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne05Dstore", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne05Dstore() { xregOutJo("whiteBaseOne05Dstore"); }
    public boolean hasConditionQueryWhiteBaseOne05Dstore() { return xhasQueRlMap("whiteBaseOne05Dstore"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne02LandCQ queryWhiteBaseOne02Land() {
        return xdfgetConditionQueryWhiteBaseOne02Land();
    }
    public WhiteBaseOne02LandCQ xdfgetConditionQueryWhiteBaseOne02Land() {
        String prop = "whiteBaseOne02Land";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne02Land()); xsetupOuterJoinWhiteBaseOne02Land(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne02LandCQ xcreateQueryWhiteBaseOne02Land() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne02Land"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne02LandCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne02Land", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne02Land() { xregOutJo("whiteBaseOne02Land"); }
    public boolean hasConditionQueryWhiteBaseOne02Land() { return xhasQueRlMap("whiteBaseOne02Land"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne07MiracoCQ queryWhiteBaseOne07Miraco() {
        return xdfgetConditionQueryWhiteBaseOne07Miraco();
    }
    public WhiteBaseOne07MiracoCQ xdfgetConditionQueryWhiteBaseOne07Miraco() {
        String prop = "whiteBaseOne07Miraco";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne07Miraco()); xsetupOuterJoinWhiteBaseOne07Miraco(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne07MiracoCQ xcreateQueryWhiteBaseOne07Miraco() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne07Miraco"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne07MiracoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne07Miraco", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne07Miraco() { xregOutJo("whiteBaseOne07Miraco"); }
    public boolean hasConditionQueryWhiteBaseOne07Miraco() { return xhasQueRlMap("whiteBaseOne07Miraco"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne03PiariCQ queryWhiteBaseOne03Piari() {
        return xdfgetConditionQueryWhiteBaseOne03Piari();
    }
    public WhiteBaseOne03PiariCQ xdfgetConditionQueryWhiteBaseOne03Piari() {
        String prop = "whiteBaseOne03Piari";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne03Piari()); xsetupOuterJoinWhiteBaseOne03Piari(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne03PiariCQ xcreateQueryWhiteBaseOne03Piari() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne03Piari"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne03PiariCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne03Piari", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne03Piari() { xregOutJo("whiteBaseOne03Piari"); }
    public boolean hasConditionQueryWhiteBaseOne03Piari() { return xhasQueRlMap("whiteBaseOne03Piari"); }

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
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne01Sea"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne01SeaCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne01Sea", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne01Sea() { xregOutJo("whiteBaseOne01Sea"); }
    public boolean hasConditionQueryWhiteBaseOne01Sea() { return xhasQueRlMap("whiteBaseOne01Sea"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne08DohotelCQ queryWhiteBaseOne08Dohotel() {
        return xdfgetConditionQueryWhiteBaseOne08Dohotel();
    }
    public WhiteBaseOne08DohotelCQ xdfgetConditionQueryWhiteBaseOne08Dohotel() {
        String prop = "whiteBaseOne08Dohotel";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne08Dohotel()); xsetupOuterJoinWhiteBaseOne08Dohotel(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne08DohotelCQ xcreateQueryWhiteBaseOne08Dohotel() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne08Dohotel"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne08DohotelCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne08Dohotel", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne08Dohotel() { xregOutJo("whiteBaseOne08Dohotel"); }
    public boolean hasConditionQueryWhiteBaseOne08Dohotel() { return xhasQueRlMap("whiteBaseOne08Dohotel"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne09PalmCQ queryWhiteBaseOne09PalmAsOne() { return xdfgetConditionQueryWhiteBaseOne09PalmAsOne(); }
    public WhiteBaseOne09PalmCQ xdfgetConditionQueryWhiteBaseOne09PalmAsOne() {
        String prop = "whiteBaseOne09PalmAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne09PalmAsOne()); xsetupOuterJoinWhiteBaseOne09PalmAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne09PalmCQ xcreateQueryWhiteBaseOne09PalmAsOne() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne09PalmAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne09PalmCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne09PalmAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne09PalmAsOne() { xregOutJo("whiteBaseOne09PalmAsOne"); }
    public boolean hasConditionQueryWhiteBaseOne09PalmAsOne() { return xhasQueRlMap("whiteBaseOne09PalmAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne10CelebCQ queryWhiteBaseOne10CelebAsOne() { return xdfgetConditionQueryWhiteBaseOne10CelebAsOne(); }
    public WhiteBaseOne10CelebCQ xdfgetConditionQueryWhiteBaseOne10CelebAsOne() {
        String prop = "whiteBaseOne10CelebAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne10CelebAsOne()); xsetupOuterJoinWhiteBaseOne10CelebAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne10CelebCQ xcreateQueryWhiteBaseOne10CelebAsOne() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne10CelebAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne10CelebCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne10CelebAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne10CelebAsOne() { xregOutJo("whiteBaseOne10CelebAsOne"); }
    public boolean hasConditionQueryWhiteBaseOne10CelebAsOne() { return xhasQueRlMap("whiteBaseOne10CelebAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne11CirqueCQ queryWhiteBaseOne11CirqueAsOne() { return xdfgetConditionQueryWhiteBaseOne11CirqueAsOne(); }
    public WhiteBaseOne11CirqueCQ xdfgetConditionQueryWhiteBaseOne11CirqueAsOne() {
        String prop = "whiteBaseOne11CirqueAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne11CirqueAsOne()); xsetupOuterJoinWhiteBaseOne11CirqueAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne11CirqueCQ xcreateQueryWhiteBaseOne11CirqueAsOne() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne11CirqueAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne11CirqueCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne11CirqueAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne11CirqueAsOne() { xregOutJo("whiteBaseOne11CirqueAsOne"); }
    public boolean hasConditionQueryWhiteBaseOne11CirqueAsOne() { return xhasQueRlMap("whiteBaseOne11CirqueAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public WhiteBaseOne12AmphiCQ queryWhiteBaseOne12AmphiAsOne() { return xdfgetConditionQueryWhiteBaseOne12AmphiAsOne(); }
    public WhiteBaseOne12AmphiCQ xdfgetConditionQueryWhiteBaseOne12AmphiAsOne() {
        String prop = "whiteBaseOne12AmphiAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWhiteBaseOne12AmphiAsOne()); xsetupOuterJoinWhiteBaseOne12AmphiAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected WhiteBaseOne12AmphiCQ xcreateQueryWhiteBaseOne12AmphiAsOne() {
        String nrp = xresolveNRP("WHITE_BASE", "whiteBaseOne12AmphiAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WhiteBaseOne12AmphiCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "whiteBaseOne12AmphiAsOne", nrp);
    }
    protected void xsetupOuterJoinWhiteBaseOne12AmphiAsOne() { xregOutJo("whiteBaseOne12AmphiAsOne"); }
    public boolean hasConditionQueryWhiteBaseOne12AmphiAsOne() { return xhasQueRlMap("whiteBaseOne12AmphiAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteBaseCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteBaseCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteBaseCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteBaseCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteBaseCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteBaseCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteBaseCQ> _myselfExistsMap;
    public Map<String, WhiteBaseCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteBaseCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteBaseCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteBaseCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteBaseCB.class.getName(); }
    protected String xCQ() { return WhiteBaseCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
