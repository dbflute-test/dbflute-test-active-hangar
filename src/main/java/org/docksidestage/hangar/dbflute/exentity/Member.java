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
package org.docksidestage.hangar.dbflute.exentity;

import java.time.LocalDateTime;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMemberSecurity;

/**
 * The entity of MEMBER.
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Member extends org.docksidestage.hangar.dbflute.bsentity.BsMember implements UnifiedMember {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String ALIAS_latestLoginDatetime = "latestLoginDatetime";
    public static final String ALIAS_loginCount = "loginCount";
    public static final String ALIAS_productKindCount = "productKindCount";

    /** HIGHEST_PURCHASE_PRICE: Derived Referrer Alias. */
    public static final String ALIAS_highestPurchasePrice = "HIGHEST_PURCHASE_PRICE";

    /** PROP_TOTAL_PAYMENT_AMOUNT: Derived Referrer Alias. */
    public static final String ALIAS_totalPaymentAmount = "PROP_TOTAL_PAYMENT_AMOUNT";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 導出カラム「最終ログイン日時」のためのプロパティ。これは手動で作成する。 */
    protected LocalDateTime _latestLoginDatetime;

    /** 導出カラム「ログイン回数」のためのプロパティ。これは手動で作成する。 */
    protected Integer _loginCount;

    /** 導出カラム「プロダクト種類数」のためのプロパティ。これは手動で作成する。 */
    protected Integer _productKindCount;

    /** HIGHEST_PURCHASE_PRICE: (Derived Referrer) */
    protected Integer _highestPurchasePrice;

    /** PROP_TOTAL_PAYMENT_AMOUNT: (Derived Referrer) */
    protected Integer _propTotalPaymentAmount;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LocalDateTime getLatestLoginDatetime() {
        return _latestLoginDatetime;
    }

    public void setLatestLoginDatetime(LocalDateTime latestLoginDatetime) {
        _latestLoginDatetime = latestLoginDatetime;
    }

    public Integer getLoginCount() {
        return _loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this._loginCount = loginCount;
    }

    public Integer getProductKindCount() {
        return _productKindCount;
    }

    public void setProductKindCount(Integer productKindCount) {
        this._productKindCount = productKindCount;
    }

    /**
     * [get] HIGHEST_PURCHASE_PRICE: (Derived Referrer)
     * @return The value of the column 'HIGHEST_PURCHASE_PRICE'. (NullAllowed)
     */
    public Integer getHighestPurchasePrice() {
        return _highestPurchasePrice;
    }

    /**
     * [set] HIGHEST_PURCHASE_PRICE: (Derived Referrer)
     * @param highestPurchasePrice The value of the column 'HIGHEST_PURCHASE_PRICE'. (NullAllowed)
     */
    public void setHighestPurchasePrice(Integer highestPurchasePrice) {
        _highestPurchasePrice = highestPurchasePrice;
    }

    /**
     * [get] PROP_TOTAL_PAYMENT_AMOUNT: (Derived Referrer)
     * @return The value of the column 'PROP_TOTAL_PAYMENT_AMOUNT'. (NullAllowed)
     */
    public Integer getPropTotalPaymentAmount() {
        return _propTotalPaymentAmount;
    }

    /**
     * [set] PROP_TOTAL_PAYMENT_AMOUNT: (Derived Referrer)
     * @param propTotalPaymentAmount The value of the column 'PROP_TOTAL_PAYMENT_AMOUNT'. (NullAllowed)
     */
    public void setPropTotalPaymentAmount(Integer propTotalPaymentAmount) {
        _propTotalPaymentAmount = propTotalPaymentAmount;
    }

    // -----------------------------------------------------
    //                                  Unified Relationship
    //                                  --------------------
    @Override
    public OptionalEntity<? extends UnifiedMemberSecurity> getUnifiedMemberSecurityAsOne() {
        return getMemberSecurityAsOne();
    }
}
