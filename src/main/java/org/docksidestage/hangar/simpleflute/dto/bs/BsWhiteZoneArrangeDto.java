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
 * The simple DTO of WHITE_ZONE_ARRANGE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ARRANGE_ID
 *
 * [column]
 *     ARRANGE_ID, ARRANGE_NAME, ORDER
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
public abstract class BsWhiteZoneArrangeDto implements Serializable {

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
    /** ARRANGE_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _arrangeId;

    /** ARRANGE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _arrangeName;

    /** ORDER: {INTEGER(10)} */
    @JsonKey
    protected Integer _order;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteZoneArrangeDto() {
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
        if (other == null || !(other instanceof BsWhiteZoneArrangeDto)) { return false; }
        final BsWhiteZoneArrangeDto otherEntity = (BsWhiteZoneArrangeDto)other;
        if (!helpComparingValue(getArrangeId(), otherEntity.getArrangeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_ZONE_ARRANGE");
        result = xCH(result, getArrangeId());
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
        sb.append(c).append(getArrangeId());
        sb.append(c).append(getArrangeName());
        sb.append(c).append(getOrder());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ARRANGE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'ARRANGE_ID'. (NullAllowed)
     */
    public Integer getArrangeId() {
        return _arrangeId;
    }

    /**
     * [set] ARRANGE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param arrangeId The value of the column 'ARRANGE_ID'. (NullAllowed)
     */
    public void setArrangeId(Integer arrangeId) {
        __modifiedProperties.add("arrangeId");
        this._arrangeId = arrangeId;
    }

    /**
     * [get] ARRANGE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'ARRANGE_NAME'. (NullAllowed)
     */
    public String getArrangeName() {
        return _arrangeName;
    }

    /**
     * [set] ARRANGE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param arrangeName The value of the column 'ARRANGE_NAME'. (NullAllowed)
     */
    public void setArrangeName(String arrangeName) {
        __modifiedProperties.add("arrangeName");
        this._arrangeName = arrangeName;
    }

    /**
     * [get] ORDER: {INTEGER(10)} <br>
     * @return The value of the column 'ORDER'. (NullAllowed)
     */
    public Integer getOrder() {
        return _order;
    }

    /**
     * [set] ORDER: {INTEGER(10)} <br>
     * @param order The value of the column 'ORDER'. (NullAllowed)
     */
    public void setOrder(Integer order) {
        __modifiedProperties.add("order");
        this._order = order;
    }

}
