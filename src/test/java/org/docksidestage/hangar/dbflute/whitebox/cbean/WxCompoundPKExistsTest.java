package org.docksidestage.hangar.dbflute.whitebox.cbean;

import javax.annotation.Resource;

import org.docksidestage.hangar.dbflute.exbhv.WhiteCompoundPkBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxCompoundPKExistsTest extends UnitContainerTestCase {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // deep tests exist in MySQL test project
    // _/_/_/_/_/_/_/_/_/_/

    @Resource
    private WhiteCompoundPkBhv compoundPkBhv;

    public void test_compoundPK_exists_basic() throws Exception {
        // ## Arrange ##

        // ## Act ##
        compoundPkBhv.selectList(cb -> {
            cb.query().existsWhiteCompoundPkRefPhysical(refCB -> {
                // case of plain exists
                //refCB.useInScopeSubQuery();
            });
            pushCB(cb);
        });

        // ## Assert ##
        String displaySql = popCB().toDisplaySql();
        assertContains(displaySql, "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID");
        assertContains(displaySql, "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID");
    }

    public void test_compoundPK_exists_useInScopeSubQuery_physical() throws Exception {
        // until DBFlute-1.2.7
        //assertException(DBMetaNotFoundException.class, () -> {
        //    compoundPkBhv.selectList(cb -> {
        //        cb.query().existsWhiteCompoundPkRefPhysical(refCB -> {
        //            refCB.useInScopeSubQuery(); // cause
        //        });
        //    });
        //});

        // ## Arrange ##

        // ## Act ##
        compoundPkBhv.selectList(cb -> {
            cb.query().existsWhiteCompoundPkRefPhysical(refCB -> {
                refCB.useInScopeSubQuery(); // cause
            });
            pushCB(cb);
        });

        // ## Assert ##
        String displaySql = popCB().toDisplaySql();
        assertContains(displaySql, "where (dfloc.PK_FIRST_ID, dfloc.PK_SECOND_ID) in (");
        assertContains(displaySql, ") in (select sub1loc.REF_FIRST_ID, sub1loc.REF_SECOND_ID");
    }

    public void test_compoundPK_exists_useInScopeSubQuery_virtual() throws Exception {
        // until DBFlute-1.2.7
        //assertException(DBMetaNotFoundException.class, () -> {
        //    compoundPkBhv.selectList(cb -> {
        //        cb.query().existsWhiteCompoundPkRefVirturl(refCB -> {
        //            refCB.useInScopeSubQuery(); // cause
        //        });
        //    });
        //});

        // ## Arrange ##

        // ## Act ##
        compoundPkBhv.selectList(cb -> {
            cb.query().existsWhiteCompoundPkRefVirtual(refCB -> {
                refCB.useInScopeSubQuery(); // cause
            });
            pushCB(cb);
        });

        // ## Assert ##
        String displaySql = popCB().toDisplaySql();
        assertContains(displaySql, "where (dfloc.PK_FIRST_ID, dfloc.PK_SECOND_ID) in (");
        assertContains(displaySql, ") in (select sub1loc.REF_FIRST_ID, sub1loc.REF_SECOND_ID");
    }
}
