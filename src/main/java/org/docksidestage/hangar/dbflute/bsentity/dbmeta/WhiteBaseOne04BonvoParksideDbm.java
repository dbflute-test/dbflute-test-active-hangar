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
 * The DB meta of WHITE_BASE_ONE04_BONVO_PARKSIDE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne04BonvoParksideDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne04BonvoParksideDbm _instance = new WhiteBaseOne04BonvoParksideDbm();
    private WhiteBaseOne04BonvoParksideDbm() {}
    public static WhiteBaseOne04BonvoParksideDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne04BonvoParkside)et).getParksideId(), (et, vl) -> ((WhiteBaseOne04BonvoParkside)et).setParksideId(cti(vl)), "parksideId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne04BonvoParkside)et).getParksideName(), (et, vl) -> ((WhiteBaseOne04BonvoParkside)et).setParksideName((String)vl), "parksideName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE04_BONVO_PARKSIDE";
    protected final String _tableDispName = "WHITE_BASE_ONE04_BONVO_PARKSIDE";
    protected final String _tablePropertyName = "whiteBaseOne04BonvoParkside";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE04_BONVO_PARKSIDE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnParksideId = cci("PARKSIDE_ID", "PARKSIDE_ID", null, null, Integer.class, "parksideId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, "whiteBaseOne04BonvoList", null, false);
    protected final ColumnInfo _columnParksideName = cci("PARKSIDE_NAME", "PARKSIDE_NAME", null, null, String.class, "parksideName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PARKSIDE_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParksideId() { return _columnParksideId; }
    /**
     * PARKSIDE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParksideName() { return _columnParksideName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnParksideId());
        ls.add(columnParksideName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnParksideId()); }
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
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteBaseOne04BonvoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParksideId(), WhiteBaseOne04BonvoDbm.getInstance().columnParksideId());
        return cri("FK_WHITE_BASE_ONE04_BONVO_WHITE_BASE_ONE04_BONVO_PARKSIDE", "whiteBaseOne04BonvoList", this, WhiteBaseOne04BonvoDbm.getInstance(), mp, false, "whiteBaseOne04BonvoParkside");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne04BonvoParkside"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne04BonvoParksideCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne04BonvoParksideBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne04BonvoParkside> getEntityType() { return WhiteBaseOne04BonvoParkside.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne04BonvoParkside newEntity() { return new WhiteBaseOne04BonvoParkside(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne04BonvoParkside)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne04BonvoParkside)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
