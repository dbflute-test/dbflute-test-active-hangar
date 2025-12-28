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
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The DB meta of white_generate_name_switched. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteGenerateNameSwitchedDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteGenerateNameSwitchedDbm _instance = new WhiteGenerateNameSwitchedDbm();
    private WhiteGenerateNameSwitchedDbm() {}
    public static WhiteGenerateNameSwitchedDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteGenerateNameSwitched)et).getGenerateNameSwitchedId(), (et, vl) -> ((WhiteGenerateNameSwitched)et).setGenerateNameSwitchedId(ctl(vl)), "generateNameSwitchedId");
        setupEpg(_epgMap, et -> ((WhiteGenerateNameSwitched)et).getGenerateNameSwitchedName(), (et, vl) -> ((WhiteGenerateNameSwitched)et).setGenerateNameSwitchedName((String)vl), "generateNameSwitchedName");
        setupEpg(_epgMap, et -> ((WhiteGenerateNameSwitched)et).getGenerateNameSwitchedCount(), (et, vl) -> ((WhiteGenerateNameSwitched)et).setGenerateNameSwitchedCount(cti(vl)), "generateNameSwitchedCount");
        setupEpg(_epgMap, et -> ((WhiteGenerateNameSwitched)et).getGenerateNameSwitchedDate(), (et, vl) -> ((WhiteGenerateNameSwitched)et).setGenerateNameSwitchedDate(ctld(vl)), "generateNameSwitchedDate");
        setupEpg(_epgMap, et -> ((WhiteGenerateNameSwitched)et).getGenerateNameSwitchedDatetime(), (et, vl) -> ((WhiteGenerateNameSwitched)et).setGenerateNameSwitchedDatetime(ctldt(vl)), "generateNameSwitchedDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_generate_name_switched";
    protected final String _tableDispName = "white_generate_name_switched";
    protected final String _tablePropertyName = "whiteGenerateNameSwitched";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.white_generate_name_switched", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGenerateNameSwitchedId = cci("GENERATE_NAME_SWITCHED_ID", "GENERATE_NAME_SWITCHED_ID", null, null, Long.class, "generateNameSwitchedId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenerateNameSwitchedName = cci("GENERATE_NAME_SWITCHED_NAME", "GENERATE_NAME_SWITCHED_NAME", null, null, String.class, "generateNameSwitchedName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenerateNameSwitchedCount = cci("GENERATE_NAME_SWITCHED_COUNT", "GENERATE_NAME_SWITCHED_COUNT", null, null, Integer.class, "generateNameSwitchedCount", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenerateNameSwitchedDate = cci("GENERATE_NAME_SWITCHED_DATE", "GENERATE_NAME_SWITCHED_DATE", null, null, java.time.LocalDate.class, "generateNameSwitchedDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenerateNameSwitchedDatetime = cci("GENERATE_NAME_SWITCHED_DATETIME", "GENERATE_NAME_SWITCHED_DATETIME", null, null, java.time.LocalDateTime.class, "generateNameSwitchedDatetime", null, false, false, false, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);

    /**
     * GENERATE_NAME_SWITCHED_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenerateNameSwitchedId() { return _columnGenerateNameSwitchedId; }
    /**
     * GENERATE_NAME_SWITCHED_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenerateNameSwitchedName() { return _columnGenerateNameSwitchedName; }
    /**
     * GENERATE_NAME_SWITCHED_COUNT: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenerateNameSwitchedCount() { return _columnGenerateNameSwitchedCount; }
    /**
     * GENERATE_NAME_SWITCHED_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenerateNameSwitchedDate() { return _columnGenerateNameSwitchedDate; }
    /**
     * GENERATE_NAME_SWITCHED_DATETIME: {TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenerateNameSwitchedDatetime() { return _columnGenerateNameSwitchedDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGenerateNameSwitchedId());
        ls.add(columnGenerateNameSwitchedName());
        ls.add(columnGenerateNameSwitchedCount());
        ls.add(columnGenerateNameSwitchedDate());
        ls.add(columnGenerateNameSwitchedDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGenerateNameSwitchedId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteGenerateNameSwitched"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteGenerateNameSwitchedCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteGenerateNameSwitchedBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteGenerateNameSwitched> getEntityType() { return WhiteGenerateNameSwitched.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteGenerateNameSwitched newEntity() { return new WhiteGenerateNameSwitched(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteGenerateNameSwitched)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteGenerateNameSwitched)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
