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
 * The DB meta of WHITE_BASE_ONE01_SEA_HANGAR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaHangarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne01SeaHangarDbm _instance = new WhiteBaseOne01SeaHangarDbm();
    private WhiteBaseOne01SeaHangarDbm() {}
    public static WhiteBaseOne01SeaHangarDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaHangar)et).getHangarId(), (et, vl) -> ((WhiteBaseOne01SeaHangar)et).setHangarId(cti(vl)), "hangarId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaHangar)et).getHangarName(), (et, vl) -> ((WhiteBaseOne01SeaHangar)et).setHangarName((String)vl), "hangarName");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaHangar)et).getSeaId(), (et, vl) -> ((WhiteBaseOne01SeaHangar)et).setSeaId(cti(vl)), "seaId");
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
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne01SeaHangar)et).getWhiteBaseOne01Sea(), (et, vl) -> ((WhiteBaseOne01SeaHangar)et).setWhiteBaseOne01Sea((OptionalEntity<WhiteBaseOne01Sea>)vl), "whiteBaseOne01Sea");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE01_SEA_HANGAR";
    protected final String _tableDispName = "WHITE_BASE_ONE01_SEA_HANGAR";
    protected final String _tablePropertyName = "whiteBaseOne01SeaHangar";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE01_SEA_HANGAR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHangarId = cci("HANGAR_ID", "HANGAR_ID", null, null, Integer.class, "hangarId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHangarName = cci("HANGAR_NAME", "HANGAR_NAME", null, null, String.class, "hangarName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeaId = cci("SEA_ID", "SEA_ID", null, null, Integer.class, "seaId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne01Sea", null, null, false);

    /**
     * HANGAR_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHangarId() { return _columnHangarId; }
    /**
     * HANGAR_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHangarName() { return _columnHangarName; }
    /**
     * SEA_ID: {UQ, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeaId() { return _columnSeaId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnHangarId());
        ls.add(columnHangarName());
        ls.add(columnSeaId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnHangarId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnSeaId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne01Sea() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSeaId(), WhiteBaseOne01SeaDbm.getInstance().columnSeaId());
        return cfi("FK_WHITE_BASE_ONE01_SEA_HANGAR_WHITE_BASE_ONE01_SEA", "whiteBaseOne01Sea", this, WhiteBaseOne01SeaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "whiteBaseOne01SeaHangarAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne01SeaHangar"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne01SeaHangarCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne01SeaHangarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne01SeaHangar> getEntityType() { return WhiteBaseOne01SeaHangar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne01SeaHangar newEntity() { return new WhiteBaseOne01SeaHangar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne01SeaHangar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne01SeaHangar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
