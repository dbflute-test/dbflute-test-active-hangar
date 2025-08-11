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
 * The entity of WHITE_NOT_NULL as TABLE. <br>
 * #sea
 * <pre>
 * [primary-key]
 *     NOT_NULL_ID
 *
 * [column]
 *     NOT_NULL_ID, NOT_NULL_NAME, NOT_NULL_COUNT, NOT_NULL_DATE, NOT_NULL_DATETIME
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
 * Long notNullId = entity.getNotNullId();
 * String notNullName = entity.getNotNullName();
 * Integer notNullCount = entity.getNotNullCount();
 * java.time.LocalDate notNullDate = entity.getNotNullDate();
 * java.time.LocalDateTime notNullDatetime = entity.getNotNullDatetime();
 * entity.setNotNullId(notNullId);
 * entity.setNotNullName(notNullName);
 * entity.setNotNullCount(notNullCount);
 * entity.setNotNullDate(notNullDate);
 * entity.setNotNullDatetime(notNullDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNotNull extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NOT_NULL_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _notNullId;

    /** NOT_NULL_NAME: {NotNull, VARCHAR(200)} */
    protected String _notNullName;

    /** NOT_NULL_COUNT: {INTEGER(10)} */
    protected Integer _notNullCount;

    /** NOT_NULL_DATE: {DATE(10)} */
    protected java.time.LocalDate _notNullDate;

    /** NOT_NULL_DATETIME: {TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _notNullDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_NOT_NULL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_notNullId == null) { return false; }
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
        if (obj instanceof BsWhiteNotNull) {
            BsWhiteNotNull other = (BsWhiteNotNull)obj;
            if (!xSV(_notNullId, other._notNullId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _notNullId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_notNullId));
        sb.append(dm).append(xfND(_notNullName));
        sb.append(dm).append(xfND(_notNullCount));
        sb.append(dm).append(xfND(_notNullDate));
        sb.append(dm).append(xfND(_notNullDatetime));
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
    public WhiteNotNull clone() {
        return (WhiteNotNull)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NOT_NULL_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'NOT_NULL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNotNullId() {
        checkSpecifiedProperty("notNullId");
        return _notNullId;
    }

    /**
     * [set] NOT_NULL_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param notNullId The value of the column 'NOT_NULL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNotNullId(Long notNullId) {
        registerModifiedProperty("notNullId");
        _notNullId = notNullId;
    }

    /**
     * [get] NOT_NULL_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'NOT_NULL_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getNotNullName() {
        checkSpecifiedProperty("notNullName");
        return convertEmptyToNull(_notNullName);
    }

    /**
     * [set] NOT_NULL_NAME: {NotNull, VARCHAR(200)} <br>
     * @param notNullName The value of the column 'NOT_NULL_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setNotNullName(String notNullName) {
        registerModifiedProperty("notNullName");
        _notNullName = notNullName;
    }

    /**
     * [get] NOT_NULL_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'NOT_NULL_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNotNullCount() {
        checkSpecifiedProperty("notNullCount");
        return _notNullCount;
    }

    /**
     * [set] NOT_NULL_COUNT: {INTEGER(10)} <br>
     * @param notNullCount The value of the column 'NOT_NULL_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotNullCount(Integer notNullCount) {
        registerModifiedProperty("notNullCount");
        _notNullCount = notNullCount;
    }

    /**
     * [get] NOT_NULL_DATE: {DATE(10)} <br>
     * @return The value of the column 'NOT_NULL_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getNotNullDate() {
        checkSpecifiedProperty("notNullDate");
        return _notNullDate;
    }

    /**
     * [set] NOT_NULL_DATE: {DATE(10)} <br>
     * @param notNullDate The value of the column 'NOT_NULL_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotNullDate(java.time.LocalDate notNullDate) {
        registerModifiedProperty("notNullDate");
        _notNullDate = notNullDate;
    }

    /**
     * [get] NOT_NULL_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'NOT_NULL_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getNotNullDatetime() {
        checkSpecifiedProperty("notNullDatetime");
        return _notNullDatetime;
    }

    /**
     * [set] NOT_NULL_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param notNullDatetime The value of the column 'NOT_NULL_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotNullDatetime(java.time.LocalDateTime notNullDatetime) {
        registerModifiedProperty("notNullDatetime");
        _notNullDatetime = notNullDatetime;
    }
}
