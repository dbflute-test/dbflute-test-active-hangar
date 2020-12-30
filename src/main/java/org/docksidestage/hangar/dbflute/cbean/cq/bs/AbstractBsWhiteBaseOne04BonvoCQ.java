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
 * The abstract condition-query of WHITE_BASE_ONE04_BONVO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseOne04BonvoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseOne04BonvoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE_ONE04_BONVO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoId The value of bonvoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_Equal(Integer bonvoId) {
        doSetBonvoId_Equal(bonvoId);
    }

    protected void doSetBonvoId_Equal(Integer bonvoId) {
        regBonvoId(CK_EQ, bonvoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoId The value of bonvoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_NotEqual(Integer bonvoId) {
        doSetBonvoId_NotEqual(bonvoId);
    }

    protected void doSetBonvoId_NotEqual(Integer bonvoId) {
        regBonvoId(CK_NES, bonvoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoId The value of bonvoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_GreaterThan(Integer bonvoId) {
        regBonvoId(CK_GT, bonvoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoId The value of bonvoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_LessThan(Integer bonvoId) {
        regBonvoId(CK_LT, bonvoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoId The value of bonvoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_GreaterEqual(Integer bonvoId) {
        regBonvoId(CK_GE, bonvoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoId The value of bonvoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_LessEqual(Integer bonvoId) {
        regBonvoId(CK_LE, bonvoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of bonvoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bonvoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBonvoId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBonvoId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of bonvoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bonvoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBonvoId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBonvoId(), "BONVO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoIdList The collection of bonvoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBonvoId_InScope(Collection<Integer> bonvoIdList) {
        doSetBonvoId_InScope(bonvoIdList);
    }

    protected void doSetBonvoId_InScope(Collection<Integer> bonvoIdList) {
        regINS(CK_INS, cTL(bonvoIdList), xgetCValueBonvoId(), "BONVO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @param bonvoIdList The collection of bonvoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBonvoId_NotInScope(Collection<Integer> bonvoIdList) {
        doSetBonvoId_NotInScope(bonvoIdList);
    }

    protected void doSetBonvoId_NotInScope(Collection<Integer> bonvoIdList) {
        regINS(CK_NINS, cTL(bonvoIdList), xgetCValueBonvoId(), "BONVO_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BONVO_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by BONVO_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBonvoId_ExistsReferrer_WhiteBaseList(cb.query());
        registerExistsReferrer(cb.query(), "BONVO_ID", "BONVO_ID", pp, "whiteBaseList");
    }
    public abstract String keepBonvoId_ExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BONVO_ID from WHITE_BASE where ...)} <br>
     * WHITE_BASE by BONVO_ID, named 'whiteBaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteBase</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     baseCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BonvoId_NotExistsReferrer_WhiteBaseList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteBase(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBonvoId_NotExistsReferrer_WhiteBaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "BONVO_ID", "BONVO_ID", pp, "whiteBaseList");
    }
    public abstract String keepBonvoId_NotExistsReferrer_WhiteBaseList(WhiteBaseCQ sq);

    public void xsderiveWhiteBaseList(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBonvoId_SpecifyDerivedReferrer_WhiteBaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BONVO_ID", "BONVO_ID", pp, "whiteBaseList", al, op);
    }
    public abstract String keepBonvoId_SpecifyDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from WHITE_BASE where ...)} <br>
     * WHITE_BASE by BONVO_ID, named 'whiteBaseAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepBonvoId_QueryDerivedReferrer_WhiteBaseList(cb.query()); String prpp = keepBonvoId_QueryDerivedReferrer_WhiteBaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BONVO_ID", "BONVO_ID", sqpp, "whiteBaseList", rd, vl, prpp, op);
    }
    public abstract String keepBonvoId_QueryDerivedReferrer_WhiteBaseList(WhiteBaseCQ sq);
    public abstract String keepBonvoId_QueryDerivedReferrer_WhiteBaseListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setBonvoId_IsNull() { regBonvoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setBonvoId_IsNotNull() { regBonvoId(CK_ISNN, DOBJ); }

    protected void regBonvoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBonvoId(), "BONVO_ID"); }
    protected abstract ConditionValue xgetCValueBonvoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)}
     * @param bonvoName The value of bonvoName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBonvoName_Equal(String bonvoName) {
        doSetBonvoName_Equal(fRES(bonvoName));
    }

    protected void doSetBonvoName_Equal(String bonvoName) {
        regBonvoName(CK_EQ, bonvoName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setBonvoName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param bonvoName The value of bonvoName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBonvoName_LikeSearch(String bonvoName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBonvoName_LikeSearch(bonvoName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setBonvoName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bonvoName The value of bonvoName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBonvoName_LikeSearch(String bonvoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bonvoName), xgetCValueBonvoName(), "BONVO_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)}
     * @param bonvoName The value of bonvoName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBonvoName_NotLikeSearch(String bonvoName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBonvoName_NotLikeSearch(bonvoName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BONVO_NAME: {NotNull, VARCHAR(200)}
     * @param bonvoName The value of bonvoName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBonvoName_NotLikeSearch(String bonvoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bonvoName), xgetCValueBonvoName(), "BONVO_NAME", likeSearchOption);
    }

    protected void regBonvoName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBonvoName(), "BONVO_NAME"); }
    protected abstract ConditionValue xgetCValueBonvoName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideId The value of parksideId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_Equal(Integer parksideId) {
        doSetParksideId_Equal(parksideId);
    }

    protected void doSetParksideId_Equal(Integer parksideId) {
        regParksideId(CK_EQ, parksideId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideId The value of parksideId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_NotEqual(Integer parksideId) {
        doSetParksideId_NotEqual(parksideId);
    }

    protected void doSetParksideId_NotEqual(Integer parksideId) {
        regParksideId(CK_NES, parksideId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideId The value of parksideId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_GreaterThan(Integer parksideId) {
        regParksideId(CK_GT, parksideId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideId The value of parksideId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_LessThan(Integer parksideId) {
        regParksideId(CK_LT, parksideId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideId The value of parksideId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_GreaterEqual(Integer parksideId) {
        regParksideId(CK_GE, parksideId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideId The value of parksideId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParksideId_LessEqual(Integer parksideId) {
        regParksideId(CK_LE, parksideId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param minNumber The min number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParksideId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParksideId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param minNumber The min number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parksideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParksideId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParksideId(), "PARKSIDE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideIdList The collection of parksideId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParksideId_InScope(Collection<Integer> parksideIdList) {
        doSetParksideId_InScope(parksideIdList);
    }

    protected void doSetParksideId_InScope(Collection<Integer> parksideIdList) {
        regINS(CK_INS, cTL(parksideIdList), xgetCValueParksideId(), "PARKSIDE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @param parksideIdList The collection of parksideId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParksideId_NotInScope(Collection<Integer> parksideIdList) {
        doSetParksideId_NotInScope(parksideIdList);
    }

    protected void doSetParksideId_NotInScope(Collection<Integer> parksideIdList) {
        regINS(CK_NINS, cTL(parksideIdList), xgetCValueParksideId(), "PARKSIDE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     */
    public void setParksideId_IsNull() { regParksideId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     */
    public void setParksideId_IsNotNull() { regParksideId(CK_ISNN, DOBJ); }

    protected void regParksideId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParksideId(), "PARKSIDE_ID"); }
    protected abstract ConditionValue xgetCValueParksideId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideId The value of stationsideId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_Equal(Integer stationsideId) {
        doSetStationsideId_Equal(stationsideId);
    }

    protected void doSetStationsideId_Equal(Integer stationsideId) {
        regStationsideId(CK_EQ, stationsideId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideId The value of stationsideId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_NotEqual(Integer stationsideId) {
        doSetStationsideId_NotEqual(stationsideId);
    }

    protected void doSetStationsideId_NotEqual(Integer stationsideId) {
        regStationsideId(CK_NES, stationsideId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideId The value of stationsideId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_GreaterThan(Integer stationsideId) {
        regStationsideId(CK_GT, stationsideId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideId The value of stationsideId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_LessThan(Integer stationsideId) {
        regStationsideId(CK_LT, stationsideId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideId The value of stationsideId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_GreaterEqual(Integer stationsideId) {
        regStationsideId(CK_GE, stationsideId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideId The value of stationsideId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStationsideId_LessEqual(Integer stationsideId) {
        regStationsideId(CK_LE, stationsideId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param minNumber The min number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setStationsideId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setStationsideId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param minNumber The min number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stationsideId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setStationsideId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStationsideId(), "STATIONSIDE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideIdList The collection of stationsideId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationsideId_InScope(Collection<Integer> stationsideIdList) {
        doSetStationsideId_InScope(stationsideIdList);
    }

    protected void doSetStationsideId_InScope(Collection<Integer> stationsideIdList) {
        regINS(CK_INS, cTL(stationsideIdList), xgetCValueStationsideId(), "STATIONSIDE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @param stationsideIdList The collection of stationsideId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStationsideId_NotInScope(Collection<Integer> stationsideIdList) {
        doSetStationsideId_NotInScope(stationsideIdList);
    }

    protected void doSetStationsideId_NotInScope(Collection<Integer> stationsideIdList) {
        regINS(CK_NINS, cTL(stationsideIdList), xgetCValueStationsideId(), "STATIONSIDE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     */
    public void setStationsideId_IsNull() { regStationsideId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     */
    public void setStationsideId_IsNotNull() { regStationsideId(CK_ISNN, DOBJ); }

    protected void regStationsideId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStationsideId(), "STATIONSIDE_ID"); }
    protected abstract ConditionValue xgetCValueStationsideId();

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
    public HpSLCFunction<WhiteBaseOne04BonvoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseOne04BonvoCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseOne04BonvoCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseOne04BonvoCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseOne04BonvoCB.class);
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
    public HpSLCFunction<WhiteBaseOne04BonvoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseOne04BonvoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseOne04BonvoCB&gt;() {
     *     public void query(WhiteBaseOne04BonvoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseOne04BonvoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseOne04BonvoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseOne04BonvoCQ sq);

    protected WhiteBaseOne04BonvoCB xcreateScalarConditionCB() {
        WhiteBaseOne04BonvoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseOne04BonvoCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseOne04BonvoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseOne04BonvoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BONVO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseOne04BonvoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseOne04BonvoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseOne04BonvoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BONVO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseOne04BonvoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseOne04BonvoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseOne04BonvoCB cb = new WhiteBaseOne04BonvoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseOne04BonvoCQ sq);

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
    protected WhiteBaseOne04BonvoCB newMyCB() {
        return new WhiteBaseOne04BonvoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseOne04BonvoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
