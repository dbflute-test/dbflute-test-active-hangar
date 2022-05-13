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
 * The simple DTO of WHITE_BASE_ONE06_AMBA as TABLE. <br>
 * <pre>
 * [primary-key]
 *     AMBA_ID
 *
 * [column]
 *     AMBA_ID, AMBA_NAME
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
 *     WHITE_BASE
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne06AmbaDto implements Serializable {

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
    /** AMBA_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _ambaId;

    /** AMBA_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _ambaName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne06AmbaDto() {
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
    protected List<WhiteBaseDto> _whiteBaseList;

    public List<WhiteBaseDto> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = new ArrayList<WhiteBaseDto>(); }
        return _whiteBaseList;
    }

    public void setWhiteBaseList(List<WhiteBaseDto> whiteBaseList) {
        this._whiteBaseList = whiteBaseList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne06AmbaDto)) { return false; }
        final BsWhiteBaseOne06AmbaDto otherEntity = (BsWhiteBaseOne06AmbaDto)other;
        if (!helpComparingValue(getAmbaId(), otherEntity.getAmbaId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE06_AMBA");
        result = xCH(result, getAmbaId());
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
        sb.append(c).append(getAmbaId());
        sb.append(c).append(getAmbaName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] AMBA_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'AMBA_ID'. (NullAllowed)
     */
    public Integer getAmbaId() {
        return _ambaId;
    }

    /**
     * [set] AMBA_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param ambaId The value of the column 'AMBA_ID'. (NullAllowed)
     */
    public void setAmbaId(Integer ambaId) {
        __modifiedProperties.add("ambaId");
        this._ambaId = ambaId;
    }

    /**
     * [get] AMBA_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'AMBA_NAME'. (NullAllowed)
     */
    public String getAmbaName() {
        return _ambaName;
    }

    /**
     * [set] AMBA_NAME: {NotNull, VARCHAR(200)} <br>
     * @param ambaName The value of the column 'AMBA_NAME'. (NullAllowed)
     */
    public void setAmbaName(String ambaName) {
        __modifiedProperties.add("ambaName");
        this._ambaName = ambaName;
    }

}
