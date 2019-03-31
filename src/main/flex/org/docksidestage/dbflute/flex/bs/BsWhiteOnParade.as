package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_ON_PARADE as TABLE.
 * <pre>
 * [primary-key]
 *     ON_PARADE_ID
 *
 * [column]
 *     ON_PARADE_ID, ON_PARADE_NAME
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
 *     WHITE_ON_PARADE_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteOnParadeRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnParade {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _onParadeId:Number;

    private var _onParadeName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteOnParadeRefDto;
    protected var _whiteOnParadeRefList:ArrayCollection; /* of the entity 'WhiteOnParadeRefDto'. */

    public function get whiteOnParadeRefList():ArrayCollection {
        if (_whiteOnParadeRefList == null) { _whiteOnParadeRefList = new ArrayCollection(); }
        return _whiteOnParadeRefList;
    }

    public function set whiteOnParadeRefList(whiteOnParadeRefList:ArrayCollection):void {
        this._whiteOnParadeRefList = whiteOnParadeRefList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get onParadeId():Number {
        return _onParadeId;
    }

    public function set onParadeId(onParadeId:Number):void {
        this._onParadeId = onParadeId;
    }

    public function get onParadeName():String {
        return _onParadeName;
    }

    public function set onParadeName(onParadeName:String):void {
        this._onParadeName = onParadeName;
    }

}

}
