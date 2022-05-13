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
 * The flex DTO of WHITE_BASE_ONE11_CIRQUE as TABLE.
 * <pre>
 * [primary-key]
 *     CIRQUE_ID
 *
 * [column]
 *     CIRQUE_ID, CIRQUE_NAME
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
public class BsWhiteBaseOne11Cirque {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _cirqueId:int;

    private var _cirqueName:String;


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
    public function get cirqueId():int {
        return _cirqueId;
    }

    public function set cirqueId(cirqueId:int):void {
        this._cirqueId = cirqueId;
    }

    public function get cirqueName():String {
        return _cirqueName;
    }

    public function set cirqueName(cirqueName:String):void {
        this._cirqueName = cirqueName;
    }

}

}
