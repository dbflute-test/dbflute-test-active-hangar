/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE04_BONVO as TABLE.
 * <pre>
 * [primary-key]
 *     BONVO_ID
 *
 * [column]
 *     BONVO_ID, BONVO_NAME, PARKSIDE_ID, STATIONSIDE_ID
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
 *     WHITE_BASE_ONE04_BONVO_PARKSIDE, WHITE_BASE_ONE04_BONVO_STATIONSIDE
 *
 * [referrer-table]
 *     WHITE_BASE
 *
 * [foreign-property]
 *     whiteBaseOne04BonvoParkside, whiteBaseOne04BonvoStationside
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne04Bonvo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _bonvoId:int;

    private var _bonvoName:String;

    private var _parksideId:int;

    private var _stationsideId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteBaseOne04BonvoParkside:WhiteBaseOne04BonvoParksideDto;

    public function get whiteBaseOne04BonvoParkside():WhiteBaseOne04BonvoParksideDto {
        return _whiteBaseOne04BonvoParkside;
    }

    public function set whiteBaseOne04BonvoParkside(whiteBaseOne04BonvoParkside:WhiteBaseOne04BonvoParksideDto):void {
        this._whiteBaseOne04BonvoParkside = whiteBaseOne04BonvoParkside;
    }

    private var _whiteBaseOne04BonvoStationside:WhiteBaseOne04BonvoStationsideDto;

    public function get whiteBaseOne04BonvoStationside():WhiteBaseOne04BonvoStationsideDto {
        return _whiteBaseOne04BonvoStationside;
    }

    public function set whiteBaseOne04BonvoStationside(whiteBaseOne04BonvoStationside:WhiteBaseOne04BonvoStationsideDto):void {
        this._whiteBaseOne04BonvoStationside = whiteBaseOne04BonvoStationside;
    }

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
    public function get bonvoId():int {
        return _bonvoId;
    }

    public function set bonvoId(bonvoId:int):void {
        this._bonvoId = bonvoId;
    }

    public function get bonvoName():String {
        return _bonvoName;
    }

    public function set bonvoName(bonvoName:String):void {
        this._bonvoName = bonvoName;
    }

    public function get parksideId():int {
        return _parksideId;
    }

    public function set parksideId(parksideId:int):void {
        this._parksideId = parksideId;
    }

    public function get stationsideId():int {
        return _stationsideId;
    }

    public function set stationsideId(stationsideId:int):void {
        this._stationsideId = stationsideId;
    }

}

}
