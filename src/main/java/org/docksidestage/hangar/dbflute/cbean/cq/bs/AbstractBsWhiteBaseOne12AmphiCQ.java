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
 * The abstract condition-query of WHITE_BASE_ONE12_AMPHI.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne12AmphiCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne12AmphiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE12_AMPHI";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiId The value of amphiId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmphiId_Equal(Integer amphiId) {
        doSetAmphiId_Equal(amphiId);
    }

    protected void doSetAmphiId_Equal(Integer amphiId) {
        regAmphiId(CK_EQ, amphiId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiId The value of amphiId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmphiId_NotEqual(Integer amphiId) {
        doSetAmphiId_NotEqual(amphiId);
    }

    protected void doSetAmphiId_NotEqual(Integer amphiId) {
        regAmphiId(CK_NES, amphiId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiId The value of amphiId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmphiId_GreaterThan(Integer amphiId) {
        regAmphiId(CK_GT, amphiId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiId The value of amphiId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmphiId_LessThan(Integer amphiId) {
        regAmphiId(CK_LT, amphiId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiId The value of amphiId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmphiId_GreaterEqual(Integer amphiId) {
        regAmphiId(CK_GE, amphiId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiId The value of amphiId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmphiId_LessEqual(Integer amphiId) {
        regAmphiId(CK_LE, amphiId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of amphiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amphiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAmphiId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAmphiId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of amphiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of amphiId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAmphiId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmphiId(), "AMPHI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiIdList The collection of amphiId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmphiId_InScope(Collection<Integer> amphiIdList) {
        doSetAmphiId_InScope(amphiIdList);
    }

    protected void doSetAmphiId_InScope(Collection<Integer> amphiIdList) {
        regINS(CK_INS, cTL(amphiIdList), xgetCValueAmphiId(), "AMPHI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @param amphiIdList The collection of amphiId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmphiId_NotInScope(Collection<Integer> amphiIdList) {
        doSetAmphiId_NotInScope(amphiIdList);
    }

    protected void doSetAmphiId_NotInScope(Collection<Integer> amphiIdList) {
        regINS(CK_NINS, cTL(amphiIdList), xgetCValueAmphiId(), "AMPHI_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setAmphiId_IsNull() { regAmphiId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setAmphiId_IsNotNull() { regAmphiId(CK_ISNN, DOBJ); }

    protected void regAmphiId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmphiId(), "AMPHI_ID"); }
    protected abstract ConditionValue xgetCValueAmphiId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AMPHI_NAME: {NotNull, VARCHAR(200)}
     * @param amphiName The value of amphiName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmphiName_Equal(String amphiName) {
        doSetAmphiName_Equal(fRES(amphiName));
    }

    protected void doSetAmphiName_Equal(String amphiName) {
        regAmphiName(CK_EQ, amphiName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMPHI_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAmphiName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param amphiName The value of amphiName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAmphiName_LikeSearch(String amphiName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAmphiName_LikeSearch(amphiName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMPHI_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setAmphiName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param amphiName The value of amphiName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAmphiName_LikeSearch(String amphiName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(amphiName), xgetCValueAmphiName(), "AMPHI_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMPHI_NAME: {NotNull, VARCHAR(200)}
     * @param amphiName The value of amphiName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAmphiName_NotLikeSearch(String amphiName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAmphiName_NotLikeSearch(amphiName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AMPHI_NAME: {NotNull, VARCHAR(200)}
     * @param amphiName The value of amphiName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAmphiName_NotLikeSearch(String amphiName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(amphiName), xgetCValueAmphiName(), "AMPHI_NAME", likeSearchOption);
    }

    protected void regAmphiName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmphiName(), "AMPHI_NAME"); }
    protected abstract ConditionValue xgetCValueAmphiName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_Equal(Integer baseId) {
        doSetBaseId_Equal(baseId);
    }

    protected void doSetBaseId_Equal(Integer baseId) {
        regBaseId(CK_EQ, baseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_NotEqual(Integer baseId) {
        doSetBaseId_NotEqual(baseId);
    }

    protected void doSetBaseId_NotEqual(Integer baseId) {
        regBaseId(CK_NES, baseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterThan(Integer baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessThan(Integer baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterEqual(Integer baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessEqual(Integer baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseIdList The collection of baseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_InScope(Collection<Integer> baseIdList) {
        doSetBaseId_InScope(baseIdList);
    }

    protected void doSetBaseId_InScope(Collection<Integer> baseIdList) {
        regINS(CK_INS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseIdList The collection of baseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_NotInScope(Collection<Integer> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Integer> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    protected void regBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseId(), "BASE_ID"); }
    protected abstract ConditionValue xgetCValueBaseId();

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
    public HpSLCFunction<WhiteBaseOne12AmphiCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne12AmphiCB.class);
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
    public HpSLCFunction<WhiteBaseOne12AmphiCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne12AmphiCB.class);
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
    public HpSLCFunction<WhiteBaseOne12AmphiCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne12AmphiCB.class);
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
    public HpSLCFunction<WhiteBaseOne12AmphiCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne12AmphiCB.class);
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
    public HpSLCFunction<WhiteBaseOne12AmphiCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne12AmphiCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne12AmphiCB&gt;() {
     *     public void query(WhiteBaseOne12AmphiCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne12AmphiCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne12AmphiCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne12AmphiCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne12AmphiCQ sq);

    protected WhiteBaseOne12AmphiCB xcreateScalarConditionCB() {
        WhiteBaseOne12AmphiCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne12AmphiCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne12AmphiCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne12AmphiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne12AmphiCB cb = new WhiteBaseOne12AmphiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "AMPHI_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne12AmphiCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne12AmphiCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne12AmphiCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne12AmphiCB cb = new WhiteBaseOne12AmphiCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "AMPHI_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne12AmphiCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne12AmphiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne12AmphiCB cb = new WhiteBaseOne12AmphiCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne12AmphiCQ sq);

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
    protected WhiteBaseOne12AmphiCB newMyCB() {
        return new WhiteBaseOne12AmphiCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne12AmphiCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
