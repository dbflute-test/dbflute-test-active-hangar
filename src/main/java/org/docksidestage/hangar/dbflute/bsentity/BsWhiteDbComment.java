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
package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of (DBコメント)WHITE_DB_COMMENT as TABLE. <br>
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
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDbComment extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _dbCommentId;

    /** (DBコメント)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} */
    protected String _dbCommentName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DB_COMMENT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dbCommentId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteDbComment) {
            BsWhiteDbComment other = (BsWhiteDbComment)obj;
            if (!xSV(_dbCommentId, other._dbCommentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dbCommentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dbCommentId));
        sb.append(dm).append(xfND(_dbCommentName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteDbComment clone() {
        return (WhiteDbComment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DB_COMMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDbCommentId() {
        checkSpecifiedProperty("dbCommentId");
        return _dbCommentId;
    }

    /**
     * [set] DB_COMMENT_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param dbCommentId The value of the column 'DB_COMMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDbCommentId(Long dbCommentId) {
        registerModifiedProperty("dbCommentId");
        _dbCommentId = dbCommentId;
    }

    /**
     * [get] (DBコメント)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} <br>
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
     * @return The value of the column 'DB_COMMENT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDbCommentName() {
        checkSpecifiedProperty("dbCommentName");
        return convertEmptyToNull(_dbCommentName);
    }

    /**
     * [set] (DBコメント)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} <br>
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
     * @param dbCommentName The value of the column 'DB_COMMENT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDbCommentName(String dbCommentName) {
        registerModifiedProperty("dbCommentName");
        _dbCommentName = dbCommentName;
    }
}
