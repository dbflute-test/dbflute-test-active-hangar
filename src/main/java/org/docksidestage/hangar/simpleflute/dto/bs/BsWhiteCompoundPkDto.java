package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_COMPOUND_PK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, COMPOUND_PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_PK_REF_PHYSICAL, WHITE_COMPOUND_PK_REF_VIRTURL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteCompoundPkRefPhysicalList, whiteCompoundPkRefVirturlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteCompoundPkDto implements Serializable {

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
    /** PK_FIRST_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _pkFirstId;

    /** PK_SECOND_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _pkSecondId;

    /** COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _compoundPkName;

    /** REFERRED_ID: {NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _referredId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkDto() {
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
    protected List<WhiteCompoundPkRefPhysicalDto> _whiteCompoundPkRefPhysicalList;

    public List<WhiteCompoundPkRefPhysicalDto> getWhiteCompoundPkRefPhysicalList() {
        if (_whiteCompoundPkRefPhysicalList == null) { _whiteCompoundPkRefPhysicalList = new ArrayList<WhiteCompoundPkRefPhysicalDto>(); }
        return _whiteCompoundPkRefPhysicalList;
    }

    public void setWhiteCompoundPkRefPhysicalList(List<WhiteCompoundPkRefPhysicalDto> whiteCompoundPkRefPhysicalList) {
        this._whiteCompoundPkRefPhysicalList = whiteCompoundPkRefPhysicalList;
    }

    protected List<WhiteCompoundPkRefVirturlDto> _whiteCompoundPkRefVirturlList;

    public List<WhiteCompoundPkRefVirturlDto> getWhiteCompoundPkRefVirturlList() {
        if (_whiteCompoundPkRefVirturlList == null) { _whiteCompoundPkRefVirturlList = new ArrayList<WhiteCompoundPkRefVirturlDto>(); }
        return _whiteCompoundPkRefVirturlList;
    }

    public void setWhiteCompoundPkRefVirturlList(List<WhiteCompoundPkRefVirturlDto> whiteCompoundPkRefVirturlList) {
        this._whiteCompoundPkRefVirturlList = whiteCompoundPkRefVirturlList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteCompoundPkDto)) { return false; }
        final BsWhiteCompoundPkDto otherEntity = (BsWhiteCompoundPkDto)other;
        if (!helpComparingValue(getPkFirstId(), otherEntity.getPkFirstId())) { return false; }
        if (!helpComparingValue(getPkSecondId(), otherEntity.getPkSecondId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_COMPOUND_PK");
        result = xCH(result, getPkFirstId());
        result = xCH(result, getPkSecondId());
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
        sb.append(c).append(getPkFirstId());
        sb.append(c).append(getPkSecondId());
        sb.append(c).append(getCompoundPkName());
        sb.append(c).append(getReferredId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PK_FIRST_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'PK_FIRST_ID'. (NullAllowed)
     */
    public Long getPkFirstId() {
        return _pkFirstId;
    }

    /**
     * [set] PK_FIRST_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param pkFirstId The value of the column 'PK_FIRST_ID'. (NullAllowed)
     */
    public void setPkFirstId(Long pkFirstId) {
        __modifiedProperties.add("pkFirstId");
        this._pkFirstId = pkFirstId;
    }

    /**
     * [get] PK_SECOND_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'PK_SECOND_ID'. (NullAllowed)
     */
    public Long getPkSecondId() {
        return _pkSecondId;
    }

    /**
     * [set] PK_SECOND_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param pkSecondId The value of the column 'PK_SECOND_ID'. (NullAllowed)
     */
    public void setPkSecondId(Long pkSecondId) {
        __modifiedProperties.add("pkSecondId");
        this._pkSecondId = pkSecondId;
    }

    /**
     * [get] COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'COMPOUND_PK_NAME'. (NullAllowed)
     */
    public String getCompoundPkName() {
        return _compoundPkName;
    }

    /**
     * [set] COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param compoundPkName The value of the column 'COMPOUND_PK_NAME'. (NullAllowed)
     */
    public void setCompoundPkName(String compoundPkName) {
        __modifiedProperties.add("compoundPkName");
        this._compoundPkName = compoundPkName;
    }

    /**
     * [get] REFERRED_ID: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'REFERRED_ID'. (NullAllowed)
     */
    public Integer getReferredId() {
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {NotNull, INTEGER(10)} <br>
     * @param referredId The value of the column 'REFERRED_ID'. (NullAllowed)
     */
    public void setReferredId(Integer referredId) {
        __modifiedProperties.add("referredId");
        this._referredId = referredId;
    }

}
