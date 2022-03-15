package org.docksidestage.hangar.dbflute.exbhv.pmbean;

import org.docksidestage.hangar.dbflute.bsbhv.pmbean.BsPagingWithCursorMemberPmb;

/**
 * <!-- df:beginClassDescription -->
 * The typed parameter-bean of PagingWithCursorMember. <span style="color: #AD4747">(typed to manual-paging, cursor)</span><br>
 * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectPagingWithCursorMember</span>" on MemberBhv, <br>
 * described as "Example for selecting cursor by paging SQL". <br>
 * <!-- df:endClassDescription -->
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class PagingWithCursorMemberPmb extends BsPagingWithCursorMemberPmb {

    private boolean _asCursorHandling;

    /**
     * Use parameter-bean for cursor handling.
     * @return this. (NotNull)
     */
    public PagingWithCursorMemberPmb asCursorHandling() {
        _asCursorHandling = true;
        return this;
    }

    @Override
    public boolean isPaging() { // not to depend on framework default value
        return super.isPaging() || _asCursorHandling; // always true if cursor handling
    }

    @Override
    public boolean isCursorHandling() { // to suppress paging condition
        return _asCursorHandling;
    }
}
