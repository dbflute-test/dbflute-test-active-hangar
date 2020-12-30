package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_BASE_ONE07_MIRACO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MIRACO_ID
 *
 * [column]
 *     MIRACO_ID, MIRACO_NAME
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
 *     WHITE_BASE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer miracoId = entity.getMiracoId();
 * String miracoName = entity.getMiracoName();
 * entity.setMiracoId(miracoId);
 * entity.setMiracoName(miracoName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne07Miraco extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MIRACO_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _miracoId;

    /** MIRACO_NAME: {NotNull, VARCHAR(200)} */
    protected String _miracoName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE07_MIRACO";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_miracoId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE by MIRACO_ID, named 'whiteBaseList'. */
    protected List<WhiteBase> _whiteBaseList;

    /**
     * [get] WHITE_BASE by MIRACO_ID, named 'whiteBaseList'.
     * @return The entity list of referrer property 'whiteBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBase> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = newReferrerList(); }
        return _whiteBaseList;
    }

    /**
     * [set] WHITE_BASE by MIRACO_ID, named 'whiteBaseList'.
     * @param whiteBaseList The entity list of referrer property 'whiteBaseList'. (NullAllowed)
     */
    public void setWhiteBaseList(List<WhiteBase> whiteBaseList) {
        _whiteBaseList = whiteBaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne07Miraco) {
            BsWhiteBaseOne07Miraco other = (BsWhiteBaseOne07Miraco)obj;
            if (!xSV(_miracoId, other._miracoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _miracoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseList != null) { for (WhiteBase et : _whiteBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_miracoId));
        sb.append(dm).append(xfND(_miracoName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseList != null && !_whiteBaseList.isEmpty())
        { sb.append(dm).append("whiteBaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne07Miraco clone() {
        return (WhiteBaseOne07Miraco)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MIRACO_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'MIRACO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMiracoId() {
        checkSpecifiedProperty("miracoId");
        return _miracoId;
    }

    /**
     * [set] MIRACO_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param miracoId The value of the column 'MIRACO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMiracoId(Integer miracoId) {
        registerModifiedProperty("miracoId");
        _miracoId = miracoId;
    }

    /**
     * [get] MIRACO_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'MIRACO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMiracoName() {
        checkSpecifiedProperty("miracoName");
        return convertEmptyToNull(_miracoName);
    }

    /**
     * [set] MIRACO_NAME: {NotNull, VARCHAR(200)} <br>
     * @param miracoName The value of the column 'MIRACO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMiracoName(String miracoName) {
        registerModifiedProperty("miracoName");
        _miracoName = miracoName;
    }
}
