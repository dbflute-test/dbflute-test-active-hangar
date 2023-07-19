package org.docksidestage.hangar.mylasta.webcls;

import org.dbflute.utflute.core.PlainTestCase;

/**
 * @author jflute
 */
public class WebCDefTest extends PlainTestCase {

    public void test_simpleDeterminationMethod_basic() {
        WebCDef.WebDockside dockside = WebCDef.WebDockside.Formalized;
        assertTrue(dockside.isFormalized());
        assertFalse(dockside.isProvisional()); // 100% false

        // no compile error even if enum comparation so same
        assertFalse(dockside == WebCDef.WebDockside.Provisional);
    }

    @SuppressWarnings("deprecation")
    public void test_simpleDeterminationMethod_deprecated() {
        WebCDef.DeepWxDeprecatedElement dockside = WebCDef.DeepWxDeprecatedElement.Formalized;
        assertTrue(dockside.isFormalized());
        assertFalse(dockside.isProvisional()); // 100% false
    }
}
