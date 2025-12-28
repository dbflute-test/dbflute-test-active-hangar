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
 * The entity of (オンパレード)WHITE_ON_PARADE as TABLE. <br>
 * shalias:{ オンパレード }
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     WHITE_ON_PARADE_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteOnParadeRefList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long onParadeId = entity.getOnParadeId();
 * String onParadeName = entity.getOnParadeName();
 * entity.setOnParadeId(onParadeId);
 * entity.setOnParadeName(onParadeName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnParade extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ON_PARADE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _onParadeId;

    /** ON_PARADE_NAME: {NotNull, VARCHAR(100)} */
    protected String _onParadeName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_ON_PARADE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_onParadeId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (オンパレードREF or オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefList'. */
    protected List<WhiteOnParadeRef> _whiteOnParadeRefList;

    /**
     * [get] (オンパレードREF or オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefList'.
     * @return The entity list of referrer property 'whiteOnParadeRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteOnParadeRef> getWhiteOnParadeRefList() {
        if (_whiteOnParadeRefList == null) { _whiteOnParadeRefList = newReferrerList(); }
        return _whiteOnParadeRefList;
    }

    /**
     * [set] (オンパレードREF or オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefList'.
     * @param whiteOnParadeRefList The entity list of referrer property 'whiteOnParadeRefList'. (NullAllowed)
     */
    public void setWhiteOnParadeRefList(List<WhiteOnParadeRef> whiteOnParadeRefList) {
        _whiteOnParadeRefList = whiteOnParadeRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteOnParade) {
            BsWhiteOnParade other = (BsWhiteOnParade)obj;
            if (!xSV(_onParadeId, other._onParadeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _onParadeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnParadeRefList != null) { for (WhiteOnParadeRef et : _whiteOnParadeRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteOnParadeRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_onParadeId));
        sb.append(dm).append(xfND(_onParadeName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnParadeRefList != null && !_whiteOnParadeRefList.isEmpty())
        { sb.append(dm).append("whiteOnParadeRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteOnParade clone() {
        return (WhiteOnParade)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ON_PARADE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'ON_PARADE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getOnParadeId() {
        checkSpecifiedProperty("onParadeId");
        return _onParadeId;
    }

    /**
     * [set] ON_PARADE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param onParadeId The value of the column 'ON_PARADE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOnParadeId(Long onParadeId) {
        registerModifiedProperty("onParadeId");
        _onParadeId = onParadeId;
    }

    /**
     * [get] ON_PARADE_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'ON_PARADE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getOnParadeName() {
        checkSpecifiedProperty("onParadeName");
        return convertEmptyToNull(_onParadeName);
    }

    /**
     * [set] ON_PARADE_NAME: {NotNull, VARCHAR(100)} <br>
     * @param onParadeName The value of the column 'ON_PARADE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setOnParadeName(String onParadeName) {
        registerModifiedProperty("onParadeName");
        _onParadeName = onParadeName;
    }
}
