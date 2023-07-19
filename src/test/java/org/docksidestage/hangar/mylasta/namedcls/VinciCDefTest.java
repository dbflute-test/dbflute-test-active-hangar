package org.docksidestage.hangar.mylasta.namedcls;

import org.dbflute.utflute.core.PlainTestCase;

/**
 * @author jflute
 */
public class VinciCDefTest extends PlainTestCase {

    public void test_simpleDeterminationMethod_basic() {
        VinciCDef.DaSea sea = VinciCDef.DaSea.Formalized;
        assertTrue(sea.isFormalized());
        assertFalse(sea.isProvisional()); // 100% false

        // no compile error even if enum comparation so same
        assertFalse(sea == VinciCDef.DaSea.Provisional);
    }
}
