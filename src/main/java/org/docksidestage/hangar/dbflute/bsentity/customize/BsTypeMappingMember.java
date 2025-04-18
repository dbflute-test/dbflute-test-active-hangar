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
package org.docksidestage.hangar.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.hangar.dbflute.exentity.customize.*;

/**
 * The entity of TypeMappingMember.
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TYPE_MAPPING_ID, TYPE_MAPPING_NAME, TYPE_MAPPING_COUNT, TYPE_MAPPING_DATE, TYPE_MAPPING_DATETIME, POINT_MAPPING_DATE
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
 * Long typeMappingId = entity.getTypeMappingId();
 * String typeMappingName = entity.getTypeMappingName();
 * Integer typeMappingCount = entity.getTypeMappingCount();
 * java.time.LocalDate typeMappingDate = entity.getTypeMappingDate();
 * java.time.LocalDateTime typeMappingDatetime = entity.getTypeMappingDatetime();
 * java.time.LocalDateTime pointMappingDate = entity.getPointMappingDate();
 * entity.setTypeMappingId(typeMappingId);
 * entity.setTypeMappingName(typeMappingName);
 * entity.setTypeMappingCount(typeMappingCount);
 * entity.setTypeMappingDate(typeMappingDate);
 * entity.setTypeMappingDatetime(typeMappingDatetime);
 * entity.setPointMappingDate(pointMappingDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTypeMappingMember extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID} */
    protected Long _typeMappingId;

    /** TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME} */
    protected String _typeMappingName;

    /** TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT} */
    protected Integer _typeMappingCount;

    /** TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE} */
    protected java.time.LocalDate _typeMappingDate;

    /** TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME} */
    protected java.time.LocalDateTime _typeMappingDatetime;

    /** POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE} */
    protected java.time.LocalDateTime _pointMappingDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.hangar.dbflute.bsentity.customize.dbmeta.TypeMappingMemberDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TypeMappingMember";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsTypeMappingMember) {
            BsTypeMappingMember other = (BsTypeMappingMember)obj;
            if (!xSV(_typeMappingId, other._typeMappingId)) { return false; }
            if (!xSV(_typeMappingName, other._typeMappingName)) { return false; }
            if (!xSV(_typeMappingCount, other._typeMappingCount)) { return false; }
            if (!xSV(_typeMappingDate, other._typeMappingDate)) { return false; }
            if (!xSV(_typeMappingDatetime, other._typeMappingDatetime)) { return false; }
            if (!xSV(_pointMappingDate, other._pointMappingDate)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _typeMappingId);
        hs = xCH(hs, _typeMappingName);
        hs = xCH(hs, _typeMappingCount);
        hs = xCH(hs, _typeMappingDate);
        hs = xCH(hs, _typeMappingDatetime);
        hs = xCH(hs, _pointMappingDate);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_typeMappingId));
        sb.append(dm).append(xfND(_typeMappingName));
        sb.append(dm).append(xfND(_typeMappingCount));
        sb.append(dm).append(xfND(_typeMappingDate));
        sb.append(dm).append(xfND(_typeMappingDatetime));
        sb.append(dm).append(xfND(_pointMappingDate));
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
    public TypeMappingMember clone() {
        return (TypeMappingMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID} <br>
     * @return The value of the column 'TYPE_MAPPING_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeMappingId() {
        checkSpecifiedProperty("typeMappingId");
        return _typeMappingId;
    }

    /**
     * [set] TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID} <br>
     * @param typeMappingId The value of the column 'TYPE_MAPPING_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeMappingId(Long typeMappingId) {
        registerModifiedProperty("typeMappingId");
        _typeMappingId = typeMappingId;
    }

    /**
     * [get] TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME} <br>
     * @return The value of the column 'TYPE_MAPPING_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeMappingName() {
        checkSpecifiedProperty("typeMappingName");
        return convertEmptyToNull(_typeMappingName);
    }

    /**
     * [set] TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME} <br>
     * @param typeMappingName The value of the column 'TYPE_MAPPING_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeMappingName(String typeMappingName) {
        registerModifiedProperty("typeMappingName");
        _typeMappingName = typeMappingName;
    }

    /**
     * [get] TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT} <br>
     * @return The value of the column 'TYPE_MAPPING_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeMappingCount() {
        checkSpecifiedProperty("typeMappingCount");
        return _typeMappingCount;
    }

    /**
     * [set] TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT} <br>
     * @param typeMappingCount The value of the column 'TYPE_MAPPING_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeMappingCount(Integer typeMappingCount) {
        registerModifiedProperty("typeMappingCount");
        _typeMappingCount = typeMappingCount;
    }

    /**
     * [get] TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE} <br>
     * @return The value of the column 'TYPE_MAPPING_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getTypeMappingDate() {
        checkSpecifiedProperty("typeMappingDate");
        return _typeMappingDate;
    }

    /**
     * [set] TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE} <br>
     * @param typeMappingDate The value of the column 'TYPE_MAPPING_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeMappingDate(java.time.LocalDate typeMappingDate) {
        registerModifiedProperty("typeMappingDate");
        _typeMappingDate = typeMappingDate;
    }

    /**
     * [get] TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME} <br>
     * @return The value of the column 'TYPE_MAPPING_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTypeMappingDatetime() {
        checkSpecifiedProperty("typeMappingDatetime");
        return _typeMappingDatetime;
    }

    /**
     * [set] TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME} <br>
     * @param typeMappingDatetime The value of the column 'TYPE_MAPPING_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeMappingDatetime(java.time.LocalDateTime typeMappingDatetime) {
        registerModifiedProperty("typeMappingDatetime");
        _typeMappingDatetime = typeMappingDatetime;
    }

    /**
     * [get] POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE} <br>
     * @return The value of the column 'POINT_MAPPING_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getPointMappingDate() {
        checkSpecifiedProperty("pointMappingDate");
        return _pointMappingDate;
    }

    /**
     * [set] POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE} <br>
     * @param pointMappingDate The value of the column 'POINT_MAPPING_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointMappingDate(java.time.LocalDateTime pointMappingDate) {
        registerModifiedProperty("pointMappingDate");
        _pointMappingDate = pointMappingDate;
    }
}
