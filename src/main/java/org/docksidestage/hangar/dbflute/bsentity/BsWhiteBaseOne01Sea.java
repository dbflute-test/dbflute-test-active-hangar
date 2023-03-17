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
 * The entity of WHITE_BASE_ONE01_SEA as TABLE.
 * <pre>
 * [primary-key]
 *     SEA_ID
 *
 * [column]
 *     SEA_ID, SEA_NAME, BROADWAY_ID, DOCKSIDE_ID
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
 *     WHITE_BASE_ONE01_SEA_BROADWAY, WHITE_BASE_ONE01_SEA_DOCKSIDE, WHITE_BASE_ONE01_SEA_HANGAR(AsOne)
 *
 * [referrer table]
 *     WHITE_BASE, WHITE_BASE_ONE01_SEA_MAGICLAMP, WHITE_BASE_ONE01_SEA_HANGAR
 *
 * [foreign property]
 *     whiteBaseOne01SeaBroadway, whiteBaseOne01SeaDockside, whiteBaseOne01SeaHangarAsOne
 *
 * [referrer property]
 *     whiteBaseList, whiteBaseOne01SeaMagiclampList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer seaId = entity.getSeaId();
 * String seaName = entity.getSeaName();
 * Integer broadwayId = entity.getBroadwayId();
 * Integer docksideId = entity.getDocksideId();
 * entity.setSeaId(seaId);
 * entity.setSeaName(seaName);
 * entity.setBroadwayId(broadwayId);
 * entity.setDocksideId(docksideId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01Sea extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SEA_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _seaId;

    /** SEA_NAME: {NotNull, VARCHAR(200)} */
    protected String _seaName;

    /** BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY} */
    protected Integer _broadwayId;

    /** DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE} */
    protected Integer _docksideId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE01_SEA";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_seaId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'. */
    protected OptionalEntity<WhiteBaseOne01SeaBroadway> _whiteBaseOne01SeaBroadway;

    /**
     * [get] WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne01SeaBroadway'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne01SeaBroadway> getWhiteBaseOne01SeaBroadway() {
        if (_whiteBaseOne01SeaBroadway == null) { _whiteBaseOne01SeaBroadway = OptionalEntity.relationEmpty(this, "whiteBaseOne01SeaBroadway"); }
        return _whiteBaseOne01SeaBroadway;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'.
     * @param whiteBaseOne01SeaBroadway The entity of foreign property 'whiteBaseOne01SeaBroadway'. (NullAllowed)
     */
    public void setWhiteBaseOne01SeaBroadway(OptionalEntity<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadway) {
        _whiteBaseOne01SeaBroadway = whiteBaseOne01SeaBroadway;
    }

    /** WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'. */
    protected OptionalEntity<WhiteBaseOne01SeaDockside> _whiteBaseOne01SeaDockside;

    /**
     * [get] WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne01SeaDockside'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne01SeaDockside> getWhiteBaseOne01SeaDockside() {
        if (_whiteBaseOne01SeaDockside == null) { _whiteBaseOne01SeaDockside = OptionalEntity.relationEmpty(this, "whiteBaseOne01SeaDockside"); }
        return _whiteBaseOne01SeaDockside;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'.
     * @param whiteBaseOne01SeaDockside The entity of foreign property 'whiteBaseOne01SeaDockside'. (NullAllowed)
     */
    public void setWhiteBaseOne01SeaDockside(OptionalEntity<WhiteBaseOne01SeaDockside> whiteBaseOne01SeaDockside) {
        _whiteBaseOne01SeaDockside = whiteBaseOne01SeaDockside;
    }

    /** WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'. */
    protected OptionalEntity<WhiteBaseOne01SeaHangar> _whiteBaseOne01SeaHangarAsOne;

    /**
     * [get] WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteBaseOne01SeaHangarAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne01SeaHangar> getWhiteBaseOne01SeaHangarAsOne() {
        if (_whiteBaseOne01SeaHangarAsOne == null) { _whiteBaseOne01SeaHangarAsOne = OptionalEntity.relationEmpty(this, "whiteBaseOne01SeaHangarAsOne"); }
        return _whiteBaseOne01SeaHangarAsOne;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
     * @param whiteBaseOne01SeaHangarAsOne The entity of foreign property(referrer-as-one) 'whiteBaseOne01SeaHangarAsOne'. (NullAllowed)
     */
    public void setWhiteBaseOne01SeaHangarAsOne(OptionalEntity<WhiteBaseOne01SeaHangar> whiteBaseOne01SeaHangarAsOne) {
        _whiteBaseOne01SeaHangarAsOne = whiteBaseOne01SeaHangarAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE by SEA_ID, named 'whiteBaseList'. */
    protected List<WhiteBase> _whiteBaseList;

    /**
     * [get] WHITE_BASE by SEA_ID, named 'whiteBaseList'.
     * @return The entity list of referrer property 'whiteBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBase> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = newReferrerList(); }
        return _whiteBaseList;
    }

    /**
     * [set] WHITE_BASE by SEA_ID, named 'whiteBaseList'.
     * @param whiteBaseList The entity list of referrer property 'whiteBaseList'. (NullAllowed)
     */
    public void setWhiteBaseList(List<WhiteBase> whiteBaseList) {
        _whiteBaseList = whiteBaseList;
    }

    /** WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampList'. */
    protected List<WhiteBaseOne01SeaMagiclamp> _whiteBaseOne01SeaMagiclampList;

    /**
     * [get] WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampList'.
     * @return The entity list of referrer property 'whiteBaseOne01SeaMagiclampList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBaseOne01SeaMagiclamp> getWhiteBaseOne01SeaMagiclampList() {
        if (_whiteBaseOne01SeaMagiclampList == null) { _whiteBaseOne01SeaMagiclampList = newReferrerList(); }
        return _whiteBaseOne01SeaMagiclampList;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampList'.
     * @param whiteBaseOne01SeaMagiclampList The entity list of referrer property 'whiteBaseOne01SeaMagiclampList'. (NullAllowed)
     */
    public void setWhiteBaseOne01SeaMagiclampList(List<WhiteBaseOne01SeaMagiclamp> whiteBaseOne01SeaMagiclampList) {
        _whiteBaseOne01SeaMagiclampList = whiteBaseOne01SeaMagiclampList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne01Sea) {
            BsWhiteBaseOne01Sea other = (BsWhiteBaseOne01Sea)obj;
            if (!xSV(_seaId, other._seaId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _seaId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01SeaBroadway != null && _whiteBaseOne01SeaBroadway.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne01SeaBroadway, "whiteBaseOne01SeaBroadway")); }
        if (_whiteBaseOne01SeaDockside != null && _whiteBaseOne01SeaDockside.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne01SeaDockside, "whiteBaseOne01SeaDockside")); }
        if (_whiteBaseOne01SeaHangarAsOne != null && _whiteBaseOne01SeaHangarAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne01SeaHangarAsOne, "whiteBaseOne01SeaHangarAsOne")); }
        if (_whiteBaseList != null) { for (WhiteBase et : _whiteBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseList")); } } }
        if (_whiteBaseOne01SeaMagiclampList != null) { for (WhiteBaseOne01SeaMagiclamp et : _whiteBaseOne01SeaMagiclampList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseOne01SeaMagiclampList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_seaId));
        sb.append(dm).append(xfND(_seaName));
        sb.append(dm).append(xfND(_broadwayId));
        sb.append(dm).append(xfND(_docksideId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01SeaBroadway != null && _whiteBaseOne01SeaBroadway.isPresent())
        { sb.append(dm).append("whiteBaseOne01SeaBroadway"); }
        if (_whiteBaseOne01SeaDockside != null && _whiteBaseOne01SeaDockside.isPresent())
        { sb.append(dm).append("whiteBaseOne01SeaDockside"); }
        if (_whiteBaseOne01SeaHangarAsOne != null && _whiteBaseOne01SeaHangarAsOne.isPresent())
        { sb.append(dm).append("whiteBaseOne01SeaHangarAsOne"); }
        if (_whiteBaseList != null && !_whiteBaseList.isEmpty())
        { sb.append(dm).append("whiteBaseList"); }
        if (_whiteBaseOne01SeaMagiclampList != null && !_whiteBaseOne01SeaMagiclampList.isEmpty())
        { sb.append(dm).append("whiteBaseOne01SeaMagiclampList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne01Sea clone() {
        return (WhiteBaseOne01Sea)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SEA_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'SEA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSeaId() {
        checkSpecifiedProperty("seaId");
        return _seaId;
    }

    /**
     * [set] SEA_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param seaId The value of the column 'SEA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSeaId(Integer seaId) {
        registerModifiedProperty("seaId");
        _seaId = seaId;
    }

    /**
     * [get] SEA_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SEA_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSeaName() {
        checkSpecifiedProperty("seaName");
        return convertEmptyToNull(_seaName);
    }

    /**
     * [set] SEA_NAME: {NotNull, VARCHAR(200)} <br>
     * @param seaName The value of the column 'SEA_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSeaName(String seaName) {
        registerModifiedProperty("seaName");
        _seaName = seaName;
    }

    /**
     * [get] BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY} <br>
     * @return The value of the column 'BROADWAY_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBroadwayId() {
        checkSpecifiedProperty("broadwayId");
        return _broadwayId;
    }

    /**
     * [set] BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY} <br>
     * @param broadwayId The value of the column 'BROADWAY_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBroadwayId(Integer broadwayId) {
        registerModifiedProperty("broadwayId");
        _broadwayId = broadwayId;
    }

    /**
     * [get] DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE} <br>
     * @return The value of the column 'DOCKSIDE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDocksideId() {
        checkSpecifiedProperty("docksideId");
        return _docksideId;
    }

    /**
     * [set] DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE} <br>
     * @param docksideId The value of the column 'DOCKSIDE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDocksideId(Integer docksideId) {
        registerModifiedProperty("docksideId");
        _docksideId = docksideId;
    }
}
