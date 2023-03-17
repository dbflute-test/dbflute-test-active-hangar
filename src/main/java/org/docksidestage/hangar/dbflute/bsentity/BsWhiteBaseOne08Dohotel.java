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
 * The entity of WHITE_BASE_ONE08_DOHOTEL as TABLE.
 * <pre>
 * [primary-key]
 *     DOHOTEL_ID
 *
 * [column]
 *     DOHOTEL_ID, DOHOTEL_NAME
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
 *     WHITE_BASE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer dohotelId = entity.getDohotelId();
 * String dohotelName = entity.getDohotelName();
 * entity.setDohotelId(dohotelId);
 * entity.setDohotelName(dohotelName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne08Dohotel extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DOHOTEL_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _dohotelId;

    /** DOHOTEL_NAME: {NotNull, VARCHAR(200)} */
    protected String _dohotelName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE08_DOHOTEL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dohotelId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE by DOHOTEL_ID, named 'whiteBaseList'. */
    protected List<WhiteBase> _whiteBaseList;

    /**
     * [get] WHITE_BASE by DOHOTEL_ID, named 'whiteBaseList'.
     * @return The entity list of referrer property 'whiteBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBase> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = newReferrerList(); }
        return _whiteBaseList;
    }

    /**
     * [set] WHITE_BASE by DOHOTEL_ID, named 'whiteBaseList'.
     * @param whiteBaseList The entity list of referrer property 'whiteBaseList'. (NullAllowed)
     */
    public void setWhiteBaseList(List<WhiteBase> whiteBaseList) {
        _whiteBaseList = whiteBaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne08Dohotel) {
            BsWhiteBaseOne08Dohotel other = (BsWhiteBaseOne08Dohotel)obj;
            if (!xSV(_dohotelId, other._dohotelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dohotelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseList != null) { for (WhiteBase et : _whiteBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dohotelId));
        sb.append(dm).append(xfND(_dohotelName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseList != null && !_whiteBaseList.isEmpty())
        { sb.append(dm).append("whiteBaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne08Dohotel clone() {
        return (WhiteBaseOne08Dohotel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DOHOTEL_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DOHOTEL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDohotelId() {
        checkSpecifiedProperty("dohotelId");
        return _dohotelId;
    }

    /**
     * [set] DOHOTEL_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param dohotelId The value of the column 'DOHOTEL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDohotelId(Integer dohotelId) {
        registerModifiedProperty("dohotelId");
        _dohotelId = dohotelId;
    }

    /**
     * [get] DOHOTEL_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DOHOTEL_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDohotelName() {
        checkSpecifiedProperty("dohotelName");
        return convertEmptyToNull(_dohotelName);
    }

    /**
     * [set] DOHOTEL_NAME: {NotNull, VARCHAR(200)} <br>
     * @param dohotelName The value of the column 'DOHOTEL_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDohotelName(String dohotelName) {
        registerModifiedProperty("dohotelName");
        _dohotelName = dohotelName;
    }
}
