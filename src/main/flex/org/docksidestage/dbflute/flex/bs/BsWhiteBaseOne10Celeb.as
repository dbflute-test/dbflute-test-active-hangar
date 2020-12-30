package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE10_CELEB as TABLE.
 * <pre>
 * [primary-key]
 *     CELEB_ID
 *
 * [column]
 *     CELEB_ID, CELEB_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBase
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne10Celeb {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _celebId:int;

    private var _celebName:String;

    private var _baseId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteBase:WhiteBaseDto;

    public function get whiteBase():WhiteBaseDto {
        return _whiteBase;
    }

    public function set whiteBase(whiteBase:WhiteBaseDto):void {
        this._whiteBase = whiteBase;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get celebId():int {
        return _celebId;
    }

    public function set celebId(celebId:int):void {
        this._celebId = celebId;
    }

    public function get celebName():String {
        return _celebName;
    }

    public function set celebName(celebName:String):void {
        this._celebName = celebName;
    }

    public function get baseId():int {
        return _baseId;
    }

    public function set baseId(baseId:int):void {
        this._baseId = baseId;
    }

}

}
