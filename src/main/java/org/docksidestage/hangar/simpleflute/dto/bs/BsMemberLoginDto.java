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
 * The simple DTO of MEMBER_LOGIN as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 *
 * [sequence]
 *     MAIHAMADB.PUBLIC.SEQ_MEMBER_LOGIN
 *
 * [identity]
 *     MEMBER_LOGIN_ID
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     MEMBER_STATUS, MEMBER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     memberStatus, member
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberLoginDto implements Serializable {

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
    /** MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _memberLoginId;

    /** MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _memberId;

    /** LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _loginDatetime;

    /** MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} */
    @JsonKey
    protected Integer _mobileLoginFlg;

    /** LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    @JsonKey
    protected String _loginMemberStatusCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberLoginDto() {
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
     * Set the value of mobileLoginFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setMobileLoginFlgAsFlg(HangarCDef.Flg cdef) {
        setMobileLoginFlg(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.Flg getMobileLoginFlgAsFlg() {
        return HangarCDef.Flg.codeOf(getMobileLoginFlg());
    }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setLoginMemberStatusCodeAsMemberStatus(HangarCDef.MemberStatus cdef) {
        setLoginMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br>
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.MemberStatus getLoginMemberStatusCodeAsMemberStatus() {
        return HangarCDef.MemberStatus.codeOf(getLoginMemberStatusCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mobileLoginFlg as True. <br>
     * Yes: means valid
     */
    public void setMobileLoginFlg_True() {
        setMobileLoginFlgAsFlg(HangarCDef.Flg.True);
    }

    /**
     * Set the value of mobileLoginFlg as False. <br>
     * No: means invalid
     */
    public void setMobileLoginFlg_False() {
        setMobileLoginFlgAsFlg(HangarCDef.Flg.False);
    }

    /**
     * Set the value of loginMemberStatusCode as Formalized. <br>
     * Formalized: as formal member, allowed to use all service
     */
    public void setLoginMemberStatusCode_Formalized() {
        setLoginMemberStatusCodeAsMemberStatus(HangarCDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of loginMemberStatusCode as Withdrawal. <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setLoginMemberStatusCode_Withdrawal() {
        setLoginMemberStatusCodeAsMemberStatus(HangarCDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of loginMemberStatusCode as Provisional. <br>
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setLoginMemberStatusCode_Provisional() {
        setLoginMemberStatusCodeAsMemberStatus(HangarCDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg 'True'? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgTrue() {
        HangarCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(HangarCDef.Flg.True) : false;
    }

    /**
     * Is the value of mobileLoginFlg 'False'? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMobileLoginFlgFalse() {
        HangarCDef.Flg cdef = getMobileLoginFlgAsFlg();
        return cdef != null ? cdef.equals(HangarCDef.Flg.False) : false;
    }

    /**
     * Is the value of loginMemberStatusCode 'Formalized'? <br>
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeFormalized() {
        HangarCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(HangarCDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of loginMemberStatusCode 'Withdrawal'? <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeWithdrawal() {
        HangarCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(HangarCDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of loginMemberStatusCode 'Provisional'? <br>
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLoginMemberStatusCodeProvisional() {
        HangarCDef.MemberStatus cdef = getLoginMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(HangarCDef.MemberStatus.Provisional) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected MemberStatusDto _memberStatus;

    public MemberStatusDto getMemberStatus() {
        return _memberStatus;
    }

    public void setMemberStatus(MemberStatusDto memberStatus) {
        this._memberStatus = memberStatus;
    }

    protected MemberDto _member;

    public MemberDto getMember() {
        return _member;
    }

    public void setMember(MemberDto member) {
        this._member = member;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberLoginDto)) { return false; }
        final BsMemberLoginDto otherEntity = (BsMemberLoginDto)other;
        if (!helpComparingValue(getMemberLoginId(), otherEntity.getMemberLoginId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_LOGIN");
        result = xCH(result, getMemberLoginId());
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
        sb.append(c).append(getMemberLoginId());
        sb.append(c).append(getMemberId());
        sb.append(c).append(getLoginDatetime());
        sb.append(c).append(getMobileLoginFlg());
        sb.append(c).append(getLoginMemberStatusCode());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'MEMBER_LOGIN_ID'. (NullAllowed)
     */
    public Long getMemberLoginId() {
        return _memberLoginId;
    }

    /**
     * [set] MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (NullAllowed)
     */
    public void setMemberLoginId(Long memberLoginId) {
        __modifiedProperties.add("memberLoginId");
        this._memberLoginId = memberLoginId;
    }

    /**
     * [get] MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'LOGIN_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getLoginDatetime() {
        return _loginDatetime;
    }

    /**
     * [set] LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(26, 6)} <br>
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (NullAllowed)
     */
    public void setLoginDatetime(java.time.LocalDateTime loginDatetime) {
        __modifiedProperties.add("loginDatetime");
        this._loginDatetime = loginDatetime;
    }

    /**
     * [get] MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (NullAllowed)
     */
    public Integer getMobileLoginFlg() {
        return _mobileLoginFlg;
    }

    /**
     * [set] MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br>
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (NullAllowed)
     */
    public void setMobileLoginFlg(Integer mobileLoginFlg) {
        __modifiedProperties.add("mobileLoginFlg");
        this._mobileLoginFlg = mobileLoginFlg;
    }

    /**
     * [get] LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public String getLoginMemberStatusCode() {
        return _loginMemberStatusCode;
    }

    /**
     * [set] LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public void setLoginMemberStatusCode(String loginMemberStatusCode) {
        __modifiedProperties.add("loginMemberStatusCode");
        this._loginMemberStatusCode = loginMemberStatusCode;
    }

}
