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
 * The entity of (非推奨テスト)WHITE_DEPRECATED as TABLE. <br>
 * 非推奨テーブルにデコメントしちゃった。非推奨コメントはどこ？<br>
 * +deprecated test of deprecated
 * <pre>
 * [primary-key]
 *     DEPRECATED_ID
 *
 * [column]
 *     DEPRECATED_ID, DEPRECATED_NAME, DEPRECATED_CODE
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
 *     WHITE_DEPRECATED_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteDeprecatedRefList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long deprecatedId = entity.getDeprecatedId();
 * String deprecatedName = entity.getDeprecatedName();
 * String deprecatedCode = entity.getDeprecatedCode();
 * entity.setDeprecatedId(deprecatedId);
 * entity.setDeprecatedName(deprecatedName);
 * entity.setDeprecatedCode(deprecatedCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecated extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DEPRECATED_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _deprecatedId;

    /** DEPRECATED_NAME: {NotNull, VARCHAR(200)} */
    protected String _deprecatedName;

    /** DEPRECATED_CODE: {NotNull, VARCHAR(16)} */
    protected String _deprecatedCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DEPRECATED";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_deprecatedId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefList'. */
    protected List<WhiteDeprecatedRef> _whiteDeprecatedRefList;

    /**
     * [get] WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefList'.
     * @return The entity list of referrer property 'whiteDeprecatedRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteDeprecatedRef> getWhiteDeprecatedRefList() {
        if (_whiteDeprecatedRefList == null) { _whiteDeprecatedRefList = newReferrerList(); }
        return _whiteDeprecatedRefList;
    }

    /**
     * [set] WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefList'.
     * @param whiteDeprecatedRefList The entity list of referrer property 'whiteDeprecatedRefList'. (NullAllowed)
     */
    public void setWhiteDeprecatedRefList(List<WhiteDeprecatedRef> whiteDeprecatedRefList) {
        _whiteDeprecatedRefList = whiteDeprecatedRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteDeprecated) {
            BsWhiteDeprecated other = (BsWhiteDeprecated)obj;
            if (!xSV(_deprecatedId, other._deprecatedId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deprecatedId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteDeprecatedRefList != null) { for (WhiteDeprecatedRef et : _whiteDeprecatedRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteDeprecatedRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deprecatedId));
        sb.append(dm).append(xfND(_deprecatedName));
        sb.append(dm).append(xfND(_deprecatedCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteDeprecatedRefList != null && !_whiteDeprecatedRefList.isEmpty())
        { sb.append(dm).append("whiteDeprecatedRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteDeprecated clone() {
        return (WhiteDeprecated)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPRECATED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeprecatedId() {
        checkSpecifiedProperty("deprecatedId");
        return _deprecatedId;
    }

    /**
     * [set] DEPRECATED_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deprecatedId The value of the column 'DEPRECATED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedId(Long deprecatedId) {
        registerModifiedProperty("deprecatedId");
        _deprecatedId = deprecatedId;
    }

    /**
     * [get] DEPRECATED_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEPRECATED_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedName() {
        checkSpecifiedProperty("deprecatedName");
        return convertEmptyToNull(_deprecatedName);
    }

    /**
     * [set] DEPRECATED_NAME: {NotNull, VARCHAR(200)} <br>
     * @param deprecatedName The value of the column 'DEPRECATED_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedName(String deprecatedName) {
        registerModifiedProperty("deprecatedName");
        _deprecatedName = deprecatedName;
    }

    /**
     * [get] DEPRECATED_CODE: {NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'DEPRECATED_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedCode() {
        checkSpecifiedProperty("deprecatedCode");
        return convertEmptyToNull(_deprecatedCode);
    }

    /**
     * [set] DEPRECATED_CODE: {NotNull, VARCHAR(16)} <br>
     * @param deprecatedCode The value of the column 'DEPRECATED_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedCode(String deprecatedCode) {
        registerModifiedProperty("deprecatedCode");
        _deprecatedCode = deprecatedCode;
    }
}
