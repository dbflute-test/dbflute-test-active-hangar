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
 * The DB meta of WHITE_BASE_ONE12_AMPHI. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne12AmphiDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne12AmphiDbm _instance = new WhiteBaseOne12AmphiDbm();
    private WhiteBaseOne12AmphiDbm() {}
    public static WhiteBaseOne12AmphiDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne12Amphi)et).getAmphiId(), (et, vl) -> ((WhiteBaseOne12Amphi)et).setAmphiId(cti(vl)), "amphiId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne12Amphi)et).getAmphiName(), (et, vl) -> ((WhiteBaseOne12Amphi)et).setAmphiName((String)vl), "amphiName");
        setupEpg(_epgMap, et -> ((WhiteBaseOne12Amphi)et).getBaseId(), (et, vl) -> ((WhiteBaseOne12Amphi)et).setBaseId(cti(vl)), "baseId");
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
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne12Amphi)et).getWhiteBase(), (et, vl) -> ((WhiteBaseOne12Amphi)et).setWhiteBase((OptionalEntity<WhiteBase>)vl), "whiteBase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE12_AMPHI";
    protected final String _tableDispName = "WHITE_BASE_ONE12_AMPHI";
    protected final String _tablePropertyName = "whiteBaseOne12Amphi";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE12_AMPHI", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAmphiId = cci("AMPHI_ID", "AMPHI_ID", null, null, Integer.class, "amphiId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmphiName = cci("AMPHI_NAME", "AMPHI_NAME", null, null, String.class, "amphiName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Integer.class, "baseId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, "whiteBase", null, null, false);

    /**
     * AMPHI_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmphiId() { return _columnAmphiId; }
    /**
     * AMPHI_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmphiName() { return _columnAmphiName; }
    /**
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAmphiId());
        ls.add(columnAmphiName());
        ls.add(columnBaseId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnAmphiId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnBaseId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * WHITE_BASE by my BASE_ID, named 'whiteBase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteBaseDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_BASE_ONE12_AMPHI_WHITE_BASE", "whiteBase", this, WhiteBaseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, true, null, null, false, "whiteBaseOne12AmphiAsOne", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne12Amphi"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne12AmphiCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne12AmphiBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne12Amphi> getEntityType() { return WhiteBaseOne12Amphi.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne12Amphi newEntity() { return new WhiteBaseOne12Amphi(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne12Amphi)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne12Amphi)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
