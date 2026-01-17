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
 * The flex DTO of WHITE_LOADING_DATE_ADJUSTMENT as TABLE.
 * <pre>
 * [primary-key]
 *     DATE_ADJUSTMENT_ID
 *
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATE_SEA, ADJUSTED_DATE_HANGAR, ADJUSTED_DATE_MYSTIC, ADJUSTED_DATETIME, ADJUSTED_DATETIME_LAND, ADJUSTED_DATETIME_SHOWBASE, ADJUSTED_DATETIME_ONEMAN, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING_LONG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
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
public class BsWhiteLoadingDateAdjustment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dateAdjustmentId:Number;

    private var _adjustedDate:Date;

    private var _adjustedDateSea:Date;

    private var _adjustedDateHangar:Date;

    private var _adjustedDateMystic:Date;

    private var _adjustedDatetime:Date;

    private var _adjustedDatetimeLand:Date;

    private var _adjustedDatetimeShowbase:Date;

    private var _adjustedDatetimeOneman:Date;

    private var _adjustedTime:Date;

    private var _adjustedInteger:int;

    private var _adjustedPlainLong:Number;

    private var _adjustedStringLong:String;

    private var _registerDatetime:Date;

    private var _registerUser:String;

    private var _updateDatetime:Date;

    private var _updateUser:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get dateAdjustmentId():Number {
        return _dateAdjustmentId;
    }

    public function set dateAdjustmentId(dateAdjustmentId:Number):void {
        this._dateAdjustmentId = dateAdjustmentId;
    }

    public function get adjustedDate():Date {
        return _adjustedDate;
    }

    public function set adjustedDate(adjustedDate:Date):void {
        this._adjustedDate = adjustedDate;
    }

    public function get adjustedDateSea():Date {
        return _adjustedDateSea;
    }

    public function set adjustedDateSea(adjustedDateSea:Date):void {
        this._adjustedDateSea = adjustedDateSea;
    }

    public function get adjustedDateHangar():Date {
        return _adjustedDateHangar;
    }

    public function set adjustedDateHangar(adjustedDateHangar:Date):void {
        this._adjustedDateHangar = adjustedDateHangar;
    }

    public function get adjustedDateMystic():Date {
        return _adjustedDateMystic;
    }

    public function set adjustedDateMystic(adjustedDateMystic:Date):void {
        this._adjustedDateMystic = adjustedDateMystic;
    }

    public function get adjustedDatetime():Date {
        return _adjustedDatetime;
    }

    public function set adjustedDatetime(adjustedDatetime:Date):void {
        this._adjustedDatetime = adjustedDatetime;
    }

    public function get adjustedDatetimeLand():Date {
        return _adjustedDatetimeLand;
    }

    public function set adjustedDatetimeLand(adjustedDatetimeLand:Date):void {
        this._adjustedDatetimeLand = adjustedDatetimeLand;
    }

    public function get adjustedDatetimeShowbase():Date {
        return _adjustedDatetimeShowbase;
    }

    public function set adjustedDatetimeShowbase(adjustedDatetimeShowbase:Date):void {
        this._adjustedDatetimeShowbase = adjustedDatetimeShowbase;
    }

    public function get adjustedDatetimeOneman():Date {
        return _adjustedDatetimeOneman;
    }

    public function set adjustedDatetimeOneman(adjustedDatetimeOneman:Date):void {
        this._adjustedDatetimeOneman = adjustedDatetimeOneman;
    }

    public function get adjustedTime():Date {
        return _adjustedTime;
    }

    public function set adjustedTime(adjustedTime:Date):void {
        this._adjustedTime = adjustedTime;
    }

    public function get adjustedInteger():int {
        return _adjustedInteger;
    }

    public function set adjustedInteger(adjustedInteger:int):void {
        this._adjustedInteger = adjustedInteger;
    }

    public function get adjustedPlainLong():Number {
        return _adjustedPlainLong;
    }

    public function set adjustedPlainLong(adjustedPlainLong:Number):void {
        this._adjustedPlainLong = adjustedPlainLong;
    }

    public function get adjustedStringLong():String {
        return _adjustedStringLong;
    }

    public function set adjustedStringLong(adjustedStringLong:String):void {
        this._adjustedStringLong = adjustedStringLong;
    }

    public function get registerDatetime():Date {
        return _registerDatetime;
    }

    public function set registerDatetime(registerDatetime:Date):void {
        this._registerDatetime = registerDatetime;
    }

    public function get registerUser():String {
        return _registerUser;
    }

    public function set registerUser(registerUser:String):void {
        this._registerUser = registerUser;
    }

    public function get updateDatetime():Date {
        return _updateDatetime;
    }

    public function set updateDatetime(updateDatetime:Date):void {
        this._updateDatetime = updateDatetime;
    }

    public function get updateUser():String {
        return _updateUser;
    }

    public function set updateUser(updateUser:String):void {
        this._updateUser = updateUser;
    }

}

}
