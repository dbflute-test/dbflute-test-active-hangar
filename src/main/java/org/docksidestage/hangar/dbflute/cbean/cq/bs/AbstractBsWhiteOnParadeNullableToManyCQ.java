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
 * The abstract condition-query of WHITE_ON_PARADE_NULLABLE_TO_MANY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOnParadeNullableToManyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOnParadeNullableToManyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_ON_PARADE_NULLABLE_TO_MANY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyId The value of manyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_Equal(Long manyId) {
        doSetManyId_Equal(manyId);
    }

    protected void doSetManyId_Equal(Long manyId) {
        regManyId(CK_EQ, manyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyId The value of manyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_NotEqual(Long manyId) {
        doSetManyId_NotEqual(manyId);
    }

    protected void doSetManyId_NotEqual(Long manyId) {
        regManyId(CK_NES, manyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyId The value of manyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_GreaterThan(Long manyId) {
        regManyId(CK_GT, manyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyId The value of manyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_LessThan(Long manyId) {
        regManyId(CK_LT, manyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyId The value of manyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_GreaterEqual(Long manyId) {
        regManyId(CK_GE, manyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyId The value of manyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setManyId_LessEqual(Long manyId) {
        regManyId(CK_LE, manyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setManyId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setManyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of manyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setManyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueManyId(), "MANY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyIdList The collection of manyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyId_InScope(Collection<Long> manyIdList) {
        doSetManyId_InScope(manyIdList);
    }

    protected void doSetManyId_InScope(Collection<Long> manyIdList) {
        regINS(CK_INS, cTL(manyIdList), xgetCValueManyId(), "MANY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     * @param manyIdList The collection of manyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyId_NotInScope(Collection<Long> manyIdList) {
        doSetManyId_NotInScope(manyIdList);
    }

    protected void doSetManyId_NotInScope(Collection<Long> manyIdList) {
        regINS(CK_NINS, cTL(manyIdList), xgetCValueManyId(), "MANY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NULLABLE_FK_TO_MANY_ID from WHITE_ON_PARADE_REF where ...)} <br>
     * (オンパレードREF or オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteOnParadeRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteOnParadeRefList for 'exists'. (NotNull)
     */
    public void existsWhiteOnParadeRef(SubQuery<WhiteOnParadeRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepManyId_ExistsReferrer_WhiteOnParadeRefList(cb.query());
        registerExistsReferrer(cb.query(), "MANY_ID", "NULLABLE_FK_TO_MANY_ID", pp, "whiteOnParadeRefList");
    }
    public abstract String keepManyId_ExistsReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NULLABLE_FK_TO_MANY_ID from WHITE_ON_PARADE_REF where ...)} <br>
     * (オンパレードREF or オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteOnParadeRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ManyId_NotExistsReferrer_WhiteOnParadeRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteOnParadeRef(SubQuery<WhiteOnParadeRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepManyId_NotExistsReferrer_WhiteOnParadeRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "MANY_ID", "NULLABLE_FK_TO_MANY_ID", pp, "whiteOnParadeRefList");
    }
    public abstract String keepManyId_NotExistsReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);

    public void xsderiveWhiteOnParadeRefList(String fn, SubQuery<WhiteOnParadeRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepManyId_SpecifyDerivedReferrer_WhiteOnParadeRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MANY_ID", "NULLABLE_FK_TO_MANY_ID", pp, "whiteOnParadeRefList", al, op);
    }
    public abstract String keepManyId_SpecifyDerivedReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_ON_PARADE_REF where ...)} <br>
     * (オンパレードREF or オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteOnParadeRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteOnParadeRefCB> derivedWhiteOnParadeRef() {
        return xcreateQDRFunctionWhiteOnParadeRefList();
    }
    protected HpQDRFunction<WhiteOnParadeRefCB> xcreateQDRFunctionWhiteOnParadeRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteOnParadeRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteOnParadeRefList(String fn, SubQuery<WhiteOnParadeRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepManyId_QueryDerivedReferrer_WhiteOnParadeRefList(cb.query()); String prpp = keepManyId_QueryDerivedReferrer_WhiteOnParadeRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MANY_ID", "NULLABLE_FK_TO_MANY_ID", sqpp, "whiteOnParadeRefList", rd, vl, prpp, op);
    }
    public abstract String keepManyId_QueryDerivedReferrer_WhiteOnParadeRefList(WhiteOnParadeRefCQ sq);
    public abstract String keepManyId_QueryDerivedReferrer_WhiteOnParadeRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setManyId_IsNull() { regManyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANY_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setManyId_IsNotNull() { regManyId(CK_ISNN, DOBJ); }

    protected void regManyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyId(), "MANY_ID"); }
    protected abstract ConditionValue xgetCValueManyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(100)}
     * @param manyName The value of manyName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManyName_Equal(String manyName) {
        doSetManyName_Equal(fRES(manyName));
    }

    protected void doSetManyName_Equal(String manyName) {
        regManyName(CK_EQ, manyName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setManyName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param manyName The value of manyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setManyName_LikeSearch(String manyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setManyName_LikeSearch(manyName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setManyName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manyName The value of manyName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setManyName_LikeSearch(String manyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manyName), xgetCValueManyName(), "MANY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(100)}
     * @param manyName The value of manyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setManyName_NotLikeSearch(String manyName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setManyName_NotLikeSearch(manyName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANY_NAME: {NotNull, VARCHAR(100)}
     * @param manyName The value of manyName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setManyName_NotLikeSearch(String manyName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manyName), xgetCValueManyName(), "MANY_NAME", likeSearchOption);
    }

    protected void regManyName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManyName(), "MANY_NAME"); }
    protected abstract ConditionValue xgetCValueManyName();

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
    public HpSLCFunction<WhiteOnParadeNullableToManyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteOnParadeNullableToManyCB.class);
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
    public HpSLCFunction<WhiteOnParadeNullableToManyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteOnParadeNullableToManyCB.class);
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
    public HpSLCFunction<WhiteOnParadeNullableToManyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteOnParadeNullableToManyCB.class);
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
    public HpSLCFunction<WhiteOnParadeNullableToManyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteOnParadeNullableToManyCB.class);
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
    public HpSLCFunction<WhiteOnParadeNullableToManyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteOnParadeNullableToManyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOnParadeNullableToManyCB&gt;() {
     *     public void query(WhiteOnParadeNullableToManyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeNullableToManyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteOnParadeNullableToManyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeNullableToManyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteOnParadeNullableToManyCQ sq);

    protected WhiteOnParadeNullableToManyCB xcreateScalarConditionCB() {
        WhiteOnParadeNullableToManyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOnParadeNullableToManyCB xcreateScalarConditionPartitionByCB() {
        WhiteOnParadeNullableToManyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOnParadeNullableToManyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeNullableToManyCB cb = new WhiteOnParadeNullableToManyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MANY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOnParadeNullableToManyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOnParadeNullableToManyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOnParadeNullableToManyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeNullableToManyCB cb = new WhiteOnParadeNullableToManyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MANY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOnParadeNullableToManyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOnParadeNullableToManyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeNullableToManyCB cb = new WhiteOnParadeNullableToManyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOnParadeNullableToManyCQ sq);

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
    protected WhiteOnParadeNullableToManyCB newMyCB() {
        return new WhiteOnParadeNullableToManyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOnParadeNullableToManyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
