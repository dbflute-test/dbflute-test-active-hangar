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
 * The flex DTO of SUMMARY_PRODUCT as VIEW.
 * <pre>
 * [primary-key]
 *     PRODUCT_ID, PRODUCT_NAME
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 *     PRODUCT_STATUS
 *
 * [referrer-table]
 *     PURCHASE
 *
 * [foreign-property]
 *     productStatus
 *
 * [referrer-property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsSummaryProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _productId:int;

    private var _productName:String;

    private var _productHandleCode:String;

    private var _productStatusCode:String;

    private var _latestPurchaseDatetime:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _productStatus:ProductStatusDto;

    public function get productStatus():ProductStatusDto {
        return _productStatus;
    }

    public function set productStatus(productStatus:ProductStatusDto):void {
        this._productStatus = productStatus;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    PurchaseDto;
    protected var _purchaseList:ArrayCollection; /* of the entity 'PurchaseDto'. */

    public function get purchaseList():ArrayCollection {
        if (_purchaseList == null) { _purchaseList = new ArrayCollection(); }
        return _purchaseList;
    }

    public function set purchaseList(purchaseList:ArrayCollection):void {
        this._purchaseList = purchaseList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get productId():int {
        return _productId;
    }

    public function set productId(productId:int):void {
        this._productId = productId;
    }

    public function get productName():String {
        return _productName;
    }

    public function set productName(productName:String):void {
        this._productName = productName;
    }

    public function get productHandleCode():String {
        return _productHandleCode;
    }

    public function set productHandleCode(productHandleCode:String):void {
        this._productHandleCode = productHandleCode;
    }

    public function get productStatusCode():String {
        return _productStatusCode;
    }

    public function set productStatusCode(productStatusCode:String):void {
        this._productStatusCode = productStatusCode;
    }

    public function get latestPurchaseDatetime():Date {
        return _latestPurchaseDatetime;
    }

    public function set latestPurchaseDatetime(latestPurchaseDatetime:Date):void {
        this._latestPurchaseDatetime = latestPurchaseDatetime;
    }

}

}
