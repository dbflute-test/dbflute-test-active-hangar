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
 * The abstract condition-query of WHITE_SIMPLE_DTO_EXCEPT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSimpleDtoExceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSimpleDtoExceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_SIMPLE_DTO_EXCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptId The value of simpleDtoExceptId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_Equal(Long simpleDtoExceptId) {
        doSetSimpleDtoExceptId_Equal(simpleDtoExceptId);
    }

    protected void doSetSimpleDtoExceptId_Equal(Long simpleDtoExceptId) {
        regSimpleDtoExceptId(CK_EQ, simpleDtoExceptId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptId The value of simpleDtoExceptId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_NotEqual(Long simpleDtoExceptId) {
        doSetSimpleDtoExceptId_NotEqual(simpleDtoExceptId);
    }

    protected void doSetSimpleDtoExceptId_NotEqual(Long simpleDtoExceptId) {
        regSimpleDtoExceptId(CK_NES, simpleDtoExceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptId The value of simpleDtoExceptId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_GreaterThan(Long simpleDtoExceptId) {
        regSimpleDtoExceptId(CK_GT, simpleDtoExceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptId The value of simpleDtoExceptId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_LessThan(Long simpleDtoExceptId) {
        regSimpleDtoExceptId(CK_LT, simpleDtoExceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptId The value of simpleDtoExceptId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_GreaterEqual(Long simpleDtoExceptId) {
        regSimpleDtoExceptId(CK_GE, simpleDtoExceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptId The value of simpleDtoExceptId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_LessEqual(Long simpleDtoExceptId) {
        regSimpleDtoExceptId(CK_LE, simpleDtoExceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of simpleDtoExceptId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of simpleDtoExceptId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSimpleDtoExceptId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSimpleDtoExceptId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of simpleDtoExceptId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of simpleDtoExceptId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSimpleDtoExceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSimpleDtoExceptId(), "SIMPLE_DTO_EXCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptIdList The collection of simpleDtoExceptId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_InScope(Collection<Long> simpleDtoExceptIdList) {
        doSetSimpleDtoExceptId_InScope(simpleDtoExceptIdList);
    }

    protected void doSetSimpleDtoExceptId_InScope(Collection<Long> simpleDtoExceptIdList) {
        regINS(CK_INS, cTL(simpleDtoExceptIdList), xgetCValueSimpleDtoExceptId(), "SIMPLE_DTO_EXCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     * @param simpleDtoExceptIdList The collection of simpleDtoExceptId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptId_NotInScope(Collection<Long> simpleDtoExceptIdList) {
        doSetSimpleDtoExceptId_NotInScope(simpleDtoExceptIdList);
    }

    protected void doSetSimpleDtoExceptId_NotInScope(Collection<Long> simpleDtoExceptIdList) {
        regINS(CK_NINS, cTL(simpleDtoExceptIdList), xgetCValueSimpleDtoExceptId(), "SIMPLE_DTO_EXCEPT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSimpleDtoExceptId_IsNull() { regSimpleDtoExceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSimpleDtoExceptId_IsNotNull() { regSimpleDtoExceptId(CK_ISNN, DOBJ); }

    protected void regSimpleDtoExceptId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSimpleDtoExceptId(), "SIMPLE_DTO_EXCEPT_ID"); }
    protected abstract ConditionValue xgetCValueSimpleDtoExceptId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)}
     * @param simpleDtoExceptName The value of simpleDtoExceptName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSimpleDtoExceptName_Equal(String simpleDtoExceptName) {
        doSetSimpleDtoExceptName_Equal(fRES(simpleDtoExceptName));
    }

    protected void doSetSimpleDtoExceptName_Equal(String simpleDtoExceptName) {
        regSimpleDtoExceptName(CK_EQ, simpleDtoExceptName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSimpleDtoExceptName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param simpleDtoExceptName The value of simpleDtoExceptName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSimpleDtoExceptName_LikeSearch(String simpleDtoExceptName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSimpleDtoExceptName_LikeSearch(simpleDtoExceptName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSimpleDtoExceptName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param simpleDtoExceptName The value of simpleDtoExceptName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSimpleDtoExceptName_LikeSearch(String simpleDtoExceptName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(simpleDtoExceptName), xgetCValueSimpleDtoExceptName(), "SIMPLE_DTO_EXCEPT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)}
     * @param simpleDtoExceptName The value of simpleDtoExceptName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSimpleDtoExceptName_NotLikeSearch(String simpleDtoExceptName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSimpleDtoExceptName_NotLikeSearch(simpleDtoExceptName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)}
     * @param simpleDtoExceptName The value of simpleDtoExceptName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSimpleDtoExceptName_NotLikeSearch(String simpleDtoExceptName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(simpleDtoExceptName), xgetCValueSimpleDtoExceptName(), "SIMPLE_DTO_EXCEPT_NAME", likeSearchOption);
    }

    protected void regSimpleDtoExceptName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSimpleDtoExceptName(), "SIMPLE_DTO_EXCEPT_NAME"); }
    protected abstract ConditionValue xgetCValueSimpleDtoExceptName();

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
    public HpSLCFunction<WhiteSimpleDtoExceptCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSimpleDtoExceptCB.class);
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
    public HpSLCFunction<WhiteSimpleDtoExceptCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSimpleDtoExceptCB.class);
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
    public HpSLCFunction<WhiteSimpleDtoExceptCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSimpleDtoExceptCB.class);
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
    public HpSLCFunction<WhiteSimpleDtoExceptCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSimpleDtoExceptCB.class);
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
    public HpSLCFunction<WhiteSimpleDtoExceptCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSimpleDtoExceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSimpleDtoExceptCB&gt;() {
     *     public void query(WhiteSimpleDtoExceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSimpleDtoExceptCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSimpleDtoExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSimpleDtoExceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSimpleDtoExceptCQ sq);

    protected WhiteSimpleDtoExceptCB xcreateScalarConditionCB() {
        WhiteSimpleDtoExceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSimpleDtoExceptCB xcreateScalarConditionPartitionByCB() {
        WhiteSimpleDtoExceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSimpleDtoExceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSimpleDtoExceptCB cb = new WhiteSimpleDtoExceptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SIMPLE_DTO_EXCEPT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSimpleDtoExceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSimpleDtoExceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSimpleDtoExceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSimpleDtoExceptCB cb = new WhiteSimpleDtoExceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SIMPLE_DTO_EXCEPT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSimpleDtoExceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSimpleDtoExceptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSimpleDtoExceptCB cb = new WhiteSimpleDtoExceptCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSimpleDtoExceptCQ sq);

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
    protected WhiteSimpleDtoExceptCB newMyCB() {
        return new WhiteSimpleDtoExceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSimpleDtoExceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
