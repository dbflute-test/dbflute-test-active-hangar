package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Resource;

import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.0 (2019/04/30 Tuesday at sheraton)
 */
public class WxDatetimePrecisionTruncationOfUpdatedEntityTest extends UnitContainerTestCase {

    @Resource
    private MemberBhv memberBhv;

    // enabled as default by dfprop
    public void test_precision_insert_basic() {
        // ## Arrange ##
        Member member = memberBhv.selectEntity(cb -> {
            cb.acceptPK(1);
        }).get();
        member.setMemberAccount("precision"); // to be unique for insert
        LocalDate birthdate = LocalDate.of(2019, 4, 30);
        member.setBirthdate(birthdate);
        LocalDateTime formalizedDatetime = LocalDateTime.of(2019, 4, 30, 14, 22, 59, 741);
        member.setFormalizedDatetime(formalizedDatetime);
        assertEquals(birthdate, member.getBirthdate()); // not filtered
        assertEquals(formalizedDatetime, member.getFormalizedDatetime()); // not filtered

        // ## Act ##
        memberBhv.insert(member);

        // ## Assert ##
        assertEquals(birthdate, member.getBirthdate()); // not filtered
        assertEquals(LocalDateTime.of(2019, 4, 30, 14, 22, 59, 000), member.getFormalizedDatetime()); // filtered
    }

    public void test_precision_update_basic() {
        // ## Arrange ##
        Member member = memberBhv.selectEntity(cb -> {
            cb.acceptPK(1);
        }).get();
        LocalDate birthdate = LocalDate.of(2019, 4, 30);
        member.setBirthdate(birthdate);
        LocalDateTime formalizedDatetime = LocalDateTime.of(2019, 4, 30, 14, 22, 59, 741);
        member.setFormalizedDatetime(formalizedDatetime);
        assertEquals(birthdate, member.getBirthdate()); // not filtered
        assertEquals(formalizedDatetime, member.getFormalizedDatetime()); // not filtered

        // ## Act ##
        memberBhv.updateNonstrict(member);

        // ## Assert ##
        assertEquals(birthdate, member.getBirthdate()); // not filtered
        assertEquals(LocalDateTime.of(2019, 4, 30, 14, 22, 59, 000), member.getFormalizedDatetime()); // filtered
    }
}
