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
 * The flex DTO of VENDOR_CHECK as TABLE.
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 *
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_CLOB, TYPE_OF_TEXT, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER_MIN, TYPE_OF_NUMERIC_INTEGER_MAX, TYPE_OF_NUMERIC_BIGINT_MIN, TYPE_OF_NUMERIC_BIGINT_MAX, TYPE_OF_NUMERIC_SUPERINT_MIN, TYPE_OF_NUMERIC_SUPERINT_MAX, TYPE_OF_NUMERIC_MAXDECIMAL, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_BOOLEAN, TYPE_OF_BINARY, TYPE_OF_BLOB, TYPE_OF_UUID, TYPE_OF_ARRAY, TYPE_OF_OTHER, J_A_V_A_BEANS_PROPERTY, J_POP_BEANS_PROPERTY
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
public class BsVendorCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _vendorCheckId:Number;

    private var _typeOfChar:String;

    private var _typeOfVarchar:String;

    private var _typeOfClob:String;

    private var _typeOfText:String;

    private var _typeOfNumericInteger:int;

    private var _typeOfNumericBigint:Number;

    private var _typeOfNumericDecimal:Number;

    private var _typeOfNumericIntegerMin:int;

    private var _typeOfNumericIntegerMax:int;

    private var _typeOfNumericBigintMin:Number;

    private var _typeOfNumericBigintMax:Number;

    private var _typeOfNumericSuperintMin:Number;

    private var _typeOfNumericSuperintMax:Number;

    private var _typeOfNumericMaxdecimal:Number;

    private var _typeOfInteger:int;

    private var _typeOfBigint:Number;

    private var _typeOfDate:Date;

    private var _typeOfTimestamp:Date;

    private var _typeOfTime:Date;

    private var _typeOfBoolean:Boolean;

    private var _typeOfBinary:Object;

    private var _typeOfBlob:Object;

    private var _typeOfUuid:Object;

    private var _typeOfArray:String;

    private var _typeOfOther:String;

    private var _jAVABeansProperty:String;

    private var _jPopBeansProperty:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get vendorCheckId():Number {
        return _vendorCheckId;
    }

    public function set vendorCheckId(vendorCheckId:Number):void {
        this._vendorCheckId = vendorCheckId;
    }

    public function get typeOfChar():String {
        return _typeOfChar;
    }

    public function set typeOfChar(typeOfChar:String):void {
        this._typeOfChar = typeOfChar;
    }

    public function get typeOfVarchar():String {
        return _typeOfVarchar;
    }

    public function set typeOfVarchar(typeOfVarchar:String):void {
        this._typeOfVarchar = typeOfVarchar;
    }

    public function get typeOfClob():String {
        return _typeOfClob;
    }

    public function set typeOfClob(typeOfClob:String):void {
        this._typeOfClob = typeOfClob;
    }

    public function get typeOfText():String {
        return _typeOfText;
    }

    public function set typeOfText(typeOfText:String):void {
        this._typeOfText = typeOfText;
    }

    public function get typeOfNumericInteger():int {
        return _typeOfNumericInteger;
    }

    public function set typeOfNumericInteger(typeOfNumericInteger:int):void {
        this._typeOfNumericInteger = typeOfNumericInteger;
    }

    public function get typeOfNumericBigint():Number {
        return _typeOfNumericBigint;
    }

    public function set typeOfNumericBigint(typeOfNumericBigint:Number):void {
        this._typeOfNumericBigint = typeOfNumericBigint;
    }

    public function get typeOfNumericDecimal():Number {
        return _typeOfNumericDecimal;
    }

    public function set typeOfNumericDecimal(typeOfNumericDecimal:Number):void {
        this._typeOfNumericDecimal = typeOfNumericDecimal;
    }

    public function get typeOfNumericIntegerMin():int {
        return _typeOfNumericIntegerMin;
    }

    public function set typeOfNumericIntegerMin(typeOfNumericIntegerMin:int):void {
        this._typeOfNumericIntegerMin = typeOfNumericIntegerMin;
    }

    public function get typeOfNumericIntegerMax():int {
        return _typeOfNumericIntegerMax;
    }

    public function set typeOfNumericIntegerMax(typeOfNumericIntegerMax:int):void {
        this._typeOfNumericIntegerMax = typeOfNumericIntegerMax;
    }

    public function get typeOfNumericBigintMin():Number {
        return _typeOfNumericBigintMin;
    }

    public function set typeOfNumericBigintMin(typeOfNumericBigintMin:Number):void {
        this._typeOfNumericBigintMin = typeOfNumericBigintMin;
    }

    public function get typeOfNumericBigintMax():Number {
        return _typeOfNumericBigintMax;
    }

    public function set typeOfNumericBigintMax(typeOfNumericBigintMax:Number):void {
        this._typeOfNumericBigintMax = typeOfNumericBigintMax;
    }

    public function get typeOfNumericSuperintMin():Number {
        return _typeOfNumericSuperintMin;
    }

    public function set typeOfNumericSuperintMin(typeOfNumericSuperintMin:Number):void {
        this._typeOfNumericSuperintMin = typeOfNumericSuperintMin;
    }

    public function get typeOfNumericSuperintMax():Number {
        return _typeOfNumericSuperintMax;
    }

    public function set typeOfNumericSuperintMax(typeOfNumericSuperintMax:Number):void {
        this._typeOfNumericSuperintMax = typeOfNumericSuperintMax;
    }

    public function get typeOfNumericMaxdecimal():Number {
        return _typeOfNumericMaxdecimal;
    }

    public function set typeOfNumericMaxdecimal(typeOfNumericMaxdecimal:Number):void {
        this._typeOfNumericMaxdecimal = typeOfNumericMaxdecimal;
    }

    public function get typeOfInteger():int {
        return _typeOfInteger;
    }

    public function set typeOfInteger(typeOfInteger:int):void {
        this._typeOfInteger = typeOfInteger;
    }

    public function get typeOfBigint():Number {
        return _typeOfBigint;
    }

    public function set typeOfBigint(typeOfBigint:Number):void {
        this._typeOfBigint = typeOfBigint;
    }

    public function get typeOfDate():Date {
        return _typeOfDate;
    }

    public function set typeOfDate(typeOfDate:Date):void {
        this._typeOfDate = typeOfDate;
    }

    public function get typeOfTimestamp():Date {
        return _typeOfTimestamp;
    }

    public function set typeOfTimestamp(typeOfTimestamp:Date):void {
        this._typeOfTimestamp = typeOfTimestamp;
    }

    public function get typeOfTime():Date {
        return _typeOfTime;
    }

    public function set typeOfTime(typeOfTime:Date):void {
        this._typeOfTime = typeOfTime;
    }

    public function get typeOfBoolean():Boolean {
        return _typeOfBoolean;
    }

    public function set typeOfBoolean(typeOfBoolean:Boolean):void {
        this._typeOfBoolean = typeOfBoolean;
    }

    public function get typeOfBinary():Object {
        return _typeOfBinary;
    }

    public function set typeOfBinary(typeOfBinary:Object):void {
        this._typeOfBinary = typeOfBinary;
    }

    public function get typeOfBlob():Object {
        return _typeOfBlob;
    }

    public function set typeOfBlob(typeOfBlob:Object):void {
        this._typeOfBlob = typeOfBlob;
    }

    public function get typeOfUuid():Object {
        return _typeOfUuid;
    }

    public function set typeOfUuid(typeOfUuid:Object):void {
        this._typeOfUuid = typeOfUuid;
    }

    public function get typeOfArray():String {
        return _typeOfArray;
    }

    public function set typeOfArray(typeOfArray:String):void {
        this._typeOfArray = typeOfArray;
    }

    public function get typeOfOther():String {
        return _typeOfOther;
    }

    public function set typeOfOther(typeOfOther:String):void {
        this._typeOfOther = typeOfOther;
    }

    public function get jAVABeansProperty():String {
        return _jAVABeansProperty;
    }

    public function set jAVABeansProperty(jAVABeansProperty:String):void {
        this._jAVABeansProperty = jAVABeansProperty;
    }

    public function get jPopBeansProperty():String {
        return _jPopBeansProperty;
    }

    public function set jPopBeansProperty(jPopBeansProperty:String):void {
        this._jPopBeansProperty = jPopBeansProperty;
    }

}

}
