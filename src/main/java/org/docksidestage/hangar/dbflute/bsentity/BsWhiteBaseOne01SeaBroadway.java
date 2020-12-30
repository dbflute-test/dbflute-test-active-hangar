package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_BASE_ONE01_SEA_BROADWAY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BROADWAY_ID
 *
 * [column]
 *     BROADWAY_ID, BROADWAY_NAME
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne01SeaList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer broadwayId = entity.getBroadwayId();
 * String broadwayName = entity.getBroadwayName();
 * entity.setBroadwayId(broadwayId);
 * entity.setBroadwayName(broadwayName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01SeaBroadway extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BROADWAY_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _broadwayId;

    /** BROADWAY_NAME: {NotNull, VARCHAR(200)} */
    protected String _broadwayName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE_ONE01_SEA_BROADWAY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_broadwayId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaList'. */
    protected List<WhiteBaseOne01Sea> _whiteBaseOne01SeaList;

    /**
     * [get] WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaList'.
     * @return The entity list of referrer property 'whiteBaseOne01SeaList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteBaseOne01Sea> getWhiteBaseOne01SeaList() {
        if (_whiteBaseOne01SeaList == null) { _whiteBaseOne01SeaList = newReferrerList(); }
        return _whiteBaseOne01SeaList;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaList'.
     * @param whiteBaseOne01SeaList The entity list of referrer property 'whiteBaseOne01SeaList'. (NullAllowed)
     */
    public void setWhiteBaseOne01SeaList(List<WhiteBaseOne01Sea> whiteBaseOne01SeaList) {
        _whiteBaseOne01SeaList = whiteBaseOne01SeaList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteBaseOne01SeaBroadway) {
            BsWhiteBaseOne01SeaBroadway other = (BsWhiteBaseOne01SeaBroadway)obj;
            if (!xSV(_broadwayId, other._broadwayId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _broadwayId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01SeaList != null) { for (WhiteBaseOne01Sea et : _whiteBaseOne01SeaList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteBaseOne01SeaList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_broadwayId));
        sb.append(dm).append(xfND(_broadwayName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne01SeaList != null && !_whiteBaseOne01SeaList.isEmpty())
        { sb.append(dm).append("whiteBaseOne01SeaList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBaseOne01SeaBroadway clone() {
        return (WhiteBaseOne01SeaBroadway)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BROADWAY_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'BROADWAY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBroadwayId() {
        checkSpecifiedProperty("broadwayId");
        return _broadwayId;
    }

    /**
     * [set] BROADWAY_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param broadwayId The value of the column 'BROADWAY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBroadwayId(Integer broadwayId) {
        registerModifiedProperty("broadwayId");
        _broadwayId = broadwayId;
    }

    /**
     * [get] BROADWAY_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'BROADWAY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getBroadwayName() {
        checkSpecifiedProperty("broadwayName");
        return convertEmptyToNull(_broadwayName);
    }

    /**
     * [set] BROADWAY_NAME: {NotNull, VARCHAR(200)} <br>
     * @param broadwayName The value of the column 'BROADWAY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setBroadwayName(String broadwayName) {
        registerModifiedProperty("broadwayName");
        _broadwayName = broadwayName;
    }
}
