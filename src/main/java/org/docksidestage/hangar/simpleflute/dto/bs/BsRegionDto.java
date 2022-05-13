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
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of (地域)REGION as TABLE. <br>
 * 主に会員の住所に対応する漠然とした地域。<br>
 * かなりざっくりした感じではある。唯一の業務的one-to-oneの親テーブルのケース。
 * <pre>
 * [primary-key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsRegionDto implements Serializable {

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
    /** (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} */
    @JsonKey
    protected Integer _regionId;

    /** (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _regionName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRegionDto() {
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
     * Set the value of regionId as the classification of Region. <br>
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setRegionIdAsRegion(HangarCDef.Region cdef) {
        setRegionId(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of regionId as the classification of Region. <br>
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.Region getRegionIdAsRegion() {
        return HangarCDef.Region.codeOf(getRegionId());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of regionId as America. <br>
     * AMERICA
     */
    public void setRegionId_America() {
        setRegionIdAsRegion(HangarCDef.Region.America);
    }

    /**
     * Set the value of regionId as Canada. <br>
     * CANADA
     */
    public void setRegionId_Canada() {
        setRegionIdAsRegion(HangarCDef.Region.Canada);
    }

    /**
     * Set the value of regionId as China. <br>
     * CHINA
     */
    public void setRegionId_China() {
        setRegionIdAsRegion(HangarCDef.Region.China);
    }

    /**
     * Set the value of regionId as Chiba. <br>
     * CHIBA
     */
    public void setRegionId_Chiba() {
        setRegionIdAsRegion(HangarCDef.Region.Chiba);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId 'America'? <br>
     * AMERICA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdAmerica() {
        HangarCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(HangarCDef.Region.America) : false;
    }

    /**
     * Is the value of regionId 'Canada'? <br>
     * CANADA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdCanada() {
        HangarCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(HangarCDef.Region.Canada) : false;
    }

    /**
     * Is the value of regionId 'China'? <br>
     * CHINA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdChina() {
        HangarCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(HangarCDef.Region.China) : false;
    }

    /**
     * Is the value of regionId 'Chiba'? <br>
     * CHIBA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isRegionIdChiba() {
        HangarCDef.Region cdef = getRegionIdAsRegion();
        return cdef != null ? cdef.equals(HangarCDef.Region.Chiba) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MemberAddressDto> _memberAddressList;

    public List<MemberAddressDto> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = new ArrayList<MemberAddressDto>(); }
        return _memberAddressList;
    }

    public void setMemberAddressList(List<MemberAddressDto> memberAddressList) {
        this._memberAddressList = memberAddressList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsRegionDto)) { return false; }
        final BsRegionDto otherEntity = (BsRegionDto)other;
        if (!helpComparingValue(getRegionId(), otherEntity.getRegionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "REGION");
        result = xCH(result, getRegionId());
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
        sb.append(c).append(getRegionId());
        sb.append(c).append(getRegionName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br>
     * 地域をしっかりと識別するID。<br>
     * 珍しく(固定的な)マスタテーブルとしては数値だが、Exampleなのでやはり色々なパターンがないとね、ってところで。
     * @return The value of the column 'REGION_ID'. (NullAllowed)
     */
    public Integer getRegionId() {
        return _regionId;
    }

    /**
     * [set] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br>
     * 地域をしっかりと識別するID。<br>
     * 珍しく(固定的な)マスタテーブルとしては数値だが、Exampleなのでやはり色々なパターンがないとね、ってところで。
     * @param regionId The value of the column 'REGION_ID'. (NullAllowed)
     */
    public void setRegionId(Integer regionId) {
        __modifiedProperties.add("regionId");
        this._regionId = regionId;
    }

    /**
     * [get] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br>
     * 地域を漠然と表す名称。
     * @return The value of the column 'REGION_NAME'. (NullAllowed)
     */
    public String getRegionName() {
        return _regionName;
    }

    /**
     * [set] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br>
     * 地域を漠然と表す名称。
     * @param regionName The value of the column 'REGION_NAME'. (NullAllowed)
     */
    public void setRegionName(String regionName) {
        __modifiedProperties.add("regionName");
        this._regionName = regionName;
    }

}
