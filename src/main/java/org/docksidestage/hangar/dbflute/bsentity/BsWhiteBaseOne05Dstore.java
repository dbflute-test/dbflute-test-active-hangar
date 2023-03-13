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
 * The entity of WHITE_BASE_ONE05_DSTORE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne05Dstore extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DSTORE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _dstoreId;

    /** DSTORE_NAME: {NotNull, VARCHAR(200)} */
    protected String _dstoreName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE05_DSTORE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dstoreId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE by DSTORE_ID, named 'whiteBaseList'. */
    protected List<WhiteBase> _whiteBaseList;

    /**
     * [get] WHITE_BASE by DSTORE_ID, named 'whiteBaseList'.
     * @return The entity list of referrer property 'whiteBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBase> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = newReferrerList(); }
        return _whiteBaseList;
    }

    /**
     * [set] WHITE_BASE by DSTORE_ID, named 'whiteBaseList'.
     * @param whiteBaseList The entity list of referrer property 'whiteBaseList'. (NullAllowed)
     */
    public void setWhiteBaseList(List<WhiteBase> whiteBaseList) {
        _whiteBaseList = whiteBaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne05Dstore) {
            BsWhiteBaseOne05Dstore other = (BsWhiteBaseOne05Dstore)obj;
            if (!xSV(_dstoreId, other._dstoreId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dstoreId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseList != null) { for (WhiteBase et : _whiteBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dstoreId));
        sb.append(dm).append(xfND(_dstoreName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseList != null && !_whiteBaseList.isEmpty())
        { sb.append(dm).append("whiteBaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne05Dstore clone() {
        return (WhiteBaseOne05Dstore)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DSTORE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DSTORE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDstoreId() {
        checkSpecifiedProperty("dstoreId");
        return _dstoreId;
    }

    /**
     * [set] DSTORE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param dstoreId The value of the column 'DSTORE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDstoreId(Integer dstoreId) {
        registerModifiedProperty("dstoreId");
        _dstoreId = dstoreId;
    }

    /**
     * [get] DSTORE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DSTORE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDstoreName() {
        checkSpecifiedProperty("dstoreName");
        return convertEmptyToNull(_dstoreName);
    }

    /**
     * [set] DSTORE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param dstoreName The value of the column 'DSTORE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDstoreName(String dstoreName) {
        registerModifiedProperty("dstoreName");
        _dstoreName = dstoreName;
    }
}
