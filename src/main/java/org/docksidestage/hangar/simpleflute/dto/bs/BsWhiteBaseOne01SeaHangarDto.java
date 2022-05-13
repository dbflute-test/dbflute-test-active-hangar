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
 * The simple DTO of WHITE_BASE_ONE01_SEA_HANGAR as TABLE. <br>
 * <pre>
 * [primary-key]
 *     HANGAR_ID
 *
 * [column]
 *     HANGAR_ID, HANGAR_NAME, SEA_ID
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBaseOne01Sea
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne01SeaHangarDto implements Serializable {

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
    /** HANGAR_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _hangarId;

    /** HANGAR_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _hangarName;

    /** SEA_ID: {UQ, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} */
    @JsonKey
    protected Integer _seaId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaHangarDto() {
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
    protected WhiteBaseOne01SeaDto _whiteBaseOne01Sea;

    public WhiteBaseOne01SeaDto getWhiteBaseOne01Sea() {
        return _whiteBaseOne01Sea;
    }

    public void setWhiteBaseOne01Sea(WhiteBaseOne01SeaDto whiteBaseOne01Sea) {
        this._whiteBaseOne01Sea = whiteBaseOne01Sea;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne01SeaHangarDto)) { return false; }
        final BsWhiteBaseOne01SeaHangarDto otherEntity = (BsWhiteBaseOne01SeaHangarDto)other;
        if (!helpComparingValue(getHangarId(), otherEntity.getHangarId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE01_SEA_HANGAR");
        result = xCH(result, getHangarId());
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
        sb.append(c).append(getHangarId());
        sb.append(c).append(getHangarName());
        sb.append(c).append(getSeaId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HANGAR_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'HANGAR_ID'. (NullAllowed)
     */
    public Integer getHangarId() {
        return _hangarId;
    }

    /**
     * [set] HANGAR_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param hangarId The value of the column 'HANGAR_ID'. (NullAllowed)
     */
    public void setHangarId(Integer hangarId) {
        __modifiedProperties.add("hangarId");
        this._hangarId = hangarId;
    }

    /**
     * [get] HANGAR_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'HANGAR_NAME'. (NullAllowed)
     */
    public String getHangarName() {
        return _hangarName;
    }

    /**
     * [set] HANGAR_NAME: {NotNull, VARCHAR(200)} <br>
     * @param hangarName The value of the column 'HANGAR_NAME'. (NullAllowed)
     */
    public void setHangarName(String hangarName) {
        __modifiedProperties.add("hangarName");
        this._hangarName = hangarName;
    }

    /**
     * [get] SEA_ID: {UQ, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @return The value of the column 'SEA_ID'. (NullAllowed)
     */
    public Integer getSeaId() {
        return _seaId;
    }

    /**
     * [set] SEA_ID: {UQ, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @param seaId The value of the column 'SEA_ID'. (NullAllowed)
     */
    public void setSeaId(Integer seaId) {
        __modifiedProperties.add("seaId");
        this._seaId = seaId;
    }

}
