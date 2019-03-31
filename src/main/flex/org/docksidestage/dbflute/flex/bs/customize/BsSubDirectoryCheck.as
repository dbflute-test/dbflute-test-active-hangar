package org.docksidestage.dbflute.flex.bs.customize {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.customize.*;

/**
 * The flex DTO of SubDirectoryCheck.
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_NAME
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
public class BsSubDirectoryCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberId:int;

    private var _memberName:String;

    private var _memberStatusName:String;


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

    public function get memberStatusName():String {
        return _memberStatusName;
    }

    public function set memberStatusName(memberStatusName:String):void {
        this._memberStatusName = memberStatusName;
    }

}

}
