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
 * The DB meta of WHITE_OPTIMISTIC_LOCK_BY_DATE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOptimisticLockByDateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteOptimisticLockByDateDbm _instance = new WhiteOptimisticLockByDateDbm();
    private WhiteOptimisticLockByDateDbm() {}
    public static WhiteOptimisticLockByDateDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteOptimisticLockByDate)et).getByDateId(), (et, vl) -> ((WhiteOptimisticLockByDate)et).setByDateId(ctl(vl)), "byDateId");
        setupEpg(_epgMap, et -> ((WhiteOptimisticLockByDate)et).getByDateName(), (et, vl) -> ((WhiteOptimisticLockByDate)et).setByDateName((String)vl), "byDateName");
        setupEpg(_epgMap, et -> ((WhiteOptimisticLockByDate)et).getUpdateDate(), (et, vl) -> ((WhiteOptimisticLockByDate)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_OPTIMISTIC_LOCK_BY_DATE";
    protected final String _tableDispName = "WHITE_OPTIMISTIC_LOCK_BY_DATE";
    protected final String _tablePropertyName = "whiteOptimisticLockByDate";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_OPTIMISTIC_LOCK_BY_DATE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnByDateId = cci("BY_DATE_ID", "BY_DATE_ID", null, null, Long.class, "byDateId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnByDateName = cci("BY_DATE_NAME", "BY_DATE_NAME", null, null, String.class, "byDateName", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("UPDATE_DATE", "UPDATE_DATE", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, OptimisticLockType.UPDATE_DATE, null, null, null, null, false);

    /**
     * BY_DATE_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnByDateId() { return _columnByDateId; }
    /**
     * BY_DATE_NAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnByDateName() { return _columnByDateName; }
    /**
     * UPDATE_DATE: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDate() { return _columnUpdateDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnByDateId());
        ls.add(columnByDateName());
        ls.add(columnUpdateDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnByDateId()); }
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
    public boolean hasUpdateDate() { return true; }
    public ColumnInfo getUpdateDateColumnInfo() { return _columnUpdateDate; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteOptimisticLockByDate"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteOptimisticLockByDateCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteOptimisticLockByDateBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteOptimisticLockByDate> getEntityType() { return WhiteOptimisticLockByDate.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteOptimisticLockByDate newEntity() { return new WhiteOptimisticLockByDate(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteOptimisticLockByDate)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteOptimisticLockByDate)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
