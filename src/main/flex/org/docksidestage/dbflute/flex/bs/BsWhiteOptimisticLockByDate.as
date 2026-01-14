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
 * The flex DTO of WHITE_OPTIMISTIC_LOCK_BY_DATE as TABLE.
 * <pre>
 * [primary-key]
 *     BY_DATE_ID
 *
 * [column]
 *     BY_DATE_ID, BY_DATE_NAME, UPDATE_DATE
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
public class BsWhiteOptimisticLockByDate {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _byDateId:Number;

    private var _byDateName:String;

    private var _updateDate:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get byDateId():Number {
        return _byDateId;
    }

    public function set byDateId(byDateId:Number):void {
        this._byDateId = byDateId;
    }

    public function get byDateName():String {
        return _byDateName;
    }

    public function set byDateName(byDateName:String):void {
        this._byDateName = byDateName;
    }

    public function get updateDate():Date {
        return _updateDate;
    }

    public function set updateDate(updateDate:Date):void {
        this._updateDate = updateDate;
    }

}

}
