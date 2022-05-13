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
 * The entity of WHITE_DEPRECATED_SELECT_BY_PKUQ as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SELECT_BY_PKUQ_ID
 *
 * [column]
 *     SELECT_BY_PKUQ_ID, SELECT_BY_PKUQ_NAME, SELECT_BY_PKUQ_CODE
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
 * Long selectByPkuqId = entity.getSelectByPkuqId();
 * String selectByPkuqName = entity.getSelectByPkuqName();
 * String selectByPkuqCode = entity.getSelectByPkuqCode();
 * entity.setSelectByPkuqId(selectByPkuqId);
 * entity.setSelectByPkuqName(selectByPkuqName);
 * entity.setSelectByPkuqCode(selectByPkuqCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedSelectByPkuq extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _selectByPkuqId;

    /** SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} */
    protected String _selectByPkuqName;

    /** SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} */
    protected String _selectByPkuqCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DEPRECATED_SELECT_BY_PKUQ";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_selectByPkuqId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param selectByPkuqCode : UQ, NotNull, VARCHAR(16). (NotNull)
     */
    public void uniqueBy(String selectByPkuqCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("selectByPkuqCode");
        setSelectByPkuqCode(selectByPkuqCode);
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
        if (obj instanceof BsWhiteDeprecatedSelectByPkuq) {
            BsWhiteDeprecatedSelectByPkuq other = (BsWhiteDeprecatedSelectByPkuq)obj;
            if (!xSV(_selectByPkuqId, other._selectByPkuqId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _selectByPkuqId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_selectByPkuqId));
        sb.append(dm).append(xfND(_selectByPkuqName));
        sb.append(dm).append(xfND(_selectByPkuqCode));
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
    public WhiteDeprecatedSelectByPkuq clone() {
        return (WhiteDeprecatedSelectByPkuq)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'SELECT_BY_PKUQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSelectByPkuqId() {
        checkSpecifiedProperty("selectByPkuqId");
        return _selectByPkuqId;
    }

    /**
     * [set] SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param selectByPkuqId The value of the column 'SELECT_BY_PKUQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelectByPkuqId(Long selectByPkuqId) {
        registerModifiedProperty("selectByPkuqId");
        _selectByPkuqId = selectByPkuqId;
    }

    /**
     * [get] SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SELECT_BY_PKUQ_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelectByPkuqName() {
        checkSpecifiedProperty("selectByPkuqName");
        return convertEmptyToNull(_selectByPkuqName);
    }

    /**
     * [set] SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} <br>
     * @param selectByPkuqName The value of the column 'SELECT_BY_PKUQ_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelectByPkuqName(String selectByPkuqName) {
        registerModifiedProperty("selectByPkuqName");
        _selectByPkuqName = selectByPkuqName;
    }

    /**
     * [get] SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'SELECT_BY_PKUQ_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSelectByPkuqCode() {
        checkSpecifiedProperty("selectByPkuqCode");
        return convertEmptyToNull(_selectByPkuqCode);
    }

    /**
     * [set] SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} <br>
     * @param selectByPkuqCode The value of the column 'SELECT_BY_PKUQ_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSelectByPkuqCode(String selectByPkuqCode) {
        registerModifiedProperty("selectByPkuqCode");
        _selectByPkuqCode = selectByPkuqCode;
    }
}
