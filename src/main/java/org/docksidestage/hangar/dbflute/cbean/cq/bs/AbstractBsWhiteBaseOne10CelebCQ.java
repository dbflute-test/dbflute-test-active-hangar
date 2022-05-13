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
 * The abstract condition-query of WHITE_BASE_ONE10_CELEB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne10CelebCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne10CelebCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE10_CELEB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebId The value of celebId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCelebId_Equal(Integer celebId) {
        doSetCelebId_Equal(celebId);
    }

    protected void doSetCelebId_Equal(Integer celebId) {
        regCelebId(CK_EQ, celebId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebId The value of celebId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCelebId_NotEqual(Integer celebId) {
        doSetCelebId_NotEqual(celebId);
    }

    protected void doSetCelebId_NotEqual(Integer celebId) {
        regCelebId(CK_NES, celebId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebId The value of celebId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCelebId_GreaterThan(Integer celebId) {
        regCelebId(CK_GT, celebId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebId The value of celebId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCelebId_LessThan(Integer celebId) {
        regCelebId(CK_LT, celebId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebId The value of celebId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCelebId_GreaterEqual(Integer celebId) {
        regCelebId(CK_GE, celebId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebId The value of celebId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCelebId_LessEqual(Integer celebId) {
        regCelebId(CK_LE, celebId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of celebId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of celebId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCelebId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCelebId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of celebId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of celebId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCelebId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCelebId(), "CELEB_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebIdList The collection of celebId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCelebId_InScope(Collection<Integer> celebIdList) {
        doSetCelebId_InScope(celebIdList);
    }

    protected void doSetCelebId_InScope(Collection<Integer> celebIdList) {
        regINS(CK_INS, cTL(celebIdList), xgetCValueCelebId(), "CELEB_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     * @param celebIdList The collection of celebId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCelebId_NotInScope(Collection<Integer> celebIdList) {
        doSetCelebId_NotInScope(celebIdList);
    }

    protected void doSetCelebId_NotInScope(Collection<Integer> celebIdList) {
        regINS(CK_NINS, cTL(celebIdList), xgetCValueCelebId(), "CELEB_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setCelebId_IsNull() { regCelebId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CELEB_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setCelebId_IsNotNull() { regCelebId(CK_ISNN, DOBJ); }

    protected void regCelebId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCelebId(), "CELEB_ID"); }
    protected abstract ConditionValue xgetCValueCelebId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CELEB_NAME: {NotNull, VARCHAR(200)}
     * @param celebName The value of celebName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCelebName_Equal(String celebName) {
        doSetCelebName_Equal(fRES(celebName));
    }

    protected void doSetCelebName_Equal(String celebName) {
        regCelebName(CK_EQ, celebName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CELEB_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCelebName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param celebName The value of celebName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCelebName_LikeSearch(String celebName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCelebName_LikeSearch(celebName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CELEB_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCelebName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param celebName The value of celebName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCelebName_LikeSearch(String celebName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(celebName), xgetCValueCelebName(), "CELEB_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CELEB_NAME: {NotNull, VARCHAR(200)}
     * @param celebName The value of celebName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCelebName_NotLikeSearch(String celebName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCelebName_NotLikeSearch(celebName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CELEB_NAME: {NotNull, VARCHAR(200)}
     * @param celebName The value of celebName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCelebName_NotLikeSearch(String celebName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(celebName), xgetCValueCelebName(), "CELEB_NAME", likeSearchOption);
    }

    protected void regCelebName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCelebName(), "CELEB_NAME"); }
    protected abstract ConditionValue xgetCValueCelebName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
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
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
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
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterThan(Integer baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessThan(Integer baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterEqual(Integer baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     * @param baseId The value of baseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessEqual(Integer baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
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
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
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
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     * @param baseIdList The collection of baseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_NotInScope(Collection<Integer> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Integer> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     */
    public void setBaseId_IsNull() { regBaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE}
     */
    public void setBaseId_IsNotNull() { regBaseId(CK_ISNN, DOBJ); }

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
    public HpSLCFunction<WhiteBaseOne10CelebCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne10CelebCB.class);
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
    public HpSLCFunction<WhiteBaseOne10CelebCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne10CelebCB.class);
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
    public HpSLCFunction<WhiteBaseOne10CelebCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne10CelebCB.class);
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
    public HpSLCFunction<WhiteBaseOne10CelebCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne10CelebCB.class);
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
    public HpSLCFunction<WhiteBaseOne10CelebCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne10CelebCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne10CelebCB&gt;() {
     *     public void query(WhiteBaseOne10CelebCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne10CelebCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne10CelebCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne10CelebCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne10CelebCQ sq);

    protected WhiteBaseOne10CelebCB xcreateScalarConditionCB() {
        WhiteBaseOne10CelebCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne10CelebCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne10CelebCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne10CelebCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne10CelebCB cb = new WhiteBaseOne10CelebCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CELEB_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne10CelebCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne10CelebCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne10CelebCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne10CelebCB cb = new WhiteBaseOne10CelebCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CELEB_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne10CelebCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne10CelebCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne10CelebCB cb = new WhiteBaseOne10CelebCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne10CelebCQ sq);

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
    protected WhiteBaseOne10CelebCB newMyCB() {
        return new WhiteBaseOne10CelebCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne10CelebCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
