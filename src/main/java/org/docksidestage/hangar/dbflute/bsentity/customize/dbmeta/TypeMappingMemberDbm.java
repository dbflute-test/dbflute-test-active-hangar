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
package org.docksidestage.hangar.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.exentity.customize.*;

/**
 * The DB meta of TypeMappingMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TypeMappingMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TypeMappingMemberDbm _instance = new TypeMappingMemberDbm();
    private TypeMappingMemberDbm() {}
    public static TypeMappingMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TypeMappingMember)et).getTypeMappingId(), (et, vl) -> ((TypeMappingMember)et).setTypeMappingId(ctl(vl)), "typeMappingId");
        setupEpg(_epgMap, et -> ((TypeMappingMember)et).getTypeMappingName(), (et, vl) -> ((TypeMappingMember)et).setTypeMappingName((String)vl), "typeMappingName");
        setupEpg(_epgMap, et -> ((TypeMappingMember)et).getTypeMappingCount(), (et, vl) -> ((TypeMappingMember)et).setTypeMappingCount(cti(vl)), "typeMappingCount");
        setupEpg(_epgMap, et -> ((TypeMappingMember)et).getTypeMappingDate(), (et, vl) -> ((TypeMappingMember)et).setTypeMappingDate(ctld(vl)), "typeMappingDate");
        setupEpg(_epgMap, et -> ((TypeMappingMember)et).getTypeMappingDatetime(), (et, vl) -> ((TypeMappingMember)et).setTypeMappingDatetime(ctldt(vl)), "typeMappingDatetime");
        setupEpg(_epgMap, et -> ((TypeMappingMember)et).getPointMappingDate(), (et, vl) -> ((TypeMappingMember)et).setPointMappingDate(ctld(vl)), "pointMappingDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TypeMappingMember";
    protected final String _tableDispName = "TypeMappingMember";
    protected final String _tablePropertyName = "typeMappingMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("TypeMappingMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTypeMappingId = cci("TYPE_MAPPING_ID", "TYPE_MAPPING_ID", null, null, Long.class, "typeMappingId", null, false, false, false, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeMappingName = cci("TYPE_MAPPING_NAME", "TYPE_MAPPING_NAME", null, null, String.class, "typeMappingName", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeMappingCount = cci("TYPE_MAPPING_COUNT", "TYPE_MAPPING_COUNT", null, null, Integer.class, "typeMappingCount", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeMappingDate = cci("TYPE_MAPPING_DATE", "TYPE_MAPPING_DATE", null, null, java.time.LocalDate.class, "typeMappingDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeMappingDatetime = cci("TYPE_MAPPING_DATETIME", "TYPE_MAPPING_DATETIME", null, null, java.time.LocalDateTime.class, "typeMappingDatetime", null, false, false, false, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointMappingDate = cci("POINT_MAPPING_DATE", "POINT_MAPPING_DATE", null, null, java.time.LocalDate.class, "pointMappingDate", null, false, false, false, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);

    /**
     * TYPE_MAPPING_ID: {DECIMAL(16), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingId() { return _columnTypeMappingId; }
    /**
     * TYPE_MAPPING_NAME: {VARCHAR(200), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingName() { return _columnTypeMappingName; }
    /**
     * TYPE_MAPPING_COUNT: {INTEGER(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_COUNT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingCount() { return _columnTypeMappingCount; }
    /**
     * TYPE_MAPPING_DATE: {DATE(10), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingDate() { return _columnTypeMappingDate; }
    /**
     * TYPE_MAPPING_DATETIME: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.TYPE_MAPPING_DATETIME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingDatetime() { return _columnTypeMappingDatetime; }
    /**
     * POINT_MAPPING_DATE: {TIMESTAMP(26, 6), refers to WHITE_TYPE_MAPPING.POINT_MAPPING_DATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointMappingDate() { return _columnPointMappingDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTypeMappingId());
        ls.add(columnTypeMappingName());
        ls.add(columnTypeMappingCount());
        ls.add(columnTypeMappingDate());
        ls.add(columnTypeMappingDatetime());
        ls.add(columnPointMappingDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.customize.TypeMappingMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TypeMappingMember> getEntityType() { return TypeMappingMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TypeMappingMember newEntity() { return new TypeMappingMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TypeMappingMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TypeMappingMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
