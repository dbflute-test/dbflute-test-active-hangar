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
 * The entity of WHITE_BASE_ONE10_CELEB as TABLE. <br>
 * <pre>
 * [primary-key]
 *     CELEB_ID
 *
 * [column]
 *     CELEB_ID, CELEB_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBase
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer celebId = entity.getCelebId();
 * String celebName = entity.getCelebName();
 * Integer baseId = entity.getBaseId();
 * entity.setCelebId(celebId);
 * entity.setCelebName(celebName);
 * entity.setBaseId(baseId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne10Celeb extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CELEB_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _celebId;

    /** CELEB_NAME: {NotNull, VARCHAR(200)} */
    protected String _celebName;

    /** BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE} */
    protected Integer _baseId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE10_CELEB";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_celebId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param baseId : UQ, INTEGER(10), FK to WHITE_BASE. (NotNull)
     */
    public void uniqueBy(Integer baseId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("baseId");
        setBaseId(baseId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE by my BASE_ID, named 'whiteBase'. */
    protected OptionalEntity<WhiteBase> _whiteBase;

    /**
     * [get] WHITE_BASE by my BASE_ID, named 'whiteBase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBase> getWhiteBase() {
        if (_whiteBase == null) { _whiteBase = OptionalEntity.relationEmpty(this, "whiteBase"); }
        return _whiteBase;
    }

    /**
     * [set] WHITE_BASE by my BASE_ID, named 'whiteBase'.
     * @param whiteBase The entity of foreign property 'whiteBase'. (NullAllowed)
     */
    public void setWhiteBase(OptionalEntity<WhiteBase> whiteBase) {
        _whiteBase = whiteBase;
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
        if (obj instanceof BsWhiteBaseOne10Celeb) {
            BsWhiteBaseOne10Celeb other = (BsWhiteBaseOne10Celeb)obj;
            if (!xSV(_celebId, other._celebId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _celebId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBase != null && _whiteBase.isPresent())
        { sb.append(li).append(xbRDS(_whiteBase, "whiteBase")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_celebId));
        sb.append(dm).append(xfND(_celebName));
        sb.append(dm).append(xfND(_baseId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBase != null && _whiteBase.isPresent())
        { sb.append(dm).append("whiteBase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne10Celeb clone() {
        return (WhiteBaseOne10Celeb)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CELEB_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'CELEB_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCelebId() {
        checkSpecifiedProperty("celebId");
        return _celebId;
    }

    /**
     * [set] CELEB_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param celebId The value of the column 'CELEB_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCelebId(Integer celebId) {
        registerModifiedProperty("celebId");
        _celebId = celebId;
    }

    /**
     * [get] CELEB_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'CELEB_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCelebName() {
        checkSpecifiedProperty("celebName");
        return convertEmptyToNull(_celebName);
    }

    /**
     * [set] CELEB_NAME: {NotNull, VARCHAR(200)} <br>
     * @param celebName The value of the column 'CELEB_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCelebName(String celebName) {
        registerModifiedProperty("celebName");
        _celebName = celebName;
    }

    /**
     * [get] BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE} <br>
     * @return The value of the column 'BASE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBaseId() {
        checkSpecifiedProperty("baseId");
        return _baseId;
    }

    /**
     * [set] BASE_ID: {UQ, INTEGER(10), FK to WHITE_BASE} <br>
     * @param baseId The value of the column 'BASE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseId(Integer baseId) {
        registerModifiedProperty("baseId");
        _baseId = baseId;
    }
}
