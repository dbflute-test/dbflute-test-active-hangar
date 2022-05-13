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
 * The abstract condition-query of WHITE_FIRST_DATE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteFirstDateCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteFirstDateCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_FIRST_DATE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateId The value of firstDateId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstDateId_Equal(Long firstDateId) {
        doSetFirstDateId_Equal(firstDateId);
    }

    protected void doSetFirstDateId_Equal(Long firstDateId) {
        regFirstDateId(CK_EQ, firstDateId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateId The value of firstDateId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstDateId_NotEqual(Long firstDateId) {
        doSetFirstDateId_NotEqual(firstDateId);
    }

    protected void doSetFirstDateId_NotEqual(Long firstDateId) {
        regFirstDateId(CK_NES, firstDateId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateId The value of firstDateId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstDateId_GreaterThan(Long firstDateId) {
        regFirstDateId(CK_GT, firstDateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateId The value of firstDateId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstDateId_LessThan(Long firstDateId) {
        regFirstDateId(CK_LT, firstDateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateId The value of firstDateId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstDateId_GreaterEqual(Long firstDateId) {
        regFirstDateId(CK_GE, firstDateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateId The value of firstDateId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFirstDateId_LessEqual(Long firstDateId) {
        regFirstDateId(CK_LE, firstDateId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of firstDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of firstDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFirstDateId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFirstDateId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of firstDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of firstDateId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFirstDateId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFirstDateId(), "FIRST_DATE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateIdList The collection of firstDateId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstDateId_InScope(Collection<Long> firstDateIdList) {
        doSetFirstDateId_InScope(firstDateIdList);
    }

    protected void doSetFirstDateId_InScope(Collection<Long> firstDateIdList) {
        regINS(CK_INS, cTL(firstDateIdList), xgetCValueFirstDateId(), "FIRST_DATE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @param firstDateIdList The collection of firstDateId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstDateId_NotInScope(Collection<Long> firstDateIdList) {
        doSetFirstDateId_NotInScope(firstDateIdList);
    }

    protected void doSetFirstDateId_NotInScope(Collection<Long> firstDateIdList) {
        regINS(CK_NINS, cTL(firstDateIdList), xgetCValueFirstDateId(), "FIRST_DATE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setFirstDateId_IsNull() { regFirstDateId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setFirstDateId_IsNotNull() { regFirstDateId(CK_ISNN, DOBJ); }

    protected void regFirstDateId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstDateId(), "FIRST_DATE_ID"); }
    protected abstract ConditionValue xgetCValueFirstDateId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRST_DATE_NAME: {NotNull, VARCHAR(200)}
     * @param firstDateName The value of firstDateName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstDateName_Equal(String firstDateName) {
        doSetFirstDateName_Equal(fRES(firstDateName));
    }

    protected void doSetFirstDateName_Equal(String firstDateName) {
        regFirstDateName(CK_EQ, firstDateName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_DATE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFirstDateName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param firstDateName The value of firstDateName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstDateName_LikeSearch(String firstDateName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstDateName_LikeSearch(firstDateName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_DATE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFirstDateName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstDateName The value of firstDateName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFirstDateName_LikeSearch(String firstDateName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstDateName), xgetCValueFirstDateName(), "FIRST_DATE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_DATE_NAME: {NotNull, VARCHAR(200)}
     * @param firstDateName The value of firstDateName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstDateName_NotLikeSearch(String firstDateName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstDateName_NotLikeSearch(firstDateName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRST_DATE_NAME: {NotNull, VARCHAR(200)}
     * @param firstDateName The value of firstDateName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFirstDateName_NotLikeSearch(String firstDateName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstDateName), xgetCValueFirstDateName(), "FIRST_DATE_NAME", likeSearchOption);
    }

    protected void regFirstDateName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstDateName(), "FIRST_DATE_NAME"); }
    protected abstract ConditionValue xgetCValueFirstDateName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * @param addedAtTableSameDate The value of addedAtTableSameDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddedAtTableSameDate_Equal(java.time.LocalDate addedAtTableSameDate) {
        regAddedAtTableSameDate(CK_EQ,  addedAtTableSameDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * @param addedAtTableSameDate The value of addedAtTableSameDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddedAtTableSameDate_GreaterThan(java.time.LocalDate addedAtTableSameDate) {
        regAddedAtTableSameDate(CK_GT,  addedAtTableSameDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * @param addedAtTableSameDate The value of addedAtTableSameDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddedAtTableSameDate_LessThan(java.time.LocalDate addedAtTableSameDate) {
        regAddedAtTableSameDate(CK_LT,  addedAtTableSameDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * @param addedAtTableSameDate The value of addedAtTableSameDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddedAtTableSameDate_GreaterEqual(java.time.LocalDate addedAtTableSameDate) {
        regAddedAtTableSameDate(CK_GE,  addedAtTableSameDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * @param addedAtTableSameDate The value of addedAtTableSameDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddedAtTableSameDate_LessEqual(java.time.LocalDate addedAtTableSameDate) {
        regAddedAtTableSameDate(CK_LE, addedAtTableSameDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setAddedAtTableSameDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of addedAtTableSameDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of addedAtTableSameDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAddedAtTableSameDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAddedAtTableSameDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setAddedAtTableSameDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of addedAtTableSameDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of addedAtTableSameDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAddedAtTableSameDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "ADDED_AT_TABLE_SAME_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAddedAtTableSameDate(), nm, op);
    }

    protected void regAddedAtTableSameDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddedAtTableSameDate(), "ADDED_AT_TABLE_SAME_DATE"); }
    protected abstract ConditionValue xgetCValueAddedAtTableSameDate();

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
    public HpSLCFunction<WhiteFirstDateCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteFirstDateCB.class);
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
    public HpSLCFunction<WhiteFirstDateCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteFirstDateCB.class);
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
    public HpSLCFunction<WhiteFirstDateCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteFirstDateCB.class);
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
    public HpSLCFunction<WhiteFirstDateCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteFirstDateCB.class);
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
    public HpSLCFunction<WhiteFirstDateCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteFirstDateCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteFirstDateCB&gt;() {
     *     public void query(WhiteFirstDateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteFirstDateCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteFirstDateCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteFirstDateCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteFirstDateCQ sq);

    protected WhiteFirstDateCB xcreateScalarConditionCB() {
        WhiteFirstDateCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteFirstDateCB xcreateScalarConditionPartitionByCB() {
        WhiteFirstDateCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteFirstDateCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteFirstDateCB cb = new WhiteFirstDateCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FIRST_DATE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteFirstDateCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteFirstDateCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteFirstDateCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteFirstDateCB cb = new WhiteFirstDateCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FIRST_DATE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteFirstDateCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteFirstDateCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteFirstDateCB cb = new WhiteFirstDateCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteFirstDateCQ sq);

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
    protected WhiteFirstDateCB newMyCB() {
        return new WhiteFirstDateCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteFirstDateCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
