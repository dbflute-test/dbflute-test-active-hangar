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
 * The flex DTO of WHITE_SCHEMA_DIFF as TABLE.
 * <pre>
 * [primary-key]
 *     SCHEMA_DIFF_ID
 *
 * [column]
 *     SCHEMA_DIFF_ID, SCHEMA_DIFF_NAME, SCHEMA_DIFF_DATE
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
public class BsWhiteSchemaDiff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _schemaDiffId:Number;

    private var _schemaDiffName:String;

    private var _schemaDiffDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get schemaDiffId():Number {
        return _schemaDiffId;
    }

    public function set schemaDiffId(schemaDiffId:Number):void {
        this._schemaDiffId = schemaDiffId;
    }

    public function get schemaDiffName():String {
        return _schemaDiffName;
    }

    public function set schemaDiffName(schemaDiffName:String):void {
        this._schemaDiffName = schemaDiffName;
    }

    public function get schemaDiffDate():Date {
        return _schemaDiffDate;
    }

    public function set schemaDiffDate(schemaDiffDate:Date):void {
        this._schemaDiffDate = schemaDiffDate;
    }

}

}
