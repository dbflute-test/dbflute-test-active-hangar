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
import org.docksidestage.hangar.simpleflute.HangarCDef;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of (商品ステータス)PRODUCT_STATUS as TABLE. <br>
 * 商品のステータスを表現する固定的なマスタ。
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     PRODUCT, SUMMARY_PRODUCT
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     productList, summaryProductList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsProductStatusDto implements Serializable {

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
    /** (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} */
    @JsonKey
    protected String _productStatusCode;

    /** (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _productStatusName;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _displayOrder;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductStatusDto() {
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br>
     * status for product
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setProductStatusCodeAsProductStatus(HangarCDef.ProductStatus cdef) {
        setProductStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br>
     * status for product
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.ProductStatus getProductStatusCodeAsProductStatus() {
        return HangarCDef.ProductStatus.codeOf(getProductStatusCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of productStatusCode as 生産販売可能. <br>
     * 生産販売可能
     */
    public void setProductStatusCode_生産販売可能() {
        setProductStatusCodeAsProductStatus(HangarCDef.ProductStatus.生産販売可能);
    }

    /**
     * Set the value of productStatusCode as 生産中止. <br>
     * 生産中止
     */
    public void setProductStatusCode_生産中止() {
        setProductStatusCodeAsProductStatus(HangarCDef.ProductStatus.生産中止);
    }

    /**
     * Set the value of productStatusCode as 販売中止. <br>
     * 販売中止
     */
    public void setProductStatusCode_販売中止() {
        setProductStatusCodeAsProductStatus(HangarCDef.ProductStatus.販売中止);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode '生産販売可能'? <br>
     * 生産販売可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCode生産販売可能() {
        HangarCDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(HangarCDef.ProductStatus.生産販売可能) : false;
    }

    /**
     * Is the value of productStatusCode '生産中止'? <br>
     * 生産中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCode生産中止() {
        HangarCDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(HangarCDef.ProductStatus.生産中止) : false;
    }

    /**
     * Is the value of productStatusCode '販売中止'? <br>
     * 販売中止
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isProductStatusCode販売中止() {
        HangarCDef.ProductStatus cdef = getProductStatusCodeAsProductStatus();
        return cdef != null ? cdef.equals(HangarCDef.ProductStatus.販売中止) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<ProductDto> _productList;

    public List<ProductDto> getProductList() {
        if (_productList == null) { _productList = new ArrayList<ProductDto>(); }
        return _productList;
    }

    public void setProductList(List<ProductDto> productList) {
        this._productList = productList;
    }

    protected List<SummaryProductDto> _summaryProductList;

    public List<SummaryProductDto> getSummaryProductList() {
        if (_summaryProductList == null) { _summaryProductList = new ArrayList<SummaryProductDto>(); }
        return _summaryProductList;
    }

    public void setSummaryProductList(List<SummaryProductDto> summaryProductList) {
        this._summaryProductList = summaryProductList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsProductStatusDto)) { return false; }
        final BsProductStatusDto otherEntity = (BsProductStatusDto)other;
        if (!helpComparingValue(getProductStatusCode(), otherEntity.getProductStatusCode())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "PRODUCT_STATUS");
        result = xCH(result, getProductStatusCode());
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
        sb.append(c).append(getProductStatusCode());
        sb.append(c).append(getProductStatusName());
        sb.append(c).append(getDisplayOrder());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br>
     * 商品ステータスを識別するコード。
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * [set] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br>
     * 商品ステータスを識別するコード。
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.add("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /**
     * [get] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * 表示用の名称、英語名カラムがないのでそのままメソッド名の一部としても利用される。
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (NullAllowed)
     */
    public String getProductStatusName() {
        return _productStatusName;
    }

    /**
     * [set] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * 表示用の名称、英語名カラムがないのでそのままメソッド名の一部としても利用される。
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (NullAllowed)
     */
    public void setProductStatusName(String productStatusName) {
        __modifiedProperties.add("productStatusName");
        this._productStatusName = productStatusName;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br>
     * もう、ご想像の通りです。
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br>
     * もう、ご想像の通りです。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.add("displayOrder");
        this._displayOrder = displayOrder;
    }

}
