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
package org.docksidestage.hangar.dbflute.exbhv.pmbean;

import org.dbflute.outsidesql.typed.ListHandlingPmb;
import org.docksidestage.hangar.dbflute.bsbhv.pmbean.BsPagingWithListMemberPmb;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.customize.PagingWithListMember;

/**
 * <!-- df:beginClassDescription -->
 * The typed parameter-bean of PagingWithListMember. <span style="color: #AD4747">(typed to entity, manual-paging)</span><br>
 * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectPagingWithListMember</span>" on MemberBhv, <br>
 * described as "Example for selecting list by paging SQL". <br>
 * <!-- df:endClassDescription -->
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class PagingWithListMemberPmb extends BsPagingWithListMemberPmb // can select list
        implements ListHandlingPmb<MemberBhv, PagingWithListMember> {

    private boolean _asListHandling;

    /**
     * Use parameter-bean for list handling.
     * @return this. (NotNull)
     */
    public PagingWithListMemberPmb asListHandling() {
        _asListHandling = true;
        return this;
    }

    @Override
    public boolean isPaging() { // not to depend on framework default value
        return super.isPaging() || _asListHandling; // always true if list handling
    }

    @Override
    public boolean isListHandling() { // to suppress paging condition
        return _asListHandling;
    }
}
