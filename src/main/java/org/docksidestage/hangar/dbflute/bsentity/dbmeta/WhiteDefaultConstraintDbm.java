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
 * The DB meta of WHITE_DEFAULT_CONSTRAINT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDefaultConstraintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDefaultConstraintDbm _instance = new WhiteDefaultConstraintDbm();
    private WhiteDefaultConstraintDbm() {}
    public static WhiteDefaultConstraintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDefaultConstraint)et).getDefaultId(), (et, vl) -> ((WhiteDefaultConstraint)et).setDefaultId(ctl(vl)), "defaultId");
        setupEpg(_epgMap, et -> ((WhiteDefaultConstraint)et).getDefaultName(), (et, vl) -> ((WhiteDefaultConstraint)et).setDefaultName((String)vl), "defaultName");
        setupEpg(_epgMap, et -> ((WhiteDefaultConstraint)et).getDefaultCount(), (et, vl) -> ((WhiteDefaultConstraint)et).setDefaultCount(cti(vl)), "defaultCount");
        setupEpg(_epgMap, et -> ((WhiteDefaultConstraint)et).getDefaultDate(), (et, vl) -> ((WhiteDefaultConstraint)et).setDefaultDate(ctld(vl)), "defaultDate");
        setupEpg(_epgMap, et -> ((WhiteDefaultConstraint)et).getDefaultJudge(), (et, vl) -> ((WhiteDefaultConstraint)et).setDefaultJudge((Boolean)vl), "defaultJudge");
        setupEpg(_epgMap, et -> ((WhiteDefaultConstraint)et).getDefaultEmptyString(), (et, vl) -> ((WhiteDefaultConstraint)et).setDefaultEmptyString((String)vl), "defaultEmptyString");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DEFAULT_CONSTRAINT";
    protected final String _tableDispName = "WHITE_DEFAULT_CONSTRAINT";
    protected final String _tablePropertyName = "whiteDefaultConstraint";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_DEFAULT_CONSTRAINT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDefaultId = cci("DEFAULT_ID", "DEFAULT_ID", null, null, Long.class, "defaultId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultName = cci("DEFAULT_NAME", "DEFAULT_NAME", null, null, String.class, "defaultName", null, false, false, true, "VARCHAR", 200, 0, null, "sea", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultCount = cci("DEFAULT_COUNT", "DEFAULT_COUNT", null, null, Integer.class, "defaultCount", null, false, false, true, "INTEGER", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultDate = cci("DEFAULT_DATE", "DEFAULT_DATE", null, null, java.time.LocalDate.class, "defaultDate", null, false, false, true, "DATE", 10, 0, null, "2026-01-05", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultJudge = cci("DEFAULT_JUDGE", "DEFAULT_JUDGE", null, null, Boolean.class, "defaultJudge", null, false, false, true, "BOOLEAN", 1, 0, null, "FALSE", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDefaultEmptyString = cci("DEFAULT_EMPTY_STRING", "DEFAULT_EMPTY_STRING", null, null, String.class, "defaultEmptyString", null, false, false, true, "VARCHAR", 200, 0, null, "", false, null, null, null, null, null, false);

    /**
     * DEFAULT_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultId() { return _columnDefaultId; }
    /**
     * DEFAULT_NAME: {NotNull, VARCHAR(200), default=[sea]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultName() { return _columnDefaultName; }
    /**
     * DEFAULT_COUNT: {NotNull, INTEGER(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultCount() { return _columnDefaultCount; }
    /**
     * DEFAULT_DATE: {NotNull, DATE(10), default=[2026-01-05]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultDate() { return _columnDefaultDate; }
    /**
     * DEFAULT_JUDGE: {NotNull, BOOLEAN(1), default=[FALSE]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultJudge() { return _columnDefaultJudge; }
    /**
     * DEFAULT_EMPTY_STRING: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultEmptyString() { return _columnDefaultEmptyString; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDefaultId());
        ls.add(columnDefaultName());
        ls.add(columnDefaultCount());
        ls.add(columnDefaultDate());
        ls.add(columnDefaultJudge());
        ls.add(columnDefaultEmptyString());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDefaultId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteDefaultConstraint"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteDefaultConstraintCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteDefaultConstraintBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDefaultConstraint> getEntityType() { return WhiteDefaultConstraint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDefaultConstraint newEntity() { return new WhiteDefaultConstraint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDefaultConstraint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDefaultConstraint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
