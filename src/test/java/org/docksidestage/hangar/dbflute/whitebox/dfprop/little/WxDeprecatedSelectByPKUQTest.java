package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.WhiteDeprecatedSelectByPkuqBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxDeprecatedSelectByPKUQTest extends UnitContainerTestCase {

    private WhiteDeprecatedSelectByPkuqBhv selectByPkuqBhv;
    private MemberBhv memberBhv;

    @SuppressWarnings("deprecation")
    public void test_selectByPK() {
        assertFalse(selectByPkuqBhv.selectByPK(1L).isPresent());
    }

    @SuppressWarnings("deprecation")
    public void test_selectByUniqueOf() {
        assertFalse(selectByPkuqBhv.selectByUniqueOf("tekito").isPresent());
    }

    public void test_nonTargetTable() {
        assertTrue(memberBhv.selectByPK(1).isPresent());
    }
}
