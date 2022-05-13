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
 * The simple DTO of WHITE_FIRST_DATE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     FIRST_DATE_ID
 *
 * [column]
 *     FIRST_DATE_ID, FIRST_DATE_NAME, ADDED_AT_TABLE_SAME_DATE
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
public abstract class BsWhiteFirstDateDto implements Serializable {

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
    /** FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _firstDateId;

    /** FIRST_DATE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _firstDateName;

    /** ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _addedAtTableSameDate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteFirstDateDto() {
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
        if (other == null || !(other instanceof BsWhiteFirstDateDto)) { return false; }
        final BsWhiteFirstDateDto otherEntity = (BsWhiteFirstDateDto)other;
        if (!helpComparingValue(getFirstDateId(), otherEntity.getFirstDateId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_FIRST_DATE");
        result = xCH(result, getFirstDateId());
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
        sb.append(c).append(getFirstDateId());
        sb.append(c).append(getFirstDateName());
        sb.append(c).append(getAddedAtTableSameDate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'FIRST_DATE_ID'. (NullAllowed)
     */
    public Long getFirstDateId() {
        return _firstDateId;
    }

    /**
     * [set] FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param firstDateId The value of the column 'FIRST_DATE_ID'. (NullAllowed)
     */
    public void setFirstDateId(Long firstDateId) {
        __modifiedProperties.add("firstDateId");
        this._firstDateId = firstDateId;
    }

    /**
     * [get] FIRST_DATE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'FIRST_DATE_NAME'. (NullAllowed)
     */
    public String getFirstDateName() {
        return _firstDateName;
    }

    /**
     * [set] FIRST_DATE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param firstDateName The value of the column 'FIRST_DATE_NAME'. (NullAllowed)
     */
    public void setFirstDateName(String firstDateName) {
        __modifiedProperties.add("firstDateName");
        this._firstDateName = firstDateName;
    }

    /**
     * [get] ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'ADDED_AT_TABLE_SAME_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getAddedAtTableSameDate() {
        return _addedAtTableSameDate;
    }

    /**
     * [set] ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)} <br>
     * @param addedAtTableSameDate The value of the column 'ADDED_AT_TABLE_SAME_DATE'. (NullAllowed)
     */
    public void setAddedAtTableSameDate(java.time.LocalDate addedAtTableSameDate) {
        __modifiedProperties.add("addedAtTableSameDate");
        this._addedAtTableSameDate = addedAtTableSameDate;
    }

}
