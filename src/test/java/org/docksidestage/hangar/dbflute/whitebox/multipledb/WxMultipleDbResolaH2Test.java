package org.docksidestage.hangar.dbflute.whitebox.multipledb;

import java.util.List;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.ImplementedBehaviorSelector;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaDBFluteModule;
import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaImplementedBehaviorSelector;
import org.docksidestage.hangar.dbflute.resola.exbhv.ResolaStationBhv;
import org.docksidestage.hangar.dbflute.resola.exentity.ResolaStation;
import org.docksidestage.hangar.unit.UnitContainerTestCase;
import org.docksidestage.hangar.unit.db.ResortlineDbArranger;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.google.inject.name.Named;

/**
 * @author jflute
 */
public class WxMultipleDbResolaH2Test extends UnitContainerTestCase { // also test multipleDb on Guice

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Inject
    private MemberBhv memberBhv;
    @Inject
    private ResolaStationBhv stationBhv;

    @Inject
    private BehaviorSelector behaviorSelector; // can be injected
    @Inject
    @Named("behaviorSelector") // ignored because of unsupported by UTFlute
    private BehaviorSelector maiBehaviorSelector;
    @Inject
    @Named("resolaBehaviorSelector") // me too
    private BehaviorSelector resolaBehaviorSelector; // so for maihamadb

    @Inject
    private MockUsingSelectorComponent mockUsingSelectorComponent;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isUseOneTimeContainer() {
        return true; // for batch execution
    }

    @Override
    protected List<Module> prepareModuleList() {
        List<Module> moduleList = super.prepareModuleList();
        moduleList.add(new ResolaDBFluteModule(new ResortlineDbArranger().createDataSource()));
        moduleList.add(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MockUsingSelectorComponent.class).toInstance(new MockUsingSelectorComponent());
            }
        });
        return moduleList;
    }

    @Override
    protected void xdestroyContainer() {
        super.xdestroyContainer();
        xclearAtomikosResourceIfExists(new ResortlineDbArranger().getUniqueResourceName());
    }

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
        assertNotNull(behaviorSelector);

        log(maiBehaviorSelector);
        log(resolaBehaviorSelector);
        assertNotNull(maiBehaviorSelector);
        assertNotNull(resolaBehaviorSelector);
        assertTrue(maiBehaviorSelector instanceof ImplementedBehaviorSelector);
        assertTrue(resolaBehaviorSelector instanceof ImplementedBehaviorSelector); // because of byType

        assertNotNull(mockUsingSelectorComponent);
        BehaviorSelector maiSelector = mockUsingSelectorComponent.getMaiBehaviorSelector();
        BehaviorSelector resolaSelector = mockUsingSelectorComponent.getResolaBehaviorSelector();
        log(maiSelector);
        log(resolaSelector);
        assertNotNull(maiSelector);
        assertNotNull(resolaSelector);
        assertTrue(maiSelector instanceof ImplementedBehaviorSelector);
        assertTrue(resolaSelector instanceof ResolaImplementedBehaviorSelector);
    }

    public static class MockUsingSelectorComponent {

        @Inject
        private BehaviorSelector maiBehaviorSelector;

        @Inject
        @Named("resolaBehaviorSelector")
        private BehaviorSelector resolaBehaviorSelector;

        public BehaviorSelector getMaiBehaviorSelector() {
            return maiBehaviorSelector;
        }

        public BehaviorSelector getResolaBehaviorSelector() {
            return resolaBehaviorSelector;
        }
    }
}
