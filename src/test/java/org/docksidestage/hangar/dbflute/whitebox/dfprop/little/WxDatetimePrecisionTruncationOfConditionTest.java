package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.cbean.MemberCB;

/**
 * @author jflute
 * @since 1.2.0 (2019/04/30 Tuesday at sheraton)
 */
public class WxDatetimePrecisionTruncationOfConditionTest extends PlainTestCase {

    // enabled as default by dfprop
    public void test_precision_basic() {
        {
            // ## Arrange ##
            MemberCB cb = new MemberCB();
            //cb.getSqlClause().enableDatetimePrecisionTruncationOfCondition();
            LocalDate birthdate = LocalDate.of(2019, 4, 30);
            cb.query().setBirthdate_Equal(birthdate);
            LocalDateTime formalizedDatetime = LocalDateTime.of(2019, 4, 30, 14, 22, 59, 741);
            cb.query().setFormalizedDatetime_Equal(formalizedDatetime);

            // ## Assert ##
            assertEquals(birthdate, cb.query().xdfgetBirthdate().getFixedQuery().get("equal"));
            Object filteredDatetime = cb.query().xdfgetFormalizedDatetime().getFixedQuery().get("equal");
            assertNotSame(formalizedDatetime, filteredDatetime);
            assertEquals(LocalDateTime.of(2019, 4, 30, 14, 22, 59, 000), filteredDatetime);
        }
        {
            // ## Arrange ##
            MemberCB cb = new MemberCB();
            cb.getSqlClause().disableDatetimePrecisionTruncationOfCondition();
            LocalDate birthdate = LocalDate.of(2019, 4, 30);
            cb.query().setBirthdate_Equal(birthdate);
            LocalDateTime formalizedDatetime = LocalDateTime.of(2019, 4, 30, 14, 22, 59, 741);
            cb.query().setFormalizedDatetime_Equal(formalizedDatetime);

            // ## Assert ##
            assertEquals(birthdate, cb.query().xdfgetBirthdate().getFixedQuery().get("equal"));
            assertEquals(formalizedDatetime, cb.query().xdfgetFormalizedDatetime().getFixedQuery().get("equal"));
        }
    }
}
