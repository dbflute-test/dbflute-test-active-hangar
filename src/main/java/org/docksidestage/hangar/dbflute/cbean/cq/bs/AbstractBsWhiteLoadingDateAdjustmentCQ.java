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
 * The abstract condition-query of WHITE_LOADING_DATE_ADJUSTMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteLoadingDateAdjustmentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteLoadingDateAdjustmentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_LOADING_DATE_ADJUSTMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_Equal(Long dateAdjustmentId) {
        doSetDateAdjustmentId_Equal(dateAdjustmentId);
    }

    protected void doSetDateAdjustmentId_Equal(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_EQ, dateAdjustmentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_NotEqual(Long dateAdjustmentId) {
        doSetDateAdjustmentId_NotEqual(dateAdjustmentId);
    }

    protected void doSetDateAdjustmentId_NotEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_NES, dateAdjustmentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_GreaterThan(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_GT, dateAdjustmentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_LessThan(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_LT, dateAdjustmentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_GreaterEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_GE, dateAdjustmentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentId The value of dateAdjustmentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_LessEqual(Long dateAdjustmentId) {
        regDateAdjustmentId(CK_LE, dateAdjustmentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDateAdjustmentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDateAdjustmentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dateAdjustmentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDateAdjustmentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentIdList The collection of dateAdjustmentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_InScope(Collection<Long> dateAdjustmentIdList) {
        doSetDateAdjustmentId_InScope(dateAdjustmentIdList);
    }

    protected void doSetDateAdjustmentId_InScope(Collection<Long> dateAdjustmentIdList) {
        regINS(CK_INS, cTL(dateAdjustmentIdList), xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @param dateAdjustmentIdList The collection of dateAdjustmentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDateAdjustmentId_NotInScope(Collection<Long> dateAdjustmentIdList) {
        doSetDateAdjustmentId_NotInScope(dateAdjustmentIdList);
    }

    protected void doSetDateAdjustmentId_NotInScope(Collection<Long> dateAdjustmentIdList) {
        regINS(CK_NINS, cTL(dateAdjustmentIdList), xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDateAdjustmentId_IsNull() { regDateAdjustmentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setDateAdjustmentId_IsNotNull() { regDateAdjustmentId(CK_ISNN, DOBJ); }

    protected void regDateAdjustmentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateAdjustmentId(), "DATE_ADJUSTMENT_ID"); }
    protected abstract ConditionValue xgetCValueDateAdjustmentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_Equal(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_EQ,  adjustedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_GreaterThan(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_GT,  adjustedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_LessThan(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_LT,  adjustedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_GreaterEqual(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_GE,  adjustedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * @param adjustedDate The value of adjustedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDate_LessEqual(java.time.LocalDate adjustedDate) {
        regAdjustedDate(CK_LE, adjustedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * <pre>e.g. setAdjustedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     * <pre>e.g. setAdjustedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     */
    public void setAdjustedDate_IsNull() { regAdjustedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE: {DATE(10)}
     */
    public void setAdjustedDate_IsNotNull() { regAdjustedDate(CK_ISNN, DOBJ); }

    protected void regAdjustedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDate(), "ADJUSTED_DATE"); }
    protected abstract ConditionValue xgetCValueAdjustedDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * @param adjustedDateSea The value of adjustedDateSea as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateSea_Equal(java.time.LocalDate adjustedDateSea) {
        regAdjustedDateSea(CK_EQ,  adjustedDateSea);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * @param adjustedDateSea The value of adjustedDateSea as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateSea_GreaterThan(java.time.LocalDate adjustedDateSea) {
        regAdjustedDateSea(CK_GT,  adjustedDateSea);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * @param adjustedDateSea The value of adjustedDateSea as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateSea_LessThan(java.time.LocalDate adjustedDateSea) {
        regAdjustedDateSea(CK_LT,  adjustedDateSea);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * @param adjustedDateSea The value of adjustedDateSea as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateSea_GreaterEqual(java.time.LocalDate adjustedDateSea) {
        regAdjustedDateSea(CK_GE,  adjustedDateSea);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * @param adjustedDateSea The value of adjustedDateSea as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateSea_LessEqual(java.time.LocalDate adjustedDateSea) {
        regAdjustedDateSea(CK_LE, adjustedDateSea);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * <pre>e.g. setAdjustedDateSea_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateSea. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateSea. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDateSea_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDateSea_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     * <pre>e.g. setAdjustedDateSea_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateSea. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateSea. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDateSea_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATE_SEA"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDateSea(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     */
    public void setAdjustedDateSea_IsNull() { regAdjustedDateSea(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_SEA: {DATE(10)}
     */
    public void setAdjustedDateSea_IsNotNull() { regAdjustedDateSea(CK_ISNN, DOBJ); }

    protected void regAdjustedDateSea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDateSea(), "ADJUSTED_DATE_SEA"); }
    protected abstract ConditionValue xgetCValueAdjustedDateSea();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * @param adjustedDateHangar The value of adjustedDateHangar as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateHangar_Equal(java.time.LocalDate adjustedDateHangar) {
        regAdjustedDateHangar(CK_EQ,  adjustedDateHangar);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * @param adjustedDateHangar The value of adjustedDateHangar as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateHangar_GreaterThan(java.time.LocalDate adjustedDateHangar) {
        regAdjustedDateHangar(CK_GT,  adjustedDateHangar);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * @param adjustedDateHangar The value of adjustedDateHangar as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateHangar_LessThan(java.time.LocalDate adjustedDateHangar) {
        regAdjustedDateHangar(CK_LT,  adjustedDateHangar);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * @param adjustedDateHangar The value of adjustedDateHangar as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateHangar_GreaterEqual(java.time.LocalDate adjustedDateHangar) {
        regAdjustedDateHangar(CK_GE,  adjustedDateHangar);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * @param adjustedDateHangar The value of adjustedDateHangar as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateHangar_LessEqual(java.time.LocalDate adjustedDateHangar) {
        regAdjustedDateHangar(CK_LE, adjustedDateHangar);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * <pre>e.g. setAdjustedDateHangar_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateHangar. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateHangar. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDateHangar_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDateHangar_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     * <pre>e.g. setAdjustedDateHangar_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateHangar. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateHangar. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDateHangar_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATE_HANGAR"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDateHangar(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     */
    public void setAdjustedDateHangar_IsNull() { regAdjustedDateHangar(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_HANGAR: {DATE(10)}
     */
    public void setAdjustedDateHangar_IsNotNull() { regAdjustedDateHangar(CK_ISNN, DOBJ); }

    protected void regAdjustedDateHangar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDateHangar(), "ADJUSTED_DATE_HANGAR"); }
    protected abstract ConditionValue xgetCValueAdjustedDateHangar();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * @param adjustedDateMystic The value of adjustedDateMystic as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateMystic_Equal(java.time.LocalDate adjustedDateMystic) {
        regAdjustedDateMystic(CK_EQ,  adjustedDateMystic);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * @param adjustedDateMystic The value of adjustedDateMystic as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateMystic_GreaterThan(java.time.LocalDate adjustedDateMystic) {
        regAdjustedDateMystic(CK_GT,  adjustedDateMystic);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * @param adjustedDateMystic The value of adjustedDateMystic as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateMystic_LessThan(java.time.LocalDate adjustedDateMystic) {
        regAdjustedDateMystic(CK_LT,  adjustedDateMystic);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * @param adjustedDateMystic The value of adjustedDateMystic as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateMystic_GreaterEqual(java.time.LocalDate adjustedDateMystic) {
        regAdjustedDateMystic(CK_GE,  adjustedDateMystic);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * @param adjustedDateMystic The value of adjustedDateMystic as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDateMystic_LessEqual(java.time.LocalDate adjustedDateMystic) {
        regAdjustedDateMystic(CK_LE, adjustedDateMystic);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * <pre>e.g. setAdjustedDateMystic_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateMystic. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateMystic. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDateMystic_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDateMystic_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     * <pre>e.g. setAdjustedDateMystic_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateMystic. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDateMystic. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDateMystic_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATE_MYSTIC"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDateMystic(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     */
    public void setAdjustedDateMystic_IsNull() { regAdjustedDateMystic(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATE_MYSTIC: {DATE(10)}
     */
    public void setAdjustedDateMystic_IsNotNull() { regAdjustedDateMystic(CK_ISNN, DOBJ); }

    protected void regAdjustedDateMystic(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDateMystic(), "ADJUSTED_DATE_MYSTIC"); }
    protected abstract ConditionValue xgetCValueAdjustedDateMystic();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @param adjustedDatetime The value of adjustedDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_Equal(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_EQ,  adjustedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @param adjustedDatetime The value of adjustedDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_GreaterThan(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_GT,  adjustedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @param adjustedDatetime The value of adjustedDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_LessThan(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_LT,  adjustedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @param adjustedDatetime The value of adjustedDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_GreaterEqual(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_GE,  adjustedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @param adjustedDatetime The value of adjustedDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetime_LessEqual(java.time.LocalDateTime adjustedDatetime) {
        regAdjustedDatetime(CK_LE, adjustedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetime_IsNull() { regAdjustedDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetime_IsNotNull() { regAdjustedDatetime(CK_ISNN, DOBJ); }

    protected void regAdjustedDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDatetime(), "ADJUSTED_DATETIME"); }
    protected abstract ConditionValue xgetCValueAdjustedDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeLand The value of adjustedDatetimeLand as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeLand_Equal(java.time.LocalDateTime adjustedDatetimeLand) {
        regAdjustedDatetimeLand(CK_EQ,  adjustedDatetimeLand);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeLand The value of adjustedDatetimeLand as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeLand_GreaterThan(java.time.LocalDateTime adjustedDatetimeLand) {
        regAdjustedDatetimeLand(CK_GT,  adjustedDatetimeLand);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeLand The value of adjustedDatetimeLand as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeLand_LessThan(java.time.LocalDateTime adjustedDatetimeLand) {
        regAdjustedDatetimeLand(CK_LT,  adjustedDatetimeLand);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeLand The value of adjustedDatetimeLand as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeLand_GreaterEqual(java.time.LocalDateTime adjustedDatetimeLand) {
        regAdjustedDatetimeLand(CK_GE,  adjustedDatetimeLand);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeLand The value of adjustedDatetimeLand as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeLand_LessEqual(java.time.LocalDateTime adjustedDatetimeLand) {
        regAdjustedDatetimeLand(CK_LE, adjustedDatetimeLand);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetimeLand_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeLand. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeLand. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDatetimeLand_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDatetimeLand_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetimeLand_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeLand. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeLand. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDatetimeLand_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATETIME_LAND"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDatetimeLand(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetimeLand_IsNull() { regAdjustedDatetimeLand(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_LAND: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetimeLand_IsNotNull() { regAdjustedDatetimeLand(CK_ISNN, DOBJ); }

    protected void regAdjustedDatetimeLand(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDatetimeLand(), "ADJUSTED_DATETIME_LAND"); }
    protected abstract ConditionValue xgetCValueAdjustedDatetimeLand();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeShowbase The value of adjustedDatetimeShowbase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeShowbase_Equal(java.time.LocalDateTime adjustedDatetimeShowbase) {
        regAdjustedDatetimeShowbase(CK_EQ,  adjustedDatetimeShowbase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeShowbase The value of adjustedDatetimeShowbase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeShowbase_GreaterThan(java.time.LocalDateTime adjustedDatetimeShowbase) {
        regAdjustedDatetimeShowbase(CK_GT,  adjustedDatetimeShowbase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeShowbase The value of adjustedDatetimeShowbase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeShowbase_LessThan(java.time.LocalDateTime adjustedDatetimeShowbase) {
        regAdjustedDatetimeShowbase(CK_LT,  adjustedDatetimeShowbase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeShowbase The value of adjustedDatetimeShowbase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeShowbase_GreaterEqual(java.time.LocalDateTime adjustedDatetimeShowbase) {
        regAdjustedDatetimeShowbase(CK_GE,  adjustedDatetimeShowbase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeShowbase The value of adjustedDatetimeShowbase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeShowbase_LessEqual(java.time.LocalDateTime adjustedDatetimeShowbase) {
        regAdjustedDatetimeShowbase(CK_LE, adjustedDatetimeShowbase);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetimeShowbase_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeShowbase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeShowbase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDatetimeShowbase_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDatetimeShowbase_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetimeShowbase_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeShowbase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeShowbase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDatetimeShowbase_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATETIME_SHOWBASE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDatetimeShowbase(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetimeShowbase_IsNull() { regAdjustedDatetimeShowbase(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_SHOWBASE: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetimeShowbase_IsNotNull() { regAdjustedDatetimeShowbase(CK_ISNN, DOBJ); }

    protected void regAdjustedDatetimeShowbase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDatetimeShowbase(), "ADJUSTED_DATETIME_SHOWBASE"); }
    protected abstract ConditionValue xgetCValueAdjustedDatetimeShowbase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeOneman The value of adjustedDatetimeOneman as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeOneman_Equal(java.time.LocalDateTime adjustedDatetimeOneman) {
        regAdjustedDatetimeOneman(CK_EQ,  adjustedDatetimeOneman);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeOneman The value of adjustedDatetimeOneman as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeOneman_GreaterThan(java.time.LocalDateTime adjustedDatetimeOneman) {
        regAdjustedDatetimeOneman(CK_GT,  adjustedDatetimeOneman);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeOneman The value of adjustedDatetimeOneman as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeOneman_LessThan(java.time.LocalDateTime adjustedDatetimeOneman) {
        regAdjustedDatetimeOneman(CK_LT,  adjustedDatetimeOneman);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeOneman The value of adjustedDatetimeOneman as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeOneman_GreaterEqual(java.time.LocalDateTime adjustedDatetimeOneman) {
        regAdjustedDatetimeOneman(CK_GE,  adjustedDatetimeOneman);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * @param adjustedDatetimeOneman The value of adjustedDatetimeOneman as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedDatetimeOneman_LessEqual(java.time.LocalDateTime adjustedDatetimeOneman) {
        regAdjustedDatetimeOneman(CK_LE, adjustedDatetimeOneman);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetimeOneman_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeOneman. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeOneman. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setAdjustedDatetimeOneman_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setAdjustedDatetimeOneman_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     * <pre>e.g. setAdjustedDatetimeOneman_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeOneman. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adjustedDatetimeOneman. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setAdjustedDatetimeOneman_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "ADJUSTED_DATETIME_ONEMAN"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueAdjustedDatetimeOneman(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetimeOneman_IsNull() { regAdjustedDatetimeOneman(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_DATETIME_ONEMAN: {TIMESTAMP(26, 6)}
     */
    public void setAdjustedDatetimeOneman_IsNotNull() { regAdjustedDatetimeOneman(CK_ISNN, DOBJ); }

    protected void regAdjustedDatetimeOneman(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedDatetimeOneman(), "ADJUSTED_DATETIME_ONEMAN"); }
    protected abstract ConditionValue xgetCValueAdjustedDatetimeOneman();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_Equal(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_EQ,  adjustedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_GreaterThan(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_GT,  adjustedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_LessThan(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_LT,  adjustedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_GreaterEqual(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_GE,  adjustedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     * @param adjustedTime The value of adjustedTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedTime_LessEqual(java.time.LocalTime adjustedTime) {
        regAdjustedTime(CK_LE, adjustedTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     */
    public void setAdjustedTime_IsNull() { regAdjustedTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_TIME: {TIME(8)}
     */
    public void setAdjustedTime_IsNotNull() { regAdjustedTime(CK_ISNN, DOBJ); }

    protected void regAdjustedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedTime(), "ADJUSTED_TIME"); }
    protected abstract ConditionValue xgetCValueAdjustedTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedInteger The value of adjustedInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_Equal(Integer adjustedInteger) {
        doSetAdjustedInteger_Equal(adjustedInteger);
    }

    protected void doSetAdjustedInteger_Equal(Integer adjustedInteger) {
        regAdjustedInteger(CK_EQ, adjustedInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedInteger The value of adjustedInteger as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_NotEqual(Integer adjustedInteger) {
        doSetAdjustedInteger_NotEqual(adjustedInteger);
    }

    protected void doSetAdjustedInteger_NotEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_NES, adjustedInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedInteger The value of adjustedInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_GreaterThan(Integer adjustedInteger) {
        regAdjustedInteger(CK_GT, adjustedInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedInteger The value of adjustedInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_LessThan(Integer adjustedInteger) {
        regAdjustedInteger(CK_LT, adjustedInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedInteger The value of adjustedInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_GreaterEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_GE, adjustedInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedInteger The value of adjustedInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedInteger_LessEqual(Integer adjustedInteger) {
        regAdjustedInteger(CK_LE, adjustedInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param minNumber The min number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param minNumber The min number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAdjustedInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedIntegerList The collection of adjustedInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedInteger_InScope(Collection<Integer> adjustedIntegerList) {
        doSetAdjustedInteger_InScope(adjustedIntegerList);
    }

    protected void doSetAdjustedInteger_InScope(Collection<Integer> adjustedIntegerList) {
        regINS(CK_INS, cTL(adjustedIntegerList), xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @param adjustedIntegerList The collection of adjustedInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedInteger_NotInScope(Collection<Integer> adjustedIntegerList) {
        doSetAdjustedInteger_NotInScope(adjustedIntegerList);
    }

    protected void doSetAdjustedInteger_NotInScope(Collection<Integer> adjustedIntegerList) {
        regINS(CK_NINS, cTL(adjustedIntegerList), xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     */
    public void setAdjustedInteger_IsNull() { regAdjustedInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_INTEGER: {INTEGER(10)}
     */
    public void setAdjustedInteger_IsNotNull() { regAdjustedInteger(CK_ISNN, DOBJ); }

    protected void regAdjustedInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedInteger(), "ADJUSTED_INTEGER"); }
    protected abstract ConditionValue xgetCValueAdjustedInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_Equal(Long adjustedPlainLong) {
        doSetAdjustedPlainLong_Equal(adjustedPlainLong);
    }

    protected void doSetAdjustedPlainLong_Equal(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_EQ, adjustedPlainLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_NotEqual(Long adjustedPlainLong) {
        doSetAdjustedPlainLong_NotEqual(adjustedPlainLong);
    }

    protected void doSetAdjustedPlainLong_NotEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_NES, adjustedPlainLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_GreaterThan(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_GT, adjustedPlainLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_LessThan(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_LT, adjustedPlainLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_GreaterEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_GE, adjustedPlainLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLong The value of adjustedPlainLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_LessEqual(Long adjustedPlainLong) {
        regAdjustedPlainLong(CK_LE, adjustedPlainLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAdjustedPlainLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAdjustedPlainLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param minNumber The min number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedPlainLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAdjustedPlainLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLongList The collection of adjustedPlainLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_InScope(Collection<Long> adjustedPlainLongList) {
        doSetAdjustedPlainLong_InScope(adjustedPlainLongList);
    }

    protected void doSetAdjustedPlainLong_InScope(Collection<Long> adjustedPlainLongList) {
        regINS(CK_INS, cTL(adjustedPlainLongList), xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @param adjustedPlainLongList The collection of adjustedPlainLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedPlainLong_NotInScope(Collection<Long> adjustedPlainLongList) {
        doSetAdjustedPlainLong_NotInScope(adjustedPlainLongList);
    }

    protected void doSetAdjustedPlainLong_NotInScope(Collection<Long> adjustedPlainLongList) {
        regINS(CK_NINS, cTL(adjustedPlainLongList), xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     */
    public void setAdjustedPlainLong_IsNull() { regAdjustedPlainLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     */
    public void setAdjustedPlainLong_IsNotNull() { regAdjustedPlainLong(CK_ISNN, DOBJ); }

    protected void regAdjustedPlainLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedPlainLong(), "ADJUSTED_PLAIN_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedPlainLong();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @param adjustedStringLong The value of adjustedStringLong as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedStringLong_Equal(String adjustedStringLong) {
        doSetAdjustedStringLong_Equal(fRES(adjustedStringLong));
    }

    protected void doSetAdjustedStringLong_Equal(String adjustedStringLong) {
        regAdjustedStringLong(CK_EQ, adjustedStringLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @param adjustedStringLong The value of adjustedStringLong as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedStringLong_NotEqual(String adjustedStringLong) {
        doSetAdjustedStringLong_NotEqual(fRES(adjustedStringLong));
    }

    protected void doSetAdjustedStringLong_NotEqual(String adjustedStringLong) {
        regAdjustedStringLong(CK_NES, adjustedStringLong);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @param adjustedStringLongList The collection of adjustedStringLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedStringLong_InScope(Collection<String> adjustedStringLongList) {
        doSetAdjustedStringLong_InScope(adjustedStringLongList);
    }

    protected void doSetAdjustedStringLong_InScope(Collection<String> adjustedStringLongList) {
        regINS(CK_INS, cTL(adjustedStringLongList), xgetCValueAdjustedStringLong(), "ADJUSTED_STRING_LONG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @param adjustedStringLongList The collection of adjustedStringLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedStringLong_NotInScope(Collection<String> adjustedStringLongList) {
        doSetAdjustedStringLong_NotInScope(adjustedStringLongList);
    }

    protected void doSetAdjustedStringLong_NotInScope(Collection<String> adjustedStringLongList) {
        regINS(CK_NINS, cTL(adjustedStringLongList), xgetCValueAdjustedStringLong(), "ADJUSTED_STRING_LONG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)} <br>
     * <pre>e.g. setAdjustedStringLong_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param adjustedStringLong The value of adjustedStringLong as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAdjustedStringLong_LikeSearch(String adjustedStringLong, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAdjustedStringLong_LikeSearch(adjustedStringLong, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)} <br>
     * <pre>e.g. setAdjustedStringLong_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param adjustedStringLong The value of adjustedStringLong as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAdjustedStringLong_LikeSearch(String adjustedStringLong, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adjustedStringLong), xgetCValueAdjustedStringLong(), "ADJUSTED_STRING_LONG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @param adjustedStringLong The value of adjustedStringLong as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAdjustedStringLong_NotLikeSearch(String adjustedStringLong, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAdjustedStringLong_NotLikeSearch(adjustedStringLong, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @param adjustedStringLong The value of adjustedStringLong as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAdjustedStringLong_NotLikeSearch(String adjustedStringLong, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adjustedStringLong), xgetCValueAdjustedStringLong(), "ADJUSTED_STRING_LONG", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     */
    public void setAdjustedStringLong_IsNull() { regAdjustedStringLong(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     */
    public void setAdjustedStringLong_IsNullOrEmpty() { regAdjustedStringLong(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     */
    public void setAdjustedStringLong_IsNotNull() { regAdjustedStringLong(CK_ISNN, DOBJ); }

    protected void regAdjustedStringLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedStringLong(), "ADJUSTED_STRING_LONG"); }
    protected abstract ConditionValue xgetCValueAdjustedStringLong();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

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
    public HpSLCFunction<WhiteLoadingDateAdjustmentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteLoadingDateAdjustmentCB.class);
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
    public HpSLCFunction<WhiteLoadingDateAdjustmentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteLoadingDateAdjustmentCB.class);
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
    public HpSLCFunction<WhiteLoadingDateAdjustmentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteLoadingDateAdjustmentCB.class);
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
    public HpSLCFunction<WhiteLoadingDateAdjustmentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteLoadingDateAdjustmentCB.class);
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
    public HpSLCFunction<WhiteLoadingDateAdjustmentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteLoadingDateAdjustmentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteLoadingDateAdjustmentCB&gt;() {
     *     public void query(WhiteLoadingDateAdjustmentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteLoadingDateAdjustmentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteLoadingDateAdjustmentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadingDateAdjustmentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteLoadingDateAdjustmentCQ sq);

    protected WhiteLoadingDateAdjustmentCB xcreateScalarConditionCB() {
        WhiteLoadingDateAdjustmentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteLoadingDateAdjustmentCB xcreateScalarConditionPartitionByCB() {
        WhiteLoadingDateAdjustmentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteLoadingDateAdjustmentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadingDateAdjustmentCB cb = new WhiteLoadingDateAdjustmentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DATE_ADJUSTMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteLoadingDateAdjustmentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteLoadingDateAdjustmentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteLoadingDateAdjustmentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLoadingDateAdjustmentCB cb = new WhiteLoadingDateAdjustmentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATE_ADJUSTMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteLoadingDateAdjustmentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteLoadingDateAdjustmentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteLoadingDateAdjustmentCB cb = new WhiteLoadingDateAdjustmentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteLoadingDateAdjustmentCQ sq);

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
    protected WhiteLoadingDateAdjustmentCB newMyCB() {
        return new WhiteLoadingDateAdjustmentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteLoadingDateAdjustmentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
