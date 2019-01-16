package org.docksidestage.hangar.dbflute.whitebox.world.spolicyworld;

import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

import java.io.File;
import java.io.IOException;

/**
 * @author subaru
 */
public class WxSPolicyworldTest extends PlainTestCase {
    public void test_spolicyworld() {
        doTest_spolicyworld(/*clean*/true);
        doTest_spolicyworld(/*clean*/false);
    }

    protected void doTest_spolicyworld(boolean clean) {
        // ## Arrange ##
        long before = System.currentTimeMillis();
        try {
            SystemScript script = new SystemScript();
            String clientPath = getClientPath();
            File clientDir = new File(clientPath);
            assertTrue(clientDir.exists());
            String fileName = "spolicyworld-test.sh";

            // ## Act ##

            // ## Assert ##

        } finally {
            long after = System.currentTimeMillis();
            log("performanceCost:[{}]", DfTraceViewUtil.convertToPerformanceView(after - before));
        }
    }

    // ===================================================================================
    //                                                                   SchemaPolicyCheck
    //                                                                   =================

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private String getClientPath() {
        try {
            return getProjectDir().getCanonicalPath() + "/dbflute_maihamadb";
        } catch (IOException e) {
            throw new IllegalStateException("Cannot get canonical path.", e);
        }
    }
}
