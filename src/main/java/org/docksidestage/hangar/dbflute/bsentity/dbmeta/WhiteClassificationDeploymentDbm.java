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
 * The DB meta of WHITE_CLASSIFICATION_DEPLOYMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteClassificationDeploymentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteClassificationDeploymentDbm _instance = new WhiteClassificationDeploymentDbm();
    private WhiteClassificationDeploymentDbm() {}
    public static WhiteClassificationDeploymentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteClassificationDeployment)et).getDeploymentId(), (et, vl) -> ((WhiteClassificationDeployment)et).setDeploymentId(ctl(vl)), "deploymentId");
        setupEpg(_epgMap, et -> ((WhiteClassificationDeployment)et).getSeaFlg(), (et, vl) -> {
            CDef.Flg cls = (CDef.Flg)gcls(et, columnSeaFlg(), vl);
            if (cls != null) {
                ((WhiteClassificationDeployment)et).setSeaFlgAsFlg(cls);
            } else {
                ((WhiteClassificationDeployment)et).mynativeMappingSeaFlg(ctn(vl, Integer.class));
            }
        }, "seaFlg");
        setupEpg(_epgMap, et -> ((WhiteClassificationDeployment)et).getDeploymentTypeCode(), (et, vl) -> {
            CDef.WhiteClassifiationDeploymentType cls = (CDef.WhiteClassifiationDeploymentType)gcls(et, columnDeploymentTypeCode(), vl);
            if (cls != null) {
                ((WhiteClassificationDeployment)et).setDeploymentTypeCodeAsWhiteClassifiationDeploymentType(cls);
            } else {
                ((WhiteClassificationDeployment)et).mynativeMappingDeploymentTypeCode((String)vl);
            }
        }, "deploymentTypeCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_CLASSIFICATION_DEPLOYMENT";
    protected final String _tableDispName = "WHITE_CLASSIFICATION_DEPLOYMENT";
    protected final String _tablePropertyName = "whiteClassificationDeployment";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_CLASSIFICATION_DEPLOYMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDeploymentId = cci("DEPLOYMENT_ID", "DEPLOYMENT_ID", null, null, Long.class, "deploymentId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSeaFlg = cci("SEA_FLG", "SEA_FLG", null, null, Integer.class, "seaFlg", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnDeploymentTypeCode = cci("DEPLOYMENT_TYPE_CODE", "DEPLOYMENT_TYPE_CODE", null, null, String.class, "deploymentTypeCode", null, false, false, true, "CHAR", 3, 0, null, null, false, null, null, null, null, CDef.DefMeta.WhiteClassifiationDeploymentType, false);

    /**
     * DEPLOYMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeploymentId() { return _columnDeploymentId; }
    /**
     * SEA_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSeaFlg() { return _columnSeaFlg; }
    /**
     * DEPLOYMENT_TYPE_CODE: {NotNull, CHAR(3), classification=WhiteClassifiationDeploymentType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeploymentTypeCode() { return _columnDeploymentTypeCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDeploymentId());
        ls.add(columnSeaFlg());
        ls.add(columnDeploymentTypeCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDeploymentId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteClassificationDeployment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteClassificationDeploymentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteClassificationDeploymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteClassificationDeployment> getEntityType() { return WhiteClassificationDeployment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteClassificationDeployment newEntity() { return new WhiteClassificationDeployment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteClassificationDeployment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteClassificationDeployment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
