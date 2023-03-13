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
 * The entity of WHITE_BASE_ONE01_SEA_DOCKSIDE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01SeaDockside extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DOCKSIDE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _docksideId;

    /** DOCKSIDE_NAME: {NotNull, VARCHAR(200)} */
    protected String _docksideName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE01_SEA_DOCKSIDE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_docksideId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaList'. */
    protected List<WhiteBaseOne01Sea> _whiteBaseOne01SeaList;

    /**
     * [get] WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaList'.
     * @return The entity list of referrer property 'whiteBaseOne01SeaList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBaseOne01Sea> getWhiteBaseOne01SeaList() {
        if (_whiteBaseOne01SeaList == null) { _whiteBaseOne01SeaList = newReferrerList(); }
        return _whiteBaseOne01SeaList;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaList'.
     * @param whiteBaseOne01SeaList The entity list of referrer property 'whiteBaseOne01SeaList'. (NullAllowed)
     */
    public void setWhiteBaseOne01SeaList(List<WhiteBaseOne01Sea> whiteBaseOne01SeaList) {
        _whiteBaseOne01SeaList = whiteBaseOne01SeaList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne01SeaDockside) {
            BsWhiteBaseOne01SeaDockside other = (BsWhiteBaseOne01SeaDockside)obj;
            if (!xSV(_docksideId, other._docksideId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _docksideId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01SeaList != null) { for (WhiteBaseOne01Sea et : _whiteBaseOne01SeaList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseOne01SeaList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_docksideId));
        sb.append(dm).append(xfND(_docksideName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01SeaList != null && !_whiteBaseOne01SeaList.isEmpty())
        { sb.append(dm).append("whiteBaseOne01SeaList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne01SeaDockside clone() {
        return (WhiteBaseOne01SeaDockside)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DOCKSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DOCKSIDE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDocksideId() {
        checkSpecifiedProperty("docksideId");
        return _docksideId;
    }

    /**
     * [set] DOCKSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param docksideId The value of the column 'DOCKSIDE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDocksideId(Integer docksideId) {
        registerModifiedProperty("docksideId");
        _docksideId = docksideId;
    }

    /**
     * [get] DOCKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DOCKSIDE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDocksideName() {
        checkSpecifiedProperty("docksideName");
        return convertEmptyToNull(_docksideName);
    }

    /**
     * [set] DOCKSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param docksideName The value of the column 'DOCKSIDE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDocksideName(String docksideName) {
        registerModifiedProperty("docksideName");
        _docksideName = docksideName;
    }
}
