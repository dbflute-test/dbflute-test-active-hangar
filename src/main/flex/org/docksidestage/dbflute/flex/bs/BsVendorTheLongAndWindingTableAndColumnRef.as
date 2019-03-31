package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE.
 * <pre>
 * [primary-key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE, SHORT_DATE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     vendorTheLongAndWindingTableAndColumn
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorTheLongAndWindingTableAndColumnRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _theLongAndWindingTableAndColumnRefId:Number;

    private var _theLongAndWindingTableAndColumnId:Number;

    private var _theLongAndWindingTableAndColumnRefDate:Date;

    private var _shortDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _vendorTheLongAndWindingTableAndColumn:VendorTheLongAndWindingTableAndColumnDto;

    public function get vendorTheLongAndWindingTableAndColumn():VendorTheLongAndWindingTableAndColumnDto {
        return _vendorTheLongAndWindingTableAndColumn;
    }

    public function set vendorTheLongAndWindingTableAndColumn(vendorTheLongAndWindingTableAndColumn:VendorTheLongAndWindingTableAndColumnDto):void {
        this._vendorTheLongAndWindingTableAndColumn = vendorTheLongAndWindingTableAndColumn;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get theLongAndWindingTableAndColumnRefId():Number {
        return _theLongAndWindingTableAndColumnRefId;
    }

    public function set theLongAndWindingTableAndColumnRefId(theLongAndWindingTableAndColumnRefId:Number):void {
        this._theLongAndWindingTableAndColumnRefId = theLongAndWindingTableAndColumnRefId;
    }

    public function get theLongAndWindingTableAndColumnId():Number {
        return _theLongAndWindingTableAndColumnId;
    }

    public function set theLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId:Number):void {
        this._theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    public function get theLongAndWindingTableAndColumnRefDate():Date {
        return _theLongAndWindingTableAndColumnRefDate;
    }

    public function set theLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate:Date):void {
        this._theLongAndWindingTableAndColumnRefDate = theLongAndWindingTableAndColumnRefDate;
    }

    public function get shortDate():Date {
        return _shortDate;
    }

    public function set shortDate(shortDate:Date):void {
        this._shortDate = shortDate;
    }

}

}
