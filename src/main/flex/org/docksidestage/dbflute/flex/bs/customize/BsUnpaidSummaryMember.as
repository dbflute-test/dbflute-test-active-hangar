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
package org.docksidestage.dbflute.flex.bs.customize {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.customize.*;

/**
 * The flex DTO of UnpaidSummaryMember.
 * <pre>
 * [primary-key]
 *     UNPAID_MAN_ID
 *
 * [column]
 *     UNPAID_MAN_ID, UNPAID_MAN_NAME, UNPAID_PRICE_SUMMARY, STATUS_NAME
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
public class BsUnpaidSummaryMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _unpaidManId:int;

    private var _unpaidManName:String;

    private var _unpaidPriceSummary:Number;

    private var _statusName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get unpaidManId():int {
        return _unpaidManId;
    }

    public function set unpaidManId(unpaidManId:int):void {
        this._unpaidManId = unpaidManId;
    }

    public function get unpaidManName():String {
        return _unpaidManName;
    }

    public function set unpaidManName(unpaidManName:String):void {
        this._unpaidManName = unpaidManName;
    }

    public function get unpaidPriceSummary():Number {
        return _unpaidPriceSummary;
    }

    public function set unpaidPriceSummary(unpaidPriceSummary:Number):void {
        this._unpaidPriceSummary = unpaidPriceSummary;
    }

    public function get statusName():String {
        return _statusName;
    }

    public function set statusName(statusName:String):void {
        this._statusName = statusName;
    }

}

}
