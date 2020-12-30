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
 * The abstract condition-query of WHITE_BASE_ONE04_BONVO_STATIONSIDE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne04BonvoStationsideCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne04BonvoStationsideCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE04_BONVO_STATIONSIDE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideId The value of stationsideId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_Equal(Integer stationsideId) {
        doSetStationsideId_Equal(stationsideId);
    }

    protected void doSetStationsideId_Equal(Integer stationsideId) {
        regStationsideId(CK_EQ, stationsideId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideId The value of stationsideId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_NotEqual(Integer stationsideId) {
        doSetStationsideId_NotEqual(stationsideId);
    }

    protected void doSetStationsideId_NotEqual(Integer stationsideId) {
        regStationsideId(CK_NES, stationsideId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideId The value of stationsideId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_GreaterThan(Integer stationsideId) {
        regStationsideId(CK_GT, stationsideId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideId The value of stationsideId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_LessThan(Integer stationsideId) {
        regStationsideId(CK_LT, stationsideId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideId The value of stationsideId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_GreaterEqual(Integer stationsideId) {
        regStationsideId(CK_GE, stationsideId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideId The value of stationsideId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_LessEqual(Integer stationsideId) {
        regStationsideId(CK_LE, stationsideId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStationsideId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStationsideId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStationsideId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStationsideId(), "STATIONSIDE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideIdList The collection of stationsideId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationsideId_InScope(Collection<Integer> stationsideIdList) {
        doSetStationsideId_InScope(stationsideIdList);
    }

    protected void doSetStationsideId_InScope(Collection<Integer> stationsideIdList) {
        regINS(CK_INS, cTL(stationsideIdList), xgetCValueStationsideId(), "STATIONSIDE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param stationsideIdList The collection of stationsideId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationsideId_NotInScope(Collection<Integer> stationsideIdList) {
        doSetStationsideId_NotInScope(stationsideIdList);
    }

    protected void doSetStationsideId_NotInScope(Collection<Integer> stationsideIdList) {
        regINS(CK_NINS, cTL(stationsideIdList), xgetCValueStationsideId(), "STATIONSIDE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STATIONSIDE_ID from WHITE_BASE_ONE04_BONVO where ...)} <br>
     * WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteBaseOne04Bonvo</span>(bonvoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bonvoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteBaseOne04BonvoList for 'exists'. (NotNull)
     */
    public void existsWhiteBaseOne04Bonvo(SubQuery<WhiteBaseOne04BonvoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStationsideId_ExistsReferrer_WhiteBaseOne04BonvoList(cb.query());
        registerExistsReferrer(cb.query(), "STATIONSIDE_ID", "STATIONSIDE_ID", pp, "whiteBaseOne04BonvoList");
    }
    public abstract String keepStationsideId_ExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STATIONSIDE_ID from WHITE_BASE_ONE04_BONVO where ...)} <br>
     * WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBaseOne04Bonvo</span>(bonvoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bonvoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBaseOne04Bonvo(SubQuery<WhiteBaseOne04BonvoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList(cb.query());
        registerNotExistsReferrer(cb.query(), "STATIONSIDE_ID", "STATIONSIDE_ID", pp, "whiteBaseOne04BonvoList");
    }
    public abstract String keepStationsideId_NotExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);

    public void xsderiveWhiteBaseOne04BonvoList(String fn, SubQuery<WhiteBaseOne04BonvoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStationsideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STATIONSIDE_ID", "STATIONSIDE_ID", pp, "whiteBaseOne04BonvoList", al, op);
    }
    public abstract String keepStationsideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE_ONE04_BONVO where ...)} <br>
     * WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteBaseOne04Bonvo()</span>.<span style="color: #CC4747">max</span>(bonvoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bonvoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bonvoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne04BonvoCB> derivedWhiteBaseOne04Bonvo() {
        return xcreateQDRFunctionWhiteBaseOne04BonvoList();
    }
    protected HpQDRFunction<WhiteBaseOne04BonvoCB> xcreateQDRFunctionWhiteBaseOne04BonvoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteBaseOne04BonvoList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteBaseOne04BonvoList(String fn, SubQuery<WhiteBaseOne04BonvoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(cb.query()); String prpp = keepStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STATIONSIDE_ID", "STATIONSIDE_ID", sqpp, "whiteBaseOne04BonvoList", rd, vl, prpp, op);
    }
    public abstract String keepStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);
    public abstract String keepStationsideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setStationsideId_IsNull() { regStationsideId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setStationsideId_IsNotNull() { regStationsideId(CK_ISNN, DOBJ); }

    protected void regStationsideId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationsideId(), "STATIONSIDE_ID"); }
    protected abstract ConditionValue xgetCValueStationsideId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param stationsideName The value of stationsideName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationsideName_Equal(String stationsideName) {
        doSetStationsideName_Equal(fRES(stationsideName));
    }

    protected void doSetStationsideName_Equal(String stationsideName) {
        regStationsideName(CK_EQ, stationsideName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setStationsideName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stationsideName The value of stationsideName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationsideName_LikeSearch(String stationsideName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationsideName_LikeSearch(stationsideName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setStationsideName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stationsideName The value of stationsideName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStationsideName_LikeSearch(String stationsideName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stationsideName), xgetCValueStationsideName(), "STATIONSIDE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param stationsideName The value of stationsideName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStationsideName_NotLikeSearch(String stationsideName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStationsideName_NotLikeSearch(stationsideName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATIONSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param stationsideName The value of stationsideName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStationsideName_NotLikeSearch(String stationsideName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stationsideName), xgetCValueStationsideName(), "STATIONSIDE_NAME", likeSearchOption);
    }

    protected void regStationsideName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationsideName(), "STATIONSIDE_NAME"); }
    protected abstract ConditionValue xgetCValueStationsideName();

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
    public HpSLCFunction<WhiteBaseOne04BonvoStationsideCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne04BonvoStationsideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoStationsideCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne04BonvoStationsideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoStationsideCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne04BonvoStationsideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoStationsideCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne04BonvoStationsideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoStationsideCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne04BonvoStationsideCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne04BonvoStationsideCB&gt;() {
     *     public void query(WhiteBaseOne04BonvoStationsideCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne04BonvoStationsideCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne04BonvoStationsideCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoStationsideCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne04BonvoStationsideCQ sq);

    protected WhiteBaseOne04BonvoStationsideCB xcreateScalarConditionCB() {
        WhiteBaseOne04BonvoStationsideCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne04BonvoStationsideCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne04BonvoStationsideCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne04BonvoStationsideCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoStationsideCB cb = new WhiteBaseOne04BonvoStationsideCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STATIONSIDE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoStationsideCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne04BonvoStationsideCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne04BonvoStationsideCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoStationsideCB cb = new WhiteBaseOne04BonvoStationsideCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STATIONSIDE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne04BonvoStationsideCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne04BonvoStationsideCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoStationsideCB cb = new WhiteBaseOne04BonvoStationsideCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne04BonvoStationsideCQ sq);

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
    protected WhiteBaseOne04BonvoStationsideCB newMyCB() {
        return new WhiteBaseOne04BonvoStationsideCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne04BonvoStationsideCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
