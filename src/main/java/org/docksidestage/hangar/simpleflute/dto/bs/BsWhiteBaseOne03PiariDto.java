package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE03_PIARI as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PIARI_ID
 *
 * [column]
 *     PIARI_ID, PIARI_NAME
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
public abstract class BsWhiteBaseOne03PiariDto implements Serializable {

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
    /** PIARI_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _piariId;

    /** PIARI_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _piariName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne03PiariDto() {
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
        if (other == null || !(other instanceof BsWhiteBaseOne03PiariDto)) { return false; }
        final BsWhiteBaseOne03PiariDto otherEntity = (BsWhiteBaseOne03PiariDto)other;
        if (!helpComparingValue(getPiariId(), otherEntity.getPiariId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE03_PIARI");
        result = xCH(result, getPiariId());
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
        sb.append(c).append(getPiariId());
        sb.append(c).append(getPiariName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PIARI_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PIARI_ID'. (NullAllowed)
     */
    public Integer getPiariId() {
        return _piariId;
    }

    /**
     * [set] PIARI_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param piariId The value of the column 'PIARI_ID'. (NullAllowed)
     */
    public void setPiariId(Integer piariId) {
        __modifiedProperties.add("piariId");
        this._piariId = piariId;
    }

    /**
     * [get] PIARI_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PIARI_NAME'. (NullAllowed)
     */
    public String getPiariName() {
        return _piariName;
    }

    /**
     * [set] PIARI_NAME: {NotNull, VARCHAR(200)} <br>
     * @param piariName The value of the column 'PIARI_NAME'. (NullAllowed)
     */
    public void setPiariName(String piariName) {
        __modifiedProperties.add("piariName");
        this._piariName = piariName;
    }

}
