package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_FIRST_DATE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     FIRST_DATE_ID
 *
 * [column]
 *     FIRST_DATE_ID, FIRST_DATE_NAME, ADDED_AT_TABLE_SAME_DATE
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long firstDateId = entity.getFirstDateId();
 * String firstDateName = entity.getFirstDateName();
 * java.time.LocalDate addedAtTableSameDate = entity.getAddedAtTableSameDate();
 * entity.setFirstDateId(firstDateId);
 * entity.setFirstDateName(firstDateName);
 * entity.setAddedAtTableSameDate(addedAtTableSameDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteFirstDate extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _firstDateId;

    /** FIRST_DATE_NAME: {NotNull, VARCHAR(200)} */
    protected String _firstDateName;

    /** ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _addedAtTableSameDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_FIRST_DATE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_firstDateId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteFirstDate) {
            BsWhiteFirstDate other = (BsWhiteFirstDate)obj;
            if (!xSV(_firstDateId, other._firstDateId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _firstDateId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_firstDateId));
        sb.append(dm).append(xfND(_firstDateName));
        sb.append(dm).append(xfND(_addedAtTableSameDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteFirstDate clone() {
        return (WhiteFirstDate)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'FIRST_DATE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFirstDateId() {
        checkSpecifiedProperty("firstDateId");
        return _firstDateId;
    }

    /**
     * [set] FIRST_DATE_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param firstDateId The value of the column 'FIRST_DATE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFirstDateId(Long firstDateId) {
        registerModifiedProperty("firstDateId");
        _firstDateId = firstDateId;
    }

    /**
     * [get] FIRST_DATE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'FIRST_DATE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFirstDateName() {
        checkSpecifiedProperty("firstDateName");
        return convertEmptyToNull(_firstDateName);
    }

    /**
     * [set] FIRST_DATE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param firstDateName The value of the column 'FIRST_DATE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setFirstDateName(String firstDateName) {
        registerModifiedProperty("firstDateName");
        _firstDateName = firstDateName;
    }

    /**
     * [get] ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'ADDED_AT_TABLE_SAME_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getAddedAtTableSameDate() {
        checkSpecifiedProperty("addedAtTableSameDate");
        return _addedAtTableSameDate;
    }

    /**
     * [set] ADDED_AT_TABLE_SAME_DATE: {NotNull, DATE(10)} <br>
     * @param addedAtTableSameDate The value of the column 'ADDED_AT_TABLE_SAME_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setAddedAtTableSameDate(java.time.LocalDate addedAtTableSameDate) {
        registerModifiedProperty("addedAtTableSameDate");
        _addedAtTableSameDate = addedAtTableSameDate;
    }
}
