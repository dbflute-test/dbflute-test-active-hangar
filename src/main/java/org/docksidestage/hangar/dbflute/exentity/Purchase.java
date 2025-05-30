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

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.bsentity.BsPurchase;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.PurchaseDbm;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedPurchase;

/**
 * The entity of PURCHASE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class Purchase extends BsPurchase implements UnifiedPurchase {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                            for test: Classification
    //                                                            ========================
    public void xznocheckSetPaymentCompleteFlg(Integer flg) {
        registerModifiedProperty(PurchaseDbm.getInstance().columnPaymentCompleteFlg().getPropertyName());
        _paymentCompleteFlg = flg;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                  Unified Relationship
    //                                  --------------------
    @Override
    public OptionalEntity<? extends UnifiedMember> getUnifiedMember() {
        return getMember();
    }
}
