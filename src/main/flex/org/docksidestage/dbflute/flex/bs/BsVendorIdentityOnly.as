package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of VENDOR_IDENTITY_ONLY as TABLE.
 * <pre>
 * [primary-key]
 *     IDENTITY_ONLY_ID
 *
 * [column]
 *     IDENTITY_ONLY_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IDENTITY_ONLY_ID
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
public class BsVendorIdentityOnly {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _identityOnlyId:Number;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get identityOnlyId():Number {
        return _identityOnlyId;
    }

    public function set identityOnlyId(identityOnlyId:Number):void {
        this._identityOnlyId = identityOnlyId;
    }

}

}
