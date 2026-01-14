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
 * The flex DTO of PRODUCT_CATEGORY as TABLE.
 * <pre>
 * [primary-key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     PRODUCT_CATEGORY
 *
 * [referrer-table]
 *     PRODUCT, PRODUCT_CATEGORY
 *
 * [foreign-property]
 *     productCategorySelf
 *
 * [referrer-property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _productCategoryCode:String;

    private var _productCategoryName:String;

    private var _parentCategoryCode:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _productCategorySelf:ProductCategoryDto;

    public function get productCategorySelf():ProductCategoryDto {
        return _productCategorySelf;
    }

    public function set productCategorySelf(productCategorySelf:ProductCategoryDto):void {
        this._productCategorySelf = productCategorySelf;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    ProductDto;
    protected var _productList:ArrayCollection; /* of the entity 'ProductDto'. */

    public function get productList():ArrayCollection {
        if (_productList == null) { _productList = new ArrayCollection(); }
        return _productList;
    }

    public function set productList(productList:ArrayCollection):void {
        this._productList = productList;
    }

    ProductCategoryDto;
    protected var _productCategorySelfList:ArrayCollection; /* of the entity 'ProductCategoryDto'. */

    public function get productCategorySelfList():ArrayCollection {
        if (_productCategorySelfList == null) { _productCategorySelfList = new ArrayCollection(); }
        return _productCategorySelfList;
    }

    public function set productCategorySelfList(productCategorySelfList:ArrayCollection):void {
        this._productCategorySelfList = productCategorySelfList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get productCategoryCode():String {
        return _productCategoryCode;
    }

    public function set productCategoryCode(productCategoryCode:String):void {
        this._productCategoryCode = productCategoryCode;
    }

    public function get productCategoryName():String {
        return _productCategoryName;
    }

    public function set productCategoryName(productCategoryName:String):void {
        this._productCategoryName = productCategoryName;
    }

    public function get parentCategoryCode():String {
        return _parentCategoryCode;
    }

    public function set parentCategoryCode(parentCategoryCode:String):void {
        this._parentCategoryCode = parentCategoryCode;
    }

}

}
