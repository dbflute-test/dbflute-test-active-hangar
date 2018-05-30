package org.docksidestage.hangar.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of WHITE_ON_PARADE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOnParadeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOnParadeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "WHITE_ON_PARADE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeId The value of onParadeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnParadeId_Equal(Long onParadeId) {
        doSetOnParadeId_Equal(onParadeId);
    }

    protected void doSetOnParadeId_Equal(Long onParadeId) {
        regOnParadeId(CK_EQ, onParadeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeId The value of onParadeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnParadeId_NotEqual(Long onParadeId) {
        doSetOnParadeId_NotEqual(onParadeId);
    }

    protected void doSetOnParadeId_NotEqual(Long onParadeId) {
        regOnParadeId(CK_NES, onParadeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeId The value of onParadeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnParadeId_GreaterThan(Long onParadeId) {
        regOnParadeId(CK_GT, onParadeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeId The value of onParadeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnParadeId_LessThan(Long onParadeId) {
        regOnParadeId(CK_LT, onParadeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeId The value of onParadeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnParadeId_GreaterEqual(Long onParadeId) {
        regOnParadeId(CK_GE, onParadeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeId The value of onParadeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnParadeId_LessEqual(Long onParadeId) {
        regOnParadeId(CK_LE, onParadeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of onParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of onParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOnParadeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOnParadeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of onParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of onParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOnParadeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOnParadeId(), "ON_PARADE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeIdList The collection of onParadeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnParadeId_InScope(Collection<Long> onParadeIdList) {
        doSetOnParadeId_InScope(onParadeIdList);
    }

    protected void doSetOnParadeId_InScope(Collection<Long> onParadeIdList) {
        regINS(CK_INS, cTL(onParadeIdList), xgetCValueOnParadeId(), "ON_PARADE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     * @param onParadeIdList The collection of onParadeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnParadeId_NotInScope(Collection<Long> onParadeIdList) {
        doSetOnParadeId_NotInScope(onParadeIdList);
    }

    protected void doSetOnParadeId_NotInScope(Collection<Long> onParadeIdList) {
        regINS(CK_NINS, cTL(onParadeIdList), xgetCValueOnParadeId(), "ON_PARADE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NULLABLE_FK_ON_PARADE_ID from WHITE_ON_PARADE_REF where ...)} <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteOnParadeRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteOnParadeRefList for 'exists'. (NotNull)
     */
    public void existsWhiteOnParadeRef(SubQuery<WhiteOnParadeRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOnParadeId_ExistsReferrer_WhiteOnParadeRefList(cb.query());
        registerExistsReferrer(cb.query(), "ON_PARADE_ID", "NULLABLE_FK_ON_PARADE_ID", pp, "whiteOnParadeRefList");
    }
    public abstract String keepOnParadeId_ExistsReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NULLABLE_FK_ON_PARADE_ID from WHITE_ON_PARADE_REF where ...)} <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteOnParadeRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of OnParadeId_NotExistsReferrer_WhiteOnParadeRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteOnParadeRef(SubQuery<WhiteOnParadeRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepOnParadeId_NotExistsReferrer_WhiteOnParadeRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "ON_PARADE_ID", "NULLABLE_FK_ON_PARADE_ID", pp, "whiteOnParadeRefList");
    }
    public abstract String keepOnParadeId_NotExistsReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);

    public void xsderiveWhiteOnParadeRefList(String fn, SubQuery<WhiteOnParadeRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepOnParadeId_SpecifyDerivedReferrer_WhiteOnParadeRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ON_PARADE_ID", "NULLABLE_FK_ON_PARADE_ID", pp, "whiteOnParadeRefList", al, op);
    }
    public abstract String keepOnParadeId_SpecifyDerivedReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_ON_PARADE_REF where ...)} <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteOnParadeRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteOnParadeRefCB> derivedWhiteOnParadeRef() {
        return xcreateQDRFunctionWhiteOnParadeRefList();
    }
    protected HpQDRFunction<WhiteOnParadeRefCB> xcreateQDRFunctionWhiteOnParadeRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteOnParadeRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteOnParadeRefList(String fn, SubQuery<WhiteOnParadeRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefList(cb.query()); String prpp = keepOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ON_PARADE_ID", "NULLABLE_FK_ON_PARADE_ID", sqpp, "whiteOnParadeRefList", rd, vl, prpp, op);
    }
    public abstract String keepOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);
    public abstract String keepOnParadeId_QueryDerivedReferrer_WhiteOnParadeRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setOnParadeId_IsNull() { regOnParadeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ON_PARADE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setOnParadeId_IsNotNull() { regOnParadeId(CK_ISNN, DOBJ); }

    protected void regOnParadeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnParadeId(), "ON_PARADE_ID"); }
    protected abstract ConditionValue xgetCValueOnParadeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)}
     * @param onParadeName The value of onParadeName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnParadeName_Equal(String onParadeName) {
        doSetOnParadeName_Equal(fRES(onParadeName));
    }

    protected void doSetOnParadeName_Equal(String onParadeName) {
        regOnParadeName(CK_EQ, onParadeName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setOnParadeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param onParadeName The value of onParadeName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOnParadeName_LikeSearch(String onParadeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOnParadeName_LikeSearch(onParadeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setOnParadeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param onParadeName The value of onParadeName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setOnParadeName_LikeSearch(String onParadeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(onParadeName), xgetCValueOnParadeName(), "ON_PARADE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)}
     * @param onParadeName The value of onParadeName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOnParadeName_NotLikeSearch(String onParadeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOnParadeName_NotLikeSearch(onParadeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ON_PARADE_NAME: {NotNull, VARCHAR(100)}
     * @param onParadeName The value of onParadeName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setOnParadeName_NotLikeSearch(String onParadeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(onParadeName), xgetCValueOnParadeName(), "ON_PARADE_NAME", likeSearchOption);
    }

    protected void regOnParadeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnParadeName(), "ON_PARADE_NAME"); }
    protected abstract ConditionValue xgetCValueOnParadeName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteOnParadeCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteOnParadeCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteOnParadeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteOnParadeCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteOnParadeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOnParadeCB&gt;() {
     *     public void query(WhiteOnParadeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteOnParadeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteOnParadeCQ sq);

    protected WhiteOnParadeCB xcreateScalarConditionCB() {
        WhiteOnParadeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOnParadeCB xcreateScalarConditionPartitionByCB() {
        WhiteOnParadeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOnParadeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeCB cb = new WhiteOnParadeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ON_PARADE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOnParadeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOnParadeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOnParadeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeCB cb = new WhiteOnParadeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ON_PARADE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOnParadeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOnParadeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeCB cb = new WhiteOnParadeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOnParadeCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteOnParadeCB newMyCB() {
        return new WhiteOnParadeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOnParadeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
