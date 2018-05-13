package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of (DBコメント)WHITE_DB_COMMENT as TABLE. <br>
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
 *     DB_COMMENT_ID, DB_COMMENT_NAME
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
public abstract class BsWhiteDbCommentDto implements Serializable {

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

    /** (DBコメント)DB_COMMENT_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _dbCommentName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDbCommentDto() {
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
        if (other == null || !(other instanceof BsWhiteDbCommentDto)) { return false; }
        final BsWhiteDbCommentDto otherEntity = (BsWhiteDbCommentDto)other;
        if (!helpComparingValue(getDbCommentId(), otherEntity.getDbCommentId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_DB_COMMENT");
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
     * @return The value of the column 'DB_COMMENT_NAME'. (NullAllowed)
     */
    public String getDbCommentName() {
        return _dbCommentName;
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
     * @param dbCommentName The value of the column 'DB_COMMENT_NAME'. (NullAllowed)
     */
    public void setDbCommentName(String dbCommentName) {
        __modifiedProperties.add("dbCommentName");
        this._dbCommentName = dbCommentName;
    }

}
