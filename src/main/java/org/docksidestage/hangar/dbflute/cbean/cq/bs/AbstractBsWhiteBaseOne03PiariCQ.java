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
 * The abstract condition-query of WHITE_BASE_ONE03_PIARI.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne03PiariCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne03PiariCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE03_PIARI";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariId The value of piariId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_Equal(Integer piariId) {
        doSetPiariId_Equal(piariId);
    }

    protected void doSetPiariId_Equal(Integer piariId) {
        regPiariId(CK_EQ, piariId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariId The value of piariId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_NotEqual(Integer piariId) {
        doSetPiariId_NotEqual(piariId);
    }

    protected void doSetPiariId_NotEqual(Integer piariId) {
        regPiariId(CK_NES, piariId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariId The value of piariId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_GreaterThan(Integer piariId) {
        regPiariId(CK_GT, piariId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariId The value of piariId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_LessThan(Integer piariId) {
        regPiariId(CK_LT, piariId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariId The value of piariId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_GreaterEqual(Integer piariId) {
        regPiariId(CK_GE, piariId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariId The value of piariId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_LessEqual(Integer piariId) {
        regPiariId(CK_LE, piariId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPiariId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPiariId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPiariId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePiariId(), "PIARI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariIdList The collection of piariId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPiariId_InScope(Collection<Integer> piariIdList) {
        doSetPiariId_InScope(piariIdList);
    }

    protected void doSetPiariId_InScope(Collection<Integer> piariIdList) {
        regINS(CK_INS, cTL(piariIdList), xgetCValuePiariId(), "PIARI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     * @param piariIdList The collection of piariId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPiariId_NotInScope(Collection<Integer> piariIdList) {
        doSetPiariId_NotInScope(piariIdList);
    }

    protected void doSetPiariId_NotInScope(Collection<Integer> piariIdList) {
        regINS(CK_NINS, cTL(piariIdList), xgetCValuePiariId(), "PIARI_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PIARI_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by PIARI_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPiariId_ExistsReferrer_WhiteBaseList(cb.query());
        registerExistsReferrer(cb.query(), "PIARI_ID", "PIARI_ID", pp, "whiteBaseList");
    }
    public abstract String keepPiariId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PIARI_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by PIARI_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PiariId_NotExistsReferrer_WhiteBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPiariId_NotExistsReferrer_WhiteBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "PIARI_ID", "PIARI_ID", pp, "whiteBaseList");
    }
    public abstract String keepPiariId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    public void xsderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPiariId_SpecifyDerivedReferrer_WhiteBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PIARI_ID", "PIARI_ID", pp, "whiteBaseList", al, op);
    }
    public abstract String keepPiariId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE where ...)} <br>
     * WHITE_BASE by PIARI_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepPiariId_QueryDerivedReferrer_WhiteBaseList(cb.query()); String prpp = keepPiariId_QueryDerivedReferrer_WhiteBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PIARI_ID", "PIARI_ID", sqpp, "whiteBaseList", rd, vl, prpp, op);
    }
    public abstract String keepPiariId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);
    public abstract String keepPiariId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setPiariId_IsNull() { regPiariId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIARI_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setPiariId_IsNotNull() { regPiariId(CK_ISNN, DOBJ); }

    protected void regPiariId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePiariId(), "PIARI_ID"); }
    protected abstract ConditionValue xgetCValuePiariId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)}
     * @param piariName The value of piariName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPiariName_Equal(String piariName) {
        doSetPiariName_Equal(fRES(piariName));
    }

    protected void doSetPiariName_Equal(String piariName) {
        regPiariName(CK_EQ, piariName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPiariName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param piariName The value of piariName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPiariName_LikeSearch(String piariName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPiariName_LikeSearch(piariName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPiariName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param piariName The value of piariName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPiariName_LikeSearch(String piariName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(piariName), xgetCValuePiariName(), "PIARI_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)}
     * @param piariName The value of piariName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPiariName_NotLikeSearch(String piariName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPiariName_NotLikeSearch(piariName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PIARI_NAME: {NotNull, VARCHAR(200)}
     * @param piariName The value of piariName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPiariName_NotLikeSearch(String piariName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(piariName), xgetCValuePiariName(), "PIARI_NAME", likeSearchOption);
    }

    protected void regPiariName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePiariName(), "PIARI_NAME"); }
    protected abstract ConditionValue xgetCValuePiariName();

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
    public HpSLCFunction<WhiteBaseOne03PiariCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne03PiariCB.class);
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
    public HpSLCFunction<WhiteBaseOne03PiariCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne03PiariCB.class);
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
    public HpSLCFunction<WhiteBaseOne03PiariCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne03PiariCB.class);
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
    public HpSLCFunction<WhiteBaseOne03PiariCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne03PiariCB.class);
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
    public HpSLCFunction<WhiteBaseOne03PiariCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne03PiariCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne03PiariCB&gt;() {
     *     public void query(WhiteBaseOne03PiariCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne03PiariCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne03PiariCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne03PiariCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne03PiariCQ sq);

    protected WhiteBaseOne03PiariCB xcreateScalarConditionCB() {
        WhiteBaseOne03PiariCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne03PiariCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne03PiariCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne03PiariCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne03PiariCB cb = new WhiteBaseOne03PiariCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PIARI_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne03PiariCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne03PiariCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne03PiariCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne03PiariCB cb = new WhiteBaseOne03PiariCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PIARI_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne03PiariCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne03PiariCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne03PiariCB cb = new WhiteBaseOne03PiariCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne03PiariCQ sq);

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
    protected WhiteBaseOne03PiariCB newMyCB() {
        return new WhiteBaseOne03PiariCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne03PiariCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
