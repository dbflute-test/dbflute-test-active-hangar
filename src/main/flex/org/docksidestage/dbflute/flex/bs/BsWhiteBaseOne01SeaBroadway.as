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
 * The flex DTO of WHITE_BASE_ONE01_SEA_BROADWAY as TABLE.
 * <pre>
 * [primary-key]
 *     BROADWAY_ID
 *
 * [column]
 *     BROADWAY_ID, BROADWAY_NAME
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseOne01SeaList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaBroadway {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _broadwayId:int;

    private var _broadwayName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteBaseOne01SeaDto;
    protected var _whiteBaseOne01SeaList:ArrayCollection; /* of the entity 'WhiteBaseOne01SeaDto'. */

    public function get whiteBaseOne01SeaList():ArrayCollection {
        if (_whiteBaseOne01SeaList == null) { _whiteBaseOne01SeaList = new ArrayCollection(); }
        return _whiteBaseOne01SeaList;
    }

    public function set whiteBaseOne01SeaList(whiteBaseOne01SeaList:ArrayCollection):void {
        this._whiteBaseOne01SeaList = whiteBaseOne01SeaList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get broadwayId():int {
        return _broadwayId;
    }

    public function set broadwayId(broadwayId:int):void {
        this._broadwayId = broadwayId;
    }

    public function get broadwayName():String {
        return _broadwayName;
    }

    public function set broadwayName(broadwayName:String):void {
        this._broadwayName = broadwayName;
    }

}

}
