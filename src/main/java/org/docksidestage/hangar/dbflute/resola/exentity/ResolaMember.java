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
package org.docksidestage.hangar.dbflute.resola.exentity;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.exentity.MemberAddress;
import org.docksidestage.hangar.dbflute.exentity.MemberService;
import org.docksidestage.hangar.dbflute.exentity.MemberStatus;
import org.docksidestage.hangar.dbflute.exentity.MemberWithdrawal;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMemberSecurity;
import org.docksidestage.hangar.dbflute.resola.bsentity.ResolaBsMember;

/**
 * The entity of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class ResolaMember extends ResolaBsMember implements UnifiedMember {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                    Split Relationship
    //                                    ------------------
    protected OptionalEntity<MemberStatus> _memberStatus = OptionalEntity.empty();
    protected OptionalEntity<MemberAddress> _memberAddressAsOne = OptionalEntity.empty();
    protected OptionalEntity<MemberService> _memberServiceWithIfComment = OptionalEntity.empty();
    protected OptionalEntity<MemberService> _memberServiceAsOne = OptionalEntity.empty();
    protected OptionalEntity<MemberWithdrawal> _memberWithdrawalAsOne = OptionalEntity.empty();

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                    Split Relationship
    //                                    ------------------
    @Override
    public OptionalEntity<MemberStatus> getMemberStatus() {
        return _memberStatus;
    }

    public void setMemberStatus(OptionalEntity<MemberStatus> memberStatus) {
        _memberStatus = memberStatus;
    }

    @Override
    public OptionalEntity<MemberAddress> getMemberAddressAsValid() {
        return _memberAddressAsOne;
    }

    public void setMemberAddressAsOne(OptionalEntity<MemberAddress> memberAddressAsOne) {
        _memberAddressAsOne = memberAddressAsOne;
    }

    @Override
    public OptionalEntity<MemberService> getMemberServiceWithIfComment() {
        return _memberServiceWithIfComment;
    }

    public void setMemberServiceWithIfComment(OptionalEntity<MemberService> memberServiceWithIfComment) {
        _memberServiceWithIfComment = memberServiceWithIfComment;
    }

    @Override
    public OptionalEntity<MemberService> getMemberServiceAsOne() {
        return _memberServiceAsOne;
    }

    public void setMemberServiceAsOne(OptionalEntity<MemberService> memberServiceAsOne) {
        _memberServiceAsOne = memberServiceAsOne;
    }

    @Override
    public OptionalEntity<MemberWithdrawal> getMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne;
    }

    public void setMemberWithdrawalAsOne(OptionalEntity<MemberWithdrawal> memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // -----------------------------------------------------
    //                                  Unified Relationship
    //                                  --------------------
    @Override
    public OptionalEntity<? extends UnifiedMemberSecurity> getUnifiedMemberSecurityAsOne() {
        return getMemberSecurityAsOne();
    }
}
