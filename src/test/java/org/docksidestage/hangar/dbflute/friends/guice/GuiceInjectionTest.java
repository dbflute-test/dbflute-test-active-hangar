package org.docksidestage.hangar.dbflute.friends.guice;

import java.util.List;

import org.dbflute.bhv.BehaviorSelector;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

/**
 * @author jflute
 */
public class GuiceInjectionTest extends UnitContainerTestCase {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // multipleDb tests on Guice are in WxMultipleDbResolaH2Test (2022/04/29)
    // _/_/_/_/_/_/_/_/_/_/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MockEntryComponent entryComponent;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isUseOneTimeContainer() {
        return true; // for batch execution
    }

    @Override
    protected List<Module> prepareModuleList() {
        final List<Module> moduleList = super.prepareModuleList();
        moduleList.add(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MockEntryComponent.class).toInstance(new MockEntryComponent());
            }
        });
        moduleList.add(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MockNamedComponent.class).annotatedWith(Names.named("mockNamed")).toInstance(new MockNamedComponent());
                bind(MockNamedInfComponent.class).annotatedWith(Names.named("mockNamedInf")).toInstance(new MockNamedInfComponentImpl());
                bind(MockTypedComponent.class).toInstance(new MockTypedComponent());
            }
        });
        return moduleList;
    }

    // ===================================================================================
    //                                                                           Injection
    //                                                                           =========
    public void test_injection_basic() throws Exception {
        assertNotNull(entryComponent.getBehaviorSelector());
        assertNotNull(entryComponent.getMemberBhv());
        assertNotNull(entryComponent.getMockNamedComponent());
        assertNotNull(entryComponent.getMockNamedComponent().getMemberBhv());
        assertNotNull(entryComponent.getMockNamedInfComponent());
        assertNotNull(entryComponent.getMockNamedInfComponent().getMemberBhv());
        assertNotNull(entryComponent.getMockTypedComponent());
        assertNotNull(entryComponent.getMockTypedComponent().getMockNamedComponent());
    }

    // ===================================================================================
    //                                                                      Mock Component
    //                                                                      ==============
    public static class MockEntryComponent {

        @Inject
        private BehaviorSelector behaviorSelector;

        @Inject
        private MemberBhv memberBhv;

        @Inject
        private MockNamedComponent mockNamedComponent; // by type injection

        // cannot use interface type if Names binding by jflute (2022/04/28)
        @Inject
        private MockNamedInfComponentImpl mockNamedInfComponent; // by type injection

        @Inject
        private MockTypedComponent mockTypedComponent;

        public BehaviorSelector getBehaviorSelector() {
            return behaviorSelector;
        }

        public MemberBhv getMemberBhv() {
            return memberBhv;
        }

        public MockNamedComponent getMockNamedComponent() {
            return mockNamedComponent;
        }

        public MockNamedInfComponent getMockNamedInfComponent() {
            return mockNamedInfComponent;
        }

        public MockTypedComponent getMockTypedComponent() {
            return mockTypedComponent;
        }
    }

    public static class MockNamedComponent {

        @Inject
        private MemberBhv memberBhv;

        public MemberBhv getMemberBhv() {
            return memberBhv;
        }
    }

    public static interface MockNamedInfComponent {

        MemberBhv getMemberBhv();
    }

    public static class MockNamedInfComponentImpl implements MockNamedInfComponent {

        @Inject
        private MemberBhv memberBhv;

        public MemberBhv getMemberBhv() {
            return memberBhv;
        }
    }

    public static class MockTypedComponent {

        @Inject
        @Named("mockNamed")
        private MockNamedComponent mockNamedComponent; // by name injection

        public MockNamedComponent getMockNamedComponent() {
            return mockNamedComponent;
        }
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
