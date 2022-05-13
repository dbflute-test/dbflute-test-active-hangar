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
 * The flex DTO of (会員フォローイング)MEMBER_FOLLOWING as TABLE.
 * <pre>
 * [primary-key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     MEMBER
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberFollowingId:Number;

    private var _myMemberId:int;

    private var _yourMemberId:int;

    private var _followDatetime:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _memberByMyMemberId:MemberDto;

    public function get memberByMyMemberId():MemberDto {
        return _memberByMyMemberId;
    }

    public function set memberByMyMemberId(memberByMyMemberId:MemberDto):void {
        this._memberByMyMemberId = memberByMyMemberId;
    }

    private var _memberByYourMemberId:MemberDto;

    public function get memberByYourMemberId():MemberDto {
        return _memberByYourMemberId;
    }

    public function set memberByYourMemberId(memberByYourMemberId:MemberDto):void {
        this._memberByYourMemberId = memberByYourMemberId;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get memberFollowingId():Number {
        return _memberFollowingId;
    }

    public function set memberFollowingId(memberFollowingId:Number):void {
        this._memberFollowingId = memberFollowingId;
    }

    public function get myMemberId():int {
        return _myMemberId;
    }

    public function set myMemberId(myMemberId:int):void {
        this._myMemberId = myMemberId;
    }

    public function get yourMemberId():int {
        return _yourMemberId;
    }

    public function set yourMemberId(yourMemberId:int):void {
        this._yourMemberId = yourMemberId;
    }

    public function get followDatetime():Date {
        return _followDatetime;
    }

    public function set followDatetime(followDatetime:Date):void {
        this._followDatetime = followDatetime;
    }

}

}
