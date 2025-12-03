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
 * The entity of WHITE_GENERATE_NAME_SWITCHED as TABLE.
 * <pre>
 * [primary-key]
 *     GENERATE_NAME_SWITCHED_ID
 *
 * [column]
 *     GENERATE_NAME_SWITCHED_ID, GENERATE_NAME_SWITCHED_NAME, GENERATE_NAME_SWITCHED_COUNT, GENERATE_NAME_SWITCHED_DATE, GENERATE_NAME_SWITCHED_DATETIME
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
 * Long generateNameSwitchedId = entity.getGenerateNameSwitchedId();
 * String generateNameSwitchedName = entity.getGenerateNameSwitchedName();
 * Integer generateNameSwitchedCount = entity.getGenerateNameSwitchedCount();
 * java.time.LocalDate generateNameSwitchedDate = entity.getGenerateNameSwitchedDate();
 * java.time.LocalDateTime generateNameSwitchedDatetime = entity.getGenerateNameSwitchedDatetime();
 * entity.setGenerateNameSwitchedId(generateNameSwitchedId);
 * entity.setGenerateNameSwitchedName(generateNameSwitchedName);
 * entity.setGenerateNameSwitchedCount(generateNameSwitchedCount);
 * entity.setGenerateNameSwitchedDate(generateNameSwitchedDate);
 * entity.setGenerateNameSwitchedDatetime(generateNameSwitchedDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteGenerateNameSwitched extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _generateNameSwitchedId;

    /** GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} */
    protected String _generateNameSwitchedName;

    /** GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)} */
    protected Integer _generateNameSwitchedCount;

    /** GENERATE_NAME_SWITCHED_DATE: {DATE(10)} */
    protected java.time.LocalDate _generateNameSwitchedDate;

    /** GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _generateNameSwitchedDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_GENERATE_NAME_SWITCHED";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_generateNameSwitchedId == null) { return false; }
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
        if (obj instanceof BsWhiteGenerateNameSwitched) {
            BsWhiteGenerateNameSwitched other = (BsWhiteGenerateNameSwitched)obj;
            if (!xSV(_generateNameSwitchedId, other._generateNameSwitchedId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _generateNameSwitchedId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_generateNameSwitchedId));
        sb.append(dm).append(xfND(_generateNameSwitchedName));
        sb.append(dm).append(xfND(_generateNameSwitchedCount));
        sb.append(dm).append(xfND(_generateNameSwitchedDate));
        sb.append(dm).append(xfND(_generateNameSwitchedDatetime));
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
    public WhiteGenerateNameSwitched clone() {
        return (WhiteGenerateNameSwitched)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGenerateNameSwitchedId() {
        checkSpecifiedProperty("generateNameSwitchedId");
        return _generateNameSwitchedId;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param generateNameSwitchedId The value of the column 'GENERATE_NAME_SWITCHED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGenerateNameSwitchedId(Long generateNameSwitchedId) {
        registerModifiedProperty("generateNameSwitchedId");
        _generateNameSwitchedId = generateNameSwitchedId;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenerateNameSwitchedName() {
        checkSpecifiedProperty("generateNameSwitchedName");
        return convertEmptyToNull(_generateNameSwitchedName);
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)} <br>
     * @param generateNameSwitchedName The value of the column 'GENERATE_NAME_SWITCHED_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenerateNameSwitchedName(String generateNameSwitchedName) {
        registerModifiedProperty("generateNameSwitchedName");
        _generateNameSwitchedName = generateNameSwitchedName;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getGenerateNameSwitchedCount() {
        checkSpecifiedProperty("generateNameSwitchedCount");
        return _generateNameSwitchedCount;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)} <br>
     * @param generateNameSwitchedCount The value of the column 'GENERATE_NAME_SWITCHED_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenerateNameSwitchedCount(Integer generateNameSwitchedCount) {
        registerModifiedProperty("generateNameSwitchedCount");
        _generateNameSwitchedCount = generateNameSwitchedCount;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_DATE: {DATE(10)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getGenerateNameSwitchedDate() {
        checkSpecifiedProperty("generateNameSwitchedDate");
        return _generateNameSwitchedDate;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_DATE: {DATE(10)} <br>
     * @param generateNameSwitchedDate The value of the column 'GENERATE_NAME_SWITCHED_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenerateNameSwitchedDate(java.time.LocalDate generateNameSwitchedDate) {
        registerModifiedProperty("generateNameSwitchedDate");
        _generateNameSwitchedDate = generateNameSwitchedDate;
    }

    /**
     * [get] GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'GENERATE_NAME_SWITCHED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getGenerateNameSwitchedDatetime() {
        checkSpecifiedProperty("generateNameSwitchedDatetime");
        return _generateNameSwitchedDatetime;
    }

    /**
     * [set] GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param generateNameSwitchedDatetime The value of the column 'GENERATE_NAME_SWITCHED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenerateNameSwitchedDatetime(java.time.LocalDateTime generateNameSwitchedDatetime) {
        registerModifiedProperty("generateNameSwitchedDatetime");
        _generateNameSwitchedDatetime = generateNameSwitchedDatetime;
    }
}
