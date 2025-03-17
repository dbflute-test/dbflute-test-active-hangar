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
 * The DB meta of MEMBER_SECURITY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ResolaMemberSecurityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ResolaMemberSecurityDbm _instance = new ResolaMemberSecurityDbm();
    private ResolaMemberSecurityDbm() {}
    public static ResolaMemberSecurityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getMemberId(), (et, vl) -> ((ResolaMemberSecurity)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getLoginPassword(), (et, vl) -> ((ResolaMemberSecurity)et).setLoginPassword((String)vl), "loginPassword");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getReminderQuestion(), (et, vl) -> ((ResolaMemberSecurity)et).setReminderQuestion((String)vl), "reminderQuestion");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getReminderAnswer(), (et, vl) -> ((ResolaMemberSecurity)et).setReminderAnswer((String)vl), "reminderAnswer");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getReminderUseCount(), (et, vl) -> ((ResolaMemberSecurity)et).setReminderUseCount(cti(vl)), "reminderUseCount");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getRegisterDatetime(), (et, vl) -> ((ResolaMemberSecurity)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getRegisterUser(), (et, vl) -> ((ResolaMemberSecurity)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getUpdateDatetime(), (et, vl) -> ((ResolaMemberSecurity)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getUpdateUser(), (et, vl) -> ((ResolaMemberSecurity)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((ResolaMemberSecurity)et).getVersionNo(), (et, vl) -> ((ResolaMemberSecurity)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((ResolaMemberSecurity)et).getMember(), (et, vl) -> ((ResolaMemberSecurity)et).setMember((OptionalEntity<ResolaMember>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_SECURITY";
    protected final String _tableDispName = "MEMBER_SECURITY";
    protected final String _tablePropertyName = "memberSecurity";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_SECURITY", _tableDbName);
    { _tableSqlName.xacceptFilter(ResolaDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, Integer.class, "memberId", null, true, false, true, "INTEGER", 10, 0, null, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnLoginPassword = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, null, String.class, "loginPassword", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderQuestion = cci("REMINDER_QUESTION", "REMINDER_QUESTION", null, null, String.class, "reminderQuestion", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderAnswer = cci("REMINDER_ANSWER", "REMINDER_ANSWER", null, null, String.class, "reminderAnswer", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReminderUseCount = cci("REMINDER_USE_COUNT", "REMINDER_USE_COUNT", null, null, Integer.class, "reminderUseCount", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * LOGIN_PASSWORD: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginPassword() { return _columnLoginPassword; }
    /**
     * REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderQuestion() { return _columnReminderQuestion; }
    /**
     * REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderAnswer() { return _columnReminderAnswer; }
    /**
     * REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderUseCount() { return _columnReminderUseCount; }
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
        ls.add(columnMemberId());
        ls.add(columnLoginPassword());
        ls.add(columnReminderQuestion());
        ls.add(columnReminderAnswer());
        ls.add(columnReminderUseCount());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
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
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), ResolaMemberDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "member", this, ResolaMemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberSecurityAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.resola.exentity.ResolaMemberSecurity"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.resola.cbean.ResolaMemberSecurityCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.resola.exbhv.ResolaMemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ResolaMemberSecurity> getEntityType() { return ResolaMemberSecurity.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ResolaMemberSecurity newEntity() { return new ResolaMemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ResolaMemberSecurity)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ResolaMemberSecurity)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
