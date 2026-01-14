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
 * The DB meta of WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOptimisticLockExceptVersionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteOptimisticLockExceptVersionDbm _instance = new WhiteOptimisticLockExceptVersionDbm();
    private WhiteOptimisticLockExceptVersionDbm() {}
    public static WhiteOptimisticLockExceptVersionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteOptimisticLockExceptVersion)et).getExceptVersionId(), (et, vl) -> ((WhiteOptimisticLockExceptVersion)et).setExceptVersionId(ctl(vl)), "exceptVersionId");
        setupEpg(_epgMap, et -> ((WhiteOptimisticLockExceptVersion)et).getExceptVersionName(), (et, vl) -> ((WhiteOptimisticLockExceptVersion)et).setExceptVersionName((String)vl), "exceptVersionName");
        setupEpg(_epgMap, et -> ((WhiteOptimisticLockExceptVersion)et).getVersionNo(), (et, vl) -> ((WhiteOptimisticLockExceptVersion)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION";
    protected final String _tableDispName = "WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION";
    protected final String _tablePropertyName = "whiteOptimisticLockExceptVersion";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_OPTIMISTIC_LOCK_EXCEPT_VERSION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnExceptVersionId = cci("EXCEPT_VERSION_ID", "EXCEPT_VERSION_ID", null, null, Long.class, "exceptVersionId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnExceptVersionName = cci("EXCEPT_VERSION_NAME", "EXCEPT_VERSION_NAME", null, null, String.class, "exceptVersionName", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * EXCEPT_VERSION_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptVersionId() { return _columnExceptVersionId; }
    /**
     * EXCEPT_VERSION_NAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExceptVersionName() { return _columnExceptVersionName; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnExceptVersionId());
        ls.add(columnExceptVersionName());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnExceptVersionId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteOptimisticLockExceptVersion"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteOptimisticLockExceptVersionCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteOptimisticLockExceptVersionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteOptimisticLockExceptVersion> getEntityType() { return WhiteOptimisticLockExceptVersion.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteOptimisticLockExceptVersion newEntity() { return new WhiteOptimisticLockExceptVersion(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteOptimisticLockExceptVersion)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteOptimisticLockExceptVersion)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
