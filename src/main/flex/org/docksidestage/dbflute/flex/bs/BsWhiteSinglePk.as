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
 * The flex DTO of WHITE_SINGLE_PK as TABLE.
 * <pre>
 * [primary-key]
 *     ONLY_ONE_PK_ID
 *
 * [column]
 *     ONLY_ONE_PK_ID, SINGLE_PK_NAME, REFERRED_ID
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
public class BsWhiteSinglePk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _onlyOnePkId:Number;

    private var _singlePkName:String;

    private var _referredId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get onlyOnePkId():Number {
        return _onlyOnePkId;
    }

    public function set onlyOnePkId(onlyOnePkId:Number):void {
        this._onlyOnePkId = onlyOnePkId;
    }

    public function get singlePkName():String {
        return _singlePkName;
    }

    public function set singlePkName(singlePkName:String):void {
        this._singlePkName = singlePkName;
    }

    public function get referredId():int {
        return _referredId;
    }

    public function set referredId(referredId:int):void {
        this._referredId = referredId;
    }

}

}
