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
 * The simple DTO of WHITE_BASE_ONE09_PALM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PALM_ID
 *
 * [column]
 *     PALM_ID, PALM_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBase
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne09PalmDto implements Serializable {

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
    /** PALM_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _palmId;

    /** PALM_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _palmName;

    /** BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} */
    @JsonKey
    protected Integer _baseId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne09PalmDto() {
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
    protected WhiteBaseDto _whiteBase;

    public WhiteBaseDto getWhiteBase() {
        return _whiteBase;
    }

    public void setWhiteBase(WhiteBaseDto whiteBase) {
        this._whiteBase = whiteBase;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne09PalmDto)) { return false; }
        final BsWhiteBaseOne09PalmDto otherEntity = (BsWhiteBaseOne09PalmDto)other;
        if (!helpComparingValue(getPalmId(), otherEntity.getPalmId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE09_PALM");
        result = xCH(result, getPalmId());
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
        sb.append(c).append(getPalmId());
        sb.append(c).append(getPalmName());
        sb.append(c).append(getBaseId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PALM_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PALM_ID'. (NullAllowed)
     */
    public Integer getPalmId() {
        return _palmId;
    }

    /**
     * [set] PALM_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param palmId The value of the column 'PALM_ID'. (NullAllowed)
     */
    public void setPalmId(Integer palmId) {
        __modifiedProperties.add("palmId");
        this._palmId = palmId;
    }

    /**
     * [get] PALM_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PALM_NAME'. (NullAllowed)
     */
    public String getPalmName() {
        return _palmName;
    }

    /**
     * [set] PALM_NAME: {NotNull, VARCHAR(200)} <br>
     * @param palmName The value of the column 'PALM_NAME'. (NullAllowed)
     */
    public void setPalmName(String palmName) {
        __modifiedProperties.add("palmName");
        this._palmName = palmName;
    }

    /**
     * [get] BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @return The value of the column 'BASE_ID'. (NullAllowed)
     */
    public Integer getBaseId() {
        return _baseId;
    }

    /**
     * [set] BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @param baseId The value of the column 'BASE_ID'. (NullAllowed)
     */
    public void setBaseId(Integer baseId) {
        __modifiedProperties.add("baseId");
        this._baseId = baseId;
    }

}
