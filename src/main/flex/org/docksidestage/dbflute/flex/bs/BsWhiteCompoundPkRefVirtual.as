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
 * The flex DTO of WHITE_COMPOUND_PK_REF_VIRTUAL as TABLE.
 * <pre>
 * [primary-key]
 *     REF_FIRST_ID, REF_SECOND_ID, REF_THIRD_ID
 *
 * [column]
 *     REF_FIRST_ID, REF_SECOND_ID, REF_THIRD_ID, COMPOUND_REF_NAME
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
 *     WHITE_COMPOUND_PK
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteCompoundPk
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPkRefVirtual {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _refFirstId:Number;

    private var _refSecondId:Number;

    private var _refThirdId:Number;

    private var _compoundRefName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteCompoundPk:WhiteCompoundPkDto;

    public function get whiteCompoundPk():WhiteCompoundPkDto {
        return _whiteCompoundPk;
    }

    public function set whiteCompoundPk(whiteCompoundPk:WhiteCompoundPkDto):void {
        this._whiteCompoundPk = whiteCompoundPk;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get refFirstId():Number {
        return _refFirstId;
    }

    public function set refFirstId(refFirstId:Number):void {
        this._refFirstId = refFirstId;
    }

    public function get refSecondId():Number {
        return _refSecondId;
    }

    public function set refSecondId(refSecondId:Number):void {
        this._refSecondId = refSecondId;
    }

    public function get refThirdId():Number {
        return _refThirdId;
    }

    public function set refThirdId(refThirdId:Number):void {
        this._refThirdId = refThirdId;
    }

    public function get compoundRefName():String {
        return _compoundRefName;
    }

    public function set compoundRefName(compoundRefName:String):void {
        this._compoundRefName = compoundRefName;
    }

}

}
