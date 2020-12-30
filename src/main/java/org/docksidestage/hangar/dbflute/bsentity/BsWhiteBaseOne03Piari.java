package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_BASE_ONE03_PIARI as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PIARI_ID
 *
 * [column]
 *     PIARI_ID, PIARI_NAME
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
 * Integer piariId = entity.getPiariId();
 * String piariName = entity.getPiariName();
 * entity.setPiariId(piariId);
 * entity.setPiariName(piariName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne03Piari extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PIARI_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _piariId;

    /** PIARI_NAME: {NotNull, VARCHAR(200)} */
    protected String _piariName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE03_PIARI";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_piariId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE by PIARI_ID, named 'whiteBaseList'. */
    protected List<WhiteBase> _whiteBaseList;

    /**
     * [get] WHITE_BASE by PIARI_ID, named 'whiteBaseList'.
     * @return The entity list of referrer property 'whiteBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBase> getWhiteBaseList() {
        if (_whiteBaseList == null) { _whiteBaseList = newReferrerList(); }
        return _whiteBaseList;
    }

    /**
     * [set] WHITE_BASE by PIARI_ID, named 'whiteBaseList'.
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
        if (obj instanceof BsWhiteBaseOne03Piari) {
            BsWhiteBaseOne03Piari other = (BsWhiteBaseOne03Piari)obj;
            if (!xSV(_piariId, other._piariId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _piariId);
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
        sb.append(dm).append(xfND(_piariId));
        sb.append(dm).append(xfND(_piariName));
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
    public WhiteBaseOne03Piari clone() {
        return (WhiteBaseOne03Piari)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PIARI_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PIARI_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPiariId() {
        checkSpecifiedProperty("piariId");
        return _piariId;
    }

    /**
     * [set] PIARI_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param piariId The value of the column 'PIARI_ID'. (basically NotNull if update: for the constraint)
     */
    public void setPiariId(Integer piariId) {
        registerModifiedProperty("piariId");
        _piariId = piariId;
    }

    /**
     * [get] PIARI_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'PIARI_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getPiariName() {
        checkSpecifiedProperty("piariName");
        return convertEmptyToNull(_piariName);
    }

    /**
     * [set] PIARI_NAME: {NotNull, VARCHAR(200)} <br>
     * @param piariName The value of the column 'PIARI_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setPiariName(String piariName) {
        registerModifiedProperty("piariName");
        _piariName = piariName;
    }
}
