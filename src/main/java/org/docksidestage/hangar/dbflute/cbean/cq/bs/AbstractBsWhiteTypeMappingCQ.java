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
 * The abstract condition-query of WHITE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteTypeMappingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_TYPE_MAPPING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingId The value of typeMappingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingId_Equal(Long typeMappingId) {
        doSetTypeMappingId_Equal(typeMappingId);
    }

    protected void doSetTypeMappingId_Equal(Long typeMappingId) {
        regTypeMappingId(CK_EQ, typeMappingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingId The value of typeMappingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingId_NotEqual(Long typeMappingId) {
        doSetTypeMappingId_NotEqual(typeMappingId);
    }

    protected void doSetTypeMappingId_NotEqual(Long typeMappingId) {
        regTypeMappingId(CK_NES, typeMappingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingId The value of typeMappingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingId_GreaterThan(Long typeMappingId) {
        regTypeMappingId(CK_GT, typeMappingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingId The value of typeMappingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingId_LessThan(Long typeMappingId) {
        regTypeMappingId(CK_LT, typeMappingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingId The value of typeMappingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingId_GreaterEqual(Long typeMappingId) {
        regTypeMappingId(CK_GE, typeMappingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingId The value of typeMappingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingId_LessEqual(Long typeMappingId) {
        regTypeMappingId(CK_LE, typeMappingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of typeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeMappingId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeMappingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of typeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeMappingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeMappingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeMappingId(), "TYPE_MAPPING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingIdList The collection of typeMappingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingId_InScope(Collection<Long> typeMappingIdList) {
        doSetTypeMappingId_InScope(typeMappingIdList);
    }

    protected void doSetTypeMappingId_InScope(Collection<Long> typeMappingIdList) {
        regINS(CK_INS, cTL(typeMappingIdList), xgetCValueTypeMappingId(), "TYPE_MAPPING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     * @param typeMappingIdList The collection of typeMappingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingId_NotInScope(Collection<Long> typeMappingIdList) {
        doSetTypeMappingId_NotInScope(typeMappingIdList);
    }

    protected void doSetTypeMappingId_NotInScope(Collection<Long> typeMappingIdList) {
        regINS(CK_NINS, cTL(typeMappingIdList), xgetCValueTypeMappingId(), "TYPE_MAPPING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setTypeMappingId_IsNull() { regTypeMappingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setTypeMappingId_IsNotNull() { regTypeMappingId(CK_ISNN, DOBJ); }

    protected void regTypeMappingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingId(), "TYPE_MAPPING_ID"); }
    protected abstract ConditionValue xgetCValueTypeMappingId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)}
     * @param typeMappingName The value of typeMappingName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingName_Equal(String typeMappingName) {
        doSetTypeMappingName_Equal(fRES(typeMappingName));
    }

    protected void doSetTypeMappingName_Equal(String typeMappingName) {
        regTypeMappingName(CK_EQ, typeMappingName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setTypeMappingName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeMappingName The value of typeMappingName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeMappingName_LikeSearch(String typeMappingName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeMappingName_LikeSearch(typeMappingName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setTypeMappingName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeMappingName The value of typeMappingName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTypeMappingName_LikeSearch(String typeMappingName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeMappingName), xgetCValueTypeMappingName(), "TYPE_MAPPING_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)}
     * @param typeMappingName The value of typeMappingName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeMappingName_NotLikeSearch(String typeMappingName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeMappingName_NotLikeSearch(typeMappingName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_NAME: {NotNull, VARCHAR(200)}
     * @param typeMappingName The value of typeMappingName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTypeMappingName_NotLikeSearch(String typeMappingName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeMappingName), xgetCValueTypeMappingName(), "TYPE_MAPPING_NAME", likeSearchOption);
    }

    protected void regTypeMappingName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingName(), "TYPE_MAPPING_NAME"); }
    protected abstract ConditionValue xgetCValueTypeMappingName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCount The value of typeMappingCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingCount_Equal(Integer typeMappingCount) {
        doSetTypeMappingCount_Equal(typeMappingCount);
    }

    protected void doSetTypeMappingCount_Equal(Integer typeMappingCount) {
        regTypeMappingCount(CK_EQ, typeMappingCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCount The value of typeMappingCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingCount_NotEqual(Integer typeMappingCount) {
        doSetTypeMappingCount_NotEqual(typeMappingCount);
    }

    protected void doSetTypeMappingCount_NotEqual(Integer typeMappingCount) {
        regTypeMappingCount(CK_NES, typeMappingCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCount The value of typeMappingCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingCount_GreaterThan(Integer typeMappingCount) {
        regTypeMappingCount(CK_GT, typeMappingCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCount The value of typeMappingCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingCount_LessThan(Integer typeMappingCount) {
        regTypeMappingCount(CK_LT, typeMappingCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCount The value of typeMappingCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingCount_GreaterEqual(Integer typeMappingCount) {
        regTypeMappingCount(CK_GE, typeMappingCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCount The value of typeMappingCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingCount_LessEqual(Integer typeMappingCount) {
        regTypeMappingCount(CK_LE, typeMappingCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param minNumber The min number of typeMappingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeMappingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeMappingCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeMappingCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param minNumber The min number of typeMappingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeMappingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeMappingCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeMappingCount(), "TYPE_MAPPING_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCountList The collection of typeMappingCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingCount_InScope(Collection<Integer> typeMappingCountList) {
        doSetTypeMappingCount_InScope(typeMappingCountList);
    }

    protected void doSetTypeMappingCount_InScope(Collection<Integer> typeMappingCountList) {
        regINS(CK_INS, cTL(typeMappingCountList), xgetCValueTypeMappingCount(), "TYPE_MAPPING_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     * @param typeMappingCountList The collection of typeMappingCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingCount_NotInScope(Collection<Integer> typeMappingCountList) {
        doSetTypeMappingCount_NotInScope(typeMappingCountList);
    }

    protected void doSetTypeMappingCount_NotInScope(Collection<Integer> typeMappingCountList) {
        regINS(CK_NINS, cTL(typeMappingCountList), xgetCValueTypeMappingCount(), "TYPE_MAPPING_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     */
    public void setTypeMappingCount_IsNull() { regTypeMappingCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_COUNT: {INTEGER(10)}
     */
    public void setTypeMappingCount_IsNotNull() { regTypeMappingCount(CK_ISNN, DOBJ); }

    protected void regTypeMappingCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingCount(), "TYPE_MAPPING_COUNT"); }
    protected abstract ConditionValue xgetCValueTypeMappingCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @param typeMappingDate The value of typeMappingDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDate_Equal(java.time.LocalDate typeMappingDate) {
        regTypeMappingDate(CK_EQ,  typeMappingDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @param typeMappingDate The value of typeMappingDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDate_GreaterThan(java.time.LocalDate typeMappingDate) {
        regTypeMappingDate(CK_GT,  typeMappingDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @param typeMappingDate The value of typeMappingDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDate_LessThan(java.time.LocalDate typeMappingDate) {
        regTypeMappingDate(CK_LT,  typeMappingDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @param typeMappingDate The value of typeMappingDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDate_GreaterEqual(java.time.LocalDate typeMappingDate) {
        regTypeMappingDate(CK_GE,  typeMappingDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * @param typeMappingDate The value of typeMappingDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDate_LessEqual(java.time.LocalDate typeMappingDate) {
        regTypeMappingDate(CK_LE, typeMappingDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * <pre>e.g. setTypeMappingDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeMappingDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeMappingDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     * <pre>e.g. setTypeMappingDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTypeMappingDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_MAPPING_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeMappingDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     */
    public void setTypeMappingDate_IsNull() { regTypeMappingDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATE: {DATE(10)}
     */
    public void setTypeMappingDate_IsNotNull() { regTypeMappingDate(CK_ISNN, DOBJ); }

    protected void regTypeMappingDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingDate(), "TYPE_MAPPING_DATE"); }
    protected abstract ConditionValue xgetCValueTypeMappingDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @param typeMappingDatetime The value of typeMappingDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDatetime_Equal(java.time.LocalDateTime typeMappingDatetime) {
        regTypeMappingDatetime(CK_EQ,  typeMappingDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @param typeMappingDatetime The value of typeMappingDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDatetime_GreaterThan(java.time.LocalDateTime typeMappingDatetime) {
        regTypeMappingDatetime(CK_GT,  typeMappingDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @param typeMappingDatetime The value of typeMappingDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDatetime_LessThan(java.time.LocalDateTime typeMappingDatetime) {
        regTypeMappingDatetime(CK_LT,  typeMappingDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @param typeMappingDatetime The value of typeMappingDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDatetime_GreaterEqual(java.time.LocalDateTime typeMappingDatetime) {
        regTypeMappingDatetime(CK_GE,  typeMappingDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * @param typeMappingDatetime The value of typeMappingDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingDatetime_LessEqual(java.time.LocalDateTime typeMappingDatetime) {
        regTypeMappingDatetime(CK_LE, typeMappingDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setTypeMappingDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeMappingDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeMappingDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setTypeMappingDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeMappingDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTypeMappingDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "TYPE_MAPPING_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeMappingDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setTypeMappingDatetime_IsNull() { regTypeMappingDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setTypeMappingDatetime_IsNotNull() { regTypeMappingDatetime(CK_ISNN, DOBJ); }

    protected void regTypeMappingDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingDatetime(), "TYPE_MAPPING_DATETIME"); }
    protected abstract ConditionValue xgetCValueTypeMappingDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @param pointMappingDate The value of pointMappingDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointMappingDate_Equal(java.time.LocalDateTime pointMappingDate) {
        regPointMappingDate(CK_EQ,  pointMappingDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @param pointMappingDate The value of pointMappingDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointMappingDate_GreaterThan(java.time.LocalDateTime pointMappingDate) {
        regPointMappingDate(CK_GT,  pointMappingDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @param pointMappingDate The value of pointMappingDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointMappingDate_LessThan(java.time.LocalDateTime pointMappingDate) {
        regPointMappingDate(CK_LT,  pointMappingDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @param pointMappingDate The value of pointMappingDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointMappingDate_GreaterEqual(java.time.LocalDateTime pointMappingDate) {
        regPointMappingDate(CK_GE,  pointMappingDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * @param pointMappingDate The value of pointMappingDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointMappingDate_LessEqual(java.time.LocalDateTime pointMappingDate) {
        regPointMappingDate(CK_LE, pointMappingDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * <pre>e.g. setPointMappingDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPointMappingDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPointMappingDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     * <pre>e.g. setPointMappingDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointMappingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPointMappingDate_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "POINT_MAPPING_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePointMappingDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     */
    public void setPointMappingDate_IsNull() { regPointMappingDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6)}
     */
    public void setPointMappingDate_IsNotNull() { regPointMappingDate(CK_ISNN, DOBJ); }

    protected void regPointMappingDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointMappingDate(), "POINT_MAPPING_DATE"); }
    protected abstract ConditionValue xgetCValuePointMappingDate();

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
    public HpSLCFunction<WhiteTypeMappingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteTypeMappingCB.class);
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
    public HpSLCFunction<WhiteTypeMappingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteTypeMappingCB.class);
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
    public HpSLCFunction<WhiteTypeMappingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteTypeMappingCB.class);
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
    public HpSLCFunction<WhiteTypeMappingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteTypeMappingCB.class);
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
    public HpSLCFunction<WhiteTypeMappingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteTypeMappingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTypeMappingCB&gt;() {
     *     public void query(WhiteTypeMappingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteTypeMappingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTypeMappingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteTypeMappingCQ sq);

    protected WhiteTypeMappingCB xcreateScalarConditionCB() {
        WhiteTypeMappingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTypeMappingCB xcreateScalarConditionPartitionByCB() {
        WhiteTypeMappingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTypeMappingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTypeMappingCB cb = new WhiteTypeMappingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TYPE_MAPPING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTypeMappingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTypeMappingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTypeMappingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTypeMappingCB cb = new WhiteTypeMappingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TYPE_MAPPING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTypeMappingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTypeMappingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteTypeMappingCB cb = new WhiteTypeMappingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTypeMappingCQ sq);

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
    protected WhiteTypeMappingCB newMyCB() {
        return new WhiteTypeMappingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteTypeMappingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
