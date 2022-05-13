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
 * The flex DTO of WHITE_DATE_TERM as TABLE.
 * <pre>
 * [primary-key]
 *     DATE_TERM_ID
 *
 * [column]
 *     DATE_TERM_ID, DATE_TERM_VALUE, BEGIN_DATE, END_DATE
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
public class BsWhiteDateTerm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dateTermId:Number;

    private var _dateTermValue:String;

    private var _beginDate:Date;

    private var _endDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get dateTermId():Number {
        return _dateTermId;
    }

    public function set dateTermId(dateTermId:Number):void {
        this._dateTermId = dateTermId;
    }

    public function get dateTermValue():String {
        return _dateTermValue;
    }

    public function set dateTermValue(dateTermValue:String):void {
        this._dateTermValue = dateTermValue;
    }

    public function get beginDate():Date {
        return _beginDate;
    }

    public function set beginDate(beginDate:Date):void {
        this._beginDate = beginDate;
    }

    public function get endDate():Date {
        return _endDate;
    }

    public function set endDate(endDate:Date):void {
        this._endDate = endDate;
    }

}

}
