/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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
 * The abstract condition-query of WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOptimisticLockExceptVersionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOptimisticLockExceptVersionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionId The value of exceptVersionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExceptVersionId_Equal(Long exceptVersionId) {
        doSetExceptVersionId_Equal(exceptVersionId);
    }

    protected void doSetExceptVersionId_Equal(Long exceptVersionId) {
        regExceptVersionId(CK_EQ, exceptVersionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionId The value of exceptVersionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExceptVersionId_NotEqual(Long exceptVersionId) {
        doSetExceptVersionId_NotEqual(exceptVersionId);
    }

    protected void doSetExceptVersionId_NotEqual(Long exceptVersionId) {
        regExceptVersionId(CK_NES, exceptVersionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionId The value of exceptVersionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExceptVersionId_GreaterThan(Long exceptVersionId) {
        regExceptVersionId(CK_GT, exceptVersionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionId The value of exceptVersionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExceptVersionId_LessThan(Long exceptVersionId) {
        regExceptVersionId(CK_LT, exceptVersionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionId The value of exceptVersionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExceptVersionId_GreaterEqual(Long exceptVersionId) {
        regExceptVersionId(CK_GE, exceptVersionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionId The value of exceptVersionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExceptVersionId_LessEqual(Long exceptVersionId) {
        regExceptVersionId(CK_LE, exceptVersionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of exceptVersionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of exceptVersionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setExceptVersionId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setExceptVersionId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of exceptVersionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of exceptVersionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setExceptVersionId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExceptVersionId(), "EXCEPT_VERSION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionIdList The collection of exceptVersionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExceptVersionId_InScope(Collection<Long> exceptVersionIdList) {
        doSetExceptVersionId_InScope(exceptVersionIdList);
    }

    protected void doSetExceptVersionId_InScope(Collection<Long> exceptVersionIdList) {
        regINS(CK_INS, cTL(exceptVersionIdList), xgetCValueExceptVersionId(), "EXCEPT_VERSION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @param exceptVersionIdList The collection of exceptVersionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExceptVersionId_NotInScope(Collection<Long> exceptVersionIdList) {
        doSetExceptVersionId_NotInScope(exceptVersionIdList);
    }

    protected void doSetExceptVersionId_NotInScope(Collection<Long> exceptVersionIdList) {
        regINS(CK_NINS, cTL(exceptVersionIdList), xgetCValueExceptVersionId(), "EXCEPT_VERSION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setExceptVersionId_IsNull() { regExceptVersionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setExceptVersionId_IsNotNull() { regExceptVersionId(CK_ISNN, DOBJ); }

    protected void regExceptVersionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExceptVersionId(), "EXCEPT_VERSION_ID"); }
    protected abstract ConditionValue xgetCValueExceptVersionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)}
     * @param exceptVersionName The value of exceptVersionName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExceptVersionName_Equal(String exceptVersionName) {
        doSetExceptVersionName_Equal(fRES(exceptVersionName));
    }

    protected void doSetExceptVersionName_Equal(String exceptVersionName) {
        regExceptVersionName(CK_EQ, exceptVersionName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setExceptVersionName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param exceptVersionName The value of exceptVersionName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExceptVersionName_LikeSearch(String exceptVersionName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExceptVersionName_LikeSearch(exceptVersionName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setExceptVersionName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param exceptVersionName The value of exceptVersionName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setExceptVersionName_LikeSearch(String exceptVersionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(exceptVersionName), xgetCValueExceptVersionName(), "EXCEPT_VERSION_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)}
     * @param exceptVersionName The value of exceptVersionName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setExceptVersionName_NotLikeSearch(String exceptVersionName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setExceptVersionName_NotLikeSearch(exceptVersionName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)}
     * @param exceptVersionName The value of exceptVersionName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setExceptVersionName_NotLikeSearch(String exceptVersionName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(exceptVersionName), xgetCValueExceptVersionName(), "EXCEPT_VERSION_NAME", likeSearchOption);
    }

    protected void regExceptVersionName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExceptVersionName(), "EXCEPT_VERSION_NAME"); }
    protected abstract ConditionValue xgetCValueExceptVersionName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Long versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Long versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNoList The collection of versionNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNoList The collection of versionNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

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
    public HpSLCFunction<WhiteOptimisticLockExceptVersionCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteOptimisticLockExceptVersionCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockExceptVersionCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteOptimisticLockExceptVersionCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockExceptVersionCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteOptimisticLockExceptVersionCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockExceptVersionCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteOptimisticLockExceptVersionCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockExceptVersionCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteOptimisticLockExceptVersionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOptimisticLockExceptVersionCB&gt;() {
     *     public void query(WhiteOptimisticLockExceptVersionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOptimisticLockExceptVersionCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteOptimisticLockExceptVersionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOptimisticLockExceptVersionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteOptimisticLockExceptVersionCQ sq);

    protected WhiteOptimisticLockExceptVersionCB xcreateScalarConditionCB() {
        WhiteOptimisticLockExceptVersionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOptimisticLockExceptVersionCB xcreateScalarConditionPartitionByCB() {
        WhiteOptimisticLockExceptVersionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOptimisticLockExceptVersionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOptimisticLockExceptVersionCB cb = new WhiteOptimisticLockExceptVersionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "EXCEPT_VERSION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOptimisticLockExceptVersionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOptimisticLockExceptVersionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOptimisticLockExceptVersionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOptimisticLockExceptVersionCB cb = new WhiteOptimisticLockExceptVersionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "EXCEPT_VERSION_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOptimisticLockExceptVersionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOptimisticLockExceptVersionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOptimisticLockExceptVersionCB cb = new WhiteOptimisticLockExceptVersionCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOptimisticLockExceptVersionCQ sq);

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
    protected WhiteOptimisticLockExceptVersionCB newMyCB() {
        return new WhiteOptimisticLockExceptVersionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOptimisticLockExceptVersionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
