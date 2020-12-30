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
 * The entity of WHITE_BASE_ONE01_SEA_MAGICLAMP as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MAGICLAMP_ID
 *
 * [column]
 *     MAGICLAMP_ID, MAGICLAMP_NAME, SEA_ID
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBaseOne01Sea
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer magiclampId = entity.getMagiclampId();
 * String magiclampName = entity.getMagiclampName();
 * Integer seaId = entity.getSeaId();
 * entity.setMagiclampId(magiclampId);
 * entity.setMagiclampName(magiclampName);
 * entity.setSeaId(seaId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01SeaMagiclamp extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MAGICLAMP_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _magiclampId;

    /** MAGICLAMP_NAME: {NotNull, VARCHAR(200)} */
    protected String _magiclampName;

    /** SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} */
    protected Integer _seaId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE01_SEA_MAGICLAMP";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_magiclampId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'. */
    protected OptionalEntity<WhiteBaseOne01Sea> _whiteBaseOne01Sea;

    /**
     * [get] WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne01Sea'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne01Sea> getWhiteBaseOne01Sea() {
        if (_whiteBaseOne01Sea == null) { _whiteBaseOne01Sea = OptionalEntity.relationEmpty(this, "whiteBaseOne01Sea"); }
        return _whiteBaseOne01Sea;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @param whiteBaseOne01Sea The entity of foreign property 'whiteBaseOne01Sea'. (NullAllowed)
     */
    public void setWhiteBaseOne01Sea(OptionalEntity<WhiteBaseOne01Sea> whiteBaseOne01Sea) {
        _whiteBaseOne01Sea = whiteBaseOne01Sea;
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
        if (obj instanceof BsWhiteBaseOne01SeaMagiclamp) {
            BsWhiteBaseOne01SeaMagiclamp other = (BsWhiteBaseOne01SeaMagiclamp)obj;
            if (!xSV(_magiclampId, other._magiclampId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _magiclampId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01Sea != null && _whiteBaseOne01Sea.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne01Sea, "whiteBaseOne01Sea")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_magiclampId));
        sb.append(dm).append(xfND(_magiclampName));
        sb.append(dm).append(xfND(_seaId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01Sea != null && _whiteBaseOne01Sea.isPresent())
        { sb.append(dm).append("whiteBaseOne01Sea"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne01SeaMagiclamp clone() {
        return (WhiteBaseOne01SeaMagiclamp)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MAGICLAMP_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'MAGICLAMP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMagiclampId() {
        checkSpecifiedProperty("magiclampId");
        return _magiclampId;
    }

    /**
     * [set] MAGICLAMP_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param magiclampId The value of the column 'MAGICLAMP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMagiclampId(Integer magiclampId) {
        registerModifiedProperty("magiclampId");
        _magiclampId = magiclampId;
    }

    /**
     * [get] MAGICLAMP_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MAGICLAMP_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMagiclampName() {
        checkSpecifiedProperty("magiclampName");
        return convertEmptyToNull(_magiclampName);
    }

    /**
     * [set] MAGICLAMP_NAME: {NotNull, VARCHAR(200)} <br>
     * @param magiclampName The value of the column 'MAGICLAMP_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMagiclampName(String magiclampName) {
        registerModifiedProperty("magiclampName");
        _magiclampName = magiclampName;
    }

    /**
     * [get] SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @return The value of the column 'SEA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSeaId() {
        checkSpecifiedProperty("seaId");
        return _seaId;
    }

    /**
     * [set] SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @param seaId The value of the column 'SEA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeaId(Integer seaId) {
        registerModifiedProperty("seaId");
        _seaId = seaId;
    }
}
