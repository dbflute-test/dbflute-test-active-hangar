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
 * The abstract condition-query of WHITE_DEPRECATED_REF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDeprecatedRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDeprecatedRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DEPRECATED_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefId The value of deprecatedRefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_Equal(Long deprecatedRefId) {
        doSetDeprecatedRefId_Equal(deprecatedRefId);
    }

    protected void doSetDeprecatedRefId_Equal(Long deprecatedRefId) {
        regDeprecatedRefId(CK_EQ, deprecatedRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefId The value of deprecatedRefId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_NotEqual(Long deprecatedRefId) {
        doSetDeprecatedRefId_NotEqual(deprecatedRefId);
    }

    protected void doSetDeprecatedRefId_NotEqual(Long deprecatedRefId) {
        regDeprecatedRefId(CK_NES, deprecatedRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefId The value of deprecatedRefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_GreaterThan(Long deprecatedRefId) {
        regDeprecatedRefId(CK_GT, deprecatedRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefId The value of deprecatedRefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_LessThan(Long deprecatedRefId) {
        regDeprecatedRefId(CK_LT, deprecatedRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefId The value of deprecatedRefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_GreaterEqual(Long deprecatedRefId) {
        regDeprecatedRefId(CK_GE, deprecatedRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefId The value of deprecatedRefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_LessEqual(Long deprecatedRefId) {
        regDeprecatedRefId(CK_LE, deprecatedRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of deprecatedRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deprecatedRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDeprecatedRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDeprecatedRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of deprecatedRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deprecatedRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDeprecatedRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeprecatedRefId(), "DEPRECATED_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefIdList The collection of deprecatedRefId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_InScope(Collection<Long> deprecatedRefIdList) {
        doSetDeprecatedRefId_InScope(deprecatedRefIdList);
    }

    protected void doSetDeprecatedRefId_InScope(Collection<Long> deprecatedRefIdList) {
        regINS(CK_INS, cTL(deprecatedRefIdList), xgetCValueDeprecatedRefId(), "DEPRECATED_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param deprecatedRefIdList The collection of deprecatedRefId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefId_NotInScope(Collection<Long> deprecatedRefIdList) {
        doSetDeprecatedRefId_NotInScope(deprecatedRefIdList);
    }

    protected void doSetDeprecatedRefId_NotInScope(Collection<Long> deprecatedRefIdList) {
        regINS(CK_NINS, cTL(deprecatedRefIdList), xgetCValueDeprecatedRefId(), "DEPRECATED_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDeprecatedRefId_IsNull() { regDeprecatedRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDeprecatedRefId_IsNotNull() { regDeprecatedRefId(CK_ISNN, DOBJ); }

    protected void regDeprecatedRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedRefId(), "DEPRECATED_REF_ID"); }
    protected abstract ConditionValue xgetCValueDeprecatedRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
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
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
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
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @param deprecatedId The value of deprecatedId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_GreaterThan(Long deprecatedId) {
        regDeprecatedId(CK_GT, deprecatedId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @param deprecatedId The value of deprecatedId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_LessThan(Long deprecatedId) {
        regDeprecatedId(CK_LT, deprecatedId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @param deprecatedId The value of deprecatedId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_GreaterEqual(Long deprecatedId) {
        regDeprecatedId(CK_GE, deprecatedId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @param deprecatedId The value of deprecatedId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeprecatedId_LessEqual(Long deprecatedId) {
        regDeprecatedId(CK_LE, deprecatedId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
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
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @param minNumber The min number of deprecatedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deprecatedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDeprecatedId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeprecatedId(), "DEPRECATED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
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
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @param deprecatedIdList The collection of deprecatedId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedId_NotInScope(Collection<Long> deprecatedIdList) {
        doSetDeprecatedId_NotInScope(deprecatedIdList);
    }

    protected void doSetDeprecatedId_NotInScope(Collection<Long> deprecatedIdList) {
        regINS(CK_NINS, cTL(deprecatedIdList), xgetCValueDeprecatedId(), "DEPRECATED_ID");
    }

    protected void regDeprecatedId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedId(), "DEPRECATED_ID"); }
    protected abstract ConditionValue xgetCValueDeprecatedId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)}
     * @param deprecatedRefName The value of deprecatedRefName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefName_Equal(String deprecatedRefName) {
        doSetDeprecatedRefName_Equal(fRES(deprecatedRefName));
    }

    protected void doSetDeprecatedRefName_Equal(String deprecatedRefName) {
        regDeprecatedRefName(CK_EQ, deprecatedRefName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDeprecatedRefName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param deprecatedRefName The value of deprecatedRefName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedRefName_LikeSearch(String deprecatedRefName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedRefName_LikeSearch(deprecatedRefName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDeprecatedRefName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deprecatedRefName The value of deprecatedRefName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDeprecatedRefName_LikeSearch(String deprecatedRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deprecatedRefName), xgetCValueDeprecatedRefName(), "DEPRECATED_REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)}
     * @param deprecatedRefName The value of deprecatedRefName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedRefName_NotLikeSearch(String deprecatedRefName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedRefName_NotLikeSearch(deprecatedRefName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)}
     * @param deprecatedRefName The value of deprecatedRefName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDeprecatedRefName_NotLikeSearch(String deprecatedRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deprecatedRefName), xgetCValueDeprecatedRefName(), "DEPRECATED_REF_NAME", likeSearchOption);
    }

    protected void regDeprecatedRefName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedRefName(), "DEPRECATED_REF_NAME"); }
    protected abstract ConditionValue xgetCValueDeprecatedRefName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedRefCode The value of deprecatedRefCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefCode_Equal(String deprecatedRefCode) {
        doSetDeprecatedRefCode_Equal(fRES(deprecatedRefCode));
    }

    protected void doSetDeprecatedRefCode_Equal(String deprecatedRefCode) {
        regDeprecatedRefCode(CK_EQ, deprecatedRefCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedRefCode The value of deprecatedRefCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefCode_NotEqual(String deprecatedRefCode) {
        doSetDeprecatedRefCode_NotEqual(fRES(deprecatedRefCode));
    }

    protected void doSetDeprecatedRefCode_NotEqual(String deprecatedRefCode) {
        regDeprecatedRefCode(CK_NES, deprecatedRefCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedRefCodeList The collection of deprecatedRefCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefCode_InScope(Collection<String> deprecatedRefCodeList) {
        doSetDeprecatedRefCode_InScope(deprecatedRefCodeList);
    }

    protected void doSetDeprecatedRefCode_InScope(Collection<String> deprecatedRefCodeList) {
        regINS(CK_INS, cTL(deprecatedRefCodeList), xgetCValueDeprecatedRefCode(), "DEPRECATED_REF_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedRefCodeList The collection of deprecatedRefCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeprecatedRefCode_NotInScope(Collection<String> deprecatedRefCodeList) {
        doSetDeprecatedRefCode_NotInScope(deprecatedRefCodeList);
    }

    protected void doSetDeprecatedRefCode_NotInScope(Collection<String> deprecatedRefCodeList) {
        regINS(CK_NINS, cTL(deprecatedRefCodeList), xgetCValueDeprecatedRefCode(), "DEPRECATED_REF_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * <pre>e.g. setDeprecatedRefCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param deprecatedRefCode The value of deprecatedRefCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedRefCode_LikeSearch(String deprecatedRefCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedRefCode_LikeSearch(deprecatedRefCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * <pre>e.g. setDeprecatedRefCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deprecatedRefCode The value of deprecatedRefCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDeprecatedRefCode_LikeSearch(String deprecatedRefCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deprecatedRefCode), xgetCValueDeprecatedRefCode(), "DEPRECATED_REF_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedRefCode The value of deprecatedRefCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeprecatedRefCode_NotLikeSearch(String deprecatedRefCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeprecatedRefCode_NotLikeSearch(deprecatedRefCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @param deprecatedRefCode The value of deprecatedRefCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDeprecatedRefCode_NotLikeSearch(String deprecatedRefCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deprecatedRefCode), xgetCValueDeprecatedRefCode(), "DEPRECATED_REF_CODE", likeSearchOption);
    }

    protected void regDeprecatedRefCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeprecatedRefCode(), "DEPRECATED_REF_CODE"); }
    protected abstract ConditionValue xgetCValueDeprecatedRefCode();

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
    public HpSLCFunction<WhiteDeprecatedRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDeprecatedRefCB.class);
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
    public HpSLCFunction<WhiteDeprecatedRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDeprecatedRefCB.class);
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
    public HpSLCFunction<WhiteDeprecatedRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDeprecatedRefCB.class);
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
    public HpSLCFunction<WhiteDeprecatedRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDeprecatedRefCB.class);
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
    public HpSLCFunction<WhiteDeprecatedRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDeprecatedRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDeprecatedRefCB&gt;() {
     *     public void query(WhiteDeprecatedRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDeprecatedRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDeprecatedRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDeprecatedRefCQ sq);

    protected WhiteDeprecatedRefCB xcreateScalarConditionCB() {
        WhiteDeprecatedRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDeprecatedRefCB xcreateScalarConditionPartitionByCB() {
        WhiteDeprecatedRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDeprecatedRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DEPRECATED_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDeprecatedRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDeprecatedRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDeprecatedRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEPRECATED_REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDeprecatedRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDeprecatedRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDeprecatedRefCB cb = new WhiteDeprecatedRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDeprecatedRefCQ sq);

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
    protected WhiteDeprecatedRefCB newMyCB() {
        return new WhiteDeprecatedRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDeprecatedRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
