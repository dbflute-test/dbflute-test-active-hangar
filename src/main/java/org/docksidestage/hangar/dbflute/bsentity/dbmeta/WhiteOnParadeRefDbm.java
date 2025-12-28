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
 * The DB meta of WHITE_ON_PARADE_REF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOnParadeRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteOnParadeRefDbm _instance = new WhiteOnParadeRefDbm();
    private WhiteOnParadeRefDbm() {}
    public static WhiteOnParadeRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteOnParadeRef)et).getRefId(), (et, vl) -> ((WhiteOnParadeRef)et).setRefId(ctl(vl)), "refId");
        setupEpg(_epgMap, et -> ((WhiteOnParadeRef)et).getRefName(), (et, vl) -> ((WhiteOnParadeRef)et).setRefName((String)vl), "refName");
        setupEpg(_epgMap, et -> ((WhiteOnParadeRef)et).getNullableFkOnParadeId(), (et, vl) -> ((WhiteOnParadeRef)et).setNullableFkOnParadeId(ctl(vl)), "nullableFkOnParadeId");
        setupEpg(_epgMap, et -> ((WhiteOnParadeRef)et).getNullableFkToManyId(), (et, vl) -> ((WhiteOnParadeRef)et).setNullableFkToManyId(ctl(vl)), "nullableFkToManyId");
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
        setupEfpg(_efpgMap, et -> ((WhiteOnParadeRef)et).getWhiteOnParade(), (et, vl) -> ((WhiteOnParadeRef)et).setWhiteOnParade((OptionalEntity<WhiteOnParade>)vl), "whiteOnParade");
        setupEfpg(_efpgMap, et -> ((WhiteOnParadeRef)et).getWhiteOnParadeNullableToMany(), (et, vl) -> ((WhiteOnParadeRef)et).setWhiteOnParadeNullableToMany((OptionalEntity<WhiteOnParadeNullableToMany>)vl), "whiteOnParadeNullableToMany");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_ON_PARADE_REF";
    protected final String _tableDispName = "WHITE_ON_PARADE_REF";
    protected final String _tablePropertyName = "whiteOnParadeRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_ON_PARADE_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "オンパレードREF or オンパレードれふ";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "shalias:{ オンパレードREF } dfalias:{ オンパレードれふ }";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRefId = cci("REF_ID", "REF_ID", null, null, Long.class, "refId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRefName = cci("REF_NAME", "REF_NAME", null, null, String.class, "refName", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableFkOnParadeId = cci("NULLABLE_FK_ON_PARADE_ID", "NULLABLE_FK_ON_PARADE_ID", null, null, Long.class, "nullableFkOnParadeId", null, false, false, false, "DECIMAL", 16, 0, null, null, false, null, null, "whiteOnParade", null, null, false);
    protected final ColumnInfo _columnNullableFkToManyId = cci("NULLABLE_FK_TO_MANY_ID", "NULLABLE_FK_TO_MANY_ID", null, null, Long.class, "nullableFkToManyId", null, false, false, false, "DECIMAL", 16, 0, null, null, false, null, null, "whiteOnParadeNullableToMany", null, null, false);

    /**
     * REF_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefId() { return _columnRefId; }
    /**
     * REF_NAME: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRefName() { return _columnRefName; }
    /**
     * NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableFkOnParadeId() { return _columnNullableFkOnParadeId; }
    /**
     * NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableFkToManyId() { return _columnNullableFkToManyId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnRefId());
        ls.add(columnRefName());
        ls.add(columnNullableFkOnParadeId());
        ls.add(columnNullableFkToManyId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnRefId()); }
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
     * (オンパレード)WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteOnParade() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNullableFkOnParadeId(), WhiteOnParadeDbm.getInstance().columnOnParadeId());
        return cfi("FK_WHITE_ON_PARADE_REF_ON_PARADE", "whiteOnParade", this, WhiteOnParadeDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteOnParadeRefList", false);
    }
    /**
     * WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteOnParadeNullableToMany() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNullableFkToManyId(), WhiteOnParadeNullableToManyDbm.getInstance().columnManyId());
        return cfi("FK_WHITE_ON_PARADE_REF_MANY_MANY", "whiteOnParadeNullableToMany", this, WhiteOnParadeNullableToManyDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteOnParadeRefList", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteOnParadeRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteOnParadeRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteOnParadeRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteOnParadeRef> getEntityType() { return WhiteOnParadeRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteOnParadeRef newEntity() { return new WhiteOnParadeRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteOnParadeRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteOnParadeRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
