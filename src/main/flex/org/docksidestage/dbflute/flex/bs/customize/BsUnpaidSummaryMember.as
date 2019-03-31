package org.docksidestage.dbflute.flex.bs.customize {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.customize.*;

/**
 * The flex DTO of UnpaidSummaryMember.
 * <pre>
 * [primary-key]
 *     UNPAID_MAN_ID
 *
 * [column]
 *     UNPAID_MAN_ID, UNPAID_MAN_NAME, UNPAID_PRICE_SUMMARY, STATUS_NAME
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
public class BsUnpaidSummaryMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _unpaidManId:int;

    private var _unpaidManName:String;

    private var _unpaidPriceSummary:Number;

    private var _statusName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get unpaidManId():int {
        return _unpaidManId;
    }

    public function set unpaidManId(unpaidManId:int):void {
        this._unpaidManId = unpaidManId;
    }

    public function get unpaidManName():String {
        return _unpaidManName;
    }

    public function set unpaidManName(unpaidManName:String):void {
        this._unpaidManName = unpaidManName;
    }

    public function get unpaidPriceSummary():Number {
        return _unpaidPriceSummary;
    }

    public function set unpaidPriceSummary(unpaidPriceSummary:Number):void {
        this._unpaidPriceSummary = unpaidPriceSummary;
    }

    public function get statusName():String {
        return _statusName;
    }

    public function set statusName(statusName:String):void {
        this._statusName = statusName;
    }

}

}
