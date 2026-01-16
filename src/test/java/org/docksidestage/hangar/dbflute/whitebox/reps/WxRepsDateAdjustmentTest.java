package org.docksidestage.hangar.dbflute.whitebox.reps;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.exbhv.WhiteLoadingDateAdjustmentBhv;
import org.docksidestage.hangar.dbflute.exentity.WhiteLoadingDateAdjustment;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.3.2 (2026/01/16 Friday at ichihara)
 */
public class WxRepsDateAdjustmentTest extends UnitContainerTestCase {

    private WhiteLoadingDateAdjustmentBhv dateAdjustmentBhv;

    public void test_basic() {
        // ## Arrange ##
        // ## Act ##
        ListResultBean<WhiteLoadingDateAdjustment> loadingList = dateAdjustmentBhv.selectList(cb -> {});

        // ## Assert ##
        confirm1st(loadingList.get(0));
        confirm2nd(loadingList.get(1));
        confirm3rd(loadingList.get(2));
        confirm4th(loadingList.get(3));
        confirm5th(loadingList.get(4));
        assertEquals(5, loadingList.size());
    }

    private void confirm1st(WhiteLoadingDateAdjustment adjustment) {
        assertEquals(Long.valueOf(1), adjustment.getDateAdjustmentId());
        String dateExp = "2026/01/16";
        String timeExp = "21:51:23";
        int intValue = 11;
        String longExp = "1111";
        assertEquals(toLocalDate(dateExp), adjustment.getAdjustedDate());
        assertEquals(toLocalDateTime(dateExp + " " + timeExp), adjustment.getAdjustedDatetime());
        assertEquals(toLocalTime(timeExp), adjustment.getAdjustedTime());
        assertEquals(intValue, adjustment.getAdjustedInteger());
        assertEquals(Long.valueOf(longExp), adjustment.getAdjustedPlainLong());
        assertEquals(longExp, adjustment.getAdjustedStringLong());
        assertEquals(toLocalDateTime("2006/09/26 12:34:56"), adjustment.getRegisterDatetime());
        assertEquals("jflute_reg1", adjustment.getRegisterUser());
        assertEquals(toLocalDateTime("2007/09/26 23:34:45"), adjustment.getUpdateDatetime());
        assertEquals("jflute_upd1", adjustment.getUpdateUser());
    }

    private void confirm2nd(WhiteLoadingDateAdjustment adjustment) {
        assertEquals(Long.valueOf(2), adjustment.getDateAdjustmentId());
        String dateExp = "2026/01/17";
        String timeExp = "22:52:24";
        int intValue = 22;
        String longExp = "22222";
        assertEquals(toLocalDate(dateExp), adjustment.getAdjustedDate());
        assertEquals(toLocalDateTime(dateExp + " " + timeExp), adjustment.getAdjustedDatetime());
        assertEquals(toLocalTime(timeExp), adjustment.getAdjustedTime());
        assertEquals(intValue, adjustment.getAdjustedInteger());
        assertEquals(Long.valueOf(longExp), adjustment.getAdjustedPlainLong());
        assertEquals(longExp, adjustment.getAdjustedStringLong());
        assertEquals(toLocalDateTime("2006/09/27 12:34:56"), adjustment.getRegisterDatetime());
        assertEquals("jflute_reg2", adjustment.getRegisterUser());
        assertEquals(toLocalDateTime("2007/09/27 23:34:45"), adjustment.getUpdateDatetime());
        assertEquals("jflute_upd2", adjustment.getUpdateUser());
    }

    private void confirm3rd(WhiteLoadingDateAdjustment adjustment) {
        assertEquals(Long.valueOf(3), adjustment.getDateAdjustmentId());
        String dateExp = "2026/01/18";
        String timeExp = "23:53:25";
        int intValue = 33;
        String longExp = "333333";
        assertEquals(toLocalDate(dateExp), adjustment.getAdjustedDate());
        assertEquals(toLocalDateTime(dateExp + " " + timeExp), adjustment.getAdjustedDatetime());
        assertEquals(toLocalTime(timeExp), adjustment.getAdjustedTime());
        assertEquals(intValue, adjustment.getAdjustedInteger());
        assertEquals(Long.valueOf(longExp), adjustment.getAdjustedPlainLong());
        assertEquals(longExp, adjustment.getAdjustedStringLong());
        assertEquals(toLocalDateTime("2006/09/28 12:34:56"), adjustment.getRegisterDatetime());
        assertEquals("jflute_reg3", adjustment.getRegisterUser());
        assertEquals(toLocalDateTime("2007/09/28 23:34:45"), adjustment.getUpdateDatetime());
        assertEquals("jflute_upd3", adjustment.getUpdateUser());
    }

    private void confirm4th(WhiteLoadingDateAdjustment adjustment) {
        assertEquals(Long.valueOf(4), adjustment.getDateAdjustmentId());
        String dateExp = "2026/01/19";
        String timeExp = "00:54:26";
        int intValue = 44;
        String longExp = "4444444";
        assertEquals(toLocalDate(dateExp), adjustment.getAdjustedDate());
        assertEquals(toLocalDateTime(dateExp + " " + timeExp), adjustment.getAdjustedDatetime());
        assertEquals(toLocalTime(timeExp), adjustment.getAdjustedTime());
        assertEquals(intValue, adjustment.getAdjustedInteger());
        assertEquals(Long.valueOf(longExp), adjustment.getAdjustedPlainLong());
        assertEquals(longExp, adjustment.getAdjustedStringLong());
        assertEquals(toLocalDateTime("2006/09/29 12:34:56"), adjustment.getRegisterDatetime());
        assertEquals("jflute_reg4", adjustment.getRegisterUser());
        assertEquals(toLocalDateTime("2007/09/29 23:34:45"), adjustment.getUpdateDatetime());
        assertEquals("jflute_upd4", adjustment.getUpdateUser());
    }

    private void confirm5th(WhiteLoadingDateAdjustment adjustment) {
        assertEquals(Long.valueOf(5), adjustment.getDateAdjustmentId());
        String dateExp = "2026/01/20";
        String timeExp = "01:55:27";
        int intValue = 55;
        String longExp = "55555555";
        assertEquals(toLocalDate(dateExp), adjustment.getAdjustedDate());
        assertEquals(toLocalDateTime(dateExp + " " + timeExp), adjustment.getAdjustedDatetime());
        assertEquals(toLocalTime(timeExp), adjustment.getAdjustedTime());
        assertEquals(intValue, adjustment.getAdjustedInteger());
        assertEquals(Long.valueOf(longExp), adjustment.getAdjustedPlainLong());
        assertEquals(longExp, adjustment.getAdjustedStringLong());
        assertEquals(toLocalDateTime("2006/09/30 12:34:56"), adjustment.getRegisterDatetime());
        assertEquals("jflute_reg5", adjustment.getRegisterUser());
        assertEquals(toLocalDateTime("2007/09/30 23:34:45"), adjustment.getUpdateDatetime());
        assertEquals("jflute_upd5", adjustment.getUpdateUser());
    }
}
