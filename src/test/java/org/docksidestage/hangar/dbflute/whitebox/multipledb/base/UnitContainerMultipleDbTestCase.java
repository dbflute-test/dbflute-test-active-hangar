package org.docksidestage.hangar.dbflute.whitebox.multipledb.base;

import java.util.List;

import org.docksidestage.hangar.dbflute.resola.allcommon.ResolaDBFluteModule;
import org.docksidestage.hangar.dbflute.whitebox.multipledb.WxMultipleDbResolaH2Test.MockUsingRuntimeComponent;
import org.docksidestage.hangar.unit.UnitContainerTestCase;
import org.docksidestage.hangar.unit.db.ResortlineDbArranger;

import com.google.inject.AbstractModule;
import com.google.inject.Module;

/**
 * Test case for MultipleDB.
 * @author jflute
 * @since 1.2.8 (2025/03/18 Tuesday at ichihara)
 */
public abstract class UnitContainerMultipleDbTestCase extends UnitContainerTestCase {

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
                bind(MockUsingRuntimeComponent.class).toInstance(new MockUsingRuntimeComponent());
            }
        });
        return moduleList;
    }

    @Override
    protected void xdestroyContainer() {
        super.xdestroyContainer();
        xclearAtomikosResourceIfExists(new ResortlineDbArranger().getUniqueResourceName());
    }
}
