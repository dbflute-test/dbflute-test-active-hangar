package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of WHITE_DEPRECATED_SELECT_BY_PKUQ as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SELECT_BY_PKUQ_ID
 *
 * [column]
 *     SELECT_BY_PKUQ_ID, SELECT_BY_PKUQ_NAME, SELECT_BY_PKUQ_CODE
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
public abstract class BsWhiteDeprecatedSelectByPkuqDto implements Serializable {

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
    /** SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _selectByPkuqId;

    /** SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _selectByPkuqName;

    /** SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} */
    @JsonKey
    protected String _selectByPkuqCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedSelectByPkuqDto() {
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
        if (other == null || !(other instanceof BsWhiteDeprecatedSelectByPkuqDto)) { return false; }
        final BsWhiteDeprecatedSelectByPkuqDto otherEntity = (BsWhiteDeprecatedSelectByPkuqDto)other;
        if (!helpComparingValue(getSelectByPkuqId(), otherEntity.getSelectByPkuqId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DEPRECATED_SELECT_BY_PKUQ");
        result = xCH(result, getSelectByPkuqId());
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
        sb.append(c).append(getSelectByPkuqId());
        sb.append(c).append(getSelectByPkuqName());
        sb.append(c).append(getSelectByPkuqCode());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'SELECT_BY_PKUQ_ID'. (NullAllowed)
     */
    public Long getSelectByPkuqId() {
        return _selectByPkuqId;
    }

    /**
     * [set] SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param selectByPkuqId The value of the column 'SELECT_BY_PKUQ_ID'. (NullAllowed)
     */
    public void setSelectByPkuqId(Long selectByPkuqId) {
        __modifiedProperties.add("selectByPkuqId");
        this._selectByPkuqId = selectByPkuqId;
    }

    /**
     * [get] SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SELECT_BY_PKUQ_NAME'. (NullAllowed)
     */
    public String getSelectByPkuqName() {
        return _selectByPkuqName;
    }

    /**
     * [set] SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)} <br>
     * @param selectByPkuqName The value of the column 'SELECT_BY_PKUQ_NAME'. (NullAllowed)
     */
    public void setSelectByPkuqName(String selectByPkuqName) {
        __modifiedProperties.add("selectByPkuqName");
        this._selectByPkuqName = selectByPkuqName;
    }

    /**
     * [get] SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'SELECT_BY_PKUQ_CODE'. (NullAllowed)
     */
    public String getSelectByPkuqCode() {
        return _selectByPkuqCode;
    }

    /**
     * [set] SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)} <br>
     * @param selectByPkuqCode The value of the column 'SELECT_BY_PKUQ_CODE'. (NullAllowed)
     */
    public void setSelectByPkuqCode(String selectByPkuqCode) {
        __modifiedProperties.add("selectByPkuqCode");
        this._selectByPkuqCode = selectByPkuqCode;
    }

}
