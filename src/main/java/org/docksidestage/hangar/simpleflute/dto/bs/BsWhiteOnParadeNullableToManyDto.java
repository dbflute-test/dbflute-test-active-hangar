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
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_ON_PARADE_NULLABLE_TO_MANY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MANY_ID
 *
 * [column]
 *     MANY_ID, MANY_NAME
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
 *     WHITE_ON_PARADE_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteOnParadeRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteOnParadeNullableToManyDto implements Serializable {

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
    /** MANY_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _manyId;

    /** MANY_NAME: {NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _manyName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnParadeNullableToManyDto() {
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
    protected List<WhiteOnParadeRefDto> _whiteOnParadeRefList;

    public List<WhiteOnParadeRefDto> getWhiteOnParadeRefList() {
        if (_whiteOnParadeRefList == null) { _whiteOnParadeRefList = new ArrayList<WhiteOnParadeRefDto>(); }
        return _whiteOnParadeRefList;
    }

    public void setWhiteOnParadeRefList(List<WhiteOnParadeRefDto> whiteOnParadeRefList) {
        this._whiteOnParadeRefList = whiteOnParadeRefList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteOnParadeNullableToManyDto)) { return false; }
        final BsWhiteOnParadeNullableToManyDto otherEntity = (BsWhiteOnParadeNullableToManyDto)other;
        if (!helpComparingValue(getManyId(), otherEntity.getManyId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_ON_PARADE_NULLABLE_TO_MANY");
        result = xCH(result, getManyId());
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
        sb.append(c).append(getManyId());
        sb.append(c).append(getManyName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'MANY_ID'. (NullAllowed)
     */
    public Long getManyId() {
        return _manyId;
    }

    /**
     * [set] MANY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param manyId The value of the column 'MANY_ID'. (NullAllowed)
     */
    public void setManyId(Long manyId) {
        __modifiedProperties.add("manyId");
        this._manyId = manyId;
    }

    /**
     * [get] MANY_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'MANY_NAME'. (NullAllowed)
     */
    public String getManyName() {
        return _manyName;
    }

    /**
     * [set] MANY_NAME: {NotNull, VARCHAR(100)} <br>
     * @param manyName The value of the column 'MANY_NAME'. (NullAllowed)
     */
    public void setManyName(String manyName) {
        __modifiedProperties.add("manyName");
        this._manyName = manyName;
    }

}
