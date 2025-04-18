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
 * The simple DTO of WHITE_NOT_NULL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     NOT_NULL_ID
 *
 * [column]
 *     NOT_NULL_ID, NOT_NULL_NAME, NOT_NULL_COUNT, NOT_NULL_DATE, NOT_NULL_DATETIME
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
public abstract class BsWhiteNotNullDto implements Serializable {

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
    /** NOT_NULL_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _notNullId;

    /** NOT_NULL_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _notNullName;

    /** NOT_NULL_COUNT: {INTEGER(10)} */
    @JsonKey
    protected Integer _notNullCount;

    /** NOT_NULL_DATE: {DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _notNullDate;

    /** NOT_NULL_DATETIME: {TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _notNullDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteNotNullDto() {
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
        if (other == null || !(other instanceof BsWhiteNotNullDto)) { return false; }
        final BsWhiteNotNullDto otherEntity = (BsWhiteNotNullDto)other;
        if (!helpComparingValue(getNotNullId(), otherEntity.getNotNullId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_NOT_NULL");
        result = xCH(result, getNotNullId());
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
        sb.append(c).append(getNotNullId());
        sb.append(c).append(getNotNullName());
        sb.append(c).append(getNotNullCount());
        sb.append(c).append(getNotNullDate());
        sb.append(c).append(getNotNullDatetime());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NOT_NULL_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'NOT_NULL_ID'. (NullAllowed)
     */
    public Long getNotNullId() {
        return _notNullId;
    }

    /**
     * [set] NOT_NULL_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param notNullId The value of the column 'NOT_NULL_ID'. (NullAllowed)
     */
    public void setNotNullId(Long notNullId) {
        __modifiedProperties.add("notNullId");
        this._notNullId = notNullId;
    }

    /**
     * [get] NOT_NULL_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'NOT_NULL_NAME'. (NullAllowed)
     */
    public String getNotNullName() {
        return _notNullName;
    }

    /**
     * [set] NOT_NULL_NAME: {NotNull, VARCHAR(200)} <br>
     * @param notNullName The value of the column 'NOT_NULL_NAME'. (NullAllowed)
     */
    public void setNotNullName(String notNullName) {
        __modifiedProperties.add("notNullName");
        this._notNullName = notNullName;
    }

    /**
     * [get] NOT_NULL_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'NOT_NULL_COUNT'. (NullAllowed)
     */
    public Integer getNotNullCount() {
        return _notNullCount;
    }

    /**
     * [set] NOT_NULL_COUNT: {INTEGER(10)} <br>
     * @param notNullCount The value of the column 'NOT_NULL_COUNT'. (NullAllowed)
     */
    public void setNotNullCount(Integer notNullCount) {
        __modifiedProperties.add("notNullCount");
        this._notNullCount = notNullCount;
    }

    /**
     * [get] NOT_NULL_DATE: {DATE(10)} <br>
     * @return The value of the column 'NOT_NULL_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getNotNullDate() {
        return _notNullDate;
    }

    /**
     * [set] NOT_NULL_DATE: {DATE(10)} <br>
     * @param notNullDate The value of the column 'NOT_NULL_DATE'. (NullAllowed)
     */
    public void setNotNullDate(java.time.LocalDate notNullDate) {
        __modifiedProperties.add("notNullDate");
        this._notNullDate = notNullDate;
    }

    /**
     * [get] NOT_NULL_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'NOT_NULL_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getNotNullDatetime() {
        return _notNullDatetime;
    }

    /**
     * [set] NOT_NULL_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param notNullDatetime The value of the column 'NOT_NULL_DATETIME'. (NullAllowed)
     */
    public void setNotNullDatetime(java.time.LocalDateTime notNullDatetime) {
        __modifiedProperties.add("notNullDatetime");
        this._notNullDatetime = notNullDatetime;
    }

}
