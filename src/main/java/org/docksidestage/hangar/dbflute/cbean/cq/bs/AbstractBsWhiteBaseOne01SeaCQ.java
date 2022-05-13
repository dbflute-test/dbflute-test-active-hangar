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
 * The abstract condition-query of WHITE_BASE_ONE01_SEA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne01SeaCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne01SeaCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE01_SEA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
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
     * SEA_ID: {PK, NotNull, INTEGER(10)}
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
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @param seaId The value of seaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_GreaterThan(Integer seaId) {
        regSeaId(CK_GT, seaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @param seaId The value of seaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_LessThan(Integer seaId) {
        regSeaId(CK_LT, seaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @param seaId The value of seaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_GreaterEqual(Integer seaId) {
        regSeaId(CK_GE, seaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @param seaId The value of seaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_LessEqual(Integer seaId) {
        regSeaId(CK_LE, seaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
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
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSeaId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeaId(), "SEA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
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
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @param seaIdList The collection of seaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaId_NotInScope(Collection<Integer> seaIdList) {
        doSetSeaId_NotInScope(seaIdList);
    }

    protected void doSetSeaId_NotInScope(Collection<Integer> seaIdList) {
        regINS(CK_NINS, cTL(seaIdList), xgetCValueSeaId(), "SEA_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SEA_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by SEA_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteBaseList for 'exists'. (NotNull)
     */
    public void existsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSeaId_ExistsReferrer_WhiteBaseList(cb.query());
        registerExistsReferrer(cb.query(), "SEA_ID", "SEA_ID", pp, "whiteBaseList");
    }
    public abstract String keepSeaId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SEA_ID from WHITE_BASE_ONE01_SEA_MAGICLAMP where ...)} <br>
     * WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteBaseOne01SeaMagiclamp</span>(magiclampCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     magiclampCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteBaseOne01SeaMagiclampList for 'exists'. (NotNull)
     */
    public void existsWhiteBaseOne01SeaMagiclamp(SubQuery<WhiteBaseOne01SeaMagiclampCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSeaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList(cb.query());
        registerExistsReferrer(cb.query(), "SEA_ID", "SEA_ID", pp, "whiteBaseOne01SeaMagiclampList");
    }
    public abstract String keepSeaId_ExistsReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SEA_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by SEA_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SeaId_NotExistsReferrer_WhiteBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSeaId_NotExistsReferrer_WhiteBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "SEA_ID", "SEA_ID", pp, "whiteBaseList");
    }
    public abstract String keepSeaId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SEA_ID from WHITE_BASE_ONE01_SEA_MAGICLAMP where ...)} <br>
     * WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBaseOne01SeaMagiclamp</span>(magiclampCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     magiclampCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SeaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBaseOne01SeaMagiclamp(SubQuery<WhiteBaseOne01SeaMagiclampCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSeaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList(cb.query());
        registerNotExistsReferrer(cb.query(), "SEA_ID", "SEA_ID", pp, "whiteBaseOne01SeaMagiclampList");
    }
    public abstract String keepSeaId_NotExistsReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq);

    public void xsderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSeaId_SpecifyDerivedReferrer_WhiteBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SEA_ID", "SEA_ID", pp, "whiteBaseList", al, op);
    }
    public abstract String keepSeaId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);

    public void xsderiveWhiteBaseOne01SeaMagiclampList(String fn, SubQuery<WhiteBaseOne01SeaMagiclampCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSeaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SEA_ID", "SEA_ID", pp, "whiteBaseOne01SeaMagiclampList", al, op);
    }
    public abstract String keepSeaId_SpecifyDerivedReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE where ...)} <br>
     * WHITE_BASE by SEA_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteBase()</span>.<span style="color: #CC4747">max</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     baseCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseCB> derivedWhiteBase() {
        return xcreateQDRFunctionWhiteBaseList();
    }
    protected HpQDRFunction<WhiteBaseCB> xcreateQDRFunctionWhiteBaseList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteBaseList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSeaId_QueryDerivedReferrer_WhiteBaseList(cb.query()); String prpp = keepSeaId_QueryDerivedReferrer_WhiteBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SEA_ID", "SEA_ID", sqpp, "whiteBaseList", rd, vl, prpp, op);
    }
    public abstract String keepSeaId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);
    public abstract String keepSeaId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE_ONE01_SEA_MAGICLAMP where ...)} <br>
     * WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteBaseOne01SeaMagiclamp()</span>.<span style="color: #CC4747">max</span>(magiclampCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     magiclampCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     magiclampCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne01SeaMagiclampCB> derivedWhiteBaseOne01SeaMagiclamp() {
        return xcreateQDRFunctionWhiteBaseOne01SeaMagiclampList();
    }
    protected HpQDRFunction<WhiteBaseOne01SeaMagiclampCB> xcreateQDRFunctionWhiteBaseOne01SeaMagiclampList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteBaseOne01SeaMagiclampList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteBaseOne01SeaMagiclampList(String fn, SubQuery<WhiteBaseOne01SeaMagiclampCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaMagiclampCB cb = new WhiteBaseOne01SeaMagiclampCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList(cb.query()); String prpp = keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SEA_ID", "SEA_ID", sqpp, "whiteBaseOne01SeaMagiclampList", rd, vl, prpp, op);
    }
    public abstract String keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampList(WhiteBaseOne01SeaMagiclampCQ sq);
    public abstract String keepSeaId_QueryDerivedReferrer_WhiteBaseOne01SeaMagiclampListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setSeaId_IsNull() { regSeaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setSeaId_IsNotNull() { regSeaId(CK_ISNN, DOBJ); }

    protected void regSeaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeaId(), "SEA_ID"); }
    protected abstract ConditionValue xgetCValueSeaId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)}
     * @param seaName The value of seaName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaName_Equal(String seaName) {
        doSetSeaName_Equal(fRES(seaName));
    }

    protected void doSetSeaName_Equal(String seaName) {
        regSeaName(CK_EQ, seaName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSeaName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param seaName The value of seaName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSeaName_LikeSearch(String seaName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSeaName_LikeSearch(seaName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setSeaName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param seaName The value of seaName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSeaName_LikeSearch(String seaName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(seaName), xgetCValueSeaName(), "SEA_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)}
     * @param seaName The value of seaName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSeaName_NotLikeSearch(String seaName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSeaName_NotLikeSearch(seaName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEA_NAME: {NotNull, VARCHAR(200)}
     * @param seaName The value of seaName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSeaName_NotLikeSearch(String seaName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(seaName), xgetCValueSeaName(), "SEA_NAME", likeSearchOption);
    }

    protected void regSeaName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeaName(), "SEA_NAME"); }
    protected abstract ConditionValue xgetCValueSeaName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayId The value of broadwayId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_Equal(Integer broadwayId) {
        doSetBroadwayId_Equal(broadwayId);
    }

    protected void doSetBroadwayId_Equal(Integer broadwayId) {
        regBroadwayId(CK_EQ, broadwayId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayId The value of broadwayId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_NotEqual(Integer broadwayId) {
        doSetBroadwayId_NotEqual(broadwayId);
    }

    protected void doSetBroadwayId_NotEqual(Integer broadwayId) {
        regBroadwayId(CK_NES, broadwayId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayId The value of broadwayId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_GreaterThan(Integer broadwayId) {
        regBroadwayId(CK_GT, broadwayId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayId The value of broadwayId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_LessThan(Integer broadwayId) {
        regBroadwayId(CK_LT, broadwayId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayId The value of broadwayId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_GreaterEqual(Integer broadwayId) {
        regBroadwayId(CK_GE, broadwayId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayId The value of broadwayId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBroadwayId_LessEqual(Integer broadwayId) {
        regBroadwayId(CK_LE, broadwayId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param minNumber The min number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBroadwayId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBroadwayId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param minNumber The min number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of broadwayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBroadwayId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBroadwayId(), "BROADWAY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayIdList The collection of broadwayId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBroadwayId_InScope(Collection<Integer> broadwayIdList) {
        doSetBroadwayId_InScope(broadwayIdList);
    }

    protected void doSetBroadwayId_InScope(Collection<Integer> broadwayIdList) {
        regINS(CK_INS, cTL(broadwayIdList), xgetCValueBroadwayId(), "BROADWAY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @param broadwayIdList The collection of broadwayId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBroadwayId_NotInScope(Collection<Integer> broadwayIdList) {
        doSetBroadwayId_NotInScope(broadwayIdList);
    }

    protected void doSetBroadwayId_NotInScope(Collection<Integer> broadwayIdList) {
        regINS(CK_NINS, cTL(broadwayIdList), xgetCValueBroadwayId(), "BROADWAY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     */
    public void setBroadwayId_IsNull() { regBroadwayId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     */
    public void setBroadwayId_IsNotNull() { regBroadwayId(CK_ISNN, DOBJ); }

    protected void regBroadwayId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBroadwayId(), "BROADWAY_ID"); }
    protected abstract ConditionValue xgetCValueBroadwayId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideId The value of docksideId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_Equal(Integer docksideId) {
        doSetDocksideId_Equal(docksideId);
    }

    protected void doSetDocksideId_Equal(Integer docksideId) {
        regDocksideId(CK_EQ, docksideId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideId The value of docksideId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_NotEqual(Integer docksideId) {
        doSetDocksideId_NotEqual(docksideId);
    }

    protected void doSetDocksideId_NotEqual(Integer docksideId) {
        regDocksideId(CK_NES, docksideId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideId The value of docksideId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_GreaterThan(Integer docksideId) {
        regDocksideId(CK_GT, docksideId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideId The value of docksideId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_LessThan(Integer docksideId) {
        regDocksideId(CK_LT, docksideId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideId The value of docksideId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_GreaterEqual(Integer docksideId) {
        regDocksideId(CK_GE, docksideId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideId The value of docksideId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDocksideId_LessEqual(Integer docksideId) {
        regDocksideId(CK_LE, docksideId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param minNumber The min number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDocksideId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDocksideId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param minNumber The min number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of docksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDocksideId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDocksideId(), "DOCKSIDE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideIdList The collection of docksideId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocksideId_InScope(Collection<Integer> docksideIdList) {
        doSetDocksideId_InScope(docksideIdList);
    }

    protected void doSetDocksideId_InScope(Collection<Integer> docksideIdList) {
        regINS(CK_INS, cTL(docksideIdList), xgetCValueDocksideId(), "DOCKSIDE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @param docksideIdList The collection of docksideId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDocksideId_NotInScope(Collection<Integer> docksideIdList) {
        doSetDocksideId_NotInScope(docksideIdList);
    }

    protected void doSetDocksideId_NotInScope(Collection<Integer> docksideIdList) {
        regINS(CK_NINS, cTL(docksideIdList), xgetCValueDocksideId(), "DOCKSIDE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     */
    public void setDocksideId_IsNull() { regDocksideId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     */
    public void setDocksideId_IsNotNull() { regDocksideId(CK_ISNN, DOBJ); }

    protected void regDocksideId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDocksideId(), "DOCKSIDE_ID"); }
    protected abstract ConditionValue xgetCValueDocksideId();

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
    public HpSLCFunction<WhiteBaseOne01SeaCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne01SeaCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne01SeaCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne01SeaCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne01SeaCB.class);
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
    public HpSLCFunction<WhiteBaseOne01SeaCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne01SeaCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne01SeaCB&gt;() {
     *     public void query(WhiteBaseOne01SeaCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne01SeaCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne01SeaCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne01SeaCQ sq);

    protected WhiteBaseOne01SeaCB xcreateScalarConditionCB() {
        WhiteBaseOne01SeaCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne01SeaCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne01SeaCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne01SeaCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SEA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne01SeaCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne01SeaCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne01SeaCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SEA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne01SeaCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne01SeaCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne01SeaCQ sq);

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
    protected WhiteBaseOne01SeaCB newMyCB() {
        return new WhiteBaseOne01SeaCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne01SeaCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
