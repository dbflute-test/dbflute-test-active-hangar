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
 * The abstract condition-query of WHITE_ON_PARADE_REF.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteOnParadeRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteOnParadeRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_ON_PARADE_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refId The value of refId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefId_Equal(Long refId) {
        doSetRefId_Equal(refId);
    }

    protected void doSetRefId_Equal(Long refId) {
        regRefId(CK_EQ, refId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refId The value of refId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefId_NotEqual(Long refId) {
        doSetRefId_NotEqual(refId);
    }

    protected void doSetRefId_NotEqual(Long refId) {
        regRefId(CK_NES, refId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refId The value of refId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefId_GreaterThan(Long refId) {
        regRefId(CK_GT, refId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refId The value of refId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefId_LessThan(Long refId) {
        regRefId(CK_LT, refId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refId The value of refId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefId_GreaterEqual(Long refId) {
        regRefId(CK_GE, refId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refId The value of refId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefId_LessEqual(Long refId) {
        regRefId(CK_LE, refId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of refId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of refId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefId(), "REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refIdList The collection of refId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefId_InScope(Collection<Long> refIdList) {
        doSetRefId_InScope(refIdList);
    }

    protected void doSetRefId_InScope(Collection<Long> refIdList) {
        regINS(CK_INS, cTL(refIdList), xgetCValueRefId(), "REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param refIdList The collection of refId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefId_NotInScope(Collection<Long> refIdList) {
        doSetRefId_NotInScope(refIdList);
    }

    protected void doSetRefId_NotInScope(Collection<Long> refIdList) {
        regINS(CK_NINS, cTL(refIdList), xgetCValueRefId(), "REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefId_IsNull() { regRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefId_IsNotNull() { regRefId(CK_ISNN, DOBJ); }

    protected void regRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefId(), "REF_ID"); }
    protected abstract ConditionValue xgetCValueRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(100)}
     * @param refName The value of refName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefName_Equal(String refName) {
        doSetRefName_Equal(fRES(refName));
    }

    protected void doSetRefName_Equal(String refName) {
        regRefName(CK_EQ, refName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setRefName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param refName The value of refName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRefName_LikeSearch(String refName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRefName_LikeSearch(refName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setRefName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refName The value of refName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRefName_LikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refName), xgetCValueRefName(), "REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(100)}
     * @param refName The value of refName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRefName_NotLikeSearch(String refName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRefName_NotLikeSearch(refName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REF_NAME: {NotNull, VARCHAR(100)}
     * @param refName The value of refName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRefName_NotLikeSearch(String refName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refName), xgetCValueRefName(), "REF_NAME", likeSearchOption);
    }

    protected void regRefName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefName(), "REF_NAME"); }
    protected abstract ConditionValue xgetCValueRefName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeId The value of nullableFkOnParadeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_Equal(Long nullableFkOnParadeId) {
        doSetNullableFkOnParadeId_Equal(nullableFkOnParadeId);
    }

    protected void doSetNullableFkOnParadeId_Equal(Long nullableFkOnParadeId) {
        regNullableFkOnParadeId(CK_EQ, nullableFkOnParadeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeId The value of nullableFkOnParadeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_NotEqual(Long nullableFkOnParadeId) {
        doSetNullableFkOnParadeId_NotEqual(nullableFkOnParadeId);
    }

    protected void doSetNullableFkOnParadeId_NotEqual(Long nullableFkOnParadeId) {
        regNullableFkOnParadeId(CK_NES, nullableFkOnParadeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeId The value of nullableFkOnParadeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_GreaterThan(Long nullableFkOnParadeId) {
        regNullableFkOnParadeId(CK_GT, nullableFkOnParadeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeId The value of nullableFkOnParadeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_LessThan(Long nullableFkOnParadeId) {
        regNullableFkOnParadeId(CK_LT, nullableFkOnParadeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeId The value of nullableFkOnParadeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_GreaterEqual(Long nullableFkOnParadeId) {
        regNullableFkOnParadeId(CK_GE, nullableFkOnParadeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeId The value of nullableFkOnParadeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_LessEqual(Long nullableFkOnParadeId) {
        regNullableFkOnParadeId(CK_LE, nullableFkOnParadeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param minNumber The min number of nullableFkOnParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nullableFkOnParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNullableFkOnParadeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNullableFkOnParadeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param minNumber The min number of nullableFkOnParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nullableFkOnParadeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNullableFkOnParadeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNullableFkOnParadeId(), "NULLABLE_FK_ON_PARADE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeIdList The collection of nullableFkOnParadeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_InScope(Collection<Long> nullableFkOnParadeIdList) {
        doSetNullableFkOnParadeId_InScope(nullableFkOnParadeIdList);
    }

    protected void doSetNullableFkOnParadeId_InScope(Collection<Long> nullableFkOnParadeIdList) {
        regINS(CK_INS, cTL(nullableFkOnParadeIdList), xgetCValueNullableFkOnParadeId(), "NULLABLE_FK_ON_PARADE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @param nullableFkOnParadeIdList The collection of nullableFkOnParadeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableFkOnParadeId_NotInScope(Collection<Long> nullableFkOnParadeIdList) {
        doSetNullableFkOnParadeId_NotInScope(nullableFkOnParadeIdList);
    }

    protected void doSetNullableFkOnParadeId_NotInScope(Collection<Long> nullableFkOnParadeIdList) {
        regINS(CK_NINS, cTL(nullableFkOnParadeIdList), xgetCValueNullableFkOnParadeId(), "NULLABLE_FK_ON_PARADE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     */
    public void setNullableFkOnParadeId_IsNull() { regNullableFkOnParadeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     */
    public void setNullableFkOnParadeId_IsNotNull() { regNullableFkOnParadeId(CK_ISNN, DOBJ); }

    protected void regNullableFkOnParadeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableFkOnParadeId(), "NULLABLE_FK_ON_PARADE_ID"); }
    protected abstract ConditionValue xgetCValueNullableFkOnParadeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyId The value of nullableFkToManyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_Equal(Long nullableFkToManyId) {
        doSetNullableFkToManyId_Equal(nullableFkToManyId);
    }

    protected void doSetNullableFkToManyId_Equal(Long nullableFkToManyId) {
        regNullableFkToManyId(CK_EQ, nullableFkToManyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyId The value of nullableFkToManyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_NotEqual(Long nullableFkToManyId) {
        doSetNullableFkToManyId_NotEqual(nullableFkToManyId);
    }

    protected void doSetNullableFkToManyId_NotEqual(Long nullableFkToManyId) {
        regNullableFkToManyId(CK_NES, nullableFkToManyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyId The value of nullableFkToManyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_GreaterThan(Long nullableFkToManyId) {
        regNullableFkToManyId(CK_GT, nullableFkToManyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyId The value of nullableFkToManyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_LessThan(Long nullableFkToManyId) {
        regNullableFkToManyId(CK_LT, nullableFkToManyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyId The value of nullableFkToManyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_GreaterEqual(Long nullableFkToManyId) {
        regNullableFkToManyId(CK_GE, nullableFkToManyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyId The value of nullableFkToManyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_LessEqual(Long nullableFkToManyId) {
        regNullableFkToManyId(CK_LE, nullableFkToManyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param minNumber The min number of nullableFkToManyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nullableFkToManyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNullableFkToManyId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNullableFkToManyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param minNumber The min number of nullableFkToManyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nullableFkToManyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNullableFkToManyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNullableFkToManyId(), "NULLABLE_FK_TO_MANY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyIdList The collection of nullableFkToManyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_InScope(Collection<Long> nullableFkToManyIdList) {
        doSetNullableFkToManyId_InScope(nullableFkToManyIdList);
    }

    protected void doSetNullableFkToManyId_InScope(Collection<Long> nullableFkToManyIdList) {
        regINS(CK_INS, cTL(nullableFkToManyIdList), xgetCValueNullableFkToManyId(), "NULLABLE_FK_TO_MANY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @param nullableFkToManyIdList The collection of nullableFkToManyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNullableFkToManyId_NotInScope(Collection<Long> nullableFkToManyIdList) {
        doSetNullableFkToManyId_NotInScope(nullableFkToManyIdList);
    }

    protected void doSetNullableFkToManyId_NotInScope(Collection<Long> nullableFkToManyIdList) {
        regINS(CK_NINS, cTL(nullableFkToManyIdList), xgetCValueNullableFkToManyId(), "NULLABLE_FK_TO_MANY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     */
    public void setNullableFkToManyId_IsNull() { regNullableFkToManyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     */
    public void setNullableFkToManyId_IsNotNull() { regNullableFkToManyId(CK_ISNN, DOBJ); }

    protected void regNullableFkToManyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNullableFkToManyId(), "NULLABLE_FK_TO_MANY_ID"); }
    protected abstract ConditionValue xgetCValueNullableFkToManyId();

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
    public HpSLCFunction<WhiteOnParadeRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteOnParadeRefCB.class);
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
    public HpSLCFunction<WhiteOnParadeRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteOnParadeRefCB.class);
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
    public HpSLCFunction<WhiteOnParadeRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteOnParadeRefCB.class);
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
    public HpSLCFunction<WhiteOnParadeRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteOnParadeRefCB.class);
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
    public HpSLCFunction<WhiteOnParadeRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteOnParadeRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteOnParadeRefCB&gt;() {
     *     public void query(WhiteOnParadeRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteOnParadeRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteOnParadeRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteOnParadeRefCQ sq);

    protected WhiteOnParadeRefCB xcreateScalarConditionCB() {
        WhiteOnParadeRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteOnParadeRefCB xcreateScalarConditionPartitionByCB() {
        WhiteOnParadeRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteOnParadeRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteOnParadeRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteOnParadeRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteOnParadeRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REF_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteOnParadeRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteOnParadeRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteOnParadeRefCB cb = new WhiteOnParadeRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteOnParadeRefCQ sq);

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
    protected WhiteOnParadeRefCB newMyCB() {
        return new WhiteOnParadeRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteOnParadeRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
