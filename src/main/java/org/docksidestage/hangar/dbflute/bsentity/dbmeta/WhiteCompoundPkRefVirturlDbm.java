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
 * The DB meta of WHITE_COMPOUND_PK_REF_VIRTURL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefVirturlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkRefVirturlDbm _instance = new WhiteCompoundPkRefVirturlDbm();
    private WhiteCompoundPkRefVirturlDbm() {}
    public static WhiteCompoundPkRefVirturlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefVirturl)et).getRefFirstId(), (et, vl) -> ((WhiteCompoundPkRefVirturl)et).setRefFirstId(ctl(vl)), "refFirstId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefVirturl)et).getRefSecondId(), (et, vl) -> ((WhiteCompoundPkRefVirturl)et).setRefSecondId(ctl(vl)), "refSecondId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefVirturl)et).getRefThirdId(), (et, vl) -> ((WhiteCompoundPkRefVirturl)et).setRefThirdId(ctl(vl)), "refThirdId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkRefVirturl)et).getCompoundRefName(), (et, vl) -> ((WhiteCompoundPkRefVirturl)et).setCompoundRefName((String)vl), "compoundRefName");
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
        setupEfpg(_efpgMap, et -> ((WhiteCompoundPkRefVirturl)et).getWhiteCompoundPk(), (et, vl) -> ((WhiteCompoundPkRefVirturl)et).setWhiteCompoundPk((OptionalEntity<WhiteCompoundPk>)vl), "whiteCompoundPk");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_COMPOUND_PK_REF_VIRTURL";
    protected final String _tableDispName = "WHITE_COMPOUND_PK_REF_VIRTURL";
    protected final String _tablePropertyName = "whiteCompoundPkRefVirturl";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_COMPOUND_PK_REF_VIRTURL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefFirstId = cci("REF_FIRST_ID", "REF_FIRST_ID", null, null, Long.class, "refFirstId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, "whiteCompoundPk", null, null, false);
    protected final ColumnInfo _columnRefSecondId = cci("REF_SECOND_ID", "REF_SECOND_ID", null, null, Long.class, "refSecondId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, "whiteCompoundPk", null, null, false);
    protected final ColumnInfo _columnRefThirdId = cci("REF_THIRD_ID", "REF_THIRD_ID", null, null, Long.class, "refThirdId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCompoundRefName = cci("COMPOUND_REF_NAME", "COMPOUND_REF_NAME", null, null, String.class, "compoundRefName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * REF_FIRST_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefFirstId() { return _columnRefFirstId; }
    /**
     * REF_SECOND_ID: {PK, NotNull, DECIMAL(16), FK to WHITE_COMPOUND_PK}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefSecondId() { return _columnRefSecondId; }
    /**
     * REF_THIRD_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefThirdId() { return _columnRefThirdId; }
    /**
     * COMPOUND_REF_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCompoundRefName() { return _columnCompoundRefName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefFirstId());
        ls.add(columnRefSecondId());
        ls.add(columnRefThirdId());
        ls.add(columnCompoundRefName());
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
        ls.add(columnRefFirstId());
        ls.add(columnRefSecondId());
        ls.add(columnRefThirdId());
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
    /**
     * WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteCompoundPk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnRefFirstId(), WhiteCompoundPkDbm.getInstance().columnPkFirstId());
        mp.put(columnRefSecondId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cfi("FK_WHITE_COMPOUND_PK_REF_VIRTURL_FIRST_SECOND", "whiteCompoundPk", this, WhiteCompoundPkDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "whiteCompoundPkRefVirturlList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteCompoundPkRefVirturl"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteCompoundPkRefVirturlCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteCompoundPkRefVirturlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkRefVirturl> getEntityType() { return WhiteCompoundPkRefVirturl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPkRefVirturl newEntity() { return new WhiteCompoundPkRefVirturl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkRefVirturl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkRefVirturl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
