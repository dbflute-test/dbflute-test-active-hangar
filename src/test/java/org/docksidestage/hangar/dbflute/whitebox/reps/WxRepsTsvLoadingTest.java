package org.docksidestage.hangar.dbflute.whitebox.reps;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.exbhv.WhiteTsvLoadingBhv;
import org.docksidestage.hangar.dbflute.exentity.WhiteTsvLoading;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxRepsTsvLoadingTest extends UnitContainerTestCase {

    private WhiteTsvLoadingBhv tsvLoadingBhv;

    public void test_basic() {
        // ## Arrange ##
        // ## Act ##
        ListResultBean<WhiteTsvLoading> loadingList = tsvLoadingBhv.selectList(cb -> {});

        // ## Assert ##
        for (WhiteTsvLoading loading : loadingList) {
            Long tsvLoadingId = loading.getTsvLoadingId();
            String tsvLoadingName = loading.getTsvLoadingName();
            log(tsvLoadingId, tsvLoadingName);
            if (tsvLoadingId.equals(21L)) {
                assertEquals("b\"bb\"", tsvLoadingName);
                markHere("21");
            } else if (tsvLoadingId.equals(22L)) {
                assertEquals("\n\nc\n c\n\nc", tsvLoadingName);
                markHere("22");
            }
        }
        assertMarked("21");
        assertMarked("22");

        assertEquals(19, loadingList.size());
    }
}
