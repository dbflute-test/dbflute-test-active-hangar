package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE_ONE05_DSTORE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DSTORE_ID
 *
 * [column]
 *     DSTORE_ID, DSTORE_NAME
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
public abstract class BsWhiteBaseOne05DstoreDto implements Serializable {

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
    /** DSTORE_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _dstoreId;

    /** DSTORE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _dstoreName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne05DstoreDto() {
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
        if (other == null || !(other instanceof BsWhiteBaseOne05DstoreDto)) { return false; }
        final BsWhiteBaseOne05DstoreDto otherEntity = (BsWhiteBaseOne05DstoreDto)other;
        if (!helpComparingValue(getDstoreId(), otherEntity.getDstoreId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE_ONE05_DSTORE");
        result = xCH(result, getDstoreId());
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
        sb.append(c).append(getDstoreId());
        sb.append(c).append(getDstoreName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DSTORE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DSTORE_ID'. (NullAllowed)
     */
    public Integer getDstoreId() {
        return _dstoreId;
    }

    /**
     * [set] DSTORE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param dstoreId The value of the column 'DSTORE_ID'. (NullAllowed)
     */
    public void setDstoreId(Integer dstoreId) {
        __modifiedProperties.add("dstoreId");
        this._dstoreId = dstoreId;
    }

    /**
     * [get] DSTORE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DSTORE_NAME'. (NullAllowed)
     */
    public String getDstoreName() {
        return _dstoreName;
    }

    /**
     * [set] DSTORE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param dstoreName The value of the column 'DSTORE_NAME'. (NullAllowed)
     */
    public void setDstoreName(String dstoreName) {
        __modifiedProperties.add("dstoreName");
        this._dstoreName = dstoreName;
    }

}
