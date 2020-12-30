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
 * The abstract condition-query of WHITE_BASE_ONE11_CIRQUE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne11CirqueCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne11CirqueCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE11_CIRQUE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueId The value of cirqueId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCirqueId_Equal(Integer cirqueId) {
        doSetCirqueId_Equal(cirqueId);
    }

    protected void doSetCirqueId_Equal(Integer cirqueId) {
        regCirqueId(CK_EQ, cirqueId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueId The value of cirqueId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCirqueId_NotEqual(Integer cirqueId) {
        doSetCirqueId_NotEqual(cirqueId);
    }

    protected void doSetCirqueId_NotEqual(Integer cirqueId) {
        regCirqueId(CK_NES, cirqueId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueId The value of cirqueId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCirqueId_GreaterThan(Integer cirqueId) {
        regCirqueId(CK_GT, cirqueId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueId The value of cirqueId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCirqueId_LessThan(Integer cirqueId) {
        regCirqueId(CK_LT, cirqueId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueId The value of cirqueId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCirqueId_GreaterEqual(Integer cirqueId) {
        regCirqueId(CK_GE, cirqueId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueId The value of cirqueId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCirqueId_LessEqual(Integer cirqueId) {
        regCirqueId(CK_LE, cirqueId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of cirqueId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cirqueId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCirqueId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCirqueId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of cirqueId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cirqueId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCirqueId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCirqueId(), "CIRQUE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueIdList The collection of cirqueId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCirqueId_InScope(Collection<Integer> cirqueIdList) {
        doSetCirqueId_InScope(cirqueIdList);
    }

    protected void doSetCirqueId_InScope(Collection<Integer> cirqueIdList) {
        regINS(CK_INS, cTL(cirqueIdList), xgetCValueCirqueId(), "CIRQUE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param cirqueIdList The collection of cirqueId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCirqueId_NotInScope(Collection<Integer> cirqueIdList) {
        doSetCirqueId_NotInScope(cirqueIdList);
    }

    protected void doSetCirqueId_NotInScope(Collection<Integer> cirqueIdList) {
        regINS(CK_NINS, cTL(cirqueIdList), xgetCValueCirqueId(), "CIRQUE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     */
    public void setCirqueId_IsNull() { regCirqueId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     */
    public void setCirqueId_IsNotNull() { regCirqueId(CK_ISNN, DOBJ); }

    protected void regCirqueId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCirqueId(), "CIRQUE_ID"); }
    protected abstract ConditionValue xgetCValueCirqueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)}
     * @param cirqueName The value of cirqueName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCirqueName_Equal(String cirqueName) {
        doSetCirqueName_Equal(fRES(cirqueName));
    }

    protected void doSetCirqueName_Equal(String cirqueName) {
        regCirqueName(CK_EQ, cirqueName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCirqueName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cirqueName The value of cirqueName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCirqueName_LikeSearch(String cirqueName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCirqueName_LikeSearch(cirqueName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCirqueName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cirqueName The value of cirqueName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCirqueName_LikeSearch(String cirqueName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cirqueName), xgetCValueCirqueName(), "CIRQUE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)}
     * @param cirqueName The value of cirqueName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCirqueName_NotLikeSearch(String cirqueName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCirqueName_NotLikeSearch(cirqueName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CIRQUE_NAME: {NotNull, VARCHAR(200)}
     * @param cirqueName The value of cirqueName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCirqueName_NotLikeSearch(String cirqueName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cirqueName), xgetCValueCirqueName(), "CIRQUE_NAME", likeSearchOption);
    }

    protected void regCirqueName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCirqueName(), "CIRQUE_NAME"); }
    protected abstract ConditionValue xgetCValueCirqueName();

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
    public HpSLCFunction<WhiteBaseOne11CirqueCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne11CirqueCB.class);
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
    public HpSLCFunction<WhiteBaseOne11CirqueCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne11CirqueCB.class);
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
    public HpSLCFunction<WhiteBaseOne11CirqueCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne11CirqueCB.class);
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
    public HpSLCFunction<WhiteBaseOne11CirqueCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne11CirqueCB.class);
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
    public HpSLCFunction<WhiteBaseOne11CirqueCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne11CirqueCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne11CirqueCB&gt;() {
     *     public void query(WhiteBaseOne11CirqueCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne11CirqueCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne11CirqueCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne11CirqueCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne11CirqueCQ sq);

    protected WhiteBaseOne11CirqueCB xcreateScalarConditionCB() {
        WhiteBaseOne11CirqueCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne11CirqueCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne11CirqueCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne11CirqueCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne11CirqueCB cb = new WhiteBaseOne11CirqueCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CIRQUE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne11CirqueCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne11CirqueCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne11CirqueCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne11CirqueCB cb = new WhiteBaseOne11CirqueCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CIRQUE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne11CirqueCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne11CirqueCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne11CirqueCB cb = new WhiteBaseOne11CirqueCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne11CirqueCQ sq);

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
    protected WhiteBaseOne11CirqueCB newMyCB() {
        return new WhiteBaseOne11CirqueCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne11CirqueCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
