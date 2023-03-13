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
 * The entity of WHITE_SINGLE_PK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSinglePk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _onlyOnePkId;

    /** SINGLE_PK_NAME: {NotNull, VARCHAR(200)} */
    protected String _singlePkName;

    /** REFERRED_ID: {NotNull, INTEGER(10)} */
    protected Integer _referredId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_SINGLE_PK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_onlyOnePkId == null) { return false; }
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
        if (obj instanceof BsWhiteSinglePk) {
            BsWhiteSinglePk other = (BsWhiteSinglePk)obj;
            if (!xSV(_onlyOnePkId, other._onlyOnePkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _onlyOnePkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_onlyOnePkId));
        sb.append(dm).append(xfND(_singlePkName));
        sb.append(dm).append(xfND(_referredId));
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
    public WhiteSinglePk clone() {
        return (WhiteSinglePk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'ONLY_ONE_PK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getOnlyOnePkId() {
        checkSpecifiedProperty("onlyOnePkId");
        return _onlyOnePkId;
    }

    /**
     * [set] ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param onlyOnePkId The value of the column 'ONLY_ONE_PK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setOnlyOnePkId(Long onlyOnePkId) {
        registerModifiedProperty("onlyOnePkId");
        _onlyOnePkId = onlyOnePkId;
    }

    /**
     * [get] SINGLE_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SINGLE_PK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSinglePkName() {
        checkSpecifiedProperty("singlePkName");
        return convertEmptyToNull(_singlePkName);
    }

    /**
     * [set] SINGLE_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param singlePkName The value of the column 'SINGLE_PK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSinglePkName(String singlePkName) {
        registerModifiedProperty("singlePkName");
        _singlePkName = singlePkName;
    }

    /**
     * [get] REFERRED_ID: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'REFERRED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReferredId() {
        checkSpecifiedProperty("referredId");
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {NotNull, INTEGER(10)} <br>
     * @param referredId The value of the column 'REFERRED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferredId(Integer referredId) {
        registerModifiedProperty("referredId");
        _referredId = referredId;
    }
}
