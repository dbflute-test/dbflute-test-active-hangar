package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_CLASSIFICATION_DEPLOYMENT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DEPLOYMENT_ID
 *
 * [column]
 *     DEPLOYMENT_ID, SEA_FLG, DEPLOYMENT_TYPE_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long deploymentId = entity.getDeploymentId();
 * Integer seaFlg = entity.getSeaFlg();
 * String deploymentTypeCode = entity.getDeploymentTypeCode();
 * entity.setDeploymentId(deploymentId);
 * entity.setSeaFlg(seaFlg);
 * entity.setDeploymentTypeCode(deploymentTypeCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteClassificationDeployment extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _deploymentId;

    /** SEA_FLG: {NotNull, INTEGER(10), classification=Flg} */
    protected Integer _seaFlg;

    /** DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} */
    protected String _deploymentTypeCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_CLASSIFICATION_DEPLOYMENT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_deploymentId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of seaFlg as the classification of Flg. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getSeaFlgAsFlg() {
        return CDef.Flg.codeOf(getSeaFlg());
    }

    /**
     * Set the value of seaFlg as the classification of Flg. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setSeaFlgAsFlg(CDef.Flg cdef) {
        setSeaFlg(cdef != null ? toNumber(cdef.code(), Integer.class) : null);
    }

    /**
     * Set the value of seaFlg as boolean. <br>
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setSeaFlgAsBoolean(Boolean determination) {
        setSeaFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    /**
     * Get the value of deploymentTypeCode as the classification of WhiteClassifiationDeploymentType. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * test of deployment
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.WhiteClassifiationDeploymentType getDeploymentTypeCodeAsWhiteClassifiationDeploymentType() {
        return CDef.WhiteClassifiationDeploymentType.codeOf(getDeploymentTypeCode());
    }

    /**
     * Set the value of deploymentTypeCode as the classification of WhiteClassifiationDeploymentType. <br>
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * test of deployment
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType cdef) {
        setDeploymentTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of seaFlg as True (1). <br>
     * Yes: means valid
     */
    public void setSeaFlg_True() {
        setSeaFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of seaFlg as False (0). <br>
     * No: means invalid
     */
    public void setSeaFlg_False() {
        setSeaFlgAsFlg(CDef.Flg.False);
    }

    /**
     * Set the value of deploymentTypeCode as Sea (SEA). <br>
     * sea
     */
    public void setDeploymentTypeCode_Sea() {
        setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType.Sea);
    }

    /**
     * Set the value of deploymentTypeCode as Land (LAN). <br>
     * land
     */
    public void setDeploymentTypeCode_Land() {
        setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(CDef.WhiteClassifiationDeploymentType.Land);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of seaFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSeaFlgTrue() {
        CDef.Flg cdef = getSeaFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of seaFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSeaFlgFalse() {
        CDef.Flg cdef = getSeaFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    /**
     * Is the value of deploymentTypeCode Sea? <br>
     * sea
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeploymentTypeCodeSea() {
        CDef.WhiteClassifiationDeploymentType cdef = getDeploymentTypeCodeAsWhiteClassifiationDeploymentType();
        return cdef != null ? cdef.equals(CDef.WhiteClassifiationDeploymentType.Sea) : false;
    }

    /**
     * Is the value of deploymentTypeCode Land? <br>
     * land
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeploymentTypeCodeLand() {
        CDef.WhiteClassifiationDeploymentType cdef = getDeploymentTypeCodeAsWhiteClassifiationDeploymentType();
        return cdef != null ? cdef.equals(CDef.WhiteClassifiationDeploymentType.Land) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'seaFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getSeaFlgName() {
        CDef.Flg cdef = getSeaFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'seaFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getSeaFlgAlias() {
        CDef.Flg cdef = getSeaFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    /**
     * Get the value of the column 'deploymentTypeCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDeploymentTypeCodeName() {
        CDef.WhiteClassifiationDeploymentType cdef = getDeploymentTypeCodeAsWhiteClassifiationDeploymentType();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteClassificationDeployment) {
            BsWhiteClassificationDeployment other = (BsWhiteClassificationDeployment)obj;
            if (!xSV(_deploymentId, other._deploymentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deploymentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deploymentId));
        sb.append(dm).append(xfND(_seaFlg));
        sb.append(dm).append(xfND(_deploymentTypeCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteClassificationDeployment clone() {
        return (WhiteClassificationDeployment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPLOYMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeploymentId() {
        checkSpecifiedProperty("deploymentId");
        return _deploymentId;
    }

    /**
     * [set] DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deploymentId The value of the column 'DEPLOYMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeploymentId(Long deploymentId) {
        registerModifiedProperty("deploymentId");
        _deploymentId = deploymentId;
    }

    /**
     * [get] SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * @return The value of the column 'SEA_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSeaFlg() {
        checkSpecifiedProperty("seaFlg");
        return _seaFlg;
    }

    /**
     * [set] SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * @param seaFlg The value of the column 'SEA_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setSeaFlg(Integer seaFlg) {
        checkClassificationCode("SEA_FLG", CDef.DefMeta.Flg, seaFlg);
        registerModifiedProperty("seaFlg");
        _seaFlg = seaFlg;
    }

    /**
     * [get] DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * @return The value of the column 'DEPLOYMENT_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDeploymentTypeCode() {
        checkSpecifiedProperty("deploymentTypeCode");
        return convertEmptyToNull(_deploymentTypeCode);
    }

    /**
     * [set] DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * @param deploymentTypeCode The value of the column 'DEPLOYMENT_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setDeploymentTypeCode(String deploymentTypeCode) {
        checkClassificationCode("DEPLOYMENT_TYPE_CODE", CDef.DefMeta.WhiteClassifiationDeploymentType, deploymentTypeCode);
        registerModifiedProperty("deploymentTypeCode");
        _deploymentTypeCode = deploymentTypeCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param seaFlg The value of the column 'SEA_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingSeaFlg(Integer seaFlg) {
        setSeaFlg(seaFlg);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param deploymentTypeCode The value of the column 'DEPLOYMENT_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingDeploymentTypeCode(String deploymentTypeCode) {
        setDeploymentTypeCode(deploymentTypeCode);
    }
}
