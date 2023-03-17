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

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_BASE_ONE09_PALM as TABLE.
 * <pre>
 * [primary-key]
 *     PALM_ID
 *
 * [column]
 *     PALM_ID, PALM_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBase
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer palmId = entity.getPalmId();
 * String palmName = entity.getPalmName();
 * Integer baseId = entity.getBaseId();
 * entity.setPalmId(palmId);
 * entity.setPalmName(palmName);
 * entity.setBaseId(baseId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne09Palm extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PALM_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _palmId;

    /** PALM_NAME: {NotNull, VARCHAR(200)} */
    protected String _palmName;

    /** BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} */
    protected Integer _baseId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE09_PALM";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_palmId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param baseId : UQ, NotNull, INTEGER(10), FK to WHITE_BASE. (NotNull)
     */
    public void uniqueBy(Integer baseId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("baseId");
        setBaseId(baseId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE by my BASE_ID, named 'whiteBase'. */
    protected OptionalEntity<WhiteBase> _whiteBase;

    /**
     * [get] WHITE_BASE by my BASE_ID, named 'whiteBase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBase> getWhiteBase() {
        if (_whiteBase == null) { _whiteBase = OptionalEntity.relationEmpty(this, "whiteBase"); }
        return _whiteBase;
    }

    /**
     * [set] WHITE_BASE by my BASE_ID, named 'whiteBase'.
     * @param whiteBase The entity of foreign property 'whiteBase'. (NullAllowed)
     */
    public void setWhiteBase(OptionalEntity<WhiteBase> whiteBase) {
        _whiteBase = whiteBase;
    }

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
        if (obj instanceof BsWhiteBaseOne09Palm) {
            BsWhiteBaseOne09Palm other = (BsWhiteBaseOne09Palm)obj;
            if (!xSV(_palmId, other._palmId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _palmId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBase != null && _whiteBase.isPresent())
        { sb.append(li).append(xbRDS(_whiteBase, "whiteBase")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_palmId));
        sb.append(dm).append(xfND(_palmName));
        sb.append(dm).append(xfND(_baseId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBase != null && _whiteBase.isPresent())
        { sb.append(dm).append("whiteBase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne09Palm clone() {
        return (WhiteBaseOne09Palm)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PALM_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PALM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPalmId() {
        checkSpecifiedProperty("palmId");
        return _palmId;
    }

    /**
     * [set] PALM_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param palmId The value of the column 'PALM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPalmId(Integer palmId) {
        registerModifiedProperty("palmId");
        _palmId = palmId;
    }

    /**
     * [get] PALM_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PALM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getPalmName() {
        checkSpecifiedProperty("palmName");
        return convertEmptyToNull(_palmName);
    }

    /**
     * [set] PALM_NAME: {NotNull, VARCHAR(200)} <br>
     * @param palmName The value of the column 'PALM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setPalmName(String palmName) {
        registerModifiedProperty("palmName");
        _palmName = palmName;
    }

    /**
     * [get] BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBaseId() {
        checkSpecifiedProperty("baseId");
        return _baseId;
    }

    /**
     * [set] BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Integer baseId) {
        registerModifiedProperty("baseId");
        _baseId = baseId;
    }
}
