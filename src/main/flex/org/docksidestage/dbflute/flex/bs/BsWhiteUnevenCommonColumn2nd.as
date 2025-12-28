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
 * The flex DTO of WHITE_UNEVEN_COMMON_COLUMN_2ND as TABLE.
 * <pre>
 * [primary-key]
 *     UNEVEN_ID
 *
 * [column]
 *     UNEVEN_ID, UNEVEN_NAME, REGISTER_DATETIME, REGISTER_USER
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
public class BsWhiteUnevenCommonColumn2nd {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _unevenId:int;

    private var _unevenName:String;

    private var _registerDatetime:Date;

    private var _registerUser:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get unevenId():int {
        return _unevenId;
    }

    public function set unevenId(unevenId:int):void {
        this._unevenId = unevenId;
    }

    public function get unevenName():String {
        return _unevenName;
    }

    public function set unevenName(unevenName:String):void {
        this._unevenName = unevenName;
    }

    public function get registerDatetime():Date {
        return _registerDatetime;
    }

    public function set registerDatetime(registerDatetime:Date):void {
        this._registerDatetime = registerDatetime;
    }

    public function get registerUser():String {
        return _registerUser;
    }

    public function set registerUser(registerUser:String):void {
        this._registerUser = registerUser;
    }

}

}
