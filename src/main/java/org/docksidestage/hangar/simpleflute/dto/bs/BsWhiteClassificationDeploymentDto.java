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
package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.HangarCDef;

/**
 * The simple DTO of WHITE_CLASSIFICATION_DEPLOYMENT as TABLE. <br>
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
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteClassificationDeploymentDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _deploymentId;

    /** SEA_FLG: {NotNull, INTEGER(10), classification=Flg} */
    @JsonKey
    protected Integer _seaFlg;

    /** DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} */
    @JsonKey
    protected String _deploymentTypeCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteClassificationDeploymentDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of seaFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setSeaFlgAsFlg(HangarCDef.Flg cdef) {
        setSeaFlg(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of seaFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.Flg getSeaFlgAsFlg() {
        return HangarCDef.Flg.codeOf(getSeaFlg());
    }

    /**
     * Set the value of deploymentTypeCode as the classification of WhiteClassifiationDeploymentType. <br>
     * test of deployment
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(HangarCDef.WhiteClassifiationDeploymentType cdef) {
        setDeploymentTypeCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of deploymentTypeCode as the classification of WhiteClassifiationDeploymentType. <br>
     * test of deployment
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.WhiteClassifiationDeploymentType getDeploymentTypeCodeAsWhiteClassifiationDeploymentType() {
        return HangarCDef.WhiteClassifiationDeploymentType.codeOf(getDeploymentTypeCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of seaFlg as True. <br>
     * Yes: means valid
     */
    public void setSeaFlg_True() {
        setSeaFlgAsFlg(HangarCDef.Flg.True);
    }

    /**
     * Set the value of seaFlg as False. <br>
     * No: means invalid
     */
    public void setSeaFlg_False() {
        setSeaFlgAsFlg(HangarCDef.Flg.False);
    }

    /**
     * Set the value of deploymentTypeCode as Sea. <br>
     * sea
     */
    public void setDeploymentTypeCode_Sea() {
        setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(HangarCDef.WhiteClassifiationDeploymentType.Sea);
    }

    /**
     * Set the value of deploymentTypeCode as Land. <br>
     * land
     */
    public void setDeploymentTypeCode_Land() {
        setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(HangarCDef.WhiteClassifiationDeploymentType.Land);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of seaFlg 'True'? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSeaFlgTrue() {
        HangarCDef.Flg cdef = getSeaFlgAsFlg();
        return cdef != null ? cdef.equals(HangarCDef.Flg.True) : false;
    }

    /**
     * Is the value of seaFlg 'False'? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isSeaFlgFalse() {
        HangarCDef.Flg cdef = getSeaFlgAsFlg();
        return cdef != null ? cdef.equals(HangarCDef.Flg.False) : false;
    }

    /**
     * Is the value of deploymentTypeCode 'Sea'? <br>
     * sea
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeploymentTypeCodeSea() {
        HangarCDef.WhiteClassifiationDeploymentType cdef = getDeploymentTypeCodeAsWhiteClassifiationDeploymentType();
        return cdef != null ? cdef.equals(HangarCDef.WhiteClassifiationDeploymentType.Sea) : false;
    }

    /**
     * Is the value of deploymentTypeCode 'Land'? <br>
     * land
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeploymentTypeCodeLand() {
        HangarCDef.WhiteClassifiationDeploymentType cdef = getDeploymentTypeCodeAsWhiteClassifiationDeploymentType();
        return cdef != null ? cdef.equals(HangarCDef.WhiteClassifiationDeploymentType.Land) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteClassificationDeploymentDto)) { return false; }
        final BsWhiteClassificationDeploymentDto otherEntity = (BsWhiteClassificationDeploymentDto)other;
        if (!helpComparingValue(getDeploymentId(), otherEntity.getDeploymentId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_CLASSIFICATION_DEPLOYMENT");
        result = xCH(result, getDeploymentId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getDeploymentId());
        sb.append(c).append(getSeaFlg());
        sb.append(c).append(getDeploymentTypeCode());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPLOYMENT_ID'. (NullAllowed)
     */
    public Long getDeploymentId() {
        return _deploymentId;
    }

    /**
     * [set] DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deploymentId The value of the column 'DEPLOYMENT_ID'. (NullAllowed)
     */
    public void setDeploymentId(Long deploymentId) {
        __modifiedProperties.add("deploymentId");
        this._deploymentId = deploymentId;
    }

    /**
     * [get] SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * @return The value of the column 'SEA_FLG'. (NullAllowed)
     */
    public Integer getSeaFlg() {
        return _seaFlg;
    }

    /**
     * [set] SEA_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * @param seaFlg The value of the column 'SEA_FLG'. (NullAllowed)
     */
    public void setSeaFlg(Integer seaFlg) {
        __modifiedProperties.add("seaFlg");
        this._seaFlg = seaFlg;
    }

    /**
     * [get] DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * @return The value of the column 'DEPLOYMENT_TYPE_CODE'. (NullAllowed)
     */
    public String getDeploymentTypeCode() {
        return _deploymentTypeCode;
    }

    /**
     * [set] DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType} <br>
     * @param deploymentTypeCode The value of the column 'DEPLOYMENT_TYPE_CODE'. (NullAllowed)
     */
    public void setDeploymentTypeCode(String deploymentTypeCode) {
        __modifiedProperties.add("deploymentTypeCode");
        this._deploymentTypeCode = deploymentTypeCode;
    }

}
