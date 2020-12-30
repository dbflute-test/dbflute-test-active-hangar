package org.docksidestage.hangar.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The DB meta of WHITE_BASE_ONE04_BONVO. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne04BonvoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne04BonvoDbm _instance = new WhiteBaseOne04BonvoDbm();
    private WhiteBaseOne04BonvoDbm() {}
    public static WhiteBaseOne04BonvoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne04Bonvo)et).getBonvoId(), (et, vl) -> ((WhiteBaseOne04Bonvo)et).setBonvoId(cti(vl)), "bonvoId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne04Bonvo)et).getBonvoName(), (et, vl) -> ((WhiteBaseOne04Bonvo)et).setBonvoName((String)vl), "bonvoName");
        setupEpg(_epgMap, et -> ((WhiteBaseOne04Bonvo)et).getParksideId(), (et, vl) -> ((WhiteBaseOne04Bonvo)et).setParksideId(cti(vl)), "parksideId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne04Bonvo)et).getStationsideId(), (et, vl) -> ((WhiteBaseOne04Bonvo)et).setStationsideId(cti(vl)), "stationsideId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne04Bonvo)et).getWhiteBaseOne04BonvoParkside(), (et, vl) -> ((WhiteBaseOne04Bonvo)et).setWhiteBaseOne04BonvoParkside((OptionalEntity<WhiteBaseOne04BonvoParkside>)vl), "whiteBaseOne04BonvoParkside");
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne04Bonvo)et).getWhiteBaseOne04BonvoStationside(), (et, vl) -> ((WhiteBaseOne04Bonvo)et).setWhiteBaseOne04BonvoStationside((OptionalEntity<WhiteBaseOne04BonvoStationside>)vl), "whiteBaseOne04BonvoStationside");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE04_BONVO";
    protected final String _tableDispName = "WHITE_BASE_ONE04_BONVO";
    protected final String _tablePropertyName = "whiteBaseOne04Bonvo";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE04_BONVO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBonvoId = cci("BONVO_ID", "BONVO_ID", null, null, Integer.class, "bonvoId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, "whiteBaseList", null, false);
    protected final ColumnInfo _columnBonvoName = cci("BONVO_NAME", "BONVO_NAME", null, null, String.class, "bonvoName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParksideId = cci("PARKSIDE_ID", "PARKSIDE_ID", null, null, Integer.class, "parksideId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne04BonvoParkside", null, null, false);
    protected final ColumnInfo _columnStationsideId = cci("STATIONSIDE_ID", "STATIONSIDE_ID", null, null, Integer.class, "stationsideId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne04BonvoStationside", null, null, false);

    /**
     * BONVO_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBonvoId() { return _columnBonvoId; }
    /**
     * BONVO_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBonvoName() { return _columnBonvoName; }
    /**
     * PARKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_PARKSIDE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParksideId() { return _columnParksideId; }
    /**
     * STATIONSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO_STATIONSIDE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStationsideId() { return _columnStationsideId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBonvoId());
        ls.add(columnBonvoName());
        ls.add(columnParksideId());
        ls.add(columnStationsideId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBonvoId()); }
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
    /**
     * WHITE_BASE_ONE04_BONVO_PARKSIDE by my PARKSIDE_ID, named 'whiteBaseOne04BonvoParkside'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne04BonvoParkside() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParksideId(), WhiteBaseOne04BonvoParksideDbm.getInstance().columnParksideId());
        return cfi("FK_WHITE_BASE_ONE04_BONVO_WHITE_BASE_ONE04_BONVO_PARKSIDE", "whiteBaseOne04BonvoParkside", this, WhiteBaseOne04BonvoParksideDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseOne04BonvoList", false);
    }
    /**
     * WHITE_BASE_ONE04_BONVO_STATIONSIDE by my STATIONSIDE_ID, named 'whiteBaseOne04BonvoStationside'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne04BonvoStationside() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStationsideId(), WhiteBaseOne04BonvoStationsideDbm.getInstance().columnStationsideId());
        return cfi("FK_WHITE_BASE_ONE04_BONVO_WHITE_BASE_ONE04_BONVO_STATIONSIDE", "whiteBaseOne04BonvoStationside", this, WhiteBaseOne04BonvoStationsideDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseOne04BonvoList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * WHITE_BASE by BONVO_ID, named 'whiteBaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteBaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBonvoId(), WhiteBaseDbm.getInstance().columnBonvoId());
        return cri("FK_WHITE_BASE_WHITE_BASE_ONE04_BONVO", "whiteBaseList", this, WhiteBaseDbm.getInstance(), mp, false, "whiteBaseOne04Bonvo");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne04Bonvo"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne04BonvoCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne04BonvoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne04Bonvo> getEntityType() { return WhiteBaseOne04Bonvo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne04Bonvo newEntity() { return new WhiteBaseOne04Bonvo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne04Bonvo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne04Bonvo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
