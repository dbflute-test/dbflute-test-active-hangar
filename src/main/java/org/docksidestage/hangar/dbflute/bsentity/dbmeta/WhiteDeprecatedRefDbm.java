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
 * The DB meta of WHITE_DEPRECATED_REF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDeprecatedRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDeprecatedRefDbm _instance = new WhiteDeprecatedRefDbm();
    private WhiteDeprecatedRefDbm() {}
    public static WhiteDeprecatedRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDeprecatedRef)et).getDeprecatedRefId(), (et, vl) -> ((WhiteDeprecatedRef)et).setDeprecatedRefId(ctl(vl)), "deprecatedRefId");
        setupEpg(_epgMap, et -> ((WhiteDeprecatedRef)et).getDeprecatedId(), (et, vl) -> ((WhiteDeprecatedRef)et).setDeprecatedId(ctl(vl)), "deprecatedId");
        setupEpg(_epgMap, et -> ((WhiteDeprecatedRef)et).getDeprecatedRefName(), (et, vl) -> ((WhiteDeprecatedRef)et).setDeprecatedRefName((String)vl), "deprecatedRefName");
        setupEpg(_epgMap, et -> ((WhiteDeprecatedRef)et).getDeprecatedRefCode(), (et, vl) -> ((WhiteDeprecatedRef)et).setDeprecatedRefCode((String)vl), "deprecatedRefCode");
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
        setupEfpg(_efpgMap, et -> ((WhiteDeprecatedRef)et).getWhiteDeprecated(), (et, vl) -> ((WhiteDeprecatedRef)et).setWhiteDeprecated((OptionalEntity<WhiteDeprecated>)vl), "whiteDeprecated");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DEPRECATED_REF";
    protected final String _tableDispName = "WHITE_DEPRECATED_REF";
    protected final String _tablePropertyName = "whiteDeprecatedRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_DEPRECATED_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeprecatedRefId = cci("DEPRECATED_REF_ID", "DEPRECATED_REF_ID", null, null, Long.class, "deprecatedRefId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeprecatedId = cci("DEPRECATED_ID", "DEPRECATED_ID", null, null, Long.class, "deprecatedId", null, false, false, true, "DECIMAL", 16, 0, null, null, false, null, null, "whiteDeprecated", null, null, false);
    protected final ColumnInfo _columnDeprecatedRefName = cci("DEPRECATED_REF_NAME", "DEPRECATED_REF_NAME", null, null, String.class, "deprecatedRefName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeprecatedRefCode = cci("DEPRECATED_REF_CODE", "DEPRECATED_REF_CODE", null, null, String.class, "deprecatedRefCode", null, false, false, true, "VARCHAR", 16, 0, null, null, false, null, null, null, null, null, false);

    /**
     * DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedRefId() { return _columnDeprecatedRefId; }
    /**
     * DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedId() { return _columnDeprecatedId; }
    /**
     * DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedRefName() { return _columnDeprecatedRefName; }
    /**
     * DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeprecatedRefCode() { return _columnDeprecatedRefCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDeprecatedRefId());
        ls.add(columnDeprecatedId());
        ls.add(columnDeprecatedRefName());
        ls.add(columnDeprecatedRefCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDeprecatedRefId()); }
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
     * WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteDeprecated() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeprecatedId(), WhiteDeprecatedDbm.getInstance().columnDeprecatedId());
        return cfi("FK_WHITE_DEPRECATED_REF_WHITE_DEPRECATED", "whiteDeprecated", this, WhiteDeprecatedDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteDeprecatedRefList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteDeprecatedRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteDeprecatedRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteDeprecatedRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDeprecatedRef> getEntityType() { return WhiteDeprecatedRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDeprecatedRef newEntity() { return new WhiteDeprecatedRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDeprecatedRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDeprecatedRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
