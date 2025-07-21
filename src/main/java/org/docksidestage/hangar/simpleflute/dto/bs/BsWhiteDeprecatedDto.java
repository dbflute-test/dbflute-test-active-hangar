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
 * The simple DTO of (非推奨テスト)WHITE_DEPRECATED as TABLE. <br>
 * コメントがある場合<br>
 * #deprecated test of deprecated
 * <pre>
 * [primary-key]
 *     DEPRECATED_ID
 *
 * [column]
 *     DEPRECATED_ID, DEPRECATED_NAME, DEPRECATED_CODE
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
 *     WHITE_DEPRECATED_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteDeprecatedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteDeprecatedDto implements Serializable {

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
    /** DEPRECATED_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _deprecatedId;

    /** DEPRECATED_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _deprecatedName;

    /** DEPRECATED_CODE: {NotNull, VARCHAR(16)} */
    @JsonKey
    protected String _deprecatedCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedDto() {
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
    protected List<WhiteDeprecatedRefDto> _whiteDeprecatedRefList;

    public List<WhiteDeprecatedRefDto> getWhiteDeprecatedRefList() {
        if (_whiteDeprecatedRefList == null) { _whiteDeprecatedRefList = new ArrayList<WhiteDeprecatedRefDto>(); }
        return _whiteDeprecatedRefList;
    }

    public void setWhiteDeprecatedRefList(List<WhiteDeprecatedRefDto> whiteDeprecatedRefList) {
        this._whiteDeprecatedRefList = whiteDeprecatedRefList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteDeprecatedDto)) { return false; }
        final BsWhiteDeprecatedDto otherEntity = (BsWhiteDeprecatedDto)other;
        if (!helpComparingValue(getDeprecatedId(), otherEntity.getDeprecatedId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DEPRECATED");
        result = xCH(result, getDeprecatedId());
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
        sb.append(c).append(getDeprecatedId());
        sb.append(c).append(getDeprecatedName());
        sb.append(c).append(getDeprecatedCode());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPRECATED_ID'. (NullAllowed)
     */
    public Long getDeprecatedId() {
        return _deprecatedId;
    }

    /**
     * [set] DEPRECATED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deprecatedId The value of the column 'DEPRECATED_ID'. (NullAllowed)
     */
    public void setDeprecatedId(Long deprecatedId) {
        __modifiedProperties.add("deprecatedId");
        this._deprecatedId = deprecatedId;
    }

    /**
     * [get] DEPRECATED_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEPRECATED_NAME'. (NullAllowed)
     */
    public String getDeprecatedName() {
        return _deprecatedName;
    }

    /**
     * [set] DEPRECATED_NAME: {NotNull, VARCHAR(200)} <br>
     * @param deprecatedName The value of the column 'DEPRECATED_NAME'. (NullAllowed)
     */
    public void setDeprecatedName(String deprecatedName) {
        __modifiedProperties.add("deprecatedName");
        this._deprecatedName = deprecatedName;
    }

    /**
     * [get] DEPRECATED_CODE: {NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'DEPRECATED_CODE'. (NullAllowed)
     */
    public String getDeprecatedCode() {
        return _deprecatedCode;
    }

    /**
     * [set] DEPRECATED_CODE: {NotNull, VARCHAR(16)} <br>
     * @param deprecatedCode The value of the column 'DEPRECATED_CODE'. (NullAllowed)
     */
    public void setDeprecatedCode(String deprecatedCode) {
        __modifiedProperties.add("deprecatedCode");
        this._deprecatedCode = deprecatedCode;
    }

}
