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
 * The flex DTO of WHITE_DEPRECATED_REF as TABLE.
 * <pre>
 * [primary-key]
 *     DEPRECATED_REF_ID
 *
 * [column]
 *     DEPRECATED_REF_ID, DEPRECATED_ID, DEPRECATED_REF_NAME, DEPRECATED_REF_CODE, PRODUCT_ID
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
 *     WHITE_DEPRECATED, PRODUCT
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteDeprecated, product
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteDeprecatedRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _deprecatedRefId:Number;

    private var _deprecatedId:Number;

    private var _deprecatedRefName:String;

    private var _deprecatedRefCode:String;

    private var _productId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteDeprecated:WhiteDeprecatedDto;

    public function get whiteDeprecated():WhiteDeprecatedDto {
        return _whiteDeprecated;
    }

    public function set whiteDeprecated(whiteDeprecated:WhiteDeprecatedDto):void {
        this._whiteDeprecated = whiteDeprecated;
    }

    private var _product:ProductDto;

    public function get product():ProductDto {
        return _product;
    }

    public function set product(product:ProductDto):void {
        this._product = product;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get deprecatedRefId():Number {
        return _deprecatedRefId;
    }

    public function set deprecatedRefId(deprecatedRefId:Number):void {
        this._deprecatedRefId = deprecatedRefId;
    }

    public function get deprecatedId():Number {
        return _deprecatedId;
    }

    public function set deprecatedId(deprecatedId:Number):void {
        this._deprecatedId = deprecatedId;
    }

    public function get deprecatedRefName():String {
        return _deprecatedRefName;
    }

    public function set deprecatedRefName(deprecatedRefName:String):void {
        this._deprecatedRefName = deprecatedRefName;
    }

    public function get deprecatedRefCode():String {
        return _deprecatedRefCode;
    }

    public function set deprecatedRefCode(deprecatedRefCode:String):void {
        this._deprecatedRefCode = deprecatedRefCode;
    }

    public function get productId():int {
        return _productId;
    }

    public function set productId(productId:int):void {
        this._productId = productId;
    }

}

}
