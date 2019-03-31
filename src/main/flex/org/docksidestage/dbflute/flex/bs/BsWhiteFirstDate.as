package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_FIRST_DATE as TABLE.
 * <pre>
 * [primary-key]
 *     FIRST_DATE_ID
 *
 * [column]
 *     FIRST_DATE_ID, FIRST_DATE_NAME, ADDED_AT_TABLE_SAME_DATE
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
public class BsWhiteFirstDate {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _firstDateId:Number;

    private var _firstDateName:String;

    private var _addedAtTableSameDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get firstDateId():Number {
        return _firstDateId;
    }

    public function set firstDateId(firstDateId:Number):void {
        this._firstDateId = firstDateId;
    }

    public function get firstDateName():String {
        return _firstDateName;
    }

    public function set firstDateName(firstDateName:String):void {
        this._firstDateName = firstDateName;
    }

    public function get addedAtTableSameDate():Date {
        return _addedAtTableSameDate;
    }

    public function set addedAtTableSameDate(addedAtTableSameDate:Date):void {
        this._addedAtTableSameDate = addedAtTableSameDate;
    }

}

}
