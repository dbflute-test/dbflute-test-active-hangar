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

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.docksidestage.hangar.simpleflute.HangarCDef;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of (会員住所情報)MEMBER_ADDRESS as TABLE. <br>
 * 会員の住所に関する情報で、同時に有効期間ごとに履歴管理されている。<br>
 * 会員を基点に考えた場合、構造的には one-to-many だが、業務的な定型条件で one-to-one になる。このような構造を「業務的one-to-one」と呼ぶ！<br>
 * 有効期間は隙間なく埋められるが、ここでは住所情報のない会員も存在し、厳密には(業務的な) "1 : 0..1" である。
 * <pre>
 * [primary-key]
 *     MEMBER_ADDRESS_ID
 *
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ADDRESS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     MEMBER, REGION
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     member, region
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberAddressDto implements Serializable {

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
    /** (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _memberAddressId;

    /** (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _memberId;

    /** (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _validBeginDate;

    /** (有効終了日)VALID_END_DATE: {NotNull, DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _validEndDate;

    /** (住所)ADDRESS: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _address;

    /** (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} */
    @JsonKey
    protected Integer _regionId;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberAddressDto() {
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
    protected MemberDto _member;

    public MemberDto getMember() {
        return _member;
    }

    public void setMember(MemberDto member) {
        this._member = member;
    }

    protected RegionDto _region;

    public RegionDto getRegion() {
        return _region;
    }

    public void setRegion(RegionDto region) {
        this._region = region;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberAddressDto)) { return false; }
        final BsMemberAddressDto otherEntity = (BsMemberAddressDto)other;
        if (!helpComparingValue(getMemberAddressId(), otherEntity.getMemberAddressId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_ADDRESS");
        result = xCH(result, getMemberAddressId());
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
        sb.append(c).append(getMemberAddressId());
        sb.append(c).append(getMemberId());
        sb.append(c).append(getValidBeginDate());
        sb.append(c).append(getValidEndDate());
        sb.append(c).append(getAddress());
        sb.append(c).append(getRegionId());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * 会員住所を識別するID。<br>
     * 期間ごとに同じ会員のデータを保持することがあるため、これは単なるPKであってFKではない。
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (NullAllowed)
     */
    public Integer getMemberAddressId() {
        return _memberAddressId;
    }

    /**
     * [set] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * 会員住所を識別するID。<br>
     * 期間ごとに同じ会員のデータを保持することがあるため、これは単なるPKであってFKではない。
     * @param memberAddressId The value of the column 'MEMBER_ADDRESS_ID'. (NullAllowed)
     */
    public void setMemberAddressId(Integer memberAddressId) {
        __modifiedProperties.add("memberAddressId");
        this._memberAddressId = memberAddressId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br>
     * 会員を参照するID。<br>
     * 期間ごとのデータがあるので、これだけではユニークにはならない。有効開始日と合わせて複合ユニーク制約となるが、厳密には完全な制約にはなっていない。有効期間の概念はRDBでは表現しきれないのである。
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br>
     * 会員を参照するID。<br>
     * 期間ごとのデータがあるので、これだけではユニークにはならない。有効開始日と合わせて複合ユニーク制約となるが、厳密には完全な制約にはなっていない。有効期間の概念はRDBでは表現しきれないのである。
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br>
     * 一つの有効期間の開始を示す日付。<br>
     * 前の有効終了日の次の日の値が格納される。
     * @return The value of the column 'VALID_BEGIN_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getValidBeginDate() {
        return _validBeginDate;
    }

    /**
     * [set] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br>
     * 一つの有効期間の開始を示す日付。<br>
     * 前の有効終了日の次の日の値が格納される。
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (NullAllowed)
     */
    public void setValidBeginDate(java.time.LocalDate validBeginDate) {
        __modifiedProperties.add("validBeginDate");
        this._validBeginDate = validBeginDate;
    }

    /**
     * [get] (有効終了日)VALID_END_DATE: {NotNull, DATE(10)} <br>
     * 有効期間の終了日。<br>
     * 期間の最後の日が格納される。基本的に、次の有効開始日の一日前の値となるが、次の有効期間がない場合は 9999/12/31 となる。
     * @return The value of the column 'VALID_END_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getValidEndDate() {
        return _validEndDate;
    }

    /**
     * [set] (有効終了日)VALID_END_DATE: {NotNull, DATE(10)} <br>
     * 有効期間の終了日。<br>
     * 期間の最後の日が格納される。基本的に、次の有効開始日の一日前の値となるが、次の有効期間がない場合は 9999/12/31 となる。
     * @param validEndDate The value of the column 'VALID_END_DATE'. (NullAllowed)
     */
    public void setValidEndDate(java.time.LocalDate validEndDate) {
        __modifiedProperties.add("validEndDate");
        this._validEndDate = validEndDate;
    }

    /**
     * [get] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br>
     * まるごと住所
     * @return The value of the column 'ADDRESS'. (NullAllowed)
     */
    public String getAddress() {
        return _address;
    }

    /**
     * [set] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br>
     * まるごと住所
     * @param address The value of the column 'ADDRESS'. (NullAllowed)
     */
    public void setAddress(String address) {
        __modifiedProperties.add("address");
        this._address = address;
    }

    /**
     * [get] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br>
     * 地域を参照するID。かなり漠然とした地域。
     * @return The value of the column 'REGION_ID'. (NullAllowed)
     */
    public Integer getRegionId() {
        return _regionId;
    }

    /**
     * [set] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br>
     * 地域を参照するID。かなり漠然とした地域。
     * @param regionId The value of the column 'REGION_ID'. (NullAllowed)
     */
    public void setRegionId(Integer regionId) {
        __modifiedProperties.add("regionId");
        this._regionId = regionId;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        __modifiedProperties.add("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.add("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

}
