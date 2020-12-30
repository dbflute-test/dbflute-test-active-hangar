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
 * The DB meta of WHITE_BASE_ONE01_SEA_BROADWAY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaBroadwayDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne01SeaBroadwayDbm _instance = new WhiteBaseOne01SeaBroadwayDbm();
    private WhiteBaseOne01SeaBroadwayDbm() {}
    public static WhiteBaseOne01SeaBroadwayDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaBroadway)et).getBroadwayId(), (et, vl) -> ((WhiteBaseOne01SeaBroadway)et).setBroadwayId(cti(vl)), "broadwayId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaBroadway)et).getBroadwayName(), (et, vl) -> ((WhiteBaseOne01SeaBroadway)et).setBroadwayName((String)vl), "broadwayName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE01_SEA_BROADWAY";
    protected final String _tableDispName = "WHITE_BASE_ONE01_SEA_BROADWAY";
    protected final String _tablePropertyName = "whiteBaseOne01SeaBroadway";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE01_SEA_BROADWAY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBroadwayId = cci("BROADWAY_ID", "BROADWAY_ID", null, null, Integer.class, "broadwayId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, "whiteBaseOne01SeaList", null, false);
    protected final ColumnInfo _columnBroadwayName = cci("BROADWAY_NAME", "BROADWAY_NAME", null, null, String.class, "broadwayName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * BROADWAY_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBroadwayId() { return _columnBroadwayId; }
    /**
     * BROADWAY_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBroadwayName() { return _columnBroadwayName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBroadwayId());
        ls.add(columnBroadwayName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBroadwayId()); }
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
     * WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteBaseOne01SeaList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBroadwayId(), WhiteBaseOne01SeaDbm.getInstance().columnBroadwayId());
        return cri("FK_WHITE_BASE_ONE01_SEA_WHITE_BASE_ONE01_SEA_BROADWAY", "whiteBaseOne01SeaList", this, WhiteBaseOne01SeaDbm.getInstance(), mp, false, "whiteBaseOne01SeaBroadway");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne01SeaBroadway"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne01SeaBroadwayCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne01SeaBroadwayBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne01SeaBroadway> getEntityType() { return WhiteBaseOne01SeaBroadway.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne01SeaBroadway newEntity() { return new WhiteBaseOne01SeaBroadway(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne01SeaBroadway)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne01SeaBroadway)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
