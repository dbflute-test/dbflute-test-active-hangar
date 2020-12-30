package org.docksidestage.hangar.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The DB meta of WHITE_BASE_ONE02_LAND. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne02LandDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne02LandDbm _instance = new WhiteBaseOne02LandDbm();
    private WhiteBaseOne02LandDbm() {}
    public static WhiteBaseOne02LandDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((WhiteBaseOne02Land)et).getLandId(), (et, vl) -> ((WhiteBaseOne02Land)et).setLandId(cti(vl)), "landId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne02Land)et).getLandName(), (et, vl) -> ((WhiteBaseOne02Land)et).setLandName((String)vl), "landName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE02_LAND";
    protected final String _tableDispName = "WHITE_BASE_ONE02_LAND";
    protected final String _tablePropertyName = "whiteBaseOne02Land";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE02_LAND", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLandId = cci("LAND_ID", "LAND_ID", null, null, Integer.class, "landId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, "whiteBaseList", null, false);
    protected final ColumnInfo _columnLandName = cci("LAND_NAME", "LAND_NAME", null, null, String.class, "landName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LAND_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLandId() { return _columnLandId; }
    /**
     * LAND_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLandName() { return _columnLandName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLandId());
        ls.add(columnLandName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLandId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * WHITE_BASE by LAND_ID, named 'whiteBaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteBaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLandId(), WhiteBaseDbm.getInstance().columnLandId());
        return cri("FK_WHITE_BASE_WHITE_BASE_ONE02_LAND", "whiteBaseList", this, WhiteBaseDbm.getInstance(), mp, false, "whiteBaseOne02Land");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne02Land"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne02LandCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne02LandBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne02Land> getEntityType() { return WhiteBaseOne02Land.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne02Land newEntity() { return new WhiteBaseOne02Land(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne02Land)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne02Land)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
