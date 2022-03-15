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
