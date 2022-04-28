package org.docksidestage.hangar.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.naming.NameNotFoundException;
import javax.sql.DataSource;

import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.exception.NonSpecifiedColumnAccessException;
import org.dbflute.utflute.core.exception.ExceptionExaminer;
import org.dbflute.utflute.guice.ContainerTestCase;
import org.docksidestage.hangar.dbflute.allcommon.ImplementedBehaviorSelector;
import org.docksidestage.hangar.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberFollowingBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.hangar.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.hangar.dbflute.exbhv.PurchasePaymentBhv;
import org.docksidestage.hangar.dbflute.nogen.ExtendedDBFluteModule;
import org.docksidestage.hangar.unit.db.MaihamaDbArranger;
import org.docksidestage.hangar.unit.db.TestTransactionModule;

import com.atomikos.util.IntraVmObjectRegistry;
import com.google.inject.Module;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final Stack<ConditionBean> _cbStack = new Stack<ConditionBean>();
    private ImplementedBehaviorSelector _behaviorSelector;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        _cbStack.clear();
    }

    @Override
    protected boolean isUseTestCaseLooseBinding() {
        return true;
    }

    // -----------------------------------------------------
    //                                                Module
    //                                                ------
    @Override
    protected List<Module> prepareModuleList() {
        // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
        // default is single DB structure by jflute (2022/04/28)
        // tests for multiple DB are under multipledb package 
        // _/_/_/_/_/_/_/_/_/_/
        final DataSource dataSource = createDataSource();
        final List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(newExtendedDBFluteModule(dataSource));
        final TestTransactionModule transactionModule = createTransactionModule(dataSource);
        if (transactionModule != null) {
            moduleList.add(transactionModule);
        }
        return moduleList;
    }

    protected ExtendedDBFluteModule newExtendedDBFluteModule(DataSource dataSource) {
        return new ExtendedDBFluteModule(dataSource);
    }

    protected DataSource createDataSource() {
        return new MaihamaDbArranger().createDataSource();
    }

    protected TestTransactionModule createTransactionModule(DataSource dataSource) {
        return new TestTransactionModule(dataSource);
    }

    @Override
    protected void xdestroyContainer() {
        super.xdestroyContainer();
        final String uniqueResourceName = new MaihamaDbArranger().getUniqueResourceName();
        xclearAtomikosResourceIfExists(uniqueResourceName);
    }

    protected void xclearAtomikosResourceIfExists(String uniqueResourceName) {
        try {
            // because Atomikos keep resources as static
            IntraVmObjectRegistry.removeResource(uniqueResourceName);
        } catch (NameNotFoundException continued) { // when e.g. first destruction
            log("Not found the Atomikos resource: {}", uniqueResourceName);
        }
    }

    // ===================================================================================
    //                                                                 ConditionBean Stack
    //                                                                 ===================
    protected void pushCB(ConditionBean cb) {
        _cbStack.push(cb);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> CB popCB() {
        return (CB) _cbStack.pop();
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchasePaymentBhv.class);
        deleteAll(PurchaseBhv.class);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertNonSpecifiedAccess(ExceptionExaminer noArgInLambda) {
        assertException(NonSpecifiedColumnAccessException.class, noArgInLambda);
    }
}
