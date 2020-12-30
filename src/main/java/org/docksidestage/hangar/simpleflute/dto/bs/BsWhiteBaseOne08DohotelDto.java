package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE08_DOHOTEL as TABLE. <br>
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
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     WHITE_BASE
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseOne08DohotelDto implements Serializable {

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
    /** DOHOTEL_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _dohotelId;

    /** DOHOTEL_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _dohotelName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne08DohotelDto() {
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
        if (other == null || !(other instanceof BsWhiteBaseOne08DohotelDto)) { return false; }
        final BsWhiteBaseOne08DohotelDto otherEntity = (BsWhiteBaseOne08DohotelDto)other;
        if (!helpComparingValue(getDohotelId(), otherEntity.getDohotelId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE08_DOHOTEL");
        result = xCH(result, getDohotelId());
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
        sb.append(c).append(getDohotelId());
        sb.append(c).append(getDohotelName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DOHOTEL_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DOHOTEL_ID'. (NullAllowed)
     */
    public Integer getDohotelId() {
        return _dohotelId;
    }

    /**
     * [set] DOHOTEL_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param dohotelId The value of the column 'DOHOTEL_ID'. (NullAllowed)
     */
    public void setDohotelId(Integer dohotelId) {
        __modifiedProperties.add("dohotelId");
        this._dohotelId = dohotelId;
    }

    /**
     * [get] DOHOTEL_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DOHOTEL_NAME'. (NullAllowed)
     */
    public String getDohotelName() {
        return _dohotelName;
    }

    /**
     * [set] DOHOTEL_NAME: {NotNull, VARCHAR(200)} <br>
     * @param dohotelName The value of the column 'DOHOTEL_NAME'. (NullAllowed)
     */
    public void setDohotelName(String dohotelName) {
        __modifiedProperties.add("dohotelName");
        this._dohotelName = dohotelName;
    }

}
