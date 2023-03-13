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
 * The entity of WHITE_BASE_ONE11_CIRQUE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne11Cirque extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE} */
    protected Integer _cirqueId;

    /** CIRQUE_NAME: {NotNull, VARCHAR(200)} */
    protected String _cirqueName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE11_CIRQUE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_cirqueId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE by my CIRQUE_ID, named 'whiteBase'. */
    protected OptionalEntity<WhiteBase> _whiteBase;

    /**
     * [get] WHITE_BASE by my CIRQUE_ID, named 'whiteBase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBase> getWhiteBase() {
        if (_whiteBase == null) { _whiteBase = OptionalEntity.relationEmpty(this, "whiteBase"); }
        return _whiteBase;
    }

    /**
     * [set] WHITE_BASE by my CIRQUE_ID, named 'whiteBase'.
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
        if (obj instanceof BsWhiteBaseOne11Cirque) {
            BsWhiteBaseOne11Cirque other = (BsWhiteBaseOne11Cirque)obj;
            if (!xSV(_cirqueId, other._cirqueId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _cirqueId);
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
        sb.append(dm).append(xfND(_cirqueId));
        sb.append(dm).append(xfND(_cirqueName));
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
    public WhiteBaseOne11Cirque clone() {
        return (WhiteBaseOne11Cirque)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @return The value of the column 'CIRQUE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCirqueId() {
        checkSpecifiedProperty("cirqueId");
        return _cirqueId;
    }

    /**
     * [set] CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @param cirqueId The value of the column 'CIRQUE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCirqueId(Integer cirqueId) {
        registerModifiedProperty("cirqueId");
        _cirqueId = cirqueId;
    }

    /**
     * [get] CIRQUE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'CIRQUE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCirqueName() {
        checkSpecifiedProperty("cirqueName");
        return convertEmptyToNull(_cirqueName);
    }

    /**
     * [set] CIRQUE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param cirqueName The value of the column 'CIRQUE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCirqueName(String cirqueName) {
        registerModifiedProperty("cirqueName");
        _cirqueName = cirqueName;
    }
}
