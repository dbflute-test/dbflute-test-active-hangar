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
 * The flex DTO of MemberMonthlyPurchase.
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PURCHASE_MONTH, PURCHASE_PRICE_AVG, PURCHASE_PRICE_MAX, SERVICE_POINT_COUNT
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
public class BsMemberMonthlyPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberId:int;

    private var _memberName:String;

    private var _purchaseMonth:Date;

    private var _purchasePriceAvg:int;

    private var _purchasePriceMax:int;

    private var _servicePointCount:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get memberId():int {
        return _memberId;
    }

    public function set memberId(memberId:int):void {
        this._memberId = memberId;
    }

    public function get memberName():String {
        return _memberName;
    }

    public function set memberName(memberName:String):void {
        this._memberName = memberName;
    }

    public function get purchaseMonth():Date {
        return _purchaseMonth;
    }

    public function set purchaseMonth(purchaseMonth:Date):void {
        this._purchaseMonth = purchaseMonth;
    }

    public function get purchasePriceAvg():int {
        return _purchasePriceAvg;
    }

    public function set purchasePriceAvg(purchasePriceAvg:int):void {
        this._purchasePriceAvg = purchasePriceAvg;
    }

    public function get purchasePriceMax():int {
        return _purchasePriceMax;
    }

    public function set purchasePriceMax(purchasePriceMax:int):void {
        this._purchasePriceMax = purchasePriceMax;
    }

    public function get servicePointCount():int {
        return _servicePointCount;
    }

    public function set servicePointCount(servicePointCount:int):void {
        this._servicePointCount = servicePointCount;
    }

}

}
