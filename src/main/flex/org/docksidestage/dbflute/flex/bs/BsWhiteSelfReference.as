package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_SELF_REFERENCE as TABLE.
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     WHITE_SELF_REFERENCE
 *
 * [referrer-table]
 *     WHITE_SELF_REFERENCE
 *
 * [foreign-property]
 *     whiteSelfReferenceSelf
 *
 * [referrer-property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSelfReference {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _selfReferenceId:int;

    private var _selfReferenceName:String;

    private var _parentId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _whiteSelfReferenceSelf:WhiteSelfReferenceDto;

    public function get whiteSelfReferenceSelf():WhiteSelfReferenceDto {
        return _whiteSelfReferenceSelf;
    }

    public function set whiteSelfReferenceSelf(whiteSelfReferenceSelf:WhiteSelfReferenceDto):void {
        this._whiteSelfReferenceSelf = whiteSelfReferenceSelf;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteSelfReferenceDto;
    protected var _whiteSelfReferenceSelfList:ArrayCollection; /* of the entity 'WhiteSelfReferenceDto'. */

    public function get whiteSelfReferenceSelfList():ArrayCollection {
        if (_whiteSelfReferenceSelfList == null) { _whiteSelfReferenceSelfList = new ArrayCollection(); }
        return _whiteSelfReferenceSelfList;
    }

    public function set whiteSelfReferenceSelfList(whiteSelfReferenceSelfList:ArrayCollection):void {
        this._whiteSelfReferenceSelfList = whiteSelfReferenceSelfList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get selfReferenceId():int {
        return _selfReferenceId;
    }

    public function set selfReferenceId(selfReferenceId:int):void {
        this._selfReferenceId = selfReferenceId;
    }

    public function get selfReferenceName():String {
        return _selfReferenceName;
    }

    public function set selfReferenceName(selfReferenceName:String):void {
        this._selfReferenceName = selfReferenceName;
    }

    public function get parentId():int {
        return _parentId;
    }

    public function set parentId(parentId:int):void {
        this._parentId = parentId;
    }

}

}
