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
package org.docksidestage.hangar.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of DoubleByteOnSql. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME_WITH_SPACE, MEMBER_STATUS_NAME
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
public abstract class BsDoubleByteOnSqlDto implements Serializable {

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
    /** (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    @JsonKey
    protected Integer _memberId;

    /** MEMBER_NAME_WITH_SPACE: {VARCHAR(201)} */
    @JsonKey
    protected String _memberNameWithSpace;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    @JsonKey
    protected String _memberStatusName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDoubleByteOnSqlDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsDoubleByteOnSqlDto)) { return false; }
        final BsDoubleByteOnSqlDto otherEntity = (BsDoubleByteOnSqlDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!helpComparingValue(getMemberNameWithSpace(), otherEntity.getMemberNameWithSpace())) { return false; }
        if (!helpComparingValue(getMemberStatusName(), otherEntity.getMemberStatusName())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "DoubleByteOnSql");
        result = xCH(result, getMemberId());
        result = xCH(result, getMemberNameWithSpace());
        result = xCH(result, getMemberStatusName());
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
        sb.append(c).append(getMemberNameWithSpace());
        sb.append(c).append(getMemberStatusName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME_WITH_SPACE: {VARCHAR(201)} <br>
     * @return The value of the column 'MEMBER_NAME_WITH_SPACE'. (NullAllowed)
     */
    public String getMemberNameWithSpace() {
        return _memberNameWithSpace;
    }

    /**
     * [set] MEMBER_NAME_WITH_SPACE: {VARCHAR(201)} <br>
     * @param memberNameWithSpace The value of the column 'MEMBER_NAME_WITH_SPACE'. (NullAllowed)
     */
    public void setMemberNameWithSpace(String memberNameWithSpace) {
        __modifiedProperties.add("memberNameWithSpace");
        this._memberNameWithSpace = memberNameWithSpace;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * 表示用の名称。<br>
     * 国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * 表示用の名称。<br>
     * 国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.add("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

}
