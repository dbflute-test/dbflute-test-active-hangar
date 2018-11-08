package org.docksidestage.hangar.dbflute.whitebox.cbean;

import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.dbflute.exentity.Purchase;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxOrOrArrangeQueryTest extends UnitContainerTestCase {

    @Resource
    private MemberBhv memberBhv;
    @Resource
    private PurchaseBhv purchaseBhv;

    public void test_OrOrParade_basic() throws Exception {
        ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.arrangeOrOrParade();
            cb.query().existsPurchase(purCB -> {});
        });
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb -> {
            cb.arrangeOrOrParade();
        });
        Set<Integer> memberIdSet = memberList.stream().map(mb -> mb.getMemberId()).collect(Collectors.toSet());
        Set<Integer> relatedMemberIdSet = purchaseList.stream().map(pur -> pur.getMemberId()).collect(Collectors.toSet());
        assertEquals(relatedMemberIdSet, memberIdSet);
    }
}
