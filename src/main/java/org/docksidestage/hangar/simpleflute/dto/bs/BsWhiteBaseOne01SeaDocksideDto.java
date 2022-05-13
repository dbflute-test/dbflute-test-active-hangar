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
 * The simple DTO of WHITE_BASE_ONE01_SEA_DOCKSIDE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DOCKSIDE_ID
 *
 * [column]
 *     DOCKSIDE_ID, DOCKSIDE_NAME
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseOne01SeaList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne01SeaDocksideDto implements Serializable {

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
    /** DOCKSIDE_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _docksideId;

    /** DOCKSIDE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _docksideName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaDocksideDto() {
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
    protected List<WhiteBaseOne01SeaDto> _whiteBaseOne01SeaList;

    public List<WhiteBaseOne01SeaDto> getWhiteBaseOne01SeaList() {
        if (_whiteBaseOne01SeaList == null) { _whiteBaseOne01SeaList = new ArrayList<WhiteBaseOne01SeaDto>(); }
        return _whiteBaseOne01SeaList;
    }

    public void setWhiteBaseOne01SeaList(List<WhiteBaseOne01SeaDto> whiteBaseOne01SeaList) {
        this._whiteBaseOne01SeaList = whiteBaseOne01SeaList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne01SeaDocksideDto)) { return false; }
        final BsWhiteBaseOne01SeaDocksideDto otherEntity = (BsWhiteBaseOne01SeaDocksideDto)other;
        if (!helpComparingValue(getDocksideId(), otherEntity.getDocksideId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE01_SEA_DOCKSIDE");
        result = xCH(result, getDocksideId());
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
        sb.append(c).append(getDocksideId());
        sb.append(c).append(getDocksideName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DOCKSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DOCKSIDE_ID'. (NullAllowed)
     */
    public Integer getDocksideId() {
        return _docksideId;
    }

    /**
     * [set] DOCKSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param docksideId The value of the column 'DOCKSIDE_ID'. (NullAllowed)
     */
    public void setDocksideId(Integer docksideId) {
        __modifiedProperties.add("docksideId");
        this._docksideId = docksideId;
    }

    /**
     * [get] DOCKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DOCKSIDE_NAME'. (NullAllowed)
     */
    public String getDocksideName() {
        return _docksideName;
    }

    /**
     * [set] DOCKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param docksideName The value of the column 'DOCKSIDE_NAME'. (NullAllowed)
     */
    public void setDocksideName(String docksideName) {
        __modifiedProperties.add("docksideName");
        this._docksideName = docksideName;
    }

}
