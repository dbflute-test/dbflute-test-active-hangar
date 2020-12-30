package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE12_AMPHI as TABLE. <br>
 * <pre>
 * [primary-key]
 *     AMPHI_ID
 *
 * [column]
 *     AMPHI_ID, AMPHI_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBase
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne12AmphiDto implements Serializable {

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
    /** AMPHI_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _amphiId;

    /** AMPHI_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _amphiName;

    /** BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} */
    @JsonKey
    protected Integer _baseId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne12AmphiDto() {
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
    protected WhiteBaseDto _whiteBase;

    public WhiteBaseDto getWhiteBase() {
        return _whiteBase;
    }

    public void setWhiteBase(WhiteBaseDto whiteBase) {
        this._whiteBase = whiteBase;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseOne12AmphiDto)) { return false; }
        final BsWhiteBaseOne12AmphiDto otherEntity = (BsWhiteBaseOne12AmphiDto)other;
        if (!helpComparingValue(getAmphiId(), otherEntity.getAmphiId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE12_AMPHI");
        result = xCH(result, getAmphiId());
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
        sb.append(c).append(getAmphiId());
        sb.append(c).append(getAmphiName());
        sb.append(c).append(getBaseId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] AMPHI_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'AMPHI_ID'. (NullAllowed)
     */
    public Integer getAmphiId() {
        return _amphiId;
    }

    /**
     * [set] AMPHI_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param amphiId The value of the column 'AMPHI_ID'. (NullAllowed)
     */
    public void setAmphiId(Integer amphiId) {
        __modifiedProperties.add("amphiId");
        this._amphiId = amphiId;
    }

    /**
     * [get] AMPHI_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'AMPHI_NAME'. (NullAllowed)
     */
    public String getAmphiName() {
        return _amphiName;
    }

    /**
     * [set] AMPHI_NAME: {NotNull, VARCHAR(200)} <br>
     * @param amphiName The value of the column 'AMPHI_NAME'. (NullAllowed)
     */
    public void setAmphiName(String amphiName) {
        __modifiedProperties.add("amphiName");
        this._amphiName = amphiName;
    }

    /**
     * [get] BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @return The value of the column 'BASE_ID'. (NullAllowed)
     */
    public Integer getBaseId() {
        return _baseId;
    }

    /**
     * [set] BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @param baseId The value of the column 'BASE_ID'. (NullAllowed)
     */
    public void setBaseId(Integer baseId) {
        __modifiedProperties.add("baseId");
        this._baseId = baseId;
    }

}
