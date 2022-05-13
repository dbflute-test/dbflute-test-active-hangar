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
 * The flex DTO of WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN as TABLE.
 * <pre>
 * [primary-key]
 *     SPECIFY_BATCH_COLUMN_ID
 *
 * [column]
 *     SPECIFY_BATCH_COLUMN_ID, SPECIFY_BATCH_COLUMN_NAME
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
public class BsWhiteDeprecatedSpecifyBatchColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _specifyBatchColumnId:Number;

    private var _specifyBatchColumnName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get specifyBatchColumnId():Number {
        return _specifyBatchColumnId;
    }

    public function set specifyBatchColumnId(specifyBatchColumnId:Number):void {
        this._specifyBatchColumnId = specifyBatchColumnId;
    }

    public function get specifyBatchColumnName():String {
        return _specifyBatchColumnName;
    }

    public function set specifyBatchColumnName(specifyBatchColumnName:String):void {
        this._specifyBatchColumnName = specifyBatchColumnName;
    }

}

}
