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
 * The entity of WHITE_DEFAULT_CONSTRAINT as TABLE.
 * <pre>
 * [primary-key]
 *     DEFAULT_ID
 *
 * [column]
 *     DEFAULT_ID, DEFAULT_NAME, DEFAULT_COUNT, DEFAULT_DATE, DEFAULT_JUDGE, DEFAULT_EMPTY_STRING
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
 * Long defaultId = entity.getDefaultId();
 * String defaultName = entity.getDefaultName();
 * Integer defaultCount = entity.getDefaultCount();
 * java.time.LocalDate defaultDate = entity.getDefaultDate();
 * Boolean defaultJudge = entity.getDefaultJudge();
 * String defaultEmptyString = entity.getDefaultEmptyString();
 * entity.setDefaultId(defaultId);
 * entity.setDefaultName(defaultName);
 * entity.setDefaultCount(defaultCount);
 * entity.setDefaultDate(defaultDate);
 * entity.setDefaultJudge(defaultJudge);
 * entity.setDefaultEmptyString(defaultEmptyString);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDefaultConstraint extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DEFAULT_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _defaultId;

    /** DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} */
    protected String _defaultName;

    /** DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]} */
    protected Integer _defaultCount;

    /** DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]} */
    protected java.time.LocalDate _defaultDate;

    /** DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]} */
    protected Boolean _defaultJudge;

    /** DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} */
    protected String _defaultEmptyString;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DEFAULT_CONSTRAINT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_defaultId == null) { return false; }
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
        if (obj instanceof BsWhiteDefaultConstraint) {
            BsWhiteDefaultConstraint other = (BsWhiteDefaultConstraint)obj;
            if (!xSV(_defaultId, other._defaultId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _defaultId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_defaultId));
        sb.append(dm).append(xfND(_defaultName));
        sb.append(dm).append(xfND(_defaultCount));
        sb.append(dm).append(xfND(_defaultDate));
        sb.append(dm).append(xfND(_defaultJudge));
        sb.append(dm).append(xfND(_defaultEmptyString));
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
    public WhiteDefaultConstraint clone() {
        return (WhiteDefaultConstraint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEFAULT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEFAULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDefaultId() {
        checkSpecifiedProperty("defaultId");
        return _defaultId;
    }

    /**
     * [set] DEFAULT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param defaultId The value of the column 'DEFAULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultId(Long defaultId) {
        registerModifiedProperty("defaultId");
        _defaultId = defaultId;
    }

    /**
     * [get] DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} <br>
     * @return The value of the column 'DEFAULT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDefaultName() {
        checkSpecifiedProperty("defaultName");
        return convertEmptyToNull(_defaultName);
    }

    /**
     * [set] DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]} <br>
     * @param defaultName The value of the column 'DEFAULT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultName(String defaultName) {
        registerModifiedProperty("defaultName");
        _defaultName = defaultName;
    }

    /**
     * [get] DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]} <br>
     * @return The value of the column 'DEFAULT_COUNT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDefaultCount() {
        checkSpecifiedProperty("defaultCount");
        return _defaultCount;
    }

    /**
     * [set] DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]} <br>
     * @param defaultCount The value of the column 'DEFAULT_COUNT'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultCount(Integer defaultCount) {
        registerModifiedProperty("defaultCount");
        _defaultCount = defaultCount;
    }

    /**
     * [get] DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]} <br>
     * @return The value of the column 'DEFAULT_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDefaultDate() {
        checkSpecifiedProperty("defaultDate");
        return _defaultDate;
    }

    /**
     * [set] DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]} <br>
     * @param defaultDate The value of the column 'DEFAULT_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultDate(java.time.LocalDate defaultDate) {
        registerModifiedProperty("defaultDate");
        _defaultDate = defaultDate;
    }

    /**
     * [get] DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]} <br>
     * @return The value of the column 'DEFAULT_JUDGE'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDefaultJudge() {
        checkSpecifiedProperty("defaultJudge");
        return _defaultJudge;
    }

    /**
     * [set] DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]} <br>
     * @param defaultJudge The value of the column 'DEFAULT_JUDGE'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultJudge(Boolean defaultJudge) {
        registerModifiedProperty("defaultJudge");
        _defaultJudge = defaultJudge;
    }

    /**
     * [get] DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEFAULT_EMPTY_STRING'. (basically NotNull if selected: for the constraint)
     */
    public String getDefaultEmptyString() {
        checkSpecifiedProperty("defaultEmptyString");
        return convertEmptyToNull(_defaultEmptyString);
    }

    /**
     * [set] DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)} <br>
     * @param defaultEmptyString The value of the column 'DEFAULT_EMPTY_STRING'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultEmptyString(String defaultEmptyString) {
        registerModifiedProperty("defaultEmptyString");
        _defaultEmptyString = defaultEmptyString;
    }
}
