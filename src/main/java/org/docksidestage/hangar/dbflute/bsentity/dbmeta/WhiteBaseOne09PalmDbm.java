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
 * The DB meta of WHITE_BASE_ONE09_PALM. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne09PalmDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseOne09PalmDbm _instance = new WhiteBaseOne09PalmDbm();
    private WhiteBaseOne09PalmDbm() {}
    public static WhiteBaseOne09PalmDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBaseOne09Palm)et).getPalmId(), (et, vl) -> ((WhiteBaseOne09Palm)et).setPalmId(cti(vl)), "palmId");
        setupEpg(_epgMap, et -> ((WhiteBaseOne09Palm)et).getPalmName(), (et, vl) -> ((WhiteBaseOne09Palm)et).setPalmName((String)vl), "palmName");
        setupEpg(_epgMap, et -> ((WhiteBaseOne09Palm)et).getBaseId(), (et, vl) -> ((WhiteBaseOne09Palm)et).setBaseId(cti(vl)), "baseId");
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
        setupEfpg(_efpgMap, et -> ((WhiteBaseOne09Palm)et).getWhiteBase(), (et, vl) -> ((WhiteBaseOne09Palm)et).setWhiteBase((OptionalEntity<WhiteBase>)vl), "whiteBase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE_ONE09_PALM";
    protected final String _tableDispName = "WHITE_BASE_ONE09_PALM";
    protected final String _tablePropertyName = "whiteBaseOne09Palm";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE_ONE09_PALM", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPalmId = cci("PALM_ID", "PALM_ID", null, null, Integer.class, "palmId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPalmName = cci("PALM_NAME", "PALM_NAME", null, null, String.class, "palmName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Integer.class, "baseId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, "whiteBase", null, null, false);

    /**
     * PALM_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalmId() { return _columnPalmId; }
    /**
     * PALM_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPalmName() { return _columnPalmName; }
    /**
     * BASE_ID: {UQ, NotNull, INTEGER(10), FK to WHITE_BASE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPalmId());
        ls.add(columnPalmName());
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
    protected UniqueInfo cpui() { return hpcpui(columnPalmId()); }
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
        return cfi("FK_WHITE_BASE_ONE09_PALM_WHITE_BASE", "whiteBase", this, WhiteBaseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "whiteBaseOne09PalmAsOne", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBaseOne09Palm"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseOne09PalmCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseOne09PalmBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBaseOne09Palm> getEntityType() { return WhiteBaseOne09Palm.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBaseOne09Palm newEntity() { return new WhiteBaseOne09Palm(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBaseOne09Palm)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBaseOne09Palm)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
