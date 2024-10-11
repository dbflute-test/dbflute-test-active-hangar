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
package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of (DBコメント追加的)WHITE_DB_COMMENT_ADDITIONAL as TABLE. <br>
 * まず一行目がこれで...<br>
 * 二行目に改行を入れてみたけど...<br>
 *   三行目は空白二つでインデントしてみた。<br>
 * <br>
 * 五行目の前に空行を開けた (つまり四行目が空行)<br>
 * テーブルコメントのエスケープのテスト...<br>
 * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/<br>
 * o (table)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ <br>
 * o (table)mapStyle, map:\{ sea \= mystic \; land \= oneman \} エスケープされてても大丈夫？ <br>
 * o (table)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？<br>
 * o (table)DBコメントで、ベタッと &lt;span&gt;HTMLタグ&lt;/span&gt; で囲うけど大丈夫？<br>
 * o (table)DBコメントで、ベタッと &amp;lt;HTMLエスケープ表現&amp;gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)<br>
 * o (table)あと、DBコメントは、"JavaDoc" でも使われるし、DBMetaで "文字列リテラル" で使われるけど大丈夫？<br>
 * o (table)なので、@author jflute とか入ってても大丈夫？ あと、改行 "\n" とか、エスケエスケ "\\" とか大丈夫？<br>
 * _/_/_/_/_/_/_/_/_/_/
 * <pre>
 * [primary-key]
 *     DB_COMMENT_ID
 *
 * [column]
 *     DB_COMMENT_ID, DB_COMMENT_NAME, DB_COMMENT_COUNT, DB_COMMENT_DATE, DB_COMMENT_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteDbCommentAdditionalDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _dbCommentId;

    /** (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _dbCommentName;

    /** (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _dbCommentCount;

    /** DB_COMMENT_DATE: {NotNull, DATE(10)} */
    @JsonKey
    protected java.time.LocalDate _dbCommentDate;

    /** DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)} */
    @JsonKey
    protected java.time.LocalDateTime _dbCommentDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDbCommentAdditionalDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteDbCommentAdditionalDto)) { return false; }
        final BsWhiteDbCommentAdditionalDto otherEntity = (BsWhiteDbCommentAdditionalDto)other;
        if (!helpComparingValue(getDbCommentId(), otherEntity.getDbCommentId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DB_COMMENT_ADDITIONAL");
        result = xCH(result, getDbCommentId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getDbCommentId());
        sb.append(c).append(getDbCommentName());
        sb.append(c).append(getDbCommentCount());
        sb.append(c).append(getDbCommentDate());
        sb.append(c).append(getDbCommentDatetime());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DB_COMMENT_ID'. (NullAllowed)
     */
    public Long getDbCommentId() {
        return _dbCommentId;
    }

    /**
     * [set] DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param dbCommentId The value of the column 'DB_COMMENT_ID'. (NullAllowed)
     */
    public void setDbCommentId(Long dbCommentId) {
        __modifiedProperties.add("dbCommentId");
        this._dbCommentId = dbCommentId;
    }

    /**
     * [get] (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} <br>
     * +----------------------+<br>
     * |  java.util.Calendar  |<br>
     * +----------------------+<br>
     * <br>
     *                  +------------------+<br>
     *                  |  java.util.Date  | &lt;&gt;---- long millis<br>
     *                  +------------------+  &lt;-------------------+<br>
     *                           △                               |<br>
     *                           ｜                               |<br>
     *           +------------------------------+                 |<br>
     *           |                              |                 |<br>
     *  +--------------------+        +-------------------+       |<br>
     *  | java.sql.Timestamp |        |   java.sql.Date   |       |<br>
     *  +--------------------+        +-------------------+       |<br>
     *        DB:DATETIME                    DB:DATE  ------------+<br>
     * カラムコメントのエスケープのテスト...<br>
     * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/<br>
     * o (column)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ <br>
     * o (column)mapStyle, map:\{ sea \= mystic \; land \= oneman \} エスケープされてても大丈夫？ <br>
     * o (column)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？<br>
     * o (column)DBコメントで、ベタッと &lt;span&gt;HTMLタグ&lt;/span&gt; で囲うけど大丈夫？<br>
     * o (column)DBコメントで、ベタッと &amp;lt;HTMLエスケープ表現&amp;gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)<br>
     * o (column)あと、DBコメントは、"JavaDoc" でも使われるし、DBMetaで "文字列リテラル" で使われるけど大丈夫？<br>
     * o (column)なので、@author jflute とか入ってても大丈夫？ あと、改行 "\n" とか、エスケエスケ "\\" とか大丈夫？<br>
     * _/_/_/_/_/_/_/_/_/_/
     * @return The value of the column 'DB_COMMENT_NAME'. (NullAllowed)
     */
    public String getDbCommentName() {
        return _dbCommentName;
    }

    /**
     * [set] (DBコメント名)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} <br>
     * +----------------------+<br>
     * |  java.util.Calendar  |<br>
     * +----------------------+<br>
     * <br>
     *                  +------------------+<br>
     *                  |  java.util.Date  | &lt;&gt;---- long millis<br>
     *                  +------------------+  &lt;-------------------+<br>
     *                           △                               |<br>
     *                           ｜                               |<br>
     *           +------------------------------+                 |<br>
     *           |                              |                 |<br>
     *  +--------------------+        +-------------------+       |<br>
     *  | java.sql.Timestamp |        |   java.sql.Date   |       |<br>
     *  +--------------------+        +-------------------+       |<br>
     *        DB:DATETIME                    DB:DATE  ------------+<br>
     * カラムコメントのエスケープのテスト...<br>
     * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/<br>
     * o (column)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ <br>
     * o (column)mapStyle, map:\{ sea \= mystic \; land \= oneman \} エスケープされてても大丈夫？ <br>
     * o (column)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？<br>
     * o (column)DBコメントで、ベタッと &lt;span&gt;HTMLタグ&lt;/span&gt; で囲うけど大丈夫？<br>
     * o (column)DBコメントで、ベタッと &amp;lt;HTMLエスケープ表現&amp;gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)<br>
     * o (column)あと、DBコメントは、"JavaDoc" でも使われるし、DBMetaで "文字列リテラル" で使われるけど大丈夫？<br>
     * o (column)なので、@author jflute とか入ってても大丈夫？ あと、改行 "\n" とか、エスケエスケ "\\" とか大丈夫？<br>
     * _/_/_/_/_/_/_/_/_/_/
     * @param dbCommentName The value of the column 'DB_COMMENT_NAME'. (NullAllowed)
     */
    public void setDbCommentName(String dbCommentName) {
        __modifiedProperties.add("dbCommentName");
        this._dbCommentName = dbCommentName;
    }

    /**
     * [get] (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)} <br>
     * : いきなりコロンで始まったり : 途中でコロンが入ったり<br>
     * 
     * @return The value of the column 'DB_COMMENT_COUNT'. (NullAllowed)
     */
    public Integer getDbCommentCount() {
        return _dbCommentCount;
    }

    /**
     * [set] (DB:コメント:件数)DB_COMMENT_COUNT: {NotNull, INTEGER(10)} <br>
     * : いきなりコロンで始まったり : 途中でコロンが入ったり<br>
     * 
     * @param dbCommentCount The value of the column 'DB_COMMENT_COUNT'. (NullAllowed)
     */
    public void setDbCommentCount(Integer dbCommentCount) {
        __modifiedProperties.add("dbCommentCount");
        this._dbCommentCount = dbCommentCount;
    }

    /**
     * [get] DB_COMMENT_DATE: {NotNull, DATE(10)} <br>
     * @return The value of the column 'DB_COMMENT_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getDbCommentDate() {
        return _dbCommentDate;
    }

    /**
     * [set] DB_COMMENT_DATE: {NotNull, DATE(10)} <br>
     * @param dbCommentDate The value of the column 'DB_COMMENT_DATE'. (NullAllowed)
     */
    public void setDbCommentDate(java.time.LocalDate dbCommentDate) {
        __modifiedProperties.add("dbCommentDate");
        this._dbCommentDate = dbCommentDate;
    }

    /**
     * [get] DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @return The value of the column 'DB_COMMENT_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getDbCommentDatetime() {
        return _dbCommentDatetime;
    }

    /**
     * [set] DB_COMMENT_DATETIME: {NotNull, TIMESTAMP(26, 6)} <br>
     * @param dbCommentDatetime The value of the column 'DB_COMMENT_DATETIME'. (NullAllowed)
     */
    public void setDbCommentDatetime(java.time.LocalDateTime dbCommentDatetime) {
        __modifiedProperties.add("dbCommentDatetime");
        this._dbCommentDatetime = dbCommentDatetime;
    }

}
