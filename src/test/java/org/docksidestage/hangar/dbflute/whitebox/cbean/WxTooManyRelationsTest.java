package org.docksidestage.hangar.dbflute.whitebox.cbean;

import javax.annotation.Resource;

import org.docksidestage.hangar.dbflute.exbhv.WhiteBaseBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxTooManyRelationsTest extends UnitContainerTestCase {

    @Resource
    private WhiteBaseBhv whiteBaseBhv;

    // ===================================================================================
    //                                                         SpecifyColumn AliasConflict
    //                                                         ===========================
    public void test_SpecifyColumn_aliasConflict_firstWin_resolved() {
        // ## Arrange ##

        // ## Act ##
        whiteBaseBhv.selectList(cb -> {
            cb.setupSelect_WhiteBaseOne04Bonvo().withWhiteBaseOne04BonvoParkside();
            cb.specify().specifyWhiteBaseOne04Bonvo().specifyWhiteBaseOne04BonvoParkside().columnParksideName();
            cb.setupSelect_WhiteBaseOne11CirqueAsOne();
            pushCB(cb);
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        log(sql);
        assertContains(sql, "WHITE_BASE_ONE04_BONVO dfrel_1"); // precondition (BONVO should be 1)
        assertContains(sql, "dfrel_1_0.PARKSIDE_NAME as PARKSIDE_NAME_1_0"); // similar alias name

        // has all columns without SpecifyColumn
        assertContains(sql, "dfrel_10.CIRQUE_NAME as CIRQUE_NAME_10");
    }

    public void test_SpecifyColumn_aliasConflict_secondWin_resolved() {
        // ## Arrange ##

        // ## Act ##
        whiteBaseBhv.selectList(cb -> {
            cb.setupSelect_WhiteBaseOne04Bonvo().withWhiteBaseOne04BonvoParkside();
            cb.specify().specifyWhiteBaseOne04Bonvo().specifyWhiteBaseOne04BonvoParkside().columnParksideName();
            cb.setupSelect_WhiteBaseOne11CirqueAsOne();
            cb.specify().specifyWhiteBaseOne11CirqueAsOne().columnCirqueName();
            pushCB(cb);
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        log(sql);
        assertContains(sql, "WHITE_BASE_ONE04_BONVO dfrel_1"); // precondition (BONVO should be 1)
        assertContains(sql, "dfrel_1_0.PARKSIDE_NAME as PARKSIDE_NAME_1_0"); // similar alias name

        // has all columns without SpecifyColumn
        assertContains(sql, "dfrel_10.CIRQUE_NAME as CIRQUE_NAME_10");
    }

    public void test_SpecifyColumn_aliasConflict_wholeBalance_resolved() {
        // ## Arrange ##

        // ## Act ##
        whiteBaseBhv.selectList(cb -> {
            cb.setupSelect_WhiteBaseOne01Sea().withWhiteBaseOne01SeaBroadway();
            cb.setupSelect_WhiteBaseOne01Sea().withWhiteBaseOne01SeaDockside();
            cb.setupSelect_WhiteBaseOne01Sea().withWhiteBaseOne01SeaHangarAsOne();
            cb.specify().specifyWhiteBaseOne01Sea().columnSeaName();
            cb.specify().specifyWhiteBaseOne01Sea().specifyWhiteBaseOne01SeaDockside().columnDocksideName();

            cb.setupSelect_WhiteBaseOne02Land();
            cb.setupSelect_WhiteBaseOne03Piari();

            cb.setupSelect_WhiteBaseOne04Bonvo().withWhiteBaseOne04BonvoParkside();
            cb.setupSelect_WhiteBaseOne04Bonvo().withWhiteBaseOne04BonvoStationside();
            cb.specify().specifyWhiteBaseOne04Bonvo().specifyWhiteBaseOne04BonvoParkside().columnParksideName();

            cb.setupSelect_WhiteBaseOne05Dstore();
            cb.setupSelect_WhiteBaseOne06Amba();
            cb.setupSelect_WhiteBaseOne07Miraco();
            cb.setupSelect_WhiteBaseOne08Dohotel();
            cb.setupSelect_WhiteBaseOne09PalmAsOne();
            cb.setupSelect_WhiteBaseOne10CelebAsOne();
            cb.specify().specifyWhiteBaseOne10CelebAsOne().columnCelebName();
            cb.setupSelect_WhiteBaseOne11CirqueAsOne();
            cb.setupSelect_WhiteBaseOne12AmphiAsOne();
            cb.specify().specifyWhiteBaseOne12AmphiAsOne().columnAmphiName();
            pushCB(cb);
        });

        // ## Assert ##
        String sql = popCB().toDisplaySql();
        log(sql);
        assertContains(sql, "dfloc.BASE_NAME as BASE_NAME");
        assertContains(sql, "dfrel_6.SEA_NAME as SEA_NAME_6");
        assertContains(sql, "dfrel_6_0.BROADWAY_NAME as BROADWAY_NAME_6_0");
        assertContains(sql, "dfrel_6_1.DOCKSIDE_NAME as DOCKSIDE_NAME_6_1");
        assertContains(sql, "dfrel_6_2.HANGAR_NAME as HANGAR_NAME_6_2");
        assertContains(sql, "dfrel_3.LAND_NAME as LAND_NAME_3");
        assertContains(sql, "dfrel_5.PIARI_NAME as PIARI_NAME_5");
        assertContains(sql, "dfrel_1.BONVO_NAME as BONVO_NAME_1");
        assertContains(sql, "dfrel_1_0.PARKSIDE_NAME as PARKSIDE_NAME_1_0"); // similar alias name
        assertContains(sql, "dfrel_1_1.STATIONSIDE_NAME as STATIONSIDE_NAME_1_1"); // me too
        assertContains(sql, "dfrel_2.DSTORE_NAME as DSTORE_NAME_2");
        assertContains(sql, "dfrel_0.AMBA_NAME as AMBA_NAME_0");
        assertContains(sql, "dfrel_4.MIRACO_NAME as MIRACO_NAME_4");
        assertContains(sql, "dfrel_7.DOHOTEL_NAME as DOHOTEL_NAME_7");
        assertContains(sql, "dfrel_8.PALM_NAME as PALM_NAME_8");
        assertContains(sql, "dfrel_9.CELEB_NAME as CELEB_NAME_9");
        assertContains(sql, "dfrel_10.CIRQUE_NAME as CIRQUE_NAME_10");
        assertContains(sql, "dfrel_11.AMPHI_NAME as AMPHI_NAME_11");
    }
}
