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
 * The flex DTO of WHITE_BASE_ONE01_SEA_MAGICLAMP as TABLE.
 * <pre>
 * [primary-key]
 *     MAGICLAMP_ID
 *
 * [column]
 *     MAGICLAMP_ID, MAGICLAMP_NAME, SEA_ID
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBaseOne01Sea
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaMagiclamp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _magiclampId:int;

    private var _magiclampName:String;

    private var _seaId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteBaseOne01Sea:WhiteBaseOne01SeaDto;

    public function get whiteBaseOne01Sea():WhiteBaseOne01SeaDto {
        return _whiteBaseOne01Sea;
    }

    public function set whiteBaseOne01Sea(whiteBaseOne01Sea:WhiteBaseOne01SeaDto):void {
        this._whiteBaseOne01Sea = whiteBaseOne01Sea;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get magiclampId():int {
        return _magiclampId;
    }

    public function set magiclampId(magiclampId:int):void {
        this._magiclampId = magiclampId;
    }

    public function get magiclampName():String {
        return _magiclampName;
    }

    public function set magiclampName(magiclampName:String):void {
        this._magiclampName = magiclampName;
    }

    public function get seaId():int {
        return _seaId;
    }

    public function set seaId(seaId:int):void {
        this._seaId = seaId;
    }

}

}
