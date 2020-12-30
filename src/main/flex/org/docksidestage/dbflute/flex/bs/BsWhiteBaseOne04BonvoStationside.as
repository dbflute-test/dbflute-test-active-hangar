package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE04_BONVO_STATIONSIDE as TABLE.
 * <pre>
 * [primary-key]
 *     STATIONSIDE_ID
 *
 * [column]
 *     STATIONSIDE_ID, STATIONSIDE_NAME
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
 *     WHITE_BASE_ONE04_BONVO
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseOne04BonvoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne04BonvoStationside {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _stationsideId:int;

    private var _stationsideName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteBaseOne04BonvoDto;
    protected var _whiteBaseOne04BonvoList:ArrayCollection; /* of the entity 'WhiteBaseOne04BonvoDto'. */

    public function get whiteBaseOne04BonvoList():ArrayCollection {
        if (_whiteBaseOne04BonvoList == null) { _whiteBaseOne04BonvoList = new ArrayCollection(); }
        return _whiteBaseOne04BonvoList;
    }

    public function set whiteBaseOne04BonvoList(whiteBaseOne04BonvoList:ArrayCollection):void {
        this._whiteBaseOne04BonvoList = whiteBaseOne04BonvoList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get stationsideId():int {
        return _stationsideId;
    }

    public function set stationsideId(stationsideId:int):void {
        this._stationsideId = stationsideId;
    }

    public function get stationsideName():String {
        return _stationsideName;
    }

    public function set stationsideName(stationsideName:String):void {
        this._stationsideName = stationsideName;
    }

}

}
