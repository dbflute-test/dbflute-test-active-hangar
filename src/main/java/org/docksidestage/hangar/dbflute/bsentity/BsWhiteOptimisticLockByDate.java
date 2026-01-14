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
 * The entity of WHITE_OPTIMISTIC_LOCK_BY_DATE as TABLE.
 * <pre>
 * [primary-key]
 *     BY_DATE_ID
 *
 * [column]
 *     BY_DATE_ID, BY_DATE_NAME, UPDATE_DATE
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
 * Long byDateId = entity.getByDateId();
 * String byDateName = entity.getByDateName();
 * java.time.LocalDateTime updateDate = entity.getUpdateDate();
 * entity.setByDateId(byDateId);
 * entity.setByDateName(byDateName);
 * entity.setUpdateDate(updateDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOptimisticLockByDate extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BY_DATE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _byDateId;

    /** BY_DATE_NAME: {NotNull, VARCHAR(100)} */
    protected String _byDateName;

    /** UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _updateDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_OPTIMISTIC_LOCK_BY_DATE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_byDateId == null) { return false; }
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
        if (obj instanceof BsWhiteOptimisticLockByDate) {
            BsWhiteOptimisticLockByDate other = (BsWhiteOptimisticLockByDate)obj;
            if (!xSV(_byDateId, other._byDateId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _byDateId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_byDateId));
        sb.append(dm).append(xfND(_byDateName));
        sb.append(dm).append(xfND(_updateDate));
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
    public WhiteOptimisticLockByDate clone() {
        return (WhiteOptimisticLockByDate)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BY_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'BY_DATE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getByDateId() {
        checkSpecifiedProperty("byDateId");
        return _byDateId;
    }

    /**
     * [set] BY_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param byDateId The value of the column 'BY_DATE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setByDateId(Long byDateId) {
        registerModifiedProperty("byDateId");
        _byDateId = byDateId;
    }

    /**
     * [get] BY_DATE_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'BY_DATE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getByDateName() {
        checkSpecifiedProperty("byDateName");
        return convertEmptyToNull(_byDateName);
    }

    /**
     * [set] BY_DATE_NAME: {NotNull, VARCHAR(100)} <br>
     * @param byDateName The value of the column 'BY_DATE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setByDateName(String byDateName) {
        registerModifiedProperty("byDateName");
        _byDateName = byDateName;
    }

    /**
     * [get] UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'UPDATE_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDate() {
        checkSpecifiedProperty("updateDate");
        return _updateDate;
    }

    /**
     * [set] UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param updateDate The value of the column 'UPDATE_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDate(java.time.LocalDateTime updateDate) {
        registerModifiedProperty("updateDate");
        _updateDate = updateDate;
    }
}
