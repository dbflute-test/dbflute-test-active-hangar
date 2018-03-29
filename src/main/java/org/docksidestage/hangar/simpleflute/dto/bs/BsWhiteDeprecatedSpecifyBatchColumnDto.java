package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SPECIFY_BATCH_COLUMN_ID
 *
 * [column]
 *     SPECIFY_BATCH_COLUMN_ID, SPECIFY_BATCH_COLUMN_NAME
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
public abstract class BsWhiteDeprecatedSpecifyBatchColumnDto implements Serializable {

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
    /** SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _specifyBatchColumnId;

    /** SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _specifyBatchColumnName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedSpecifyBatchColumnDto() {
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
        if (other == null || !(other instanceof BsWhiteDeprecatedSpecifyBatchColumnDto)) { return false; }
        final BsWhiteDeprecatedSpecifyBatchColumnDto otherEntity = (BsWhiteDeprecatedSpecifyBatchColumnDto)other;
        if (!helpComparingValue(getSpecifyBatchColumnId(), otherEntity.getSpecifyBatchColumnId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN");
        result = xCH(result, getSpecifyBatchColumnId());
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
        sb.append(c).append(getSpecifyBatchColumnId());
        sb.append(c).append(getSpecifyBatchColumnName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'SPECIFY_BATCH_COLUMN_ID'. (NullAllowed)
     */
    public Long getSpecifyBatchColumnId() {
        return _specifyBatchColumnId;
    }

    /**
     * [set] SPECIFY_BATCH_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param specifyBatchColumnId The value of the column 'SPECIFY_BATCH_COLUMN_ID'. (NullAllowed)
     */
    public void setSpecifyBatchColumnId(Long specifyBatchColumnId) {
        __modifiedProperties.add("specifyBatchColumnId");
        this._specifyBatchColumnId = specifyBatchColumnId;
    }

    /**
     * [get] SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SPECIFY_BATCH_COLUMN_NAME'. (NullAllowed)
     */
    public String getSpecifyBatchColumnName() {
        return _specifyBatchColumnName;
    }

    /**
     * [set] SPECIFY_BATCH_COLUMN_NAME: {NotNull, VARCHAR(200)} <br>
     * @param specifyBatchColumnName The value of the column 'SPECIFY_BATCH_COLUMN_NAME'. (NullAllowed)
     */
    public void setSpecifyBatchColumnName(String specifyBatchColumnName) {
        __modifiedProperties.add("specifyBatchColumnName");
        this._specifyBatchColumnName = specifyBatchColumnName;
    }

}
