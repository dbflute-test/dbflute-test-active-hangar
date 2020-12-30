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
 * The abstract condition-query of WHITE_BASE_ONE01_SEA_BROADWAY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne01SeaBroadwayCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne01SeaBroadwayCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE01_SEA_BROADWAY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayId The value of broadwayId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_Equal(Integer broadwayId) {
        doSetBroadwayId_Equal(broadwayId);
    }

    protected void doSetBroadwayId_Equal(Integer broadwayId) {
        regBroadwayId(CK_EQ, broadwayId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayId The value of broadwayId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_NotEqual(Integer broadwayId) {
        doSetBroadwayId_NotEqual(broadwayId);
    }

    protected void doSetBroadwayId_NotEqual(Integer broadwayId) {
        regBroadwayId(CK_NES, broadwayId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayId The value of broadwayId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_GreaterThan(Integer broadwayId) {
        regBroadwayId(CK_GT, broadwayId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayId The value of broadwayId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_LessThan(Integer broadwayId) {
        regBroadwayId(CK_LT, broadwayId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayId The value of broadwayId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_GreaterEqual(Integer broadwayId) {
        regBroadwayId(CK_GE, broadwayId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayId The value of broadwayId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_LessEqual(Integer broadwayId) {
        regBroadwayId(CK_LE, broadwayId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBroadwayId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBroadwayId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBroadwayId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBroadwayId(), "BROADWAY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayIdList The collection of broadwayId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBroadwayId_InScope(Collection<Integer> broadwayIdList) {
        doSetBroadwayId_InScope(broadwayIdList);
    }

    protected void doSetBroadwayId_InScope(Collection<Integer> broadwayIdList) {
        regINS(CK_INS, cTL(broadwayIdList), xgetCValueBroadwayId(), "BROADWAY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @param broadwayIdList The collection of broadwayId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBroadwayId_NotInScope(Collection<Integer> broadwayIdList) {
        doSetBroadwayId_NotInScope(broadwayIdList);
    }

    protected void doSetBroadwayId_NotInScope(Collection<Integer> broadwayIdList) {
        regINS(CK_NINS, cTL(broadwayIdList), xgetCValueBroadwayId(), "BROADWAY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BROADWAY_ID from WHITE_BASE_ONE01_SEA where ...)} <br>
     * WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteBaseOne01Sea</span>(seaCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     seaCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteBaseOne01SeaList for 'exists'. (NotNull)
     */
    public void existsWhiteBaseOne01Sea(SubQuery<WhiteBaseOne01SeaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBroadwayId_ExistsReferrer_WhiteBaseOne01SeaList(cb.query());
        registerExistsReferrer(cb.query(), "BROADWAY_ID", "BROADWAY_ID", pp, "whiteBaseOne01SeaList");
    }
    public abstract String keepBroadwayId_ExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BROADWAY_ID from WHITE_BASE_ONE01_SEA where ...)} <br>
     * WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBaseOne01Sea</span>(seaCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     seaCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BroadwayId_NotExistsReferrer_WhiteBaseOne01SeaList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBaseOne01Sea(SubQuery<WhiteBaseOne01SeaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBroadwayId_NotExistsReferrer_WhiteBaseOne01SeaList(cb.query());
        registerNotExistsReferrer(cb.query(), "BROADWAY_ID", "BROADWAY_ID", pp, "whiteBaseOne01SeaList");
    }
    public abstract String keepBroadwayId_NotExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);

    public void xsderiveWhiteBaseOne01SeaList(String fn, SubQuery<WhiteBaseOne01SeaCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBroadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BROADWAY_ID", "BROADWAY_ID", pp, "whiteBaseOne01SeaList", al, op);
    }
    public abstract String keepBroadwayId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE_ONE01_SEA where ...)} <br>
     * WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteBaseOne01Sea()</span>.<span style="color: #CC4747">max</span>(seaCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     seaCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     seaCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne01SeaCB> derivedWhiteBaseOne01Sea() {
        return xcreateQDRFunctionWhiteBaseOne01SeaList();
    }
    protected HpQDRFunction<WhiteBaseOne01SeaCB> xcreateQDRFunctionWhiteBaseOne01SeaList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteBaseOne01SeaList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteBaseOne01SeaList(String fn, SubQuery<WhiteBaseOne01SeaCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList(cb.query()); String prpp = keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BROADWAY_ID", "BROADWAY_ID", sqpp, "whiteBaseOne01SeaList", rd, vl, prpp, op);
    }
    public abstract String keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);
    public abstract String keepBroadwayId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setBroadwayId_IsNull() { regBroadwayId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setBroadwayId_IsNotNull() { regBroadwayId(CK_ISNN, DOBJ); }

    protected void regBroadwayId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBroadwayId(), "BROADWAY_ID"); }
    protected abstract ConditionValue xgetCValueBroadwayId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)}
     * @param broadwayName The value of broadwayName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBroadwayName_Equal(String broadwayName) {
        doSetBroadwayName_Equal(fRES(broadwayName));
    }

    protected void doSetBroadwayName_Equal(String broadwayName) {
        regBroadwayName(CK_EQ, broadwayName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setBroadwayName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param broadwayName The value of broadwayName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBroadwayName_LikeSearch(String broadwayName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBroadwayName_LikeSearch(broadwayName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setBroadwayName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param broadwayName The value of broadwayName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBroadwayName_LikeSearch(String broadwayName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(broadwayName), xgetCValueBroadwayName(), "BROADWAY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)}
     * @param broadwayName The value of broadwayName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBroadwayName_NotLikeSearch(String broadwayName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBroadwayName_NotLikeSearch(broadwayName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROADWAY_NAME: {NotNull, VARCHAR(200)}
     * @param broadwayName The value of broadwayName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBroadwayName_NotLikeSearch(String broadwayName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(broadwayName), xgetCValueBroadwayName(), "BROADWAY_NAME", likeSearchOption);
    }

    protected void regBroadwayName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBroadwayName(), "BROADWAY_NAME"); }
    protected abstract ConditionValue xgetCValueBroadwayName();

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
    public HpSLCFunction<WhiteBaseOne01SeaBroadwayCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne01SeaBroadwayCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaBroadwayCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne01SeaBroadwayCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaBroadwayCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne01SeaBroadwayCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaBroadwayCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne01SeaBroadwayCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaBroadwayCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne01SeaBroadwayCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne01SeaBroadwayCB&gt;() {
     *     public void query(WhiteBaseOne01SeaBroadwayCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne01SeaBroadwayCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne01SeaBroadwayCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaBroadwayCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne01SeaBroadwayCQ sq);

    protected WhiteBaseOne01SeaBroadwayCB xcreateScalarConditionCB() {
        WhiteBaseOne01SeaBroadwayCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne01SeaBroadwayCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne01SeaBroadwayCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne01SeaBroadwayCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaBroadwayCB cb = new WhiteBaseOne01SeaBroadwayCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BROADWAY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne01SeaBroadwayCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne01SeaBroadwayCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne01SeaBroadwayCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaBroadwayCB cb = new WhiteBaseOne01SeaBroadwayCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BROADWAY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne01SeaBroadwayCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne01SeaBroadwayCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaBroadwayCB cb = new WhiteBaseOne01SeaBroadwayCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne01SeaBroadwayCQ sq);

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
    protected WhiteBaseOne01SeaBroadwayCB newMyCB() {
        return new WhiteBaseOne01SeaBroadwayCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne01SeaBroadwayCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
