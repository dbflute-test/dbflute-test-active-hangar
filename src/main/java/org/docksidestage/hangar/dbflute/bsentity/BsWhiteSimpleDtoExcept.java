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
 * The entity of WHITE_SIMPLE_DTO_EXCEPT as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSimpleDtoExcept extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _simpleDtoExceptId;

    /** SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)} */
    protected String _simpleDtoExceptName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_SIMPLE_DTO_EXCEPT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_simpleDtoExceptId == null) { return false; }
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
        if (obj instanceof BsWhiteSimpleDtoExcept) {
            BsWhiteSimpleDtoExcept other = (BsWhiteSimpleDtoExcept)obj;
            if (!xSV(_simpleDtoExceptId, other._simpleDtoExceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _simpleDtoExceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_simpleDtoExceptId));
        sb.append(dm).append(xfND(_simpleDtoExceptName));
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
    public WhiteSimpleDtoExcept clone() {
        return (WhiteSimpleDtoExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'SIMPLE_DTO_EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSimpleDtoExceptId() {
        checkSpecifiedProperty("simpleDtoExceptId");
        return _simpleDtoExceptId;
    }

    /**
     * [set] SIMPLE_DTO_EXCEPT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param simpleDtoExceptId The value of the column 'SIMPLE_DTO_EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSimpleDtoExceptId(Long simpleDtoExceptId) {
        registerModifiedProperty("simpleDtoExceptId");
        _simpleDtoExceptId = simpleDtoExceptId;
    }

    /**
     * [get] SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SIMPLE_DTO_EXCEPT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSimpleDtoExceptName() {
        checkSpecifiedProperty("simpleDtoExceptName");
        return convertEmptyToNull(_simpleDtoExceptName);
    }

    /**
     * [set] SIMPLE_DTO_EXCEPT_NAME: {NotNull, VARCHAR(200)} <br>
     * @param simpleDtoExceptName The value of the column 'SIMPLE_DTO_EXCEPT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSimpleDtoExceptName(String simpleDtoExceptName) {
        registerModifiedProperty("simpleDtoExceptName");
        _simpleDtoExceptName = simpleDtoExceptName;
    }
}
