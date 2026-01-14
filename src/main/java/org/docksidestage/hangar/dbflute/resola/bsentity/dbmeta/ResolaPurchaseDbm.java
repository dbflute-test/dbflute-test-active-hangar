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
package org.docksidestage.hangar.dbflute.resola.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.resola.allcommon.*;
import org.docksidestage.hangar.dbflute.resola.exentity.*;

/**
 * The DB meta of PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ResolaPurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ResolaPurchaseDbm _instance = new ResolaPurchaseDbm();
    private ResolaPurchaseDbm() {}
    public static ResolaPurchaseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return ResolaDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return ResolaDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return ResolaDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return ResolaDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getPurchaseId(), (et, vl) -> ((ResolaPurchase)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getMemberId(), (et, vl) -> ((ResolaPurchase)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getProductId(), (et, vl) -> ((ResolaPurchase)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getPurchaseDatetime(), (et, vl) -> ((ResolaPurchase)et).setPurchaseDatetime(ctldt(vl)), "purchaseDatetime");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getPurchaseCount(), (et, vl) -> ((ResolaPurchase)et).setPurchaseCount(cti(vl)), "purchaseCount");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getPurchasePrice(), (et, vl) -> ((ResolaPurchase)et).setPurchasePrice(cti(vl)), "purchasePrice");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getPaymentCompleteFlg(), (et, vl) -> ((ResolaPurchase)et).setPaymentCompleteFlg(cti(vl)), "paymentCompleteFlg");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getRegisterDatetime(), (et, vl) -> ((ResolaPurchase)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getRegisterUser(), (et, vl) -> ((ResolaPurchase)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getUpdateDatetime(), (et, vl) -> ((ResolaPurchase)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getUpdateUser(), (et, vl) -> ((ResolaPurchase)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((ResolaPurchase)et).getVersionNo(), (et, vl) -> ((ResolaPurchase)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((ResolaPurchase)et).getMember(), (et, vl) -> ((ResolaPurchase)et).setMember((OptionalEntity<ResolaMember>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PURCHASE";
    protected final String _tableDispName = "PURCHASE";
    protected final String _tablePropertyName = "purchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(ResolaDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchaseId = cci("PURCHASE_ID", "PURCHASE_ID", null, null, Long.class, "purchaseId", null, true, true, true, "BIGINT", 19, 0, null, "NEXT VALUE FOR \"PUBLIC\".\"SYSTEM_SEQUENCE_C04E0288_D6AB_4742_8927_3DCD2FB5BB97\"", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Integer.class, "productId", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseDatetime = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, null, java.time.LocalDateTime.class, "purchaseDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseCount = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, null, Integer.class, "purchaseCount", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchasePrice = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, null, Integer.class, "purchasePrice", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPaymentCompleteFlg = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, null, Integer.class, "paymentCompleteFlg", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseDatetime() { return _columnPurchaseDatetime; }
    /**
     * PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseCount() { return _columnPurchaseCount; }
    /**
     * PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePrice() { return _columnPurchasePrice; }
    /**
     * PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentCompleteFlg() { return _columnPaymentCompleteFlg; }
    /**
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
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
    protected UniqueInfo cpui() { return hpcpui(columnPurchaseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), ResolaMemberDbm.getInstance().columnMemberId());
        return cfi("FK_PURCHASE_MEMBER", "member", this, ResolaMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchaseList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.resola.exentity.ResolaPurchase"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.resola.cbean.ResolaPurchaseCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.resola.exbhv.ResolaPurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ResolaPurchase> getEntityType() { return ResolaPurchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ResolaPurchase newEntity() { return new ResolaPurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ResolaPurchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ResolaPurchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
