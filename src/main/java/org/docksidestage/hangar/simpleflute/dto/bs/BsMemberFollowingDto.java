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
 * The simple DTO of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br>
 * とある会員が他の会員をフォローできる。すると、フォローした会員の購入履歴が閲覧できる。
 * <pre>
 * [primary-key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     MEMBER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberFollowingDto implements Serializable {

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
    /** (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _memberFollowingId;

    /** (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _myMemberId;

    /** (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    @JsonKey
    protected Integer _yourMemberId;

    /** (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _followDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberFollowingDto() {
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
    protected MemberDto _memberByMyMemberId;

    public MemberDto getMemberByMyMemberId() {
        return _memberByMyMemberId;
    }

    public void setMemberByMyMemberId(MemberDto memberByMyMemberId) {
        this._memberByMyMemberId = memberByMyMemberId;
    }

    protected MemberDto _memberByYourMemberId;

    public MemberDto getMemberByYourMemberId() {
        return _memberByYourMemberId;
    }

    public void setMemberByYourMemberId(MemberDto memberByYourMemberId) {
        this._memberByYourMemberId = memberByYourMemberId;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberFollowingDto)) { return false; }
        final BsMemberFollowingDto otherEntity = (BsMemberFollowingDto)other;
        if (!helpComparingValue(getMemberFollowingId(), otherEntity.getMemberFollowingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_FOLLOWING");
        result = xCH(result, getMemberFollowingId());
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
        sb.append(c).append(getMemberFollowingId());
        sb.append(c).append(getMyMemberId());
        sb.append(c).append(getYourMemberId());
        sb.append(c).append(getFollowDatetime());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 連番
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (NullAllowed)
     */
    public Long getMemberFollowingId() {
        return _memberFollowingId;
    }

    /**
     * [set] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 連番
     * @param memberFollowingId The value of the column 'MEMBER_FOLLOWING_ID'. (NullAllowed)
     */
    public void setMemberFollowingId(Long memberFollowingId) {
        __modifiedProperties.add("memberFollowingId");
        this._memberFollowingId = memberFollowingId;
    }

    /**
     * [get] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br>
     * 気になった人がいて...勇気を振り絞った会員のID。
     * @return The value of the column 'MY_MEMBER_ID'. (NullAllowed)
     */
    public Integer getMyMemberId() {
        return _myMemberId;
    }

    /**
     * [set] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br>
     * 気になった人がいて...勇気を振り絞った会員のID。
     * @param myMemberId The value of the column 'MY_MEMBER_ID'. (NullAllowed)
     */
    public void setMyMemberId(Integer myMemberId) {
        __modifiedProperties.add("myMemberId");
        this._myMemberId = myMemberId;
    }

    /**
     * [get] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br>
     * いきなりのアクションに...ちょっと心揺らいだ会員のID。
     * @return The value of the column 'YOUR_MEMBER_ID'. (NullAllowed)
     */
    public Integer getYourMemberId() {
        return _yourMemberId;
    }

    /**
     * [set] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br>
     * いきなりのアクションに...ちょっと心揺らいだ会員のID。
     * @param yourMemberId The value of the column 'YOUR_MEMBER_ID'. (NullAllowed)
     */
    public void setYourMemberId(Integer yourMemberId) {
        __modifiedProperties.add("yourMemberId");
        this._yourMemberId = yourMemberId;
    }

    /**
     * [get] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(26, 6)} <br>
     * ふりかえるとちょっと恥ずかしい気持ちになる日時
     * @return The value of the column 'FOLLOW_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getFollowDatetime() {
        return _followDatetime;
    }

    /**
     * [set] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(26, 6)} <br>
     * ふりかえるとちょっと恥ずかしい気持ちになる日時
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (NullAllowed)
     */
    public void setFollowDatetime(java.time.LocalDateTime followDatetime) {
        __modifiedProperties.add("followDatetime");
        this._followDatetime = followDatetime;
    }

}
