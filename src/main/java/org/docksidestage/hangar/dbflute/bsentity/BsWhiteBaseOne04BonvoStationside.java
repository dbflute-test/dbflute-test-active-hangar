package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_BASE_ONE04_BONVO_STATIONSIDE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     STATIONSIDE_ID
 *
 * [column]
 *     STATIONSIDE_ID, STATIONSIDE_NAME
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
 *     WHITE_BASE_ONE04_BONVO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne04BonvoList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer stationsideId = entity.getStationsideId();
 * String stationsideName = entity.getStationsideName();
 * entity.setStationsideId(stationsideId);
 * entity.setStationsideName(stationsideName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne04BonvoStationside extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** STATIONSIDE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _stationsideId;

    /** STATIONSIDE_NAME: {NotNull, VARCHAR(200)} */
    protected String _stationsideName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE04_BONVO_STATIONSIDE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_stationsideId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoList'. */
    protected List<WhiteBaseOne04Bonvo> _whiteBaseOne04BonvoList;

    /**
     * [get] WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * @return The entity list of referrer property 'whiteBaseOne04BonvoList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBaseOne04Bonvo> getWhiteBaseOne04BonvoList() {
        if (_whiteBaseOne04BonvoList == null) { _whiteBaseOne04BonvoList = newReferrerList(); }
        return _whiteBaseOne04BonvoList;
    }

    /**
     * [set] WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * @param whiteBaseOne04BonvoList The entity list of referrer property 'whiteBaseOne04BonvoList'. (NullAllowed)
     */
    public void setWhiteBaseOne04BonvoList(List<WhiteBaseOne04Bonvo> whiteBaseOne04BonvoList) {
        _whiteBaseOne04BonvoList = whiteBaseOne04BonvoList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne04BonvoStationside) {
            BsWhiteBaseOne04BonvoStationside other = (BsWhiteBaseOne04BonvoStationside)obj;
            if (!xSV(_stationsideId, other._stationsideId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _stationsideId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne04BonvoList != null) { for (WhiteBaseOne04Bonvo et : _whiteBaseOne04BonvoList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseOne04BonvoList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stationsideId));
        sb.append(dm).append(xfND(_stationsideName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne04BonvoList != null && !_whiteBaseOne04BonvoList.isEmpty())
        { sb.append(dm).append("whiteBaseOne04BonvoList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne04BonvoStationside clone() {
        return (WhiteBaseOne04BonvoStationside)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATIONSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'STATIONSIDE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStationsideId() {
        checkSpecifiedProperty("stationsideId");
        return _stationsideId;
    }

    /**
     * [set] STATIONSIDE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param stationsideId The value of the column 'STATIONSIDE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStationsideId(Integer stationsideId) {
        registerModifiedProperty("stationsideId");
        _stationsideId = stationsideId;
    }

    /**
     * [get] STATIONSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'STATIONSIDE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getStationsideName() {
        checkSpecifiedProperty("stationsideName");
        return convertEmptyToNull(_stationsideName);
    }

    /**
     * [set] STATIONSIDE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param stationsideName The value of the column 'STATIONSIDE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setStationsideName(String stationsideName) {
        registerModifiedProperty("stationsideName");
        _stationsideName = stationsideName;
    }
}
