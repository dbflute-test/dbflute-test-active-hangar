package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_COMPOUND_PK_REF_VIRTURL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     REF_FIRST_ID, REF_SECOND_ID, REF_THIRD_ID
 *
 * [column]
 *     REF_FIRST_ID, REF_SECOND_ID, REF_THIRD_ID, COMPOUND_REF_NAME
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
 *     WHITE_COMPOUND_PK
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteCompoundPk
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteCompoundPkRefVirturlDto implements Serializable {

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
    /** REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} */
    @JsonKey
    protected Long _refFirstId;

    /** REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} */
    @JsonKey
    protected Long _refSecondId;

    /** REF_THIRD_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _refThirdId;

    /** COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _compoundRefName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkRefVirturlDto() {
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
    protected WhiteCompoundPkDto _whiteCompoundPk;

    public WhiteCompoundPkDto getWhiteCompoundPk() {
        return _whiteCompoundPk;
    }

    public void setWhiteCompoundPk(WhiteCompoundPkDto whiteCompoundPk) {
        this._whiteCompoundPk = whiteCompoundPk;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteCompoundPkRefVirturlDto)) { return false; }
        final BsWhiteCompoundPkRefVirturlDto otherEntity = (BsWhiteCompoundPkRefVirturlDto)other;
        if (!helpComparingValue(getRefFirstId(), otherEntity.getRefFirstId())) { return false; }
        if (!helpComparingValue(getRefSecondId(), otherEntity.getRefSecondId())) { return false; }
        if (!helpComparingValue(getRefThirdId(), otherEntity.getRefThirdId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_COMPOUND_PK_REF_VIRTURL");
        result = xCH(result, getRefFirstId());
        result = xCH(result, getRefSecondId());
        result = xCH(result, getRefThirdId());
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
        sb.append(c).append(getRefFirstId());
        sb.append(c).append(getRefSecondId());
        sb.append(c).append(getRefThirdId());
        sb.append(c).append(getCompoundRefName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @return The value of the column 'REF_FIRST_ID'. (NullAllowed)
     */
    public Long getRefFirstId() {
        return _refFirstId;
    }

    /**
     * [set] REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @param refFirstId The value of the column 'REF_FIRST_ID'. (NullAllowed)
     */
    public void setRefFirstId(Long refFirstId) {
        __modifiedProperties.add("refFirstId");
        this._refFirstId = refFirstId;
    }

    /**
     * [get] REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @return The value of the column 'REF_SECOND_ID'. (NullAllowed)
     */
    public Long getRefSecondId() {
        return _refSecondId;
    }

    /**
     * [set] REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @param refSecondId The value of the column 'REF_SECOND_ID'. (NullAllowed)
     */
    public void setRefSecondId(Long refSecondId) {
        __modifiedProperties.add("refSecondId");
        this._refSecondId = refSecondId;
    }

    /**
     * [get] REF_THIRD_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'REF_THIRD_ID'. (NullAllowed)
     */
    public Long getRefThirdId() {
        return _refThirdId;
    }

    /**
     * [set] REF_THIRD_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param refThirdId The value of the column 'REF_THIRD_ID'. (NullAllowed)
     */
    public void setRefThirdId(Long refThirdId) {
        __modifiedProperties.add("refThirdId");
        this._refThirdId = refThirdId;
    }

    /**
     * [get] COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'COMPOUND_REF_NAME'. (NullAllowed)
     */
    public String getCompoundRefName() {
        return _compoundRefName;
    }

    /**
     * [set] COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param compoundRefName The value of the column 'COMPOUND_REF_NAME'. (NullAllowed)
     */
    public void setCompoundRefName(String compoundRefName) {
        __modifiedProperties.add("compoundRefName");
        this._compoundRefName = compoundRefName;
    }

}
