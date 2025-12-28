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
package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_ZONE_ARRANGE as TABLE.
 * <pre>
 * [primary-key]
 *     ARRANGE_ID
 *
 * [column]
 *     ARRANGE_ID, ARRANGE_NAME, ORDER
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer arrangeId = entity.getArrangeId();
 * String arrangeName = entity.getArrangeName();
 * Integer order = entity.getOrder();
 * entity.setArrangeId(arrangeId);
 * entity.setArrangeName(arrangeName);
 * entity.setOrder(order);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteZoneArrange extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ARRANGE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _arrangeId;

    /** ARRANGE_NAME: {NotNull, VARCHAR(200)} */
    protected String _arrangeName;

    /** ORDER: {INTEGER(10)} */
    protected Integer _order;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_ZONE_ARRANGE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_arrangeId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteZoneArrange) {
            BsWhiteZoneArrange other = (BsWhiteZoneArrange)obj;
            if (!xSV(_arrangeId, other._arrangeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _arrangeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_arrangeId));
        sb.append(dm).append(xfND(_arrangeName));
        sb.append(dm).append(xfND(_order));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteZoneArrange clone() {
        return (WhiteZoneArrange)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ARRANGE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'ARRANGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getArrangeId() {
        checkSpecifiedProperty("arrangeId");
        return _arrangeId;
    }

    /**
     * [set] ARRANGE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param arrangeId The value of the column 'ARRANGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArrangeId(Integer arrangeId) {
        registerModifiedProperty("arrangeId");
        _arrangeId = arrangeId;
    }

    /**
     * [get] ARRANGE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'ARRANGE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getArrangeName() {
        checkSpecifiedProperty("arrangeName");
        return convertEmptyToNull(_arrangeName);
    }

    /**
     * [set] ARRANGE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param arrangeName The value of the column 'ARRANGE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setArrangeName(String arrangeName) {
        registerModifiedProperty("arrangeName");
        _arrangeName = arrangeName;
    }

    /**
     * [get] ORDER: {INTEGER(10)} <br>
     * @return The value of the column 'ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOrder() {
        checkSpecifiedProperty("order");
        return _order;
    }

    /**
     * [set] ORDER: {INTEGER(10)} <br>
     * @param order The value of the column 'ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrder(Integer order) {
        registerModifiedProperty("order");
        _order = order;
    }
}
