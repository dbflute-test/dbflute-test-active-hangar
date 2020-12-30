package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE09_PALM as TABLE.
 * <pre>
 * [primary-key]
 *     PALM_ID
 *
 * [column]
 *     PALM_ID, PALM_NAME, BASE_ID
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
public class BsWhiteBaseOne09Palm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _palmId:int;

    private var _palmName:String;

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
    public function get palmId():int {
        return _palmId;
    }

    public function set palmId(palmId:int):void {
        this._palmId = palmId;
    }

    public function get palmName():String {
        return _palmName;
    }

    public function set palmName(palmName:String):void {
        this._palmName = palmName;
    }

    public function get baseId():int {
        return _baseId;
    }

    public function set baseId(baseId:int):void {
        this._baseId = baseId;
    }

}

}
