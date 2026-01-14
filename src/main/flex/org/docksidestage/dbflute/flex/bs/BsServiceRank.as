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
 * The flex DTO of SERVICE_RANK as TABLE.
 * <pre>
 * [primary-key]
 *     SERVICE_RANK_CODE
 *
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _serviceRankCode:String;

    private var _serviceRankName:String;

    private var _servicePointIncidence:Number;

    private var _newAcceptableFlg:int;

    private var _description:String;

    private var _displayOrder:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    MemberServiceDto;
    protected var _memberServiceList:ArrayCollection; /* of the entity 'MemberServiceDto'. */

    public function get memberServiceList():ArrayCollection {
        if (_memberServiceList == null) { _memberServiceList = new ArrayCollection(); }
        return _memberServiceList;
    }

    public function set memberServiceList(memberServiceList:ArrayCollection):void {
        this._memberServiceList = memberServiceList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get serviceRankCode():String {
        return _serviceRankCode;
    }

    public function set serviceRankCode(serviceRankCode:String):void {
        this._serviceRankCode = serviceRankCode;
    }

    public function get serviceRankName():String {
        return _serviceRankName;
    }

    public function set serviceRankName(serviceRankName:String):void {
        this._serviceRankName = serviceRankName;
    }

    public function get servicePointIncidence():Number {
        return _servicePointIncidence;
    }

    public function set servicePointIncidence(servicePointIncidence:Number):void {
        this._servicePointIncidence = servicePointIncidence;
    }

    public function get newAcceptableFlg():int {
        return _newAcceptableFlg;
    }

    public function set newAcceptableFlg(newAcceptableFlg:int):void {
        this._newAcceptableFlg = newAcceptableFlg;
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
