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
 * The DB meta of WHITE_BASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBaseDbm _instance = new WhiteBaseDbm();
    private WhiteBaseDbm() {}
    public static WhiteBaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteBase)et).getBaseId(), (et, vl) -> ((WhiteBase)et).setBaseId(cti(vl)), "baseId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getBaseName(), (et, vl) -> ((WhiteBase)et).setBaseName((String)vl), "baseName");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getSeaId(), (et, vl) -> ((WhiteBase)et).setSeaId(cti(vl)), "seaId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getLandId(), (et, vl) -> ((WhiteBase)et).setLandId(cti(vl)), "landId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getPiariId(), (et, vl) -> ((WhiteBase)et).setPiariId(cti(vl)), "piariId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getBonvoId(), (et, vl) -> ((WhiteBase)et).setBonvoId(cti(vl)), "bonvoId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getDstoreId(), (et, vl) -> ((WhiteBase)et).setDstoreId(cti(vl)), "dstoreId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getAmbaId(), (et, vl) -> ((WhiteBase)et).setAmbaId(cti(vl)), "ambaId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getMiracoId(), (et, vl) -> ((WhiteBase)et).setMiracoId(cti(vl)), "miracoId");
        setupEpg(_epgMap, et -> ((WhiteBase)et).getDohotelId(), (et, vl) -> ((WhiteBase)et).setDohotelId(cti(vl)), "dohotelId");
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
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne06Amba(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne06Amba((OptionalEntity<WhiteBaseOne06Amba>)vl), "whiteBaseOne06Amba");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne04Bonvo(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne04Bonvo((OptionalEntity<WhiteBaseOne04Bonvo>)vl), "whiteBaseOne04Bonvo");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne05Dstore(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne05Dstore((OptionalEntity<WhiteBaseOne05Dstore>)vl), "whiteBaseOne05Dstore");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne02Land(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne02Land((OptionalEntity<WhiteBaseOne02Land>)vl), "whiteBaseOne02Land");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne07Miraco(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne07Miraco((OptionalEntity<WhiteBaseOne07Miraco>)vl), "whiteBaseOne07Miraco");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne03Piari(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne03Piari((OptionalEntity<WhiteBaseOne03Piari>)vl), "whiteBaseOne03Piari");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne01Sea(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne01Sea((OptionalEntity<WhiteBaseOne01Sea>)vl), "whiteBaseOne01Sea");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne08Dohotel(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne08Dohotel((OptionalEntity<WhiteBaseOne08Dohotel>)vl), "whiteBaseOne08Dohotel");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne09PalmAsOne(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne09PalmAsOne((OptionalEntity<WhiteBaseOne09Palm>)vl), "whiteBaseOne09PalmAsOne");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne10CelebAsOne(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne10CelebAsOne((OptionalEntity<WhiteBaseOne10Celeb>)vl), "whiteBaseOne10CelebAsOne");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne11CirqueAsOne(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne11CirqueAsOne((OptionalEntity<WhiteBaseOne11Cirque>)vl), "whiteBaseOne11CirqueAsOne");
        setupEfpg(_efpgMap, et -> ((WhiteBase)et).getWhiteBaseOne12AmphiAsOne(), (et, vl) -> ((WhiteBase)et).setWhiteBaseOne12AmphiAsOne((OptionalEntity<WhiteBaseOne12Amphi>)vl), "whiteBaseOne12AmphiAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_BASE";
    protected final String _tableDispName = "WHITE_BASE";
    protected final String _tablePropertyName = "whiteBase";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_BASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Integer.class, "baseId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, "", null, false);
    protected final ColumnInfo _columnBaseName = cci("BASE_NAME", "BASE_NAME", null, null, String.class, "baseName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeaId = cci("SEA_ID", "SEA_ID", null, null, Integer.class, "seaId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne01Sea", null, null, false);
    protected final ColumnInfo _columnLandId = cci("LAND_ID", "LAND_ID", null, null, Integer.class, "landId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne02Land", null, null, false);
    protected final ColumnInfo _columnPiariId = cci("PIARI_ID", "PIARI_ID", null, null, Integer.class, "piariId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne03Piari", null, null, false);
    protected final ColumnInfo _columnBonvoId = cci("BONVO_ID", "BONVO_ID", null, null, Integer.class, "bonvoId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne04Bonvo", null, null, false);
    protected final ColumnInfo _columnDstoreId = cci("DSTORE_ID", "DSTORE_ID", null, null, Integer.class, "dstoreId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne05Dstore", null, null, false);
    protected final ColumnInfo _columnAmbaId = cci("AMBA_ID", "AMBA_ID", null, null, Integer.class, "ambaId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne06Amba", null, null, false);
    protected final ColumnInfo _columnMiracoId = cci("MIRACO_ID", "MIRACO_ID", null, null, Integer.class, "miracoId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne07Miraco", null, null, false);
    protected final ColumnInfo _columnDohotelId = cci("DOHOTEL_ID", "DOHOTEL_ID", null, null, Integer.class, "dohotelId", null, false, false, false, "INTEGER", 10, 0, null, null, false, null, null, "whiteBaseOne08Dohotel", null, null, false);

    /**
     * BASE_ID: {PK, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }
    /**
     * BASE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseName() { return _columnBaseName; }
    /**
     * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeaId() { return _columnSeaId; }
    /**
     * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLandId() { return _columnLandId; }
    /**
     * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPiariId() { return _columnPiariId; }
    /**
     * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBonvoId() { return _columnBonvoId; }
    /**
     * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDstoreId() { return _columnDstoreId; }
    /**
     * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmbaId() { return _columnAmbaId; }
    /**
     * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMiracoId() { return _columnMiracoId; }
    /**
     * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDohotelId() { return _columnDohotelId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBaseId());
        ls.add(columnBaseName());
        ls.add(columnSeaId());
        ls.add(columnLandId());
        ls.add(columnPiariId());
        ls.add(columnBonvoId());
        ls.add(columnDstoreId());
        ls.add(columnAmbaId());
        ls.add(columnMiracoId());
        ls.add(columnDohotelId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBaseId()); }
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
     * WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne06Amba() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAmbaId(), WhiteBaseOne06AmbaDbm.getInstance().columnAmbaId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE06_AMBA", "whiteBaseOne06Amba", this, WhiteBaseOne06AmbaDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne04Bonvo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBonvoId(), WhiteBaseOne04BonvoDbm.getInstance().columnBonvoId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE04_BONVO", "whiteBaseOne04Bonvo", this, WhiteBaseOne04BonvoDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne05Dstore() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDstoreId(), WhiteBaseOne05DstoreDbm.getInstance().columnDstoreId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE05_DSTORE", "whiteBaseOne05Dstore", this, WhiteBaseOne05DstoreDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne02Land() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLandId(), WhiteBaseOne02LandDbm.getInstance().columnLandId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE02_LAND", "whiteBaseOne02Land", this, WhiteBaseOne02LandDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne07Miraco() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMiracoId(), WhiteBaseOne07MiracoDbm.getInstance().columnMiracoId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE07_MIRACO", "whiteBaseOne07Miraco", this, WhiteBaseOne07MiracoDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne03Piari() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPiariId(), WhiteBaseOne03PiariDbm.getInstance().columnPiariId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE03_PIARI", "whiteBaseOne03Piari", this, WhiteBaseOne03PiariDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne01Sea() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSeaId(), WhiteBaseOne01SeaDbm.getInstance().columnSeaId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE01_SEA", "whiteBaseOne01Sea", this, WhiteBaseOne01SeaDbm.getInstance(), mp, 6, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne08Dohotel() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDohotelId(), WhiteBaseOne08DohotelDbm.getInstance().columnDohotelId());
        return cfi("FK_WHITE_BASE_WHITE_BASE_ONE08_DOHOTEL", "whiteBaseOne08Dohotel", this, WhiteBaseOne08DohotelDbm.getInstance(), mp, 7, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "whiteBaseList", false);
    }
    /**
     * WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne09PalmAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteBaseOne09PalmDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_BASE_ONE09_PALM_WHITE_BASE", "whiteBaseOne09PalmAsOne", this, WhiteBaseOne09PalmDbm.getInstance(), mp, 8, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "whiteBase", false);
    }
    /**
     * WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne10CelebAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteBaseOne10CelebDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_BASE_ONE10_CELEB_WHITE_BASE", "whiteBaseOne10CelebAsOne", this, WhiteBaseOne10CelebDbm.getInstance(), mp, 9, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "whiteBase", false);
    }
    /**
     * WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne11CirqueAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteBaseOne11CirqueDbm.getInstance().columnCirqueId());
        return cfi("FK_WHITE_BASE_ONE11_CIRQUE_WHITE_BASE", "whiteBaseOne11CirqueAsOne", this, WhiteBaseOne11CirqueDbm.getInstance(), mp, 10, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "whiteBase", false);
    }
    /**
     * WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteBaseOne12AmphiAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBaseId(), WhiteBaseOne12AmphiDbm.getInstance().columnBaseId());
        return cfi("FK_WHITE_BASE_ONE12_AMPHI_WHITE_BASE", "whiteBaseOne12AmphiAsOne", this, WhiteBaseOne12AmphiDbm.getInstance(), mp, 11, org.dbflute.optional.OptionalEntity.class, true, false, true, true, null, null, false, "whiteBase", false);
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteBase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteBaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteBaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBase> getEntityType() { return WhiteBase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteBase newEntity() { return new WhiteBase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteBase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteBase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
