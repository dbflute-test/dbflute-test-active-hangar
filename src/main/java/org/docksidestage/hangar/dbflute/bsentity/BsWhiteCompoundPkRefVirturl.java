package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_COMPOUND_PK_REF_VIRTURL as TABLE. <br>
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
 * [foreign table]
 *     WHITE_COMPOUND_PK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPk
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refFirstId = entity.getRefFirstId();
 * Long refSecondId = entity.getRefSecondId();
 * Long refThirdId = entity.getRefThirdId();
 * String compoundRefName = entity.getCompoundRefName();
 * entity.setRefFirstId(refFirstId);
 * entity.setRefSecondId(refSecondId);
 * entity.setRefThirdId(refThirdId);
 * entity.setCompoundRefName(compoundRefName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefVirturl extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} */
    protected Long _refFirstId;

    /** REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} */
    protected Long _refSecondId;

    /** REF_THIRD_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _refThirdId;

    /** COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} */
    protected String _compoundRefName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_COMPOUND_PK_REF_VIRTURL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refFirstId == null) { return false; }
        if (_refSecondId == null) { return false; }
        if (_refThirdId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'. */
    protected OptionalEntity<WhiteCompoundPk> _whiteCompoundPk;

    /**
     * [get] WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteCompoundPk'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteCompoundPk> getWhiteCompoundPk() {
        if (_whiteCompoundPk == null) { _whiteCompoundPk = OptionalEntity.relationEmpty(this, "whiteCompoundPk"); }
        return _whiteCompoundPk;
    }

    /**
     * [set] WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @param whiteCompoundPk The entity of foreign property 'whiteCompoundPk'. (NullAllowed)
     */
    public void setWhiteCompoundPk(OptionalEntity<WhiteCompoundPk> whiteCompoundPk) {
        _whiteCompoundPk = whiteCompoundPk;
    }

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
        if (obj instanceof BsWhiteCompoundPkRefVirturl) {
            BsWhiteCompoundPkRefVirturl other = (BsWhiteCompoundPkRefVirturl)obj;
            if (!xSV(_refFirstId, other._refFirstId)) { return false; }
            if (!xSV(_refSecondId, other._refSecondId)) { return false; }
            if (!xSV(_refThirdId, other._refThirdId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _refFirstId);
        hs = xCH(hs, _refSecondId);
        hs = xCH(hs, _refThirdId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPk != null && _whiteCompoundPk.isPresent())
        { sb.append(li).append(xbRDS(_whiteCompoundPk, "whiteCompoundPk")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refFirstId));
        sb.append(dm).append(xfND(_refSecondId));
        sb.append(dm).append(xfND(_refThirdId));
        sb.append(dm).append(xfND(_compoundRefName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPk != null && _whiteCompoundPk.isPresent())
        { sb.append(dm).append("whiteCompoundPk"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPkRefVirturl clone() {
        return (WhiteCompoundPkRefVirturl)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @return The value of the column 'REF_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefFirstId() {
        checkSpecifiedProperty("refFirstId");
        return _refFirstId;
    }

    /**
     * [set] REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @param refFirstId The value of the column 'REF_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefFirstId(Long refFirstId) {
        registerModifiedProperty("refFirstId");
        _refFirstId = refFirstId;
    }

    /**
     * [get] REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @return The value of the column 'REF_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefSecondId() {
        checkSpecifiedProperty("refSecondId");
        return _refSecondId;
    }

    /**
     * [set] REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK} <br>
     * @param refSecondId The value of the column 'REF_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefSecondId(Long refSecondId) {
        registerModifiedProperty("refSecondId");
        _refSecondId = refSecondId;
    }

    /**
     * [get] REF_THIRD_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'REF_THIRD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefThirdId() {
        checkSpecifiedProperty("refThirdId");
        return _refThirdId;
    }

    /**
     * [set] REF_THIRD_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param refThirdId The value of the column 'REF_THIRD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefThirdId(Long refThirdId) {
        registerModifiedProperty("refThirdId");
        _refThirdId = refThirdId;
    }

    /**
     * [get] COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'COMPOUND_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundRefName() {
        checkSpecifiedProperty("compoundRefName");
        return convertEmptyToNull(_compoundRefName);
    }

    /**
     * [set] COMPOUND_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param compoundRefName The value of the column 'COMPOUND_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundRefName(String compoundRefName) {
        registerModifiedProperty("compoundRefName");
        _compoundRefName = compoundRefName;
    }
}
