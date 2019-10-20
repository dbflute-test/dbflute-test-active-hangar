package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_COMPOUND_PK as TABLE.
 * <pre>
 * [primary-key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, COMPOUND_PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_PK_REF_PHYSICAL, WHITE_COMPOUND_PK_REF_VIRTURL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteCompoundPkRefPhysicalList, whiteCompoundPkRefVirturlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteCompoundPk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _pkFirstId:Number;

    private var _pkSecondId:Number;

    private var _compoundPkName:String;

    private var _referredId:int;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteCompoundPkRefPhysicalDto;
    protected var _whiteCompoundPkRefPhysicalList:ArrayCollection; /* of the entity 'WhiteCompoundPkRefPhysicalDto'. */

    public function get whiteCompoundPkRefPhysicalList():ArrayCollection {
        if (_whiteCompoundPkRefPhysicalList == null) { _whiteCompoundPkRefPhysicalList = new ArrayCollection(); }
        return _whiteCompoundPkRefPhysicalList;
    }

    public function set whiteCompoundPkRefPhysicalList(whiteCompoundPkRefPhysicalList:ArrayCollection):void {
        this._whiteCompoundPkRefPhysicalList = whiteCompoundPkRefPhysicalList;
    }

    WhiteCompoundPkRefVirturlDto;
    protected var _whiteCompoundPkRefVirturlList:ArrayCollection; /* of the entity 'WhiteCompoundPkRefVirturlDto'. */

    public function get whiteCompoundPkRefVirturlList():ArrayCollection {
        if (_whiteCompoundPkRefVirturlList == null) { _whiteCompoundPkRefVirturlList = new ArrayCollection(); }
        return _whiteCompoundPkRefVirturlList;
    }

    public function set whiteCompoundPkRefVirturlList(whiteCompoundPkRefVirturlList:ArrayCollection):void {
        this._whiteCompoundPkRefVirturlList = whiteCompoundPkRefVirturlList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get pkFirstId():Number {
        return _pkFirstId;
    }

    public function set pkFirstId(pkFirstId:Number):void {
        this._pkFirstId = pkFirstId;
    }

    public function get pkSecondId():Number {
        return _pkSecondId;
    }

    public function set pkSecondId(pkSecondId:Number):void {
        this._pkSecondId = pkSecondId;
    }

    public function get compoundPkName():String {
        return _compoundPkName;
    }

    public function set compoundPkName(compoundPkName:String):void {
        this._compoundPkName = compoundPkName;
    }

    public function get referredId():int {
        return _referredId;
    }

    public function set referredId(referredId:int):void {
        this._referredId = referredId;
    }

}

}
