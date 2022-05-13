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
 * The abstract condition-query of WHITE_BASE_ONE01_SEA_MAGICLAMP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne01SeaMagiclampCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne01SeaMagiclampCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE01_SEA_MAGICLAMP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampId The value of magiclampId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMagiclampId_Equal(Integer magiclampId) {
        doSetMagiclampId_Equal(magiclampId);
    }

    protected void doSetMagiclampId_Equal(Integer magiclampId) {
        regMagiclampId(CK_EQ, magiclampId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampId The value of magiclampId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMagiclampId_NotEqual(Integer magiclampId) {
        doSetMagiclampId_NotEqual(magiclampId);
    }

    protected void doSetMagiclampId_NotEqual(Integer magiclampId) {
        regMagiclampId(CK_NES, magiclampId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampId The value of magiclampId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMagiclampId_GreaterThan(Integer magiclampId) {
        regMagiclampId(CK_GT, magiclampId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampId The value of magiclampId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMagiclampId_LessThan(Integer magiclampId) {
        regMagiclampId(CK_LT, magiclampId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampId The value of magiclampId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMagiclampId_GreaterEqual(Integer magiclampId) {
        regMagiclampId(CK_GE, magiclampId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampId The value of magiclampId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMagiclampId_LessEqual(Integer magiclampId) {
        regMagiclampId(CK_LE, magiclampId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of magiclampId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of magiclampId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMagiclampId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMagiclampId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of magiclampId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of magiclampId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMagiclampId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMagiclampId(), "MAGICLAMP_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampIdList The collection of magiclampId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMagiclampId_InScope(Collection<Integer> magiclampIdList) {
        doSetMagiclampId_InScope(magiclampIdList);
    }

    protected void doSetMagiclampId_InScope(Collection<Integer> magiclampIdList) {
        regINS(CK_INS, cTL(magiclampIdList), xgetCValueMagiclampId(), "MAGICLAMP_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @param magiclampIdList The collection of magiclampId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMagiclampId_NotInScope(Collection<Integer> magiclampIdList) {
        doSetMagiclampId_NotInScope(magiclampIdList);
    }

    protected void doSetMagiclampId_NotInScope(Collection<Integer> magiclampIdList) {
        regINS(CK_NINS, cTL(magiclampIdList), xgetCValueMagiclampId(), "MAGICLAMP_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMagiclampId_IsNull() { regMagiclampId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setMagiclampId_IsNotNull() { regMagiclampId(CK_ISNN, DOBJ); }

    protected void regMagiclampId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMagiclampId(), "MAGICLAMP_ID"); }
    protected abstract ConditionValue xgetCValueMagiclampId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)}
     * @param magiclampName The value of magiclampName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMagiclampName_Equal(String magiclampName) {
        doSetMagiclampName_Equal(fRES(magiclampName));
    }

    protected void doSetMagiclampName_Equal(String magiclampName) {
        regMagiclampName(CK_EQ, magiclampName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMagiclampName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param magiclampName The value of magiclampName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMagiclampName_LikeSearch(String magiclampName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMagiclampName_LikeSearch(magiclampName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setMagiclampName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param magiclampName The value of magiclampName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMagiclampName_LikeSearch(String magiclampName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(magiclampName), xgetCValueMagiclampName(), "MAGICLAMP_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)}
     * @param magiclampName The value of magiclampName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMagiclampName_NotLikeSearch(String magiclampName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMagiclampName_NotLikeSearch(magiclampName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)}
     * @param magiclampName The value of magiclampName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMagiclampName_NotLikeSearch(String magiclampName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(magiclampName), xgetCValueMagiclampName(), "MAGICLAMP_NAME", likeSearchOption);
    }

    protected void regMagiclampName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMagiclampName(), "MAGICLAMP_NAME"); }
    protected abstract ConditionValue xgetCValueMagiclampName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_Equal(Integer seaId) {
        doSetSeaId_Equal(seaId);
    }

    protected void doSetSeaId_Equal(Integer seaId) {
        regSeaId(CK_EQ, seaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_NotEqual(Integer seaId) {
        doSetSeaId_NotEqual(seaId);
    }

    protected void doSetSeaId_NotEqual(Integer seaId) {
        regSeaId(CK_NES, seaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_GreaterThan(Integer seaId) {
        regSeaId(CK_GT, seaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_LessThan(Integer seaId) {
        regSeaId(CK_LT, seaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_GreaterEqual(Integer seaId) {
        regSeaId(CK_GE, seaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_LessEqual(Integer seaId) {
        regSeaId(CK_LE, seaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param minNumber The min number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSeaId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSeaId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param minNumber The min number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSeaId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeaId(), "SEA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaIdList The collection of seaId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaId_InScope(Collection<Integer> seaIdList) {
        doSetSeaId_InScope(seaIdList);
    }

    protected void doSetSeaId_InScope(Collection<Integer> seaIdList) {
        regINS(CK_INS, cTL(seaIdList), xgetCValueSeaId(), "SEA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaIdList The collection of seaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaId_NotInScope(Collection<Integer> seaIdList) {
        doSetSeaId_NotInScope(seaIdList);
    }

    protected void doSetSeaId_NotInScope(Collection<Integer> seaIdList) {
        regINS(CK_NINS, cTL(seaIdList), xgetCValueSeaId(), "SEA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     */
    public void setSeaId_IsNull() { regSeaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     */
    public void setSeaId_IsNotNull() { regSeaId(CK_ISNN, DOBJ); }

    protected void regSeaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeaId(), "SEA_ID"); }
    protected abstract ConditionValue xgetCValueSeaId();

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
    public HpSLCFunction<WhiteBaseOne01SeaMagiclampCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne01SeaMagiclampCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaMagiclampCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne01SeaMagiclampCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaMagiclampCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne01SeaMagiclampCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaMagiclampCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne01SeaMagiclampCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaMagiclampCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne01SeaMagiclampCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne01SeaMagiclampCB&gt;() {
     *     public void query(WhiteBaseOne01SeaMagiclampCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne01SeaMagiclampCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne01SeaMagiclampCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaMagiclampCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne01SeaMagiclampCQ sq);

    protected WhiteBaseOne01SeaMagiclampCB xcreateScalarConditionCB() {
        WhiteBaseOne01SeaMagiclampCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne01SeaMagiclampCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne01SeaMagiclampCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne01SeaMagiclampCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MAGICLAMP_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne01SeaMagiclampCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne01SeaMagiclampCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne01SeaMagiclampCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MAGICLAMP_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne01SeaMagiclampCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne01SeaMagiclampCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne01SeaMagiclampCQ sq);

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
    protected WhiteBaseOne01SeaMagiclampCB newMyCB() {
        return new WhiteBaseOne01SeaMagiclampCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne01SeaMagiclampCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
