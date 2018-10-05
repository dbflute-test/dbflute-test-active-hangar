package org.docksidestage.hangar.dbflute.whitebox.dfprop.addifk;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.dbflute.exentity.MemberService;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.9 (2018/10/05 Friday)
 */
public class WxAdditionalForeignKeyIfCommentTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_ifcomment_classification_basic_plastic() throws Exception {
        // ## Arrange ##
        CDef.ServiceRank serviceRank = CDef.ServiceRank.Plastic;

        // ## Act ##
        memberBhv.selectList(cb -> {
            cb.setupSelect_MemberServiceWithIfComment(serviceRank);
            pushCB(cb);
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        assertContainsAll(sql, "SERVICE_POINT_COUNT > 0", "SERVICE_POINT_COUNT > 111");
        assertContainsAll(sql, "SERVICE_RANK_CODE = '" + serviceRank.code() + "'");
        assertNotContains(sql, "SERVICE_POINT_COUNT > 222");
        assertNotContains(sql, "SERVICE_POINT_COUNT > 333");
    }

    public void test_ifcomment_classification_basic_bronze() throws Exception {
        // ## Arrange ##
        CDef.ServiceRank serviceRank = CDef.ServiceRank.Bronze;

        // ## Act ##
        memberBhv.selectList(cb -> {
            cb.setupSelect_MemberServiceWithIfComment(serviceRank);
            pushCB(cb);
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        assertContainsAll(sql, "SERVICE_POINT_COUNT > 0", "SERVICE_POINT_COUNT > 222");
        assertContainsAll(sql, "SERVICE_RANK_CODE = '" + serviceRank.code() + "'");
        assertNotContains(sql, "SERVICE_POINT_COUNT > 111");
        assertNotContains(sql, "SERVICE_POINT_COUNT > 333");
    }

    public void test_ifcomment_classification_basic_silver() throws Exception {
        // ## Arrange ##
        CDef.ServiceRank serviceRank = CDef.ServiceRank.Silver;

        // ## Act ##
        memberBhv.selectList(cb -> {
            cb.setupSelect_MemberServiceWithIfComment(serviceRank);
            pushCB(cb);
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        assertContainsAll(sql, "SERVICE_POINT_COUNT > 0", "SERVICE_POINT_COUNT > 333");
        assertContainsAll(sql, "SERVICE_RANK_CODE = '" + serviceRank.code() + "'");
        assertNotContains(sql, "SERVICE_POINT_COUNT > 111");
        assertNotContains(sql, "SERVICE_POINT_COUNT > 222");
    }

    public void test_ifcomment_classification_with_others() throws Exception {
        // ## Arrange ##
        CDef.ServiceRank serviceRank = CDef.ServiceRank.Silver;

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberServiceAsOne();
            cb.setupSelect_MemberServiceWithIfComment(serviceRank);
            pushCB(cb);
        });

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            MemberService service = member.getMemberServiceAsOne().get();
            MemberService ifserv = member.getMemberServiceWithIfComment().orElse(null);
            log(service.getServiceRankCodeAsServiceRank(), service.getServicePointCount(),
                    ifserv != null ? ifserv.getServicePointCount() : ifserv);
        }
    }
}
