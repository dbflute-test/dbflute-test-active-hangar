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
package org.docksidestage.hangar.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of MemberMonthlyPurchase. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PURCHASE_MONTH, PURCHASE_PRICE_AVG, PURCHASE_PRICE_MAX, SERVICE_POINT_COUNT
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
public abstract class BsMemberMonthlyPurchaseDto implements Serializable {

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
    /** (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    @JsonKey
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    @JsonKey
    protected String _memberName;

    /** PURCHASE_MONTH: {DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _purchaseMonth;

    /** PURCHASE_PRICE_AVG: {INTEGER(10)} */
    @JsonKey
    protected Integer _purchasePriceAvg;

    /** PURCHASE_PRICE_MAX: {INTEGER(10)} */
    @JsonKey
    protected Integer _purchasePriceMax;

    /** (サービスポイント数)SERVICE_POINT_COUNT: {INTEGER(10), refers to MEMBER_SERVICE.SERVICE_POINT_COUNT} */
    @JsonKey
    protected Integer _servicePointCount;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberMonthlyPurchaseDto() {
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
        if (other == null || !(other instanceof BsMemberMonthlyPurchaseDto)) { return false; }
        final BsMemberMonthlyPurchaseDto otherEntity = (BsMemberMonthlyPurchaseDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!helpComparingValue(getMemberName(), otherEntity.getMemberName())) { return false; }
        if (!helpComparingValue(getPurchaseMonth(), otherEntity.getPurchaseMonth())) { return false; }
        if (!helpComparingValue(getPurchasePriceAvg(), otherEntity.getPurchasePriceAvg())) { return false; }
        if (!helpComparingValue(getPurchasePriceMax(), otherEntity.getPurchasePriceMax())) { return false; }
        if (!helpComparingValue(getServicePointCount(), otherEntity.getServicePointCount())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MemberMonthlyPurchase");
        result = xCH(result, getMemberId());
        result = xCH(result, getMemberName());
        result = xCH(result, getPurchaseMonth());
        result = xCH(result, getPurchasePriceAvg());
        result = xCH(result, getPurchasePriceMax());
        result = xCH(result, getServicePointCount());
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
        sb.append(c).append(getMemberId());
        sb.append(c).append(getMemberName());
        sb.append(c).append(getPurchaseMonth());
        sb.append(c).append(getPurchasePriceAvg());
        sb.append(c).append(getPurchasePriceMax());
        sb.append(c).append(getServicePointCount());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。<br>
     * // grouping item
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。<br>
     * // grouping item
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。<br>
     * // non grouping item (1:1 data) is allowed on H2 database
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。<br>
     * // non grouping item (1:1 data) is allowed on H2 database
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.add("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] PURCHASE_MONTH: {DATE(10)} <br>
     * // grouping item, depends on DBMS
     * @return The value of the column 'PURCHASE_MONTH'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getPurchaseMonth() {
        return _purchaseMonth;
    }

    /**
     * [set] PURCHASE_MONTH: {DATE(10)} <br>
     * // grouping item, depends on DBMS
     * @param purchaseMonth The value of the column 'PURCHASE_MONTH'. (NullAllowed)
     */
    public void setPurchaseMonth(java.time.LocalDate purchaseMonth) {
        __modifiedProperties.add("purchaseMonth");
        this._purchaseMonth = purchaseMonth;
    }

    /**
     * [get] PURCHASE_PRICE_AVG: {INTEGER(10)} <br>
     * // aggregation item
     * @return The value of the column 'PURCHASE_PRICE_AVG'. (NullAllowed)
     */
    public Integer getPurchasePriceAvg() {
        return _purchasePriceAvg;
    }

    /**
     * [set] PURCHASE_PRICE_AVG: {INTEGER(10)} <br>
     * // aggregation item
     * @param purchasePriceAvg The value of the column 'PURCHASE_PRICE_AVG'. (NullAllowed)
     */
    public void setPurchasePriceAvg(Integer purchasePriceAvg) {
        __modifiedProperties.add("purchasePriceAvg");
        this._purchasePriceAvg = purchasePriceAvg;
    }

    /**
     * [get] PURCHASE_PRICE_MAX: {INTEGER(10)} <br>
     * // me too
     * @return The value of the column 'PURCHASE_PRICE_MAX'. (NullAllowed)
     */
    public Integer getPurchasePriceMax() {
        return _purchasePriceMax;
    }

    /**
     * [set] PURCHASE_PRICE_MAX: {INTEGER(10)} <br>
     * // me too
     * @param purchasePriceMax The value of the column 'PURCHASE_PRICE_MAX'. (NullAllowed)
     */
    public void setPurchasePriceMax(Integer purchasePriceMax) {
        __modifiedProperties.add("purchasePriceMax");
        this._purchasePriceMax = purchasePriceMax;
    }

    /**
     * [get] (サービスポイント数)SERVICE_POINT_COUNT: {INTEGER(10), refers to MEMBER_SERVICE.SERVICE_POINT_COUNT} <br>
     * 購入したら増えて使ったら減る。<br>
     * // non grouping item (relationship 1:1 data) is allowed on H2 database
     * @return The value of the column 'SERVICE_POINT_COUNT'. (NullAllowed)
     */
    public Integer getServicePointCount() {
        return _servicePointCount;
    }

    /**
     * [set] (サービスポイント数)SERVICE_POINT_COUNT: {INTEGER(10), refers to MEMBER_SERVICE.SERVICE_POINT_COUNT} <br>
     * 購入したら増えて使ったら減る。<br>
     * // non grouping item (relationship 1:1 data) is allowed on H2 database
     * @param servicePointCount The value of the column 'SERVICE_POINT_COUNT'. (NullAllowed)
     */
    public void setServicePointCount(Integer servicePointCount) {
        __modifiedProperties.add("servicePointCount");
        this._servicePointCount = servicePointCount;
    }

}
