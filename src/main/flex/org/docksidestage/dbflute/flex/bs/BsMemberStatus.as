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
 * The flex DTO of (会員ステータス)MEMBER_STATUS as TABLE.
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _memberStatusCode:String;

    private var _memberStatusName:String;

    private var _description:String;

    private var _displayOrder:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    MemberDto;
    protected var _memberList:ArrayCollection; /* of the entity 'MemberDto'. */

    public function get memberList():ArrayCollection {
        if (_memberList == null) { _memberList = new ArrayCollection(); }
        return _memberList;
    }

    public function set memberList(memberList:ArrayCollection):void {
        this._memberList = memberList;
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


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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

    public function get description():String {
        return _description;
    }

    public function set description(description:String):void {
        this._description = description;
    }

    public function get displayOrder():int {
        return _displayOrder;
    }

    public function set displayOrder(displayOrder:int):void {
        this._displayOrder = displayOrder;
    }

}

}
