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

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteOnParadeRefCQ;

/**
 * The nest select set-upper of WHITE_ON_PARADE_REF.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOnParadeRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteOnParadeRefCQ _query;
    public WhiteOnParadeRefNss(WhiteOnParadeRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'.
     */
    public void withWhiteOnParade() {
        _query.xdoNss(() -> _query.queryWhiteOnParade());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'.
     */
    public void withWhiteOnParadeNullableToMany() {
        _query.xdoNss(() -> _query.queryWhiteOnParadeNullableToMany());
    }
}
