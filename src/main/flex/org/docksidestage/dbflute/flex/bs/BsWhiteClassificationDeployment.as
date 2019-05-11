package org.docksidestage.dbflute.flex.bs {

// *customization mark by jflute
import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of WHITE_CLASSIFICATION_DEPLOYMENT as TABLE.
 * <pre>
 * [primary-key]
 *     DEPLOYMENT_ID
 *
 * [column]
 *     DEPLOYMENT_ID, SEA_FLG, DEPLOYMENT_TYPE_CODE
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
public class BsWhiteClassificationDeployment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _deploymentId:Number;

    private var _seaFlg:int;

    private var _deploymentTypeCode:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get deploymentId():Number {
        return _deploymentId;
    }

    public function set deploymentId(deploymentId:Number):void {
        this._deploymentId = deploymentId;
    }

    public function get seaFlg():int {
        return _seaFlg;
    }

    public function set seaFlg(seaFlg:int):void {
        this._seaFlg = seaFlg;
    }

    public function get deploymentTypeCode():String {
        return _deploymentTypeCode;
    }

    public function set deploymentTypeCode(deploymentTypeCode:String):void {
        this._deploymentTypeCode = deploymentTypeCode;
    }

}

}
