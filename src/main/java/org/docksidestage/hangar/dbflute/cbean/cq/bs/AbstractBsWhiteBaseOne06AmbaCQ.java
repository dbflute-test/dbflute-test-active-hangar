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
 * The abstract condition-query of WHITE_BASE_ONE06_AMBA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne06AmbaCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne06AmbaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE06_AMBA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaId The value of ambaId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_Equal(Integer ambaId) {
        doSetAmbaId_Equal(ambaId);
    }

    protected void doSetAmbaId_Equal(Integer ambaId) {
        regAmbaId(CK_EQ, ambaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaId The value of ambaId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_NotEqual(Integer ambaId) {
        doSetAmbaId_NotEqual(ambaId);
    }

    protected void doSetAmbaId_NotEqual(Integer ambaId) {
        regAmbaId(CK_NES, ambaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaId The value of ambaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_GreaterThan(Integer ambaId) {
        regAmbaId(CK_GT, ambaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaId The value of ambaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_LessThan(Integer ambaId) {
        regAmbaId(CK_LT, ambaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaId The value of ambaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_GreaterEqual(Integer ambaId) {
        regAmbaId(CK_GE, ambaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaId The value of ambaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_LessEqual(Integer ambaId) {
        regAmbaId(CK_LE, ambaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAmbaId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAmbaId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAmbaId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmbaId(), "AMBA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaIdList The collection of ambaId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmbaId_InScope(Collection<Integer> ambaIdList) {
        doSetAmbaId_InScope(ambaIdList);
    }

    protected void doSetAmbaId_InScope(Collection<Integer> ambaIdList) {
        regINS(CK_INS, cTL(ambaIdList), xgetCValueAmbaId(), "AMBA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     * @param ambaIdList The collection of ambaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmbaId_NotInScope(Collection<Integer> ambaIdList) {
        doSetAmbaId_NotInScope(ambaIdList);
    }

    protected void doSetAmbaId_NotInScope(Collection<Integer> ambaIdList) {
        regINS(CK_NINS, cTL(ambaIdList), xgetCValueAmbaId(), "AMBA_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select AMBA_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by AMBA_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteBaseList for 'exists'. (NotNull)
     */
    public void existsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAmbaId_ExistsReferrer_WhiteBaseList(cb.query());
        registerExistsReferrer(cb.query(), "AMBA_ID", "AMBA_ID", pp, "whiteBaseList");
    }
    public abstract String keepAmbaId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select AMBA_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by AMBA_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AmbaId_NotExistsReferrer_WhiteBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAmbaId_NotExistsReferrer_WhiteBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "AMBA_ID", "AMBA_ID", pp, "whiteBaseList");
    }
    public abstract String keepAmbaId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    public void xsderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAmbaId_SpecifyDerivedReferrer_WhiteBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "AMBA_ID", "AMBA_ID", pp, "whiteBaseList", al, op);
    }
    public abstract String keepAmbaId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE where ...)} <br>
     * WHITE_BASE by AMBA_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteBase()</span>.<span style="color: #CC4747">max</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     baseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseCB> derivedWhiteBase() {
        return xcreateQDRFunctionWhiteBaseList();
    }
    protected HpQDRFunction<WhiteBaseCB> xcreateQDRFunctionWhiteBaseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteBaseList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAmbaId_QueryDerivedReferrer_WhiteBaseList(cb.query()); String prpp = keepAmbaId_QueryDerivedReferrer_WhiteBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "AMBA_ID", "AMBA_ID", sqpp, "whiteBaseList", rd, vl, prpp, op);
    }
    public abstract String keepAmbaId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);
    public abstract String keepAmbaId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setAmbaId_IsNull() { regAmbaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMBA_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setAmbaId_IsNotNull() { regAmbaId(CK_ISNN, DOBJ); }

    protected void regAmbaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmbaId(), "AMBA_ID"); }
    protected abstract ConditionValue xgetCValueAmbaId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMBA_NAME: {NotNull, VARCHAR(200)}
     * @param ambaName The value of ambaName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmbaName_Equal(String ambaName) {
        doSetAmbaName_Equal(fRES(ambaName));
    }

    protected void doSetAmbaName_Equal(String ambaName) {
        regAmbaName(CK_EQ, ambaName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMBA_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAmbaName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ambaName The value of ambaName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAmbaName_LikeSearch(String ambaName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAmbaName_LikeSearch(ambaName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMBA_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAmbaName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ambaName The value of ambaName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAmbaName_LikeSearch(String ambaName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ambaName), xgetCValueAmbaName(), "AMBA_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMBA_NAME: {NotNull, VARCHAR(200)}
     * @param ambaName The value of ambaName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAmbaName_NotLikeSearch(String ambaName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAmbaName_NotLikeSearch(ambaName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMBA_NAME: {NotNull, VARCHAR(200)}
     * @param ambaName The value of ambaName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAmbaName_NotLikeSearch(String ambaName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ambaName), xgetCValueAmbaName(), "AMBA_NAME", likeSearchOption);
    }

    protected void regAmbaName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmbaName(), "AMBA_NAME"); }
    protected abstract ConditionValue xgetCValueAmbaName();

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
    public HpSLCFunction<WhiteBaseOne06AmbaCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne06AmbaCB.class);
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
    public HpSLCFunction<WhiteBaseOne06AmbaCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne06AmbaCB.class);
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
    public HpSLCFunction<WhiteBaseOne06AmbaCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne06AmbaCB.class);
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
    public HpSLCFunction<WhiteBaseOne06AmbaCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne06AmbaCB.class);
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
    public HpSLCFunction<WhiteBaseOne06AmbaCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne06AmbaCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne06AmbaCB&gt;() {
     *     public void query(WhiteBaseOne06AmbaCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne06AmbaCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne06AmbaCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne06AmbaCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne06AmbaCQ sq);

    protected WhiteBaseOne06AmbaCB xcreateScalarConditionCB() {
        WhiteBaseOne06AmbaCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne06AmbaCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne06AmbaCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne06AmbaCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne06AmbaCB cb = new WhiteBaseOne06AmbaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "AMBA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne06AmbaCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne06AmbaCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne06AmbaCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne06AmbaCB cb = new WhiteBaseOne06AmbaCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "AMBA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne06AmbaCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne06AmbaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne06AmbaCB cb = new WhiteBaseOne06AmbaCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne06AmbaCQ sq);

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
    protected WhiteBaseOne06AmbaCB newMyCB() {
        return new WhiteBaseOne06AmbaCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne06AmbaCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
