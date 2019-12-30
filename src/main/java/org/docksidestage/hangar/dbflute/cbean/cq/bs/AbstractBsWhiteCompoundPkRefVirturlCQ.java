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
 * The abstract condition-query of WHITE_COMPOUND_PK_REF_VIRTURL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefVirturlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefVirturlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_COMPOUND_PK_REF_VIRTURL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstId The value of refFirstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_Equal(Long refFirstId) {
        doSetRefFirstId_Equal(refFirstId);
    }

    protected void doSetRefFirstId_Equal(Long refFirstId) {
        regRefFirstId(CK_EQ, refFirstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstId The value of refFirstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_NotEqual(Long refFirstId) {
        doSetRefFirstId_NotEqual(refFirstId);
    }

    protected void doSetRefFirstId_NotEqual(Long refFirstId) {
        regRefFirstId(CK_NES, refFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstId The value of refFirstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_GreaterThan(Long refFirstId) {
        regRefFirstId(CK_GT, refFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstId The value of refFirstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_LessThan(Long refFirstId) {
        regRefFirstId(CK_LT, refFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstId The value of refFirstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_GreaterEqual(Long refFirstId) {
        regRefFirstId(CK_GE, refFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstId The value of refFirstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefFirstId_LessEqual(Long refFirstId) {
        regRefFirstId(CK_LE, refFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param minNumber The min number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefFirstId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param minNumber The min number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refFirstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRefFirstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefFirstId(), "REF_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstIdList The collection of refFirstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefFirstId_InScope(Collection<Long> refFirstIdList) {
        doSetRefFirstId_InScope(refFirstIdList);
    }

    protected void doSetRefFirstId_InScope(Collection<Long> refFirstIdList) {
        regINS(CK_INS, cTL(refFirstIdList), xgetCValueRefFirstId(), "REF_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refFirstIdList The collection of refFirstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefFirstId_NotInScope(Collection<Long> refFirstIdList) {
        doSetRefFirstId_NotInScope(refFirstIdList);
    }

    protected void doSetRefFirstId_NotInScope(Collection<Long> refFirstIdList) {
        regINS(CK_NINS, cTL(refFirstIdList), xgetCValueRefFirstId(), "REF_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     */
    public void setRefFirstId_IsNull() { regRefFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     */
    public void setRefFirstId_IsNotNull() { regRefFirstId(CK_ISNN, DOBJ); }

    protected void regRefFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefFirstId(), "REF_FIRST_ID"); }
    protected abstract ConditionValue xgetCValueRefFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondId The value of refSecondId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_Equal(Long refSecondId) {
        doSetRefSecondId_Equal(refSecondId);
    }

    protected void doSetRefSecondId_Equal(Long refSecondId) {
        regRefSecondId(CK_EQ, refSecondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondId The value of refSecondId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_NotEqual(Long refSecondId) {
        doSetRefSecondId_NotEqual(refSecondId);
    }

    protected void doSetRefSecondId_NotEqual(Long refSecondId) {
        regRefSecondId(CK_NES, refSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondId The value of refSecondId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_GreaterThan(Long refSecondId) {
        regRefSecondId(CK_GT, refSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondId The value of refSecondId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_LessThan(Long refSecondId) {
        regRefSecondId(CK_LT, refSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondId The value of refSecondId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_GreaterEqual(Long refSecondId) {
        regRefSecondId(CK_GE, refSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondId The value of refSecondId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefSecondId_LessEqual(Long refSecondId) {
        regRefSecondId(CK_LE, refSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param minNumber The min number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefSecondId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param minNumber The min number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refSecondId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRefSecondId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefSecondId(), "REF_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondIdList The collection of refSecondId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefSecondId_InScope(Collection<Long> refSecondIdList) {
        doSetRefSecondId_InScope(refSecondIdList);
    }

    protected void doSetRefSecondId_InScope(Collection<Long> refSecondIdList) {
        regINS(CK_INS, cTL(refSecondIdList), xgetCValueRefSecondId(), "REF_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @param refSecondIdList The collection of refSecondId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefSecondId_NotInScope(Collection<Long> refSecondIdList) {
        doSetRefSecondId_NotInScope(refSecondIdList);
    }

    protected void doSetRefSecondId_NotInScope(Collection<Long> refSecondIdList) {
        regINS(CK_NINS, cTL(refSecondIdList), xgetCValueRefSecondId(), "REF_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     */
    public void setRefSecondId_IsNull() { regRefSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     */
    public void setRefSecondId_IsNotNull() { regRefSecondId(CK_ISNN, DOBJ); }

    protected void regRefSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefSecondId(), "REF_SECOND_ID"); }
    protected abstract ConditionValue xgetCValueRefSecondId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdId The value of refThirdId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefThirdId_Equal(Long refThirdId) {
        doSetRefThirdId_Equal(refThirdId);
    }

    protected void doSetRefThirdId_Equal(Long refThirdId) {
        regRefThirdId(CK_EQ, refThirdId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdId The value of refThirdId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefThirdId_NotEqual(Long refThirdId) {
        doSetRefThirdId_NotEqual(refThirdId);
    }

    protected void doSetRefThirdId_NotEqual(Long refThirdId) {
        regRefThirdId(CK_NES, refThirdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdId The value of refThirdId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefThirdId_GreaterThan(Long refThirdId) {
        regRefThirdId(CK_GT, refThirdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdId The value of refThirdId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefThirdId_LessThan(Long refThirdId) {
        regRefThirdId(CK_LT, refThirdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdId The value of refThirdId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefThirdId_GreaterEqual(Long refThirdId) {
        regRefThirdId(CK_GE, refThirdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdId The value of refThirdId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRefThirdId_LessEqual(Long refThirdId) {
        regRefThirdId(CK_LE, refThirdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of refThirdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refThirdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefThirdId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefThirdId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of refThirdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of refThirdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRefThirdId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefThirdId(), "REF_THIRD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdIdList The collection of refThirdId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefThirdId_InScope(Collection<Long> refThirdIdList) {
        doSetRefThirdId_InScope(refThirdIdList);
    }

    protected void doSetRefThirdId_InScope(Collection<Long> refThirdIdList) {
        regINS(CK_INS, cTL(refThirdIdList), xgetCValueRefThirdId(), "REF_THIRD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @param refThirdIdList The collection of refThirdId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefThirdId_NotInScope(Collection<Long> refThirdIdList) {
        doSetRefThirdId_NotInScope(refThirdIdList);
    }

    protected void doSetRefThirdId_NotInScope(Collection<Long> refThirdIdList) {
        regINS(CK_NINS, cTL(refThirdIdList), xgetCValueRefThirdId(), "REF_THIRD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefThirdId_IsNull() { regRefThirdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setRefThirdId_IsNotNull() { regRefThirdId(CK_ISNN, DOBJ); }

    protected void regRefThirdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefThirdId(), "REF_THIRD_ID"); }
    protected abstract ConditionValue xgetCValueRefThirdId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)}
     * @param compoundRefName The value of compoundRefName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompoundRefName_Equal(String compoundRefName) {
        doSetCompoundRefName_Equal(fRES(compoundRefName));
    }

    protected void doSetCompoundRefName_Equal(String compoundRefName) {
        regCompoundRefName(CK_EQ, compoundRefName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCompoundRefName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param compoundRefName The value of compoundRefName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundRefName_LikeSearch(String compoundRefName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundRefName_LikeSearch(compoundRefName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setCompoundRefName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundRefName The value of compoundRefName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCompoundRefName_LikeSearch(String compoundRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundRefName), xgetCValueCompoundRefName(), "COMPOUND_REF_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)}
     * @param compoundRefName The value of compoundRefName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCompoundRefName_NotLikeSearch(String compoundRefName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCompoundRefName_NotLikeSearch(compoundRefName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)}
     * @param compoundRefName The value of compoundRefName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCompoundRefName_NotLikeSearch(String compoundRefName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundRefName), xgetCValueCompoundRefName(), "COMPOUND_REF_NAME", likeSearchOption);
    }

    protected void regCompoundRefName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompoundRefName(), "COMPOUND_REF_NAME"); }
    protected abstract ConditionValue xgetCValueCompoundRefName();

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
    public HpSLCFunction<WhiteCompoundPkRefVirturlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteCompoundPkRefVirturlCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefVirturlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteCompoundPkRefVirturlCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefVirturlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteCompoundPkRefVirturlCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefVirturlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteCompoundPkRefVirturlCB.class);
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
    public HpSLCFunction<WhiteCompoundPkRefVirturlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteCompoundPkRefVirturlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefVirturlCB&gt;() {
     *     public void query(WhiteCompoundPkRefVirturlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteCompoundPkRefVirturlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteCompoundPkRefVirturlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefVirturlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefVirturlCQ sq);

    protected WhiteCompoundPkRefVirturlCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefVirturlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefVirturlCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefVirturlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteCompoundPkRefVirturlCB newMyCB() {
        return new WhiteCompoundPkRefVirturlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkRefVirturlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
