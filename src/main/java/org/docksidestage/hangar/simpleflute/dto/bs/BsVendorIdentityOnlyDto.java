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
 * The simple DTO of VENDOR_IDENTITY_ONLY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     IDENTITY_ONLY_ID
 *
 * [column]
 *     IDENTITY_ONLY_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IDENTITY_ONLY_ID
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
public abstract class BsVendorIdentityOnlyDto implements Serializable {

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
    /** IDENTITY_ONLY_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _identityOnlyId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorIdentityOnlyDto() {
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
        if (other == null || !(other instanceof BsVendorIdentityOnlyDto)) { return false; }
        final BsVendorIdentityOnlyDto otherEntity = (BsVendorIdentityOnlyDto)other;
        if (!helpComparingValue(getIdentityOnlyId(), otherEntity.getIdentityOnlyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "VENDOR_IDENTITY_ONLY");
        result = xCH(result, getIdentityOnlyId());
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
        sb.append(c).append(getIdentityOnlyId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IDENTITY_ONLY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'IDENTITY_ONLY_ID'. (NullAllowed)
     */
    public Long getIdentityOnlyId() {
        return _identityOnlyId;
    }

    /**
     * [set] IDENTITY_ONLY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param identityOnlyId The value of the column 'IDENTITY_ONLY_ID'. (NullAllowed)
     */
    public void setIdentityOnlyId(Long identityOnlyId) {
        __modifiedProperties.add("identityOnlyId");
        this._identityOnlyId = identityOnlyId;
    }

}
