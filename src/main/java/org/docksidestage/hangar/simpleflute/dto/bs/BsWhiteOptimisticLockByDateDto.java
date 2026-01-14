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
 * The simple DTO of WHITE_OPTIMISTIC_LOCK_BY_DATE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BY_DATE_ID
 *
 * [column]
 *     BY_DATE_ID, BY_DATE_NAME, UPDATE_DATE
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
public abstract class BsWhiteOptimisticLockByDateDto implements Serializable {

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
    /** BY_DATE_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _byDateId;

    /** BY_DATE_NAME: {NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _byDateName;

    /** UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _updateDate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOptimisticLockByDateDto() {
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
        if (other == null || !(other instanceof BsWhiteOptimisticLockByDateDto)) { return false; }
        final BsWhiteOptimisticLockByDateDto otherEntity = (BsWhiteOptimisticLockByDateDto)other;
        if (!helpComparingValue(getByDateId(), otherEntity.getByDateId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_OPTIMISTIC_LOCK_BY_DATE");
        result = xCH(result, getByDateId());
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
        sb.append(c).append(getByDateId());
        sb.append(c).append(getByDateName());
        sb.append(c).append(getUpdateDate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BY_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'BY_DATE_ID'. (NullAllowed)
     */
    public Long getByDateId() {
        return _byDateId;
    }

    /**
     * [set] BY_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param byDateId The value of the column 'BY_DATE_ID'. (NullAllowed)
     */
    public void setByDateId(Long byDateId) {
        __modifiedProperties.add("byDateId");
        this._byDateId = byDateId;
    }

    /**
     * [get] BY_DATE_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'BY_DATE_NAME'. (NullAllowed)
     */
    public String getByDateName() {
        return _byDateName;
    }

    /**
     * [set] BY_DATE_NAME: {NotNull, VARCHAR(100)} <br>
     * @param byDateName The value of the column 'BY_DATE_NAME'. (NullAllowed)
     */
    public void setByDateName(String byDateName) {
        __modifiedProperties.add("byDateName");
        this._byDateName = byDateName;
    }

    /**
     * [get] UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'UPDATE_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDate() {
        return _updateDate;
    }

    /**
     * [set] UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param updateDate The value of the column 'UPDATE_DATE'. (NullAllowed)
     */
    public void setUpdateDate(java.time.LocalDateTime updateDate) {
        __modifiedProperties.add("updateDate");
        this._updateDate = updateDate;
    }

}
