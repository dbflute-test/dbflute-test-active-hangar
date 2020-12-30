package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE01_SEA_BROADWAY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BROADWAY_ID
 *
 * [column]
 *     BROADWAY_ID, BROADWAY_NAME
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
 *     
 *
 * [referrer-table]
 *     WHITE_BASE_ONE01_SEA
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseOne01SeaList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne01SeaBroadwayDto implements Serializable {

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
    /** BROADWAY_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _broadwayId;

    /** BROADWAY_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _broadwayName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaBroadwayDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<WhiteBaseOne01SeaDto> _whiteBaseOne01SeaList;

    public List<WhiteBaseOne01SeaDto> getWhiteBaseOne01SeaList() {
        if (_whiteBaseOne01SeaList == null) { _whiteBaseOne01SeaList = new ArrayList<WhiteBaseOne01SeaDto>(); }
        return _whiteBaseOne01SeaList;
    }

    public void setWhiteBaseOne01SeaList(List<WhiteBaseOne01SeaDto> whiteBaseOne01SeaList) {
        this._whiteBaseOne01SeaList = whiteBaseOne01SeaList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne01SeaBroadwayDto)) { return false; }
        final BsWhiteBaseOne01SeaBroadwayDto otherEntity = (BsWhiteBaseOne01SeaBroadwayDto)other;
        if (!helpComparingValue(getBroadwayId(), otherEntity.getBroadwayId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE01_SEA_BROADWAY");
        result = xCH(result, getBroadwayId());
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
        sb.append(c).append(getBroadwayId());
        sb.append(c).append(getBroadwayName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BROADWAY_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'BROADWAY_ID'. (NullAllowed)
     */
    public Integer getBroadwayId() {
        return _broadwayId;
    }

    /**
     * [set] BROADWAY_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param broadwayId The value of the column 'BROADWAY_ID'. (NullAllowed)
     */
    public void setBroadwayId(Integer broadwayId) {
        __modifiedProperties.add("broadwayId");
        this._broadwayId = broadwayId;
    }

    /**
     * [get] BROADWAY_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'BROADWAY_NAME'. (NullAllowed)
     */
    public String getBroadwayName() {
        return _broadwayName;
    }

    /**
     * [set] BROADWAY_NAME: {NotNull, VARCHAR(200)} <br>
     * @param broadwayName The value of the column 'BROADWAY_NAME'. (NullAllowed)
     */
    public void setBroadwayName(String broadwayName) {
        __modifiedProperties.add("broadwayName");
        this._broadwayName = broadwayName;
    }

}
