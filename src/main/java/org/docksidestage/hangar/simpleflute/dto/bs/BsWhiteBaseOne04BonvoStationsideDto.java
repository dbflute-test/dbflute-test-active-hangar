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
 * The simple DTO of WHITE_BASE_ONE04_BONVO_STATIONSIDE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     STATIONSIDE_ID
 *
 * [column]
 *     STATIONSIDE_ID, STATIONSIDE_NAME
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
 *     WHITE_BASE_ONE04_BONVO
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseOne04BonvoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne04BonvoStationsideDto implements Serializable {

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
    /** STATIONSIDE_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _stationsideId;

    /** STATIONSIDE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _stationsideName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne04BonvoStationsideDto() {
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
    protected List<WhiteBaseOne04BonvoDto> _whiteBaseOne04BonvoList;

    public List<WhiteBaseOne04BonvoDto> getWhiteBaseOne04BonvoList() {
        if (_whiteBaseOne04BonvoList == null) { _whiteBaseOne04BonvoList = new ArrayList<WhiteBaseOne04BonvoDto>(); }
        return _whiteBaseOne04BonvoList;
    }

    public void setWhiteBaseOne04BonvoList(List<WhiteBaseOne04BonvoDto> whiteBaseOne04BonvoList) {
        this._whiteBaseOne04BonvoList = whiteBaseOne04BonvoList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne04BonvoStationsideDto)) { return false; }
        final BsWhiteBaseOne04BonvoStationsideDto otherEntity = (BsWhiteBaseOne04BonvoStationsideDto)other;
        if (!helpComparingValue(getStationsideId(), otherEntity.getStationsideId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE04_BONVO_STATIONSIDE");
        result = xCH(result, getStationsideId());
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
        sb.append(c).append(getStationsideId());
        sb.append(c).append(getStationsideName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATIONSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'STATIONSIDE_ID'. (NullAllowed)
     */
    public Integer getStationsideId() {
        return _stationsideId;
    }

    /**
     * [set] STATIONSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param stationsideId The value of the column 'STATIONSIDE_ID'. (NullAllowed)
     */
    public void setStationsideId(Integer stationsideId) {
        __modifiedProperties.add("stationsideId");
        this._stationsideId = stationsideId;
    }

    /**
     * [get] STATIONSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'STATIONSIDE_NAME'. (NullAllowed)
     */
    public String getStationsideName() {
        return _stationsideName;
    }

    /**
     * [set] STATIONSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param stationsideName The value of the column 'STATIONSIDE_NAME'. (NullAllowed)
     */
    public void setStationsideName(String stationsideName) {
        __modifiedProperties.add("stationsideName");
        this._stationsideName = stationsideName;
    }

}
