package org.docksidestage.hangar.dbflute.cbean;

import org.docksidestage.hangar.dbflute.cbean.MemberCB.OrOrParadeTemplate;
import org.docksidestage.hangar.dbflute.cbean.bs.BsPurchaseCB;
import org.docksidestage.hangar.dbflute.nogen.OrScopeable;

/**
 * The condition-bean of PURCHASE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class PurchaseCB extends BsPurchaseCB implements OrScopeable<PurchaseCB> {
    
    public void arrangeOrOrParade() {
        new OrOrParadeTemplate<>(this, cb -> cb.query().queryMember()).arrange();
    }
}
