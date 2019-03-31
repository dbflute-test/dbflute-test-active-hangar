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
