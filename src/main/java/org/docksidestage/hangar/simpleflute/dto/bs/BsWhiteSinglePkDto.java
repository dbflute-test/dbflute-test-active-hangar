package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of WHITE_SINGLE_PK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ONLY_ONE_PK_ID
 *
 * [column]
 *     ONLY_ONE_PK_ID, SINGLE_PK_NAME, REFERRED_ID
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
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteSinglePkDto implements Serializable {

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
    /** ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _onlyOnePkId;

    /** SINGLE_PK_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _singlePkName;

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
    public BsWhiteSinglePkDto() {
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
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteSinglePkDto)) { return false; }
        final BsWhiteSinglePkDto otherEntity = (BsWhiteSinglePkDto)other;
        if (!helpComparingValue(getOnlyOnePkId(), otherEntity.getOnlyOnePkId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_SINGLE_PK");
        result = xCH(result, getOnlyOnePkId());
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
        sb.append(c).append(getOnlyOnePkId());
        sb.append(c).append(getSinglePkName());
        sb.append(c).append(getReferredId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'ONLY_ONE_PK_ID'. (NullAllowed)
     */
    public Long getOnlyOnePkId() {
        return _onlyOnePkId;
    }

    /**
     * [set] ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param onlyOnePkId The value of the column 'ONLY_ONE_PK_ID'. (NullAllowed)
     */
    public void setOnlyOnePkId(Long onlyOnePkId) {
        __modifiedProperties.add("onlyOnePkId");
        this._onlyOnePkId = onlyOnePkId;
    }

    /**
     * [get] SINGLE_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SINGLE_PK_NAME'. (NullAllowed)
     */
    public String getSinglePkName() {
        return _singlePkName;
    }

    /**
     * [set] SINGLE_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param singlePkName The value of the column 'SINGLE_PK_NAME'. (NullAllowed)
     */
    public void setSinglePkName(String singlePkName) {
        __modifiedProperties.add("singlePkName");
        this._singlePkName = singlePkName;
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
