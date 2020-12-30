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
 * The entity of WHITE_BASE_ONE04_BONVO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BONVO_ID
 *
 * [column]
 *     BONVO_ID, BONVO_NAME, PARKSIDE_ID, STATIONSIDE_ID
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
 *     WHITE_BASE_ONE04_BONVO_PARKSIDE, WHITE_BASE_ONE04_BONVO_STATIONSIDE
 *
 * [referrer table]
 *     WHITE_BASE
 *
 * [foreign property]
 *     whiteBaseOne04BonvoParkside, whiteBaseOne04BonvoStationside
 *
 * [referrer property]
 *     whiteBaseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer bonvoId = entity.getBonvoId();
 * String bonvoName = entity.getBonvoName();
 * Integer parksideId = entity.getParksideId();
 * Integer stationsideId = entity.getStationsideId();
 * entity.setBonvoId(bonvoId);
 * entity.setBonvoName(bonvoName);
 * entity.setParksideId(parksideId);
 * entity.setStationsideId(stationsideId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne04Bonvo extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BONVO_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _bonvoId;

    /** BONVO_NAME: {NotNull, VARCHAR(200)} */
    protected String _bonvoName;

    /** PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE} */
    protected Integer _parksideId;

    /** STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE} */
    protected Integer _stationsideId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE04_BONVO";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_bonvoId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE_ONE04_BONVO_PARKSIDE by my PARKSIDE_ID, named 'whiteBaseOne04BonvoParkside'. */
    protected OptionalEntity<WhiteBaseOne04BonvoParkside> _whiteBaseOne04BonvoParkside;

    /**
     * [get] WHITE_BASE_ONE04_BONVO_PARKSIDE by my PARKSIDE_ID, named 'whiteBaseOne04BonvoParkside'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne04BonvoParkside'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne04BonvoParkside> getWhiteBaseOne04BonvoParkside() {
        if (_whiteBaseOne04BonvoParkside == null) { _whiteBaseOne04BonvoParkside = OptionalEntity.relationEmpty(this, "whiteBaseOne04BonvoParkside"); }
        return _whiteBaseOne04BonvoParkside;
    }

    /**
     * [set] WHITE_BASE_ONE04_BONVO_PARKSIDE by my PARKSIDE_ID, named 'whiteBaseOne04BonvoParkside'.
     * @param whiteBaseOne04BonvoParkside The entity of foreign property 'whiteBaseOne04BonvoParkside'. (NullAllowed)
     */
    public void setWhiteBaseOne04BonvoParkside(OptionalEntity<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParkside) {
        _whiteBaseOne04BonvoParkside = whiteBaseOne04BonvoParkside;
    }

    /** WHITE_BASE_ONE04_BONVO_STATIONSIDE by my STATIONSIDE_ID, named 'whiteBaseOne04BonvoStationside'. */
    protected OptionalEntity<WhiteBaseOne04BonvoStationside> _whiteBaseOne04BonvoStationside;

    /**
     * [get] WHITE_BASE_ONE04_BONVO_STATIONSIDE by my STATIONSIDE_ID, named 'whiteBaseOne04BonvoStationside'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne04BonvoStationside'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne04BonvoStationside> getWhiteBaseOne04BonvoStationside() {
        if (_whiteBaseOne04BonvoStationside == null) { _whiteBaseOne04BonvoStationside = OptionalEntity.relationEmpty(this, "whiteBaseOne04BonvoStationside"); }
        return _whiteBaseOne04BonvoStationside;
    }

    /**
     * [set] WHITE_BASE_ONE04_BONVO_STATIONSIDE by my STATIONSIDE_ID, named 'whiteBaseOne04BonvoStationside'.
     * @param whiteBaseOne04BonvoStationside The entity of foreign property 'whiteBaseOne04BonvoStationside'. (NullAllowed)
     */
    public void setWhiteBaseOne04BonvoStationside(OptionalEntity<WhiteBaseOne04BonvoStationside> whiteBaseOne04BonvoStationside) {
        _whiteBaseOne04BonvoStationside = whiteBaseOne04BonvoStationside;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE by BONVO_ID, named 'whiteBaseList'. */
    protected List<WhiteBase> _whiteBaseList;

    /**
     * [get] WHITE_BASE by BONVO_ID, named 'whiteBaseList'.
     * @return The entity list of referrer property 'whiteBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBase> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = newReferrerList(); }
        return _whiteBaseList;
    }

    /**
     * [set] WHITE_BASE by BONVO_ID, named 'whiteBaseList'.
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
        if (obj instanceof BsWhiteBaseOne04Bonvo) {
            BsWhiteBaseOne04Bonvo other = (BsWhiteBaseOne04Bonvo)obj;
            if (!xSV(_bonvoId, other._bonvoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _bonvoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne04BonvoParkside != null && _whiteBaseOne04BonvoParkside.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne04BonvoParkside, "whiteBaseOne04BonvoParkside")); }
        if (_whiteBaseOne04BonvoStationside != null && _whiteBaseOne04BonvoStationside.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne04BonvoStationside, "whiteBaseOne04BonvoStationside")); }
        if (_whiteBaseList != null) { for (WhiteBase et : _whiteBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_bonvoId));
        sb.append(dm).append(xfND(_bonvoName));
        sb.append(dm).append(xfND(_parksideId));
        sb.append(dm).append(xfND(_stationsideId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne04BonvoParkside != null && _whiteBaseOne04BonvoParkside.isPresent())
        { sb.append(dm).append("whiteBaseOne04BonvoParkside"); }
        if (_whiteBaseOne04BonvoStationside != null && _whiteBaseOne04BonvoStationside.isPresent())
        { sb.append(dm).append("whiteBaseOne04BonvoStationside"); }
        if (_whiteBaseList != null && !_whiteBaseList.isEmpty())
        { sb.append(dm).append("whiteBaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne04Bonvo clone() {
        return (WhiteBaseOne04Bonvo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BONVO_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'BONVO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBonvoId() {
        checkSpecifiedProperty("bonvoId");
        return _bonvoId;
    }

    /**
     * [set] BONVO_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param bonvoId The value of the column 'BONVO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBonvoId(Integer bonvoId) {
        registerModifiedProperty("bonvoId");
        _bonvoId = bonvoId;
    }

    /**
     * [get] BONVO_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'BONVO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getBonvoName() {
        checkSpecifiedProperty("bonvoName");
        return convertEmptyToNull(_bonvoName);
    }

    /**
     * [set] BONVO_NAME: {NotNull, VARCHAR(200)} <br>
     * @param bonvoName The value of the column 'BONVO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setBonvoName(String bonvoName) {
        registerModifiedProperty("bonvoName");
        _bonvoName = bonvoName;
    }

    /**
     * [get] PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE} <br>
     * @return The value of the column 'PARKSIDE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getParksideId() {
        checkSpecifiedProperty("parksideId");
        return _parksideId;
    }

    /**
     * [set] PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE} <br>
     * @param parksideId The value of the column 'PARKSIDE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParksideId(Integer parksideId) {
        registerModifiedProperty("parksideId");
        _parksideId = parksideId;
    }

    /**
     * [get] STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE} <br>
     * @return The value of the column 'STATIONSIDE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStationsideId() {
        checkSpecifiedProperty("stationsideId");
        return _stationsideId;
    }

    /**
     * [set] STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE} <br>
     * @param stationsideId The value of the column 'STATIONSIDE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStationsideId(Integer stationsideId) {
        registerModifiedProperty("stationsideId");
        _stationsideId = stationsideId;
    }
}
