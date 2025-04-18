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
 * The flex DTO of WHITE_TYPE_MAPPING as TABLE.
 * <pre>
 * [primary-key]
 *     TYPE_MAPPING_ID
 *
 * [column]
 *     TYPE_MAPPING_ID, TYPE_MAPPING_NAME, TYPE_MAPPING_COUNT, TYPE_MAPPING_DATE, TYPE_MAPPING_DATETIME, POINT_MAPPING_DATE
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
public class BsWhiteTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _typeMappingId:Number;

    private var _typeMappingName:String;

    private var _typeMappingCount:int;

    private var _typeMappingDate:Date;

    private var _typeMappingDatetime:Date;

    private var _pointMappingDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get typeMappingId():Number {
        return _typeMappingId;
    }

    public function set typeMappingId(typeMappingId:Number):void {
        this._typeMappingId = typeMappingId;
    }

    public function get typeMappingName():String {
        return _typeMappingName;
    }

    public function set typeMappingName(typeMappingName:String):void {
        this._typeMappingName = typeMappingName;
    }

    public function get typeMappingCount():int {
        return _typeMappingCount;
    }

    public function set typeMappingCount(typeMappingCount:int):void {
        this._typeMappingCount = typeMappingCount;
    }

    public function get typeMappingDate():Date {
        return _typeMappingDate;
    }

    public function set typeMappingDate(typeMappingDate:Date):void {
        this._typeMappingDate = typeMappingDate;
    }

    public function get typeMappingDatetime():Date {
        return _typeMappingDatetime;
    }

    public function set typeMappingDatetime(typeMappingDatetime:Date):void {
        this._typeMappingDatetime = typeMappingDatetime;
    }

    public function get pointMappingDate():Date {
        return _pointMappingDate;
    }

    public function set pointMappingDate(pointMappingDate:Date):void {
        this._pointMappingDate = pointMappingDate;
    }

}

}
