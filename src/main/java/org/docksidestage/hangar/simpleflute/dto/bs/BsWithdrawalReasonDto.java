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

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.HangarCDef;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of (退会理由)WITHDRAWAL_REASON as TABLE. <br>
 * 会員に選ばせる定型的な退会理由のマスタ。そういえば、これ表示順カラムがないですねぇ...
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWithdrawalReasonDto implements Serializable {

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
    /** (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} */
    @JsonKey
    protected String _withdrawalReasonCode;

    /** (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} */
    @JsonKey
    protected String _withdrawalReasonText;

    /** DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
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
    public BsWithdrawalReasonDto() {
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
     * Set the value of withdrawalReasonCode as the classification of WithdrawalReason. <br>
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setWithdrawalReasonCodeAsWithdrawalReason(HangarCDef.WithdrawalReason cdef) {
        setWithdrawalReasonCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br>
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public HangarCDef.WithdrawalReason getWithdrawalReasonCodeAsWithdrawalReason() {
        return HangarCDef.WithdrawalReason.codeOf(getWithdrawalReasonCode());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of withdrawalReasonCode as Sit. <br>
     * SIT: サイトが使いにくいから
     */
    public void setWithdrawalReasonCode_Sit() {
        setWithdrawalReasonCodeAsWithdrawalReason(HangarCDef.WithdrawalReason.Sit);
    }

    /**
     * Set the value of withdrawalReasonCode as Prd. <br>
     * PRD: 商品に魅力がないから
     */
    public void setWithdrawalReasonCode_Prd() {
        setWithdrawalReasonCodeAsWithdrawalReason(HangarCDef.WithdrawalReason.Prd);
    }

    /**
     * Set the value of withdrawalReasonCode as Frt. <br>
     * FRT: フリテンだから
     */
    public void setWithdrawalReasonCode_Frt() {
        setWithdrawalReasonCodeAsWithdrawalReason(HangarCDef.WithdrawalReason.Frt);
    }

    /**
     * Set the value of withdrawalReasonCode as Oth. <br>
     * OTH: その他理由
     */
    public void setWithdrawalReasonCode_Oth() {
        setWithdrawalReasonCodeAsWithdrawalReason(HangarCDef.WithdrawalReason.Oth);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode 'Sit'? <br>
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeSit() {
        HangarCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(HangarCDef.WithdrawalReason.Sit) : false;
    }

    /**
     * Is the value of withdrawalReasonCode 'Prd'? <br>
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodePrd() {
        HangarCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(HangarCDef.WithdrawalReason.Prd) : false;
    }

    /**
     * Is the value of withdrawalReasonCode 'Frt'? <br>
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeFrt() {
        HangarCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(HangarCDef.WithdrawalReason.Frt) : false;
    }

    /**
     * Is the value of withdrawalReasonCode 'Oth'? <br>
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isWithdrawalReasonCodeOth() {
        HangarCDef.WithdrawalReason cdef = getWithdrawalReasonCodeAsWithdrawalReason();
        return cdef != null ? cdef.equals(HangarCDef.WithdrawalReason.Oth) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MemberWithdrawalDto> _memberWithdrawalList;

    public List<MemberWithdrawalDto> getMemberWithdrawalList() {
        if (_memberWithdrawalList == null) { _memberWithdrawalList = new ArrayList<MemberWithdrawalDto>(); }
        return _memberWithdrawalList;
    }

    public void setMemberWithdrawalList(List<MemberWithdrawalDto> memberWithdrawalList) {
        this._memberWithdrawalList = memberWithdrawalList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWithdrawalReasonDto)) { return false; }
        final BsWithdrawalReasonDto otherEntity = (BsWithdrawalReasonDto)other;
        if (!helpComparingValue(getWithdrawalReasonCode(), otherEntity.getWithdrawalReasonCode())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WITHDRAWAL_REASON");
        result = xCH(result, getWithdrawalReasonCode());
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
        sb.append(c).append(getWithdrawalReasonCode());
        sb.append(c).append(getWithdrawalReasonText());
        sb.append(c).append(getDisplayOrder());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br>
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed)
     */
    public String getWithdrawalReasonCode() {
        return _withdrawalReasonCode;
    }

    /**
     * [set] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br>
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.add("withdrawalReasonCode");
        this._withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} <br>
     * 退会理由の内容。<br>
     * テキスト形式なので目いっぱい書けるが、そうするとUI側できれいに見せるのが大変でしょうね。
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed)
     */
    public String getWithdrawalReasonText() {
        return _withdrawalReasonText;
    }

    /**
     * [set] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} <br>
     * 退会理由の内容。<br>
     * テキスト形式なので目いっぱい書けるが、そうするとUI側できれいに見せるのが大変でしょうね。
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed)
     */
    public void setWithdrawalReasonText(String withdrawalReasonText) {
        __modifiedProperties.add("withdrawalReasonText");
        this._withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br>
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.add("displayOrder");
        this._displayOrder = displayOrder;
    }

}
