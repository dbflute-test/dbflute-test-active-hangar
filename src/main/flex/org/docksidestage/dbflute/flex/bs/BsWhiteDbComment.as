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
 * The flex DTO of (DBコメント)WHITE_DB_COMMENT as TABLE.
 * <pre>
 * [primary-key]
 *     DB_COMMENT_ID
 *
 * [column]
 *     DB_COMMENT_ID, DB_COMMENT_NAME
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
public class BsWhiteDbComment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _dbCommentId:Number;

    private var _dbCommentName:String;


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

}

}
