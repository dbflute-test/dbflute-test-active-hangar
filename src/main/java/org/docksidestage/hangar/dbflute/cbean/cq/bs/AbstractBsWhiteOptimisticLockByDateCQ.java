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
 * The abstract condition-query of WHITE_OPTIMISTIC_LOCK_BY_DATE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOptimisticLockByDateCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOptimisticLockByDateCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_OPTIMISTIC_LOCK_BY_DATE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateId The value of byDateId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setByDateId_Equal(Long byDateId) {
        doSetByDateId_Equal(byDateId);
    }

    protected void doSetByDateId_Equal(Long byDateId) {
        regByDateId(CK_EQ, byDateId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateId The value of byDateId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setByDateId_NotEqual(Long byDateId) {
        doSetByDateId_NotEqual(byDateId);
    }

    protected void doSetByDateId_NotEqual(Long byDateId) {
        regByDateId(CK_NES, byDateId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateId The value of byDateId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setByDateId_GreaterThan(Long byDateId) {
        regByDateId(CK_GT, byDateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateId The value of byDateId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setByDateId_LessThan(Long byDateId) {
        regByDateId(CK_LT, byDateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateId The value of byDateId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setByDateId_GreaterEqual(Long byDateId) {
        regByDateId(CK_GE, byDateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateId The value of byDateId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setByDateId_LessEqual(Long byDateId) {
        regByDateId(CK_LE, byDateId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of byDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of byDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setByDateId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setByDateId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of byDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of byDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setByDateId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueByDateId(), "BY_DATE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateIdList The collection of byDateId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setByDateId_InScope(Collection<Long> byDateIdList) {
        doSetByDateId_InScope(byDateIdList);
    }

    protected void doSetByDateId_InScope(Collection<Long> byDateIdList) {
        regINS(CK_INS, cTL(byDateIdList), xgetCValueByDateId(), "BY_DATE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param byDateIdList The collection of byDateId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setByDateId_NotInScope(Collection<Long> byDateIdList) {
        doSetByDateId_NotInScope(byDateIdList);
    }

    protected void doSetByDateId_NotInScope(Collection<Long> byDateIdList) {
        regINS(CK_NINS, cTL(byDateIdList), xgetCValueByDateId(), "BY_DATE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setByDateId_IsNull() { regByDateId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setByDateId_IsNotNull() { regByDateId(CK_ISNN, DOBJ); }

    protected void regByDateId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueByDateId(), "BY_DATE_ID"); }
    protected abstract ConditionValue xgetCValueByDateId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BY_DATE_NAME: {NotNull, VARCHAR(100)}
     * @param byDateName The value of byDateName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setByDateName_Equal(String byDateName) {
        doSetByDateName_Equal(fRES(byDateName));
    }

    protected void doSetByDateName_Equal(String byDateName) {
        regByDateName(CK_EQ, byDateName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BY_DATE_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setByDateName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param byDateName The value of byDateName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setByDateName_LikeSearch(String byDateName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setByDateName_LikeSearch(byDateName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BY_DATE_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setByDateName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param byDateName The value of byDateName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setByDateName_LikeSearch(String byDateName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(byDateName), xgetCValueByDateName(), "BY_DATE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BY_DATE_NAME: {NotNull, VARCHAR(100)}
     * @param byDateName The value of byDateName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setByDateName_NotLikeSearch(String byDateName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setByDateName_NotLikeSearch(byDateName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BY_DATE_NAME: {NotNull, VARCHAR(100)}
     * @param byDateName The value of byDateName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setByDateName_NotLikeSearch(String byDateName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(byDateName), xgetCValueByDateName(), "BY_DATE_NAME", likeSearchOption);
    }

    protected void regByDateName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueByDateName(), "BY_DATE_NAME"); }
    protected abstract ConditionValue xgetCValueByDateName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDate The value of updateDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_Equal(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_EQ,  updateDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDate The value of updateDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_GreaterThan(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_GT,  updateDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDate The value of updateDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_LessThan(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_LT,  updateDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDate The value of updateDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_GreaterEqual(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_GE,  updateDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDate The value of updateDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDate_LessEqual(java.time.LocalDateTime updateDate) {
        regUpdateDate(CK_LE, updateDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setUpdateDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setUpdateDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDate(), nm, op);
    }

    protected void regUpdateDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDate(), "UPDATE_DATE"); }
    protected abstract ConditionValue xgetCValueUpdateDate();

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
    public HpSLCFunction<WhiteOptimisticLockByDateCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteOptimisticLockByDateCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockByDateCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteOptimisticLockByDateCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockByDateCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteOptimisticLockByDateCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockByDateCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteOptimisticLockByDateCB.class);
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
    public HpSLCFunction<WhiteOptimisticLockByDateCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteOptimisticLockByDateCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOptimisticLockByDateCB&gt;() {
     *     public void query(WhiteOptimisticLockByDateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOptimisticLockByDateCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteOptimisticLockByDateCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOptimisticLockByDateCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteOptimisticLockByDateCQ sq);

    protected WhiteOptimisticLockByDateCB xcreateScalarConditionCB() {
        WhiteOptimisticLockByDateCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOptimisticLockByDateCB xcreateScalarConditionPartitionByCB() {
        WhiteOptimisticLockByDateCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOptimisticLockByDateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOptimisticLockByDateCB cb = new WhiteOptimisticLockByDateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BY_DATE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOptimisticLockByDateCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOptimisticLockByDateCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOptimisticLockByDateCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOptimisticLockByDateCB cb = new WhiteOptimisticLockByDateCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BY_DATE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOptimisticLockByDateCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOptimisticLockByDateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOptimisticLockByDateCB cb = new WhiteOptimisticLockByDateCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOptimisticLockByDateCQ sq);

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
    protected WhiteOptimisticLockByDateCB newMyCB() {
        return new WhiteOptimisticLockByDateCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOptimisticLockByDateCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
