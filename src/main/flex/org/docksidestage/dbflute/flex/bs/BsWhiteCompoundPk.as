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
 * The flex DTO of WHITE_COMPOUND_PK as TABLE.
 * <pre>
 * [primary-key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, COMPOUND_PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_PK_REF_PHYSICAL, WHITE_COMPOUND_PK_REF_VIRTUAL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteCompoundPkRefPhysicalList, whiteCompoundPkRefVirtualList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _pkFirstId:Number;

    private var _pkSecondId:Number;

    private var _compoundPkName:String;

    private var _referredId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteCompoundPkRefPhysicalDto;
    protected var _whiteCompoundPkRefPhysicalList:ArrayCollection; /* of the entity 'WhiteCompoundPkRefPhysicalDto'. */

    public function get whiteCompoundPkRefPhysicalList():ArrayCollection {
        if (_whiteCompoundPkRefPhysicalList == null) { _whiteCompoundPkRefPhysicalList = new ArrayCollection(); }
        return _whiteCompoundPkRefPhysicalList;
    }

    public function set whiteCompoundPkRefPhysicalList(whiteCompoundPkRefPhysicalList:ArrayCollection):void {
        this._whiteCompoundPkRefPhysicalList = whiteCompoundPkRefPhysicalList;
    }

    WhiteCompoundPkRefVirtualDto;
    protected var _whiteCompoundPkRefVirtualList:ArrayCollection; /* of the entity 'WhiteCompoundPkRefVirtualDto'. */

    public function get whiteCompoundPkRefVirtualList():ArrayCollection {
        if (_whiteCompoundPkRefVirtualList == null) { _whiteCompoundPkRefVirtualList = new ArrayCollection(); }
        return _whiteCompoundPkRefVirtualList;
    }

    public function set whiteCompoundPkRefVirtualList(whiteCompoundPkRefVirtualList:ArrayCollection):void {
        this._whiteCompoundPkRefVirtualList = whiteCompoundPkRefVirtualList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get pkFirstId():Number {
        return _pkFirstId;
    }

    public function set pkFirstId(pkFirstId:Number):void {
        this._pkFirstId = pkFirstId;
    }

    public function get pkSecondId():Number {
        return _pkSecondId;
    }

    public function set pkSecondId(pkSecondId:Number):void {
        this._pkSecondId = pkSecondId;
    }

    public function get compoundPkName():String {
        return _compoundPkName;
    }

    public function set compoundPkName(compoundPkName:String):void {
        this._compoundPkName = compoundPkName;
    }

    public function get referredId():int {
        return _referredId;
    }

    public function set referredId(referredId:int):void {
        this._referredId = referredId;
    }

}

}
