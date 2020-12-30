package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE08_DOHOTEL as TABLE.
 * <pre>
 * [primary-key]
 *     DOHOTEL_ID
 *
 * [column]
 *     DOHOTEL_ID, DOHOTEL_NAME
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
public class BsWhiteBaseOne08Dohotel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dohotelId:int;

    private var _dohotelName:String;


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
    public function get dohotelId():int {
        return _dohotelId;
    }

    public function set dohotelId(dohotelId:int):void {
        this._dohotelId = dohotelId;
    }

    public function get dohotelName():String {
        return _dohotelName;
    }

    public function set dohotelName(dohotelName:String):void {
        this._dohotelName = dohotelName;
    }

}

}
