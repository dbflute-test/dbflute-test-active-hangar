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
 * The flex DTO of white_generate_name_switched as TABLE.
 * <pre>
 * [primary-key]
 *     GENERATE_NAME_SWITCHED_ID
 *
 * [column]
 *     GENERATE_NAME_SWITCHED_ID, GENERATE_NAME_SWITCHED_NAME, GENERATE_NAME_SWITCHED_COUNT, GENERATE_NAME_SWITCHED_DATE, GENERATE_NAME_SWITCHED_DATETIME
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
public class BsWhiteGenerateNameSwitched {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _generateNameSwitchedId:Number;

    private var _generateNameSwitchedName:String;

    private var _generateNameSwitchedCount:int;

    private var _generateNameSwitchedDate:Date;

    private var _generateNameSwitchedDatetime:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get generateNameSwitchedId():Number {
        return _generateNameSwitchedId;
    }

    public function set generateNameSwitchedId(generateNameSwitchedId:Number):void {
        this._generateNameSwitchedId = generateNameSwitchedId;
    }

    public function get generateNameSwitchedName():String {
        return _generateNameSwitchedName;
    }

    public function set generateNameSwitchedName(generateNameSwitchedName:String):void {
        this._generateNameSwitchedName = generateNameSwitchedName;
    }

    public function get generateNameSwitchedCount():int {
        return _generateNameSwitchedCount;
    }

    public function set generateNameSwitchedCount(generateNameSwitchedCount:int):void {
        this._generateNameSwitchedCount = generateNameSwitchedCount;
    }

    public function get generateNameSwitchedDate():Date {
        return _generateNameSwitchedDate;
    }

    public function set generateNameSwitchedDate(generateNameSwitchedDate:Date):void {
        this._generateNameSwitchedDate = generateNameSwitchedDate;
    }

    public function get generateNameSwitchedDatetime():Date {
        return _generateNameSwitchedDatetime;
    }

    public function set generateNameSwitchedDatetime(generateNameSwitchedDatetime:Date):void {
        this._generateNameSwitchedDatetime = generateNameSwitchedDatetime;
    }

}

}
