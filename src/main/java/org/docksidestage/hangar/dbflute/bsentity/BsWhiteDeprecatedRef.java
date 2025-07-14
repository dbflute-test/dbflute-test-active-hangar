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

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_DEPRECATED_REF as TABLE.
 * <pre>
 * [primary-key]
 *     DEPRECATED_REF_ID
 *
 * [column]
 *     DEPRECATED_REF_ID, DEPRECATED_ID, DEPRECATED_REF_NAME, DEPRECATED_REF_CODE
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
 *     WHITE_DEPRECATED
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteDeprecated
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long deprecatedRefId = entity.getDeprecatedRefId();
 * Long deprecatedId = entity.getDeprecatedId();
 * String deprecatedRefName = entity.getDeprecatedRefName();
 * String deprecatedRefCode = entity.getDeprecatedRefCode();
 * entity.setDeprecatedRefId(deprecatedRefId);
 * entity.setDeprecatedId(deprecatedId);
 * entity.setDeprecatedRefName(deprecatedRefName);
 * entity.setDeprecatedRefCode(deprecatedRefCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _deprecatedRefId;

    /** DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} */
    protected Long _deprecatedId;

    /** DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} */
    protected String _deprecatedRefName;

    /** DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} */
    protected String _deprecatedRefCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DEPRECATED_REF";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_deprecatedRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'. */
    protected OptionalEntity<WhiteDeprecated> _whiteDeprecated;

    /**
     * [get] WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteDeprecated'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteDeprecated> getWhiteDeprecated() {
        if (_whiteDeprecated == null) { _whiteDeprecated = OptionalEntity.relationEmpty(this, "whiteDeprecated"); }
        return _whiteDeprecated;
    }

    /**
     * [set] WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'.
     * @param whiteDeprecated The entity of foreign property 'whiteDeprecated'. (NullAllowed)
     */
    public void setWhiteDeprecated(OptionalEntity<WhiteDeprecated> whiteDeprecated) {
        _whiteDeprecated = whiteDeprecated;
    }

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
        if (obj instanceof BsWhiteDeprecatedRef) {
            BsWhiteDeprecatedRef other = (BsWhiteDeprecatedRef)obj;
            if (!xSV(_deprecatedRefId, other._deprecatedRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deprecatedRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteDeprecated != null && _whiteDeprecated.isPresent())
        { sb.append(li).append(xbRDS(_whiteDeprecated, "whiteDeprecated")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deprecatedRefId));
        sb.append(dm).append(xfND(_deprecatedId));
        sb.append(dm).append(xfND(_deprecatedRefName));
        sb.append(dm).append(xfND(_deprecatedRefCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteDeprecated != null && _whiteDeprecated.isPresent())
        { sb.append(dm).append("whiteDeprecated"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteDeprecatedRef clone() {
        return (WhiteDeprecatedRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPRECATED_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeprecatedRefId() {
        checkSpecifiedProperty("deprecatedRefId");
        return _deprecatedRefId;
    }

    /**
     * [set] DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deprecatedRefId The value of the column 'DEPRECATED_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedRefId(Long deprecatedRefId) {
        registerModifiedProperty("deprecatedRefId");
        _deprecatedRefId = deprecatedRefId;
    }

    /**
     * [get] DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} <br>
     * @return The value of the column 'DEPRECATED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeprecatedId() {
        checkSpecifiedProperty("deprecatedId");
        return _deprecatedId;
    }

    /**
     * [set] DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} <br>
     * @param deprecatedId The value of the column 'DEPRECATED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedId(Long deprecatedId) {
        registerModifiedProperty("deprecatedId");
        _deprecatedId = deprecatedId;
    }

    /**
     * [get] DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEPRECATED_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedRefName() {
        checkSpecifiedProperty("deprecatedRefName");
        return convertEmptyToNull(_deprecatedRefName);
    }

    /**
     * [set] DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param deprecatedRefName The value of the column 'DEPRECATED_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedRefName(String deprecatedRefName) {
        registerModifiedProperty("deprecatedRefName");
        _deprecatedRefName = deprecatedRefName;
    }

    /**
     * [get] DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'DEPRECATED_REF_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedRefCode() {
        checkSpecifiedProperty("deprecatedRefCode");
        return convertEmptyToNull(_deprecatedRefCode);
    }

    /**
     * [set] DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * @param deprecatedRefCode The value of the column 'DEPRECATED_REF_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedRefCode(String deprecatedRefCode) {
        registerModifiedProperty("deprecatedRefCode");
        _deprecatedRefCode = deprecatedRefCode;
    }
}
