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
 * The abstract condition-query of WHITE_BASE_ONE01_SEA_DOCKSIDE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne01SeaDocksideCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne01SeaDocksideCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE01_SEA_DOCKSIDE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideId The value of docksideId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_Equal(Integer docksideId) {
        doSetDocksideId_Equal(docksideId);
    }

    protected void doSetDocksideId_Equal(Integer docksideId) {
        regDocksideId(CK_EQ, docksideId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideId The value of docksideId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_NotEqual(Integer docksideId) {
        doSetDocksideId_NotEqual(docksideId);
    }

    protected void doSetDocksideId_NotEqual(Integer docksideId) {
        regDocksideId(CK_NES, docksideId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideId The value of docksideId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_GreaterThan(Integer docksideId) {
        regDocksideId(CK_GT, docksideId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideId The value of docksideId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_LessThan(Integer docksideId) {
        regDocksideId(CK_LT, docksideId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideId The value of docksideId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_GreaterEqual(Integer docksideId) {
        regDocksideId(CK_GE, docksideId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideId The value of docksideId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_LessEqual(Integer docksideId) {
        regDocksideId(CK_LE, docksideId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDocksideId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDocksideId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDocksideId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDocksideId(), "DOCKSIDE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideIdList The collection of docksideId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocksideId_InScope(Collection<Integer> docksideIdList) {
        doSetDocksideId_InScope(docksideIdList);
    }

    protected void doSetDocksideId_InScope(Collection<Integer> docksideIdList) {
        regINS(CK_INS, cTL(docksideIdList), xgetCValueDocksideId(), "DOCKSIDE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param docksideIdList The collection of docksideId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocksideId_NotInScope(Collection<Integer> docksideIdList) {
        doSetDocksideId_NotInScope(docksideIdList);
    }

    protected void doSetDocksideId_NotInScope(Collection<Integer> docksideIdList) {
        regINS(CK_NINS, cTL(docksideIdList), xgetCValueDocksideId(), "DOCKSIDE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DOCKSIDE_ID from WHITE_BASE_ONE01_SEA where ...)} <br>
     * WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDocksideId_ExistsReferrer_WhiteBaseOne01SeaList(cb.query());
        registerExistsReferrer(cb.query(), "DOCKSIDE_ID", "DOCKSIDE_ID", pp, "whiteBaseOne01SeaList");
    }
    public abstract String keepDocksideId_ExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DOCKSIDE_ID from WHITE_BASE_ONE01_SEA where ...)} <br>
     * WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBaseOne01Sea</span>(seaCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     seaCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DocksideId_NotExistsReferrer_WhiteBaseOne01SeaList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBaseOne01Sea(SubQuery<WhiteBaseOne01SeaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDocksideId_NotExistsReferrer_WhiteBaseOne01SeaList(cb.query());
        registerNotExistsReferrer(cb.query(), "DOCKSIDE_ID", "DOCKSIDE_ID", pp, "whiteBaseOne01SeaList");
    }
    public abstract String keepDocksideId_NotExistsReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);

    public void xsderiveWhiteBaseOne01SeaList(String fn, SubQuery<WhiteBaseOne01SeaCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDocksideId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DOCKSIDE_ID", "DOCKSIDE_ID", pp, "whiteBaseOne01SeaList", al, op);
    }
    public abstract String keepDocksideId_SpecifyDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE_ONE01_SEA where ...)} <br>
     * WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList(cb.query()); String prpp = keepDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DOCKSIDE_ID", "DOCKSIDE_ID", sqpp, "whiteBaseOne01SeaList", rd, vl, prpp, op);
    }
    public abstract String keepDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaList(WhiteBaseOne01SeaCQ sq);
    public abstract String keepDocksideId_QueryDerivedReferrer_WhiteBaseOne01SeaListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setDocksideId_IsNull() { regDocksideId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setDocksideId_IsNotNull() { regDocksideId(CK_ISNN, DOBJ); }

    protected void regDocksideId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDocksideId(), "DOCKSIDE_ID"); }
    protected abstract ConditionValue xgetCValueDocksideId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param docksideName The value of docksideName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocksideName_Equal(String docksideName) {
        doSetDocksideName_Equal(fRES(docksideName));
    }

    protected void doSetDocksideName_Equal(String docksideName) {
        regDocksideName(CK_EQ, docksideName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDocksideName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param docksideName The value of docksideName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDocksideName_LikeSearch(String docksideName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDocksideName_LikeSearch(docksideName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDocksideName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param docksideName The value of docksideName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDocksideName_LikeSearch(String docksideName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(docksideName), xgetCValueDocksideName(), "DOCKSIDE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param docksideName The value of docksideName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDocksideName_NotLikeSearch(String docksideName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDocksideName_NotLikeSearch(docksideName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DOCKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param docksideName The value of docksideName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDocksideName_NotLikeSearch(String docksideName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(docksideName), xgetCValueDocksideName(), "DOCKSIDE_NAME", likeSearchOption);
    }

    protected void regDocksideName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDocksideName(), "DOCKSIDE_NAME"); }
    protected abstract ConditionValue xgetCValueDocksideName();

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
    public HpSLCFunction<WhiteBaseOne01SeaDocksideCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne01SeaDocksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaDocksideCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne01SeaDocksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaDocksideCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne01SeaDocksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaDocksideCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne01SeaDocksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaDocksideCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne01SeaDocksideCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne01SeaDocksideCB&gt;() {
     *     public void query(WhiteBaseOne01SeaDocksideCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne01SeaDocksideCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne01SeaDocksideCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaDocksideCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne01SeaDocksideCQ sq);

    protected WhiteBaseOne01SeaDocksideCB xcreateScalarConditionCB() {
        WhiteBaseOne01SeaDocksideCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne01SeaDocksideCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne01SeaDocksideCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne01SeaDocksideCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaDocksideCB cb = new WhiteBaseOne01SeaDocksideCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DOCKSIDE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne01SeaDocksideCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne01SeaDocksideCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne01SeaDocksideCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaDocksideCB cb = new WhiteBaseOne01SeaDocksideCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DOCKSIDE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne01SeaDocksideCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne01SeaDocksideCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaDocksideCB cb = new WhiteBaseOne01SeaDocksideCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne01SeaDocksideCQ sq);

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
    protected WhiteBaseOne01SeaDocksideCB newMyCB() {
        return new WhiteBaseOne01SeaDocksideCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne01SeaDocksideCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
