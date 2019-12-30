package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

import com.google.inject.Inject;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * @author jflute
 * @since 1.2.2 (2019/12/30 Monday at sheraton)
 */
public class WxExtendedAbstractBehaviorAkkaTest extends UnitContainerTestCase {

    @Inject
    private MemberBhv memberBhv;

    public void test_source_basic() throws Exception {
        // ## Arrange ##
        ExecutorService threadPool = Executors.newFixedThreadPool(1);

        // ## Act ##
        Source<Member, NotUsed> source = memberBhv.source(cb -> {
            cb.query().setMemberName_LikeSearch("S", op -> op.likePrefix());
        }, threadPool);

        // ## Assert ##
        source.async();
        sleep(300);
    }
}
