package org.docksidestage.hangar.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The simple DTO of CommonColumnMember. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
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
public abstract class BsCommonColumnMemberDto implements Serializable {

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
    /** (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    @JsonKey
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    @JsonKey
    protected String _memberName;

    /** (登録日時)REGISTER_DATETIME: {TIMESTAMP(26, 6), refers to MEMBER.REGISTER_DATETIME} */
    @JsonKey
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザ)REGISTER_USER: {VARCHAR(200), refers to MEMBER.REGISTER_USER} */
    @JsonKey
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {TIMESTAMP(26, 6), refers to MEMBER.UPDATE_DATETIME} */
    @JsonKey
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {VARCHAR(200), refers to MEMBER.UPDATE_USER} */
    @JsonKey
    protected String _updateUser;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCommonColumnMemberDto() {
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
        if (other == null || !(other instanceof BsCommonColumnMemberDto)) { return false; }
        final BsCommonColumnMemberDto otherEntity = (BsCommonColumnMemberDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!helpComparingValue(getMemberName(), otherEntity.getMemberName())) { return false; }
        if (!helpComparingValue(getRegisterDatetime(), otherEntity.getRegisterDatetime())) { return false; }
        if (!helpComparingValue(getRegisterUser(), otherEntity.getRegisterUser())) { return false; }
        if (!helpComparingValue(getUpdateDatetime(), otherEntity.getUpdateDatetime())) { return false; }
        if (!helpComparingValue(getUpdateUser(), otherEntity.getUpdateUser())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "CommonColumnMember");
        result = xCH(result, getMemberId());
        result = xCH(result, getMemberName());
        result = xCH(result, getRegisterDatetime());
        result = xCH(result, getRegisterUser());
        result = xCH(result, getUpdateDatetime());
        result = xCH(result, getUpdateUser());
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
        sb.append(c).append(getMemberId());
        sb.append(c).append(getMemberName());
        sb.append(c).append(getRegisterDatetime());
        sb.append(c).append(getRegisterUser());
        sb.append(c).append(getUpdateDatetime());
        sb.append(c).append(getUpdateUser());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.add("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {TIMESTAMP(26, 6), refers to MEMBER.REGISTER_DATETIME} <br>
     * レコードが登録された日時。<br>
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。といいつつ、このテーブルには会員登録日時がない...<br>
     * 仕様はどのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {TIMESTAMP(26, 6), refers to MEMBER.REGISTER_DATETIME} <br>
     * レコードが登録された日時。<br>
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。といいつつ、このテーブルには会員登録日時がない...<br>
     * 仕様はどのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        __modifiedProperties.add("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {VARCHAR(200), refers to MEMBER.REGISTER_USER} <br>
     * レコードを登録したユーザ。<br>
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {VARCHAR(200), refers to MEMBER.REGISTER_USER} <br>
     * レコードを登録したユーザ。<br>
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.add("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {TIMESTAMP(26, 6), refers to MEMBER.UPDATE_DATETIME} <br>
     * レコードが（最後に）更新された日時。<br>
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {TIMESTAMP(26, 6), refers to MEMBER.UPDATE_DATETIME} <br>
     * レコードが（最後に）更新された日時。<br>
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        __modifiedProperties.add("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {VARCHAR(200), refers to MEMBER.UPDATE_USER} <br>
     * レコードを更新したユーザ。<br>
     * システムは誰が何をしたのかちゃんと覚えているのさ。
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {VARCHAR(200), refers to MEMBER.UPDATE_USER} <br>
     * レコードを更新したユーザ。<br>
     * システムは誰が何をしたのかちゃんと覚えているのさ。
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.add("updateUser");
        this._updateUser = updateUser;
    }

}
