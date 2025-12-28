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
 * The abstract condition-query of WHITE_ZONE_ARRANGE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteZoneArrangeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteZoneArrangeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_ZONE_ARRANGE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeId The value of arrangeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArrangeId_Equal(Integer arrangeId) {
        doSetArrangeId_Equal(arrangeId);
    }

    protected void doSetArrangeId_Equal(Integer arrangeId) {
        regArrangeId(CK_EQ, arrangeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeId The value of arrangeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArrangeId_NotEqual(Integer arrangeId) {
        doSetArrangeId_NotEqual(arrangeId);
    }

    protected void doSetArrangeId_NotEqual(Integer arrangeId) {
        regArrangeId(CK_NES, arrangeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeId The value of arrangeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArrangeId_GreaterThan(Integer arrangeId) {
        regArrangeId(CK_GT, arrangeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeId The value of arrangeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArrangeId_LessThan(Integer arrangeId) {
        regArrangeId(CK_LT, arrangeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeId The value of arrangeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArrangeId_GreaterEqual(Integer arrangeId) {
        regArrangeId(CK_GE, arrangeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeId The value of arrangeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArrangeId_LessEqual(Integer arrangeId) {
        regArrangeId(CK_LE, arrangeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of arrangeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of arrangeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setArrangeId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setArrangeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of arrangeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of arrangeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArrangeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArrangeId(), "ARRANGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeIdList The collection of arrangeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrangeId_InScope(Collection<Integer> arrangeIdList) {
        doSetArrangeId_InScope(arrangeIdList);
    }

    protected void doSetArrangeId_InScope(Collection<Integer> arrangeIdList) {
        regINS(CK_INS, cTL(arrangeIdList), xgetCValueArrangeId(), "ARRANGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     * @param arrangeIdList The collection of arrangeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrangeId_NotInScope(Collection<Integer> arrangeIdList) {
        doSetArrangeId_NotInScope(arrangeIdList);
    }

    protected void doSetArrangeId_NotInScope(Collection<Integer> arrangeIdList) {
        regINS(CK_NINS, cTL(arrangeIdList), xgetCValueArrangeId(), "ARRANGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setArrangeId_IsNull() { regArrangeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRANGE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setArrangeId_IsNotNull() { regArrangeId(CK_ISNN, DOBJ); }

    protected void regArrangeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrangeId(), "ARRANGE_ID"); }
    protected abstract ConditionValue xgetCValueArrangeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRANGE_NAME: {NotNull, VARCHAR(200)}
     * @param arrangeName The value of arrangeName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrangeName_Equal(String arrangeName) {
        doSetArrangeName_Equal(fRES(arrangeName));
    }

    protected void doSetArrangeName_Equal(String arrangeName) {
        regArrangeName(CK_EQ, arrangeName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRANGE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setArrangeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param arrangeName The value of arrangeName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArrangeName_LikeSearch(String arrangeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArrangeName_LikeSearch(arrangeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRANGE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setArrangeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrangeName The value of arrangeName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArrangeName_LikeSearch(String arrangeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrangeName), xgetCValueArrangeName(), "ARRANGE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRANGE_NAME: {NotNull, VARCHAR(200)}
     * @param arrangeName The value of arrangeName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArrangeName_NotLikeSearch(String arrangeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArrangeName_NotLikeSearch(arrangeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRANGE_NAME: {NotNull, VARCHAR(200)}
     * @param arrangeName The value of arrangeName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArrangeName_NotLikeSearch(String arrangeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrangeName), xgetCValueArrangeName(), "ARRANGE_NAME", likeSearchOption);
    }

    protected void regArrangeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrangeName(), "ARRANGE_NAME"); }
    protected abstract ConditionValue xgetCValueArrangeName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param order The value of order as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrder_Equal(Integer order) {
        doSetOrder_Equal(order);
    }

    protected void doSetOrder_Equal(Integer order) {
        regOrder(CK_EQ, order);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param order The value of order as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrder_NotEqual(Integer order) {
        doSetOrder_NotEqual(order);
    }

    protected void doSetOrder_NotEqual(Integer order) {
        regOrder(CK_NES, order);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param order The value of order as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrder_GreaterThan(Integer order) {
        regOrder(CK_GT, order);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param order The value of order as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrder_LessThan(Integer order) {
        regOrder(CK_LT, order);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param order The value of order as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrder_GreaterEqual(Integer order) {
        regOrder(CK_GE, order);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param order The value of order as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrder_LessEqual(Integer order) {
        regOrder(CK_LE, order);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param minNumber The min number of order. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of order. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param minNumber The min number of order. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of order. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrder(), "ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param orderList The collection of order as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrder_InScope(Collection<Integer> orderList) {
        doSetOrder_InScope(orderList);
    }

    protected void doSetOrder_InScope(Collection<Integer> orderList) {
        regINS(CK_INS, cTL(orderList), xgetCValueOrder(), "ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER: {INTEGER(10)}
     * @param orderList The collection of order as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrder_NotInScope(Collection<Integer> orderList) {
        doSetOrder_NotInScope(orderList);
    }

    protected void doSetOrder_NotInScope(Collection<Integer> orderList) {
        regINS(CK_NINS, cTL(orderList), xgetCValueOrder(), "ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     */
    public void setOrder_IsNull() { regOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER: {INTEGER(10)}
     */
    public void setOrder_IsNotNull() { regOrder(CK_ISNN, DOBJ); }

    protected void regOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrder(), "ORDER"); }
    protected abstract ConditionValue xgetCValueOrder();

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
    public HpSLCFunction<WhiteZoneArrangeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteZoneArrangeCB.class);
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
    public HpSLCFunction<WhiteZoneArrangeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteZoneArrangeCB.class);
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
    public HpSLCFunction<WhiteZoneArrangeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteZoneArrangeCB.class);
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
    public HpSLCFunction<WhiteZoneArrangeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteZoneArrangeCB.class);
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
    public HpSLCFunction<WhiteZoneArrangeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteZoneArrangeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteZoneArrangeCB&gt;() {
     *     public void query(WhiteZoneArrangeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteZoneArrangeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteZoneArrangeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteZoneArrangeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteZoneArrangeCQ sq);

    protected WhiteZoneArrangeCB xcreateScalarConditionCB() {
        WhiteZoneArrangeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteZoneArrangeCB xcreateScalarConditionPartitionByCB() {
        WhiteZoneArrangeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteZoneArrangeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteZoneArrangeCB cb = new WhiteZoneArrangeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ARRANGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteZoneArrangeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteZoneArrangeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteZoneArrangeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteZoneArrangeCB cb = new WhiteZoneArrangeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ARRANGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteZoneArrangeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteZoneArrangeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteZoneArrangeCB cb = new WhiteZoneArrangeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteZoneArrangeCQ sq);

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
    protected WhiteZoneArrangeCB newMyCB() {
        return new WhiteZoneArrangeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteZoneArrangeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
