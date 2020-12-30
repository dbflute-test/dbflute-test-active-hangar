package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE01_SEA as TABLE. <br>
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
 * [foreign-table]
 *     WHITE_BASE_ONE01_SEA_BROADWAY, WHITE_BASE_ONE01_SEA_DOCKSIDE, WHITE_BASE_ONE01_SEA_HANGAR(AsOne)
 *
 * [referrer-table]
 *     WHITE_BASE, WHITE_BASE_ONE01_SEA_MAGICLAMP, WHITE_BASE_ONE01_SEA_HANGAR
 *
 * [foreign-property]
 *     whiteBaseOne01SeaBroadway, whiteBaseOne01SeaDockside, whiteBaseOne01SeaHangarAsOne
 *
 * [referrer-property]
 *     whiteBaseList, whiteBaseOne01SeaMagiclampList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne01SeaDto implements Serializable {

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
    /** SEA_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _seaId;

    /** SEA_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _seaName;

    /** BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY} */
    @JsonKey
    protected Integer _broadwayId;

    /** DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE} */
    @JsonKey
    protected Integer _docksideId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaDto() {
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
    protected WhiteBaseOne01SeaBroadwayDto _whiteBaseOne01SeaBroadway;

    public WhiteBaseOne01SeaBroadwayDto getWhiteBaseOne01SeaBroadway() {
        return _whiteBaseOne01SeaBroadway;
    }

    public void setWhiteBaseOne01SeaBroadway(WhiteBaseOne01SeaBroadwayDto whiteBaseOne01SeaBroadway) {
        this._whiteBaseOne01SeaBroadway = whiteBaseOne01SeaBroadway;
    }

    protected WhiteBaseOne01SeaDocksideDto _whiteBaseOne01SeaDockside;

    public WhiteBaseOne01SeaDocksideDto getWhiteBaseOne01SeaDockside() {
        return _whiteBaseOne01SeaDockside;
    }

    public void setWhiteBaseOne01SeaDockside(WhiteBaseOne01SeaDocksideDto whiteBaseOne01SeaDockside) {
        this._whiteBaseOne01SeaDockside = whiteBaseOne01SeaDockside;
    }

    protected WhiteBaseOne01SeaHangarDto _whiteBaseOne01SeaHangarAsOne;

    public WhiteBaseOne01SeaHangarDto getWhiteBaseOne01SeaHangarAsOne() {
        return _whiteBaseOne01SeaHangarAsOne;
    }

    public void setWhiteBaseOne01SeaHangarAsOne(WhiteBaseOne01SeaHangarDto whiteBaseOne01SeaHangarAsOne) {
        this._whiteBaseOne01SeaHangarAsOne = whiteBaseOne01SeaHangarAsOne;
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

    protected List<WhiteBaseOne01SeaMagiclampDto> _whiteBaseOne01SeaMagiclampList;

    public List<WhiteBaseOne01SeaMagiclampDto> getWhiteBaseOne01SeaMagiclampList() {
        if (_whiteBaseOne01SeaMagiclampList == null) { _whiteBaseOne01SeaMagiclampList = new ArrayList<WhiteBaseOne01SeaMagiclampDto>(); }
        return _whiteBaseOne01SeaMagiclampList;
    }

    public void setWhiteBaseOne01SeaMagiclampList(List<WhiteBaseOne01SeaMagiclampDto> whiteBaseOne01SeaMagiclampList) {
        this._whiteBaseOne01SeaMagiclampList = whiteBaseOne01SeaMagiclampList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne01SeaDto)) { return false; }
        final BsWhiteBaseOne01SeaDto otherEntity = (BsWhiteBaseOne01SeaDto)other;
        if (!helpComparingValue(getSeaId(), otherEntity.getSeaId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE01_SEA");
        result = xCH(result, getSeaId());
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
        sb.append(c).append(getSeaId());
        sb.append(c).append(getSeaName());
        sb.append(c).append(getBroadwayId());
        sb.append(c).append(getDocksideId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SEA_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'SEA_ID'. (NullAllowed)
     */
    public Integer getSeaId() {
        return _seaId;
    }

    /**
     * [set] SEA_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param seaId The value of the column 'SEA_ID'. (NullAllowed)
     */
    public void setSeaId(Integer seaId) {
        __modifiedProperties.add("seaId");
        this._seaId = seaId;
    }

    /**
     * [get] SEA_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SEA_NAME'. (NullAllowed)
     */
    public String getSeaName() {
        return _seaName;
    }

    /**
     * [set] SEA_NAME: {NotNull, VARCHAR(200)} <br>
     * @param seaName The value of the column 'SEA_NAME'. (NullAllowed)
     */
    public void setSeaName(String seaName) {
        __modifiedProperties.add("seaName");
        this._seaName = seaName;
    }

    /**
     * [get] BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY} <br>
     * @return The value of the column 'BROADWAY_ID'. (NullAllowed)
     */
    public Integer getBroadwayId() {
        return _broadwayId;
    }

    /**
     * [set] BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY} <br>
     * @param broadwayId The value of the column 'BROADWAY_ID'. (NullAllowed)
     */
    public void setBroadwayId(Integer broadwayId) {
        __modifiedProperties.add("broadwayId");
        this._broadwayId = broadwayId;
    }

    /**
     * [get] DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE} <br>
     * @return The value of the column 'DOCKSIDE_ID'. (NullAllowed)
     */
    public Integer getDocksideId() {
        return _docksideId;
    }

    /**
     * [set] DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE} <br>
     * @param docksideId The value of the column 'DOCKSIDE_ID'. (NullAllowed)
     */
    public void setDocksideId(Integer docksideId) {
        __modifiedProperties.add("docksideId");
        this._docksideId = docksideId;
    }

}
