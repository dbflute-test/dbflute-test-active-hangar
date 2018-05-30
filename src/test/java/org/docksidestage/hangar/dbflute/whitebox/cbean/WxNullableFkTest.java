package org.docksidestage.hangar.dbflute.whitebox.cbean;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.exbhv.WhiteOnParadeBhv;
import org.docksidestage.hangar.dbflute.exentity.WhiteOnParade;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxNullableFkTest extends UnitContainerTestCase {

    @Resource
    private WhiteOnParadeBhv paradeBhv;

    public void test_nullableFk_InnerJoinAutoDetect_loadReferrer() {
        // ## Arrange ##
        registerTestData();
        ListResultBean<WhiteOnParade> paradeList = paradeBhv.selectList(cb -> {});
        assertHasAnyElement(paradeList);

        // ## Act ##
        paradeBhv.load(paradeList, paradeLoader -> {
            paradeLoader.loadWhiteOnParadeRef(refCB -> {
                refCB.setupSelect_WhiteOnParadeNullableToMany();
                refCB.query().addOrderBy_RefId_Asc();
                pushCB(refCB);
            });
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        log(sql);
        assertContains(sql, "WHITE_ON_PARADE_REF dfloc");
        assertNotContainsIgnoreCase(sql, "inner join");
        assertContainsIgnoreCase(sql, "left outer join"); // null-able FK
    }

    private void registerTestData() {
        WhiteOnParade parade = new WhiteOnParade();
        parade.setOnParadeId(99999L);
        parade.setOnParadeName("Dreaming Up!");
        paradeBhv.insert(parade);
    }
}
