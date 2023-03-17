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
 * The entity of WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN as TABLE.
 * <pre>
 * [primary-key]
 *     SPECIFY_BATCH_COLUMN_ID
 *
 * [column]
 *     SPECIFY_BATCH_COLUMN_ID, SPECIFY_BATCH_COLUMN_NAME
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
 * Long specifyBatchColumnId = entity.getSpecifyBatchColumnId();
 * String specifyBatchColumnName = entity.getSpecifyBatchColumnName();
 * entity.setSpecifyBatchColumnId(specifyBatchColumnId);
 * entity.setSpecifyBatchColumnName(specifyBatchColumnName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedSpecifyBatchColumn extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _specifyBatchColumnId;

    /** SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} */
    protected String _specifyBatchColumnName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_specifyBatchColumnId == null) { return false; }
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
        if (obj instanceof BsWhiteDeprecatedSpecifyBatchColumn) {
            BsWhiteDeprecatedSpecifyBatchColumn other = (BsWhiteDeprecatedSpecifyBatchColumn)obj;
            if (!xSV(_specifyBatchColumnId, other._specifyBatchColumnId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _specifyBatchColumnId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_specifyBatchColumnId));
        sb.append(dm).append(xfND(_specifyBatchColumnName));
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
    public WhiteDeprecatedSpecifyBatchColumn clone() {
        return (WhiteDeprecatedSpecifyBatchColumn)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'SPECIFY_BATCH_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSpecifyBatchColumnId() {
        checkSpecifiedProperty("specifyBatchColumnId");
        return _specifyBatchColumnId;
    }

    /**
     * [set] SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param specifyBatchColumnId The value of the column 'SPECIFY_BATCH_COLUMN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSpecifyBatchColumnId(Long specifyBatchColumnId) {
        registerModifiedProperty("specifyBatchColumnId");
        _specifyBatchColumnId = specifyBatchColumnId;
    }

    /**
     * [get] SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SPECIFY_BATCH_COLUMN_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSpecifyBatchColumnName() {
        checkSpecifiedProperty("specifyBatchColumnName");
        return convertEmptyToNull(_specifyBatchColumnName);
    }

    /**
     * [set] SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} <br>
     * @param specifyBatchColumnName The value of the column 'SPECIFY_BATCH_COLUMN_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSpecifyBatchColumnName(String specifyBatchColumnName) {
        registerModifiedProperty("specifyBatchColumnName");
        _specifyBatchColumnName = specifyBatchColumnName;
    }
}
