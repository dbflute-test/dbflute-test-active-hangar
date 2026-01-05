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
 * The flex DTO of WHITE_DEFAULT_CONSTRAINT as TABLE.
 * <pre>
 * [primary-key]
 *     DEFAULT_ID
 *
 * [column]
 *     DEFAULT_ID, DEFAULT_NAME, DEFAULT_COUNT, DEFAULT_DATE, DEFAULT_JUDGE, DEFAULT_EMPTY_STRING
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
public class BsWhiteDefaultConstraint {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _defaultId:Number;

    private var _defaultName:String;

    private var _defaultCount:int;

    private var _defaultDate:Date;

    private var _defaultJudge:Boolean;

    private var _defaultEmptyString:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get defaultId():Number {
        return _defaultId;
    }

    public function set defaultId(defaultId:Number):void {
        this._defaultId = defaultId;
    }

    public function get defaultName():String {
        return _defaultName;
    }

    public function set defaultName(defaultName:String):void {
        this._defaultName = defaultName;
    }

    public function get defaultCount():int {
        return _defaultCount;
    }

    public function set defaultCount(defaultCount:int):void {
        this._defaultCount = defaultCount;
    }

    public function get defaultDate():Date {
        return _defaultDate;
    }

    public function set defaultDate(defaultDate:Date):void {
        this._defaultDate = defaultDate;
    }

    public function get defaultJudge():Boolean {
        return _defaultJudge;
    }

    public function set defaultJudge(defaultJudge:Boolean):void {
        this._defaultJudge = defaultJudge;
    }

    public function get defaultEmptyString():String {
        return _defaultEmptyString;
    }

    public function set defaultEmptyString(defaultEmptyString:String):void {
        this._defaultEmptyString = defaultEmptyString;
    }

}

}
