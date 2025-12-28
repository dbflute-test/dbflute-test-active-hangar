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
 * The flex DTO of (オンパレード)WHITE_ON_PARADE as TABLE.
 * <pre>
 * [primary-key]
 *     ON_PARADE_ID
 *
 * [column]
 *     ON_PARADE_ID, ON_PARADE_NAME
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
 *     WHITE_ON_PARADE_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteOnParadeRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteOnParade {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _onParadeId:Number;

    private var _onParadeName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    WhiteOnParadeRefDto;
    protected var _whiteOnParadeRefList:ArrayCollection; /* of the entity 'WhiteOnParadeRefDto'. */

    public function get whiteOnParadeRefList():ArrayCollection {
        if (_whiteOnParadeRefList == null) { _whiteOnParadeRefList = new ArrayCollection(); }
        return _whiteOnParadeRefList;
    }

    public function set whiteOnParadeRefList(whiteOnParadeRefList:ArrayCollection):void {
        this._whiteOnParadeRefList = whiteOnParadeRefList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get onParadeId():Number {
        return _onParadeId;
    }

    public function set onParadeId(onParadeId:Number):void {
        this._onParadeId = onParadeId;
    }

    public function get onParadeName():String {
        return _onParadeName;
    }

    public function set onParadeName(onParadeName:String):void {
        this._onParadeName = onParadeName;
    }

}

}
