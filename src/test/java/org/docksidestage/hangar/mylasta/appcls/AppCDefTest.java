package org.docksidestage.hangar.mylasta.appcls;

import java.util.Arrays;

import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppAmba;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppAmphi;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppBonvo;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppBrighton;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppCeleb;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppDockside;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppDohotel;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppDstore;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppHangar;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppLand;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppMagiclamp;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppMaihama;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppMiraco;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppOrien;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppPiari;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppSea;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppToys;
import org.docksidestage.hangar.mylasta.namedcls.LeonardoCDef;

/**
 * @author jflute
 * @since 1.2.5 (2021/07/06 Tuesday at roppongi japanese)
 */
public class AppCDefTest extends PlainTestCase {

    // ===================================================================================
    //                                                         refCls Table Classification
    //                                                         ===========================
    public void test_AppMaihama_basic() { // included, without project name, expects DB reference
        assertEquals(Arrays.asList(AppMaihama.Formalized, AppMaihama.Provisional), AppMaihama.listOfServiceAvailable());
    }

    public void test_AppSea_basic() { // included
        assertEquals(Arrays.asList(AppSea.Formalized, AppSea.Provisional), AppSea.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppSea.Provisional), AppSea.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppSea.Withdrawal), AppSea.listOfUnauthorized());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppSea.Formalized.sisterSet());
        assertEquals("1", AppSea.Formalized.order());
        assertEquals(AppSea.Formalized, AppSea.fromDBCls(CDef.MemberStatus.Formalized).get());
        assertEquals(AppSea.Withdrawal, AppSea.fromDBCls(CDef.MemberStatus.Withdrawal).get());
        assertEquals(AppSea.Provisional, AppSea.fromDBCls(CDef.MemberStatus.Provisional).get());
        assertEquals(AppSea.Formalized.toDBCls().get(), CDef.MemberStatus.Formalized);
        assertEquals(AppSea.Withdrawal.toDBCls().get(), CDef.MemberStatus.Withdrawal);
        assertEquals(AppSea.Provisional.toDBCls().get(), CDef.MemberStatus.Provisional);
        assertEquals(3, AppSea.listAll().size());
    }

    public void test_AppLand_basic() { // exists
        assertEquals(Arrays.asList(AppLand.OneMan, AppLand.MiniO), AppLand.listAll());
        assertEquals(Arrays.asList(AppLand.OneMan), AppLand.listOfServiceAvailable());
        assertTrue(AppLand.groupOf("shortOfFormalized").isEmpty());
        assertEquals(Arrays.asList(AppLand.MiniO), AppLand.listOfUnauthorized());
        assertTrue(AppLand.OneMan.sisterSet().isEmpty());
        assertTrue(AppLand.OneMan.subItemMap().isEmpty());
        assertEquals(AppLand.OneMan, AppLand.fromDBCls(CDef.MemberStatus.Formalized).get());
        assertEquals(AppLand.MiniO, AppLand.fromDBCls(CDef.MemberStatus.Withdrawal).get());
        assertFalse(AppLand.fromDBCls(CDef.MemberStatus.Provisional).isPresent());
        assertEquals(2, AppLand.listAll().size());
    }

    public void test_AppPiari_basic() { // matches
        assertEquals(Arrays.asList(AppPiari.OneMan, AppPiari.Parade, AppPiari.MiniO), AppPiari.listAll());
        assertEquals(Arrays.asList(AppPiari.OneMan, AppPiari.Parade), AppPiari.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppPiari.Parade), AppPiari.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppPiari.MiniO), AppPiari.listOfUnauthorized());
        assertTrue(AppPiari.OneMan.sisterSet().isEmpty());
        assertTrue(AppPiari.OneMan.subItemMap().isEmpty());
        assertEquals(3, AppPiari.listAll().size());
    }

    public void test_AppBonvo_basic() { // included with new groups
        assertEquals(Arrays.asList(AppBonvo.Formalized, AppBonvo.Withdrawal, AppBonvo.Provisional, AppBonvo.Mystic), AppBonvo.listAll());
        assertEquals(Arrays.asList(AppBonvo.Formalized, AppBonvo.Provisional), AppBonvo.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppBonvo.Provisional), AppBonvo.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppBonvo.Withdrawal), AppBonvo.listOfUnauthorized());
        assertEquals(Arrays.asList(AppBonvo.Formalized, AppBonvo.Provisional, AppBonvo.Mystic), AppBonvo.listOfAppNewLiteralAvailable());
        assertEquals(Arrays.asList(AppBonvo.Formalized, AppBonvo.Provisional, AppBonvo.Mystic),
                AppBonvo.listOfAppNewRefExistingGroupAvailable());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppBonvo.Formalized.sisterSet());
        assertEquals("1", AppBonvo.Formalized.order());
        assertEquals(4, AppBonvo.listAll().size());
    }

    public void test_AppDstore_basic() { // exists with new groups
        assertEquals(Arrays.asList(AppDstore.OneMan, AppDstore.MiniO), AppDstore.listAll());
        assertEquals(Arrays.asList(AppDstore.OneMan), AppDstore.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppDstore.OneMan, AppDstore.MiniO), AppDstore.listOfAppNewAvailable());
        assertTrue(AppDstore.OneMan.sisterSet().isEmpty());
        assertTrue(AppDstore.OneMan.subItemMap().isEmpty());
    }

    public void test_AppAmba_basic() { // included with new sisters and sub-items
        assertEquals(Arrays.asList(AppAmba.Formalized, AppAmba.Withdrawal, AppAmba.Provisional, AppAmba.Mystic), AppAmba.listAll());
        assertEquals(Arrays.asList(AppAmba.Formalized, AppAmba.Provisional), AppAmba.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppAmba.Withdrawal), AppAmba.listOfUnauthorized());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppAmba.Formalized.sisterSet());
        assertEquals("1", AppAmba.Formalized.order());
    }

    public void test_AppMiraco_basic() { // exists with new sisters and sub-items
        assertEquals(Arrays.asList(AppMiraco.OneMan, AppMiraco.MiniO), AppMiraco.listAll());
        assertEquals(Arrays.asList(AppMiraco.OneMan), AppMiraco.listOfServiceAvailable());
        assertEquals(DfCollectionUtil.newHashSet("ONE"), AppMiraco.OneMan.sisterSet());
        assertEquals("1", AppMiraco.OneMan.order());
        assertEquals("8", AppMiraco.MiniO.order());
    }

    public void test_AppDohotel_basic() { // included with overriding
        assertEquals(CDef.MemberStatus.Formalized.alias(), AppDohotel.OneMan.alias());
        assertEquals(CDef.MemberStatus.Withdrawal.alias(), AppDohotel.Withdrawal.alias());
        assertEquals("Castle", AppDohotel.Provisional.alias());
        assertEquals("Hangar", AppDohotel.Mystic.alias());
        // visual check
        //assertEquals("ParadeTwoYears", AppDohotel.Mystic.comment());
        assertEquals(Arrays.asList(AppDohotel.OneMan, AppDohotel.Withdrawal, AppDohotel.Provisional, AppDohotel.Mystic),
                AppDohotel.listAll());
        assertEquals(Arrays.asList(AppDohotel.OneMan, AppDohotel.Provisional), AppDohotel.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppDohotel.Provisional), AppDohotel.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppDohotel.Withdrawal), AppDohotel.listOfUnauthorized());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppDohotel.OneMan.sisterSet());
        assertEquals(DfCollectionUtil.newHashSet("Route"), AppDohotel.Provisional.sisterSet());
        assertEquals("1", AppDohotel.OneMan.order());
        assertEquals("2", AppDohotel.Withdrawal.order());
        assertEquals("9", AppDohotel.Provisional.order());
        assertEquals("88", AppDohotel.Mystic.order());
    }

    public void test_AppAmphi_basic() { // exists with inheriting
        assertEquals(CDef.MemberStatus.Formalized.alias(), AppAmphi.Formalized.alias()); // inherited
        assertEquals("Castle", AppAmphi.Provisional.alias()); // customized
        // visual check
        //assertEquals("as formal member, allowed to use all service", AppAmphi.Formalized.comment()); // inherited
        //assertEquals("ParadeTwoYears", AppAmphi.Provisional.comment()); // inherited
        assertEquals(Arrays.asList(AppAmphi.Formalized, AppAmphi.Provisional), AppAmphi.listAll());
        assertEquals(Arrays.asList(AppAmphi.Formalized, AppAmphi.Provisional), AppAmphi.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppAmphi.Provisional), AppAmphi.listOfShortOfFormalized());
        assertTrue(AppAmphi.groupOf("unauthorized").isEmpty());
        assertEquals(CDef.MemberStatus.Formalized.sisterSet(), AppAmphi.Formalized.sisterSet()); // inherited
        assertEquals(CDef.MemberStatus.Provisional.sisterSet(), AppAmphi.Provisional.sisterSet()); // inherited
        assertEquals("1", AppAmphi.Formalized.subItemMap().get("order")); // inherited
        assertEquals("3", AppAmphi.Provisional.subItemMap().get("order")); // inherited
    }

    public void test_AppOrien_basic() { // matches with inheriting
        assertEquals(CDef.MemberStatus.Formalized.alias(), AppOrien.OneMan.alias()); // inherited
        assertEquals("Orleans", AppOrien.MiniO.alias()); // plain
        assertEquals("Castle", AppOrien.Provisional.alias()); // customized
        // visual check
        //assertEquals("as formal member, allowed to use all service", AppOrien.OneMan.comment()); // inherited
        //assertEquals(null, AppOrien.MiniO.comment()); // inherited
        //assertEquals("first status after entry, allowed to use only part of service", AppOrien.Provisional.comment()); // inherited
        assertEquals(Arrays.asList(AppOrien.OneMan, AppOrien.MiniO, AppOrien.Provisional), AppOrien.listAll());
        assertEquals(Arrays.asList(AppOrien.OneMan, AppOrien.Provisional), AppOrien.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppOrien.Provisional), AppOrien.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppOrien.MiniO), AppOrien.listOfUnauthorized());
        assertEquals(CDef.MemberStatus.Formalized.sisterSet(), AppOrien.OneMan.sisterSet()); // inherited
        assertTrue(AppOrien.MiniO.sisterSet().isEmpty()); // plain
        assertEquals(CDef.MemberStatus.Provisional.sisterSet(), AppOrien.Provisional.sisterSet()); // inherited
        assertEquals("1", AppOrien.OneMan.order()); // inherited
        assertEquals("5", AppOrien.MiniO.order()); // plain
        assertEquals("9", AppOrien.Provisional.order()); // customized
    }

    public void test_AppCeleb_basic() { // included as group reference
        assertEquals(Arrays.asList(AppCeleb.Formalized, AppCeleb.Provisional), AppCeleb.listAll());
        assertEquals(Arrays.asList(AppCeleb.Formalized, AppCeleb.Provisional), AppCeleb.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppCeleb.Provisional), AppCeleb.listOfShortOfFormalized());
        assertTrue(AppCeleb.groupOf("unauthorized").isEmpty());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppCeleb.Formalized.sisterSet());
        assertEquals("1", AppCeleb.Formalized.order());
        assertEquals("3", AppCeleb.Provisional.order());
    }

    public void test_AppToys_basic() { // exists as group reference
        assertEquals(Arrays.asList(AppToys.OneMan), AppToys.listAll());
        assertEquals(Arrays.asList(AppToys.OneMan), AppToys.listOfServiceAvailable());
        assertTrue(AppToys.groupOf("shortOfFormalized").isEmpty());
        assertTrue(AppToys.groupOf("unauthorized").isEmpty());
        assertTrue(AppToys.OneMan.sisterSet().isEmpty());
        assertTrue(AppToys.OneMan.subItemMap().isEmpty());
    }

    public void test_AppBrighton_basic() { // matches as group reference
        assertEquals(Arrays.asList(AppBrighton.OneMan, AppBrighton.Parade), AppBrighton.listAll());
        assertEquals(Arrays.asList(AppBrighton.OneMan, AppBrighton.Parade), AppBrighton.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppBrighton.Parade), AppBrighton.listOfShortOfFormalized());
        assertTrue(AppBrighton.groupOf("unauthorized").isEmpty());
        assertTrue(AppBrighton.OneMan.sisterSet().isEmpty());
        assertTrue(AppBrighton.Parade.sisterSet().isEmpty());
        assertTrue(AppBrighton.OneMan.subItemMap().isEmpty());
        assertTrue(AppBrighton.Parade.subItemMap().isEmpty());
    }

    // ===================================================================================
    //                                                                  refCls to namedcls
    //                                                                  ==================
    public void test_AppDockside_basic() { // included (of include)
        assertEquals(Arrays.asList(AppDockside.Formalized, AppDockside.Provisional), AppDockside.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppDockside.Provisional), AppDockside.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppDockside.Withdrawal), AppDockside.listOfUnauthorized());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppDockside.Formalized.sisterSet());
        assertEquals("1", AppDockside.Formalized.order());
        assertEquals(AppDockside.Formalized, AppDockside.fromRefCls(LeonardoCDef.DaSea.Formalized).get());
        assertEquals(AppDockside.Withdrawal, AppDockside.fromRefCls(LeonardoCDef.DaSea.Withdrawal).get());
        assertEquals(AppDockside.Provisional, AppDockside.fromRefCls(LeonardoCDef.DaSea.Provisional).get());
        assertEquals(AppDockside.Formalized.toRefCls().get(), LeonardoCDef.DaSea.Formalized);
        assertEquals(AppDockside.Withdrawal.toRefCls().get(), LeonardoCDef.DaSea.Withdrawal);
        assertEquals(AppDockside.Provisional.toRefCls().get(), LeonardoCDef.DaSea.Provisional);
        assertEquals(3, AppDockside.listAll().size());
    }

    public void test_AppHangar_basic() { // included (of exists)
        assertEquals(Arrays.asList(AppHangar.OneMan), AppHangar.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppHangar.MiniO), AppHangar.listOfUnauthorized());
        assertTrue(AppHangar.OneMan.sisterSet().isEmpty());
        assertEquals("shining", AppHangar.OneMan.keyword());
        assertEquals(AppHangar.OneMan, AppHangar.fromRefCls(LeonardoCDef.DaLand.OneMan).get());
        assertEquals(AppHangar.MiniO, AppHangar.fromRefCls(LeonardoCDef.DaLand.MiniO).get());
        assertEquals(AppHangar.OneMan.toRefCls().get(), LeonardoCDef.DaLand.OneMan);
        assertEquals(AppHangar.MiniO.toRefCls().get(), LeonardoCDef.DaLand.MiniO);
        assertEquals(2, AppHangar.listAll().size());
    }

    public void test_AppMagiclamp_basic() { // exists (of include)
        assertEquals(Arrays.asList(AppMagiclamp.OneMan), AppMagiclamp.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppMagiclamp.MiniO), AppMagiclamp.listOfUnauthorized());
        assertTrue(AppMagiclamp.OneMan.sisterSet().isEmpty());
        assertTrue(AppMagiclamp.OneMan.subItemMap().isEmpty());
        assertEquals(AppMagiclamp.OneMan, AppMagiclamp.fromRefCls(LeonardoCDef.DaSea.Formalized).get());
        assertEquals(AppMagiclamp.MiniO, AppMagiclamp.fromRefCls(LeonardoCDef.DaSea.Withdrawal).get());
        assertFalse(AppMagiclamp.fromRefCls(LeonardoCDef.DaSea.Provisional).isPresent());
        assertEquals(AppMagiclamp.OneMan.toRefCls().get(), LeonardoCDef.DaSea.Formalized);
        assertEquals(AppMagiclamp.MiniO.toRefCls().get(), LeonardoCDef.DaSea.Withdrawal);
        assertEquals(2, AppMagiclamp.listAll().size());
    }

    // ===================================================================================
    //                                                      refCls Implicit Classification
    //                                                      ==============================
    // #for_now jflute make refCls Implicit Classification later (2021/07/06)
}
