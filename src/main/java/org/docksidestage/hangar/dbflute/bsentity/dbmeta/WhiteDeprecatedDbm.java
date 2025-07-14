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
 * The DB meta of WHITE_DEPRECATED. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDeprecatedDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDeprecatedDbm _instance = new WhiteDeprecatedDbm();
    private WhiteDeprecatedDbm() {}
    public static WhiteDeprecatedDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDeprecated)et).getDeprecatedId(), (et, vl) -> ((WhiteDeprecated)et).setDeprecatedId(ctl(vl)), "deprecatedId");
        setupEpg(_epgMap, et -> ((WhiteDeprecated)et).getDeprecatedName(), (et, vl) -> ((WhiteDeprecated)et).setDeprecatedName((String)vl), "deprecatedName");
        setupEpg(_epgMap, et -> ((WhiteDeprecated)et).getDeprecatedCode(), (et, vl) -> ((WhiteDeprecated)et).setDeprecatedCode((String)vl), "deprecatedCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DEPRECATED";
    protected final String _tableDispName = "WHITE_DEPRECATED";
    protected final String _tablePropertyName = "whiteDeprecated";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_DEPRECATED", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeprecatedId = cci("DEPRECATED_ID", "DEPRECATED_ID", null, null, Long.class, "deprecatedId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, "whiteDeprecatedRefList", null, false);
    protected final ColumnInfo _columnDeprecatedName = cci("DEPRECATED_NAME", "DEPRECATED_NAME", null, null, String.class, "deprecatedName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeprecatedCode = cci("DEPRECATED_CODE", "DEPRECATED_CODE", null, null, String.class, "deprecatedCode", null, false, false, true, "VARCHAR", 16, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DEPRECATED_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedId() { return _columnDeprecatedId; }
    /**
     * DEPRECATED_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedName() { return _columnDeprecatedName; }
    /**
     * DEPRECATED_CODE: {NotNull, VARCHAR(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedCode() { return _columnDeprecatedCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDeprecatedId());
        ls.add(columnDeprecatedName());
        ls.add(columnDeprecatedCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDeprecatedId()); }
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
    /**
     * WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteDeprecatedRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeprecatedId(), WhiteDeprecatedRefDbm.getInstance().columnDeprecatedId());
        return cri("FK_WHITE_DEPRECATED_REF_WHITE_DEPRECATED", "whiteDeprecatedRefList", this, WhiteDeprecatedRefDbm.getInstance(), mp, false, "whiteDeprecated");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteDeprecated"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteDeprecatedCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteDeprecatedBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDeprecated> getEntityType() { return WhiteDeprecated.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDeprecated newEntity() { return new WhiteDeprecated(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDeprecated)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDeprecated)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
