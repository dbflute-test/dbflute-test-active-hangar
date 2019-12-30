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
 * The DB meta of WHITE_COMPOUND_PK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkDbm _instance = new WhiteCompoundPkDbm();
    private WhiteCompoundPkDbm() {}
    public static WhiteCompoundPkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkFirstId(), (et, vl) -> ((WhiteCompoundPk)et).setPkFirstId(ctl(vl)), "pkFirstId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkSecondId(), (et, vl) -> ((WhiteCompoundPk)et).setPkSecondId(ctl(vl)), "pkSecondId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getCompoundPkName(), (et, vl) -> ((WhiteCompoundPk)et).setCompoundPkName((String)vl), "compoundPkName");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getReferredId(), (et, vl) -> ((WhiteCompoundPk)et).setReferredId(cti(vl)), "referredId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_COMPOUND_PK";
    protected final String _tableDispName = "WHITE_COMPOUND_PK";
    protected final String _tablePropertyName = "whiteCompoundPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_COMPOUND_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPkFirstId = cci("PK_FIRST_ID", "PK_FIRST_ID", null, null, Long.class, "pkFirstId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, "whiteCompoundPkRefPhysicalList,whiteCompoundPkRefVirturlList", null, false);
    protected final ColumnInfo _columnPkSecondId = cci("PK_SECOND_ID", "PK_SECOND_ID", null, null, Long.class, "pkSecondId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, "whiteCompoundPkRefPhysicalList,whiteCompoundPkRefVirturlList", null, false);
    protected final ColumnInfo _columnCompoundPkName = cci("COMPOUND_PK_NAME", "COMPOUND_PK_NAME", null, null, String.class, "compoundPkName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferredId = cci("REFERRED_ID", "REFERRED_ID", null, null, Integer.class, "referredId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PK_FIRST_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkFirstId() { return _columnPkFirstId; }
    /**
     * PK_SECOND_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkSecondId() { return _columnPkSecondId; }
    /**
     * COMPOUND_PK_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundPkName() { return _columnCompoundPkName; }
    /**
     * REFERRED_ID: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferredId() { return _columnReferredId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        ls.add(columnCompoundPkName());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
     * WHITE_COMPOUND_PK_REF_PHYSICAL by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefPhysicalList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefPhysicalList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefPhysicalDbm.getInstance().columnRefFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefPhysicalDbm.getInstance().columnRefSecondId());
        return cri("FK_WHITE_COMPOUND_PK_REF_PHYSICAL_FIRST_SECOND", "whiteCompoundPkRefPhysicalList", this, WhiteCompoundPkRefPhysicalDbm.getInstance(), mp, false, "whiteCompoundPk");
    }
    /**
     * WHITE_COMPOUND_PK_REF_VIRTURL by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefVirturlList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefVirturlList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefVirturlDbm.getInstance().columnRefFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefVirturlDbm.getInstance().columnRefSecondId());
        return cri("FK_WHITE_COMPOUND_PK_REF_VIRTURL_FIRST_SECOND", "whiteCompoundPkRefVirturlList", this, WhiteCompoundPkRefVirturlDbm.getInstance(), mp, false, "whiteCompoundPk");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteCompoundPk"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteCompoundPkCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteCompoundPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPk> getEntityType() { return WhiteCompoundPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPk newEntity() { return new WhiteCompoundPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
