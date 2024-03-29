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
 * The abstract condition-query of WHITE_SELF_REFERENCE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSelfReferenceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSelfReferenceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_SELF_REFERENCE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceId The value of selfReferenceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfReferenceId_Equal(Integer selfReferenceId) {
        doSetSelfReferenceId_Equal(selfReferenceId);
    }

    protected void doSetSelfReferenceId_Equal(Integer selfReferenceId) {
        regSelfReferenceId(CK_EQ, selfReferenceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceId The value of selfReferenceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfReferenceId_NotEqual(Integer selfReferenceId) {
        doSetSelfReferenceId_NotEqual(selfReferenceId);
    }

    protected void doSetSelfReferenceId_NotEqual(Integer selfReferenceId) {
        regSelfReferenceId(CK_NES, selfReferenceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceId The value of selfReferenceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfReferenceId_GreaterThan(Integer selfReferenceId) {
        regSelfReferenceId(CK_GT, selfReferenceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceId The value of selfReferenceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfReferenceId_LessThan(Integer selfReferenceId) {
        regSelfReferenceId(CK_LT, selfReferenceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceId The value of selfReferenceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfReferenceId_GreaterEqual(Integer selfReferenceId) {
        regSelfReferenceId(CK_GE, selfReferenceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceId The value of selfReferenceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSelfReferenceId_LessEqual(Integer selfReferenceId) {
        regSelfReferenceId(CK_LE, selfReferenceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of selfReferenceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of selfReferenceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSelfReferenceId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSelfReferenceId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of selfReferenceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of selfReferenceId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSelfReferenceId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceIdList The collection of selfReferenceId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelfReferenceId_InScope(Collection<Integer> selfReferenceIdList) {
        doSetSelfReferenceId_InScope(selfReferenceIdList);
    }

    protected void doSetSelfReferenceId_InScope(Collection<Integer> selfReferenceIdList) {
        regINS(CK_INS, cTL(selfReferenceIdList), xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     * @param selfReferenceIdList The collection of selfReferenceId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelfReferenceId_NotInScope(Collection<Integer> selfReferenceIdList) {
        doSetSelfReferenceId_NotInScope(selfReferenceIdList);
    }

    protected void doSetSelfReferenceId_NotInScope(Collection<Integer> selfReferenceIdList) {
        regINS(CK_NINS, cTL(selfReferenceIdList), xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PARENT_ID from WHITE_SELF_REFERENCE where ...)} <br>
     * WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteSelfReferenceSelf</span>(referenceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referenceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteSelfReferenceSelfList for 'exists'. (NotNull)
     */
    public void existsWhiteSelfReferenceSelf(SubQuery<WhiteSelfReferenceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(cb.query());
        registerExistsReferrer(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceSelfList");
    }
    public abstract String keepSelfReferenceId_ExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PARENT_ID from WHITE_SELF_REFERENCE where ...)} <br>
     * WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteSelfReferenceSelf</span>(referenceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referenceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSelfReferenceSelf(SubQuery<WhiteSelfReferenceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceSelfList");
    }
    public abstract String keepSelfReferenceId_NotExistsReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);

    public void xsderiveWhiteSelfReferenceSelfList(String fn, SubQuery<WhiteSelfReferenceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", pp, "whiteSelfReferenceSelfList", al, op);
    }
    public abstract String keepSelfReferenceId_SpecifyDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_SELF_REFERENCE where ...)} <br>
     * WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteSelfReferenceSelf()</span>.<span style="color: #CC4747">max</span>(referenceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     referenceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     referenceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSelfReferenceCB> derivedWhiteSelfReferenceSelf() {
        return xcreateQDRFunctionWhiteSelfReferenceSelfList();
    }
    protected HpQDRFunction<WhiteSelfReferenceCB> xcreateQDRFunctionWhiteSelfReferenceSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteSelfReferenceSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteSelfReferenceSelfList(String fn, SubQuery<WhiteSelfReferenceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(cb.query()); String prpp = keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SELF_REFERENCE_ID", "PARENT_ID", sqpp, "whiteSelfReferenceSelfList", rd, vl, prpp, op);
    }
    public abstract String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfList(WhiteSelfReferenceCQ sq);
    public abstract String keepSelfReferenceId_QueryDerivedReferrer_WhiteSelfReferenceSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setSelfReferenceId_IsNull() { regSelfReferenceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setSelfReferenceId_IsNotNull() { regSelfReferenceId(CK_ISNN, DOBJ); }

    protected void regSelfReferenceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelfReferenceId(), "SELF_REFERENCE_ID"); }
    protected abstract ConditionValue xgetCValueSelfReferenceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSelfReferenceName_Equal(String selfReferenceName) {
        doSetSelfReferenceName_Equal(fRES(selfReferenceName));
    }

    protected void doSetSelfReferenceName_Equal(String selfReferenceName) {
        regSelfReferenceName(CK_EQ, selfReferenceName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSelfReferenceName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param selfReferenceName The value of selfReferenceName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelfReferenceName_LikeSearch(String selfReferenceName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelfReferenceName_LikeSearch(selfReferenceName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSelfReferenceName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param selfReferenceName The value of selfReferenceName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSelfReferenceName_LikeSearch(String selfReferenceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(selfReferenceName), xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSelfReferenceName_NotLikeSearch(String selfReferenceName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSelfReferenceName_NotLikeSearch(selfReferenceName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @param selfReferenceName The value of selfReferenceName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSelfReferenceName_NotLikeSearch(String selfReferenceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(selfReferenceName), xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME", likeSearchOption);
    }

    protected void regSelfReferenceName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSelfReferenceName(), "SELF_REFERENCE_NAME"); }
    protected abstract ConditionValue xgetCValueSelfReferenceName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentId The value of parentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_Equal(Integer parentId) {
        doSetParentId_Equal(parentId);
    }

    protected void doSetParentId_Equal(Integer parentId) {
        regParentId(CK_EQ, parentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentId The value of parentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_NotEqual(Integer parentId) {
        doSetParentId_NotEqual(parentId);
    }

    protected void doSetParentId_NotEqual(Integer parentId) {
        regParentId(CK_NES, parentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentId The value of parentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_GreaterThan(Integer parentId) {
        regParentId(CK_GT, parentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentId The value of parentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_LessThan(Integer parentId) {
        regParentId(CK_LT, parentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentId The value of parentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_GreaterEqual(Integer parentId) {
        regParentId(CK_GE, parentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentId The value of parentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentId_LessEqual(Integer parentId) {
        regParentId(CK_LE, parentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param minNumber The min number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParentId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param minNumber The min number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParentId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentId(), "PARENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentIdList The collection of parentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentId_InScope(Collection<Integer> parentIdList) {
        doSetParentId_InScope(parentIdList);
    }

    protected void doSetParentId_InScope(Collection<Integer> parentIdList) {
        regINS(CK_INS, cTL(parentIdList), xgetCValueParentId(), "PARENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     * @param parentIdList The collection of parentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParentId_NotInScope(Collection<Integer> parentIdList) {
        doSetParentId_NotInScope(parentIdList);
    }

    protected void doSetParentId_NotInScope(Collection<Integer> parentIdList) {
        regINS(CK_NINS, cTL(parentIdList), xgetCValueParentId(), "PARENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     */
    public void setParentId_IsNull() { regParentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE}
     */
    public void setParentId_IsNotNull() { regParentId(CK_ISNN, DOBJ); }

    protected void regParentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentId(), "PARENT_ID"); }
    protected abstract ConditionValue xgetCValueParentId();

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
    public HpSLCFunction<WhiteSelfReferenceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSelfReferenceCB.class);
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
    public HpSLCFunction<WhiteSelfReferenceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSelfReferenceCB.class);
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
    public HpSLCFunction<WhiteSelfReferenceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSelfReferenceCB.class);
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
    public HpSLCFunction<WhiteSelfReferenceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSelfReferenceCB.class);
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
    public HpSLCFunction<WhiteSelfReferenceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSelfReferenceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSelfReferenceCB&gt;() {
     *     public void query(WhiteSelfReferenceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSelfReferenceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSelfReferenceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSelfReferenceCQ sq);

    protected WhiteSelfReferenceCB xcreateScalarConditionCB() {
        WhiteSelfReferenceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSelfReferenceCB xcreateScalarConditionPartitionByCB() {
        WhiteSelfReferenceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSelfReferenceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SELF_REFERENCE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSelfReferenceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSelfReferenceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSelfReferenceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SELF_REFERENCE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSelfReferenceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSelfReferenceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSelfReferenceCQ sq);

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
    protected WhiteSelfReferenceCB newMyCB() {
        return new WhiteSelfReferenceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSelfReferenceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
