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

/**
 * The simple DTO of white_generate_name_switched as TABLE. <br>
 * <pre>
 * [primary-key]
 *     GENERATE_NAME_SWITCHED_ID
 *
 * [column]
 *     GENERATE_NAME_SWITCHED_ID, GENERATE_NAME_SWITCHED_NAME, GENERATE_NAME_SWITCHED_COUNT, GENERATE_NAME_SWITCHED_DATE, GENERATE_NAME_SWITCHED_DATETIME
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
public abstract class BsWhiteGenerateNameSwitchedDto implements Serializable {

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
    /** GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _generateNameSwitchedId;

    /** GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _generateNameSwitchedName;

    /** GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)} */
    @JsonKey
    protected Integer _generateNameSwitchedCount;

    /** GENERATE_NAME_SWITCHED_DATE: {DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _generateNameSwitchedDate;

    /** GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _generateNameSwitchedDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteGenerateNameSwitchedDto() {
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
        if (other == null || !(other instanceof BsWhiteGenerateNameSwitchedDto)) { return false; }
        final BsWhiteGenerateNameSwitchedDto otherEntity = (BsWhiteGenerateNameSwitchedDto)other;
        if (!helpComparingValue(getGenerateNameSwitchedId(), otherEntity.getGenerateNameSwitchedId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "white_generate_name_switched");
        result = xCH(result, getGenerateNameSwitchedId());
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
        sb.append(c).append(getGenerateNameSwitchedId());
        sb.append(c).append(getGenerateNameSwitchedName());
        sb.append(c).append(getGenerateNameSwitchedCount());
        sb.append(c).append(getGenerateNameSwitchedDate());
        sb.append(c).append(getGenerateNameSwitchedDatetime());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_ID'. (NullAllowed)
     */
    public Long getGenerateNameSwitchedId() {
        return _generateNameSwitchedId;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param generateNameSwitchedId The value of the column 'GENERATE_NAME_SWITCHED_ID'. (NullAllowed)
     */
    public void setGenerateNameSwitchedId(Long generateNameSwitchedId) {
        __modifiedProperties.add("generateNameSwitchedId");
        this._generateNameSwitchedId = generateNameSwitchedId;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_NAME'. (NullAllowed)
     */
    public String getGenerateNameSwitchedName() {
        return _generateNameSwitchedName;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} <br>
     * @param generateNameSwitchedName The value of the column 'GENERATE_NAME_SWITCHED_NAME'. (NullAllowed)
     */
    public void setGenerateNameSwitchedName(String generateNameSwitchedName) {
        __modifiedProperties.add("generateNameSwitchedName");
        this._generateNameSwitchedName = generateNameSwitchedName;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_COUNT'. (NullAllowed)
     */
    public Integer getGenerateNameSwitchedCount() {
        return _generateNameSwitchedCount;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)} <br>
     * @param generateNameSwitchedCount The value of the column 'GENERATE_NAME_SWITCHED_COUNT'. (NullAllowed)
     */
    public void setGenerateNameSwitchedCount(Integer generateNameSwitchedCount) {
        __modifiedProperties.add("generateNameSwitchedCount");
        this._generateNameSwitchedCount = generateNameSwitchedCount;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_DATE: {DATE(10)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getGenerateNameSwitchedDate() {
        return _generateNameSwitchedDate;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_DATE: {DATE(10)} <br>
     * @param generateNameSwitchedDate The value of the column 'GENERATE_NAME_SWITCHED_DATE'. (NullAllowed)
     */
    public void setGenerateNameSwitchedDate(java.time.LocalDate generateNameSwitchedDate) {
        __modifiedProperties.add("generateNameSwitchedDate");
        this._generateNameSwitchedDate = generateNameSwitchedDate;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getGenerateNameSwitchedDatetime() {
        return _generateNameSwitchedDatetime;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param generateNameSwitchedDatetime The value of the column 'GENERATE_NAME_SWITCHED_DATETIME'. (NullAllowed)
     */
    public void setGenerateNameSwitchedDatetime(java.time.LocalDateTime generateNameSwitchedDatetime) {
        __modifiedProperties.add("generateNameSwitchedDatetime");
        this._generateNameSwitchedDatetime = generateNameSwitchedDatetime;
    }

}
