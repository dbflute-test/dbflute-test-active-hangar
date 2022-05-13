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
 * The flex DTO of WHITE_BASE_ONE04_BONVO_PARKSIDE as TABLE.
 * <pre>
 * [primary-key]
 *     PARKSIDE_ID
 *
 * [column]
 *     PARKSIDE_ID, PARKSIDE_NAME
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
public class BsWhiteBaseOne04BonvoParkside {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _parksideId:int;

    private var _parksideName:String;


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
    public function get parksideId():int {
        return _parksideId;
    }

    public function set parksideId(parksideId:int):void {
        this._parksideId = parksideId;
    }

    public function get parksideName():String {
        return _parksideName;
    }

    public function set parksideName(parksideName:String):void {
        this._parksideName = parksideName;
    }

}

}
