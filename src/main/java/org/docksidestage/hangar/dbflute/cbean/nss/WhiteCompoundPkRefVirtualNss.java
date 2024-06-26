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
package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteCompoundPkRefVirtualCQ;

/**
 * The nest select set-upper of WHITE_COMPOUND_PK_REF_VIRTUAL.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefVirtualNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteCompoundPkRefVirtualCQ _query;
    public WhiteCompoundPkRefVirtualNss(WhiteCompoundPkRefVirtualCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     */
    public void withWhiteCompoundPk() {
        _query.xdoNss(() -> _query.queryWhiteCompoundPk());
    }
}
