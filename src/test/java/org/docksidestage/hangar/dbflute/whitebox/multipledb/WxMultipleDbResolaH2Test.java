package org.docksidestage.hangar.dbflute.whitebox.multipledb;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.ImplementedBehaviorSelector;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaImplementedBehaviorSelector;
import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaImplementedCommonColumnAutoSetupper;
import org.docksidestage.hangar.dbflute.resola.exbhv.ResolaStationBhv;
import org.docksidestage.hangar.dbflute.resola.exentity.ResolaStation;
import org.docksidestage.hangar.dbflute.whitebox.multipledb.base.UnitContainerMultipleDbTestCase;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author jflute
 */
public class WxMultipleDbResolaH2Test extends UnitContainerMultipleDbTestCase { // also test multipleDb on Guice

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Inject
    private MemberBhv memberBhv;
    @Inject
    private ResolaStationBhv stationBhv;

    @Inject
    // maihamadb is byType only
    //@Named("behaviorSelector")
    private BehaviorSelector maiBehaviorSelector; // can be injected
    @Inject
    @Named("resola") // ignored because of unsupported by UTFlute
    private BehaviorSelector resolaBehaviorSelector; // so for maihamadb

    @Inject
    private MockUsingRuntimeComponent mockUsingRuntimeComponent;

    // ===================================================================================
    //                                                                              Access
    //                                                                              ======
    public void test_access() {
        // ## Arrange ##
        // maihamadb access test
        assertEquals(1, memberBhv.selectByPK(1).get().getMemberId());
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        assertHasAnyElement(memberBhv.outsideSql().selectList(pmb));

        // ## Act ##
        // resortlinedb access test, expect no exception
        OptionalEntity<ResolaStation> optStation = stationBhv.selectByPK(99999);

        // ## Assert ##
        assertFalse(optStation.isPresent());
    }

    // ===================================================================================
    //                                                                    BehaviorSelector
    //                                                                    ================
    public void test_behaviorSelector() {
        log(maiBehaviorSelector);
        log(resolaBehaviorSelector);
        assertNotNull(maiBehaviorSelector);
        assertNotNull(resolaBehaviorSelector);
        assertTrue(maiBehaviorSelector instanceof ImplementedBehaviorSelector);
        assertTrue(resolaBehaviorSelector instanceof ImplementedBehaviorSelector); // because of byType

        assertNotNull(mockUsingRuntimeComponent);
        BehaviorSelector maiSelector = mockUsingRuntimeComponent.getMaiBehaviorSelector();
        BehaviorSelector resolaSelector = mockUsingRuntimeComponent.getResolaBehaviorSelector();
        log(maiSelector);
        log(resolaSelector);
        assertNotNull(maiSelector);
        assertNotNull(resolaSelector);
        assertTrue(maiSelector instanceof ImplementedBehaviorSelector);
        assertTrue(resolaSelector instanceof ResolaImplementedBehaviorSelector);
        CommonColumnAutoSetupper resolaSetupper = mockUsingRuntimeComponent.getResolaCommonColumnAutoSetupper();
        assertNotNull(resolaSetupper);
        assertTrue(resolaSetupper instanceof ResolaImplementedCommonColumnAutoSetupper);
    }

    public static class MockUsingRuntimeComponent {

        @Inject
        private BehaviorSelector maiBehaviorSelector;

        @Inject
        @Named("resola")
        private BehaviorSelector resolaBehaviorSelector;

        @Inject
        @Named("resola")
        private CommonColumnAutoSetupper resolaCommonColumnAutoSetupper;

        public BehaviorSelector getMaiBehaviorSelector() {
            return maiBehaviorSelector;
        }

        public BehaviorSelector getResolaBehaviorSelector() {
            return resolaBehaviorSelector;
        }

        public CommonColumnAutoSetupper getResolaCommonColumnAutoSetupper() {
            return resolaCommonColumnAutoSetupper;
        }
    }
}
