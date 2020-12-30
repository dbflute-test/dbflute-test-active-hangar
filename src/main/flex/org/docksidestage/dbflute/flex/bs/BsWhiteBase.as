package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE as TABLE.
 * <pre>
 * [primary-key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, BASE_NAME, SEA_ID, LAND_ID, PIARI_ID, BONVO_ID, DSTORE_ID, AMBA_ID, MIRACO_ID, DOHOTEL_ID
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
 *     WHITE_BASE_ONE06_AMBA, WHITE_BASE_ONE04_BONVO, WHITE_BASE_ONE05_DSTORE, WHITE_BASE_ONE02_LAND, WHITE_BASE_ONE07_MIRACO, WHITE_BASE_ONE03_PIARI, WHITE_BASE_ONE01_SEA, WHITE_BASE_ONE08_DOHOTEL, WHITE_BASE_ONE09_PALM(AsOne), WHITE_BASE_ONE10_CELEB(AsOne), WHITE_BASE_ONE11_CIRQUE(AsOne), WHITE_BASE_ONE12_AMPHI(AsOne)
 *
 * [referrer-table]
 *     WHITE_BASE_ONE09_PALM, WHITE_BASE_ONE10_CELEB, WHITE_BASE_ONE11_CIRQUE, WHITE_BASE_ONE12_AMPHI
 *
 * [foreign-property]
 *     whiteBaseOne06Amba, whiteBaseOne04Bonvo, whiteBaseOne05Dstore, whiteBaseOne02Land, whiteBaseOne07Miraco, whiteBaseOne03Piari, whiteBaseOne01Sea, whiteBaseOne08Dohotel, whiteBaseOne09PalmAsOne, whiteBaseOne10CelebAsOne, whiteBaseOne11CirqueAsOne, whiteBaseOne12AmphiAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _baseId:int;

    private var _baseName:String;

    private var _seaId:int;

    private var _landId:int;

    private var _piariId:int;

    private var _bonvoId:int;

    private var _dstoreId:int;

    private var _ambaId:int;

    private var _miracoId:int;

    private var _dohotelId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteBaseOne06Amba:WhiteBaseOne06AmbaDto;

    public function get whiteBaseOne06Amba():WhiteBaseOne06AmbaDto {
        return _whiteBaseOne06Amba;
    }

    public function set whiteBaseOne06Amba(whiteBaseOne06Amba:WhiteBaseOne06AmbaDto):void {
        this._whiteBaseOne06Amba = whiteBaseOne06Amba;
    }

    private var _whiteBaseOne04Bonvo:WhiteBaseOne04BonvoDto;

    public function get whiteBaseOne04Bonvo():WhiteBaseOne04BonvoDto {
        return _whiteBaseOne04Bonvo;
    }

    public function set whiteBaseOne04Bonvo(whiteBaseOne04Bonvo:WhiteBaseOne04BonvoDto):void {
        this._whiteBaseOne04Bonvo = whiteBaseOne04Bonvo;
    }

    private var _whiteBaseOne05Dstore:WhiteBaseOne05DstoreDto;

    public function get whiteBaseOne05Dstore():WhiteBaseOne05DstoreDto {
        return _whiteBaseOne05Dstore;
    }

    public function set whiteBaseOne05Dstore(whiteBaseOne05Dstore:WhiteBaseOne05DstoreDto):void {
        this._whiteBaseOne05Dstore = whiteBaseOne05Dstore;
    }

    private var _whiteBaseOne02Land:WhiteBaseOne02LandDto;

    public function get whiteBaseOne02Land():WhiteBaseOne02LandDto {
        return _whiteBaseOne02Land;
    }

    public function set whiteBaseOne02Land(whiteBaseOne02Land:WhiteBaseOne02LandDto):void {
        this._whiteBaseOne02Land = whiteBaseOne02Land;
    }

    private var _whiteBaseOne07Miraco:WhiteBaseOne07MiracoDto;

    public function get whiteBaseOne07Miraco():WhiteBaseOne07MiracoDto {
        return _whiteBaseOne07Miraco;
    }

    public function set whiteBaseOne07Miraco(whiteBaseOne07Miraco:WhiteBaseOne07MiracoDto):void {
        this._whiteBaseOne07Miraco = whiteBaseOne07Miraco;
    }

    private var _whiteBaseOne03Piari:WhiteBaseOne03PiariDto;

    public function get whiteBaseOne03Piari():WhiteBaseOne03PiariDto {
        return _whiteBaseOne03Piari;
    }

    public function set whiteBaseOne03Piari(whiteBaseOne03Piari:WhiteBaseOne03PiariDto):void {
        this._whiteBaseOne03Piari = whiteBaseOne03Piari;
    }

    private var _whiteBaseOne01Sea:WhiteBaseOne01SeaDto;

    public function get whiteBaseOne01Sea():WhiteBaseOne01SeaDto {
        return _whiteBaseOne01Sea;
    }

    public function set whiteBaseOne01Sea(whiteBaseOne01Sea:WhiteBaseOne01SeaDto):void {
        this._whiteBaseOne01Sea = whiteBaseOne01Sea;
    }

    private var _whiteBaseOne08Dohotel:WhiteBaseOne08DohotelDto;

    public function get whiteBaseOne08Dohotel():WhiteBaseOne08DohotelDto {
        return _whiteBaseOne08Dohotel;
    }

    public function set whiteBaseOne08Dohotel(whiteBaseOne08Dohotel:WhiteBaseOne08DohotelDto):void {
        this._whiteBaseOne08Dohotel = whiteBaseOne08Dohotel;
    }

    private var _whiteBaseOne09PalmAsOne:WhiteBaseOne09PalmDto;

    public function get whiteBaseOne09PalmAsOne():WhiteBaseOne09PalmDto {
        return _whiteBaseOne09PalmAsOne;
    }

    public function set whiteBaseOne09PalmAsOne(whiteBaseOne09PalmAsOne:WhiteBaseOne09PalmDto):void {
        this._whiteBaseOne09PalmAsOne = whiteBaseOne09PalmAsOne;
    }
    private var _whiteBaseOne10CelebAsOne:WhiteBaseOne10CelebDto;

    public function get whiteBaseOne10CelebAsOne():WhiteBaseOne10CelebDto {
        return _whiteBaseOne10CelebAsOne;
    }

    public function set whiteBaseOne10CelebAsOne(whiteBaseOne10CelebAsOne:WhiteBaseOne10CelebDto):void {
        this._whiteBaseOne10CelebAsOne = whiteBaseOne10CelebAsOne;
    }
    private var _whiteBaseOne11CirqueAsOne:WhiteBaseOne11CirqueDto;

    public function get whiteBaseOne11CirqueAsOne():WhiteBaseOne11CirqueDto {
        return _whiteBaseOne11CirqueAsOne;
    }

    public function set whiteBaseOne11CirqueAsOne(whiteBaseOne11CirqueAsOne:WhiteBaseOne11CirqueDto):void {
        this._whiteBaseOne11CirqueAsOne = whiteBaseOne11CirqueAsOne;
    }
    private var _whiteBaseOne12AmphiAsOne:WhiteBaseOne12AmphiDto;

    public function get whiteBaseOne12AmphiAsOne():WhiteBaseOne12AmphiDto {
        return _whiteBaseOne12AmphiAsOne;
    }

    public function set whiteBaseOne12AmphiAsOne(whiteBaseOne12AmphiAsOne:WhiteBaseOne12AmphiDto):void {
        this._whiteBaseOne12AmphiAsOne = whiteBaseOne12AmphiAsOne;
    }
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get baseId():int {
        return _baseId;
    }

    public function set baseId(baseId:int):void {
        this._baseId = baseId;
    }

    public function get baseName():String {
        return _baseName;
    }

    public function set baseName(baseName:String):void {
        this._baseName = baseName;
    }

    public function get seaId():int {
        return _seaId;
    }

    public function set seaId(seaId:int):void {
        this._seaId = seaId;
    }

    public function get landId():int {
        return _landId;
    }

    public function set landId(landId:int):void {
        this._landId = landId;
    }

    public function get piariId():int {
        return _piariId;
    }

    public function set piariId(piariId:int):void {
        this._piariId = piariId;
    }

    public function get bonvoId():int {
        return _bonvoId;
    }

    public function set bonvoId(bonvoId:int):void {
        this._bonvoId = bonvoId;
    }

    public function get dstoreId():int {
        return _dstoreId;
    }

    public function set dstoreId(dstoreId:int):void {
        this._dstoreId = dstoreId;
    }

    public function get ambaId():int {
        return _ambaId;
    }

    public function set ambaId(ambaId:int):void {
        this._ambaId = ambaId;
    }

    public function get miracoId():int {
        return _miracoId;
    }

    public function set miracoId(miracoId:int):void {
        this._miracoId = miracoId;
    }

    public function get dohotelId():int {
        return _dohotelId;
    }

    public function set dohotelId(dohotelId:int):void {
        this._dohotelId = dohotelId;
    }

}

}
