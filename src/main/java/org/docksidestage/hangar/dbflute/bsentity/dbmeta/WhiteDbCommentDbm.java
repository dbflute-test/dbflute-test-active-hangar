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
 * The DB meta of WHITE_DB_COMMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDbCommentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDbCommentDbm _instance = new WhiteDbCommentDbm();
    private WhiteDbCommentDbm() {}
    public static WhiteDbCommentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteDbComment)et).getDbCommentId(), (et, vl) -> ((WhiteDbComment)et).setDbCommentId(ctl(vl)), "dbCommentId");
        setupEpg(_epgMap, et -> ((WhiteDbComment)et).getDbCommentName(), (et, vl) -> ((WhiteDbComment)et).setDbCommentName((String)vl), "dbCommentName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_DB_COMMENT";
    protected final String _tableDispName = "WHITE_DB_COMMENT";
    protected final String _tablePropertyName = "whiteDbComment";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_DB_COMMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "DBコメント";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "テーブルコメントのエスケープのテスト...\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\no (table)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ \no (table)mapStyle, map:\\{ sea \\= mystic \\; land \\= oneman \\} エスケープされてても大丈夫？ \no (table)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？\no (table)DBコメントで、ベタッと <span>HTMLタグ</span> で囲うけど大丈夫？\no (table)DBコメントで、ベタッと &lt;HTMLエスケープ表現&gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)\no (table)あと、DBコメントは、\"JavaDoc\" でも使われるし、DBMetaで \"文字列リテラル\" で使われるけど大丈夫？\no (table)なので、@author jflute とか入ってても大丈夫？ あと、改行 \"\\n\" とか、エスケエスケ \"\\\\\" とか大丈夫？\n_/_/_/_/_/_/_/_/_/_/";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDbCommentId = cci("DB_COMMENT_ID", "DB_COMMENT_ID", null, null, Long.class, "dbCommentId", null, true, false, true, "DECIMAL", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDbCommentName = cci("DB_COMMENT_NAME", "DB_COMMENT_NAME", null, "DBコメント", String.class, "dbCommentName", null, false, false, true, "VARCHAR", 200, 0, null, null, false, null, "カラムコメントのエスケープのテスト...\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\no (column)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ \no (column)mapStyle, map:\\{ sea \\= mystic \\; land \\= oneman \\} エスケープされてても大丈夫？ \no (column)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？\no (column)DBコメントで、ベタッと <span>HTMLタグ</span> で囲うけど大丈夫？\no (column)DBコメントで、ベタッと &lt;HTMLエスケープ表現&gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)\no (column)あと、DBコメントは、\"JavaDoc\" でも使われるし、DBMetaで \"文字列リテラル\" で使われるけど大丈夫？\no (column)なので、@author jflute とか入ってても大丈夫？ あと、改行 \"\\n\" とか、エスケエスケ \"\\\\\" とか大丈夫？\n_/_/_/_/_/_/_/_/_/_/", null, null, null, false);

    /**
     * DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentId() { return _columnDbCommentId; }
    /**
     * (DBコメント)DB_COMMENT_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentName() { return _columnDbCommentName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDbCommentId());
        ls.add(columnDbCommentName());
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
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteDbComment"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteDbCommentCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteDbCommentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDbComment> getEntityType() { return WhiteDbComment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDbComment newEntity() { return new WhiteDbComment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDbComment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDbComment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
