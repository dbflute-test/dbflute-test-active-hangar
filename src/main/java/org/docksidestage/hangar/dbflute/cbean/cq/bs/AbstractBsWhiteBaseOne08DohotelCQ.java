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
 * The abstract condition-query of WHITE_BASE_ONE08_DOHOTEL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne08DohotelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne08DohotelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE08_DOHOTEL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelId The value of dohotelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_Equal(Integer dohotelId) {
        doSetDohotelId_Equal(dohotelId);
    }

    protected void doSetDohotelId_Equal(Integer dohotelId) {
        regDohotelId(CK_EQ, dohotelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelId The value of dohotelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_NotEqual(Integer dohotelId) {
        doSetDohotelId_NotEqual(dohotelId);
    }

    protected void doSetDohotelId_NotEqual(Integer dohotelId) {
        regDohotelId(CK_NES, dohotelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelId The value of dohotelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_GreaterThan(Integer dohotelId) {
        regDohotelId(CK_GT, dohotelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelId The value of dohotelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_LessThan(Integer dohotelId) {
        regDohotelId(CK_LT, dohotelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelId The value of dohotelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_GreaterEqual(Integer dohotelId) {
        regDohotelId(CK_GE, dohotelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelId The value of dohotelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_LessEqual(Integer dohotelId) {
        regDohotelId(CK_LE, dohotelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDohotelId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDohotelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDohotelId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDohotelId(), "DOHOTEL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelIdList The collection of dohotelId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDohotelId_InScope(Collection<Integer> dohotelIdList) {
        doSetDohotelId_InScope(dohotelIdList);
    }

    protected void doSetDohotelId_InScope(Collection<Integer> dohotelIdList) {
        regINS(CK_INS, cTL(dohotelIdList), xgetCValueDohotelId(), "DOHOTEL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     * @param dohotelIdList The collection of dohotelId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDohotelId_NotInScope(Collection<Integer> dohotelIdList) {
        doSetDohotelId_NotInScope(dohotelIdList);
    }

    protected void doSetDohotelId_NotInScope(Collection<Integer> dohotelIdList) {
        regINS(CK_NINS, cTL(dohotelIdList), xgetCValueDohotelId(), "DOHOTEL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DOHOTEL_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by DOHOTEL_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDohotelId_ExistsReferrer_WhiteBaseList(cb.query());
        registerExistsReferrer(cb.query(), "DOHOTEL_ID", "DOHOTEL_ID", pp, "whiteBaseList");
    }
    public abstract String keepDohotelId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DOHOTEL_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by DOHOTEL_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DohotelId_NotExistsReferrer_WhiteBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDohotelId_NotExistsReferrer_WhiteBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "DOHOTEL_ID", "DOHOTEL_ID", pp, "whiteBaseList");
    }
    public abstract String keepDohotelId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    public void xsderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDohotelId_SpecifyDerivedReferrer_WhiteBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DOHOTEL_ID", "DOHOTEL_ID", pp, "whiteBaseList", al, op);
    }
    public abstract String keepDohotelId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE where ...)} <br>
     * WHITE_BASE by DOHOTEL_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepDohotelId_QueryDerivedReferrer_WhiteBaseList(cb.query()); String prpp = keepDohotelId_QueryDerivedReferrer_WhiteBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DOHOTEL_ID", "DOHOTEL_ID", sqpp, "whiteBaseList", rd, vl, prpp, op);
    }
    public abstract String keepDohotelId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);
    public abstract String keepDohotelId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setDohotelId_IsNull() { regDohotelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setDohotelId_IsNotNull() { regDohotelId(CK_ISNN, DOBJ); }

    protected void regDohotelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDohotelId(), "DOHOTEL_ID"); }
    protected abstract ConditionValue xgetCValueDohotelId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_NAME: {NotNull, VARCHAR(200)}
     * @param dohotelName The value of dohotelName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDohotelName_Equal(String dohotelName) {
        doSetDohotelName_Equal(fRES(dohotelName));
    }

    protected void doSetDohotelName_Equal(String dohotelName) {
        regDohotelName(CK_EQ, dohotelName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOHOTEL_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDohotelName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param dohotelName The value of dohotelName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDohotelName_LikeSearch(String dohotelName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDohotelName_LikeSearch(dohotelName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOHOTEL_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDohotelName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dohotelName The value of dohotelName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDohotelName_LikeSearch(String dohotelName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dohotelName), xgetCValueDohotelName(), "DOHOTEL_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOHOTEL_NAME: {NotNull, VARCHAR(200)}
     * @param dohotelName The value of dohotelName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDohotelName_NotLikeSearch(String dohotelName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDohotelName_NotLikeSearch(dohotelName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOHOTEL_NAME: {NotNull, VARCHAR(200)}
     * @param dohotelName The value of dohotelName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDohotelName_NotLikeSearch(String dohotelName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dohotelName), xgetCValueDohotelName(), "DOHOTEL_NAME", likeSearchOption);
    }

    protected void regDohotelName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDohotelName(), "DOHOTEL_NAME"); }
    protected abstract ConditionValue xgetCValueDohotelName();

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
    public HpSLCFunction<WhiteBaseOne08DohotelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne08DohotelCB.class);
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
    public HpSLCFunction<WhiteBaseOne08DohotelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne08DohotelCB.class);
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
    public HpSLCFunction<WhiteBaseOne08DohotelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne08DohotelCB.class);
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
    public HpSLCFunction<WhiteBaseOne08DohotelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne08DohotelCB.class);
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
    public HpSLCFunction<WhiteBaseOne08DohotelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne08DohotelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne08DohotelCB&gt;() {
     *     public void query(WhiteBaseOne08DohotelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne08DohotelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne08DohotelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne08DohotelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne08DohotelCQ sq);

    protected WhiteBaseOne08DohotelCB xcreateScalarConditionCB() {
        WhiteBaseOne08DohotelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne08DohotelCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne08DohotelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne08DohotelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne08DohotelCB cb = new WhiteBaseOne08DohotelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DOHOTEL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne08DohotelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne08DohotelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne08DohotelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne08DohotelCB cb = new WhiteBaseOne08DohotelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DOHOTEL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne08DohotelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne08DohotelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne08DohotelCB cb = new WhiteBaseOne08DohotelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne08DohotelCQ sq);

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
    protected WhiteBaseOne08DohotelCB newMyCB() {
        return new WhiteBaseOne08DohotelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne08DohotelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
