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
 * The simple DTO of (オンパレードれふ)WHITE_ON_PARADE_REF as TABLE. <br>
 * shalias:{ オンパレードREF } dfalias:{ オンパレードれふ }
 * <pre>
 * [primary-key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REF_NAME, NULLABLE_FK_ON_PARADE_ID, NULLABLE_FK_TO_MANY_ID
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
 *     WHITE_ON_PARADE, WHITE_ON_PARADE_NULLABLE_TO_MANY
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteOnParade, whiteOnParadeNullableToMany
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteOnParadeRefDto implements Serializable {

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
    /** REF_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _refId;

    /** REF_NAME: {NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _refName;

    /** NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE} */
    @JsonKey
    protected Long _nullableFkOnParadeId;

    /** NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY} */
    @JsonKey
    protected Long _nullableFkToManyId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnParadeRefDto() {
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
    protected WhiteOnParadeDto _whiteOnParade;

    public WhiteOnParadeDto getWhiteOnParade() {
        return _whiteOnParade;
    }

    public void setWhiteOnParade(WhiteOnParadeDto whiteOnParade) {
        this._whiteOnParade = whiteOnParade;
    }

    protected WhiteOnParadeNullableToManyDto _whiteOnParadeNullableToMany;

    public WhiteOnParadeNullableToManyDto getWhiteOnParadeNullableToMany() {
        return _whiteOnParadeNullableToMany;
    }

    public void setWhiteOnParadeNullableToMany(WhiteOnParadeNullableToManyDto whiteOnParadeNullableToMany) {
        this._whiteOnParadeNullableToMany = whiteOnParadeNullableToMany;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteOnParadeRefDto)) { return false; }
        final BsWhiteOnParadeRefDto otherEntity = (BsWhiteOnParadeRefDto)other;
        if (!helpComparingValue(getRefId(), otherEntity.getRefId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_ON_PARADE_REF");
        result = xCH(result, getRefId());
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
        sb.append(c).append(getRefId());
        sb.append(c).append(getRefName());
        sb.append(c).append(getNullableFkOnParadeId());
        sb.append(c).append(getNullableFkToManyId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'REF_ID'. (NullAllowed)
     */
    public Long getRefId() {
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param refId The value of the column 'REF_ID'. (NullAllowed)
     */
    public void setRefId(Long refId) {
        __modifiedProperties.add("refId");
        this._refId = refId;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'REF_NAME'. (NullAllowed)
     */
    public String getRefName() {
        return _refName;
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR(100)} <br>
     * @param refName The value of the column 'REF_NAME'. (NullAllowed)
     */
    public void setRefName(String refName) {
        __modifiedProperties.add("refName");
        this._refName = refName;
    }

    /**
     * [get] NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE} <br>
     * @return The value of the column 'NULLABLE_FK_ON_PARADE_ID'. (NullAllowed)
     */
    public Long getNullableFkOnParadeId() {
        return _nullableFkOnParadeId;
    }

    /**
     * [set] NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE} <br>
     * @param nullableFkOnParadeId The value of the column 'NULLABLE_FK_ON_PARADE_ID'. (NullAllowed)
     */
    public void setNullableFkOnParadeId(Long nullableFkOnParadeId) {
        __modifiedProperties.add("nullableFkOnParadeId");
        this._nullableFkOnParadeId = nullableFkOnParadeId;
    }

    /**
     * [get] NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY} <br>
     * @return The value of the column 'NULLABLE_FK_TO_MANY_ID'. (NullAllowed)
     */
    public Long getNullableFkToManyId() {
        return _nullableFkToManyId;
    }

    /**
     * [set] NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY} <br>
     * @param nullableFkToManyId The value of the column 'NULLABLE_FK_TO_MANY_ID'. (NullAllowed)
     */
    public void setNullableFkToManyId(Long nullableFkToManyId) {
        __modifiedProperties.add("nullableFkToManyId");
        this._nullableFkToManyId = nullableFkToManyId;
    }

}
