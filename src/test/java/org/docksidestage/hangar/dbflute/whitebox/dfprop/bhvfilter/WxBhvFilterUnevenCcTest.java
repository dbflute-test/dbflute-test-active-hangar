package org.docksidestage.hangar.dbflute.whitebox.dfprop.bhvfilter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.dbflute.helper.HandyDate;
import org.dbflute.hook.AccessContext;
import org.docksidestage.hangar.dbflute.exbhv.WhiteUnevenCommonColumn1stBhv;
import org.docksidestage.hangar.dbflute.exbhv.WhiteUnevenCommonColumn2ndBhv;
import org.docksidestage.hangar.dbflute.exbhv.WhiteUnevenCommonColumn3rdBhv;
import org.docksidestage.hangar.dbflute.exbhv.WhiteUnevenCommonColumn4thBhv;
import org.docksidestage.hangar.dbflute.exentity.WhiteUnevenCommonColumn1st;
import org.docksidestage.hangar.dbflute.exentity.WhiteUnevenCommonColumn2nd;
import org.docksidestage.hangar.dbflute.exentity.WhiteUnevenCommonColumn3rd;
import org.docksidestage.hangar.dbflute.exentity.WhiteUnevenCommonColumn4th;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBhvFilterUnevenCcTest extends UnitContainerTestCase {

    private WhiteUnevenCommonColumn1stBhv unevenCommonColumn1stBhv;
    private WhiteUnevenCommonColumn2ndBhv unevenCommonColumn2ndBhv;
    private WhiteUnevenCommonColumn3rdBhv unevenCommonColumn3rdBhv;
    private WhiteUnevenCommonColumn4thBhv unevenCommonColumn4thBhv;

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_1st_basic() {
        // ## Arrange ##
        WhiteUnevenCommonColumn1st inserted = new WhiteUnevenCommonColumn1st();
        inserted.setUnevenId(1);
        inserted.setUnevenName("sea");

        // ## Act ##
        unevenCommonColumn1stBhv.insert(inserted);

        // ## Assert ##
        WhiteUnevenCommonColumn1st selected = unevenCommonColumn1stBhv.selectByPK(1).get();
        log(selected);
        LocalDateTime accessLocalDateTime = getAccessContext().getAccessLocalDateTime();
        LocalDateTime expectedDateTime = toExpectedDateTime(accessLocalDateTime);
        assertEquals(expectedDateTime, selected.getRegisterDatetime());
    }

    public void test_insert_2nd_basic() {
        // ## Arrange ##
        WhiteUnevenCommonColumn2nd inserted = new WhiteUnevenCommonColumn2nd();
        inserted.setUnevenId(1);
        inserted.setUnevenName("sea");

        // ## Act ##
        unevenCommonColumn2ndBhv.insert(inserted);

        // ## Assert ##
        WhiteUnevenCommonColumn2nd selected = unevenCommonColumn2ndBhv.selectByPK(1).get();
        log(selected);
        AccessContext context = getAccessContext();
        LocalDateTime expectedDateTime = toExpectedDateTime(context.getAccessLocalDateTime());
        assertEquals(expectedDateTime, selected.getRegisterDatetime());
        assertEquals(context.getAccessUser(), selected.getRegisterUser());
    }

    public void test_insert_3rd_basic() {
        // ## Arrange ##
        WhiteUnevenCommonColumn3rd inserted = new WhiteUnevenCommonColumn3rd();
        inserted.setUnevenId(1);
        inserted.setUnevenName("sea");

        // ## Act ##
        unevenCommonColumn3rdBhv.insert(inserted);

        // ## Assert ##
        WhiteUnevenCommonColumn3rd selected = unevenCommonColumn3rdBhv.selectByPK(1).get();
        log(selected);
        AccessContext context = getAccessContext();
        LocalDateTime expectedDateTime = toExpectedDateTime(context.getAccessLocalDateTime());
        assertEquals(expectedDateTime, selected.getRegisterDatetime());
        assertEquals(expectedDateTime, selected.getUpdateDatetime());
    }

    public void test_insert_4th_basic() {
        // ## Arrange ##
        WhiteUnevenCommonColumn4th inserted = new WhiteUnevenCommonColumn4th();
        inserted.setUnevenId(1);
        inserted.setUnevenName("sea");

        // ## Act ##
        unevenCommonColumn4thBhv.insert(inserted);

        // ## Assert ##
        WhiteUnevenCommonColumn4th selected = unevenCommonColumn4thBhv.selectByPK(1).get();
        log(selected);
        AccessContext context = getAccessContext();
        LocalDateTime expectedDateTime = toExpectedDateTime(context.getAccessLocalDateTime());
        assertEquals(expectedDateTime, selected.getRegisterDatetime());
        assertEquals(context.getAccessUser(), selected.getRegisterUser());
        assertEquals(expectedDateTime, selected.getUpdateDatetime());
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_4th_basic() {
        // ## Arrange ##
        WhiteUnevenCommonColumn4th inserted = new WhiteUnevenCommonColumn4th();
        inserted.setUnevenId(1);
        inserted.setUnevenName("sea");
        unevenCommonColumn4thBhv.insert(inserted);

        AccessContext context = getAccessContext();
        LocalDateTime insertedDateTime = toExpectedDateTime(context.getAccessLocalDateTime());
        context.setAccessLocalDateTime(new HandyDate("2025/12/29 10:33:48.123").getLocalDateTime());

        WhiteUnevenCommonColumn4th updated = unevenCommonColumn4thBhv.selectByPK(1).get();
        updated.setUnevenName("land");

        // ## Act ##
        unevenCommonColumn4thBhv.update(updated);

        // ## Assert ##
        WhiteUnevenCommonColumn4th selected = unevenCommonColumn4thBhv.selectByPK(1).get();
        log(selected);
        assertEquals(insertedDateTime, selected.getRegisterDatetime());
        assertEquals(context.getAccessUser(), selected.getRegisterUser());

        LocalDateTime updatedDateTime = toExpectedDateTime(context.getAccessLocalDateTime());
        assertEquals(updatedDateTime, selected.getUpdateDatetime());
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    protected LocalDateTime toExpectedDateTime(LocalDateTime accessLocalDateTime) {
        // because of isDatetimePrecisionTruncationOfUpdatedEntity
        return accessLocalDateTime.truncatedTo(ChronoUnit.SECONDS);
    }
}
