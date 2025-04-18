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
 * The flex DTO of WHITE_NOT_NULL as TABLE.
 * <pre>
 * [primary-key]
 *     NOT_NULL_ID
 *
 * [column]
 *     NOT_NULL_ID, NOT_NULL_NAME, NOT_NULL_COUNT, NOT_NULL_DATE, NOT_NULL_DATETIME
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
public class BsWhiteNotNull {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _notNullId:Number;

    private var _notNullName:String;

    private var _notNullCount:int;

    private var _notNullDate:Date;

    private var _notNullDatetime:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get notNullId():Number {
        return _notNullId;
    }

    public function set notNullId(notNullId:Number):void {
        this._notNullId = notNullId;
    }

    public function get notNullName():String {
        return _notNullName;
    }

    public function set notNullName(notNullName:String):void {
        this._notNullName = notNullName;
    }

    public function get notNullCount():int {
        return _notNullCount;
    }

    public function set notNullCount(notNullCount:int):void {
        this._notNullCount = notNullCount;
    }

    public function get notNullDate():Date {
        return _notNullDate;
    }

    public function set notNullDate(notNullDate:Date):void {
        this._notNullDate = notNullDate;
    }

    public function get notNullDatetime():Date {
        return _notNullDatetime;
    }

    public function set notNullDatetime(notNullDatetime:Date):void {
        this._notNullDatetime = notNullDatetime;
    }

}

}
