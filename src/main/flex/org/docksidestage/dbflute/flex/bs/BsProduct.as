package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of (商品)PRODUCT as TABLE.
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     SEQ_MEMBER_LOGIN
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 *
 * [referrer-table]
 *     PURCHASE
 *
 * [foreign-property]
 *     productCategory, productStatus
 *
 * [referrer-property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _productId:int;

    private var _productName:String;

    private var _productHandleCode:String;

    private var _productCategoryCode:String;

    private var _productStatusCode:String;

    private var _regularPrice:int;

    private var _registerDatetime:Date;

    private var _registerUser:String;

    private var _updateDatetime:Date;

    private var _updateUser:String;

    private var _versionNo:Number;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _productCategory:ProductCategoryDto;

    public function get productCategory():ProductCategoryDto {
        return _productCategory;
    }

    public function set productCategory(productCategory:ProductCategoryDto):void {
        this._productCategory = productCategory;
    }

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

    public function get productCategoryCode():String {
        return _productCategoryCode;
    }

    public function set productCategoryCode(productCategoryCode:String):void {
        this._productCategoryCode = productCategoryCode;
    }

    public function get productStatusCode():String {
        return _productStatusCode;
    }

    public function set productStatusCode(productStatusCode:String):void {
        this._productStatusCode = productStatusCode;
    }

    public function get regularPrice():int {
        return _regularPrice;
    }

    public function set regularPrice(regularPrice:int):void {
        this._regularPrice = regularPrice;
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

    public function get updateDatetime():Date {
        return _updateDatetime;
    }

    public function set updateDatetime(updateDatetime:Date):void {
        this._updateDatetime = updateDatetime;
    }

    public function get updateUser():String {
        return _updateUser;
    }

    public function set updateUser(updateUser:String):void {
        this._updateUser = updateUser;
    }

    public function get versionNo():Number {
        return _versionNo;
    }

    public function set versionNo(versionNo:Number):void {
        this._versionNo = versionNo;
    }

}

}
