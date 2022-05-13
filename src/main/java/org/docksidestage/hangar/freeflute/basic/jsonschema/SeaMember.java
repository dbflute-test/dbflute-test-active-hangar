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
package org.docksidestage.hangar.freeflute.basic.jsonschema;

import java.io.Serializable;

/**
 * member table
 * @author FreeGen
 */
public class SeaMember implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: identity */
    protected Integer memberId;

    /** MEMBER_NAME: ${column.comment} */
    protected String memberName;

    /** MEMBER_ACCOUNT: ${column.comment} */
    protected String memberAccount;

    /** BIRTHDATE: ${column.comment} */
    protected java.time.LocalDate birthdate;

    /** FORMALIZED_DATETIME: ${column.comment} */
    protected java.time.LocalDateTime formalizedDatetime;

    /** MEMBER_STATUS_CODE: ${column.comment} */
    protected String memberStatusCode;

    /** SEA_MEMBER_STATUS: ${column.comment} */
    protected SeaMemberStatus seaMemberStatus;

    // [Referrers] *comment only
    // o SEA_PURCHASE

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String value) {
        memberName = value;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String value) {
        memberAccount = value;
    }

    public java.time.LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(java.time.LocalDate value) {
        birthdate = value;
    }

    public java.time.LocalDateTime getFormalizedDatetime() {
        return formalizedDatetime;
    }

    public void setFormalizedDatetime(java.time.LocalDateTime value) {
        formalizedDatetime = value;
    }

    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String value) {
        memberStatusCode = value;
    }

    public SeaMemberStatus getSeaMemberStatus() {
        return seaMemberStatus;
    }

    public void setSeaMemberStatus(SeaMemberStatus value) {
        seaMemberStatus = value;
    }

}
