package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE12_AMPHI as TABLE.
 * <pre>
 * [primary-key]
 *     AMPHI_ID
 *
 * [column]
 *     AMPHI_ID, AMPHI_NAME, BASE_ID
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
public class BsWhiteBaseOne12Amphi {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _amphiId:int;

    private var _amphiName:String;

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
    public function get amphiId():int {
        return _amphiId;
    }

    public function set amphiId(amphiId:int):void {
        this._amphiId = amphiId;
    }

    public function get amphiName():String {
        return _amphiName;
    }

    public function set amphiName(amphiName:String):void {
        this._amphiName = amphiName;
    }

    public function get baseId():int {
        return _baseId;
    }

    public function set baseId(baseId:int):void {
        this._baseId = baseId;
    }

}

}
