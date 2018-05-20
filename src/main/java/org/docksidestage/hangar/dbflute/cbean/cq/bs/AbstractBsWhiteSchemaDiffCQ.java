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
 * The abstract condition-query of WHITE_SCHEMA_DIFF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSchemaDiffCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSchemaDiffCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_SCHEMA_DIFF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffId The value of schemaDiffId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffId_Equal(Long schemaDiffId) {
        doSetSchemaDiffId_Equal(schemaDiffId);
    }

    protected void doSetSchemaDiffId_Equal(Long schemaDiffId) {
        regSchemaDiffId(CK_EQ, schemaDiffId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffId The value of schemaDiffId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffId_NotEqual(Long schemaDiffId) {
        doSetSchemaDiffId_NotEqual(schemaDiffId);
    }

    protected void doSetSchemaDiffId_NotEqual(Long schemaDiffId) {
        regSchemaDiffId(CK_NES, schemaDiffId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffId The value of schemaDiffId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffId_GreaterThan(Long schemaDiffId) {
        regSchemaDiffId(CK_GT, schemaDiffId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffId The value of schemaDiffId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffId_LessThan(Long schemaDiffId) {
        regSchemaDiffId(CK_LT, schemaDiffId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffId The value of schemaDiffId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffId_GreaterEqual(Long schemaDiffId) {
        regSchemaDiffId(CK_GE, schemaDiffId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffId The value of schemaDiffId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffId_LessEqual(Long schemaDiffId) {
        regSchemaDiffId(CK_LE, schemaDiffId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of schemaDiffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of schemaDiffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSchemaDiffId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSchemaDiffId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of schemaDiffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of schemaDiffId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSchemaDiffId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSchemaDiffId(), "SCHEMA_DIFF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffIdList The collection of schemaDiffId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchemaDiffId_InScope(Collection<Long> schemaDiffIdList) {
        doSetSchemaDiffId_InScope(schemaDiffIdList);
    }

    protected void doSetSchemaDiffId_InScope(Collection<Long> schemaDiffIdList) {
        regINS(CK_INS, cTL(schemaDiffIdList), xgetCValueSchemaDiffId(), "SCHEMA_DIFF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     * @param schemaDiffIdList The collection of schemaDiffId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchemaDiffId_NotInScope(Collection<Long> schemaDiffIdList) {
        doSetSchemaDiffId_NotInScope(schemaDiffIdList);
    }

    protected void doSetSchemaDiffId_NotInScope(Collection<Long> schemaDiffIdList) {
        regINS(CK_NINS, cTL(schemaDiffIdList), xgetCValueSchemaDiffId(), "SCHEMA_DIFF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSchemaDiffId_IsNull() { regSchemaDiffId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSchemaDiffId_IsNotNull() { regSchemaDiffId(CK_ISNN, DOBJ); }

    protected void regSchemaDiffId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchemaDiffId(), "SCHEMA_DIFF_ID"); }
    protected abstract ConditionValue xgetCValueSchemaDiffId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)}
     * @param schemaDiffName The value of schemaDiffName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSchemaDiffName_Equal(String schemaDiffName) {
        doSetSchemaDiffName_Equal(fRES(schemaDiffName));
    }

    protected void doSetSchemaDiffName_Equal(String schemaDiffName) {
        regSchemaDiffName(CK_EQ, schemaDiffName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSchemaDiffName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param schemaDiffName The value of schemaDiffName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSchemaDiffName_LikeSearch(String schemaDiffName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSchemaDiffName_LikeSearch(schemaDiffName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSchemaDiffName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param schemaDiffName The value of schemaDiffName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSchemaDiffName_LikeSearch(String schemaDiffName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(schemaDiffName), xgetCValueSchemaDiffName(), "SCHEMA_DIFF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)}
     * @param schemaDiffName The value of schemaDiffName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSchemaDiffName_NotLikeSearch(String schemaDiffName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSchemaDiffName_NotLikeSearch(schemaDiffName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)}
     * @param schemaDiffName The value of schemaDiffName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSchemaDiffName_NotLikeSearch(String schemaDiffName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(schemaDiffName), xgetCValueSchemaDiffName(), "SCHEMA_DIFF_NAME", likeSearchOption);
    }

    protected void regSchemaDiffName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchemaDiffName(), "SCHEMA_DIFF_NAME"); }
    protected abstract ConditionValue xgetCValueSchemaDiffName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * @param schemaDiffDate The value of schemaDiffDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffDate_Equal(java.time.LocalDate schemaDiffDate) {
        regSchemaDiffDate(CK_EQ,  schemaDiffDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * @param schemaDiffDate The value of schemaDiffDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffDate_GreaterThan(java.time.LocalDate schemaDiffDate) {
        regSchemaDiffDate(CK_GT,  schemaDiffDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * @param schemaDiffDate The value of schemaDiffDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffDate_LessThan(java.time.LocalDate schemaDiffDate) {
        regSchemaDiffDate(CK_LT,  schemaDiffDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * @param schemaDiffDate The value of schemaDiffDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffDate_GreaterEqual(java.time.LocalDate schemaDiffDate) {
        regSchemaDiffDate(CK_GE,  schemaDiffDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * @param schemaDiffDate The value of schemaDiffDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSchemaDiffDate_LessEqual(java.time.LocalDate schemaDiffDate) {
        regSchemaDiffDate(CK_LE, schemaDiffDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setSchemaDiffDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of schemaDiffDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of schemaDiffDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setSchemaDiffDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setSchemaDiffDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SCHEMA_DIFF_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setSchemaDiffDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of schemaDiffDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of schemaDiffDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setSchemaDiffDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "SCHEMA_DIFF_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueSchemaDiffDate(), nm, op);
    }

    protected void regSchemaDiffDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSchemaDiffDate(), "SCHEMA_DIFF_DATE"); }
    protected abstract ConditionValue xgetCValueSchemaDiffDate();

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
    public HpSLCFunction<WhiteSchemaDiffCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSchemaDiffCB.class);
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
    public HpSLCFunction<WhiteSchemaDiffCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSchemaDiffCB.class);
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
    public HpSLCFunction<WhiteSchemaDiffCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSchemaDiffCB.class);
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
    public HpSLCFunction<WhiteSchemaDiffCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSchemaDiffCB.class);
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
    public HpSLCFunction<WhiteSchemaDiffCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSchemaDiffCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSchemaDiffCB&gt;() {
     *     public void query(WhiteSchemaDiffCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSchemaDiffCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSchemaDiffCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSchemaDiffCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSchemaDiffCQ sq);

    protected WhiteSchemaDiffCB xcreateScalarConditionCB() {
        WhiteSchemaDiffCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSchemaDiffCB xcreateScalarConditionPartitionByCB() {
        WhiteSchemaDiffCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSchemaDiffCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSchemaDiffCB cb = new WhiteSchemaDiffCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SCHEMA_DIFF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSchemaDiffCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSchemaDiffCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSchemaDiffCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSchemaDiffCB cb = new WhiteSchemaDiffCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SCHEMA_DIFF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSchemaDiffCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSchemaDiffCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSchemaDiffCB cb = new WhiteSchemaDiffCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSchemaDiffCQ sq);

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
    protected WhiteSchemaDiffCB newMyCB() {
        return new WhiteSchemaDiffCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSchemaDiffCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
