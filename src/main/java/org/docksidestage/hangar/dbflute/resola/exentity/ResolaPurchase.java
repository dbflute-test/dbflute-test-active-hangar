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
package org.docksidestage.hangar.dbflute.resola.exentity;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exentity.MemberLogin;
import org.docksidestage.hangar.dbflute.exentity.Product;
import org.docksidestage.hangar.dbflute.exentity.PurchasePayment;
import org.docksidestage.hangar.dbflute.exentity.SummaryProduct;
import org.docksidestage.hangar.dbflute.exentity.WhiteDateTerm;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedPurchase;
import org.docksidestage.hangar.dbflute.resola.bsentity.ResolaBsPurchase;

/**
 * The entity of PURCHASE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class ResolaPurchase extends ResolaBsPurchase implements UnifiedPurchase {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                   Broken Relationship
    //                                   -------------------
    // foreign relationship
    protected OptionalEntity<WhiteDateTerm> _whiteDateTermAsValid = OptionalEntity.empty();
    protected OptionalEntity<MemberLogin> _memberLoginAsBizManyToOne = OptionalEntity.empty();
    protected OptionalEntity<Product> _product = OptionalEntity.empty();
    protected OptionalEntity<SummaryProduct> _summaryProduct = OptionalEntity.empty();

    // referrer relationship
    protected List<PurchasePayment> _purchasePaymentList = new ArrayList<>();

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                Unified Classification
    //                                ----------------------
    @Override
    public CDef.Flg getPaymentCompleteFlgAsFlg() {
        return CDef.Flg.of(getPaymentCompleteFlg()).orElseThrow();
    }

    // -----------------------------------------------------
    //                                   Broken Relationship
    //                                   -------------------
    // _/_/_/_/_/_/_/_/_/_/_/_/
    //  foreign relationship
    // _/_/_/_/
    @Override
    public OptionalEntity<WhiteDateTerm> getWhiteDateTermAsValid() {
        return _whiteDateTermAsValid;
    }

    public void setWhiteDateTermAsValid(OptionalEntity<WhiteDateTerm> whiteDateTermAsValid) {
        _whiteDateTermAsValid = whiteDateTermAsValid;
    }

    @Override
    public OptionalEntity<MemberLogin> getMemberLoginAsBizManyToOne() {
        return _memberLoginAsBizManyToOne;
    }

    public void setMemberLoginAsBizManyToOne(OptionalEntity<MemberLogin> memberLoginAsBizManyToOne) {
        _memberLoginAsBizManyToOne = memberLoginAsBizManyToOne;
    }

    @Override
    public OptionalEntity<Product> getProduct() {
        return _product;
    }

    public void setProduct(OptionalEntity<Product> product) {
        _product = product;
    }

    @Override
    public OptionalEntity<SummaryProduct> getSummaryProduct() {
        return _summaryProduct;
    }

    public void setSummaryProduct(OptionalEntity<SummaryProduct> summaryProduct) {
        _summaryProduct = summaryProduct;
    }

    // _/_/_/_/_/_/_/_/_/_/_/_/
    //  referrer relationship
    // _/_/_/_/
    @Override
    public List<PurchasePayment> getPurchasePaymentList() {
        return _purchasePaymentList;
    }

    public void setPurchasePaymentList(List<PurchasePayment> purchasePaymentList) {
        _purchasePaymentList = purchasePaymentList;
    }

    // -----------------------------------------------------
    //                                  Unified Relationship
    //                                  --------------------
    @Override
    public OptionalEntity<? extends UnifiedMember> getUnifiedMember() {
        return getMember();
    }
}
