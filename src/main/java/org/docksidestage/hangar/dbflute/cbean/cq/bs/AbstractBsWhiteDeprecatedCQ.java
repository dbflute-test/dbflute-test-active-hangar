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
 * The abstract condition-query of WHITE_DEPRECATED.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDeprecatedCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDeprecatedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DEPRECATED";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedId The value of deprecatedId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_Equal(Long deprecatedId) {
        doSetDeprecatedId_Equal(deprecatedId);
    }

    protected void doSetDeprecatedId_Equal(Long deprecatedId) {
        regDeprecatedId(CK_EQ, deprecatedId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedId The value of deprecatedId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_NotEqual(Long deprecatedId) {
        doSetDeprecatedId_NotEqual(deprecatedId);
    }

    protected void doSetDeprecatedId_NotEqual(Long deprecatedId) {
        regDeprecatedId(CK_NES, deprecatedId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedId The value of deprecatedId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_GreaterThan(Long deprecatedId) {
        regDeprecatedId(CK_GT, deprecatedId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedId The value of deprecatedId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_LessThan(Long deprecatedId) {
        regDeprecatedId(CK_LT, deprecatedId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedId The value of deprecatedId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_GreaterEqual(Long deprecatedId) {
        regDeprecatedId(CK_GE, deprecatedId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedId The value of deprecatedId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_LessEqual(Long deprecatedId) {
        regDeprecatedId(CK_LE, deprecatedId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of deprecatedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deprecatedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDeprecatedId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDeprecatedId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of deprecatedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deprecatedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDeprecatedId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeprecatedId(), "DEPRECATED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedIdList The collection of deprecatedId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedId_InScope(Collection<Long> deprecatedIdList) {
        doSetDeprecatedId_InScope(deprecatedIdList);
    }

    protected void doSetDeprecatedId_InScope(Collection<Long> deprecatedIdList) {
        regINS(CK_INS, cTL(deprecatedIdList), xgetCValueDeprecatedId(), "DEPRECATED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedIdList The collection of deprecatedId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedId_NotInScope(Collection<Long> deprecatedIdList) {
        doSetDeprecatedId_NotInScope(deprecatedIdList);
    }

    protected void doSetDeprecatedId_NotInScope(Collection<Long> deprecatedIdList) {
        regINS(CK_NINS, cTL(deprecatedIdList), xgetCValueDeprecatedId(), "DEPRECATED_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPRECATED_ID from WHITE_DEPRECATED_REF where ...)} <br>
     * WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteDeprecatedRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteDeprecatedRefList for 'exists'. (NotNull)
     */
    public void existsWhiteDeprecatedRef(SubQuery<WhiteDeprecatedRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeprecatedId_ExistsReferrer_WhiteDeprecatedRefList(cb.query());
        registerExistsReferrer(cb.query(), "DEPRECATED_ID", "DEPRECATED_ID", pp, "whiteDeprecatedRefList");
    }
    public abstract String keepDeprecatedId_ExistsReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPRECATED_ID from WHITE_DEPRECATED_REF where ...)} <br>
     * WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteDeprecatedRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DeprecatedId_NotExistsReferrer_WhiteDeprecatedRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteDeprecatedRef(SubQuery<WhiteDeprecatedRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeprecatedId_NotExistsReferrer_WhiteDeprecatedRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "DEPRECATED_ID", "DEPRECATED_ID", pp, "whiteDeprecatedRefList");
    }
    public abstract String keepDeprecatedId_NotExistsReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq);

    public void xsderiveWhiteDeprecatedRefList(String fn, SubQuery<WhiteDeprecatedRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDeprecatedId_SpecifyDerivedReferrer_WhiteDeprecatedRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DEPRECATED_ID", "DEPRECATED_ID", pp, "whiteDeprecatedRefList", al, op);
    }
    public abstract String keepDeprecatedId_SpecifyDerivedReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_DEPRECATED_REF where ...)} <br>
     * WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteDeprecatedRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteDeprecatedRefCB> derivedWhiteDeprecatedRef() {
        return xcreateQDRFunctionWhiteDeprecatedRefList();
    }
    protected HpQDRFunction<WhiteDeprecatedRefCB> xcreateQDRFunctionWhiteDeprecatedRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteDeprecatedRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteDeprecatedRefList(String fn, SubQuery<WhiteDeprecatedRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList(cb.query()); String prpp = keepDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DEPRECATED_ID", "DEPRECATED_ID", sqpp, "whiteDeprecatedRefList", rd, vl, prpp, op);
    }
    public abstract String keepDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefList(WhiteDeprecatedRefCQ sq);
    public abstract String keepDeprecatedId_QueryDerivedReferrer_WhiteDeprecatedRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDeprecatedId_IsNull() { regDeprecatedId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDeprecatedId_IsNotNull() { regDeprecatedId(CK_ISNN, DOBJ); }

    protected void regDeprecatedId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedId(), "DEPRECATED_ID"); }
    protected abstract ConditionValue xgetCValueDeprecatedId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)}
     * @param deprecatedName The value of deprecatedName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedName_Equal(String deprecatedName) {
        doSetDeprecatedName_Equal(fRES(deprecatedName));
    }

    protected void doSetDeprecatedName_Equal(String deprecatedName) {
        regDeprecatedName(CK_EQ, deprecatedName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDeprecatedName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param deprecatedName The value of deprecatedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedName_LikeSearch(String deprecatedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedName_LikeSearch(deprecatedName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDeprecatedName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deprecatedName The value of deprecatedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDeprecatedName_LikeSearch(String deprecatedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deprecatedName), xgetCValueDeprecatedName(), "DEPRECATED_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)}
     * @param deprecatedName The value of deprecatedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedName_NotLikeSearch(String deprecatedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedName_NotLikeSearch(deprecatedName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)}
     * @param deprecatedName The value of deprecatedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDeprecatedName_NotLikeSearch(String deprecatedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deprecatedName), xgetCValueDeprecatedName(), "DEPRECATED_NAME", likeSearchOption);
    }

    protected void regDeprecatedName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedName(), "DEPRECATED_NAME"); }
    protected abstract ConditionValue xgetCValueDeprecatedName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedCode The value of deprecatedCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedCode_Equal(String deprecatedCode) {
        doSetDeprecatedCode_Equal(fRES(deprecatedCode));
    }

    protected void doSetDeprecatedCode_Equal(String deprecatedCode) {
        regDeprecatedCode(CK_EQ, deprecatedCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedCode The value of deprecatedCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedCode_NotEqual(String deprecatedCode) {
        doSetDeprecatedCode_NotEqual(fRES(deprecatedCode));
    }

    protected void doSetDeprecatedCode_NotEqual(String deprecatedCode) {
        regDeprecatedCode(CK_NES, deprecatedCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedCodeList The collection of deprecatedCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedCode_InScope(Collection<String> deprecatedCodeList) {
        doSetDeprecatedCode_InScope(deprecatedCodeList);
    }

    protected void doSetDeprecatedCode_InScope(Collection<String> deprecatedCodeList) {
        regINS(CK_INS, cTL(deprecatedCodeList), xgetCValueDeprecatedCode(), "DEPRECATED_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedCodeList The collection of deprecatedCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedCode_NotInScope(Collection<String> deprecatedCodeList) {
        doSetDeprecatedCode_NotInScope(deprecatedCodeList);
    }

    protected void doSetDeprecatedCode_NotInScope(Collection<String> deprecatedCodeList) {
        regINS(CK_NINS, cTL(deprecatedCodeList), xgetCValueDeprecatedCode(), "DEPRECATED_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)} <br>
     * <pre>e.g. setDeprecatedCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param deprecatedCode The value of deprecatedCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedCode_LikeSearch(String deprecatedCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedCode_LikeSearch(deprecatedCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)} <br>
     * <pre>e.g. setDeprecatedCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deprecatedCode The value of deprecatedCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDeprecatedCode_LikeSearch(String deprecatedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deprecatedCode), xgetCValueDeprecatedCode(), "DEPRECATED_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedCode The value of deprecatedCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedCode_NotLikeSearch(String deprecatedCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedCode_NotLikeSearch(deprecatedCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedCode The value of deprecatedCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDeprecatedCode_NotLikeSearch(String deprecatedCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deprecatedCode), xgetCValueDeprecatedCode(), "DEPRECATED_CODE", likeSearchOption);
    }

    protected void regDeprecatedCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedCode(), "DEPRECATED_CODE"); }
    protected abstract ConditionValue xgetCValueDeprecatedCode();

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
    public HpSLCFunction<WhiteDeprecatedCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDeprecatedCB.class);
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
    public HpSLCFunction<WhiteDeprecatedCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDeprecatedCB.class);
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
    public HpSLCFunction<WhiteDeprecatedCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDeprecatedCB.class);
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
    public HpSLCFunction<WhiteDeprecatedCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDeprecatedCB.class);
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
    public HpSLCFunction<WhiteDeprecatedCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDeprecatedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedCB&gt;() {
     *     public void query(WhiteDeprecatedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDeprecatedCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDeprecatedCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDeprecatedCQ sq);

    protected WhiteDeprecatedCB xcreateScalarConditionCB() {
        WhiteDeprecatedCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDeprecatedCB xcreateScalarConditionPartitionByCB() {
        WhiteDeprecatedCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDeprecatedCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedCB cb = new WhiteDeprecatedCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DEPRECATED_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDeprecatedCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDeprecatedCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDeprecatedCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedCB cb = new WhiteDeprecatedCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEPRECATED_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDeprecatedCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDeprecatedCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDeprecatedCB cb = new WhiteDeprecatedCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDeprecatedCQ sq);

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
    protected WhiteDeprecatedCB newMyCB() {
        return new WhiteDeprecatedCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDeprecatedCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
