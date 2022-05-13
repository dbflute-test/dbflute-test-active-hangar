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
 * The entity of WHITE_BASE_ONE04_BONVO_PARKSIDE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PARKSIDE_ID
 *
 * [column]
 *     PARKSIDE_ID, PARKSIDE_NAME
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
 *     WHITE_BASE_ONE04_BONVO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne04BonvoList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer parksideId = entity.getParksideId();
 * String parksideName = entity.getParksideName();
 * entity.setParksideId(parksideId);
 * entity.setParksideName(parksideName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne04BonvoParkside extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PARKSIDE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _parksideId;

    /** PARKSIDE_NAME: {NotNull, VARCHAR(200)} */
    protected String _parksideName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE04_BONVO_PARKSIDE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_parksideId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'. */
    protected List<WhiteBaseOne04Bonvo> _whiteBaseOne04BonvoList;

    /**
     * [get] WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * @return The entity list of referrer property 'whiteBaseOne04BonvoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBaseOne04Bonvo> getWhiteBaseOne04BonvoList() {
        if (_whiteBaseOne04BonvoList == null) { _whiteBaseOne04BonvoList = newReferrerList(); }
        return _whiteBaseOne04BonvoList;
    }

    /**
     * [set] WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * @param whiteBaseOne04BonvoList The entity list of referrer property 'whiteBaseOne04BonvoList'. (NullAllowed)
     */
    public void setWhiteBaseOne04BonvoList(List<WhiteBaseOne04Bonvo> whiteBaseOne04BonvoList) {
        _whiteBaseOne04BonvoList = whiteBaseOne04BonvoList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne04BonvoParkside) {
            BsWhiteBaseOne04BonvoParkside other = (BsWhiteBaseOne04BonvoParkside)obj;
            if (!xSV(_parksideId, other._parksideId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _parksideId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne04BonvoList != null) { for (WhiteBaseOne04Bonvo et : _whiteBaseOne04BonvoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseOne04BonvoList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_parksideId));
        sb.append(dm).append(xfND(_parksideName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne04BonvoList != null && !_whiteBaseOne04BonvoList.isEmpty())
        { sb.append(dm).append("whiteBaseOne04BonvoList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne04BonvoParkside clone() {
        return (WhiteBaseOne04BonvoParkside)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PARKSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PARKSIDE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParksideId() {
        checkSpecifiedProperty("parksideId");
        return _parksideId;
    }

    /**
     * [set] PARKSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param parksideId The value of the column 'PARKSIDE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setParksideId(Integer parksideId) {
        registerModifiedProperty("parksideId");
        _parksideId = parksideId;
    }

    /**
     * [get] PARKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PARKSIDE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getParksideName() {
        checkSpecifiedProperty("parksideName");
        return convertEmptyToNull(_parksideName);
    }

    /**
     * [set] PARKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param parksideName The value of the column 'PARKSIDE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setParksideName(String parksideName) {
        registerModifiedProperty("parksideName");
        _parksideName = parksideName;
    }
}
