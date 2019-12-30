package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of (購入)PURCHASE as TABLE.
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     PUBLIC.SEQ_PURCHASE
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     MEMBER, PRODUCT, SUMMARY_PRODUCT, WHITE_DATE_TERM(AsValid), MEMBER_LOGIN(AsBizManyToOne)
 *
 * [referrer-table]
 *     PURCHASE_PAYMENT
 *
 * [foreign-property]
 *     member, product, summaryProduct, whiteDateTermAsValid, memberLoginAsBizManyToOne
 *
 * [referrer-property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _purchaseId:Number;

    private var _memberId:int;

    private var _productId:int;

    private var _purchaseDatetime:Date;

    private var _purchaseCount:int;

    private var _purchasePrice:int;

    private var _paymentCompleteFlg:int;

    private var _registerDatetime:Date;

    private var _registerUser:String;

    private var _updateDatetime:Date;

    private var _updateUser:String;

    private var _versionNo:Number;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _member:MemberDto;

    public function get member():MemberDto {
        return _member;
    }

    public function set member(member:MemberDto):void {
        this._member = member;
    }

    private var _product:ProductDto;

    public function get product():ProductDto {
        return _product;
    }

    public function set product(product:ProductDto):void {
        this._product = product;
    }

    private var _summaryProduct:SummaryProductDto;

    public function get summaryProduct():SummaryProductDto {
        return _summaryProduct;
    }

    public function set summaryProduct(summaryProduct:SummaryProductDto):void {
        this._summaryProduct = summaryProduct;
    }

    private var _whiteDateTermAsValid:WhiteDateTermDto;

    public function get whiteDateTermAsValid():WhiteDateTermDto {
        return _whiteDateTermAsValid;
    }

    public function set whiteDateTermAsValid(whiteDateTermAsValid:WhiteDateTermDto):void {
        this._whiteDateTermAsValid = whiteDateTermAsValid;
    }

    private var _memberLoginAsBizManyToOne:MemberLoginDto;

    public function get memberLoginAsBizManyToOne():MemberLoginDto {
        return _memberLoginAsBizManyToOne;
    }

    public function set memberLoginAsBizManyToOne(memberLoginAsBizManyToOne:MemberLoginDto):void {
        this._memberLoginAsBizManyToOne = memberLoginAsBizManyToOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    PurchasePaymentDto;
    protected var _purchasePaymentList:ArrayCollection; /* of the entity 'PurchasePaymentDto'. */

    public function get purchasePaymentList():ArrayCollection {
        if (_purchasePaymentList == null) { _purchasePaymentList = new ArrayCollection(); }
        return _purchasePaymentList;
    }

    public function set purchasePaymentList(purchasePaymentList:ArrayCollection):void {
        this._purchasePaymentList = purchasePaymentList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get purchaseId():Number {
        return _purchaseId;
    }

    public function set purchaseId(purchaseId:Number):void {
        this._purchaseId = purchaseId;
    }

    public function get memberId():int {
        return _memberId;
    }

    public function set memberId(memberId:int):void {
        this._memberId = memberId;
    }

    public function get productId():int {
        return _productId;
    }

    public function set productId(productId:int):void {
        this._productId = productId;
    }

    public function get purchaseDatetime():Date {
        return _purchaseDatetime;
    }

    public function set purchaseDatetime(purchaseDatetime:Date):void {
        this._purchaseDatetime = purchaseDatetime;
    }

    public function get purchaseCount():int {
        return _purchaseCount;
    }

    public function set purchaseCount(purchaseCount:int):void {
        this._purchaseCount = purchaseCount;
    }

    public function get purchasePrice():int {
        return _purchasePrice;
    }

    public function set purchasePrice(purchasePrice:int):void {
        this._purchasePrice = purchasePrice;
    }

    public function get paymentCompleteFlg():int {
        return _paymentCompleteFlg;
    }

    public function set paymentCompleteFlg(paymentCompleteFlg:int):void {
        this._paymentCompleteFlg = paymentCompleteFlg;
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
