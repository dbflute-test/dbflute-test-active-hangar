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
 * The simple DTO of WHITE_OPTIMISTIC_LOCK_BY_VERSION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BY_VERSION_ID
 *
 * [column]
 *     BY_VERSION_ID, BY_VERSION_NAME, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsWhiteOptimisticLockByVersionDto implements Serializable {

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
    /** BY_VERSION_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _byVersionId;

    /** BY_VERSION_NAME: {NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _byVersionName;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOptimisticLockByVersionDto() {
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
        if (other == null || !(other instanceof BsWhiteOptimisticLockByVersionDto)) { return false; }
        final BsWhiteOptimisticLockByVersionDto otherEntity = (BsWhiteOptimisticLockByVersionDto)other;
        if (!helpComparingValue(getByVersionId(), otherEntity.getByVersionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_OPTIMISTIC_LOCK_BY_VERSION");
        result = xCH(result, getByVersionId());
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
        sb.append(c).append(getByVersionId());
        sb.append(c).append(getByVersionName());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BY_VERSION_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'BY_VERSION_ID'. (NullAllowed)
     */
    public Long getByVersionId() {
        return _byVersionId;
    }

    /**
     * [set] BY_VERSION_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param byVersionId The value of the column 'BY_VERSION_ID'. (NullAllowed)
     */
    public void setByVersionId(Long byVersionId) {
        __modifiedProperties.add("byVersionId");
        this._byVersionId = byVersionId;
    }

    /**
     * [get] BY_VERSION_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'BY_VERSION_NAME'. (NullAllowed)
     */
    public String getByVersionName() {
        return _byVersionName;
    }

    /**
     * [set] BY_VERSION_NAME: {NotNull, VARCHAR(100)} <br>
     * @param byVersionName The value of the column 'BY_VERSION_NAME'. (NullAllowed)
     */
    public void setByVersionName(String byVersionName) {
        __modifiedProperties.add("byVersionName");
        this._byVersionName = byVersionName;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

}
