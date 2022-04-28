package org.docksidestage.hangar.unit.db;

import javax.sql.DataSource;

import org.docksidestage.hangar.EmbeddedH2UrlFactoryBean;

import com.atomikos.jdbc.AtomikosNonXADataSourceBean;

/**
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday) split from UnitContainerTestCase (2022/04/28 Thursday)
 */
public abstract class H2AtomikosDbArranger {

    public DataSource createDataSource() {
        final AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
        bean.setUniqueResourceName(getUniqueResourceName());
        bean.setDriverClassName("org.h2.Driver");
        final EmbeddedH2UrlFactoryBean factoryBean = new EmbeddedH2UrlFactoryBean();
        factoryBean.setUrlSuffix("/database/" + getDbName());
        factoryBean.setReferenceClassName(EmbeddedH2UrlFactoryBean.class.getName());
        final String url;
        try {
            url = factoryBean.getObject().toString();
        } catch (Exception e) {
            String msg = "The factoryBean was invalid: " + factoryBean;
            throw new IllegalStateException(msg, e);
        }
        bean.setUrl(url.toString());
        bean.setUser("sa");
        bean.setPassword("");
        bean.setPoolSize(20);
        bean.setBorrowConnectionTimeout(60);
        return bean;
    }

    public String getUniqueResourceName() {
        return "NONXADBMS_" + getDbName();
    }

    protected abstract String getDbName();
}
