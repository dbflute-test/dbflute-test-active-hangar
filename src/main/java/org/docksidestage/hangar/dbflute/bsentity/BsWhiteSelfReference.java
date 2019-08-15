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
 * The entity of WHITE_SELF_REFERENCE as TABLE. <br>
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
 * [foreign table]
 *     WHITE_SELF_REFERENCE
 *
 * [referrer table]
 *     WHITE_SELF_REFERENCE
 *
 * [foreign property]
 *     whiteSelfReferenceSelf
 *
 * [referrer property]
 *     whiteSelfReferenceSelfList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer selfReferenceId = entity.getSelfReferenceId();
 * String selfReferenceName = entity.getSelfReferenceName();
 * Integer parentId = entity.getParentId();
 * entity.setSelfReferenceId(selfReferenceId);
 * entity.setSelfReferenceName(selfReferenceName);
 * entity.setParentId(parentId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReference extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _selfReferenceId;

    /** SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} */
    protected String _selfReferenceName;

    /** PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE} */
    protected Integer _parentId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_SELF_REFERENCE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_selfReferenceId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_SELF_REFERENCE by my PARENT_ID, named 'whiteSelfReferenceSelf'. */
    protected OptionalEntity<WhiteSelfReference> _whiteSelfReferenceSelf;

    /**
     * [get] WHITE_SELF_REFERENCE by my PARENT_ID, named 'whiteSelfReferenceSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSelfReferenceSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSelfReference> getWhiteSelfReferenceSelf() {
        if (_whiteSelfReferenceSelf == null) { _whiteSelfReferenceSelf = OptionalEntity.relationEmpty(this, "whiteSelfReferenceSelf"); }
        return _whiteSelfReferenceSelf;
    }

    /**
     * [set] WHITE_SELF_REFERENCE by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @param whiteSelfReferenceSelf The entity of foreign property 'whiteSelfReferenceSelf'. (NullAllowed)
     */
    public void setWhiteSelfReferenceSelf(OptionalEntity<WhiteSelfReference> whiteSelfReferenceSelf) {
        _whiteSelfReferenceSelf = whiteSelfReferenceSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfList'. */
    protected List<WhiteSelfReference> _whiteSelfReferenceSelfList;

    /**
     * [get] WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @return The entity list of referrer property 'whiteSelfReferenceSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSelfReference> getWhiteSelfReferenceSelfList() {
        if (_whiteSelfReferenceSelfList == null) { _whiteSelfReferenceSelfList = newReferrerList(); }
        return _whiteSelfReferenceSelfList;
    }

    /**
     * [set] WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @param whiteSelfReferenceSelfList The entity list of referrer property 'whiteSelfReferenceSelfList'. (NullAllowed)
     */
    public void setWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceSelfList) {
        _whiteSelfReferenceSelfList = whiteSelfReferenceSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSelfReference) {
            BsWhiteSelfReference other = (BsWhiteSelfReference)obj;
            if (!xSV(_selfReferenceId, other._selfReferenceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _selfReferenceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReferenceSelf != null && _whiteSelfReferenceSelf.isPresent())
        { sb.append(li).append(xbRDS(_whiteSelfReferenceSelf, "whiteSelfReferenceSelf")); }
        if (_whiteSelfReferenceSelfList != null) { for (WhiteSelfReference et : _whiteSelfReferenceSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSelfReferenceSelfList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_selfReferenceId));
        sb.append(dm).append(xfND(_selfReferenceName));
        sb.append(dm).append(xfND(_parentId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReferenceSelf != null && _whiteSelfReferenceSelf.isPresent())
        { sb.append(dm).append("whiteSelfReferenceSelf"); }
        if (_whiteSelfReferenceSelfList != null && !_whiteSelfReferenceSelfList.isEmpty())
        { sb.append(dm).append("whiteSelfReferenceSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSelfReference clone() {
        return (WhiteSelfReference)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSelfReferenceId() {
        checkSpecifiedProperty("selfReferenceId");
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceId(Integer selfReferenceId) {
        registerModifiedProperty("selfReferenceId");
        _selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'SELF_REFERENCE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelfReferenceName() {
        checkSpecifiedProperty("selfReferenceName");
        return convertEmptyToNull(_selfReferenceName);
    }

    /**
     * [set] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param selfReferenceName The value of the column 'SELF_REFERENCE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceName(String selfReferenceName) {
        registerModifiedProperty("selfReferenceName");
        _selfReferenceName = selfReferenceName;
    }

    /**
     * [get] PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE} <br>
     * @return The value of the column 'PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getParentId() {
        checkSpecifiedProperty("parentId");
        return _parentId;
    }

    /**
     * [set] PARENT_ID: {IX, INTEGER(10), FK to WHITE_SELF_REFERENCE} <br>
     * @param parentId The value of the column 'PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentId(Integer parentId) {
        registerModifiedProperty("parentId");
        _parentId = parentId;
    }
}
