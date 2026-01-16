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
 * The simple DTO of WHITE_LOADING_DATE_ADJUSTMENT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DATE_ADJUSTMENT_ID
 *
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATETIME, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING_LONG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
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
public abstract class BsWhiteLoadingDateAdjustmentDto implements Serializable {

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
    /** DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _dateAdjustmentId;

    /** (adjusted)ADJUSTED_DATE: {DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _adjustedDate;

    /** ADJUSTED_DATETIME: {TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _adjustedDatetime;

    /** ADJUSTED_TIME: {TIME(8)} */
    @JsonKey
    protected java.time.LocalTime _adjustedTime;

    /** ADJUSTED_INTEGER: {INTEGER(10)} */
    @JsonKey
    protected Integer _adjustedInteger;

    /** ADJUSTED_PLAIN_LONG: {BIGINT(19)} */
    @JsonKey
    protected Long _adjustedPlainLong;

    /** ADJUSTED_STRING_LONG: {VARCHAR(32)} */
    @JsonKey
    protected String _adjustedStringLong;

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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteLoadingDateAdjustmentDto() {
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
        if (other == null || !(other instanceof BsWhiteLoadingDateAdjustmentDto)) { return false; }
        final BsWhiteLoadingDateAdjustmentDto otherEntity = (BsWhiteLoadingDateAdjustmentDto)other;
        if (!helpComparingValue(getDateAdjustmentId(), otherEntity.getDateAdjustmentId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_LOADING_DATE_ADJUSTMENT");
        result = xCH(result, getDateAdjustmentId());
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
        sb.append(c).append(getDateAdjustmentId());
        sb.append(c).append(getAdjustedDate());
        sb.append(c).append(getAdjustedDatetime());
        sb.append(c).append(getAdjustedTime());
        sb.append(c).append(getAdjustedInteger());
        sb.append(c).append(getAdjustedPlainLong());
        sb.append(c).append(getAdjustedStringLong());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'DATE_ADJUSTMENT_ID'. (NullAllowed)
     */
    public Long getDateAdjustmentId() {
        return _dateAdjustmentId;
    }

    /**
     * [set] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param dateAdjustmentId The value of the column 'DATE_ADJUSTMENT_ID'. (NullAllowed)
     */
    public void setDateAdjustmentId(Long dateAdjustmentId) {
        __modifiedProperties.add("dateAdjustmentId");
        this._dateAdjustmentId = dateAdjustmentId;
    }

    /**
     * [get] (adjusted)ADJUSTED_DATE: {DATE(10)} <br>
     * @return The value of the column 'ADJUSTED_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getAdjustedDate() {
        return _adjustedDate;
    }

    /**
     * [set] (adjusted)ADJUSTED_DATE: {DATE(10)} <br>
     * @param adjustedDate The value of the column 'ADJUSTED_DATE'. (NullAllowed)
     */
    public void setAdjustedDate(java.time.LocalDate adjustedDate) {
        __modifiedProperties.add("adjustedDate");
        this._adjustedDate = adjustedDate;
    }

    /**
     * [get] ADJUSTED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'ADJUSTED_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getAdjustedDatetime() {
        return _adjustedDatetime;
    }

    /**
     * [set] ADJUSTED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param adjustedDatetime The value of the column 'ADJUSTED_DATETIME'. (NullAllowed)
     */
    public void setAdjustedDatetime(java.time.LocalDateTime adjustedDatetime) {
        __modifiedProperties.add("adjustedDatetime");
        this._adjustedDatetime = adjustedDatetime;
    }

    /**
     * [get] ADJUSTED_TIME: {TIME(8)} <br>
     * @return The value of the column 'ADJUSTED_TIME'. (NullAllowed)
     */
    @JSONHint(format="HH:mm:ss")
    @JsonFormat(pattern="HH:mm:ss")
    public java.time.LocalTime getAdjustedTime() {
        return _adjustedTime;
    }

    /**
     * [set] ADJUSTED_TIME: {TIME(8)} <br>
     * @param adjustedTime The value of the column 'ADJUSTED_TIME'. (NullAllowed)
     */
    public void setAdjustedTime(java.time.LocalTime adjustedTime) {
        __modifiedProperties.add("adjustedTime");
        this._adjustedTime = adjustedTime;
    }

    /**
     * [get] ADJUSTED_INTEGER: {INTEGER(10)} <br>
     * @return The value of the column 'ADJUSTED_INTEGER'. (NullAllowed)
     */
    public Integer getAdjustedInteger() {
        return _adjustedInteger;
    }

    /**
     * [set] ADJUSTED_INTEGER: {INTEGER(10)} <br>
     * @param adjustedInteger The value of the column 'ADJUSTED_INTEGER'. (NullAllowed)
     */
    public void setAdjustedInteger(Integer adjustedInteger) {
        __modifiedProperties.add("adjustedInteger");
        this._adjustedInteger = adjustedInteger;
    }

    /**
     * [get] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed)
     */
    public Long getAdjustedPlainLong() {
        return _adjustedPlainLong;
    }

    /**
     * [set] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br>
     * @param adjustedPlainLong The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed)
     */
    public void setAdjustedPlainLong(Long adjustedPlainLong) {
        __modifiedProperties.add("adjustedPlainLong");
        this._adjustedPlainLong = adjustedPlainLong;
    }

    /**
     * [get] ADJUSTED_STRING_LONG: {VARCHAR(32)} <br>
     * @return The value of the column 'ADJUSTED_STRING_LONG'. (NullAllowed)
     */
    public String getAdjustedStringLong() {
        return _adjustedStringLong;
    }

    /**
     * [set] ADJUSTED_STRING_LONG: {VARCHAR(32)} <br>
     * @param adjustedStringLong The value of the column 'ADJUSTED_STRING_LONG'. (NullAllowed)
     */
    public void setAdjustedStringLong(String adjustedStringLong) {
        __modifiedProperties.add("adjustedStringLong");
        this._adjustedStringLong = adjustedStringLong;
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
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * 眠いときは眠いと言おう。
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * 眠いときは眠いと言おう。
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

}
