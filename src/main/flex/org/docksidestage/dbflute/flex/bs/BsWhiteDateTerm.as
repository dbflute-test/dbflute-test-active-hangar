package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_DATE_TERM as TABLE.
 * <pre>
 * [primary-key]
 *     DATE_TERM_ID
 *
 * [column]
 *     DATE_TERM_ID, DATE_TERM_VALUE, BEGIN_DATE, END_DATE
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
public class BsWhiteDateTerm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dateTermId:Number;

    private var _dateTermValue:String;

    private var _beginDate:Date;

    private var _endDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get dateTermId():Number {
        return _dateTermId;
    }

    public function set dateTermId(dateTermId:Number):void {
        this._dateTermId = dateTermId;
    }

    public function get dateTermValue():String {
        return _dateTermValue;
    }

    public function set dateTermValue(dateTermValue:String):void {
        this._dateTermValue = dateTermValue;
    }

    public function get beginDate():Date {
        return _beginDate;
    }

    public function set beginDate(beginDate:Date):void {
        this._beginDate = beginDate;
    }

    public function get endDate():Date {
        return _endDate;
    }

    public function set endDate(endDate:Date):void {
        this._endDate = endDate;
    }

}

}
