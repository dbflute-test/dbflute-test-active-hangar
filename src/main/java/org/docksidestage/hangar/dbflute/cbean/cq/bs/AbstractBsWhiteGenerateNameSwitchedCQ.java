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
 * The abstract condition-query of WHITE_GENERATE_NAME_SWITCHED.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteGenerateNameSwitchedCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteGenerateNameSwitchedCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_GENERATE_NAME_SWITCHED";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedId The value of generateNameSwitchedId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_Equal(Long generateNameSwitchedId) {
        doSetGenerateNameSwitchedId_Equal(generateNameSwitchedId);
    }

    protected void doSetGenerateNameSwitchedId_Equal(Long generateNameSwitchedId) {
        regGenerateNameSwitchedId(CK_EQ, generateNameSwitchedId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedId The value of generateNameSwitchedId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_NotEqual(Long generateNameSwitchedId) {
        doSetGenerateNameSwitchedId_NotEqual(generateNameSwitchedId);
    }

    protected void doSetGenerateNameSwitchedId_NotEqual(Long generateNameSwitchedId) {
        regGenerateNameSwitchedId(CK_NES, generateNameSwitchedId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedId The value of generateNameSwitchedId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_GreaterThan(Long generateNameSwitchedId) {
        regGenerateNameSwitchedId(CK_GT, generateNameSwitchedId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedId The value of generateNameSwitchedId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_LessThan(Long generateNameSwitchedId) {
        regGenerateNameSwitchedId(CK_LT, generateNameSwitchedId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedId The value of generateNameSwitchedId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_GreaterEqual(Long generateNameSwitchedId) {
        regGenerateNameSwitchedId(CK_GE, generateNameSwitchedId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedId The value of generateNameSwitchedId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_LessEqual(Long generateNameSwitchedId) {
        regGenerateNameSwitchedId(CK_LE, generateNameSwitchedId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of generateNameSwitchedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of generateNameSwitchedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenerateNameSwitchedId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenerateNameSwitchedId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of generateNameSwitchedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of generateNameSwitchedId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGenerateNameSwitchedId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenerateNameSwitchedId(), "GENERATE_NAME_SWITCHED_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedIdList The collection of generateNameSwitchedId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_InScope(Collection<Long> generateNameSwitchedIdList) {
        doSetGenerateNameSwitchedId_InScope(generateNameSwitchedIdList);
    }

    protected void doSetGenerateNameSwitchedId_InScope(Collection<Long> generateNameSwitchedIdList) {
        regINS(CK_INS, cTL(generateNameSwitchedIdList), xgetCValueGenerateNameSwitchedId(), "GENERATE_NAME_SWITCHED_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @param generateNameSwitchedIdList The collection of generateNameSwitchedId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedId_NotInScope(Collection<Long> generateNameSwitchedIdList) {
        doSetGenerateNameSwitchedId_NotInScope(generateNameSwitchedIdList);
    }

    protected void doSetGenerateNameSwitchedId_NotInScope(Collection<Long> generateNameSwitchedIdList) {
        regINS(CK_NINS, cTL(generateNameSwitchedIdList), xgetCValueGenerateNameSwitchedId(), "GENERATE_NAME_SWITCHED_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenerateNameSwitchedId_IsNull() { regGenerateNameSwitchedId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setGenerateNameSwitchedId_IsNotNull() { regGenerateNameSwitchedId(CK_ISNN, DOBJ); }

    protected void regGenerateNameSwitchedId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenerateNameSwitchedId(), "GENERATE_NAME_SWITCHED_ID"); }
    protected abstract ConditionValue xgetCValueGenerateNameSwitchedId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)}
     * @param generateNameSwitchedName The value of generateNameSwitchedName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedName_Equal(String generateNameSwitchedName) {
        doSetGenerateNameSwitchedName_Equal(fRES(generateNameSwitchedName));
    }

    protected void doSetGenerateNameSwitchedName_Equal(String generateNameSwitchedName) {
        regGenerateNameSwitchedName(CK_EQ, generateNameSwitchedName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setGenerateNameSwitchedName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param generateNameSwitchedName The value of generateNameSwitchedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenerateNameSwitchedName_LikeSearch(String generateNameSwitchedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenerateNameSwitchedName_LikeSearch(generateNameSwitchedName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setGenerateNameSwitchedName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param generateNameSwitchedName The value of generateNameSwitchedName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGenerateNameSwitchedName_LikeSearch(String generateNameSwitchedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generateNameSwitchedName), xgetCValueGenerateNameSwitchedName(), "GENERATE_NAME_SWITCHED_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)}
     * @param generateNameSwitchedName The value of generateNameSwitchedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenerateNameSwitchedName_NotLikeSearch(String generateNameSwitchedName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenerateNameSwitchedName_NotLikeSearch(generateNameSwitchedName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)}
     * @param generateNameSwitchedName The value of generateNameSwitchedName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGenerateNameSwitchedName_NotLikeSearch(String generateNameSwitchedName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generateNameSwitchedName), xgetCValueGenerateNameSwitchedName(), "GENERATE_NAME_SWITCHED_NAME", likeSearchOption);
    }

    protected void regGenerateNameSwitchedName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenerateNameSwitchedName(), "GENERATE_NAME_SWITCHED_NAME"); }
    protected abstract ConditionValue xgetCValueGenerateNameSwitchedName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCount The value of generateNameSwitchedCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_Equal(Integer generateNameSwitchedCount) {
        doSetGenerateNameSwitchedCount_Equal(generateNameSwitchedCount);
    }

    protected void doSetGenerateNameSwitchedCount_Equal(Integer generateNameSwitchedCount) {
        regGenerateNameSwitchedCount(CK_EQ, generateNameSwitchedCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCount The value of generateNameSwitchedCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_NotEqual(Integer generateNameSwitchedCount) {
        doSetGenerateNameSwitchedCount_NotEqual(generateNameSwitchedCount);
    }

    protected void doSetGenerateNameSwitchedCount_NotEqual(Integer generateNameSwitchedCount) {
        regGenerateNameSwitchedCount(CK_NES, generateNameSwitchedCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCount The value of generateNameSwitchedCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_GreaterThan(Integer generateNameSwitchedCount) {
        regGenerateNameSwitchedCount(CK_GT, generateNameSwitchedCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCount The value of generateNameSwitchedCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_LessThan(Integer generateNameSwitchedCount) {
        regGenerateNameSwitchedCount(CK_LT, generateNameSwitchedCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCount The value of generateNameSwitchedCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_GreaterEqual(Integer generateNameSwitchedCount) {
        regGenerateNameSwitchedCount(CK_GE, generateNameSwitchedCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCount The value of generateNameSwitchedCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_LessEqual(Integer generateNameSwitchedCount) {
        regGenerateNameSwitchedCount(CK_LE, generateNameSwitchedCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param minNumber The min number of generateNameSwitchedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of generateNameSwitchedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenerateNameSwitchedCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenerateNameSwitchedCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param minNumber The min number of generateNameSwitchedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of generateNameSwitchedCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGenerateNameSwitchedCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenerateNameSwitchedCount(), "GENERATE_NAME_SWITCHED_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCountList The collection of generateNameSwitchedCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_InScope(Collection<Integer> generateNameSwitchedCountList) {
        doSetGenerateNameSwitchedCount_InScope(generateNameSwitchedCountList);
    }

    protected void doSetGenerateNameSwitchedCount_InScope(Collection<Integer> generateNameSwitchedCountList) {
        regINS(CK_INS, cTL(generateNameSwitchedCountList), xgetCValueGenerateNameSwitchedCount(), "GENERATE_NAME_SWITCHED_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @param generateNameSwitchedCountList The collection of generateNameSwitchedCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedCount_NotInScope(Collection<Integer> generateNameSwitchedCountList) {
        doSetGenerateNameSwitchedCount_NotInScope(generateNameSwitchedCountList);
    }

    protected void doSetGenerateNameSwitchedCount_NotInScope(Collection<Integer> generateNameSwitchedCountList) {
        regINS(CK_NINS, cTL(generateNameSwitchedCountList), xgetCValueGenerateNameSwitchedCount(), "GENERATE_NAME_SWITCHED_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     */
    public void setGenerateNameSwitchedCount_IsNull() { regGenerateNameSwitchedCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     */
    public void setGenerateNameSwitchedCount_IsNotNull() { regGenerateNameSwitchedCount(CK_ISNN, DOBJ); }

    protected void regGenerateNameSwitchedCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenerateNameSwitchedCount(), "GENERATE_NAME_SWITCHED_COUNT"); }
    protected abstract ConditionValue xgetCValueGenerateNameSwitchedCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @param generateNameSwitchedDate The value of generateNameSwitchedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDate_Equal(java.time.LocalDate generateNameSwitchedDate) {
        regGenerateNameSwitchedDate(CK_EQ,  generateNameSwitchedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @param generateNameSwitchedDate The value of generateNameSwitchedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDate_GreaterThan(java.time.LocalDate generateNameSwitchedDate) {
        regGenerateNameSwitchedDate(CK_GT,  generateNameSwitchedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @param generateNameSwitchedDate The value of generateNameSwitchedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDate_LessThan(java.time.LocalDate generateNameSwitchedDate) {
        regGenerateNameSwitchedDate(CK_LT,  generateNameSwitchedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @param generateNameSwitchedDate The value of generateNameSwitchedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDate_GreaterEqual(java.time.LocalDate generateNameSwitchedDate) {
        regGenerateNameSwitchedDate(CK_GE,  generateNameSwitchedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @param generateNameSwitchedDate The value of generateNameSwitchedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDate_LessEqual(java.time.LocalDate generateNameSwitchedDate) {
        regGenerateNameSwitchedDate(CK_LE, generateNameSwitchedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * <pre>e.g. setGenerateNameSwitchedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setGenerateNameSwitchedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setGenerateNameSwitchedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * <pre>e.g. setGenerateNameSwitchedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setGenerateNameSwitchedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "GENERATE_NAME_SWITCHED_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueGenerateNameSwitchedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     */
    public void setGenerateNameSwitchedDate_IsNull() { regGenerateNameSwitchedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     */
    public void setGenerateNameSwitchedDate_IsNotNull() { regGenerateNameSwitchedDate(CK_ISNN, DOBJ); }

    protected void regGenerateNameSwitchedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenerateNameSwitchedDate(), "GENERATE_NAME_SWITCHED_DATE"); }
    protected abstract ConditionValue xgetCValueGenerateNameSwitchedDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @param generateNameSwitchedDatetime The value of generateNameSwitchedDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDatetime_Equal(java.time.LocalDateTime generateNameSwitchedDatetime) {
        regGenerateNameSwitchedDatetime(CK_EQ,  generateNameSwitchedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @param generateNameSwitchedDatetime The value of generateNameSwitchedDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDatetime_GreaterThan(java.time.LocalDateTime generateNameSwitchedDatetime) {
        regGenerateNameSwitchedDatetime(CK_GT,  generateNameSwitchedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @param generateNameSwitchedDatetime The value of generateNameSwitchedDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDatetime_LessThan(java.time.LocalDateTime generateNameSwitchedDatetime) {
        regGenerateNameSwitchedDatetime(CK_LT,  generateNameSwitchedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @param generateNameSwitchedDatetime The value of generateNameSwitchedDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDatetime_GreaterEqual(java.time.LocalDateTime generateNameSwitchedDatetime) {
        regGenerateNameSwitchedDatetime(CK_GE,  generateNameSwitchedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @param generateNameSwitchedDatetime The value of generateNameSwitchedDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenerateNameSwitchedDatetime_LessEqual(java.time.LocalDateTime generateNameSwitchedDatetime) {
        regGenerateNameSwitchedDatetime(CK_LE, generateNameSwitchedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setGenerateNameSwitchedDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setGenerateNameSwitchedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setGenerateNameSwitchedDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setGenerateNameSwitchedDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of generateNameSwitchedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setGenerateNameSwitchedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "GENERATE_NAME_SWITCHED_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueGenerateNameSwitchedDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setGenerateNameSwitchedDatetime_IsNull() { regGenerateNameSwitchedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setGenerateNameSwitchedDatetime_IsNotNull() { regGenerateNameSwitchedDatetime(CK_ISNN, DOBJ); }

    protected void regGenerateNameSwitchedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenerateNameSwitchedDatetime(), "GENERATE_NAME_SWITCHED_DATETIME"); }
    protected abstract ConditionValue xgetCValueGenerateNameSwitchedDatetime();

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
    public HpSLCFunction<WhiteGenerateNameSwitchedCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteGenerateNameSwitchedCB.class);
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
    public HpSLCFunction<WhiteGenerateNameSwitchedCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteGenerateNameSwitchedCB.class);
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
    public HpSLCFunction<WhiteGenerateNameSwitchedCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteGenerateNameSwitchedCB.class);
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
    public HpSLCFunction<WhiteGenerateNameSwitchedCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteGenerateNameSwitchedCB.class);
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
    public HpSLCFunction<WhiteGenerateNameSwitchedCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteGenerateNameSwitchedCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteGenerateNameSwitchedCB&gt;() {
     *     public void query(WhiteGenerateNameSwitchedCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteGenerateNameSwitchedCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteGenerateNameSwitchedCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGenerateNameSwitchedCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteGenerateNameSwitchedCQ sq);

    protected WhiteGenerateNameSwitchedCB xcreateScalarConditionCB() {
        WhiteGenerateNameSwitchedCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteGenerateNameSwitchedCB xcreateScalarConditionPartitionByCB() {
        WhiteGenerateNameSwitchedCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteGenerateNameSwitchedCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGenerateNameSwitchedCB cb = new WhiteGenerateNameSwitchedCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "GENERATE_NAME_SWITCHED_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteGenerateNameSwitchedCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteGenerateNameSwitchedCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteGenerateNameSwitchedCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteGenerateNameSwitchedCB cb = new WhiteGenerateNameSwitchedCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "GENERATE_NAME_SWITCHED_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteGenerateNameSwitchedCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteGenerateNameSwitchedCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteGenerateNameSwitchedCB cb = new WhiteGenerateNameSwitchedCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteGenerateNameSwitchedCQ sq);

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
    protected WhiteGenerateNameSwitchedCB newMyCB() {
        return new WhiteGenerateNameSwitchedCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteGenerateNameSwitchedCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
