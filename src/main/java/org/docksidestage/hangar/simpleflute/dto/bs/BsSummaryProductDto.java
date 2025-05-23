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

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.docksidestage.hangar.simpleflute.HangarCDef;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of SUMMARY_PRODUCT as VIEW. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID, PRODUCT_NAME
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 *     PRODUCT_STATUS
 *
 * [referrer-table]
 *     PURCHASE
 *
 * [foreign-property]
 *     productStatus
 *
 * [referrer-property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSummaryProductDto implements Serializable {

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
    /** PRODUCT_ID: {PK, INTEGER(10)} */
    @JsonKey
    protected Integer _productId;

    /** PRODUCT_NAME: {PK, VARCHAR(50)} */
    @JsonKey
    protected String _productName;

    /** PRODUCT_HANDLE_CODE: {VARCHAR(100)} */
    @JsonKey
    protected String _productHandleCode;

    /** PRODUCT_STATUS_CODE: {CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} */
    @JsonKey
    protected String _productStatusCode;

    /** LATEST_PURCHASE_DATETIME: {TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _latestPurchaseDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryProductDto() {
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
    protected ProductStatusDto _productStatus;

    public ProductStatusDto getProductStatus() {
        return _productStatus;
    }

    public void setProductStatus(ProductStatusDto productStatus) {
        this._productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<PurchaseDto> _purchaseList;

    public List<PurchaseDto> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = new ArrayList<PurchaseDto>(); }
        return _purchaseList;
    }

    public void setPurchaseList(List<PurchaseDto> purchaseList) {
        this._purchaseList = purchaseList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSummaryProductDto)) { return false; }
        final BsSummaryProductDto otherEntity = (BsSummaryProductDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getProductName(), otherEntity.getProductName())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SUMMARY_PRODUCT");
        result = xCH(result, getProductId());
        result = xCH(result, getProductName());
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
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductName());
        sb.append(c).append(getProductHandleCode());
        sb.append(c).append(getProductStatusCode());
        sb.append(c).append(getLatestPurchaseDatetime());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, INTEGER(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, INTEGER(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {PK, VARCHAR(50)} <br>
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed)
     */
    public String getProductName() {
        return _productName;
    }

    /**
     * [set] PRODUCT_NAME: {PK, VARCHAR(50)} <br>
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed)
     */
    public void setProductName(String productName) {
        __modifiedProperties.add("productName");
        this._productName = productName;
    }

    /**
     * [get] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br>
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed)
     */
    public String getProductHandleCode() {
        return _productHandleCode;
    }

    /**
     * [set] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br>
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed)
     */
    public void setProductHandleCode(String productHandleCode) {
        __modifiedProperties.add("productHandleCode");
        this._productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.add("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getLatestPurchaseDatetime() {
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed)
     */
    public void setLatestPurchaseDatetime(java.time.LocalDateTime latestPurchaseDatetime) {
        __modifiedProperties.add("latestPurchaseDatetime");
        this._latestPurchaseDatetime = latestPurchaseDatetime;
    }

}
