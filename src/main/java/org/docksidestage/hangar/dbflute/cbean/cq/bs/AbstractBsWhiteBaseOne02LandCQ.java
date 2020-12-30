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
 * The abstract condition-query of WHITE_BASE_ONE02_LAND.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne02LandCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne02LandCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE02_LAND";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landId The value of landId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_Equal(Integer landId) {
        doSetLandId_Equal(landId);
    }

    protected void doSetLandId_Equal(Integer landId) {
        regLandId(CK_EQ, landId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landId The value of landId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_NotEqual(Integer landId) {
        doSetLandId_NotEqual(landId);
    }

    protected void doSetLandId_NotEqual(Integer landId) {
        regLandId(CK_NES, landId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landId The value of landId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_GreaterThan(Integer landId) {
        regLandId(CK_GT, landId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landId The value of landId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_LessThan(Integer landId) {
        regLandId(CK_LT, landId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landId The value of landId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_GreaterEqual(Integer landId) {
        regLandId(CK_GE, landId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landId The value of landId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_LessEqual(Integer landId) {
        regLandId(CK_LE, landId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLandId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLandId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLandId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLandId(), "LAND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landIdList The collection of landId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLandId_InScope(Collection<Integer> landIdList) {
        doSetLandId_InScope(landIdList);
    }

    protected void doSetLandId_InScope(Collection<Integer> landIdList) {
        regINS(CK_INS, cTL(landIdList), xgetCValueLandId(), "LAND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @param landIdList The collection of landId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLandId_NotInScope(Collection<Integer> landIdList) {
        doSetLandId_NotInScope(landIdList);
    }

    protected void doSetLandId_NotInScope(Collection<Integer> landIdList) {
        regINS(CK_NINS, cTL(landIdList), xgetCValueLandId(), "LAND_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAND_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by LAND_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLandId_ExistsReferrer_WhiteBaseList(cb.query());
        registerExistsReferrer(cb.query(), "LAND_ID", "LAND_ID", pp, "whiteBaseList");
    }
    public abstract String keepLandId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAND_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by LAND_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LandId_NotExistsReferrer_WhiteBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLandId_NotExistsReferrer_WhiteBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAND_ID", "LAND_ID", pp, "whiteBaseList");
    }
    public abstract String keepLandId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    public void xsderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLandId_SpecifyDerivedReferrer_WhiteBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAND_ID", "LAND_ID", pp, "whiteBaseList", al, op);
    }
    public abstract String keepLandId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE where ...)} <br>
     * WHITE_BASE by LAND_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepLandId_QueryDerivedReferrer_WhiteBaseList(cb.query()); String prpp = keepLandId_QueryDerivedReferrer_WhiteBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAND_ID", "LAND_ID", sqpp, "whiteBaseList", rd, vl, prpp, op);
    }
    public abstract String keepLandId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);
    public abstract String keepLandId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setLandId_IsNull() { regLandId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setLandId_IsNotNull() { regLandId(CK_ISNN, DOBJ); }

    protected void regLandId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLandId(), "LAND_ID"); }
    protected abstract ConditionValue xgetCValueLandId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)}
     * @param landName The value of landName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLandName_Equal(String landName) {
        doSetLandName_Equal(fRES(landName));
    }

    protected void doSetLandName_Equal(String landName) {
        regLandName(CK_EQ, landName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setLandName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param landName The value of landName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLandName_LikeSearch(String landName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLandName_LikeSearch(landName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setLandName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param landName The value of landName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLandName_LikeSearch(String landName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(landName), xgetCValueLandName(), "LAND_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)}
     * @param landName The value of landName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLandName_NotLikeSearch(String landName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLandName_NotLikeSearch(landName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LAND_NAME: {NotNull, VARCHAR(200)}
     * @param landName The value of landName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLandName_NotLikeSearch(String landName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(landName), xgetCValueLandName(), "LAND_NAME", likeSearchOption);
    }

    protected void regLandName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLandName(), "LAND_NAME"); }
    protected abstract ConditionValue xgetCValueLandName();

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
    public HpSLCFunction<WhiteBaseOne02LandCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne02LandCB.class);
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
    public HpSLCFunction<WhiteBaseOne02LandCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne02LandCB.class);
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
    public HpSLCFunction<WhiteBaseOne02LandCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne02LandCB.class);
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
    public HpSLCFunction<WhiteBaseOne02LandCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne02LandCB.class);
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
    public HpSLCFunction<WhiteBaseOne02LandCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne02LandCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne02LandCB&gt;() {
     *     public void query(WhiteBaseOne02LandCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne02LandCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne02LandCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne02LandCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne02LandCQ sq);

    protected WhiteBaseOne02LandCB xcreateScalarConditionCB() {
        WhiteBaseOne02LandCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne02LandCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne02LandCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne02LandCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne02LandCB cb = new WhiteBaseOne02LandCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAND_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne02LandCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne02LandCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne02LandCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne02LandCB cb = new WhiteBaseOne02LandCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAND_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne02LandCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne02LandCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne02LandCB cb = new WhiteBaseOne02LandCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne02LandCQ sq);

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
    protected WhiteBaseOne02LandCB newMyCB() {
        return new WhiteBaseOne02LandCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne02LandCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
