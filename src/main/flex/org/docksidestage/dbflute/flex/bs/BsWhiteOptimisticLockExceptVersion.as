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
 * The flex DTO of WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION as TABLE.
 * <pre>
 * [primary-key]
 *     EXCEPT_VERSION_ID
 *
 * [column]
 *     EXCEPT_VERSION_ID, EXCEPT_VERSION_NAME, VERSION_NO
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
public class BsWhiteOptimisticLockExceptVersion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _exceptVersionId:Number;

    private var _exceptVersionName:String;

    private var _versionNo:Number;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get exceptVersionId():Number {
        return _exceptVersionId;
    }

    public function set exceptVersionId(exceptVersionId:Number):void {
        this._exceptVersionId = exceptVersionId;
    }

    public function get exceptVersionName():String {
        return _exceptVersionName;
    }

    public function set exceptVersionName(exceptVersionName:String):void {
        this._exceptVersionName = exceptVersionName;
    }

    public function get versionNo():Number {
        return _versionNo;
    }

    public function set versionNo(versionNo:Number):void {
        this._versionNo = versionNo;
    }

}

}
