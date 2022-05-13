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

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseOne01SeaHangarCQ;

/**
 * The nest select set-upper of WHITE_BASE_ONE01_SEA_HANGAR.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaHangarNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseOne01SeaHangarCQ _query;
    public WhiteBaseOne01SeaHangarNss(WhiteBaseOne01SeaHangarCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne01SeaNss withWhiteBaseOne01Sea() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne01Sea());
        return new WhiteBaseOne01SeaNss(_query.queryWhiteBaseOne01Sea());
    }
}
