package org.docksidestage.hangar.dbflute.whitebox.cbean;

import org.dbflute.exception.SQLFailureException;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxTrickIndexHintTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_TrickPrimaryIndexForcedly_basic() throws Exception {
        {
            memberBhv.selectList(cb -> {
                pushCB(cb);
            });
            assertNotContains(popCB().toDisplaySql(), "use index (PRIMARY)");
        }
        assertException(SQLFailureException.class, () -> {
            memberBhv.selectList(cb -> {
                cb.useTrickPrimaryIndexForcedly();
                pushCB(cb);
            });
        });
        String sql = popCB().toDisplaySql();
        log(sql);
        assertContains(sql, "MEMBER dfloc use index (PRIMARY)");
    }
}
