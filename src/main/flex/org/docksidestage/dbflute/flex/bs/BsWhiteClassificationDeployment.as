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
