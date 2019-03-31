package org.docksidestage.dbflute.flex.bs.customize {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.customize.*;

/**
 * The flex DTO of OptionMember.
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, STATUS_DISPLAY_ORDER, DUMMY_FLG, DUMMY_NOFLG
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
public class BsOptionMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberId:int;

    private var _memberName:String;

    private var _birthdate:Date;

    private var _formalizedDatetime:Date;

    private var _memberStatusCode:String;

    private var _memberStatusName:String;

    private var _statusDisplayOrder:int;

    private var _dummyFlg:int;

    private var _dummyNoflg:int;


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

    public function get birthdate():Date {
        return _birthdate;
    }

    public function set birthdate(birthdate:Date):void {
        this._birthdate = birthdate;
    }

    public function get formalizedDatetime():Date {
        return _formalizedDatetime;
    }

    public function set formalizedDatetime(formalizedDatetime:Date):void {
        this._formalizedDatetime = formalizedDatetime;
    }

    public function get memberStatusCode():String {
        return _memberStatusCode;
    }

    public function set memberStatusCode(memberStatusCode:String):void {
        this._memberStatusCode = memberStatusCode;
    }

    public function get memberStatusName():String {
        return _memberStatusName;
    }

    public function set memberStatusName(memberStatusName:String):void {
        this._memberStatusName = memberStatusName;
    }

    public function get statusDisplayOrder():int {
        return _statusDisplayOrder;
    }

    public function set statusDisplayOrder(statusDisplayOrder:int):void {
        this._statusDisplayOrder = statusDisplayOrder;
    }

    public function get dummyFlg():int {
        return _dummyFlg;
    }

    public function set dummyFlg(dummyFlg:int):void {
        this._dummyFlg = dummyFlg;
    }

    public function get dummyNoflg():int {
        return _dummyNoflg;
    }

    public function set dummyNoflg(dummyNoflg:int):void {
        this._dummyNoflg = dummyNoflg;
    }

}

}
