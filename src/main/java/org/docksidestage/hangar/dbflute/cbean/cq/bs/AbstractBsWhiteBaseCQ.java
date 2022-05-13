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
 * The abstract condition-query of WHITE_BASE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_BASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseId The value of baseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_Equal(Integer baseId) {
        doSetBaseId_Equal(baseId);
    }

    protected void doSetBaseId_Equal(Integer baseId) {
        regBaseId(CK_EQ, baseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseId The value of baseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_NotEqual(Integer baseId) {
        doSetBaseId_NotEqual(baseId);
    }

    protected void doSetBaseId_NotEqual(Integer baseId) {
        regBaseId(CK_NES, baseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseId The value of baseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterThan(Integer baseId) {
        regBaseId(CK_GT, baseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseId The value of baseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessThan(Integer baseId) {
        regBaseId(CK_LT, baseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseId The value of baseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_GreaterEqual(Integer baseId) {
        regBaseId(CK_GE, baseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseId The value of baseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBaseId_LessEqual(Integer baseId) {
        regBaseId(CK_LE, baseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of baseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBaseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBaseId(), "BASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseIdList The collection of baseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_InScope(Collection<Integer> baseIdList) {
        doSetBaseId_InScope(baseIdList);
    }

    protected void doSetBaseId_InScope(Collection<Integer> baseIdList) {
        regINS(CK_INS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @param baseIdList The collection of baseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseId_NotInScope(Collection<Integer> baseIdList) {
        doSetBaseId_NotInScope(baseIdList);
    }

    protected void doSetBaseId_NotInScope(Collection<Integer> baseIdList) {
        regINS(CK_NINS, cTL(baseIdList), xgetCValueBaseId(), "BASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setBaseId_IsNull() { regBaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     */
    public void setBaseId_IsNotNull() { regBaseId(CK_ISNN, DOBJ); }

    protected void regBaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseId(), "BASE_ID"); }
    protected abstract ConditionValue xgetCValueBaseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)}
     * @param baseName The value of baseName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseName_Equal(String baseName) {
        doSetBaseName_Equal(fRES(baseName));
    }

    protected void doSetBaseName_Equal(String baseName) {
        regBaseName(CK_EQ, baseName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setBaseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param baseName The value of baseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBaseName_LikeSearch(String baseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBaseName_LikeSearch(baseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setBaseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseName The value of baseName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBaseName_LikeSearch(String baseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseName), xgetCValueBaseName(), "BASE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)}
     * @param baseName The value of baseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBaseName_NotLikeSearch(String baseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBaseName_NotLikeSearch(baseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NAME: {NotNull, VARCHAR(200)}
     * @param baseName The value of baseName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBaseName_NotLikeSearch(String baseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseName), xgetCValueBaseName(), "BASE_NAME", likeSearchOption);
    }

    protected void regBaseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseName(), "BASE_NAME"); }
    protected abstract ConditionValue xgetCValueBaseName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
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
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
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
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_GreaterThan(Integer seaId) {
        regSeaId(CK_GT, seaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_LessThan(Integer seaId) {
        regSeaId(CK_LT, seaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_GreaterEqual(Integer seaId) {
        regSeaId(CK_GE, seaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaId The value of seaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaId_LessEqual(Integer seaId) {
        regSeaId(CK_LE, seaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
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
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param minNumber The min number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSeaId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeaId(), "SEA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
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
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @param seaIdList The collection of seaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaId_NotInScope(Collection<Integer> seaIdList) {
        doSetSeaId_NotInScope(seaIdList);
    }

    protected void doSetSeaId_NotInScope(Collection<Integer> seaIdList) {
        regINS(CK_NINS, cTL(seaIdList), xgetCValueSeaId(), "SEA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     */
    public void setSeaId_IsNull() { regSeaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     */
    public void setSeaId_IsNotNull() { regSeaId(CK_ISNN, DOBJ); }

    protected void regSeaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeaId(), "SEA_ID"); }
    protected abstract ConditionValue xgetCValueSeaId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landId The value of landId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_Equal(Integer landId) {
        doSetLandId_Equal(landId);
    }

    protected void doSetLandId_Equal(Integer landId) {
        regLandId(CK_EQ, landId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landId The value of landId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_NotEqual(Integer landId) {
        doSetLandId_NotEqual(landId);
    }

    protected void doSetLandId_NotEqual(Integer landId) {
        regLandId(CK_NES, landId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landId The value of landId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_GreaterThan(Integer landId) {
        regLandId(CK_GT, landId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landId The value of landId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_LessThan(Integer landId) {
        regLandId(CK_LT, landId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landId The value of landId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_GreaterEqual(Integer landId) {
        regLandId(CK_GE, landId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landId The value of landId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLandId_LessEqual(Integer landId) {
        regLandId(CK_LE, landId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param minNumber The min number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLandId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLandId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param minNumber The min number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of landId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLandId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLandId(), "LAND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landIdList The collection of landId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLandId_InScope(Collection<Integer> landIdList) {
        doSetLandId_InScope(landIdList);
    }

    protected void doSetLandId_InScope(Collection<Integer> landIdList) {
        regINS(CK_INS, cTL(landIdList), xgetCValueLandId(), "LAND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @param landIdList The collection of landId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLandId_NotInScope(Collection<Integer> landIdList) {
        doSetLandId_NotInScope(landIdList);
    }

    protected void doSetLandId_NotInScope(Collection<Integer> landIdList) {
        regINS(CK_NINS, cTL(landIdList), xgetCValueLandId(), "LAND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     */
    public void setLandId_IsNull() { regLandId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     */
    public void setLandId_IsNotNull() { regLandId(CK_ISNN, DOBJ); }

    protected void regLandId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLandId(), "LAND_ID"); }
    protected abstract ConditionValue xgetCValueLandId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariId The value of piariId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_Equal(Integer piariId) {
        doSetPiariId_Equal(piariId);
    }

    protected void doSetPiariId_Equal(Integer piariId) {
        regPiariId(CK_EQ, piariId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariId The value of piariId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_NotEqual(Integer piariId) {
        doSetPiariId_NotEqual(piariId);
    }

    protected void doSetPiariId_NotEqual(Integer piariId) {
        regPiariId(CK_NES, piariId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariId The value of piariId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_GreaterThan(Integer piariId) {
        regPiariId(CK_GT, piariId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariId The value of piariId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_LessThan(Integer piariId) {
        regPiariId(CK_LT, piariId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariId The value of piariId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_GreaterEqual(Integer piariId) {
        regPiariId(CK_GE, piariId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariId The value of piariId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPiariId_LessEqual(Integer piariId) {
        regPiariId(CK_LE, piariId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param minNumber The min number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPiariId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPiariId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param minNumber The min number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of piariId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPiariId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePiariId(), "PIARI_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariIdList The collection of piariId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPiariId_InScope(Collection<Integer> piariIdList) {
        doSetPiariId_InScope(piariIdList);
    }

    protected void doSetPiariId_InScope(Collection<Integer> piariIdList) {
        regINS(CK_INS, cTL(piariIdList), xgetCValuePiariId(), "PIARI_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @param piariIdList The collection of piariId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPiariId_NotInScope(Collection<Integer> piariIdList) {
        doSetPiariId_NotInScope(piariIdList);
    }

    protected void doSetPiariId_NotInScope(Collection<Integer> piariIdList) {
        regINS(CK_NINS, cTL(piariIdList), xgetCValuePiariId(), "PIARI_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     */
    public void setPiariId_IsNull() { regPiariId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     */
    public void setPiariId_IsNotNull() { regPiariId(CK_ISNN, DOBJ); }

    protected void regPiariId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePiariId(), "PIARI_ID"); }
    protected abstract ConditionValue xgetCValuePiariId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
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
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
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
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @param bonvoId The value of bonvoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_GreaterThan(Integer bonvoId) {
        regBonvoId(CK_GT, bonvoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @param bonvoId The value of bonvoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_LessThan(Integer bonvoId) {
        regBonvoId(CK_LT, bonvoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @param bonvoId The value of bonvoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_GreaterEqual(Integer bonvoId) {
        regBonvoId(CK_GE, bonvoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @param bonvoId The value of bonvoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBonvoId_LessEqual(Integer bonvoId) {
        regBonvoId(CK_LE, bonvoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
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
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @param minNumber The min number of bonvoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bonvoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBonvoId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBonvoId(), "BONVO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
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
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @param bonvoIdList The collection of bonvoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBonvoId_NotInScope(Collection<Integer> bonvoIdList) {
        doSetBonvoId_NotInScope(bonvoIdList);
    }

    protected void doSetBonvoId_NotInScope(Collection<Integer> bonvoIdList) {
        regINS(CK_NINS, cTL(bonvoIdList), xgetCValueBonvoId(), "BONVO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     */
    public void setBonvoId_IsNull() { regBonvoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     */
    public void setBonvoId_IsNotNull() { regBonvoId(CK_ISNN, DOBJ); }

    protected void regBonvoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBonvoId(), "BONVO_ID"); }
    protected abstract ConditionValue xgetCValueBonvoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreId The value of dstoreId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDstoreId_Equal(Integer dstoreId) {
        doSetDstoreId_Equal(dstoreId);
    }

    protected void doSetDstoreId_Equal(Integer dstoreId) {
        regDstoreId(CK_EQ, dstoreId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreId The value of dstoreId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDstoreId_NotEqual(Integer dstoreId) {
        doSetDstoreId_NotEqual(dstoreId);
    }

    protected void doSetDstoreId_NotEqual(Integer dstoreId) {
        regDstoreId(CK_NES, dstoreId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreId The value of dstoreId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDstoreId_GreaterThan(Integer dstoreId) {
        regDstoreId(CK_GT, dstoreId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreId The value of dstoreId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDstoreId_LessThan(Integer dstoreId) {
        regDstoreId(CK_LT, dstoreId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreId The value of dstoreId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDstoreId_GreaterEqual(Integer dstoreId) {
        regDstoreId(CK_GE, dstoreId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreId The value of dstoreId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDstoreId_LessEqual(Integer dstoreId) {
        regDstoreId(CK_LE, dstoreId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param minNumber The min number of dstoreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dstoreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDstoreId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDstoreId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param minNumber The min number of dstoreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dstoreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDstoreId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDstoreId(), "DSTORE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreIdList The collection of dstoreId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstoreId_InScope(Collection<Integer> dstoreIdList) {
        doSetDstoreId_InScope(dstoreIdList);
    }

    protected void doSetDstoreId_InScope(Collection<Integer> dstoreIdList) {
        regINS(CK_INS, cTL(dstoreIdList), xgetCValueDstoreId(), "DSTORE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @param dstoreIdList The collection of dstoreId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDstoreId_NotInScope(Collection<Integer> dstoreIdList) {
        doSetDstoreId_NotInScope(dstoreIdList);
    }

    protected void doSetDstoreId_NotInScope(Collection<Integer> dstoreIdList) {
        regINS(CK_NINS, cTL(dstoreIdList), xgetCValueDstoreId(), "DSTORE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     */
    public void setDstoreId_IsNull() { regDstoreId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     */
    public void setDstoreId_IsNotNull() { regDstoreId(CK_ISNN, DOBJ); }

    protected void regDstoreId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDstoreId(), "DSTORE_ID"); }
    protected abstract ConditionValue xgetCValueDstoreId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaId The value of ambaId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_Equal(Integer ambaId) {
        doSetAmbaId_Equal(ambaId);
    }

    protected void doSetAmbaId_Equal(Integer ambaId) {
        regAmbaId(CK_EQ, ambaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaId The value of ambaId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_NotEqual(Integer ambaId) {
        doSetAmbaId_NotEqual(ambaId);
    }

    protected void doSetAmbaId_NotEqual(Integer ambaId) {
        regAmbaId(CK_NES, ambaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaId The value of ambaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_GreaterThan(Integer ambaId) {
        regAmbaId(CK_GT, ambaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaId The value of ambaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_LessThan(Integer ambaId) {
        regAmbaId(CK_LT, ambaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaId The value of ambaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_GreaterEqual(Integer ambaId) {
        regAmbaId(CK_GE, ambaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaId The value of ambaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmbaId_LessEqual(Integer ambaId) {
        regAmbaId(CK_LE, ambaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param minNumber The min number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAmbaId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAmbaId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param minNumber The min number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ambaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAmbaId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmbaId(), "AMBA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaIdList The collection of ambaId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmbaId_InScope(Collection<Integer> ambaIdList) {
        doSetAmbaId_InScope(ambaIdList);
    }

    protected void doSetAmbaId_InScope(Collection<Integer> ambaIdList) {
        regINS(CK_INS, cTL(ambaIdList), xgetCValueAmbaId(), "AMBA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @param ambaIdList The collection of ambaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAmbaId_NotInScope(Collection<Integer> ambaIdList) {
        doSetAmbaId_NotInScope(ambaIdList);
    }

    protected void doSetAmbaId_NotInScope(Collection<Integer> ambaIdList) {
        regINS(CK_NINS, cTL(ambaIdList), xgetCValueAmbaId(), "AMBA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     */
    public void setAmbaId_IsNull() { regAmbaId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     */
    public void setAmbaId_IsNotNull() { regAmbaId(CK_ISNN, DOBJ); }

    protected void regAmbaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmbaId(), "AMBA_ID"); }
    protected abstract ConditionValue xgetCValueAmbaId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoId The value of miracoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMiracoId_Equal(Integer miracoId) {
        doSetMiracoId_Equal(miracoId);
    }

    protected void doSetMiracoId_Equal(Integer miracoId) {
        regMiracoId(CK_EQ, miracoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoId The value of miracoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMiracoId_NotEqual(Integer miracoId) {
        doSetMiracoId_NotEqual(miracoId);
    }

    protected void doSetMiracoId_NotEqual(Integer miracoId) {
        regMiracoId(CK_NES, miracoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoId The value of miracoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMiracoId_GreaterThan(Integer miracoId) {
        regMiracoId(CK_GT, miracoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoId The value of miracoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMiracoId_LessThan(Integer miracoId) {
        regMiracoId(CK_LT, miracoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoId The value of miracoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMiracoId_GreaterEqual(Integer miracoId) {
        regMiracoId(CK_GE, miracoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoId The value of miracoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMiracoId_LessEqual(Integer miracoId) {
        regMiracoId(CK_LE, miracoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param minNumber The min number of miracoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of miracoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMiracoId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMiracoId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param minNumber The min number of miracoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of miracoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMiracoId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMiracoId(), "MIRACO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoIdList The collection of miracoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMiracoId_InScope(Collection<Integer> miracoIdList) {
        doSetMiracoId_InScope(miracoIdList);
    }

    protected void doSetMiracoId_InScope(Collection<Integer> miracoIdList) {
        regINS(CK_INS, cTL(miracoIdList), xgetCValueMiracoId(), "MIRACO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @param miracoIdList The collection of miracoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMiracoId_NotInScope(Collection<Integer> miracoIdList) {
        doSetMiracoId_NotInScope(miracoIdList);
    }

    protected void doSetMiracoId_NotInScope(Collection<Integer> miracoIdList) {
        regINS(CK_NINS, cTL(miracoIdList), xgetCValueMiracoId(), "MIRACO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     */
    public void setMiracoId_IsNull() { regMiracoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     */
    public void setMiracoId_IsNotNull() { regMiracoId(CK_ISNN, DOBJ); }

    protected void regMiracoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMiracoId(), "MIRACO_ID"); }
    protected abstract ConditionValue xgetCValueMiracoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelId The value of dohotelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_Equal(Integer dohotelId) {
        doSetDohotelId_Equal(dohotelId);
    }

    protected void doSetDohotelId_Equal(Integer dohotelId) {
        regDohotelId(CK_EQ, dohotelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelId The value of dohotelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_NotEqual(Integer dohotelId) {
        doSetDohotelId_NotEqual(dohotelId);
    }

    protected void doSetDohotelId_NotEqual(Integer dohotelId) {
        regDohotelId(CK_NES, dohotelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelId The value of dohotelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_GreaterThan(Integer dohotelId) {
        regDohotelId(CK_GT, dohotelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelId The value of dohotelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_LessThan(Integer dohotelId) {
        regDohotelId(CK_LT, dohotelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelId The value of dohotelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_GreaterEqual(Integer dohotelId) {
        regDohotelId(CK_GE, dohotelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelId The value of dohotelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDohotelId_LessEqual(Integer dohotelId) {
        regDohotelId(CK_LE, dohotelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param minNumber The min number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDohotelId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDohotelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param minNumber The min number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dohotelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDohotelId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDohotelId(), "DOHOTEL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelIdList The collection of dohotelId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDohotelId_InScope(Collection<Integer> dohotelIdList) {
        doSetDohotelId_InScope(dohotelIdList);
    }

    protected void doSetDohotelId_InScope(Collection<Integer> dohotelIdList) {
        regINS(CK_INS, cTL(dohotelIdList), xgetCValueDohotelId(), "DOHOTEL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @param dohotelIdList The collection of dohotelId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDohotelId_NotInScope(Collection<Integer> dohotelIdList) {
        doSetDohotelId_NotInScope(dohotelIdList);
    }

    protected void doSetDohotelId_NotInScope(Collection<Integer> dohotelIdList) {
        regINS(CK_NINS, cTL(dohotelIdList), xgetCValueDohotelId(), "DOHOTEL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     */
    public void setDohotelId_IsNull() { regDohotelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     */
    public void setDohotelId_IsNotNull() { regDohotelId(CK_ISNN, DOBJ); }

    protected void regDohotelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDohotelId(), "DOHOTEL_ID"); }
    protected abstract ConditionValue xgetCValueDohotelId();

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
    public HpSLCFunction<WhiteBaseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteBaseCB.class);
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
    public HpSLCFunction<WhiteBaseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteBaseCB.class);
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
    public HpSLCFunction<WhiteBaseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteBaseCB.class);
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
    public HpSLCFunction<WhiteBaseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteBaseCB.class);
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
    public HpSLCFunction<WhiteBaseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteBaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBaseCB&gt;() {
     *     public void query(WhiteBaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteBaseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteBaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteBaseCQ sq);

    protected WhiteBaseCB xcreateScalarConditionCB() {
        WhiteBaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteBaseCB xcreateScalarConditionPartitionByCB() {
        WhiteBaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteBaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteBaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BASE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteBaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteBaseCQ sq);

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
    protected WhiteBaseCB newMyCB() {
        return new WhiteBaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteBaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
