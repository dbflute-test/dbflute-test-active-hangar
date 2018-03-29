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
 * The abstract condition-query of WHITE_DEPRECATED_SELECT_BY_PKUQ.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDeprecatedSelectByPkuqCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDeprecatedSelectByPkuqCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DEPRECATED_SELECT_BY_PKUQ";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqId The value of selectByPkuqId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_Equal(Long selectByPkuqId) {
        doSetSelectByPkuqId_Equal(selectByPkuqId);
    }

    protected void doSetSelectByPkuqId_Equal(Long selectByPkuqId) {
        regSelectByPkuqId(CK_EQ, selectByPkuqId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqId The value of selectByPkuqId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_NotEqual(Long selectByPkuqId) {
        doSetSelectByPkuqId_NotEqual(selectByPkuqId);
    }

    protected void doSetSelectByPkuqId_NotEqual(Long selectByPkuqId) {
        regSelectByPkuqId(CK_NES, selectByPkuqId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqId The value of selectByPkuqId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_GreaterThan(Long selectByPkuqId) {
        regSelectByPkuqId(CK_GT, selectByPkuqId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqId The value of selectByPkuqId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_LessThan(Long selectByPkuqId) {
        regSelectByPkuqId(CK_LT, selectByPkuqId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqId The value of selectByPkuqId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_GreaterEqual(Long selectByPkuqId) {
        regSelectByPkuqId(CK_GE, selectByPkuqId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqId The value of selectByPkuqId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_LessEqual(Long selectByPkuqId) {
        regSelectByPkuqId(CK_LE, selectByPkuqId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of selectByPkuqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of selectByPkuqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSelectByPkuqId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSelectByPkuqId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of selectByPkuqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of selectByPkuqId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSelectByPkuqId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSelectByPkuqId(), "SELECT_BY_PKUQ_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqIdList The collection of selectByPkuqId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_InScope(Collection<Long> selectByPkuqIdList) {
        doSetSelectByPkuqId_InScope(selectByPkuqIdList);
    }

    protected void doSetSelectByPkuqId_InScope(Collection<Long> selectByPkuqIdList) {
        regINS(CK_INS, cTL(selectByPkuqIdList), xgetCValueSelectByPkuqId(), "SELECT_BY_PKUQ_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @param selectByPkuqIdList The collection of selectByPkuqId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqId_NotInScope(Collection<Long> selectByPkuqIdList) {
        doSetSelectByPkuqId_NotInScope(selectByPkuqIdList);
    }

    protected void doSetSelectByPkuqId_NotInScope(Collection<Long> selectByPkuqIdList) {
        regINS(CK_NINS, cTL(selectByPkuqIdList), xgetCValueSelectByPkuqId(), "SELECT_BY_PKUQ_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSelectByPkuqId_IsNull() { regSelectByPkuqId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSelectByPkuqId_IsNotNull() { regSelectByPkuqId(CK_ISNN, DOBJ); }

    protected void regSelectByPkuqId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelectByPkuqId(), "SELECT_BY_PKUQ_ID"); }
    protected abstract ConditionValue xgetCValueSelectByPkuqId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)}
     * @param selectByPkuqName The value of selectByPkuqName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqName_Equal(String selectByPkuqName) {
        doSetSelectByPkuqName_Equal(fRES(selectByPkuqName));
    }

    protected void doSetSelectByPkuqName_Equal(String selectByPkuqName) {
        regSelectByPkuqName(CK_EQ, selectByPkuqName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSelectByPkuqName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param selectByPkuqName The value of selectByPkuqName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelectByPkuqName_LikeSearch(String selectByPkuqName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelectByPkuqName_LikeSearch(selectByPkuqName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSelectByPkuqName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selectByPkuqName The value of selectByPkuqName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSelectByPkuqName_LikeSearch(String selectByPkuqName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selectByPkuqName), xgetCValueSelectByPkuqName(), "SELECT_BY_PKUQ_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)}
     * @param selectByPkuqName The value of selectByPkuqName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelectByPkuqName_NotLikeSearch(String selectByPkuqName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelectByPkuqName_NotLikeSearch(selectByPkuqName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)}
     * @param selectByPkuqName The value of selectByPkuqName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSelectByPkuqName_NotLikeSearch(String selectByPkuqName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selectByPkuqName), xgetCValueSelectByPkuqName(), "SELECT_BY_PKUQ_NAME", likeSearchOption);
    }

    protected void regSelectByPkuqName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelectByPkuqName(), "SELECT_BY_PKUQ_NAME"); }
    protected abstract ConditionValue xgetCValueSelectByPkuqName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @param selectByPkuqCode The value of selectByPkuqCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqCode_Equal(String selectByPkuqCode) {
        doSetSelectByPkuqCode_Equal(fRES(selectByPkuqCode));
    }

    protected void doSetSelectByPkuqCode_Equal(String selectByPkuqCode) {
        regSelectByPkuqCode(CK_EQ, selectByPkuqCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @param selectByPkuqCode The value of selectByPkuqCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqCode_NotEqual(String selectByPkuqCode) {
        doSetSelectByPkuqCode_NotEqual(fRES(selectByPkuqCode));
    }

    protected void doSetSelectByPkuqCode_NotEqual(String selectByPkuqCode) {
        regSelectByPkuqCode(CK_NES, selectByPkuqCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @param selectByPkuqCodeList The collection of selectByPkuqCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqCode_InScope(Collection<String> selectByPkuqCodeList) {
        doSetSelectByPkuqCode_InScope(selectByPkuqCodeList);
    }

    protected void doSetSelectByPkuqCode_InScope(Collection<String> selectByPkuqCodeList) {
        regINS(CK_INS, cTL(selectByPkuqCodeList), xgetCValueSelectByPkuqCode(), "SELECT_BY_PKUQ_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @param selectByPkuqCodeList The collection of selectByPkuqCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelectByPkuqCode_NotInScope(Collection<String> selectByPkuqCodeList) {
        doSetSelectByPkuqCode_NotInScope(selectByPkuqCodeList);
    }

    protected void doSetSelectByPkuqCode_NotInScope(Collection<String> selectByPkuqCodeList) {
        regINS(CK_NINS, cTL(selectByPkuqCodeList), xgetCValueSelectByPkuqCode(), "SELECT_BY_PKUQ_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} <br>
     * <pre>e.g. setSelectByPkuqCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param selectByPkuqCode The value of selectByPkuqCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelectByPkuqCode_LikeSearch(String selectByPkuqCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelectByPkuqCode_LikeSearch(selectByPkuqCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} <br>
     * <pre>e.g. setSelectByPkuqCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selectByPkuqCode The value of selectByPkuqCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSelectByPkuqCode_LikeSearch(String selectByPkuqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selectByPkuqCode), xgetCValueSelectByPkuqCode(), "SELECT_BY_PKUQ_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @param selectByPkuqCode The value of selectByPkuqCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelectByPkuqCode_NotLikeSearch(String selectByPkuqCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelectByPkuqCode_NotLikeSearch(selectByPkuqCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @param selectByPkuqCode The value of selectByPkuqCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSelectByPkuqCode_NotLikeSearch(String selectByPkuqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selectByPkuqCode), xgetCValueSelectByPkuqCode(), "SELECT_BY_PKUQ_CODE", likeSearchOption);
    }

    protected void regSelectByPkuqCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelectByPkuqCode(), "SELECT_BY_PKUQ_CODE"); }
    protected abstract ConditionValue xgetCValueSelectByPkuqCode();

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
    public HpSLCFunction<WhiteDeprecatedSelectByPkuqCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDeprecatedSelectByPkuqCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSelectByPkuqCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDeprecatedSelectByPkuqCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSelectByPkuqCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDeprecatedSelectByPkuqCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSelectByPkuqCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDeprecatedSelectByPkuqCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSelectByPkuqCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDeprecatedSelectByPkuqCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedSelectByPkuqCB&gt;() {
     *     public void query(WhiteDeprecatedSelectByPkuqCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDeprecatedSelectByPkuqCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDeprecatedSelectByPkuqCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedSelectByPkuqCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDeprecatedSelectByPkuqCQ sq);

    protected WhiteDeprecatedSelectByPkuqCB xcreateScalarConditionCB() {
        WhiteDeprecatedSelectByPkuqCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDeprecatedSelectByPkuqCB xcreateScalarConditionPartitionByCB() {
        WhiteDeprecatedSelectByPkuqCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDeprecatedSelectByPkuqCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedSelectByPkuqCB cb = new WhiteDeprecatedSelectByPkuqCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SELECT_BY_PKUQ_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDeprecatedSelectByPkuqCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDeprecatedSelectByPkuqCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDeprecatedSelectByPkuqCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedSelectByPkuqCB cb = new WhiteDeprecatedSelectByPkuqCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SELECT_BY_PKUQ_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDeprecatedSelectByPkuqCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDeprecatedSelectByPkuqCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDeprecatedSelectByPkuqCB cb = new WhiteDeprecatedSelectByPkuqCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDeprecatedSelectByPkuqCQ sq);

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
    protected WhiteDeprecatedSelectByPkuqCB newMyCB() {
        return new WhiteDeprecatedSelectByPkuqCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDeprecatedSelectByPkuqCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
