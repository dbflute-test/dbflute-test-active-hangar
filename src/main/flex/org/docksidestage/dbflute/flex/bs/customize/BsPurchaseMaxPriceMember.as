package org.docksidestage.dbflute.flex.bs.customize {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.customize.*;

/**
 * The flex DTO of PurchaseMaxPriceMember.
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PURCHASE_MAX_PRICE, MEMBER_STATUS_NAME
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
public class BsPurchaseMaxPriceMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberId:int;

    private var _memberName:String;

    private var _purchaseMaxPrice:int;

    private var _memberStatusName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get memberId():int {
        return _memberId;
    }

    public function set memberId(memberId:int):void {
        this._memberId = memberId;
    }

    public function get memberName():String {
        return _memberName;
    }

    public function set memberName(memberName:String):void {
        this._memberName = memberName;
    }

    public function get purchaseMaxPrice():int {
        return _purchaseMaxPrice;
    }

    public function set purchaseMaxPrice(purchaseMaxPrice:int):void {
        this._purchaseMaxPrice = purchaseMaxPrice;
    }

    public function get memberStatusName():String {
        return _memberStatusName;
    }

    public function set memberStatusName(memberStatusName:String):void {
        this._memberStatusName = memberStatusName;
    }

}

}
