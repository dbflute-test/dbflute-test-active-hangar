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
 * The DB meta of WHITE_BASE_ONE11_CIRQUE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne11CirqueDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne11CirqueDbm _instance = new WhiteBaseOne11CirqueDbm();
    private WhiteBaseOne11CirqueDbm() {}
    public static WhiteBaseOne11CirqueDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne11Cirque)et).getCirqueId(), (et, vl) -> ((WhiteBaseOne11Cirque)et).setCirqueId(cti(vl)), "cirqueId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne11Cirque)et).getCirqueName(), (et, vl) -> ((WhiteBaseOne11Cirque)et).setCirqueName((String)vl), "cirqueName");
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
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne11Cirque)et).getWhiteBase(), (et, vl) -> ((WhiteBaseOne11Cirque)et).setWhiteBase((OptionalEntity<WhiteBase>)vl), "whiteBase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE11_CIRQUE";
    protected final String _tableDispName = "WHITE_BASE_ONE11_CIRQUE";
    protected final String _tablePropertyName = "whiteBaseOne11Cirque";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE11_CIRQUE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCirqueId = cci("CIRQUE_ID", "CIRQUE_ID", null, null, Integer.class, "cirqueId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, "whiteBase", null, null, false);
    protected final ColumnInfo _columnCirqueName = cci("CIRQUE_NAME", "CIRQUE_NAME", null, null, String.class, "cirqueName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);

    /**
     * CIRQUE_ID: {PK, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCirqueId() { return _columnCirqueId; }
    /**
     * CIRQUE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCirqueName() { return _columnCirqueName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCirqueId());
        ls.add(columnCirqueName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCirqueId()); }
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
     * WHITE_BASE by my CIRQUE_ID, named 'whiteBase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCirqueId(), WhiteBaseDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_BASE_ONE11_CIRQUE_WHITE_BASE", "whiteBase", this, WhiteBaseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "whiteBaseOne11CirqueAsOne", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne11Cirque"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne11CirqueCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne11CirqueBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne11Cirque> getEntityType() { return WhiteBaseOne11Cirque.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne11Cirque newEntity() { return new WhiteBaseOne11Cirque(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne11Cirque)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne11Cirque)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
