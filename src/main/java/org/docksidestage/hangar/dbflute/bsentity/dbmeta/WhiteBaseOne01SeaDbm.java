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
 * The DB meta of WHITE_BASE_ONE01_SEA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne01SeaDbm _instance = new WhiteBaseOne01SeaDbm();
    private WhiteBaseOne01SeaDbm() {}
    public static WhiteBaseOne01SeaDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne01Sea)et).getSeaId(), (et, vl) -> ((WhiteBaseOne01Sea)et).setSeaId(cti(vl)), "seaId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01Sea)et).getSeaName(), (et, vl) -> ((WhiteBaseOne01Sea)et).setSeaName((String)vl), "seaName");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01Sea)et).getBroadwayId(), (et, vl) -> ((WhiteBaseOne01Sea)et).setBroadwayId(cti(vl)), "broadwayId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01Sea)et).getDocksideId(), (et, vl) -> ((WhiteBaseOne01Sea)et).setDocksideId(cti(vl)), "docksideId");
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
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne01Sea)et).getWhiteBaseOne01SeaBroadway(), (et, vl) -> ((WhiteBaseOne01Sea)et).setWhiteBaseOne01SeaBroadway((OptionalEntity<WhiteBaseOne01SeaBroadway>)vl), "whiteBaseOne01SeaBroadway");
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne01Sea)et).getWhiteBaseOne01SeaDockside(), (et, vl) -> ((WhiteBaseOne01Sea)et).setWhiteBaseOne01SeaDockside((OptionalEntity<WhiteBaseOne01SeaDockside>)vl), "whiteBaseOne01SeaDockside");
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne01Sea)et).getWhiteBaseOne01SeaHangarAsOne(), (et, vl) -> ((WhiteBaseOne01Sea)et).setWhiteBaseOne01SeaHangarAsOne((OptionalEntity<WhiteBaseOne01SeaHangar>)vl), "whiteBaseOne01SeaHangarAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE01_SEA";
    protected final String _tableDispName = "WHITE_BASE_ONE01_SEA";
    protected final String _tablePropertyName = "whiteBaseOne01Sea";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE01_SEA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSeaId = cci("SEA_ID", "SEA_ID", null, null, Integer.class, "seaId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, "whiteBaseList,whiteBaseOne01SeaMagiclampList", null, false);
    protected final ColumnInfo _columnSeaName = cci("SEA_NAME", "SEA_NAME", null, null, String.class, "seaName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBroadwayId = cci("BROADWAY_ID", "BROADWAY_ID", null, null, Integer.class, "broadwayId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne01SeaBroadway", null, null, false);
    protected final ColumnInfo _columnDocksideId = cci("DOCKSIDE_ID", "DOCKSIDE_ID", null, null, Integer.class, "docksideId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne01SeaDockside", null, null, false);

    /**
     * SEA_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeaId() { return _columnSeaId; }
    /**
     * SEA_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeaName() { return _columnSeaName; }
    /**
     * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBroadwayId() { return _columnBroadwayId; }
    /**
     * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDocksideId() { return _columnDocksideId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSeaId());
        ls.add(columnSeaName());
        ls.add(columnBroadwayId());
        ls.add(columnDocksideId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSeaId()); }
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
     * WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne01SeaBroadway() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBroadwayId(), WhiteBaseOne01SeaBroadwayDbm.getInstance().columnBroadwayId());
        return cfi("FK_WHITE_BASE_ONE01_SEA_WHITE_BASE_ONE01_SEA_BROADWAY", "whiteBaseOne01SeaBroadway", this, WhiteBaseOne01SeaBroadwayDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseOne01SeaList", false);
    }
    /**
     * WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne01SeaDockside() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDocksideId(), WhiteBaseOne01SeaDocksideDbm.getInstance().columnDocksideId());
        return cfi("FK_WHITE_BASE_ONE01_SEA_WHITE_BASE_ONE01_SEA_DOCKSIDE", "whiteBaseOne01SeaDockside", this, WhiteBaseOne01SeaDocksideDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseOne01SeaList", false);
    }
    /**
     * WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne01SeaHangarAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSeaId(), WhiteBaseOne01SeaHangarDbm.getInstance().columnSeaId());
        return cfi("FK_WHITE_BASE_ONE01_SEA_HANGAR_WHITE_BASE_ONE01_SEA", "whiteBaseOne01SeaHangarAsOne", this, WhiteBaseOne01SeaHangarDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "whiteBaseOne01Sea", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * WHITE_BASE by SEA_ID, named 'whiteBaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteBaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSeaId(), WhiteBaseDbm.getInstance().columnSeaId());
        return cri("FK_WHITE_BASE_WHITE_BASE_ONE01_SEA", "whiteBaseList", this, WhiteBaseDbm.getInstance(), mp, false, "whiteBaseOne01Sea");
    }
    /**
     * WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteBaseOne01SeaMagiclampList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSeaId(), WhiteBaseOne01SeaMagiclampDbm.getInstance().columnSeaId());
        return cri("FK_WHITE_BASE_ONE01_SEA_MAGICLAMP_WHITE_BASE_ONE01_SEA", "whiteBaseOne01SeaMagiclampList", this, WhiteBaseOne01SeaMagiclampDbm.getInstance(), mp, false, "whiteBaseOne01Sea");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne01Sea"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne01SeaCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne01SeaBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne01Sea> getEntityType() { return WhiteBaseOne01Sea.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne01Sea newEntity() { return new WhiteBaseOne01Sea(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne01Sea)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne01Sea)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
