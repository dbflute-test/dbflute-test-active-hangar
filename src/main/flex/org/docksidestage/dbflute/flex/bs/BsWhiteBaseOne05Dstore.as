package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE05_DSTORE as TABLE.
 * <pre>
 * [primary-key]
 *     DSTORE_ID
 *
 * [column]
 *     DSTORE_ID, DSTORE_NAME
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
public class BsWhiteBaseOne05Dstore {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dstoreId:int;

    private var _dstoreName:String;


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
    public function get dstoreId():int {
        return _dstoreId;
    }

    public function set dstoreId(dstoreId:int):void {
        this._dstoreId = dstoreId;
    }

    public function get dstoreName():String {
        return _dstoreName;
    }

    public function set dstoreName(dstoreName:String):void {
        this._dstoreName = dstoreName;
    }

}

}
