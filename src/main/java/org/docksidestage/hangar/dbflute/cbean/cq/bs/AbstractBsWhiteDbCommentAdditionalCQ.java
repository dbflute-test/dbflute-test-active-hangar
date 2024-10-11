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
 * The abstract condition-query of WHITE_DB_COMMENT_ADDITIONAL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDbCommentAdditionalCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDbCommentAdditionalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DB_COMMENT_ADDITIONAL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentId The value of dbCommentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentId_Equal(Long dbCommentId) {
        doSetDbCommentId_Equal(dbCommentId);
    }

    protected void doSetDbCommentId_Equal(Long dbCommentId) {
        regDbCommentId(CK_EQ, dbCommentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentId The value of dbCommentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentId_NotEqual(Long dbCommentId) {
        doSetDbCommentId_NotEqual(dbCommentId);
    }

    protected void doSetDbCommentId_NotEqual(Long dbCommentId) {
        regDbCommentId(CK_NES, dbCommentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentId The value of dbCommentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentId_GreaterThan(Long dbCommentId) {
        regDbCommentId(CK_GT, dbCommentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentId The value of dbCommentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentId_LessThan(Long dbCommentId) {
        regDbCommentId(CK_LT, dbCommentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentId The value of dbCommentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentId_GreaterEqual(Long dbCommentId) {
        regDbCommentId(CK_GE, dbCommentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentId The value of dbCommentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentId_LessEqual(Long dbCommentId) {
        regDbCommentId(CK_LE, dbCommentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of dbCommentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dbCommentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDbCommentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDbCommentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of dbCommentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dbCommentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDbCommentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDbCommentId(), "DB_COMMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentIdList The collection of dbCommentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentId_InScope(Collection<Long> dbCommentIdList) {
        doSetDbCommentId_InScope(dbCommentIdList);
    }

    protected void doSetDbCommentId_InScope(Collection<Long> dbCommentIdList) {
        regINS(CK_INS, cTL(dbCommentIdList), xgetCValueDbCommentId(), "DB_COMMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param dbCommentIdList The collection of dbCommentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentId_NotInScope(Collection<Long> dbCommentIdList) {
        doSetDbCommentId_NotInScope(dbCommentIdList);
    }

    protected void doSetDbCommentId_NotInScope(Collection<Long> dbCommentIdList) {
        regINS(CK_NINS, cTL(dbCommentIdList), xgetCValueDbCommentId(), "DB_COMMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDbCommentId_IsNull() { regDbCommentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDbCommentId_IsNotNull() { regDbCommentId(CK_ISNN, DOBJ); }

    protected void regDbCommentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentId(), "DB_COMMENT_ID"); }
    protected abstract ConditionValue xgetCValueDbCommentId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @param dbCommentName The value of dbCommentName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentName_Equal(String dbCommentName) {
        doSetDbCommentName_Equal(fRES(dbCommentName));
    }

    protected void doSetDbCommentName_Equal(String dbCommentName) {
        regDbCommentName(CK_EQ, dbCommentName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDbCommentName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param dbCommentName The value of dbCommentName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDbCommentName_LikeSearch(String dbCommentName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDbCommentName_LikeSearch(dbCommentName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDbCommentName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dbCommentName The value of dbCommentName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDbCommentName_LikeSearch(String dbCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dbCommentName), xgetCValueDbCommentName(), "DB_COMMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @param dbCommentName The value of dbCommentName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDbCommentName_NotLikeSearch(String dbCommentName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDbCommentName_NotLikeSearch(dbCommentName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @param dbCommentName The value of dbCommentName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDbCommentName_NotLikeSearch(String dbCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dbCommentName), xgetCValueDbCommentName(), "DB_COMMENT_NAME", likeSearchOption);
    }

    protected void regDbCommentName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentName(), "DB_COMMENT_NAME"); }
    protected abstract ConditionValue xgetCValueDbCommentName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCount The value of dbCommentCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentCount_Equal(Integer dbCommentCount) {
        doSetDbCommentCount_Equal(dbCommentCount);
    }

    protected void doSetDbCommentCount_Equal(Integer dbCommentCount) {
        regDbCommentCount(CK_EQ, dbCommentCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCount The value of dbCommentCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentCount_NotEqual(Integer dbCommentCount) {
        doSetDbCommentCount_NotEqual(dbCommentCount);
    }

    protected void doSetDbCommentCount_NotEqual(Integer dbCommentCount) {
        regDbCommentCount(CK_NES, dbCommentCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCount The value of dbCommentCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentCount_GreaterThan(Integer dbCommentCount) {
        regDbCommentCount(CK_GT, dbCommentCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCount The value of dbCommentCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentCount_LessThan(Integer dbCommentCount) {
        regDbCommentCount(CK_LT, dbCommentCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCount The value of dbCommentCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentCount_GreaterEqual(Integer dbCommentCount) {
        regDbCommentCount(CK_GE, dbCommentCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCount The value of dbCommentCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentCount_LessEqual(Integer dbCommentCount) {
        regDbCommentCount(CK_LE, dbCommentCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of dbCommentCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dbCommentCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDbCommentCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDbCommentCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of dbCommentCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dbCommentCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDbCommentCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDbCommentCount(), "DB_COMMENT_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCountList The collection of dbCommentCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentCount_InScope(Collection<Integer> dbCommentCountList) {
        doSetDbCommentCount_InScope(dbCommentCountList);
    }

    protected void doSetDbCommentCount_InScope(Collection<Integer> dbCommentCountList) {
        regINS(CK_INS, cTL(dbCommentCountList), xgetCValueDbCommentCount(), "DB_COMMENT_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @param dbCommentCountList The collection of dbCommentCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDbCommentCount_NotInScope(Collection<Integer> dbCommentCountList) {
        doSetDbCommentCount_NotInScope(dbCommentCountList);
    }

    protected void doSetDbCommentCount_NotInScope(Collection<Integer> dbCommentCountList) {
        regINS(CK_NINS, cTL(dbCommentCountList), xgetCValueDbCommentCount(), "DB_COMMENT_COUNT");
    }

    protected void regDbCommentCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentCount(), "DB_COMMENT_COUNT"); }
    protected abstract ConditionValue xgetCValueDbCommentCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @param dbCommentDate The value of dbCommentDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDate_Equal(java.time.LocalDate dbCommentDate) {
        regDbCommentDate(CK_EQ,  dbCommentDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @param dbCommentDate The value of dbCommentDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDate_GreaterThan(java.time.LocalDate dbCommentDate) {
        regDbCommentDate(CK_GT,  dbCommentDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @param dbCommentDate The value of dbCommentDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDate_LessThan(java.time.LocalDate dbCommentDate) {
        regDbCommentDate(CK_LT,  dbCommentDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @param dbCommentDate The value of dbCommentDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDate_GreaterEqual(java.time.LocalDate dbCommentDate) {
        regDbCommentDate(CK_GE,  dbCommentDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @param dbCommentDate The value of dbCommentDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDate_LessEqual(java.time.LocalDate dbCommentDate) {
        regDbCommentDate(CK_LE, dbCommentDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setDbCommentDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDbCommentDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDbCommentDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setDbCommentDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDbCommentDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "DB_COMMENT_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDbCommentDate(), nm, op);
    }

    protected void regDbCommentDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentDate(), "DB_COMMENT_DATE"); }
    protected abstract ConditionValue xgetCValueDbCommentDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param dbCommentDatetime The value of dbCommentDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDatetime_Equal(java.time.LocalDateTime dbCommentDatetime) {
        regDbCommentDatetime(CK_EQ,  dbCommentDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param dbCommentDatetime The value of dbCommentDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDatetime_GreaterThan(java.time.LocalDateTime dbCommentDatetime) {
        regDbCommentDatetime(CK_GT,  dbCommentDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param dbCommentDatetime The value of dbCommentDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDatetime_LessThan(java.time.LocalDateTime dbCommentDatetime) {
        regDbCommentDatetime(CK_LT,  dbCommentDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param dbCommentDatetime The value of dbCommentDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDatetime_GreaterEqual(java.time.LocalDateTime dbCommentDatetime) {
        regDbCommentDatetime(CK_GE,  dbCommentDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param dbCommentDatetime The value of dbCommentDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDbCommentDatetime_LessEqual(java.time.LocalDateTime dbCommentDatetime) {
        regDbCommentDatetime(CK_LE, dbCommentDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setDbCommentDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDbCommentDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDbCommentDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * <pre>e.g. setDbCommentDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of dbCommentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDbCommentDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "DB_COMMENT_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDbCommentDatetime(), nm, op);
    }

    protected void regDbCommentDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDbCommentDatetime(), "DB_COMMENT_DATETIME"); }
    protected abstract ConditionValue xgetCValueDbCommentDatetime();

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
    public HpSLCFunction<WhiteDbCommentAdditionalCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDbCommentAdditionalCB.class);
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
    public HpSLCFunction<WhiteDbCommentAdditionalCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDbCommentAdditionalCB.class);
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
    public HpSLCFunction<WhiteDbCommentAdditionalCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDbCommentAdditionalCB.class);
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
    public HpSLCFunction<WhiteDbCommentAdditionalCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDbCommentAdditionalCB.class);
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
    public HpSLCFunction<WhiteDbCommentAdditionalCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDbCommentAdditionalCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDbCommentAdditionalCB&gt;() {
     *     public void query(WhiteDbCommentAdditionalCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDbCommentAdditionalCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDbCommentAdditionalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentAdditionalCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDbCommentAdditionalCQ sq);

    protected WhiteDbCommentAdditionalCB xcreateScalarConditionCB() {
        WhiteDbCommentAdditionalCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDbCommentAdditionalCB xcreateScalarConditionPartitionByCB() {
        WhiteDbCommentAdditionalCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDbCommentAdditionalCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentAdditionalCB cb = new WhiteDbCommentAdditionalCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DB_COMMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDbCommentAdditionalCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDbCommentAdditionalCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDbCommentAdditionalCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDbCommentAdditionalCB cb = new WhiteDbCommentAdditionalCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DB_COMMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDbCommentAdditionalCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDbCommentAdditionalCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDbCommentAdditionalCB cb = new WhiteDbCommentAdditionalCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDbCommentAdditionalCQ sq);

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
    protected WhiteDbCommentAdditionalCB newMyCB() {
        return new WhiteDbCommentAdditionalCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDbCommentAdditionalCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
