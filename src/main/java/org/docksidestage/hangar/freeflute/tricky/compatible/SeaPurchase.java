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
package org.docksidestage.hangar.freeflute.tricky.compatible;

import java.io.Serializable;

/**
 * purchase table
 * @author FreeGen
 */
public class SeaPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_ID: ${column.comment} */
    protected Integer purchaseId;

    /** MEMBER_ID: ${column.comment} */
    protected Integer memberId;

    /** PURCHASE_DATETIME: ${column.comment} */
    protected java.time.LocalDateTime purchaseDatetime;

    /** PURCHASE_PRICE: ${column.comment} */
    protected Integer purchasePrice;

    /** SEA_MEMBER: ${column.comment} */
    protected SeaMember seaMember;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer value) {
        purchaseId = value;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public java.time.LocalDateTime getPurchaseDatetime() {
        return purchaseDatetime;
    }

    public void setPurchaseDatetime(java.time.LocalDateTime value) {
        purchaseDatetime = value;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer value) {
        purchasePrice = value;
    }

    public SeaMember getSeaMember() {
        return seaMember;
    }

    public void setSeaMember(SeaMember value) {
        seaMember = value;
    }

}
