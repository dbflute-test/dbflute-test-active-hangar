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
 * The flex DTO of WHITE_ZONE_ARRANGE as TABLE.
 * <pre>
 * [primary-key]
 *     ARRANGE_ID
 *
 * [column]
 *     ARRANGE_ID, ARRANGE_NAME, ORDER
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
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteZoneArrange {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _arrangeId:int;

    private var _arrangeName:String;

    private var _order:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get arrangeId():int {
        return _arrangeId;
    }

    public function set arrangeId(arrangeId:int):void {
        this._arrangeId = arrangeId;
    }

    public function get arrangeName():String {
        return _arrangeName;
    }

    public function set arrangeName(arrangeName:String):void {
        this._arrangeName = arrangeName;
    }

    public function get order():int {
        return _order;
    }

    public function set order(order:int):void {
        this._order = order;
    }

}

}
