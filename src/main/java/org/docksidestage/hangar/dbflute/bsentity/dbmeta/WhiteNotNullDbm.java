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
 * The DB meta of WHITE_NOT_NULL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteNotNullDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteNotNullDbm _instance = new WhiteNotNullDbm();
    private WhiteNotNullDbm() {}
    public static WhiteNotNullDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteNotNull)et).getNotNullId(), (et, vl) -> ((WhiteNotNull)et).setNotNullId(ctl(vl)), "notNullId");
        setupEpg(_epgMap, et -> ((WhiteNotNull)et).getNotNullName(), (et, vl) -> ((WhiteNotNull)et).setNotNullName((String)vl), "notNullName");
        setupEpg(_epgMap, et -> ((WhiteNotNull)et).getNotNullCount(), (et, vl) -> ((WhiteNotNull)et).setNotNullCount(cti(vl)), "notNullCount");
        setupEpg(_epgMap, et -> ((WhiteNotNull)et).getNotNullDate(), (et, vl) -> ((WhiteNotNull)et).setNotNullDate(ctld(vl)), "notNullDate");
        setupEpg(_epgMap, et -> ((WhiteNotNull)et).getNotNullDatetime(), (et, vl) -> ((WhiteNotNull)et).setNotNullDatetime(ctldt(vl)), "notNullDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_NOT_NULL";
    protected final String _tableDispName = "WHITE_NOT_NULL";
    protected final String _tablePropertyName = "whiteNotNull";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_NOT_NULL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableComment = "#sea";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNotNullId = cci("NOT_NULL_ID", "NOT_NULL_ID", null, null, Long.class, "notNullId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotNullName = cci("NOT_NULL_NAME", "NOT_NULL_NAME", null, null, String.class, "notNullName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotNullCount = cci("NOT_NULL_COUNT", "NOT_NULL_COUNT", null, null, Integer.class, "notNullCount", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotNullDate = cci("NOT_NULL_DATE", "NOT_NULL_DATE", null, null, java.time.LocalDate.class, "notNullDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotNullDatetime = cci("NOT_NULL_DATETIME", "NOT_NULL_DATETIME", null, null, java.time.LocalDateTime.class, "notNullDatetime", null, false, false, false, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);

    /**
     * NOT_NULL_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotNullId() { return _columnNotNullId; }
    /**
     * NOT_NULL_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotNullName() { return _columnNotNullName; }
    /**
     * NOT_NULL_COUNT: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotNullCount() { return _columnNotNullCount; }
    /**
     * NOT_NULL_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotNullDate() { return _columnNotNullDate; }
    /**
     * NOT_NULL_DATETIME: {TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotNullDatetime() { return _columnNotNullDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNotNullId());
        ls.add(columnNotNullName());
        ls.add(columnNotNullCount());
        ls.add(columnNotNullDate());
        ls.add(columnNotNullDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNotNullId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteNotNull"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteNotNullCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteNotNullBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteNotNull> getEntityType() { return WhiteNotNull.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteNotNull newEntity() { return new WhiteNotNull(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteNotNull)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteNotNull)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
