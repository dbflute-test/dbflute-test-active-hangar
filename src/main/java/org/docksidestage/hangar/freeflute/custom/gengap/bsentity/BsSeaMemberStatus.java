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
package org.docksidestage.hangar.freeflute.custom.gengap.bsentity;

import java.io.Serializable;

/**
 * member table
 * @author FreeGen
 */
public class BsSeaMemberStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_STATUS_CODE: code */
    protected String memberStatusCode;

    /** MEMBER_STATUS_NAME: ${column.comment} */
    protected String memberStatusName;

    // [Referrers] *comment only
    // o SEA_MEMBER

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String value) {
        memberStatusCode = value;
    }

    public String getMemberStatusName() {
        return memberStatusName;
    }

    public void setMemberStatusName(String value) {
        memberStatusName = value;
    }

}
