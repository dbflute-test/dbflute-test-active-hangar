package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of WHITE_SCHEMA_DIFF as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SCHEMA_DIFF_ID
 *
 * [column]
 *     SCHEMA_DIFF_ID, SCHEMA_DIFF_NAME, SCHEMA_DIFF_DATE
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
public abstract class BsWhiteSchemaDiffDto implements Serializable {

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
    /** SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _schemaDiffId;

    /** SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _schemaDiffName;

    /** SCHEMA_DIFF_DATE: {NotNull, DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _schemaDiffDate;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSchemaDiffDto() {
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
        if (other == null || !(other instanceof BsWhiteSchemaDiffDto)) { return false; }
        final BsWhiteSchemaDiffDto otherEntity = (BsWhiteSchemaDiffDto)other;
        if (!helpComparingValue(getSchemaDiffId(), otherEntity.getSchemaDiffId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_SCHEMA_DIFF");
        result = xCH(result, getSchemaDiffId());
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
        sb.append(c).append(getSchemaDiffId());
        sb.append(c).append(getSchemaDiffName());
        sb.append(c).append(getSchemaDiffDate());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'SCHEMA_DIFF_ID'. (NullAllowed)
     */
    public Long getSchemaDiffId() {
        return _schemaDiffId;
    }

    /**
     * [set] SCHEMA_DIFF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param schemaDiffId The value of the column 'SCHEMA_DIFF_ID'. (NullAllowed)
     */
    public void setSchemaDiffId(Long schemaDiffId) {
        __modifiedProperties.add("schemaDiffId");
        this._schemaDiffId = schemaDiffId;
    }

    /**
     * [get] SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SCHEMA_DIFF_NAME'. (NullAllowed)
     */
    public String getSchemaDiffName() {
        return _schemaDiffName;
    }

    /**
     * [set] SCHEMA_DIFF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param schemaDiffName The value of the column 'SCHEMA_DIFF_NAME'. (NullAllowed)
     */
    public void setSchemaDiffName(String schemaDiffName) {
        __modifiedProperties.add("schemaDiffName");
        this._schemaDiffName = schemaDiffName;
    }

    /**
     * [get] SCHEMA_DIFF_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'SCHEMA_DIFF_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getSchemaDiffDate() {
        return _schemaDiffDate;
    }

    /**
     * [set] SCHEMA_DIFF_DATE: {NotNull, DATE(10)} <br>
     * @param schemaDiffDate The value of the column 'SCHEMA_DIFF_DATE'. (NullAllowed)
     */
    public void setSchemaDiffDate(java.time.LocalDate schemaDiffDate) {
        __modifiedProperties.add("schemaDiffDate");
        this._schemaDiffDate = schemaDiffDate;
    }

}
