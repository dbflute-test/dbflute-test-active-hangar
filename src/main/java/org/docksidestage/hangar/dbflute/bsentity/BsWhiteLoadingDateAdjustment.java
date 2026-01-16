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
import org.docksidestage.hangar.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_LOADING_DATE_ADJUSTMENT as TABLE.
 * <pre>
 * [primary-key]
 *     DATE_ADJUSTMENT_ID
 *
 * [column]
 *     DATE_ADJUSTMENT_ID, ADJUSTED_DATE, ADJUSTED_DATETIME, ADJUSTED_TIME, ADJUSTED_INTEGER, ADJUSTED_PLAIN_LONG, ADJUSTED_STRING_LONG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
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
 * Long dateAdjustmentId = entity.getDateAdjustmentId();
 * java.time.LocalDate adjustedDate = entity.getAdjustedDate();
 * java.time.LocalDateTime adjustedDatetime = entity.getAdjustedDatetime();
 * java.time.LocalTime adjustedTime = entity.getAdjustedTime();
 * Integer adjustedInteger = entity.getAdjustedInteger();
 * Long adjustedPlainLong = entity.getAdjustedPlainLong();
 * String adjustedStringLong = entity.getAdjustedStringLong();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setDateAdjustmentId(dateAdjustmentId);
 * entity.setAdjustedDate(adjustedDate);
 * entity.setAdjustedDatetime(adjustedDatetime);
 * entity.setAdjustedTime(adjustedTime);
 * entity.setAdjustedInteger(adjustedInteger);
 * entity.setAdjustedPlainLong(adjustedPlainLong);
 * entity.setAdjustedStringLong(adjustedStringLong);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteLoadingDateAdjustment extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _dateAdjustmentId;

    /** (adjusted)ADJUSTED_DATE: {DATE(10)} */
    protected java.time.LocalDate _adjustedDate;

    /** ADJUSTED_DATETIME: {TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _adjustedDatetime;

    /** ADJUSTED_TIME: {TIME(8)} */
    protected java.time.LocalTime _adjustedTime;

    /** ADJUSTED_INTEGER: {INTEGER(10)} */
    protected Integer _adjustedInteger;

    /** ADJUSTED_PLAIN_LONG: {BIGINT(19)} */
    protected Long _adjustedPlainLong;

    /** ADJUSTED_STRING_LONG: {VARCHAR(32)} */
    protected String _adjustedStringLong;

    /** (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_LOADING_DATE_ADJUSTMENT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dateAdjustmentId == null) { return false; }
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
        if (obj instanceof BsWhiteLoadingDateAdjustment) {
            BsWhiteLoadingDateAdjustment other = (BsWhiteLoadingDateAdjustment)obj;
            if (!xSV(_dateAdjustmentId, other._dateAdjustmentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dateAdjustmentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dateAdjustmentId));
        sb.append(dm).append(xfND(_adjustedDate));
        sb.append(dm).append(xfND(_adjustedDatetime));
        sb.append(dm).append(xfND(_adjustedTime));
        sb.append(dm).append(xfND(_adjustedInteger));
        sb.append(dm).append(xfND(_adjustedPlainLong));
        sb.append(dm).append(xfND(_adjustedStringLong));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
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
    public WhiteLoadingDateAdjustment clone() {
        return (WhiteLoadingDateAdjustment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'DATE_ADJUSTMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDateAdjustmentId() {
        checkSpecifiedProperty("dateAdjustmentId");
        return _dateAdjustmentId;
    }

    /**
     * [set] DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)} <br>
     * @param dateAdjustmentId The value of the column 'DATE_ADJUSTMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDateAdjustmentId(Long dateAdjustmentId) {
        registerModifiedProperty("dateAdjustmentId");
        _dateAdjustmentId = dateAdjustmentId;
    }

    /**
     * [get] (adjusted)ADJUSTED_DATE: {DATE(10)} <br>
     * @return The value of the column 'ADJUSTED_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getAdjustedDate() {
        checkSpecifiedProperty("adjustedDate");
        return _adjustedDate;
    }

    /**
     * [set] (adjusted)ADJUSTED_DATE: {DATE(10)} <br>
     * @param adjustedDate The value of the column 'ADJUSTED_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedDate(java.time.LocalDate adjustedDate) {
        registerModifiedProperty("adjustedDate");
        _adjustedDate = adjustedDate;
    }

    /**
     * [get] ADJUSTED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'ADJUSTED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getAdjustedDatetime() {
        checkSpecifiedProperty("adjustedDatetime");
        return _adjustedDatetime;
    }

    /**
     * [set] ADJUSTED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param adjustedDatetime The value of the column 'ADJUSTED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedDatetime(java.time.LocalDateTime adjustedDatetime) {
        registerModifiedProperty("adjustedDatetime");
        _adjustedDatetime = adjustedDatetime;
    }

    /**
     * [get] ADJUSTED_TIME: {TIME(8)} <br>
     * @return The value of the column 'ADJUSTED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getAdjustedTime() {
        checkSpecifiedProperty("adjustedTime");
        return _adjustedTime;
    }

    /**
     * [set] ADJUSTED_TIME: {TIME(8)} <br>
     * @param adjustedTime The value of the column 'ADJUSTED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedTime(java.time.LocalTime adjustedTime) {
        registerModifiedProperty("adjustedTime");
        _adjustedTime = adjustedTime;
    }

    /**
     * [get] ADJUSTED_INTEGER: {INTEGER(10)} <br>
     * @return The value of the column 'ADJUSTED_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAdjustedInteger() {
        checkSpecifiedProperty("adjustedInteger");
        return _adjustedInteger;
    }

    /**
     * [set] ADJUSTED_INTEGER: {INTEGER(10)} <br>
     * @param adjustedInteger The value of the column 'ADJUSTED_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedInteger(Integer adjustedInteger) {
        registerModifiedProperty("adjustedInteger");
        _adjustedInteger = adjustedInteger;
    }

    /**
     * [get] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br>
     * @return The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAdjustedPlainLong() {
        checkSpecifiedProperty("adjustedPlainLong");
        return _adjustedPlainLong;
    }

    /**
     * [set] ADJUSTED_PLAIN_LONG: {BIGINT(19)} <br>
     * @param adjustedPlainLong The value of the column 'ADJUSTED_PLAIN_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedPlainLong(Long adjustedPlainLong) {
        registerModifiedProperty("adjustedPlainLong");
        _adjustedPlainLong = adjustedPlainLong;
    }

    /**
     * [get] ADJUSTED_STRING_LONG: {VARCHAR(32)} <br>
     * @return The value of the column 'ADJUSTED_STRING_LONG'. (NullAllowed even if selected: for no constraint)
     */
    public String getAdjustedStringLong() {
        checkSpecifiedProperty("adjustedStringLong");
        return convertEmptyToNull(_adjustedStringLong);
    }

    /**
     * [set] ADJUSTED_STRING_LONG: {VARCHAR(32)} <br>
     * @param adjustedStringLong The value of the column 'ADJUSTED_STRING_LONG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAdjustedStringLong(String adjustedStringLong) {
        registerModifiedProperty("adjustedStringLong");
        _adjustedStringLong = adjustedStringLong;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * 特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * 眠いときは眠いと言おう。
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * 眠いときは眠いと言おう。
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }
}
