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
 * The flex DTO of (DBコメント追加的)WHITE_DB_COMMENT_ADDITIONAL as TABLE.
 * <pre>
 * [primary-key]
 *     DB_COMMENT_ID
 *
 * [column]
 *     DB_COMMENT_ID, DB_COMMENT_NAME, DB_COMMENT_COUNT, DB_COMMENT_DATE, DB_COMMENT_DATETIME
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
public class BsWhiteDbCommentAdditional {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dbCommentId:Number;

    private var _dbCommentName:String;

    private var _dbCommentCount:int;

    private var _dbCommentDate:Date;

    private var _dbCommentDatetime:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get dbCommentId():Number {
        return _dbCommentId;
    }

    public function set dbCommentId(dbCommentId:Number):void {
        this._dbCommentId = dbCommentId;
    }

    public function get dbCommentName():String {
        return _dbCommentName;
    }

    public function set dbCommentName(dbCommentName:String):void {
        this._dbCommentName = dbCommentName;
    }

    public function get dbCommentCount():int {
        return _dbCommentCount;
    }

    public function set dbCommentCount(dbCommentCount:int):void {
        this._dbCommentCount = dbCommentCount;
    }

    public function get dbCommentDate():Date {
        return _dbCommentDate;
    }

    public function set dbCommentDate(dbCommentDate:Date):void {
        this._dbCommentDate = dbCommentDate;
    }

    public function get dbCommentDatetime():Date {
        return _dbCommentDatetime;
    }

    public function set dbCommentDatetime(dbCommentDatetime:Date):void {
        this._dbCommentDatetime = dbCommentDatetime;
    }

}

}
