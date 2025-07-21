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
 * The simple DTO of WHITE_DEPRECATED_REF as TABLE. <br>
 * #deprecated test of deprecated referrer &lt;br&gt; is HTML test
 * <pre>
 * [primary-key]
 *     DEPRECATED_REF_ID
 *
 * [column]
 *     DEPRECATED_REF_ID, DEPRECATED_ID, DEPRECATED_REF_NAME, DEPRECATED_REF_CODE, PRODUCT_ID
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
 *     WHITE_DEPRECATED, PRODUCT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteDeprecated, product
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteDeprecatedRefDto implements Serializable {

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
    /** DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _deprecatedRefId;

    /** DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} */
    @JsonKey
    protected Long _deprecatedId;

    /** DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _deprecatedRefName;

    /** DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} */
    @JsonKey
    protected String _deprecatedRefCode;

    /** PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT} */
    @JsonKey
    protected Integer _productId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedRefDto() {
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
    protected WhiteDeprecatedDto _whiteDeprecated;

    public WhiteDeprecatedDto getWhiteDeprecated() {
        return _whiteDeprecated;
    }

    public void setWhiteDeprecated(WhiteDeprecatedDto whiteDeprecated) {
        this._whiteDeprecated = whiteDeprecated;
    }

    protected ProductDto _product;

    public ProductDto getProduct() {
        return _product;
    }

    public void setProduct(ProductDto product) {
        this._product = product;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteDeprecatedRefDto)) { return false; }
        final BsWhiteDeprecatedRefDto otherEntity = (BsWhiteDeprecatedRefDto)other;
        if (!helpComparingValue(getDeprecatedRefId(), otherEntity.getDeprecatedRefId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DEPRECATED_REF");
        result = xCH(result, getDeprecatedRefId());
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
        sb.append(c).append(getDeprecatedRefId());
        sb.append(c).append(getDeprecatedId());
        sb.append(c).append(getDeprecatedRefName());
        sb.append(c).append(getDeprecatedRefCode());
        sb.append(c).append(getProductId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPRECATED_REF_ID'. (NullAllowed)
     */
    public Long getDeprecatedRefId() {
        return _deprecatedRefId;
    }

    /**
     * [set] DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deprecatedRefId The value of the column 'DEPRECATED_REF_ID'. (NullAllowed)
     */
    public void setDeprecatedRefId(Long deprecatedRefId) {
        __modifiedProperties.add("deprecatedRefId");
        this._deprecatedRefId = deprecatedRefId;
    }

    /**
     * [get] DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} <br>
     * @return The value of the column 'DEPRECATED_ID'. (NullAllowed)
     */
    public Long getDeprecatedId() {
        return _deprecatedId;
    }

    /**
     * [set] DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} <br>
     * @param deprecatedId The value of the column 'DEPRECATED_ID'. (NullAllowed)
     */
    public void setDeprecatedId(Long deprecatedId) {
        __modifiedProperties.add("deprecatedId");
        this._deprecatedId = deprecatedId;
    }

    /**
     * [get] DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEPRECATED_REF_NAME'. (NullAllowed)
     */
    public String getDeprecatedRefName() {
        return _deprecatedRefName;
    }

    /**
     * [set] DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param deprecatedRefName The value of the column 'DEPRECATED_REF_NAME'. (NullAllowed)
     */
    public void setDeprecatedRefName(String deprecatedRefName) {
        __modifiedProperties.add("deprecatedRefName");
        this._deprecatedRefName = deprecatedRefName;
    }

    /**
     * [get] DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'DEPRECATED_REF_CODE'. (NullAllowed)
     */
    public String getDeprecatedRefCode() {
        return _deprecatedRefCode;
    }

    /**
     * [set] DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * @param deprecatedRefCode The value of the column 'DEPRECATED_REF_CODE'. (NullAllowed)
     */
    public void setDeprecatedRefCode(String deprecatedRefCode) {
        __modifiedProperties.add("deprecatedRefCode");
        this._deprecatedRefCode = deprecatedRefCode;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

}
