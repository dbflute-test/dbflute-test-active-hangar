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
 * The simple DTO of (眠い商品)PRODUCT as TABLE. <br>
 * 商品:
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     SEQ_MEMBER_LOGIN
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 *
 * [referrer-table]
 *     PURCHASE, WHITE_DEPRECATED_REF
 *
 * [foreign-property]
 *     productCategory, productStatus
 *
 * [referrer-property]
 *     purchaseList, whiteDeprecatedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsProductDto implements Serializable {

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
    /** PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _productId;

    /** (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _productName;

    /** (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _productHandleCode;

    /** (眠い商品カテゴリーコードどん)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} */
    @JsonKey
    protected String _productCategoryCode;

    /** PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} */
    @JsonKey
    protected String _productStatusCode;

    /** (眠い定価)REGULAR_PRICE: {NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _regularPrice;

    /** (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductDto() {
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
    protected ProductCategoryDto _productCategory;

    public ProductCategoryDto getProductCategory() {
        return _productCategory;
    }

    public void setProductCategory(ProductCategoryDto productCategory) {
        this._productCategory = productCategory;
    }

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
        if (other == null || !(other instanceof BsProductDto)) { return false; }
        final BsProductDto otherEntity = (BsProductDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "PRODUCT");
        result = xCH(result, getProductId());
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
        sb.append(c).append(getProductCategoryCode());
        sb.append(c).append(getProductStatusCode());
        sb.append(c).append(getRegularPrice());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        sb.append(c).append(getVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Integer productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br>
     * ExampleDBとして、コメントの少ないケースを表現するため、あえてコメントを控えている。<br>
     * 実業務ではしっかりとコメントを入れることが強く強く推奨される。「よりによってこのテーブルでやらないでよ！」あわわ、何も聞こえません〜
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed)
     */
    public String getProductName() {
        return _productName;
    }

    /**
     * [set] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br>
     * ExampleDBとして、コメントの少ないケースを表現するため、あえてコメントを控えている。<br>
     * 実業務ではしっかりとコメントを入れることが強く強く推奨される。「よりによってこのテーブルでやらないでよ！」あわわ、何も聞こえません〜
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed)
     */
    public void setProductName(String productName) {
        __modifiedProperties.add("productName");
        this._productName = productName;
    }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br>
     * これだけは書いておこう、商品を識別する業務上のコード。よく品番とか言うかもしれませんねぇ...
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed)
     */
    public String getProductHandleCode() {
        return _productHandleCode;
    }

    /**
     * [set] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br>
     * これだけは書いておこう、商品を識別する業務上のコード。よく品番とか言うかもしれませんねぇ...
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed)
     */
    public void setProductHandleCode(String productHandleCode) {
        __modifiedProperties.add("productHandleCode");
        this._productHandleCode = productHandleCode;
    }

    /**
     * [get] (眠い商品カテゴリーコードどん)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br>
     * 眠いのも悪くない。
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (NullAllowed)
     */
    public String getProductCategoryCode() {
        return _productCategoryCode;
    }

    /**
     * [set] (眠い商品カテゴリーコードどん)PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br>
     * 眠いのも悪くない。
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (NullAllowed)
     */
    public void setProductCategoryCode(String productCategoryCode) {
        __modifiedProperties.add("productCategoryCode");
        this._productCategoryCode = productCategoryCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br>
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.add("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /**
     * [get] (眠い定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br>
     * 眠いよぅ眠いよぅ。ようよう。<br>
     * 定価:かかか
     * @return The value of the column 'REGULAR_PRICE'. (NullAllowed)
     */
    public Integer getRegularPrice() {
        return _regularPrice;
    }

    /**
     * [set] (眠い定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br>
     * 眠いよぅ眠いよぅ。ようよう。<br>
     * 定価:かかか
     * @param regularPrice The value of the column 'REGULAR_PRICE'. (NullAllowed)
     */
    public void setRegularPrice(Integer regularPrice) {
        __modifiedProperties.add("regularPrice");
        this._regularPrice = regularPrice;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * ALL設定を上書きしてみる
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * ALL設定を上書きしてみる
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        __modifiedProperties.add("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.add("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

}
