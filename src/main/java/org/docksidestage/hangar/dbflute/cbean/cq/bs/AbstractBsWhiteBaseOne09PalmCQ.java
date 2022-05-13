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
 * The abstract condition-query of WHITE_BASE_ONE09_PALM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne09PalmCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne09PalmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE09_PALM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmId The value of palmId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalmId_Equal(Integer palmId) {
        doSetPalmId_Equal(palmId);
    }

    protected void doSetPalmId_Equal(Integer palmId) {
        regPalmId(CK_EQ, palmId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmId The value of palmId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalmId_NotEqual(Integer palmId) {
        doSetPalmId_NotEqual(palmId);
    }

    protected void doSetPalmId_NotEqual(Integer palmId) {
        regPalmId(CK_NES, palmId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmId The value of palmId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalmId_GreaterThan(Integer palmId) {
        regPalmId(CK_GT, palmId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmId The value of palmId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalmId_LessThan(Integer palmId) {
        regPalmId(CK_LT, palmId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmId The value of palmId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalmId_GreaterEqual(Integer palmId) {
        regPalmId(CK_GE, palmId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmId The value of palmId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalmId_LessEqual(Integer palmId) {
        regPalmId(CK_LE, palmId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of palmId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palmId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPalmId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPalmId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of palmId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palmId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPalmId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalmId(), "PALM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmIdList The collection of palmId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalmId_InScope(Collection<Integer> palmIdList) {
        doSetPalmId_InScope(palmIdList);
    }

    protected void doSetPalmId_InScope(Collection<Integer> palmIdList) {
        regINS(CK_INS, cTL(palmIdList), xgetCValuePalmId(), "PALM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @param palmIdList The collection of palmId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalmId_NotInScope(Collection<Integer> palmIdList) {
        doSetPalmId_NotInScope(palmIdList);
    }

    protected void doSetPalmId_NotInScope(Collection<Integer> palmIdList) {
        regINS(CK_NINS, cTL(palmIdList), xgetCValuePalmId(), "PALM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setPalmId_IsNull() { regPalmId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setPalmId_IsNotNull() { regPalmId(CK_ISNN, DOBJ); }

    protected void regPalmId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalmId(), "PALM_ID"); }
    protected abstract ConditionValue xgetCValuePalmId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)}
     * @param palmName The value of palmName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalmName_Equal(String palmName) {
        doSetPalmName_Equal(fRES(palmName));
    }

    protected void doSetPalmName_Equal(String palmName) {
        regPalmName(CK_EQ, palmName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPalmName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param palmName The value of palmName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPalmName_LikeSearch(String palmName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPalmName_LikeSearch(palmName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setPalmName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param palmName The value of palmName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPalmName_LikeSearch(String palmName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(palmName), xgetCValuePalmName(), "PALM_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)}
     * @param palmName The value of palmName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPalmName_NotLikeSearch(String palmName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPalmName_NotLikeSearch(palmName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PALM_NAME: {NotNull, VARCHAR(200)}
     * @param palmName The value of palmName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPalmName_NotLikeSearch(String palmName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(palmName), xgetCValuePalmName(), "PALM_NAME", likeSearchOption);
    }

    protected void regPalmName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalmName(), "PALM_NAME"); }
    protected abstract ConditionValue xgetCValuePalmName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_Equal(Integer baseId) {
        doSetBaseId_Equal(baseId);
    }

    protected void doSetBaseId_Equal(Integer baseId) {
        regBaseId(CK_EQ, baseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_NotEqual(Integer baseId) {
        doSetBaseId_NotEqual(baseId);
    }

    protected void doSetBaseId_NotEqual(Integer baseId) {
        regBaseId(CK_NES, baseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterThan(Integer baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessThan(Integer baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterEqual(Integer baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessEqual(Integer baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseIdList The collection of baseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_InScope(Collection<Integer> baseIdList) {
        doSetBaseId_InScope(baseIdList);
    }

    protected void doSetBaseId_InScope(Collection<Integer> baseIdList) {
        regINS(CK_INS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @param baseIdList The collection of baseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_NotInScope(Collection<Integer> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Integer> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    protected void regBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseId(), "BASE_ID"); }
    protected abstract ConditionValue xgetCValueBaseId();

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
    public HpSLCFunction<WhiteBaseOne09PalmCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne09PalmCB.class);
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
    public HpSLCFunction<WhiteBaseOne09PalmCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne09PalmCB.class);
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
    public HpSLCFunction<WhiteBaseOne09PalmCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne09PalmCB.class);
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
    public HpSLCFunction<WhiteBaseOne09PalmCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne09PalmCB.class);
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
    public HpSLCFunction<WhiteBaseOne09PalmCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne09PalmCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne09PalmCB&gt;() {
     *     public void query(WhiteBaseOne09PalmCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne09PalmCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne09PalmCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne09PalmCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne09PalmCQ sq);

    protected WhiteBaseOne09PalmCB xcreateScalarConditionCB() {
        WhiteBaseOne09PalmCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne09PalmCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne09PalmCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne09PalmCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne09PalmCB cb = new WhiteBaseOne09PalmCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PALM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne09PalmCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne09PalmCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne09PalmCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne09PalmCB cb = new WhiteBaseOne09PalmCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PALM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne09PalmCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne09PalmCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne09PalmCB cb = new WhiteBaseOne09PalmCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne09PalmCQ sq);

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
    protected WhiteBaseOne09PalmCB newMyCB() {
        return new WhiteBaseOne09PalmCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne09PalmCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
