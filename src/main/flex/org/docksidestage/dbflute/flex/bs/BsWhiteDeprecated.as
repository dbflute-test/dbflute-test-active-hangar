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
 * The flex DTO of WHITE_DEPRECATED as TABLE.
 * <pre>
 * [primary-key]
 *     DEPRECATED_ID
 *
 * [column]
 *     DEPRECATED_ID, DEPRECATED_NAME, DEPRECATED_CODE
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
 *     WHITE_DEPRECATED_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteDeprecatedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDeprecated {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _deprecatedId:Number;

    private var _deprecatedName:String;

    private var _deprecatedCode:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteDeprecatedRefDto;
    protected var _whiteDeprecatedRefList:ArrayCollection; /* of the entity 'WhiteDeprecatedRefDto'. */

    public function get whiteDeprecatedRefList():ArrayCollection {
        if (_whiteDeprecatedRefList == null) { _whiteDeprecatedRefList = new ArrayCollection(); }
        return _whiteDeprecatedRefList;
    }

    public function set whiteDeprecatedRefList(whiteDeprecatedRefList:ArrayCollection):void {
        this._whiteDeprecatedRefList = whiteDeprecatedRefList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get deprecatedId():Number {
        return _deprecatedId;
    }

    public function set deprecatedId(deprecatedId:Number):void {
        this._deprecatedId = deprecatedId;
    }

    public function get deprecatedName():String {
        return _deprecatedName;
    }

    public function set deprecatedName(deprecatedName:String):void {
        this._deprecatedName = deprecatedName;
    }

    public function get deprecatedCode():String {
        return _deprecatedCode;
    }

    public function set deprecatedCode(deprecatedCode:String):void {
        this._deprecatedCode = deprecatedCode;
    }

}

}
