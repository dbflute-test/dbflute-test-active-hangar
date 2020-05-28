package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_READ_ONLY as TABLE.
 * <pre>
 * [primary-key]
 *     READ_ONLY_ID
 *
 * [column]
 *     READ_ONLY_ID, READ_ONLY_NAME
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
public class BsWhiteReadOnly {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _readOnlyId:Number;

    private var _readOnlyName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get readOnlyId():Number {
        return _readOnlyId;
    }

    public function set readOnlyId(readOnlyId:Number):void {
        this._readOnlyId = readOnlyId;
    }

    public function get readOnlyName():String {
        return _readOnlyName;
    }

    public function set readOnlyName(readOnlyName:String):void {
        this._readOnlyName = readOnlyName;
    }

}

}
