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
