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
 * The abstract condition-query of WHITE_READ_ONLY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteReadOnlyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteReadOnlyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_READ_ONLY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyId The value of readOnlyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReadOnlyId_Equal(Long readOnlyId) {
        doSetReadOnlyId_Equal(readOnlyId);
    }

    protected void doSetReadOnlyId_Equal(Long readOnlyId) {
        regReadOnlyId(CK_EQ, readOnlyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyId The value of readOnlyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReadOnlyId_NotEqual(Long readOnlyId) {
        doSetReadOnlyId_NotEqual(readOnlyId);
    }

    protected void doSetReadOnlyId_NotEqual(Long readOnlyId) {
        regReadOnlyId(CK_NES, readOnlyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyId The value of readOnlyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReadOnlyId_GreaterThan(Long readOnlyId) {
        regReadOnlyId(CK_GT, readOnlyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyId The value of readOnlyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReadOnlyId_LessThan(Long readOnlyId) {
        regReadOnlyId(CK_LT, readOnlyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyId The value of readOnlyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReadOnlyId_GreaterEqual(Long readOnlyId) {
        regReadOnlyId(CK_GE, readOnlyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyId The value of readOnlyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReadOnlyId_LessEqual(Long readOnlyId) {
        regReadOnlyId(CK_LE, readOnlyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of readOnlyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of readOnlyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReadOnlyId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReadOnlyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of readOnlyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of readOnlyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReadOnlyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReadOnlyId(), "READ_ONLY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyIdList The collection of readOnlyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadOnlyId_InScope(Collection<Long> readOnlyIdList) {
        doSetReadOnlyId_InScope(readOnlyIdList);
    }

    protected void doSetReadOnlyId_InScope(Collection<Long> readOnlyIdList) {
        regINS(CK_INS, cTL(readOnlyIdList), xgetCValueReadOnlyId(), "READ_ONLY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     * @param readOnlyIdList The collection of readOnlyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadOnlyId_NotInScope(Collection<Long> readOnlyIdList) {
        doSetReadOnlyId_NotInScope(readOnlyIdList);
    }

    protected void doSetReadOnlyId_NotInScope(Collection<Long> readOnlyIdList) {
        regINS(CK_NINS, cTL(readOnlyIdList), xgetCValueReadOnlyId(), "READ_ONLY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setReadOnlyId_IsNull() { regReadOnlyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * READ_ONLY_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setReadOnlyId_IsNotNull() { regReadOnlyId(CK_ISNN, DOBJ); }

    protected void regReadOnlyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReadOnlyId(), "READ_ONLY_ID"); }
    protected abstract ConditionValue xgetCValueReadOnlyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * READ_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param readOnlyName The value of readOnlyName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReadOnlyName_Equal(String readOnlyName) {
        doSetReadOnlyName_Equal(fRES(readOnlyName));
    }

    protected void doSetReadOnlyName_Equal(String readOnlyName) {
        regReadOnlyName(CK_EQ, readOnlyName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_ONLY_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setReadOnlyName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param readOnlyName The value of readOnlyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReadOnlyName_LikeSearch(String readOnlyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReadOnlyName_LikeSearch(readOnlyName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_ONLY_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setReadOnlyName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param readOnlyName The value of readOnlyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setReadOnlyName_LikeSearch(String readOnlyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(readOnlyName), xgetCValueReadOnlyName(), "READ_ONLY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param readOnlyName The value of readOnlyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReadOnlyName_NotLikeSearch(String readOnlyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReadOnlyName_NotLikeSearch(readOnlyName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * READ_ONLY_NAME: {NotNull, VARCHAR(200)}
     * @param readOnlyName The value of readOnlyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setReadOnlyName_NotLikeSearch(String readOnlyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(readOnlyName), xgetCValueReadOnlyName(), "READ_ONLY_NAME", likeSearchOption);
    }

    protected void regReadOnlyName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReadOnlyName(), "READ_ONLY_NAME"); }
    protected abstract ConditionValue xgetCValueReadOnlyName();

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
    public HpSLCFunction<WhiteReadOnlyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteReadOnlyCB.class);
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
    public HpSLCFunction<WhiteReadOnlyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteReadOnlyCB.class);
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
    public HpSLCFunction<WhiteReadOnlyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteReadOnlyCB.class);
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
    public HpSLCFunction<WhiteReadOnlyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteReadOnlyCB.class);
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
    public HpSLCFunction<WhiteReadOnlyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteReadOnlyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteReadOnlyCB&gt;() {
     *     public void query(WhiteReadOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteReadOnlyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteReadOnlyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteReadOnlyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteReadOnlyCQ sq);

    protected WhiteReadOnlyCB xcreateScalarConditionCB() {
        WhiteReadOnlyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteReadOnlyCB xcreateScalarConditionPartitionByCB() {
        WhiteReadOnlyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteReadOnlyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteReadOnlyCB cb = new WhiteReadOnlyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "READ_ONLY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteReadOnlyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteReadOnlyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteReadOnlyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteReadOnlyCB cb = new WhiteReadOnlyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "READ_ONLY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteReadOnlyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteReadOnlyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteReadOnlyCB cb = new WhiteReadOnlyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteReadOnlyCQ sq);

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
    protected WhiteReadOnlyCB newMyCB() {
        return new WhiteReadOnlyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteReadOnlyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
