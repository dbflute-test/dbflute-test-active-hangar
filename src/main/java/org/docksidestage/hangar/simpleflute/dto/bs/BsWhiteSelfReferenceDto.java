package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_SELF_REFERENCE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     WHITE_SELF_REFERENCE
 *
 * [referrer-table]
 *     WHITE_SELF_REFERENCE
 *
 * [foreign-property]
 *     whiteSelfReferenceSelf
 *
 * [referrer-property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteSelfReferenceDto implements Serializable {

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
    /** SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _selfReferenceId;

    /** SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _selfReferenceName;

    /** PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE} */
    @JsonKey
    protected Integer _parentId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceDto() {
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
    protected WhiteSelfReferenceDto _whiteSelfReferenceSelf;

    public WhiteSelfReferenceDto getWhiteSelfReferenceSelf() {
        return _whiteSelfReferenceSelf;
    }

    public void setWhiteSelfReferenceSelf(WhiteSelfReferenceDto whiteSelfReferenceSelf) {
        this._whiteSelfReferenceSelf = whiteSelfReferenceSelf;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<WhiteSelfReferenceDto> _whiteSelfReferenceSelfList;

    public List<WhiteSelfReferenceDto> getWhiteSelfReferenceSelfList() {
        if (_whiteSelfReferenceSelfList == null) { _whiteSelfReferenceSelfList = new ArrayList<WhiteSelfReferenceDto>(); }
        return _whiteSelfReferenceSelfList;
    }

    public void setWhiteSelfReferenceSelfList(List<WhiteSelfReferenceDto> whiteSelfReferenceSelfList) {
        this._whiteSelfReferenceSelfList = whiteSelfReferenceSelfList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteSelfReferenceDto)) { return false; }
        final BsWhiteSelfReferenceDto otherEntity = (BsWhiteSelfReferenceDto)other;
        if (!helpComparingValue(getSelfReferenceId(), otherEntity.getSelfReferenceId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_SELF_REFERENCE");
        result = xCH(result, getSelfReferenceId());
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
        sb.append(c).append(getSelfReferenceId());
        sb.append(c).append(getSelfReferenceName());
        sb.append(c).append(getParentId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'SELF_REFERENCE_ID'. (NullAllowed)
     */
    public Integer getSelfReferenceId() {
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (NullAllowed)
     */
    public void setSelfReferenceId(Integer selfReferenceId) {
        __modifiedProperties.add("selfReferenceId");
        this._selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SELF_REFERENCE_NAME'. (NullAllowed)
     */
    public String getSelfReferenceName() {
        return _selfReferenceName;
    }

    /**
     * [set] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param selfReferenceName The value of the column 'SELF_REFERENCE_NAME'. (NullAllowed)
     */
    public void setSelfReferenceName(String selfReferenceName) {
        __modifiedProperties.add("selfReferenceName");
        this._selfReferenceName = selfReferenceName;
    }

    /**
     * [get] PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE} <br>
     * @return The value of the column 'PARENT_ID'. (NullAllowed)
     */
    public Integer getParentId() {
        return _parentId;
    }

    /**
     * [set] PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE} <br>
     * @param parentId The value of the column 'PARENT_ID'. (NullAllowed)
     */
    public void setParentId(Integer parentId) {
        __modifiedProperties.add("parentId");
        this._parentId = parentId;
    }

}
