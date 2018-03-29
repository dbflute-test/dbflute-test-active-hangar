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
 * The DB meta of WHITE_DEPRECATED_SELECT_BY_PKUQ. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDeprecatedSelectByPkuqDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDeprecatedSelectByPkuqDbm _instance = new WhiteDeprecatedSelectByPkuqDbm();
    private WhiteDeprecatedSelectByPkuqDbm() {}
    public static WhiteDeprecatedSelectByPkuqDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDeprecatedSelectByPkuq)et).getSelectByPkuqId(), (et, vl) -> ((WhiteDeprecatedSelectByPkuq)et).setSelectByPkuqId(ctl(vl)), "selectByPkuqId");
        setupEpg(_epgMap, et -> ((WhiteDeprecatedSelectByPkuq)et).getSelectByPkuqName(), (et, vl) -> ((WhiteDeprecatedSelectByPkuq)et).setSelectByPkuqName((String)vl), "selectByPkuqName");
        setupEpg(_epgMap, et -> ((WhiteDeprecatedSelectByPkuq)et).getSelectByPkuqCode(), (et, vl) -> ((WhiteDeprecatedSelectByPkuq)et).setSelectByPkuqCode((String)vl), "selectByPkuqCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DEPRECATED_SELECT_BY_PKUQ";
    protected final String _tableDispName = "WHITE_DEPRECATED_SELECT_BY_PKUQ";
    protected final String _tablePropertyName = "whiteDeprecatedSelectByPkuq";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_DEPRECATED_SELECT_BY_PKUQ", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSelectByPkuqId = cci("SELECT_BY_PKUQ_ID", "SELECT_BY_PKUQ_ID", null, null, Long.class, "selectByPkuqId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelectByPkuqName = cci("SELECT_BY_PKUQ_NAME", "SELECT_BY_PKUQ_NAME", null, null, String.class, "selectByPkuqName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelectByPkuqCode = cci("SELECT_BY_PKUQ_CODE", "SELECT_BY_PKUQ_CODE", null, null, String.class, "selectByPkuqCode", null, false, false, true, "VARCHAR", 16, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SELECT_BY_PKUQ_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelectByPkuqId() { return _columnSelectByPkuqId; }
    /**
     * SELECT_BY_PKUQ_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelectByPkuqName() { return _columnSelectByPkuqName; }
    /**
     * SELECT_BY_PKUQ_CODE: {UQ, NotNull, VARCHAR(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelectByPkuqCode() { return _columnSelectByPkuqCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSelectByPkuqId());
        ls.add(columnSelectByPkuqName());
        ls.add(columnSelectByPkuqCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSelectByPkuqId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnSelectByPkuqCode()); }

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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteDeprecatedSelectByPkuq"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteDeprecatedSelectByPkuqCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteDeprecatedSelectByPkuqBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDeprecatedSelectByPkuq> getEntityType() { return WhiteDeprecatedSelectByPkuq.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDeprecatedSelectByPkuq newEntity() { return new WhiteDeprecatedSelectByPkuq(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDeprecatedSelectByPkuq)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDeprecatedSelectByPkuq)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
