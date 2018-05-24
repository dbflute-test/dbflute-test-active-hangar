package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_COMPOUND_PK as TABLE. <br>
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
 * Long pkFirstId = entity.getPkFirstId();
 * Long pkSecondId = entity.getPkSecondId();
 * String compoundPkName = entity.getCompoundPkName();
 * Integer referredId = entity.getReferredId();
 * entity.setPkFirstId(pkFirstId);
 * entity.setPkSecondId(pkSecondId);
 * entity.setCompoundPkName(compoundPkName);
 * entity.setReferredId(referredId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PK_FIRST_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _pkFirstId;

    /** PK_SECOND_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _pkSecondId;

    /** COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} */
    protected String _compoundPkName;

    /** REFERRED_ID: {NotNull, INTEGER(10)} */
    protected Integer _referredId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_COMPOUND_PK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_pkFirstId == null) { return false; }
        if (_pkSecondId == null) { return false; }
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
        if (obj instanceof BsWhiteCompoundPk) {
            BsWhiteCompoundPk other = (BsWhiteCompoundPk)obj;
            if (!xSV(_pkFirstId, other._pkFirstId)) { return false; }
            if (!xSV(_pkSecondId, other._pkSecondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _pkFirstId);
        hs = xCH(hs, _pkSecondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pkFirstId));
        sb.append(dm).append(xfND(_pkSecondId));
        sb.append(dm).append(xfND(_compoundPkName));
        sb.append(dm).append(xfND(_referredId));
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
    public WhiteCompoundPk clone() {
        return (WhiteCompoundPk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PK_FIRST_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'PK_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPkFirstId() {
        checkSpecifiedProperty("pkFirstId");
        return _pkFirstId;
    }

    /**
     * [set] PK_FIRST_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param pkFirstId The value of the column 'PK_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPkFirstId(Long pkFirstId) {
        registerModifiedProperty("pkFirstId");
        _pkFirstId = pkFirstId;
    }

    /**
     * [get] PK_SECOND_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'PK_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getPkSecondId() {
        checkSpecifiedProperty("pkSecondId");
        return _pkSecondId;
    }

    /**
     * [set] PK_SECOND_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param pkSecondId The value of the column 'PK_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPkSecondId(Long pkSecondId) {
        registerModifiedProperty("pkSecondId");
        _pkSecondId = pkSecondId;
    }

    /**
     * [get] COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'COMPOUND_PK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundPkName() {
        checkSpecifiedProperty("compoundPkName");
        return convertEmptyToNull(_compoundPkName);
    }

    /**
     * [set] COMPOUND_PK_NAME: {NotNull, VARCHAR(200)} <br>
     * @param compoundPkName The value of the column 'COMPOUND_PK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundPkName(String compoundPkName) {
        registerModifiedProperty("compoundPkName");
        _compoundPkName = compoundPkName;
    }

    /**
     * [get] REFERRED_ID: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'REFERRED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReferredId() {
        checkSpecifiedProperty("referredId");
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {NotNull, INTEGER(10)} <br>
     * @param referredId The value of the column 'REFERRED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferredId(Integer referredId) {
        registerModifiedProperty("referredId");
        _referredId = referredId;
    }
}
