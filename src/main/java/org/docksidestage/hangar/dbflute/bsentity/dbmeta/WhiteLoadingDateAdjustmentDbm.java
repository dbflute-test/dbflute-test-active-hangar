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
 * The DB meta of WHITE_LOADING_DATE_ADJUSTMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteLoadingDateAdjustmentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteLoadingDateAdjustmentDbm _instance = new WhiteLoadingDateAdjustmentDbm();
    private WhiteLoadingDateAdjustmentDbm() {}
    public static WhiteLoadingDateAdjustmentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getDateAdjustmentId(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setDateAdjustmentId(ctl(vl)), "dateAdjustmentId");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getAdjustedDate(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setAdjustedDate(ctld(vl)), "adjustedDate");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getAdjustedDatetime(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setAdjustedDatetime(ctldt(vl)), "adjustedDatetime");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getAdjustedTime(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setAdjustedTime(ctlt(vl)), "adjustedTime");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getAdjustedInteger(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setAdjustedInteger(cti(vl)), "adjustedInteger");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getAdjustedPlainLong(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setAdjustedPlainLong(ctl(vl)), "adjustedPlainLong");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getAdjustedStringLong(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setAdjustedStringLong((String)vl), "adjustedStringLong");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getRegisterDatetime(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getRegisterUser(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getUpdateDatetime(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((WhiteLoadingDateAdjustment)et).getUpdateUser(), (et, vl) -> ((WhiteLoadingDateAdjustment)et).setUpdateUser((String)vl), "updateUser");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_LOADING_DATE_ADJUSTMENT";
    protected final String _tableDispName = "WHITE_LOADING_DATE_ADJUSTMENT";
    protected final String _tablePropertyName = "whiteLoadingDateAdjustment";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_LOADING_DATE_ADJUSTMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDateAdjustmentId = cci("DATE_ADJUSTMENT_ID", "DATE_ADJUSTMENT_ID", null, null, Long.class, "dateAdjustmentId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedDate = cci("ADJUSTED_DATE", "ADJUSTED_DATE", null, "adjusted", java.time.LocalDate.class, "adjustedDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedDatetime = cci("ADJUSTED_DATETIME", "ADJUSTED_DATETIME", null, null, java.time.LocalDateTime.class, "adjustedDatetime", null, false, false, false, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedTime = cci("ADJUSTED_TIME", "ADJUSTED_TIME", null, null, java.time.LocalTime.class, "adjustedTime", null, false, false, false, "TIME", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedInteger = cci("ADJUSTED_INTEGER", "ADJUSTED_INTEGER", null, null, Integer.class, "adjustedInteger", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedPlainLong = cci("ADJUSTED_PLAIN_LONG", "ADJUSTED_PLAIN_LONG", null, null, Long.class, "adjustedPlainLong", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAdjustedStringLong = cci("ADJUSTED_STRING_LONG", "ADJUSTED_STRING_LONG", null, null, String.class, "adjustedStringLong", null, false, false, false, "VARCHAR", 32, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, "特に何かのIDとかじゃなくSNAPSHOT的に人を特定できる情報を雑多に", null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, true, null, "眠いときは眠いと言おう。", null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, true, null, null, null, null, null, false);

    /**
     * DATE_ADJUSTMENT_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateAdjustmentId() { return _columnDateAdjustmentId; }
    /**
     * (adjusted)ADJUSTED_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedDate() { return _columnAdjustedDate; }
    /**
     * ADJUSTED_DATETIME: {TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedDatetime() { return _columnAdjustedDatetime; }
    /**
     * ADJUSTED_TIME: {TIME(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedTime() { return _columnAdjustedTime; }
    /**
     * ADJUSTED_INTEGER: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedInteger() { return _columnAdjustedInteger; }
    /**
     * ADJUSTED_PLAIN_LONG: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedPlainLong() { return _columnAdjustedPlainLong; }
    /**
     * ADJUSTED_STRING_LONG: {VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAdjustedStringLong() { return _columnAdjustedStringLong; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDateAdjustmentId());
        ls.add(columnAdjustedDate());
        ls.add(columnAdjustedDatetime());
        ls.add(columnAdjustedTime());
        ls.add(columnAdjustedInteger());
        ls.add(columnAdjustedPlainLong());
        ls.add(columnAdjustedStringLong());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDateAdjustmentId()); }
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
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteLoadingDateAdjustment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteLoadingDateAdjustmentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteLoadingDateAdjustmentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteLoadingDateAdjustment> getEntityType() { return WhiteLoadingDateAdjustment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteLoadingDateAdjustment newEntity() { return new WhiteLoadingDateAdjustment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteLoadingDateAdjustment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteLoadingDateAdjustment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
