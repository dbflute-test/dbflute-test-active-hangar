package org.docksidestage.hangar.unit.db;

/**
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday) split from UnitContainerTestCase (2022/04/28 Thursday)
 */
public class ResortlineDbArranger extends H2AtomikosDbArranger {

    @Override
    protected String getDbName() {
        return "resortlinedb";
    }
}
