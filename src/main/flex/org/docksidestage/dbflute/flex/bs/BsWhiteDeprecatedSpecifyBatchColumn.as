package org.docksidestage.dbflute.flex.bs {

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
