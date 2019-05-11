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
 * The abstract condition-query of WHITE_CLASSIFICATION_DEPLOYMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteClassificationDeploymentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteClassificationDeploymentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_CLASSIFICATION_DEPLOYMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentId The value of deploymentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentId_Equal(Long deploymentId) {
        doSetDeploymentId_Equal(deploymentId);
    }

    protected void doSetDeploymentId_Equal(Long deploymentId) {
        regDeploymentId(CK_EQ, deploymentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentId The value of deploymentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentId_NotEqual(Long deploymentId) {
        doSetDeploymentId_NotEqual(deploymentId);
    }

    protected void doSetDeploymentId_NotEqual(Long deploymentId) {
        regDeploymentId(CK_NES, deploymentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentId The value of deploymentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentId_GreaterThan(Long deploymentId) {
        regDeploymentId(CK_GT, deploymentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentId The value of deploymentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentId_LessThan(Long deploymentId) {
        regDeploymentId(CK_LT, deploymentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentId The value of deploymentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentId_GreaterEqual(Long deploymentId) {
        regDeploymentId(CK_GE, deploymentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentId The value of deploymentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentId_LessEqual(Long deploymentId) {
        regDeploymentId(CK_LE, deploymentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of deploymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deploymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDeploymentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDeploymentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of deploymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deploymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDeploymentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeploymentId(), "DEPLOYMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentIdList The collection of deploymentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeploymentId_InScope(Collection<Long> deploymentIdList) {
        doSetDeploymentId_InScope(deploymentIdList);
    }

    protected void doSetDeploymentId_InScope(Collection<Long> deploymentIdList) {
        regINS(CK_INS, cTL(deploymentIdList), xgetCValueDeploymentId(), "DEPLOYMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @param deploymentIdList The collection of deploymentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeploymentId_NotInScope(Collection<Long> deploymentIdList) {
        doSetDeploymentId_NotInScope(deploymentIdList);
    }

    protected void doSetDeploymentId_NotInScope(Collection<Long> deploymentIdList) {
        regINS(CK_NINS, cTL(deploymentIdList), xgetCValueDeploymentId(), "DEPLOYMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDeploymentId_IsNull() { regDeploymentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDeploymentId_IsNotNull() { regDeploymentId(CK_ISNN, DOBJ); }

    protected void regDeploymentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeploymentId(), "DEPLOYMENT_ID"); }
    protected abstract ConditionValue xgetCValueDeploymentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param seaFlg The value of seaFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    protected void setSeaFlg_Equal(Integer seaFlg) {
        doSetSeaFlg_Equal(seaFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetSeaFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As boolean for Flg. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaFlg_Equal_AsBoolean(Boolean determination) {
        setSeaFlg_Equal_AsFlg(CDef.Flg.codeOf(determination));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * Yes: means valid
     */
    public void setSeaFlg_Equal_True() {
        setSeaFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * No: means invalid
     */
    public void setSeaFlg_Equal_False() {
        setSeaFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetSeaFlg_Equal(Integer seaFlg) {
        regSeaFlg(CK_EQ, seaFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param seaFlg The value of seaFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    protected void setSeaFlg_NotEqual(Integer seaFlg) {
        doSetSeaFlg_NotEqual(seaFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSeaFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetSeaFlg_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * Yes: means valid
     */
    public void setSeaFlg_NotEqual_True() {
        setSeaFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * No: means invalid
     */
    public void setSeaFlg_NotEqual_False() {
        setSeaFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetSeaFlg_NotEqual(Integer seaFlg) {
        regSeaFlg(CK_NES, seaFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param seaFlgList The collection of seaFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaFlg_InScope(Collection<Integer> seaFlgList) {
        doSetSeaFlg_InScope(seaFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetSeaFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetSeaFlg_InScope(Collection<Integer> seaFlgList) {
        regINS(CK_INS, cTL(seaFlgList), xgetCValueSeaFlg(), "SEA_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param seaFlgList The collection of seaFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaFlg_NotInScope(Collection<Integer> seaFlgList) {
        doSetSeaFlg_NotInScope(seaFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeaFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetSeaFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetSeaFlg_NotInScope(Collection<Integer> seaFlgList) {
        regINS(CK_NINS, cTL(seaFlgList), xgetCValueSeaFlg(), "SEA_FLG");
    }

    protected void regSeaFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeaFlg(), "SEA_FLG"); }
    protected abstract ConditionValue xgetCValueSeaFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType}
     * @param deploymentTypeCode The value of deploymentTypeCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setDeploymentTypeCode_Equal(String deploymentTypeCode) {
        doSetDeploymentTypeCode_Equal(fRES(deploymentTypeCode));
    }

    /**
     * Equal(=). As WhiteClassifiationDeploymentType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * test of deployment
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentTypeCode_Equal_AsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType cdef) {
        doSetDeploymentTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Sea (SEA). And OnlyOnceRegistered. <br>
     * sea
     */
    public void setDeploymentTypeCode_Equal_Sea() {
        setDeploymentTypeCode_Equal_AsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType.Sea);
    }

    /**
     * Equal(=). As Land (LAN). And OnlyOnceRegistered. <br>
     * land
     */
    public void setDeploymentTypeCode_Equal_Land() {
        setDeploymentTypeCode_Equal_AsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType.Land);
    }

    protected void doSetDeploymentTypeCode_Equal(String deploymentTypeCode) {
        regDeploymentTypeCode(CK_EQ, hSC("DEPLOYMENT_TYPE_CODE", deploymentTypeCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType}
     * @param deploymentTypeCode The value of deploymentTypeCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setDeploymentTypeCode_NotEqual(String deploymentTypeCode) {
        doSetDeploymentTypeCode_NotEqual(fRES(deploymentTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As WhiteClassifiationDeploymentType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * test of deployment
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDeploymentTypeCode_NotEqual_AsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType cdef) {
        doSetDeploymentTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Sea (SEA). And OnlyOnceRegistered. <br>
     * sea
     */
    public void setDeploymentTypeCode_NotEqual_Sea() {
        setDeploymentTypeCode_NotEqual_AsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType.Sea);
    }

    /**
     * NotEqual(&lt;&gt;). As Land (LAN). And OnlyOnceRegistered. <br>
     * land
     */
    public void setDeploymentTypeCode_NotEqual_Land() {
        setDeploymentTypeCode_NotEqual_AsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType.Land);
    }

    protected void doSetDeploymentTypeCode_NotEqual(String deploymentTypeCode) {
        regDeploymentTypeCode(CK_NES, hSC("DEPLOYMENT_TYPE_CODE", deploymentTypeCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType}
     * @param deploymentTypeCodeList The collection of deploymentTypeCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeploymentTypeCode_InScope(Collection<String> deploymentTypeCodeList) {
        doSetDeploymentTypeCode_InScope(deploymentTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As WhiteClassifiationDeploymentType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * test of deployment
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeploymentTypeCode_InScope_AsWhiteClassifiationDeploymentType(Collection<CDef.WhiteClassifiationDeploymentType> cdefList) {
        doSetDeploymentTypeCode_InScope(cTStrL(cdefList));
    }

    protected void doSetDeploymentTypeCode_InScope(Collection<String> deploymentTypeCodeList) {
        regINS(CK_INS, cTL(deploymentTypeCodeList), xgetCValueDeploymentTypeCode(), "DEPLOYMENT_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType}
     * @param deploymentTypeCodeList The collection of deploymentTypeCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeploymentTypeCode_NotInScope(Collection<String> deploymentTypeCodeList) {
        doSetDeploymentTypeCode_NotInScope(deploymentTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As WhiteClassifiationDeploymentType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * test of deployment
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeploymentTypeCode_NotInScope_AsWhiteClassifiationDeploymentType(Collection<CDef.WhiteClassifiationDeploymentType> cdefList) {
        doSetDeploymentTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDeploymentTypeCode_NotInScope(Collection<String> deploymentTypeCodeList) {
        regINS(CK_NINS, cTL(deploymentTypeCodeList), xgetCValueDeploymentTypeCode(), "DEPLOYMENT_TYPE_CODE");
    }

    protected void regDeploymentTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeploymentTypeCode(), "DEPLOYMENT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueDeploymentTypeCode();

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
    public HpSLCFunction<WhiteClassificationDeploymentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteClassificationDeploymentCB.class);
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
    public HpSLCFunction<WhiteClassificationDeploymentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteClassificationDeploymentCB.class);
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
    public HpSLCFunction<WhiteClassificationDeploymentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteClassificationDeploymentCB.class);
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
    public HpSLCFunction<WhiteClassificationDeploymentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteClassificationDeploymentCB.class);
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
    public HpSLCFunction<WhiteClassificationDeploymentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteClassificationDeploymentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteClassificationDeploymentCB&gt;() {
     *     public void query(WhiteClassificationDeploymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteClassificationDeploymentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteClassificationDeploymentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteClassificationDeploymentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteClassificationDeploymentCQ sq);

    protected WhiteClassificationDeploymentCB xcreateScalarConditionCB() {
        WhiteClassificationDeploymentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteClassificationDeploymentCB xcreateScalarConditionPartitionByCB() {
        WhiteClassificationDeploymentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteClassificationDeploymentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteClassificationDeploymentCB cb = new WhiteClassificationDeploymentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DEPLOYMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteClassificationDeploymentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteClassificationDeploymentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteClassificationDeploymentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteClassificationDeploymentCB cb = new WhiteClassificationDeploymentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DEPLOYMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteClassificationDeploymentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteClassificationDeploymentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteClassificationDeploymentCB cb = new WhiteClassificationDeploymentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteClassificationDeploymentCQ sq);

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
    protected WhiteClassificationDeploymentCB newMyCB() {
        return new WhiteClassificationDeploymentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteClassificationDeploymentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
