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
package org.docksidestage.hangar.dbflute.resola.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaDBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.resola.exentity.*;

/**
 * The entity of STATION as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class ResolaBsStation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STATION_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected Integer _stationId;

    /** STATION_NAME: {NotNull, VARCHAR(200)} */
    protected String _stationName;

    /** BIRTHDATE: {DATE(10)} */
    protected java.time.LocalDate _birthdate;

    /** FORMALIZED_DATETIME: {TIMESTAMP(26, 6)} */
    protected java.time.LocalDateTime _formalizedDatetime;

    /** HOME_COUNT: {INTEGER(10)} */
    protected Integer _homeCount;

    /** WORKING_KILOMETER: {DECIMAL(4, 2)} */
    protected java.math.BigDecimal _workingKilometer;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return ResolaDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "STATION";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_stationId == null) { return false; }
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
        if (obj instanceof ResolaBsStation) {
            ResolaBsStation other = (ResolaBsStation)obj;
            if (!xSV(_stationId, other._stationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stationId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stationId));
        sb.append(dm).append(xfND(_stationName));
        sb.append(dm).append(xfND(_birthdate));
        sb.append(dm).append(xfND(_formalizedDatetime));
        sb.append(dm).append(xfND(_homeCount));
        sb.append(dm).append(xfND(_workingKilometer));
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
    public ResolaStation clone() {
        return (ResolaStation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATION_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'STATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStationId() {
        checkSpecifiedProperty("stationId");
        return _stationId;
    }

    /**
     * [set] STATION_ID: {PK, ID, NotNull, INTEGER(10)} <br>
     * @param stationId The value of the column 'STATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStationId(Integer stationId) {
        registerModifiedProperty("stationId");
        _stationId = stationId;
    }

    /**
     * [get] STATION_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'STATION_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getStationName() {
        checkSpecifiedProperty("stationName");
        return _stationName;
    }

    /**
     * [set] STATION_NAME: {NotNull, VARCHAR(200)} <br>
     * @param stationName The value of the column 'STATION_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setStationName(String stationName) {
        registerModifiedProperty("stationName");
        _stationName = stationName;
    }

    /**
     * [get] BIRTHDATE: {DATE(10)} <br>
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBirthdate() {
        checkSpecifiedProperty("birthdate");
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(10)} <br>
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.time.LocalDate birthdate) {
        registerModifiedProperty("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] FORMALIZED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getFormalizedDatetime() {
        checkSpecifiedProperty("formalizedDatetime");
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {TIMESTAMP(26, 6)} <br>
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        registerModifiedProperty("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] HOME_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'HOME_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getHomeCount() {
        checkSpecifiedProperty("homeCount");
        return _homeCount;
    }

    /**
     * [set] HOME_COUNT: {INTEGER(10)} <br>
     * @param homeCount The value of the column 'HOME_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHomeCount(Integer homeCount) {
        registerModifiedProperty("homeCount");
        _homeCount = homeCount;
    }

    /**
     * [get] WORKING_KILOMETER: {DECIMAL(4, 2)} <br>
     * @return The value of the column 'WORKING_KILOMETER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getWorkingKilometer() {
        checkSpecifiedProperty("workingKilometer");
        return _workingKilometer;
    }

    /**
     * [set] WORKING_KILOMETER: {DECIMAL(4, 2)} <br>
     * @param workingKilometer The value of the column 'WORKING_KILOMETER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkingKilometer(java.math.BigDecimal workingKilometer) {
        registerModifiedProperty("workingKilometer");
        _workingKilometer = workingKilometer;
    }
}
