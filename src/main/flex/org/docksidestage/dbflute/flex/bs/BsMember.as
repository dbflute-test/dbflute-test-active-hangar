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
 * The flex DTO of (会員)MEMBER as TABLE.
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     SEQ_MEMBER
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     MEMBER_STATUS, MEMBER_ADDRESS(AsValid), MEMBER_SERVICE(WithIfComment), MEMBER_SECURITY(AsOne), MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer-table]
 *     MEMBER_ADDRESS, MEMBER_FOLLOWING, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 *
 * [foreign-property]
 *     memberStatus, memberAddressAsValid, memberServiceWithIfComment, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer-property]
 *     memberAddressList, memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, memberLoginList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberId:int;

    private var _memberName:String;

    private var _memberAccount:String;

    private var _memberStatusCode:String;

    private var _formalizedDatetime:Date;

    private var _birthdate:Date;

    private var _registerDatetime:Date;

    private var _registerUser:String;

    private var _updateDatetime:Date;

    private var _updateUser:String;

    private var _versionNo:Number;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _memberStatus:MemberStatusDto;

    public function get memberStatus():MemberStatusDto {
        return _memberStatus;
    }

    public function set memberStatus(memberStatus:MemberStatusDto):void {
        this._memberStatus = memberStatus;
    }

    private var _memberAddressAsValid:MemberAddressDto;

    public function get memberAddressAsValid():MemberAddressDto {
        return _memberAddressAsValid;
    }

    public function set memberAddressAsValid(memberAddressAsValid:MemberAddressDto):void {
        this._memberAddressAsValid = memberAddressAsValid;
    }

    private var _memberServiceWithIfComment:MemberServiceDto;

    public function get memberServiceWithIfComment():MemberServiceDto {
        return _memberServiceWithIfComment;
    }

    public function set memberServiceWithIfComment(memberServiceWithIfComment:MemberServiceDto):void {
        this._memberServiceWithIfComment = memberServiceWithIfComment;
    }

    private var _memberSecurityAsOne:MemberSecurityDto;

    public function get memberSecurityAsOne():MemberSecurityDto {
        return _memberSecurityAsOne;
    }

    public function set memberSecurityAsOne(memberSecurityAsOne:MemberSecurityDto):void {
        this._memberSecurityAsOne = memberSecurityAsOne;
    }
    private var _memberServiceAsOne:MemberServiceDto;

    public function get memberServiceAsOne():MemberServiceDto {
        return _memberServiceAsOne;
    }

    public function set memberServiceAsOne(memberServiceAsOne:MemberServiceDto):void {
        this._memberServiceAsOne = memberServiceAsOne;
    }
    private var _memberWithdrawalAsOne:MemberWithdrawalDto;

    public function get memberWithdrawalAsOne():MemberWithdrawalDto {
        return _memberWithdrawalAsOne;
    }

    public function set memberWithdrawalAsOne(memberWithdrawalAsOne:MemberWithdrawalDto):void {
        this._memberWithdrawalAsOne = memberWithdrawalAsOne;
    }
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    MemberAddressDto;
    protected var _memberAddressList:ArrayCollection; /* of the entity 'MemberAddressDto'. */

    public function get memberAddressList():ArrayCollection {
        if (_memberAddressList == null) { _memberAddressList = new ArrayCollection(); }
        return _memberAddressList;
    }

    public function set memberAddressList(memberAddressList:ArrayCollection):void {
        this._memberAddressList = memberAddressList;
    }

    MemberFollowingDto;
    protected var _memberFollowingByMyMemberIdList:ArrayCollection; /* of the entity 'MemberFollowingDto'. */

    public function get memberFollowingByMyMemberIdList():ArrayCollection {
        if (_memberFollowingByMyMemberIdList == null) { _memberFollowingByMyMemberIdList = new ArrayCollection(); }
        return _memberFollowingByMyMemberIdList;
    }

    public function set memberFollowingByMyMemberIdList(memberFollowingByMyMemberIdList:ArrayCollection):void {
        this._memberFollowingByMyMemberIdList = memberFollowingByMyMemberIdList;
    }

    MemberFollowingDto;
    protected var _memberFollowingByYourMemberIdList:ArrayCollection; /* of the entity 'MemberFollowingDto'. */

    public function get memberFollowingByYourMemberIdList():ArrayCollection {
        if (_memberFollowingByYourMemberIdList == null) { _memberFollowingByYourMemberIdList = new ArrayCollection(); }
        return _memberFollowingByYourMemberIdList;
    }

    public function set memberFollowingByYourMemberIdList(memberFollowingByYourMemberIdList:ArrayCollection):void {
        this._memberFollowingByYourMemberIdList = memberFollowingByYourMemberIdList;
    }

    MemberLoginDto;
    protected var _memberLoginList:ArrayCollection; /* of the entity 'MemberLoginDto'. */

    public function get memberLoginList():ArrayCollection {
        if (_memberLoginList == null) { _memberLoginList = new ArrayCollection(); }
        return _memberLoginList;
    }

    public function set memberLoginList(memberLoginList:ArrayCollection):void {
        this._memberLoginList = memberLoginList;
    }

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

    public function get memberAccount():String {
        return _memberAccount;
    }

    public function set memberAccount(memberAccount:String):void {
        this._memberAccount = memberAccount;
    }

    public function get memberStatusCode():String {
        return _memberStatusCode;
    }

    public function set memberStatusCode(memberStatusCode:String):void {
        this._memberStatusCode = memberStatusCode;
    }

    public function get formalizedDatetime():Date {
        return _formalizedDatetime;
    }

    public function set formalizedDatetime(formalizedDatetime:Date):void {
        this._formalizedDatetime = formalizedDatetime;
    }

    public function get birthdate():Date {
        return _birthdate;
    }

    public function set birthdate(birthdate:Date):void {
        this._birthdate = birthdate;
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
