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
package org.docksidestage.hangar.dbflute.resola.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaDBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.resola.exentity.*;

/**
 * The entity of PURCHASE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class ResolaBsPurchase extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _purchaseId;

    /** MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    protected Integer _memberId;

    /** PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10)} */
    protected Integer _productId;

    /** PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _purchaseDatetime;

    /** PURCHASE_COUNT: {NotNull, INTEGER(10)} */
    protected Integer _purchaseCount;

    /** PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} */
    protected Integer _purchasePrice;

    /** PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10)} */
    protected Integer _paymentCompleteFlg;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ResolaDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchaseId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId : UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param productId : +UQ, IX+, NotNull, INTEGER(10). (NotNull)
     * @param purchaseDatetime : +UQ, IX+, NotNull, TIMESTAMP(26, 6). (NotNull)
     */
    public void uniqueBy(Integer memberId, Integer productId, java.time.LocalDateTime purchaseDatetime) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("purchaseDatetime");
        setMemberId(memberId);setProductId(productId);setPurchaseDatetime(purchaseDatetime);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<ResolaMember> _member;

    /**
     * [get] MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ResolaMember> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<ResolaMember> member) {
        _member = member;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof ResolaBsPurchase) {
            ResolaBsPurchase other = (ResolaBsPurchase)obj;
            if (!xSV(_purchaseId, other._purchaseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _purchaseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_purchaseDatetime));
        sb.append(dm).append(xfND(_purchaseCount));
        sb.append(dm).append(xfND(_purchasePrice));
        sb.append(dm).append(xfND(_paymentCompleteFlg));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ResolaPurchase clone() {
        return (ResolaPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPurchaseDatetime() {
        checkSpecifiedProperty("purchaseDatetime");
        return _purchaseDatetime;
    }

    /**
     * [set] PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(26, 6)} <br>
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseDatetime(java.time.LocalDateTime purchaseDatetime) {
        registerModifiedProperty("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] PURCHASE_COUNT: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchaseCount() {
        checkSpecifiedProperty("purchaseCount");
        return _purchaseCount;
    }

    /**
     * [set] PURCHASE_COUNT: {NotNull, INTEGER(10)} <br>
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseCount(Integer purchaseCount) {
        registerModifiedProperty("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPurchasePrice() {
        checkSpecifiedProperty("purchasePrice");
        return _purchasePrice;
    }

    /**
     * [set] PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br>
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePrice(Integer purchasePrice) {
        registerModifiedProperty("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPaymentCompleteFlg() {
        checkSpecifiedProperty("paymentCompleteFlg");
        return _paymentCompleteFlg;
    }

    /**
     * [set] PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10)} <br>
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentCompleteFlg(Integer paymentCompleteFlg) {
        registerModifiedProperty("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
