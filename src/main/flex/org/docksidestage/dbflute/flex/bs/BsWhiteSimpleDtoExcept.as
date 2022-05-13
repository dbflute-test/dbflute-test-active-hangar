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
 * The flex DTO of WHITE_SIMPLE_DTO_EXCEPT as TABLE.
 * <pre>
 * [primary-key]
 *     SIMPLE_DTO_EXCEPT_ID
 *
 * [column]
 *     SIMPLE_DTO_EXCEPT_ID, SIMPLE_DTO_EXCEPT_NAME
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
public class BsWhiteSimpleDtoExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _simpleDtoExceptId:Number;

    private var _simpleDtoExceptName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get simpleDtoExceptId():Number {
        return _simpleDtoExceptId;
    }

    public function set simpleDtoExceptId(simpleDtoExceptId:Number):void {
        this._simpleDtoExceptId = simpleDtoExceptId;
    }

    public function get simpleDtoExceptName():String {
        return _simpleDtoExceptName;
    }

    public function set simpleDtoExceptName(simpleDtoExceptName:String):void {
        this._simpleDtoExceptName = simpleDtoExceptName;
    }

}

}
