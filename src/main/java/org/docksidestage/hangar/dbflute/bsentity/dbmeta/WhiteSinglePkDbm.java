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
 * The DB meta of WHITE_SINGLE_PK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSinglePkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSinglePkDbm _instance = new WhiteSinglePkDbm();
    private WhiteSinglePkDbm() {}
    public static WhiteSinglePkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSinglePk)et).getOnlyOnePkId(), (et, vl) -> ((WhiteSinglePk)et).setOnlyOnePkId(ctl(vl)), "onlyOnePkId");
        setupEpg(_epgMap, et -> ((WhiteSinglePk)et).getSinglePkName(), (et, vl) -> ((WhiteSinglePk)et).setSinglePkName((String)vl), "singlePkName");
        setupEpg(_epgMap, et -> ((WhiteSinglePk)et).getReferredId(), (et, vl) -> ((WhiteSinglePk)et).setReferredId(cti(vl)), "referredId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_SINGLE_PK";
    protected final String _tableDispName = "WHITE_SINGLE_PK";
    protected final String _tablePropertyName = "whiteSinglePk";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_SINGLE_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOnlyOnePkId = cci("ONLY_ONE_PK_ID", "ONLY_ONE_PK_ID", null, null, Long.class, "onlyOnePkId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSinglePkName = cci("SINGLE_PK_NAME", "SINGLE_PK_NAME", null, null, String.class, "singlePkName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferredId = cci("REFERRED_ID", "REFERRED_ID", null, null, Integer.class, "referredId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * ONLY_ONE_PK_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnlyOnePkId() { return _columnOnlyOnePkId; }
    /**
     * SINGLE_PK_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSinglePkName() { return _columnSinglePkName; }
    /**
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferredId() { return _columnReferredId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnOnlyOnePkId());
        ls.add(columnSinglePkName());
        ls.add(columnReferredId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnOnlyOnePkId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteSinglePk"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteSinglePkCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteSinglePkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSinglePk> getEntityType() { return WhiteSinglePk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSinglePk newEntity() { return new WhiteSinglePk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSinglePk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSinglePk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
