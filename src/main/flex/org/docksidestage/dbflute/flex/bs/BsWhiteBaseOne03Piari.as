package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_BASE_ONE03_PIARI as TABLE.
 * <pre>
 * [primary-key]
 *     PIARI_ID
 *
 * [column]
 *     PIARI_ID, PIARI_NAME
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
 *     WHITE_BASE
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne03Piari {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _piariId:int;

    private var _piariName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteBaseDto;
    protected var _whiteBaseList:ArrayCollection; /* of the entity 'WhiteBaseDto'. */

    public function get whiteBaseList():ArrayCollection {
        if (_whiteBaseList == null) { _whiteBaseList = new ArrayCollection(); }
        return _whiteBaseList;
    }

    public function set whiteBaseList(whiteBaseList:ArrayCollection):void {
        this._whiteBaseList = whiteBaseList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get piariId():int {
        return _piariId;
    }

    public function set piariId(piariId:int):void {
        this._piariId = piariId;
    }

    public function get piariName():String {
        return _piariName;
    }

    public function set piariName(piariName:String):void {
        this._piariName = piariName;
    }

}

}
