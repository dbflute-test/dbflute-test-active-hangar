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
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of (会員セキュリティ情報)MEMBER_SECURITY as TABLE. <br>
 * 会員とは one-to-one で、会員一人につき必ず一つのセキュリティ情報がある
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     MEMBER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     member
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberSecurityDto implements Serializable {

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
    /** (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _memberId;

    /** (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _loginPassword;

    /** (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _reminderQuestion;

    /** (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _reminderAnswer;

    /** (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _reminderUseCount;

    /** (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
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
    public BsMemberSecurityDto() {
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
    //                                                                       Foreign Table
    //                                                                       =============
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
        if (other == null || !(other instanceof BsMemberSecurityDto)) { return false; }
        final BsMemberSecurityDto otherEntity = (BsMemberSecurityDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_SECURITY");
        result = xCH(result, getMemberId());
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
        sb.append(c).append(getMemberId());
        sb.append(c).append(getLoginPassword());
        sb.append(c).append(getReminderQuestion());
        sb.append(c).append(getReminderAnswer());
        sb.append(c).append(getReminderUseCount());
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
     * [get] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br>
     * そのまま one-to-one を構成するためのFKとなる。
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br>
     * そのまま one-to-one を構成するためのFKとなる。
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(100)} <br>
     * ログイン時に利用するパスワード。<br>
     * 本当は良くないが、Exampleなのでひとまず暗号化していない。
     * @return The value of the column 'LOGIN_PASSWORD'. (NullAllowed)
     */
    public String getLoginPassword() {
        return _loginPassword;
    }

    /**
     * [set] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(100)} <br>
     * ログイン時に利用するパスワード。<br>
     * 本当は良くないが、Exampleなのでひとまず暗号化していない。
     * @param loginPassword The value of the column 'LOGIN_PASSWORD'. (NullAllowed)
     */
    public void setLoginPassword(String loginPassword) {
        __modifiedProperties.add("loginPassword");
        this._loginPassword = loginPassword;
    }

    /**
     * [get] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br>
     * パスワードを忘れた際のリマインダ機能における質問の内容。
     * @return The value of the column 'REMINDER_QUESTION'. (NullAllowed)
     */
    public String getReminderQuestion() {
        return _reminderQuestion;
    }

    /**
     * [set] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br>
     * パスワードを忘れた際のリマインダ機能における質問の内容。
     * @param reminderQuestion The value of the column 'REMINDER_QUESTION'. (NullAllowed)
     */
    public void setReminderQuestion(String reminderQuestion) {
        __modifiedProperties.add("reminderQuestion");
        this._reminderQuestion = reminderQuestion;
    }

    /**
     * [get] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br>
     * パスワードを忘れた際のリマインダ機能における質問の答え。
     * @return The value of the column 'REMINDER_ANSWER'. (NullAllowed)
     */
    public String getReminderAnswer() {
        return _reminderAnswer;
    }

    /**
     * [set] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br>
     * パスワードを忘れた際のリマインダ機能における質問の答え。
     * @param reminderAnswer The value of the column 'REMINDER_ANSWER'. (NullAllowed)
     */
    public void setReminderAnswer(String reminderAnswer) {
        __modifiedProperties.add("reminderAnswer");
        this._reminderAnswer = reminderAnswer;
    }

    /**
     * [get] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br>
     * リマインダを利用した回数。<br>
     * これが多いと忘れっぽい会員と言えるが、そんなことを知ってもしょうがない。
     * @return The value of the column 'REMINDER_USE_COUNT'. (NullAllowed)
     */
    public Integer getReminderUseCount() {
        return _reminderUseCount;
    }

    /**
     * [set] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br>
     * リマインダを利用した回数。<br>
     * これが多いと忘れっぽい会員と言えるが、そんなことを知ってもしょうがない。
     * @param reminderUseCount The value of the column 'REMINDER_USE_COUNT'. (NullAllowed)
     */
    public void setReminderUseCount(Integer reminderUseCount) {
        __modifiedProperties.add("reminderUseCount");
        this._reminderUseCount = reminderUseCount;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に<br>
     * 
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に<br>
     * 
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * 眠いときは眠いと言おう。<br>
     * 
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * 眠いときは眠いと言おう。<br>
     * 
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
