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
package org.docksidestage.hangar.dbflute.resola.cbean.nss;

import org.docksidestage.hangar.dbflute.resola.cbean.cq.ResolaMemberCQ;

/**
 * The nest select set-upper of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class ResolaMemberNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ResolaMemberCQ _query;
    public ResolaMemberNss(ResolaMemberCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ResolaMemberSecurityNss withMemberSecurityAsOne() {
        _query.xdoNss(() -> _query.queryMemberSecurityAsOne());
        return new ResolaMemberSecurityNss(_query.queryMemberSecurityAsOne());
    }
}
