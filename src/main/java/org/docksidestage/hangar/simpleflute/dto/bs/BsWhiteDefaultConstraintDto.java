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
 * The simple DTO of WHITE_DEFAULT_CONSTRAINT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DEFAULT_ID
 *
 * [column]
 *     DEFAULT_ID, DEFAULT_NAME, DEFAULT_COUNT, DEFAULT_DATE, DEFAULT_JUDGE, DEFAULT_EMPTY_STRING
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
public abstract class BsWhiteDefaultConstraintDto implements Serializable {

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
    /** DEFAULT_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _defaultId;

    /** DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} */
    @JsonKey
    protected String _defaultName;

    /** DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]} */
    @JsonKey
    protected Integer _defaultCount;

    /** DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]} */
    @JsonKey
    protected java.time.LocalDate _defaultDate;

    /** DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]} */
    @JsonKey
    protected Boolean _defaultJudge;

    /** DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _defaultEmptyString;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDefaultConstraintDto() {
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
        if (other == null || !(other instanceof BsWhiteDefaultConstraintDto)) { return false; }
        final BsWhiteDefaultConstraintDto otherEntity = (BsWhiteDefaultConstraintDto)other;
        if (!helpComparingValue(getDefaultId(), otherEntity.getDefaultId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DEFAULT_CONSTRAINT");
        result = xCH(result, getDefaultId());
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
        sb.append(c).append(getDefaultId());
        sb.append(c).append(getDefaultName());
        sb.append(c).append(getDefaultCount());
        sb.append(c).append(getDefaultDate());
        sb.append(c).append(getDefaultJudge());
        sb.append(c).append(getDefaultEmptyString());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEFAULT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEFAULT_ID'. (NullAllowed)
     */
    public Long getDefaultId() {
        return _defaultId;
    }

    /**
     * [set] DEFAULT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param defaultId The value of the column 'DEFAULT_ID'. (NullAllowed)
     */
    public void setDefaultId(Long defaultId) {
        __modifiedProperties.add("defaultId");
        this._defaultId = defaultId;
    }

    /**
     * [get] DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} <br>
     * @return The value of the column 'DEFAULT_NAME'. (NullAllowed)
     */
    public String getDefaultName() {
        return _defaultName;
    }

    /**
     * [set] DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} <br>
     * @param defaultName The value of the column 'DEFAULT_NAME'. (NullAllowed)
     */
    public void setDefaultName(String defaultName) {
        __modifiedProperties.add("defaultName");
        this._defaultName = defaultName;
    }

    /**
     * [get] DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]} <br>
     * @return The value of the column 'DEFAULT_COUNT'. (NullAllowed)
     */
    public Integer getDefaultCount() {
        return _defaultCount;
    }

    /**
     * [set] DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]} <br>
     * @param defaultCount The value of the column 'DEFAULT_COUNT'. (NullAllowed)
     */
    public void setDefaultCount(Integer defaultCount) {
        __modifiedProperties.add("defaultCount");
        this._defaultCount = defaultCount;
    }

    /**
     * [get] DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]} <br>
     * @return The value of the column 'DEFAULT_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getDefaultDate() {
        return _defaultDate;
    }

    /**
     * [set] DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]} <br>
     * @param defaultDate The value of the column 'DEFAULT_DATE'. (NullAllowed)
     */
    public void setDefaultDate(java.time.LocalDate defaultDate) {
        __modifiedProperties.add("defaultDate");
        this._defaultDate = defaultDate;
    }

    /**
     * [get] DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]} <br>
     * @return The value of the column 'DEFAULT_JUDGE'. (NullAllowed)
     */
    public Boolean getDefaultJudge() {
        return _defaultJudge;
    }

    /**
     * [set] DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]} <br>
     * @param defaultJudge The value of the column 'DEFAULT_JUDGE'. (NullAllowed)
     */
    public void setDefaultJudge(Boolean defaultJudge) {
        __modifiedProperties.add("defaultJudge");
        this._defaultJudge = defaultJudge;
    }

    /**
     * [get] DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEFAULT_EMPTY_STRING'. (NullAllowed)
     */
    public String getDefaultEmptyString() {
        return _defaultEmptyString;
    }

    /**
     * [set] DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} <br>
     * @param defaultEmptyString The value of the column 'DEFAULT_EMPTY_STRING'. (NullAllowed)
     */
    public void setDefaultEmptyString(String defaultEmptyString) {
        __modifiedProperties.add("defaultEmptyString");
        this._defaultEmptyString = defaultEmptyString;
    }

}
