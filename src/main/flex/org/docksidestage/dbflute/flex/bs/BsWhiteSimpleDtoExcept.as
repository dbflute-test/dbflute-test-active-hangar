package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_SIMPLE_DTO_EXCEPT as TABLE.
 * <pre>
 * [primary-key]
 *     SIMPLE_DTO_EXCEPT_ID
 *
 * [column]
 *     SIMPLE_DTO_EXCEPT_ID, SIMPLE_DTO_EXCEPT_NAME
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
public class BsWhiteSimpleDtoExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _simpleDtoExceptId:Number;

    private var _simpleDtoExceptName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get simpleDtoExceptId():Number {
        return _simpleDtoExceptId;
    }

    public function set simpleDtoExceptId(simpleDtoExceptId:Number):void {
        this._simpleDtoExceptId = simpleDtoExceptId;
    }

    public function get simpleDtoExceptName():String {
        return _simpleDtoExceptName;
    }

    public function set simpleDtoExceptName(simpleDtoExceptName:String):void {
        this._simpleDtoExceptName = simpleDtoExceptName;
    }

}

}
