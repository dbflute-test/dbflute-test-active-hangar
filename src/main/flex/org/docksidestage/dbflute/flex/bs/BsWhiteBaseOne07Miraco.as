package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE07_MIRACO as TABLE.
 * <pre>
 * [primary-key]
 *     MIRACO_ID
 *
 * [column]
 *     MIRACO_ID, MIRACO_NAME
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
 *     WHITE_BASE
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne07Miraco {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _miracoId:int;

    private var _miracoName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteBaseDto;
    protected var _whiteBaseList:ArrayCollection; /* of the entity 'WhiteBaseDto'. */

    public function get whiteBaseList():ArrayCollection {
        if (_whiteBaseList == null) { _whiteBaseList = new ArrayCollection(); }
        return _whiteBaseList;
    }

    public function set whiteBaseList(whiteBaseList:ArrayCollection):void {
        this._whiteBaseList = whiteBaseList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get miracoId():int {
        return _miracoId;
    }

    public function set miracoId(miracoId:int):void {
        this._miracoId = miracoId;
    }

    public function get miracoName():String {
        return _miracoName;
    }

    public function set miracoName(miracoName:String):void {
        this._miracoName = miracoName;
    }

}

}
