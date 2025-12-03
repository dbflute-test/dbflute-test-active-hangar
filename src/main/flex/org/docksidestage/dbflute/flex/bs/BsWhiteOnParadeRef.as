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
 * The flex DTO of (オンパレードれふ)WHITE_ON_PARADE_REF as TABLE.
 * <pre>
 * [primary-key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REF_NAME, NULLABLE_FK_ON_PARADE_ID, NULLABLE_FK_TO_MANY_ID
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
 *     WHITE_ON_PARADE, WHITE_ON_PARADE_NULLABLE_TO_MANY
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteOnParade, whiteOnParadeNullableToMany
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnParadeRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _refId:Number;

    private var _refName:String;

    private var _nullableFkOnParadeId:Number;

    private var _nullableFkToManyId:Number;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteOnParade:WhiteOnParadeDto;

    public function get whiteOnParade():WhiteOnParadeDto {
        return _whiteOnParade;
    }

    public function set whiteOnParade(whiteOnParade:WhiteOnParadeDto):void {
        this._whiteOnParade = whiteOnParade;
    }

    private var _whiteOnParadeNullableToMany:WhiteOnParadeNullableToManyDto;

    public function get whiteOnParadeNullableToMany():WhiteOnParadeNullableToManyDto {
        return _whiteOnParadeNullableToMany;
    }

    public function set whiteOnParadeNullableToMany(whiteOnParadeNullableToMany:WhiteOnParadeNullableToManyDto):void {
        this._whiteOnParadeNullableToMany = whiteOnParadeNullableToMany;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get refId():Number {
        return _refId;
    }

    public function set refId(refId:Number):void {
        this._refId = refId;
    }

    public function get refName():String {
        return _refName;
    }

    public function set refName(refName:String):void {
        this._refName = refName;
    }

    public function get nullableFkOnParadeId():Number {
        return _nullableFkOnParadeId;
    }

    public function set nullableFkOnParadeId(nullableFkOnParadeId:Number):void {
        this._nullableFkOnParadeId = nullableFkOnParadeId;
    }

    public function get nullableFkToManyId():Number {
        return _nullableFkToManyId;
    }

    public function set nullableFkToManyId(nullableFkToManyId:Number):void {
        this._nullableFkToManyId = nullableFkToManyId;
    }

}

}
