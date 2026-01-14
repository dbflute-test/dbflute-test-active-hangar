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
 * The entity of WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION as TABLE.
 * <pre>
 * [primary-key]
 *     EXCEPT_VERSION_ID
 *
 * [column]
 *     EXCEPT_VERSION_ID, EXCEPT_VERSION_NAME, VERSION_NO
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
 * Long exceptVersionId = entity.getExceptVersionId();
 * String exceptVersionName = entity.getExceptVersionName();
 * Long versionNo = entity.getVersionNo();
 * entity.setExceptVersionId(exceptVersionId);
 * entity.setExceptVersionName(exceptVersionName);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOptimisticLockExceptVersion extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _exceptVersionId;

    /** EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)} */
    protected String _exceptVersionName;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_exceptVersionId == null) { return false; }
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
        if (obj instanceof BsWhiteOptimisticLockExceptVersion) {
            BsWhiteOptimisticLockExceptVersion other = (BsWhiteOptimisticLockExceptVersion)obj;
            if (!xSV(_exceptVersionId, other._exceptVersionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _exceptVersionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_exceptVersionId));
        sb.append(dm).append(xfND(_exceptVersionName));
        sb.append(dm).append(xfND(_versionNo));
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
    public WhiteOptimisticLockExceptVersion clone() {
        return (WhiteOptimisticLockExceptVersion)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'EXCEPT_VERSION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptVersionId() {
        checkSpecifiedProperty("exceptVersionId");
        return _exceptVersionId;
    }

    /**
     * [set] EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param exceptVersionId The value of the column 'EXCEPT_VERSION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptVersionId(Long exceptVersionId) {
        registerModifiedProperty("exceptVersionId");
        _exceptVersionId = exceptVersionId;
    }

    /**
     * [get] EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'EXCEPT_VERSION_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getExceptVersionName() {
        checkSpecifiedProperty("exceptVersionName");
        return convertEmptyToNull(_exceptVersionName);
    }

    /**
     * [set] EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)} <br>
     * @param exceptVersionName The value of the column 'EXCEPT_VERSION_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setExceptVersionName(String exceptVersionName) {
        registerModifiedProperty("exceptVersionName");
        _exceptVersionName = exceptVersionName;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
