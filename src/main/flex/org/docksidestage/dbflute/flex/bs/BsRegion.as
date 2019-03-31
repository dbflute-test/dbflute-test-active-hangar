package org.docksidestage.dbflute.flex.bs {

import mx.collections.ArrayCollection;
import org.docksidestage.dbflute.flex.ex.*;

/**
 * The flex DTO of (地域)REGION as TABLE.
 * <pre>
 * [primary-key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _regionId:int;

    private var _regionName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    MemberAddressDto;
    protected var _memberAddressList:ArrayCollection; /* of the entity 'MemberAddressDto'. */

    public function get memberAddressList():ArrayCollection {
        if (_memberAddressList == null) { _memberAddressList = new ArrayCollection(); }
        return _memberAddressList;
    }

    public function set memberAddressList(memberAddressList:ArrayCollection):void {
        this._memberAddressList = memberAddressList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get regionId():int {
        return _regionId;
    }

    public function set regionId(regionId:int):void {
        this._regionId = regionId;
    }

    public function get regionName():String {
        return _regionName;
    }

    public function set regionName(regionName:String):void {
        this._regionName = regionName;
    }

}

}
