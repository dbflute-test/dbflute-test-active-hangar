package org.docksidestage.hangar.mylasta.appcls;

import java.util.Arrays;

import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppAmba;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppBonvo;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppDohotel;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppDstore;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppLand;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppMiraco;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppPiari;
import org.docksidestage.hangar.mylasta.appcls.AppCDef.AppSea;

/**
 * @author jflute
 * @since 1.2.5 (2021/07/06 Tuesday at roppongi japanese)
 */
public class AppCDefTest extends PlainTestCase {

    // ===================================================================================
    //                                                         refCls Table Classification
    //                                                         ===========================
    public void test_AppSea_basic() { // included
        assertEquals(Arrays.asList(AppSea.Formalized, AppSea.Provisional), AppSea.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppSea.Provisional), AppSea.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppSea.Withdrawal), AppSea.listOfUnauthorized());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppSea.Formalized.sisterSet());
        assertEquals("1", AppSea.Formalized.order());
    }

    public void test_AppLand_basic() { // exists
        assertEquals(Arrays.asList(AppLand.OneMan, AppLand.MiniO), AppLand.listAll());
        assertEquals(Arrays.asList(AppLand.OneMan), AppLand.listOfServiceAvailable());
        assertTrue(AppLand.groupOf("shortOfFormalized").isEmpty());
        assertEquals(Arrays.asList(AppLand.MiniO), AppLand.listOfUnauthorized());
        assertTrue(AppLand.OneMan.sisterSet().isEmpty());
        assertTrue(AppLand.OneMan.subItemMap().isEmpty());
    }

    public void test_AppPiari_basic() { // matches
        assertEquals(Arrays.asList(AppPiari.OneMan, AppPiari.Parade, AppPiari.MiniO), AppPiari.listAll());
        assertEquals(Arrays.asList(AppPiari.OneMan, AppPiari.Parade), AppPiari.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppPiari.Parade), AppPiari.listOfShortOfFormalized());
        assertEquals(Arrays.asList(AppPiari.MiniO), AppPiari.listOfUnauthorized());
        assertTrue(AppPiari.OneMan.sisterSet().isEmpty());
        assertTrue(AppPiari.OneMan.subItemMap().isEmpty());
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

    public void test_AppDohotel_basic() { // included as group reference
        assertEquals(Arrays.asList(AppDohotel.Formalized, AppDohotel.Provisional), AppDohotel.listAll());
        assertEquals(Arrays.asList(AppDohotel.Formalized, AppDohotel.Provisional), AppDohotel.listOfServiceAvailable());
        assertEquals(Arrays.asList(AppDohotel.Provisional), AppDohotel.listOfShortOfFormalized());
        assertTrue(AppDohotel.groupOf("unauthorized").isEmpty());
        assertEquals(DfCollectionUtil.newHashSet("Formalized"), AppDohotel.Formalized.sisterSet());
        assertEquals("1", AppDohotel.Formalized.order());
        assertEquals("3", AppDohotel.Provisional.order());
    }

    // ===================================================================================
    //                                                      refCls Implicit Classification
    //                                                      ==============================
    // #for_now jflute make refCls Implicit Classification later (2021/07/06)
}
