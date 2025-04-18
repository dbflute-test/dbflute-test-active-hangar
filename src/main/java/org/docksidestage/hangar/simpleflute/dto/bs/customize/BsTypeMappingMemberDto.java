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

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of TypeMappingMember. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TYPE_MAPPING_ID, TYPE_MAPPING_NAME, TYPE_MAPPING_COUNT, TYPE_MAPPING_DATE, TYPE_MAPPING_DATETIME, POINT_MAPPING_DATE
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
public abstract class BsTypeMappingMemberDto implements Serializable {

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
    /** TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID} */
    @JsonKey
    protected Long _typeMappingId;

    /** TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME} */
    @JsonKey
    protected String _typeMappingName;

    /** TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT} */
    @JsonKey
    protected Integer _typeMappingCount;

    /** TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE} */
    @JsonKey
    protected java.time.LocalDate _typeMappingDate;

    /** TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME} */
    @JsonKey
    protected java.time.LocalDateTime _typeMappingDatetime;

    /** POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE} */
    @JsonKey
    protected java.time.LocalDate _pointMappingDate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTypeMappingMemberDto() {
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
        if (other == null || !(other instanceof BsTypeMappingMemberDto)) { return false; }
        final BsTypeMappingMemberDto otherEntity = (BsTypeMappingMemberDto)other;
        if (!helpComparingValue(getTypeMappingId(), otherEntity.getTypeMappingId())) { return false; }
        if (!helpComparingValue(getTypeMappingName(), otherEntity.getTypeMappingName())) { return false; }
        if (!helpComparingValue(getTypeMappingCount(), otherEntity.getTypeMappingCount())) { return false; }
        if (!helpComparingValue(getTypeMappingDate(), otherEntity.getTypeMappingDate())) { return false; }
        if (!helpComparingValue(getTypeMappingDatetime(), otherEntity.getTypeMappingDatetime())) { return false; }
        if (!helpComparingValue(getPointMappingDate(), otherEntity.getPointMappingDate())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "TypeMappingMember");
        result = xCH(result, getTypeMappingId());
        result = xCH(result, getTypeMappingName());
        result = xCH(result, getTypeMappingCount());
        result = xCH(result, getTypeMappingDate());
        result = xCH(result, getTypeMappingDatetime());
        result = xCH(result, getPointMappingDate());
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
        sb.append(c).append(getTypeMappingId());
        sb.append(c).append(getTypeMappingName());
        sb.append(c).append(getTypeMappingCount());
        sb.append(c).append(getTypeMappingDate());
        sb.append(c).append(getTypeMappingDatetime());
        sb.append(c).append(getPointMappingDate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID} <br>
     * @return The value of the column 'TYPE_MAPPING_ID'. (NullAllowed)
     */
    public Long getTypeMappingId() {
        return _typeMappingId;
    }

    /**
     * [set] TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID} <br>
     * @param typeMappingId The value of the column 'TYPE_MAPPING_ID'. (NullAllowed)
     */
    public void setTypeMappingId(Long typeMappingId) {
        __modifiedProperties.add("typeMappingId");
        this._typeMappingId = typeMappingId;
    }

    /**
     * [get] TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME} <br>
     * @return The value of the column 'TYPE_MAPPING_NAME'. (NullAllowed)
     */
    public String getTypeMappingName() {
        return _typeMappingName;
    }

    /**
     * [set] TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME} <br>
     * @param typeMappingName The value of the column 'TYPE_MAPPING_NAME'. (NullAllowed)
     */
    public void setTypeMappingName(String typeMappingName) {
        __modifiedProperties.add("typeMappingName");
        this._typeMappingName = typeMappingName;
    }

    /**
     * [get] TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT} <br>
     * @return The value of the column 'TYPE_MAPPING_COUNT'. (NullAllowed)
     */
    public Integer getTypeMappingCount() {
        return _typeMappingCount;
    }

    /**
     * [set] TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT} <br>
     * @param typeMappingCount The value of the column 'TYPE_MAPPING_COUNT'. (NullAllowed)
     */
    public void setTypeMappingCount(Integer typeMappingCount) {
        __modifiedProperties.add("typeMappingCount");
        this._typeMappingCount = typeMappingCount;
    }

    /**
     * [get] TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE} <br>
     * @return The value of the column 'TYPE_MAPPING_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getTypeMappingDate() {
        return _typeMappingDate;
    }

    /**
     * [set] TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE} <br>
     * @param typeMappingDate The value of the column 'TYPE_MAPPING_DATE'. (NullAllowed)
     */
    public void setTypeMappingDate(java.time.LocalDate typeMappingDate) {
        __modifiedProperties.add("typeMappingDate");
        this._typeMappingDate = typeMappingDate;
    }

    /**
     * [get] TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME} <br>
     * @return The value of the column 'TYPE_MAPPING_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getTypeMappingDatetime() {
        return _typeMappingDatetime;
    }

    /**
     * [set] TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME} <br>
     * @param typeMappingDatetime The value of the column 'TYPE_MAPPING_DATETIME'. (NullAllowed)
     */
    public void setTypeMappingDatetime(java.time.LocalDateTime typeMappingDatetime) {
        __modifiedProperties.add("typeMappingDatetime");
        this._typeMappingDatetime = typeMappingDatetime;
    }

    /**
     * [get] POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE} <br>
     * @return The value of the column 'POINT_MAPPING_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getPointMappingDate() {
        return _pointMappingDate;
    }

    /**
     * [set] POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE} <br>
     * @param pointMappingDate The value of the column 'POINT_MAPPING_DATE'. (NullAllowed)
     */
    public void setPointMappingDate(java.time.LocalDate pointMappingDate) {
        __modifiedProperties.add("pointMappingDate");
        this._pointMappingDate = pointMappingDate;
    }

}
