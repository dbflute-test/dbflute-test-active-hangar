package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.AppCDef;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of (会員ステータス)MEMBER_STATUS as TABLE. <br>
 * 会員のステータスを示す固定的なマスタテーブル。いわゆるテーブル区分値！<br>
 * 業務運用上で増えることはなく、増減するときはプログラム修正ともなうレベルの業務変更と考えられる。<br>
 * <br>
 * こういった固定的なマスタテーブルには、更新日時などの共通カラムは定義していないが、業務上そういった情報を管理する必要性が低いという理由に加え、ExampleDBとして共通カラムでER図が埋め尽くされてしまい見づらくなるというところで割り切っている。実業務では統一的に定義することもある。
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMemberStatusDto implements Serializable {

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
    /** (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} */
    @JsonKey
    protected String _memberStatusCode;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} */
    @JsonKey
    protected String _memberStatusName;

    /** (説明)DESCRIPTION: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _description;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _displayOrder;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberStatusDto() {
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return AppCDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized. <br>
     * Formalized: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal. <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional. <br>
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode 'Formalized'? <br>
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode 'Withdrawal'? <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of memberStatusCode 'Provisional'? <br>
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Provisional) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MemberDto> _memberList;

    public List<MemberDto> getMemberList() {
        if (_memberList == null) { _memberList = new ArrayList<MemberDto>(); }
        return _memberList;
    }

    public void setMemberList(List<MemberDto> memberList) {
        this._memberList = memberList;
    }

    protected List<MemberLoginDto> _memberLoginList;

    public List<MemberLoginDto> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = new ArrayList<MemberLoginDto>(); }
        return _memberLoginList;
    }

    public void setMemberLoginList(List<MemberLoginDto> memberLoginList) {
        this._memberLoginList = memberLoginList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberStatusDto)) { return false; }
        final BsMemberStatusDto otherEntity = (BsMemberStatusDto)other;
        if (!helpComparingValue(getMemberStatusCode(), otherEntity.getMemberStatusCode())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "MEMBER_STATUS");
        result = xCH(result, getMemberStatusCode());
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
        sb.append(c).append(getMemberStatusCode());
        sb.append(c).append(getMemberStatusName());
        sb.append(c).append(getDescription());
        sb.append(c).append(getDisplayOrder());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br>
     * 会員ステータスを識別するコード。<br>
     * 固定的なデータなので連番とか番号にはせず、データを直接見たときも人が直感的にわかるように、例えば "FML" とかの３桁のコード形式にしている。(3って何会員だっけ？とかの問答をやりたくないので)
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br>
     * 会員ステータスを識別するコード。<br>
     * 固定的なデータなので連番とか番号にはせず、データを直接見たときも人が直感的にわかるように、例えば "FML" とかの３桁のコード形式にしている。(3って何会員だっけ？とかの問答をやりたくないので)
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.add("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * 表示用の名称。<br>
     * 国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * 表示用の名称。<br>
     * 国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.add("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * 会員ステータスそれぞれの説明。<br>
     * 区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。
     * @return The value of the column 'DESCRIPTION'. (NullAllowed)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * 会員ステータスそれぞれの説明。<br>
     * 区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。
     * @param description The value of the column 'DESCRIPTION'. (NullAllowed)
     */
    public void setDescription(String description) {
        __modifiedProperties.add("description");
        this._description = description;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br>
     * UI上のステータスの表示順を示すNO。<br>
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br>
     * UI上のステータスの表示順を示すNO。<br>
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.add("displayOrder");
        this._displayOrder = displayOrder;
    }

}
