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
 * The flex DTO of (地域)REGION as TABLE.
 * <pre>
 * [primary-key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _regionId:int;

    private var _regionName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
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


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get regionId():int {
        return _regionId;
    }

    public function set regionId(regionId:int):void {
        this._regionId = regionId;
    }

    public function get regionName():String {
        return _regionName;
    }

    public function set regionName(regionName:String):void {
        this._regionName = regionName;
    }

}

}
