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
 * The abstract condition-query of WHITE_BASE_ONE04_BONVO_PARKSIDE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne04BonvoParksideCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne04BonvoParksideCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE04_BONVO_PARKSIDE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideId The value of parksideId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_Equal(Integer parksideId) {
        doSetParksideId_Equal(parksideId);
    }

    protected void doSetParksideId_Equal(Integer parksideId) {
        regParksideId(CK_EQ, parksideId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideId The value of parksideId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_NotEqual(Integer parksideId) {
        doSetParksideId_NotEqual(parksideId);
    }

    protected void doSetParksideId_NotEqual(Integer parksideId) {
        regParksideId(CK_NES, parksideId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideId The value of parksideId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_GreaterThan(Integer parksideId) {
        regParksideId(CK_GT, parksideId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideId The value of parksideId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_LessThan(Integer parksideId) {
        regParksideId(CK_LT, parksideId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideId The value of parksideId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_GreaterEqual(Integer parksideId) {
        regParksideId(CK_GE, parksideId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideId The value of parksideId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_LessEqual(Integer parksideId) {
        regParksideId(CK_LE, parksideId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParksideId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParksideId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParksideId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParksideId(), "PARKSIDE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideIdList The collection of parksideId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParksideId_InScope(Collection<Integer> parksideIdList) {
        doSetParksideId_InScope(parksideIdList);
    }

    protected void doSetParksideId_InScope(Collection<Integer> parksideIdList) {
        regINS(CK_INS, cTL(parksideIdList), xgetCValueParksideId(), "PARKSIDE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @param parksideIdList The collection of parksideId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParksideId_NotInScope(Collection<Integer> parksideIdList) {
        doSetParksideId_NotInScope(parksideIdList);
    }

    protected void doSetParksideId_NotInScope(Collection<Integer> parksideIdList) {
        regINS(CK_NINS, cTL(parksideIdList), xgetCValueParksideId(), "PARKSIDE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PARKSIDE_ID from WHITE_BASE_ONE04_BONVO where ...)} <br>
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteBaseOne04Bonvo</span>(bonvoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bonvoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteBaseOne04BonvoList for 'exists'. (NotNull)
     */
    public void existsWhiteBaseOne04Bonvo(SubQuery<WhiteBaseOne04BonvoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepParksideId_ExistsReferrer_WhiteBaseOne04BonvoList(cb.query());
        registerExistsReferrer(cb.query(), "PARKSIDE_ID", "PARKSIDE_ID", pp, "whiteBaseOne04BonvoList");
    }
    public abstract String keepParksideId_ExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PARKSIDE_ID from WHITE_BASE_ONE04_BONVO where ...)} <br>
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBaseOne04Bonvo</span>(bonvoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bonvoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ParksideId_NotExistsReferrer_WhiteBaseOne04BonvoList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBaseOne04Bonvo(SubQuery<WhiteBaseOne04BonvoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepParksideId_NotExistsReferrer_WhiteBaseOne04BonvoList(cb.query());
        registerNotExistsReferrer(cb.query(), "PARKSIDE_ID", "PARKSIDE_ID", pp, "whiteBaseOne04BonvoList");
    }
    public abstract String keepParksideId_NotExistsReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);

    public void xsderiveWhiteBaseOne04BonvoList(String fn, SubQuery<WhiteBaseOne04BonvoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepParksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PARKSIDE_ID", "PARKSIDE_ID", pp, "whiteBaseOne04BonvoList", al, op);
    }
    public abstract String keepParksideId_SpecifyDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE_ONE04_BONVO where ...)} <br>
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteBaseOne04Bonvo()</span>.<span style="color: #CC4747">max</span>(bonvoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bonvoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bonvoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne04BonvoCB> derivedWhiteBaseOne04Bonvo() {
        return xcreateQDRFunctionWhiteBaseOne04BonvoList();
    }
    protected HpQDRFunction<WhiteBaseOne04BonvoCB> xcreateQDRFunctionWhiteBaseOne04BonvoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteBaseOne04BonvoList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteBaseOne04BonvoList(String fn, SubQuery<WhiteBaseOne04BonvoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(cb.query()); String prpp = keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PARKSIDE_ID", "PARKSIDE_ID", sqpp, "whiteBaseOne04BonvoList", rd, vl, prpp, op);
    }
    public abstract String keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoList(WhiteBaseOne04BonvoCQ sq);
    public abstract String keepParksideId_QueryDerivedReferrer_WhiteBaseOne04BonvoListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setParksideId_IsNull() { regParksideId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setParksideId_IsNotNull() { regParksideId(CK_ISNN, DOBJ); }

    protected void regParksideId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParksideId(), "PARKSIDE_ID"); }
    protected abstract ConditionValue xgetCValueParksideId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param parksideName The value of parksideName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParksideName_Equal(String parksideName) {
        doSetParksideName_Equal(fRES(parksideName));
    }

    protected void doSetParksideName_Equal(String parksideName) {
        regParksideName(CK_EQ, parksideName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setParksideName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param parksideName The value of parksideName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setParksideName_LikeSearch(String parksideName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setParksideName_LikeSearch(parksideName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setParksideName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param parksideName The value of parksideName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setParksideName_LikeSearch(String parksideName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parksideName), xgetCValueParksideName(), "PARKSIDE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param parksideName The value of parksideName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setParksideName_NotLikeSearch(String parksideName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setParksideName_NotLikeSearch(parksideName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @param parksideName The value of parksideName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setParksideName_NotLikeSearch(String parksideName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parksideName), xgetCValueParksideName(), "PARKSIDE_NAME", likeSearchOption);
    }

    protected void regParksideName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParksideName(), "PARKSIDE_NAME"); }
    protected abstract ConditionValue xgetCValueParksideName();

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
    public HpSLCFunction<WhiteBaseOne04BonvoParksideCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne04BonvoParksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoParksideCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne04BonvoParksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoParksideCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne04BonvoParksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoParksideCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne04BonvoParksideCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoParksideCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne04BonvoParksideCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne04BonvoParksideCB&gt;() {
     *     public void query(WhiteBaseOne04BonvoParksideCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne04BonvoParksideCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne04BonvoParksideCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoParksideCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne04BonvoParksideCQ sq);

    protected WhiteBaseOne04BonvoParksideCB xcreateScalarConditionCB() {
        WhiteBaseOne04BonvoParksideCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne04BonvoParksideCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne04BonvoParksideCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne04BonvoParksideCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoParksideCB cb = new WhiteBaseOne04BonvoParksideCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PARKSIDE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoParksideCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne04BonvoParksideCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne04BonvoParksideCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoParksideCB cb = new WhiteBaseOne04BonvoParksideCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PARKSIDE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne04BonvoParksideCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne04BonvoParksideCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoParksideCB cb = new WhiteBaseOne04BonvoParksideCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne04BonvoParksideCQ sq);

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
    protected WhiteBaseOne04BonvoParksideCB newMyCB() {
        return new WhiteBaseOne04BonvoParksideCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne04BonvoParksideCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
