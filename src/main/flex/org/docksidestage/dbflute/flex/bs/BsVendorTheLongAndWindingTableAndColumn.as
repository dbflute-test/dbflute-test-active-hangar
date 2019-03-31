package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE.
 * <pre>
 * [primary-key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorTheLongAndWindingTableAndColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _theLongAndWindingTableAndColumnId:Number;

    private var _theLongAndWindingTableAndColumnName:String;

    private var _shortName:String;

    private var _shortSize:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    VendorTheLongAndWindingTableAndColumnRefDto;
    protected var _vendorTheLongAndWindingTableAndColumnRefList:ArrayCollection; /* of the entity 'VendorTheLongAndWindingTableAndColumnRefDto'. */

    public function get vendorTheLongAndWindingTableAndColumnRefList():ArrayCollection {
        if (_vendorTheLongAndWindingTableAndColumnRefList == null) { _vendorTheLongAndWindingTableAndColumnRefList = new ArrayCollection(); }
        return _vendorTheLongAndWindingTableAndColumnRefList;
    }

    public function set vendorTheLongAndWindingTableAndColumnRefList(vendorTheLongAndWindingTableAndColumnRefList:ArrayCollection):void {
        this._vendorTheLongAndWindingTableAndColumnRefList = vendorTheLongAndWindingTableAndColumnRefList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get theLongAndWindingTableAndColumnId():Number {
        return _theLongAndWindingTableAndColumnId;
    }

    public function set theLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId:Number):void {
        this._theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    public function get theLongAndWindingTableAndColumnName():String {
        return _theLongAndWindingTableAndColumnName;
    }

    public function set theLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName:String):void {
        this._theLongAndWindingTableAndColumnName = theLongAndWindingTableAndColumnName;
    }

    public function get shortName():String {
        return _shortName;
    }

    public function set shortName(shortName:String):void {
        this._shortName = shortName;
    }

    public function get shortSize():int {
        return _shortSize;
    }

    public function set shortSize(shortSize:int):void {
        this._shortSize = shortSize;
    }

}

}
