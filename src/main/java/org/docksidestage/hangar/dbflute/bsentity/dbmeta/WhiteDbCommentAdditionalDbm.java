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
 * The DB meta of WHITE_DB_COMMENT_ADDITIONAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDbCommentAdditionalDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDbCommentAdditionalDbm _instance = new WhiteDbCommentAdditionalDbm();
    private WhiteDbCommentAdditionalDbm() {}
    public static WhiteDbCommentAdditionalDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDbCommentAdditional)et).getDbCommentId(), (et, vl) -> ((WhiteDbCommentAdditional)et).setDbCommentId(ctl(vl)), "dbCommentId");
        setupEpg(_epgMap, et -> ((WhiteDbCommentAdditional)et).getDbCommentName(), (et, vl) -> ((WhiteDbCommentAdditional)et).setDbCommentName((String)vl), "dbCommentName");
        setupEpg(_epgMap, et -> ((WhiteDbCommentAdditional)et).getDbCommentCount(), (et, vl) -> ((WhiteDbCommentAdditional)et).setDbCommentCount(cti(vl)), "dbCommentCount");
        setupEpg(_epgMap, et -> ((WhiteDbCommentAdditional)et).getDbCommentDate(), (et, vl) -> ((WhiteDbCommentAdditional)et).setDbCommentDate(ctld(vl)), "dbCommentDate");
        setupEpg(_epgMap, et -> ((WhiteDbCommentAdditional)et).getDbCommentDatetime(), (et, vl) -> ((WhiteDbCommentAdditional)et).setDbCommentDatetime(ctldt(vl)), "dbCommentDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DB_COMMENT_ADDITIONAL";
    protected final String _tableDispName = "WHITE_DB_COMMENT_ADDITIONAL";
    protected final String _tablePropertyName = "whiteDbCommentAdditional";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_DB_COMMENT_ADDITIONAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "DBコメント追加的";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "まず一行目がこれで...\n二行目に改行を入れてみたけど...\n  三行目は空白二つでインデントしてみた。\n\n五行目の前に空行を開けた (つまり四行目が空行)\nテーブルコメントのエスケープのテスト...\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\no (table)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ \no (table)mapStyle, map:\\{ sea \\= mystic \\; land \\= oneman \\} エスケープされてても大丈夫？ \no (table)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？\no (table)DBコメントで、ベタッと <span>HTMLタグ</span> で囲うけど大丈夫？\no (table)DBコメントで、ベタッと &lt;HTMLエスケープ表現&gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)\no (table)あと、DBコメントは、\"JavaDoc\" でも使われるし、DBMetaで \"文字列リテラル\" で使われるけど大丈夫？\no (table)なので、@author jflute とか入ってても大丈夫？ あと、改行 \"\\n\" とか、エスケエスケ \"\\\\\" とか大丈夫？\n_/_/_/_/_/_/_/_/_/_/";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDbCommentId = cci("DB_COMMENT_ID", "DB_COMMENT_ID", null, null, Long.class, "dbCommentId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDbCommentName = cci("DB_COMMENT_NAME", "DB_COMMENT_NAME", null, "DBコメント名", String.class, "dbCommentName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, "+----------------------+\n|  java.util.Calendar  |\n+----------------------+\n\n                 +------------------+\n                 |  java.util.Date  | <>---- long millis\n                 +------------------+  <-------------------+\n                          △                               |\n                          ｜                               |\n          +------------------------------+                 |\n          |                              |                 |\n +--------------------+        +-------------------+       |\n | java.sql.Timestamp |        |   java.sql.Date   |       |\n +--------------------+        +-------------------+       |\n       DB:DATETIME                    DB:DATE  ------------+\nカラムコメントのエスケープのテスト...\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\no (column)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ \no (column)mapStyle, map:\\{ sea \\= mystic \\; land \\= oneman \\} エスケープされてても大丈夫？ \no (column)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？\no (column)DBコメントで、ベタッと <span>HTMLタグ</span> で囲うけど大丈夫？\no (column)DBコメントで、ベタッと &lt;HTMLエスケープ表現&gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)\no (column)あと、DBコメントは、\"JavaDoc\" でも使われるし、DBMetaで \"文字列リテラル\" で使われるけど大丈夫？\no (column)なので、@author jflute とか入ってても大丈夫？ あと、改行 \"\\n\" とか、エスケエスケ \"\\\\\" とか大丈夫？\n_/_/_/_/_/_/_/_/_/_/", null, null, null, false);
    protected final ColumnInfo _columnDbCommentCount = cci("DB_COMMENT_COUNT", "DB_COMMENT_COUNT", null, "DB:コメント:件数", Integer.class, "dbCommentCount", null, false, false, true, "INTEGER", 10, 0, null, null, false, null, ": いきなりコロンで始まったり : 途中でコロンが入ったり\n", null, null, null, false);
    protected final ColumnInfo _columnDbCommentDate = cci("DB_COMMENT_DATE", "DB_COMMENT_DATE", null, null, java.time.LocalDate.class, "dbCommentDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDbCommentDatetime = cci("DB_COMMENT_DATETIME", "DB_COMMENT_DATETIME", null, null, java.time.LocalDateTime.class, "dbCommentDatetime", null, false, false, true, "TIMESTAMP", 26, 6, null, null, false, null, null, null, null, null, false);

    /**
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentId() { return _columnDbCommentId; }
    /**
     * (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentName() { return _columnDbCommentName; }
    /**
     * (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentCount() { return _columnDbCommentCount; }
    /**
     * DB_COMMENT_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentDate() { return _columnDbCommentDate; }
    /**
     * DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentDatetime() { return _columnDbCommentDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDbCommentId());
        ls.add(columnDbCommentName());
        ls.add(columnDbCommentCount());
        ls.add(columnDbCommentDate());
        ls.add(columnDbCommentDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDbCommentId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteDbCommentAdditional"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteDbCommentAdditionalCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteDbCommentAdditionalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDbCommentAdditional> getEntityType() { return WhiteDbCommentAdditional.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDbCommentAdditional newEntity() { return new WhiteDbCommentAdditional(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDbCommentAdditional)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDbCommentAdditional)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
