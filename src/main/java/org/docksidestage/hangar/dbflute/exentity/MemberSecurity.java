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
package org.docksidestage.hangar.dbflute.exentity;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMemberSecurity;

/**
 * The entity of MEMBER_SECURITY.
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class MemberSecurity extends org.docksidestage.hangar.dbflute.bsentity.BsMemberSecurity implements UnifiedMemberSecurity {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                  Unified Relationship
    //                                  --------------------
    @Override
    public OptionalEntity<? extends UnifiedMember> getUnifiedMember() {
        return getMember();
    }
}
