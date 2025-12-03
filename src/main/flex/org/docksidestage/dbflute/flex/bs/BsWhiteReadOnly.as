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
 * The flex DTO of (読み取りオンリー)WHITE_READ_ONLY as TABLE.
 * <pre>
 * [primary-key]
 *     READ_ONLY_ID
 *
 * [column]
 *     READ_ONLY_ID, READ_ONLY_NAME
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
public class BsWhiteReadOnly {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _readOnlyId:Number;

    private var _readOnlyName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get readOnlyId():Number {
        return _readOnlyId;
    }

    public function set readOnlyId(readOnlyId:Number):void {
        this._readOnlyId = readOnlyId;
    }

    public function get readOnlyName():String {
        return _readOnlyName;
    }

    public function set readOnlyName(readOnlyName:String):void {
        this._readOnlyName = readOnlyName;
    }

}

}
