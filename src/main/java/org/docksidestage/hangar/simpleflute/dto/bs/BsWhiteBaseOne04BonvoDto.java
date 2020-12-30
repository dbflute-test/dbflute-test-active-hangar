package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE04_BONVO as TABLE. <br>
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
 * [foreign-table]
 *     WHITE_BASE_ONE04_BONVO_PARKSIDE, WHITE_BASE_ONE04_BONVO_STATIONSIDE
 *
 * [referrer-table]
 *     WHITE_BASE
 *
 * [foreign-property]
 *     whiteBaseOne04BonvoParkside, whiteBaseOne04BonvoStationside
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne04BonvoDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BONVO_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _bonvoId;

    /** BONVO_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _bonvoName;

    /** PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE} */
    @JsonKey
    protected Integer _parksideId;

    /** STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE} */
    @JsonKey
    protected Integer _stationsideId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne04BonvoDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected WhiteBaseOne04BonvoParksideDto _whiteBaseOne04BonvoParkside;

    public WhiteBaseOne04BonvoParksideDto getWhiteBaseOne04BonvoParkside() {
        return _whiteBaseOne04BonvoParkside;
    }

    public void setWhiteBaseOne04BonvoParkside(WhiteBaseOne04BonvoParksideDto whiteBaseOne04BonvoParkside) {
        this._whiteBaseOne04BonvoParkside = whiteBaseOne04BonvoParkside;
    }

    protected WhiteBaseOne04BonvoStationsideDto _whiteBaseOne04BonvoStationside;

    public WhiteBaseOne04BonvoStationsideDto getWhiteBaseOne04BonvoStationside() {
        return _whiteBaseOne04BonvoStationside;
    }

    public void setWhiteBaseOne04BonvoStationside(WhiteBaseOne04BonvoStationsideDto whiteBaseOne04BonvoStationside) {
        this._whiteBaseOne04BonvoStationside = whiteBaseOne04BonvoStationside;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<WhiteBaseDto> _whiteBaseList;

    public List<WhiteBaseDto> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = new ArrayList<WhiteBaseDto>(); }
        return _whiteBaseList;
    }

    public void setWhiteBaseList(List<WhiteBaseDto> whiteBaseList) {
        this._whiteBaseList = whiteBaseList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne04BonvoDto)) { return false; }
        final BsWhiteBaseOne04BonvoDto otherEntity = (BsWhiteBaseOne04BonvoDto)other;
        if (!helpComparingValue(getBonvoId(), otherEntity.getBonvoId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE04_BONVO");
        result = xCH(result, getBonvoId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getBonvoId());
        sb.append(c).append(getBonvoName());
        sb.append(c).append(getParksideId());
        sb.append(c).append(getStationsideId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BONVO_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'BONVO_ID'. (NullAllowed)
     */
    public Integer getBonvoId() {
        return _bonvoId;
    }

    /**
     * [set] BONVO_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param bonvoId The value of the column 'BONVO_ID'. (NullAllowed)
     */
    public void setBonvoId(Integer bonvoId) {
        __modifiedProperties.add("bonvoId");
        this._bonvoId = bonvoId;
    }

    /**
     * [get] BONVO_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'BONVO_NAME'. (NullAllowed)
     */
    public String getBonvoName() {
        return _bonvoName;
    }

    /**
     * [set] BONVO_NAME: {NotNull, VARCHAR(200)} <br>
     * @param bonvoName The value of the column 'BONVO_NAME'. (NullAllowed)
     */
    public void setBonvoName(String bonvoName) {
        __modifiedProperties.add("bonvoName");
        this._bonvoName = bonvoName;
    }

    /**
     * [get] PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE} <br>
     * @return The value of the column 'PARKSIDE_ID'. (NullAllowed)
     */
    public Integer getParksideId() {
        return _parksideId;
    }

    /**
     * [set] PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE} <br>
     * @param parksideId The value of the column 'PARKSIDE_ID'. (NullAllowed)
     */
    public void setParksideId(Integer parksideId) {
        __modifiedProperties.add("parksideId");
        this._parksideId = parksideId;
    }

    /**
     * [get] STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE} <br>
     * @return The value of the column 'STATIONSIDE_ID'. (NullAllowed)
     */
    public Integer getStationsideId() {
        return _stationsideId;
    }

    /**
     * [set] STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE} <br>
     * @param stationsideId The value of the column 'STATIONSIDE_ID'. (NullAllowed)
     */
    public void setStationsideId(Integer stationsideId) {
        __modifiedProperties.add("stationsideId");
        this._stationsideId = stationsideId;
    }

}
