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
 * The flex DTO of WHITE_BASE_ONE01_SEA_DOCKSIDE as TABLE.
 * <pre>
 * [primary-key]
 *     DOCKSIDE_ID
 *
 * [column]
 *     DOCKSIDE_ID, DOCKSIDE_NAME
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
public class BsWhiteBaseOne01SeaDockside {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _docksideId:int;

    private var _docksideName:String;


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
    public function get docksideId():int {
        return _docksideId;
    }

    public function set docksideId(docksideId:int):void {
        this._docksideId = docksideId;
    }

    public function get docksideName():String {
        return _docksideName;
    }

    public function set docksideName(docksideName:String):void {
        this._docksideName = docksideName;
    }

}

}
