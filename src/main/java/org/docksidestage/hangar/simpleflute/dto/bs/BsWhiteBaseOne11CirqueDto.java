package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE11_CIRQUE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     CIRQUE_ID
 *
 * [column]
 *     CIRQUE_ID, CIRQUE_NAME
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
public abstract class BsWhiteBaseOne11CirqueDto implements Serializable {

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
    /** CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE} */
    @JsonKey
    protected Integer _cirqueId;

    /** CIRQUE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _cirqueName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne11CirqueDto() {
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
        if (other == null || !(other instanceof BsWhiteBaseOne11CirqueDto)) { return false; }
        final BsWhiteBaseOne11CirqueDto otherEntity = (BsWhiteBaseOne11CirqueDto)other;
        if (!helpComparingValue(getCirqueId(), otherEntity.getCirqueId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE11_CIRQUE");
        result = xCH(result, getCirqueId());
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
        sb.append(c).append(getCirqueId());
        sb.append(c).append(getCirqueName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @return The value of the column 'CIRQUE_ID'. (NullAllowed)
     */
    public Integer getCirqueId() {
        return _cirqueId;
    }

    /**
     * [set] CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE} <br>
     * @param cirqueId The value of the column 'CIRQUE_ID'. (NullAllowed)
     */
    public void setCirqueId(Integer cirqueId) {
        __modifiedProperties.add("cirqueId");
        this._cirqueId = cirqueId;
    }

    /**
     * [get] CIRQUE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'CIRQUE_NAME'. (NullAllowed)
     */
    public String getCirqueName() {
        return _cirqueName;
    }

    /**
     * [set] CIRQUE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param cirqueName The value of the column 'CIRQUE_NAME'. (NullAllowed)
     */
    public void setCirqueName(String cirqueName) {
        __modifiedProperties.add("cirqueName");
        this._cirqueName = cirqueName;
    }

}
