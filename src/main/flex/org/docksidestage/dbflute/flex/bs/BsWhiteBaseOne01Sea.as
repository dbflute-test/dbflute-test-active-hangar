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
 * The flex DTO of WHITE_BASE_ONE01_SEA as TABLE.
 * <pre>
 * [primary-key]
 *     SEA_ID
 *
 * [column]
 *     SEA_ID, SEA_NAME, BROADWAY_ID, DOCKSIDE_ID
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
 *     WHITE_BASE_ONE01_SEA_BROADWAY, WHITE_BASE_ONE01_SEA_DOCKSIDE, WHITE_BASE_ONE01_SEA_HANGAR(AsOne)
 *
 * [referrer-table]
 *     WHITE_BASE, WHITE_BASE_ONE01_SEA_MAGICLAMP, WHITE_BASE_ONE01_SEA_HANGAR
 *
 * [foreign-property]
 *     whiteBaseOne01SeaBroadway, whiteBaseOne01SeaDockside, whiteBaseOne01SeaHangarAsOne
 *
 * [referrer-property]
 *     whiteBaseList, whiteBaseOne01SeaMagiclampList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01Sea {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _seaId:int;

    private var _seaName:String;

    private var _broadwayId:int;

    private var _docksideId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteBaseOne01SeaBroadway:WhiteBaseOne01SeaBroadwayDto;

    public function get whiteBaseOne01SeaBroadway():WhiteBaseOne01SeaBroadwayDto {
        return _whiteBaseOne01SeaBroadway;
    }

    public function set whiteBaseOne01SeaBroadway(whiteBaseOne01SeaBroadway:WhiteBaseOne01SeaBroadwayDto):void {
        this._whiteBaseOne01SeaBroadway = whiteBaseOne01SeaBroadway;
    }

    private var _whiteBaseOne01SeaDockside:WhiteBaseOne01SeaDocksideDto;

    public function get whiteBaseOne01SeaDockside():WhiteBaseOne01SeaDocksideDto {
        return _whiteBaseOne01SeaDockside;
    }

    public function set whiteBaseOne01SeaDockside(whiteBaseOne01SeaDockside:WhiteBaseOne01SeaDocksideDto):void {
        this._whiteBaseOne01SeaDockside = whiteBaseOne01SeaDockside;
    }

    private var _whiteBaseOne01SeaHangarAsOne:WhiteBaseOne01SeaHangarDto;

    public function get whiteBaseOne01SeaHangarAsOne():WhiteBaseOne01SeaHangarDto {
        return _whiteBaseOne01SeaHangarAsOne;
    }

    public function set whiteBaseOne01SeaHangarAsOne(whiteBaseOne01SeaHangarAsOne:WhiteBaseOne01SeaHangarDto):void {
        this._whiteBaseOne01SeaHangarAsOne = whiteBaseOne01SeaHangarAsOne;
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

    WhiteBaseOne01SeaMagiclampDto;
    protected var _whiteBaseOne01SeaMagiclampList:ArrayCollection; /* of the entity 'WhiteBaseOne01SeaMagiclampDto'. */

    public function get whiteBaseOne01SeaMagiclampList():ArrayCollection {
        if (_whiteBaseOne01SeaMagiclampList == null) { _whiteBaseOne01SeaMagiclampList = new ArrayCollection(); }
        return _whiteBaseOne01SeaMagiclampList;
    }

    public function set whiteBaseOne01SeaMagiclampList(whiteBaseOne01SeaMagiclampList:ArrayCollection):void {
        this._whiteBaseOne01SeaMagiclampList = whiteBaseOne01SeaMagiclampList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get seaId():int {
        return _seaId;
    }

    public function set seaId(seaId:int):void {
        this._seaId = seaId;
    }

    public function get seaName():String {
        return _seaName;
    }

    public function set seaName(seaName:String):void {
        this._seaName = seaName;
    }

    public function get broadwayId():int {
        return _broadwayId;
    }

    public function set broadwayId(broadwayId:int):void {
        this._broadwayId = broadwayId;
    }

    public function get docksideId():int {
        return _docksideId;
    }

    public function set docksideId(docksideId:int):void {
        this._docksideId = docksideId;
    }

}

}
