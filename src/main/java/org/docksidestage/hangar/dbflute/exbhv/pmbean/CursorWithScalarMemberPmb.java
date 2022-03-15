package org.docksidestage.hangar.dbflute.exbhv.pmbean;

import org.docksidestage.hangar.dbflute.bsbhv.pmbean.BsCursorWithScalarMemberPmb;

/**
 * <!-- df:beginClassDescription -->
 * The typed parameter-bean of CursorWithScalarMember. <span style="color: #AD4747">(typed to cursor)</span><br>
 * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectCursorWithScalarMember</span>" on MemberBhv, <br>
 * described as "Example for selecting cursor with scalar SQL". <br>
 * <!-- df:endClassDescription -->
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class CursorWithScalarMemberPmb extends BsCursorWithScalarMemberPmb {

    private boolean _asScalarHandling;

    /**
     * Use parameter-bean for scalar handling.
     * @return this. (NotNull)
     */
    public CursorWithScalarMemberPmb asScalarHandling() {
        _asScalarHandling = true;
        return this;
    }

    @Override
    public boolean isCursorHandling() {
        return !_asScalarHandling;
    }
}
