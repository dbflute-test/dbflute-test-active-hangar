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

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of WHITE_READ_ONLY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     READ_ONLY_ID
 *
 * [column]
 *     READ_ONLY_ID, READ_ONLY_NAME
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
public abstract class BsWhiteReadOnlyDto implements Serializable {

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
    /** READ_ONLY_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _readOnlyId;

    /** READ_ONLY_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _readOnlyName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteReadOnlyDto() {
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
        if (other == null || !(other instanceof BsWhiteReadOnlyDto)) { return false; }
        final BsWhiteReadOnlyDto otherEntity = (BsWhiteReadOnlyDto)other;
        if (!helpComparingValue(getReadOnlyId(), otherEntity.getReadOnlyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_READ_ONLY");
        result = xCH(result, getReadOnlyId());
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
        sb.append(c).append(getReadOnlyId());
        sb.append(c).append(getReadOnlyName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] READ_ONLY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'READ_ONLY_ID'. (NullAllowed)
     */
    public Long getReadOnlyId() {
        return _readOnlyId;
    }

    /**
     * [set] READ_ONLY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param readOnlyId The value of the column 'READ_ONLY_ID'. (NullAllowed)
     */
    public void setReadOnlyId(Long readOnlyId) {
        __modifiedProperties.add("readOnlyId");
        this._readOnlyId = readOnlyId;
    }

    /**
     * [get] READ_ONLY_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'READ_ONLY_NAME'. (NullAllowed)
     */
    public String getReadOnlyName() {
        return _readOnlyName;
    }

    /**
     * [set] READ_ONLY_NAME: {NotNull, VARCHAR(200)} <br>
     * @param readOnlyName The value of the column 'READ_ONLY_NAME'. (NullAllowed)
     */
    public void setReadOnlyName(String readOnlyName) {
        __modifiedProperties.add("readOnlyName");
        this._readOnlyName = readOnlyName;
    }

}
