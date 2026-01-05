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
 * The abstract condition-query of WHITE_DEFAULT_CONSTRAINT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDefaultConstraintCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDefaultConstraintCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DEFAULT_CONSTRAINT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultId The value of defaultId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultId_Equal(Long defaultId) {
        doSetDefaultId_Equal(defaultId);
    }

    protected void doSetDefaultId_Equal(Long defaultId) {
        regDefaultId(CK_EQ, defaultId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultId The value of defaultId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultId_NotEqual(Long defaultId) {
        doSetDefaultId_NotEqual(defaultId);
    }

    protected void doSetDefaultId_NotEqual(Long defaultId) {
        regDefaultId(CK_NES, defaultId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultId The value of defaultId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultId_GreaterThan(Long defaultId) {
        regDefaultId(CK_GT, defaultId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultId The value of defaultId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultId_LessThan(Long defaultId) {
        regDefaultId(CK_LT, defaultId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultId The value of defaultId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultId_GreaterEqual(Long defaultId) {
        regDefaultId(CK_GE, defaultId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultId The value of defaultId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultId_LessEqual(Long defaultId) {
        regDefaultId(CK_LE, defaultId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of defaultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDefaultId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDefaultId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of defaultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDefaultId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefaultId(), "DEFAULT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultIdList The collection of defaultId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultId_InScope(Collection<Long> defaultIdList) {
        doSetDefaultId_InScope(defaultIdList);
    }

    protected void doSetDefaultId_InScope(Collection<Long> defaultIdList) {
        regINS(CK_INS, cTL(defaultIdList), xgetCValueDefaultId(), "DEFAULT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @param defaultIdList The collection of defaultId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultId_NotInScope(Collection<Long> defaultIdList) {
        doSetDefaultId_NotInScope(defaultIdList);
    }

    protected void doSetDefaultId_NotInScope(Collection<Long> defaultIdList) {
        regINS(CK_NINS, cTL(defaultIdList), xgetCValueDefaultId(), "DEFAULT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDefaultId_IsNull() { regDefaultId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDefaultId_IsNotNull() { regDefaultId(CK_ISNN, DOBJ); }

    protected void regDefaultId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultId(), "DEFAULT_ID"); }
    protected abstract ConditionValue xgetCValueDefaultId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]}
     * @param defaultName The value of defaultName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultName_Equal(String defaultName) {
        doSetDefaultName_Equal(fRES(defaultName));
    }

    protected void doSetDefaultName_Equal(String defaultName) {
        regDefaultName(CK_EQ, defaultName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} <br>
     * <pre>e.g. setDefaultName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param defaultName The value of defaultName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDefaultName_LikeSearch(String defaultName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDefaultName_LikeSearch(defaultName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} <br>
     * <pre>e.g. setDefaultName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defaultName The value of defaultName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDefaultName_LikeSearch(String defaultName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defaultName), xgetCValueDefaultName(), "DEFAULT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]}
     * @param defaultName The value of defaultName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDefaultName_NotLikeSearch(String defaultName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDefaultName_NotLikeSearch(defaultName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]}
     * @param defaultName The value of defaultName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDefaultName_NotLikeSearch(String defaultName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defaultName), xgetCValueDefaultName(), "DEFAULT_NAME", likeSearchOption);
    }

    protected void regDefaultName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultName(), "DEFAULT_NAME"); }
    protected abstract ConditionValue xgetCValueDefaultName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCount The value of defaultCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultCount_Equal(Integer defaultCount) {
        doSetDefaultCount_Equal(defaultCount);
    }

    protected void doSetDefaultCount_Equal(Integer defaultCount) {
        regDefaultCount(CK_EQ, defaultCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCount The value of defaultCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultCount_NotEqual(Integer defaultCount) {
        doSetDefaultCount_NotEqual(defaultCount);
    }

    protected void doSetDefaultCount_NotEqual(Integer defaultCount) {
        regDefaultCount(CK_NES, defaultCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCount The value of defaultCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultCount_GreaterThan(Integer defaultCount) {
        regDefaultCount(CK_GT, defaultCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCount The value of defaultCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultCount_LessThan(Integer defaultCount) {
        regDefaultCount(CK_LT, defaultCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCount The value of defaultCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultCount_GreaterEqual(Integer defaultCount) {
        regDefaultCount(CK_GE, defaultCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCount The value of defaultCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultCount_LessEqual(Integer defaultCount) {
        regDefaultCount(CK_LE, defaultCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param minNumber The min number of defaultCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDefaultCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDefaultCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param minNumber The min number of defaultCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defaultCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDefaultCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefaultCount(), "DEFAULT_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCountList The collection of defaultCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultCount_InScope(Collection<Integer> defaultCountList) {
        doSetDefaultCount_InScope(defaultCountList);
    }

    protected void doSetDefaultCount_InScope(Collection<Integer> defaultCountList) {
        regINS(CK_INS, cTL(defaultCountList), xgetCValueDefaultCount(), "DEFAULT_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @param defaultCountList The collection of defaultCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultCount_NotInScope(Collection<Integer> defaultCountList) {
        doSetDefaultCount_NotInScope(defaultCountList);
    }

    protected void doSetDefaultCount_NotInScope(Collection<Integer> defaultCountList) {
        regINS(CK_NINS, cTL(defaultCountList), xgetCValueDefaultCount(), "DEFAULT_COUNT");
    }

    protected void regDefaultCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultCount(), "DEFAULT_COUNT"); }
    protected abstract ConditionValue xgetCValueDefaultCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @param defaultDate The value of defaultDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultDate_Equal(java.time.LocalDate defaultDate) {
        regDefaultDate(CK_EQ,  defaultDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @param defaultDate The value of defaultDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultDate_GreaterThan(java.time.LocalDate defaultDate) {
        regDefaultDate(CK_GT,  defaultDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @param defaultDate The value of defaultDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultDate_LessThan(java.time.LocalDate defaultDate) {
        regDefaultDate(CK_LT,  defaultDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @param defaultDate The value of defaultDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultDate_GreaterEqual(java.time.LocalDate defaultDate) {
        regDefaultDate(CK_GE,  defaultDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @param defaultDate The value of defaultDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultDate_LessEqual(java.time.LocalDate defaultDate) {
        regDefaultDate(CK_LE, defaultDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * <pre>e.g. setDefaultDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of defaultDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of defaultDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setDefaultDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setDefaultDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * <pre>e.g. setDefaultDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of defaultDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of defaultDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setDefaultDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "DEFAULT_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueDefaultDate(), nm, op);
    }

    protected void regDefaultDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultDate(), "DEFAULT_DATE"); }
    protected abstract ConditionValue xgetCValueDefaultDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]}
     * @param defaultJudge The value of defaultJudge as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefaultJudge_Equal(Boolean defaultJudge) {
        regDefaultJudge(CK_EQ, defaultJudge);
    }

    protected void regDefaultJudge(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultJudge(), "DEFAULT_JUDGE"); }
    protected abstract ConditionValue xgetCValueDefaultJudge();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @param defaultEmptyString The value of defaultEmptyString as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultEmptyString_Equal(String defaultEmptyString) {
        doSetDefaultEmptyString_Equal(fRES(defaultEmptyString));
    }

    protected void doSetDefaultEmptyString_Equal(String defaultEmptyString) {
        regDefaultEmptyString(CK_EQ, defaultEmptyString);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @param defaultEmptyString The value of defaultEmptyString as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultEmptyString_NotEqual(String defaultEmptyString) {
        doSetDefaultEmptyString_NotEqual(fRES(defaultEmptyString));
    }

    protected void doSetDefaultEmptyString_NotEqual(String defaultEmptyString) {
        regDefaultEmptyString(CK_NES, defaultEmptyString);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @param defaultEmptyStringList The collection of defaultEmptyString as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultEmptyString_InScope(Collection<String> defaultEmptyStringList) {
        doSetDefaultEmptyString_InScope(defaultEmptyStringList);
    }

    protected void doSetDefaultEmptyString_InScope(Collection<String> defaultEmptyStringList) {
        regINS(CK_INS, cTL(defaultEmptyStringList), xgetCValueDefaultEmptyString(), "DEFAULT_EMPTY_STRING");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @param defaultEmptyStringList The collection of defaultEmptyString as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefaultEmptyString_NotInScope(Collection<String> defaultEmptyStringList) {
        doSetDefaultEmptyString_NotInScope(defaultEmptyStringList);
    }

    protected void doSetDefaultEmptyString_NotInScope(Collection<String> defaultEmptyStringList) {
        regINS(CK_NINS, cTL(defaultEmptyStringList), xgetCValueDefaultEmptyString(), "DEFAULT_EMPTY_STRING");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDefaultEmptyString_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param defaultEmptyString The value of defaultEmptyString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDefaultEmptyString_LikeSearch(String defaultEmptyString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDefaultEmptyString_LikeSearch(defaultEmptyString, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDefaultEmptyString_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param defaultEmptyString The value of defaultEmptyString as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDefaultEmptyString_LikeSearch(String defaultEmptyString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(defaultEmptyString), xgetCValueDefaultEmptyString(), "DEFAULT_EMPTY_STRING", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @param defaultEmptyString The value of defaultEmptyString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDefaultEmptyString_NotLikeSearch(String defaultEmptyString, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDefaultEmptyString_NotLikeSearch(defaultEmptyString, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @param defaultEmptyString The value of defaultEmptyString as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDefaultEmptyString_NotLikeSearch(String defaultEmptyString, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(defaultEmptyString), xgetCValueDefaultEmptyString(), "DEFAULT_EMPTY_STRING", likeSearchOption);
    }

    protected void regDefaultEmptyString(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefaultEmptyString(), "DEFAULT_EMPTY_STRING"); }
    protected abstract ConditionValue xgetCValueDefaultEmptyString();

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
    public HpSLCFunction<WhiteDefaultConstraintCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteDefaultConstraintCB.class);
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
    public HpSLCFunction<WhiteDefaultConstraintCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteDefaultConstraintCB.class);
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
    public HpSLCFunction<WhiteDefaultConstraintCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteDefaultConstraintCB.class);
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
    public HpSLCFunction<WhiteDefaultConstraintCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteDefaultConstraintCB.class);
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
    public HpSLCFunction<WhiteDefaultConstraintCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteDefaultConstraintCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDefaultConstraintCB&gt;() {
     *     public void query(WhiteDefaultConstraintCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteDefaultConstraintCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteDefaultConstraintCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDefaultConstraintCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteDefaultConstraintCQ sq);

    protected WhiteDefaultConstraintCB xcreateScalarConditionCB() {
        WhiteDefaultConstraintCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDefaultConstraintCB xcreateScalarConditionPartitionByCB() {
        WhiteDefaultConstraintCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDefaultConstraintCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDefaultConstraintCB cb = new WhiteDefaultConstraintCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DEFAULT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDefaultConstraintCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDefaultConstraintCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDefaultConstraintCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDefaultConstraintCB cb = new WhiteDefaultConstraintCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEFAULT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDefaultConstraintCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDefaultConstraintCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDefaultConstraintCB cb = new WhiteDefaultConstraintCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDefaultConstraintCQ sq);

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
    protected WhiteDefaultConstraintCB newMyCB() {
        return new WhiteDefaultConstraintCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDefaultConstraintCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
