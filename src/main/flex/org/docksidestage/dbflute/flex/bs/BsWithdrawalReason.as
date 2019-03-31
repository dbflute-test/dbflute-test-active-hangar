package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of (退会理由)WITHDRAWAL_REASON as TABLE.
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _withdrawalReasonCode:String;

    private var _withdrawalReasonText:String;

    private var _displayOrder:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    MemberWithdrawalDto;
    protected var _memberWithdrawalList:ArrayCollection; /* of the entity 'MemberWithdrawalDto'. */

    public function get memberWithdrawalList():ArrayCollection {
        if (_memberWithdrawalList == null) { _memberWithdrawalList = new ArrayCollection(); }
        return _memberWithdrawalList;
    }

    public function set memberWithdrawalList(memberWithdrawalList:ArrayCollection):void {
        this._memberWithdrawalList = memberWithdrawalList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get withdrawalReasonCode():String {
        return _withdrawalReasonCode;
    }

    public function set withdrawalReasonCode(withdrawalReasonCode:String):void {
        this._withdrawalReasonCode = withdrawalReasonCode;
    }

    public function get withdrawalReasonText():String {
        return _withdrawalReasonText;
    }

    public function set withdrawalReasonText(withdrawalReasonText:String):void {
        this._withdrawalReasonText = withdrawalReasonText;
    }

    public function get displayOrder():int {
        return _displayOrder;
    }

    public function set displayOrder(displayOrder:int):void {
        this._displayOrder = displayOrder;
    }

}

}
