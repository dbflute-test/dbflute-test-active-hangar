/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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
 * The DB meta of WHITE_BASE_ONE01_SEA_MAGICLAMP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaMagiclampDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne01SeaMagiclampDbm _instance = new WhiteBaseOne01SeaMagiclampDbm();
    private WhiteBaseOne01SeaMagiclampDbm() {}
    public static WhiteBaseOne01SeaMagiclampDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaMagiclamp)et).getMagiclampId(), (et, vl) -> ((WhiteBaseOne01SeaMagiclamp)et).setMagiclampId(cti(vl)), "magiclampId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaMagiclamp)et).getMagiclampName(), (et, vl) -> ((WhiteBaseOne01SeaMagiclamp)et).setMagiclampName((String)vl), "magiclampName");
        setupEpg(_epgMap, et -> ((WhiteBaseOne01SeaMagiclamp)et).getSeaId(), (et, vl) -> ((WhiteBaseOne01SeaMagiclamp)et).setSeaId(cti(vl)), "seaId");
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
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne01SeaMagiclamp)et).getWhiteBaseOne01Sea(), (et, vl) -> ((WhiteBaseOne01SeaMagiclamp)et).setWhiteBaseOne01Sea((OptionalEntity<WhiteBaseOne01Sea>)vl), "whiteBaseOne01Sea");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE01_SEA_MAGICLAMP";
    protected final String _tableDispName = "WHITE_BASE_ONE01_SEA_MAGICLAMP";
    protected final String _tablePropertyName = "whiteBaseOne01SeaMagiclamp";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE01_SEA_MAGICLAMP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMagiclampId = cci("MAGICLAMP_ID", "MAGICLAMP_ID", null, null, Integer.class, "magiclampId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMagiclampName = cci("MAGICLAMP_NAME", "MAGICLAMP_NAME", null, null, String.class, "magiclampName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeaId = cci("SEA_ID", "SEA_ID", null, null, Integer.class, "seaId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne01Sea", null, null, false);

    /**
     * MAGICLAMP_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMagiclampId() { return _columnMagiclampId; }
    /**
     * MAGICLAMP_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMagiclampName() { return _columnMagiclampName; }
    /**
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeaId() { return _columnSeaId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMagiclampId());
        ls.add(columnMagiclampName());
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
    protected UniqueInfo cpui() { return hpcpui(columnMagiclampId()); }
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
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne01Sea() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSeaId(), WhiteBaseOne01SeaDbm.getInstance().columnSeaId());
        return cfi("FK_WHITE_BASE_ONE01_SEA_MAGICLAMP_WHITE_BASE_ONE01_SEA", "whiteBaseOne01Sea", this, WhiteBaseOne01SeaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseOne01SeaMagiclampList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne01SeaMagiclamp"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne01SeaMagiclampCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne01SeaMagiclampBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne01SeaMagiclamp> getEntityType() { return WhiteBaseOne01SeaMagiclamp.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne01SeaMagiclamp newEntity() { return new WhiteBaseOne01SeaMagiclamp(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne01SeaMagiclamp)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne01SeaMagiclamp)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
