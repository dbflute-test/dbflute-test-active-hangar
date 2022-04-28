package org.docksidestage.hangar.unit.db;

import javax.sql.DataSource;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.google.inject.AbstractModule;

/**
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday) split from UnitContainerTestCase (2022/04/28 Thursday)
 */
public class TestTransactionModule extends AbstractModule {

    protected final DataSource _dataSource;

    public TestTransactionModule(DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        _dataSource = dataSource;
    }

    @Override
    protected void configure() {
        try {
            final UserTransactionImp userTransactionImp = new UserTransactionImp();
            userTransactionImp.setTransactionTimeout(300);
            UserTransactionManager userTransactionManager = new UserTransactionManager();
            userTransactionManager.setForceShutdown(true);
            userTransactionManager.init();
            bind(UserTransaction.class).toInstance(userTransactionImp);
            bind(TransactionManager.class).toInstance(userTransactionManager);
            bind(DataSource.class).toInstance(_dataSource);
        } catch (SystemException e) {
            throw new IllegalStateException(e);
        }
    }
}
