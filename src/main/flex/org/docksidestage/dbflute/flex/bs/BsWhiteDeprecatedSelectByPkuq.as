package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_DEPRECATED_SELECT_BY_PKUQ as TABLE.
 * <pre>
 * [primary-key]
 *     SELECT_BY_PKUQ_ID
 *
 * [column]
 *     SELECT_BY_PKUQ_ID, SELECT_BY_PKUQ_NAME, SELECT_BY_PKUQ_CODE
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
public class BsWhiteDeprecatedSelectByPkuq {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _selectByPkuqId:Number;

    private var _selectByPkuqName:String;

    private var _selectByPkuqCode:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get selectByPkuqId():Number {
        return _selectByPkuqId;
    }

    public function set selectByPkuqId(selectByPkuqId:Number):void {
        this._selectByPkuqId = selectByPkuqId;
    }

    public function get selectByPkuqName():String {
        return _selectByPkuqName;
    }

    public function set selectByPkuqName(selectByPkuqName:String):void {
        this._selectByPkuqName = selectByPkuqName;
    }

    public function get selectByPkuqCode():String {
        return _selectByPkuqCode;
    }

    public function set selectByPkuqCode(selectByPkuqCode:String):void {
        this._selectByPkuqCode = selectByPkuqCode;
    }

}

}
