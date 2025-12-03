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
 * The entity of WHITE_ON_PARADE_NULLABLE_TO_MANY as TABLE.
 * <pre>
 * [primary-key]
 *     MANY_ID
 *
 * [column]
 *     MANY_ID, MANY_NAME
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
 * Long manyId = entity.getManyId();
 * String manyName = entity.getManyName();
 * entity.setManyId(manyId);
 * entity.setManyName(manyName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnParadeNullableToMany extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MANY_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _manyId;

    /** MANY_NAME: {NotNull, VARCHAR(100)} */
    protected String _manyName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_ON_PARADE_NULLABLE_TO_MANY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_manyId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefList'. */
    protected List<WhiteOnParadeRef> _whiteOnParadeRefList;

    /**
     * [get] (オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefList'.
     * @return The entity list of referrer property 'whiteOnParadeRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteOnParadeRef> getWhiteOnParadeRefList() {
        if (_whiteOnParadeRefList == null) { _whiteOnParadeRefList = newReferrerList(); }
        return _whiteOnParadeRefList;
    }

    /**
     * [set] (オンパレードれふ)WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefList'.
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
        if (obj instanceof BsWhiteOnParadeNullableToMany) {
            BsWhiteOnParadeNullableToMany other = (BsWhiteOnParadeNullableToMany)obj;
            if (!xSV(_manyId, other._manyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _manyId);
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
        sb.append(dm).append(xfND(_manyId));
        sb.append(dm).append(xfND(_manyName));
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
    public WhiteOnParadeNullableToMany clone() {
        return (WhiteOnParadeNullableToMany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'MANY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getManyId() {
        checkSpecifiedProperty("manyId");
        return _manyId;
    }

    /**
     * [set] MANY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param manyId The value of the column 'MANY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyId(Long manyId) {
        registerModifiedProperty("manyId");
        _manyId = manyId;
    }

    /**
     * [get] MANY_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'MANY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyName() {
        checkSpecifiedProperty("manyName");
        return convertEmptyToNull(_manyName);
    }

    /**
     * [set] MANY_NAME: {NotNull, VARCHAR(100)} <br>
     * @param manyName The value of the column 'MANY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyName(String manyName) {
        registerModifiedProperty("manyName");
        _manyName = manyName;
    }
}
