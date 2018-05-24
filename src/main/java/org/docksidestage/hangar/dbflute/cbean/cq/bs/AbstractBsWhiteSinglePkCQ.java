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
 * The abstract condition-query of WHITE_SINGLE_PK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSinglePkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSinglePkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_SINGLE_PK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkId The value of onlyOnePkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_Equal(Long onlyOnePkId) {
        doSetOnlyOnePkId_Equal(onlyOnePkId);
    }

    protected void doSetOnlyOnePkId_Equal(Long onlyOnePkId) {
        regOnlyOnePkId(CK_EQ, onlyOnePkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkId The value of onlyOnePkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_NotEqual(Long onlyOnePkId) {
        doSetOnlyOnePkId_NotEqual(onlyOnePkId);
    }

    protected void doSetOnlyOnePkId_NotEqual(Long onlyOnePkId) {
        regOnlyOnePkId(CK_NES, onlyOnePkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkId The value of onlyOnePkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_GreaterThan(Long onlyOnePkId) {
        regOnlyOnePkId(CK_GT, onlyOnePkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkId The value of onlyOnePkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_LessThan(Long onlyOnePkId) {
        regOnlyOnePkId(CK_LT, onlyOnePkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkId The value of onlyOnePkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_GreaterEqual(Long onlyOnePkId) {
        regOnlyOnePkId(CK_GE, onlyOnePkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkId The value of onlyOnePkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_LessEqual(Long onlyOnePkId) {
        regOnlyOnePkId(CK_LE, onlyOnePkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of onlyOnePkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of onlyOnePkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOnlyOnePkId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOnlyOnePkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of onlyOnePkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of onlyOnePkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOnlyOnePkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOnlyOnePkId(), "ONLY_ONE_PK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkIdList The collection of onlyOnePkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_InScope(Collection<Long> onlyOnePkIdList) {
        doSetOnlyOnePkId_InScope(onlyOnePkIdList);
    }

    protected void doSetOnlyOnePkId_InScope(Collection<Long> onlyOnePkIdList) {
        regINS(CK_INS, cTL(onlyOnePkIdList), xgetCValueOnlyOnePkId(), "ONLY_ONE_PK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @param onlyOnePkIdList The collection of onlyOnePkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnlyOnePkId_NotInScope(Collection<Long> onlyOnePkIdList) {
        doSetOnlyOnePkId_NotInScope(onlyOnePkIdList);
    }

    protected void doSetOnlyOnePkId_NotInScope(Collection<Long> onlyOnePkIdList) {
        regINS(CK_NINS, cTL(onlyOnePkIdList), xgetCValueOnlyOnePkId(), "ONLY_ONE_PK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setOnlyOnePkId_IsNull() { regOnlyOnePkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setOnlyOnePkId_IsNotNull() { regOnlyOnePkId(CK_ISNN, DOBJ); }

    protected void regOnlyOnePkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnlyOnePkId(), "ONLY_ONE_PK_ID"); }
    protected abstract ConditionValue xgetCValueOnlyOnePkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SINGLE_PK_NAME: {NotNull, VARCHAR(200)}
     * @param singlePkName The value of singlePkName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSinglePkName_Equal(String singlePkName) {
        doSetSinglePkName_Equal(fRES(singlePkName));
    }

    protected void doSetSinglePkName_Equal(String singlePkName) {
        regSinglePkName(CK_EQ, singlePkName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSinglePkName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param singlePkName The value of singlePkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSinglePkName_LikeSearch(String singlePkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSinglePkName_LikeSearch(singlePkName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSinglePkName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param singlePkName The value of singlePkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSinglePkName_LikeSearch(String singlePkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(singlePkName), xgetCValueSinglePkName(), "SINGLE_PK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_PK_NAME: {NotNull, VARCHAR(200)}
     * @param singlePkName The value of singlePkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSinglePkName_NotLikeSearch(String singlePkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSinglePkName_NotLikeSearch(singlePkName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SINGLE_PK_NAME: {NotNull, VARCHAR(200)}
     * @param singlePkName The value of singlePkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSinglePkName_NotLikeSearch(String singlePkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(singlePkName), xgetCValueSinglePkName(), "SINGLE_PK_NAME", likeSearchOption);
    }

    protected void regSinglePkName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSinglePkName(), "SINGLE_PK_NAME"); }
    protected abstract ConditionValue xgetCValueSinglePkName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_Equal(Integer referredId) {
        doSetReferredId_Equal(referredId);
    }

    protected void doSetReferredId_Equal(Integer referredId) {
        regReferredId(CK_EQ, referredId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_NotEqual(Integer referredId) {
        doSetReferredId_NotEqual(referredId);
    }

    protected void doSetReferredId_NotEqual(Integer referredId) {
        regReferredId(CK_NES, referredId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_GreaterThan(Integer referredId) {
        regReferredId(CK_GT, referredId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_LessThan(Integer referredId) {
        regReferredId(CK_LT, referredId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_GreaterEqual(Integer referredId) {
        regReferredId(CK_GE, referredId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredId The value of referredId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReferredId_LessEqual(Integer referredId) {
        regReferredId(CK_LE, referredId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param minNumber The min number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReferredId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param minNumber The min number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of referredId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReferredId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReferredId(), "REFERRED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredIdList The collection of referredId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferredId_InScope(Collection<Integer> referredIdList) {
        doSetReferredId_InScope(referredIdList);
    }

    protected void doSetReferredId_InScope(Collection<Integer> referredIdList) {
        regINS(CK_INS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @param referredIdList The collection of referredId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReferredId_NotInScope(Collection<Integer> referredIdList) {
        doSetReferredId_NotInScope(referredIdList);
    }

    protected void doSetReferredId_NotInScope(Collection<Integer> referredIdList) {
        regINS(CK_NINS, cTL(referredIdList), xgetCValueReferredId(), "REFERRED_ID");
    }

    protected void regReferredId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReferredId(), "REFERRED_ID"); }
    protected abstract ConditionValue xgetCValueReferredId();

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
    public HpSLCFunction<WhiteSinglePkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSinglePkCB.class);
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
    public HpSLCFunction<WhiteSinglePkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSinglePkCB.class);
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
    public HpSLCFunction<WhiteSinglePkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSinglePkCB.class);
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
    public HpSLCFunction<WhiteSinglePkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSinglePkCB.class);
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
    public HpSLCFunction<WhiteSinglePkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSinglePkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSinglePkCB&gt;() {
     *     public void query(WhiteSinglePkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSinglePkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSinglePkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSinglePkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSinglePkCQ sq);

    protected WhiteSinglePkCB xcreateScalarConditionCB() {
        WhiteSinglePkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSinglePkCB xcreateScalarConditionPartitionByCB() {
        WhiteSinglePkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSinglePkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSinglePkCB cb = new WhiteSinglePkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ONLY_ONE_PK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSinglePkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSinglePkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSinglePkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSinglePkCB cb = new WhiteSinglePkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ONLY_ONE_PK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSinglePkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSinglePkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSinglePkCB cb = new WhiteSinglePkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSinglePkCQ sq);

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
    protected WhiteSinglePkCB newMyCB() {
        return new WhiteSinglePkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSinglePkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
