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
 * The entity of WHITE_READ_ONLY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     READ_ONLY_ID
 *
 * [column]
 *     READ_ONLY_ID, READ_ONLY_NAME
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
 * Long readOnlyId = entity.getReadOnlyId();
 * String readOnlyName = entity.getReadOnlyName();
 * entity.setReadOnlyId(readOnlyId);
 * entity.setReadOnlyName(readOnlyName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteReadOnly extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** READ_ONLY_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _readOnlyId;

    /** READ_ONLY_NAME: {NotNull, VARCHAR(200)} */
    protected String _readOnlyName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_READ_ONLY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_readOnlyId == null) { return false; }
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
        if (obj instanceof BsWhiteReadOnly) {
            BsWhiteReadOnly other = (BsWhiteReadOnly)obj;
            if (!xSV(_readOnlyId, other._readOnlyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _readOnlyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_readOnlyId));
        sb.append(dm).append(xfND(_readOnlyName));
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
    public WhiteReadOnly clone() {
        return (WhiteReadOnly)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] READ_ONLY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'READ_ONLY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReadOnlyId() {
        checkSpecifiedProperty("readOnlyId");
        return _readOnlyId;
    }

    /**
     * [set] READ_ONLY_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param readOnlyId The value of the column 'READ_ONLY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReadOnlyId(Long readOnlyId) {
        registerModifiedProperty("readOnlyId");
        _readOnlyId = readOnlyId;
    }

    /**
     * [get] READ_ONLY_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'READ_ONLY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReadOnlyName() {
        checkSpecifiedProperty("readOnlyName");
        return convertEmptyToNull(_readOnlyName);
    }

    /**
     * [set] READ_ONLY_NAME: {NotNull, VARCHAR(200)} <br>
     * @param readOnlyName The value of the column 'READ_ONLY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReadOnlyName(String readOnlyName) {
        registerModifiedProperty("readOnlyName");
        _readOnlyName = readOnlyName;
    }
}
