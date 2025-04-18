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
 * The abstract condition-query of WHITE_NOT_NULL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteNotNullCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteNotNullCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_NOT_NULL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullId The value of notNullId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullId_Equal(Long notNullId) {
        doSetNotNullId_Equal(notNullId);
    }

    protected void doSetNotNullId_Equal(Long notNullId) {
        regNotNullId(CK_EQ, notNullId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullId The value of notNullId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullId_NotEqual(Long notNullId) {
        doSetNotNullId_NotEqual(notNullId);
    }

    protected void doSetNotNullId_NotEqual(Long notNullId) {
        regNotNullId(CK_NES, notNullId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullId The value of notNullId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullId_GreaterThan(Long notNullId) {
        regNotNullId(CK_GT, notNullId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullId The value of notNullId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullId_LessThan(Long notNullId) {
        regNotNullId(CK_LT, notNullId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullId The value of notNullId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullId_GreaterEqual(Long notNullId) {
        regNotNullId(CK_GE, notNullId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullId The value of notNullId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullId_LessEqual(Long notNullId) {
        regNotNullId(CK_LE, notNullId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of notNullId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notNullId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNotNullId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNotNullId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of notNullId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notNullId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNotNullId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNotNullId(), "NOT_NULL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullIdList The collection of notNullId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotNullId_InScope(Collection<Long> notNullIdList) {
        doSetNotNullId_InScope(notNullIdList);
    }

    protected void doSetNotNullId_InScope(Collection<Long> notNullIdList) {
        regINS(CK_INS, cTL(notNullIdList), xgetCValueNotNullId(), "NOT_NULL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @param notNullIdList The collection of notNullId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotNullId_NotInScope(Collection<Long> notNullIdList) {
        doSetNotNullId_NotInScope(notNullIdList);
    }

    protected void doSetNotNullId_NotInScope(Collection<Long> notNullIdList) {
        regINS(CK_NINS, cTL(notNullIdList), xgetCValueNotNullId(), "NOT_NULL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setNotNullId_IsNull() { regNotNullId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setNotNullId_IsNotNull() { regNotNullId(CK_ISNN, DOBJ); }

    protected void regNotNullId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotNullId(), "NOT_NULL_ID"); }
    protected abstract ConditionValue xgetCValueNotNullId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)}
     * @param notNullName The value of notNullName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotNullName_Equal(String notNullName) {
        doSetNotNullName_Equal(fRES(notNullName));
    }

    protected void doSetNotNullName_Equal(String notNullName) {
        regNotNullName(CK_EQ, notNullName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setNotNullName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param notNullName The value of notNullName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNotNullName_LikeSearch(String notNullName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNotNullName_LikeSearch(notNullName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setNotNullName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notNullName The value of notNullName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNotNullName_LikeSearch(String notNullName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notNullName), xgetCValueNotNullName(), "NOT_NULL_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)}
     * @param notNullName The value of notNullName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNotNullName_NotLikeSearch(String notNullName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNotNullName_NotLikeSearch(notNullName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)}
     * @param notNullName The value of notNullName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNotNullName_NotLikeSearch(String notNullName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notNullName), xgetCValueNotNullName(), "NOT_NULL_NAME", likeSearchOption);
    }

    protected void regNotNullName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotNullName(), "NOT_NULL_NAME"); }
    protected abstract ConditionValue xgetCValueNotNullName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCount The value of notNullCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullCount_Equal(Integer notNullCount) {
        doSetNotNullCount_Equal(notNullCount);
    }

    protected void doSetNotNullCount_Equal(Integer notNullCount) {
        regNotNullCount(CK_EQ, notNullCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCount The value of notNullCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullCount_NotEqual(Integer notNullCount) {
        doSetNotNullCount_NotEqual(notNullCount);
    }

    protected void doSetNotNullCount_NotEqual(Integer notNullCount) {
        regNotNullCount(CK_NES, notNullCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCount The value of notNullCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullCount_GreaterThan(Integer notNullCount) {
        regNotNullCount(CK_GT, notNullCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCount The value of notNullCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullCount_LessThan(Integer notNullCount) {
        regNotNullCount(CK_LT, notNullCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCount The value of notNullCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullCount_GreaterEqual(Integer notNullCount) {
        regNotNullCount(CK_GE, notNullCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCount The value of notNullCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullCount_LessEqual(Integer notNullCount) {
        regNotNullCount(CK_LE, notNullCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param minNumber The min number of notNullCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notNullCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNotNullCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNotNullCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param minNumber The min number of notNullCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notNullCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNotNullCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNotNullCount(), "NOT_NULL_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCountList The collection of notNullCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotNullCount_InScope(Collection<Integer> notNullCountList) {
        doSetNotNullCount_InScope(notNullCountList);
    }

    protected void doSetNotNullCount_InScope(Collection<Integer> notNullCountList) {
        regINS(CK_INS, cTL(notNullCountList), xgetCValueNotNullCount(), "NOT_NULL_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @param notNullCountList The collection of notNullCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotNullCount_NotInScope(Collection<Integer> notNullCountList) {
        doSetNotNullCount_NotInScope(notNullCountList);
    }

    protected void doSetNotNullCount_NotInScope(Collection<Integer> notNullCountList) {
        regINS(CK_NINS, cTL(notNullCountList), xgetCValueNotNullCount(), "NOT_NULL_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     */
    public void setNotNullCount_IsNull() { regNotNullCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_COUNT: {INTEGER(10)}
     */
    public void setNotNullCount_IsNotNull() { regNotNullCount(CK_ISNN, DOBJ); }

    protected void regNotNullCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotNullCount(), "NOT_NULL_COUNT"); }
    protected abstract ConditionValue xgetCValueNotNullCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @param notNullDate The value of notNullDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDate_Equal(java.time.LocalDate notNullDate) {
        regNotNullDate(CK_EQ,  notNullDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @param notNullDate The value of notNullDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDate_GreaterThan(java.time.LocalDate notNullDate) {
        regNotNullDate(CK_GT,  notNullDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @param notNullDate The value of notNullDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDate_LessThan(java.time.LocalDate notNullDate) {
        regNotNullDate(CK_LT,  notNullDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @param notNullDate The value of notNullDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDate_GreaterEqual(java.time.LocalDate notNullDate) {
        regNotNullDate(CK_GE,  notNullDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * @param notNullDate The value of notNullDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDate_LessEqual(java.time.LocalDate notNullDate) {
        regNotNullDate(CK_LE, notNullDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * <pre>e.g. setNotNullDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNotNullDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNotNullDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     * <pre>e.g. setNotNullDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNotNullDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "NOT_NULL_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNotNullDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     */
    public void setNotNullDate_IsNull() { regNotNullDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_DATE: {DATE(10)}
     */
    public void setNotNullDate_IsNotNull() { regNotNullDate(CK_ISNN, DOBJ); }

    protected void regNotNullDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotNullDate(), "NOT_NULL_DATE"); }
    protected abstract ConditionValue xgetCValueNotNullDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @param notNullDatetime The value of notNullDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDatetime_Equal(java.time.LocalDateTime notNullDatetime) {
        regNotNullDatetime(CK_EQ,  notNullDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @param notNullDatetime The value of notNullDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDatetime_GreaterThan(java.time.LocalDateTime notNullDatetime) {
        regNotNullDatetime(CK_GT,  notNullDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @param notNullDatetime The value of notNullDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDatetime_LessThan(java.time.LocalDateTime notNullDatetime) {
        regNotNullDatetime(CK_LT,  notNullDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @param notNullDatetime The value of notNullDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDatetime_GreaterEqual(java.time.LocalDateTime notNullDatetime) {
        regNotNullDatetime(CK_GE,  notNullDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @param notNullDatetime The value of notNullDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotNullDatetime_LessEqual(java.time.LocalDateTime notNullDatetime) {
        regNotNullDatetime(CK_LE, notNullDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setNotNullDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNotNullDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNotNullDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setNotNullDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of notNullDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNotNullDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "NOT_NULL_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNotNullDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setNotNullDatetime_IsNull() { regNotNullDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setNotNullDatetime_IsNotNull() { regNotNullDatetime(CK_ISNN, DOBJ); }

    protected void regNotNullDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotNullDatetime(), "NOT_NULL_DATETIME"); }
    protected abstract ConditionValue xgetCValueNotNullDatetime();

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
    public HpSLCFunction<WhiteNotNullCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteNotNullCB.class);
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
    public HpSLCFunction<WhiteNotNullCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteNotNullCB.class);
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
    public HpSLCFunction<WhiteNotNullCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteNotNullCB.class);
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
    public HpSLCFunction<WhiteNotNullCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteNotNullCB.class);
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
    public HpSLCFunction<WhiteNotNullCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteNotNullCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteNotNullCB&gt;() {
     *     public void query(WhiteNotNullCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteNotNullCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteNotNullCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNotNullCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteNotNullCQ sq);

    protected WhiteNotNullCB xcreateScalarConditionCB() {
        WhiteNotNullCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteNotNullCB xcreateScalarConditionPartitionByCB() {
        WhiteNotNullCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteNotNullCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNotNullCB cb = new WhiteNotNullCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NOT_NULL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteNotNullCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteNotNullCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteNotNullCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNotNullCB cb = new WhiteNotNullCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NOT_NULL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteNotNullCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteNotNullCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteNotNullCB cb = new WhiteNotNullCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteNotNullCQ sq);

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
    protected WhiteNotNullCB newMyCB() {
        return new WhiteNotNullCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteNotNullCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
