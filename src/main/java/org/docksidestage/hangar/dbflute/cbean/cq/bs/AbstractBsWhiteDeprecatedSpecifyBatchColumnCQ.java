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
 * The abstract condition-query of WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDeprecatedSpecifyBatchColumnCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDeprecatedSpecifyBatchColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnId The value of specifyBatchColumnId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_Equal(Long specifyBatchColumnId) {
        doSetSpecifyBatchColumnId_Equal(specifyBatchColumnId);
    }

    protected void doSetSpecifyBatchColumnId_Equal(Long specifyBatchColumnId) {
        regSpecifyBatchColumnId(CK_EQ, specifyBatchColumnId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnId The value of specifyBatchColumnId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_NotEqual(Long specifyBatchColumnId) {
        doSetSpecifyBatchColumnId_NotEqual(specifyBatchColumnId);
    }

    protected void doSetSpecifyBatchColumnId_NotEqual(Long specifyBatchColumnId) {
        regSpecifyBatchColumnId(CK_NES, specifyBatchColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnId The value of specifyBatchColumnId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_GreaterThan(Long specifyBatchColumnId) {
        regSpecifyBatchColumnId(CK_GT, specifyBatchColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnId The value of specifyBatchColumnId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_LessThan(Long specifyBatchColumnId) {
        regSpecifyBatchColumnId(CK_LT, specifyBatchColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnId The value of specifyBatchColumnId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_GreaterEqual(Long specifyBatchColumnId) {
        regSpecifyBatchColumnId(CK_GE, specifyBatchColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnId The value of specifyBatchColumnId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_LessEqual(Long specifyBatchColumnId) {
        regSpecifyBatchColumnId(CK_LE, specifyBatchColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of specifyBatchColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of specifyBatchColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSpecifyBatchColumnId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSpecifyBatchColumnId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of specifyBatchColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of specifyBatchColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSpecifyBatchColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpecifyBatchColumnId(), "SPECIFY_BATCH_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnIdList The collection of specifyBatchColumnId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_InScope(Collection<Long> specifyBatchColumnIdList) {
        doSetSpecifyBatchColumnId_InScope(specifyBatchColumnIdList);
    }

    protected void doSetSpecifyBatchColumnId_InScope(Collection<Long> specifyBatchColumnIdList) {
        regINS(CK_INS, cTL(specifyBatchColumnIdList), xgetCValueSpecifyBatchColumnId(), "SPECIFY_BATCH_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     * @param specifyBatchColumnIdList The collection of specifyBatchColumnId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnId_NotInScope(Collection<Long> specifyBatchColumnIdList) {
        doSetSpecifyBatchColumnId_NotInScope(specifyBatchColumnIdList);
    }

    protected void doSetSpecifyBatchColumnId_NotInScope(Collection<Long> specifyBatchColumnIdList) {
        regINS(CK_NINS, cTL(specifyBatchColumnIdList), xgetCValueSpecifyBatchColumnId(), "SPECIFY_BATCH_COLUMN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSpecifyBatchColumnId_IsNull() { regSpecifyBatchColumnId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setSpecifyBatchColumnId_IsNotNull() { regSpecifyBatchColumnId(CK_ISNN, DOBJ); }

    protected void regSpecifyBatchColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyBatchColumnId(), "SPECIFY_BATCH_COLUMN_ID"); }
    protected abstract ConditionValue xgetCValueSpecifyBatchColumnId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)}
     * @param specifyBatchColumnName The value of specifyBatchColumnName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyBatchColumnName_Equal(String specifyBatchColumnName) {
        doSetSpecifyBatchColumnName_Equal(fRES(specifyBatchColumnName));
    }

    protected void doSetSpecifyBatchColumnName_Equal(String specifyBatchColumnName) {
        regSpecifyBatchColumnName(CK_EQ, specifyBatchColumnName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSpecifyBatchColumnName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param specifyBatchColumnName The value of specifyBatchColumnName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSpecifyBatchColumnName_LikeSearch(String specifyBatchColumnName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSpecifyBatchColumnName_LikeSearch(specifyBatchColumnName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSpecifyBatchColumnName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyBatchColumnName The value of specifyBatchColumnName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSpecifyBatchColumnName_LikeSearch(String specifyBatchColumnName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyBatchColumnName), xgetCValueSpecifyBatchColumnName(), "SPECIFY_BATCH_COLUMN_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)}
     * @param specifyBatchColumnName The value of specifyBatchColumnName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSpecifyBatchColumnName_NotLikeSearch(String specifyBatchColumnName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSpecifyBatchColumnName_NotLikeSearch(specifyBatchColumnName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)}
     * @param specifyBatchColumnName The value of specifyBatchColumnName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSpecifyBatchColumnName_NotLikeSearch(String specifyBatchColumnName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyBatchColumnName), xgetCValueSpecifyBatchColumnName(), "SPECIFY_BATCH_COLUMN_NAME", likeSearchOption);
    }

    protected void regSpecifyBatchColumnName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyBatchColumnName(), "SPECIFY_BATCH_COLUMN_NAME"); }
    protected abstract ConditionValue xgetCValueSpecifyBatchColumnName();

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
    public HpSLCFunction<WhiteDeprecatedSpecifyBatchColumnCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDeprecatedSpecifyBatchColumnCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSpecifyBatchColumnCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDeprecatedSpecifyBatchColumnCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSpecifyBatchColumnCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDeprecatedSpecifyBatchColumnCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSpecifyBatchColumnCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDeprecatedSpecifyBatchColumnCB.class);
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
    public HpSLCFunction<WhiteDeprecatedSpecifyBatchColumnCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDeprecatedSpecifyBatchColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedSpecifyBatchColumnCB&gt;() {
     *     public void query(WhiteDeprecatedSpecifyBatchColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDeprecatedSpecifyBatchColumnCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDeprecatedSpecifyBatchColumnCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedSpecifyBatchColumnCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDeprecatedSpecifyBatchColumnCQ sq);

    protected WhiteDeprecatedSpecifyBatchColumnCB xcreateScalarConditionCB() {
        WhiteDeprecatedSpecifyBatchColumnCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDeprecatedSpecifyBatchColumnCB xcreateScalarConditionPartitionByCB() {
        WhiteDeprecatedSpecifyBatchColumnCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDeprecatedSpecifyBatchColumnCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedSpecifyBatchColumnCB cb = new WhiteDeprecatedSpecifyBatchColumnCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SPECIFY_BATCH_COLUMN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDeprecatedSpecifyBatchColumnCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDeprecatedSpecifyBatchColumnCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDeprecatedSpecifyBatchColumnCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedSpecifyBatchColumnCB cb = new WhiteDeprecatedSpecifyBatchColumnCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SPECIFY_BATCH_COLUMN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDeprecatedSpecifyBatchColumnCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDeprecatedSpecifyBatchColumnCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDeprecatedSpecifyBatchColumnCB cb = new WhiteDeprecatedSpecifyBatchColumnCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDeprecatedSpecifyBatchColumnCQ sq);

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
    protected WhiteDeprecatedSpecifyBatchColumnCB newMyCB() {
        return new WhiteDeprecatedSpecifyBatchColumnCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDeprecatedSpecifyBatchColumnCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
