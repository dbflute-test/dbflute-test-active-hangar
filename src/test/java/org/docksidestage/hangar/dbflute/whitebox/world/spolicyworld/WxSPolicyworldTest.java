package org.docksidestage.hangar.dbflute.whitebox.world.spolicyworld;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author subaru
 */
public class WxSPolicyworldTest extends PlainTestCase {
    public void test_spolicyworld() {
        doTest_spolicyworld();
    }

    protected void doTest_spolicyworld() {
        // ## Arrange ##
        long before = System.currentTimeMillis();
        try {
            SystemScript script = new SystemScript();
            String clientPath = getClientPath();
            File clientDir = new File(clientPath);
            assertTrue(clientDir.exists());
            String fileName = "spolicyworld-test.sh";

            // ## Act ##
            String[] scriptArgs = new String[] {};
            log("...Executing spolicyworld: {}, {}", fileName, Arrays.asList(scriptArgs));
            ProcessResult result = script.execute(clientDir, fileName, scriptArgs);

            // ## Assert ##
            log("Finished the spolicyworld: {}, {}", result.getProcessName(), result.getExitCode());
            assertEquals(0, result.getExitCode());
            String console = result.getConsole();
            log(console);
            checkBadThenTheme(console);
            checkClassificationThenTheme(console);
        } finally {
            long after = System.currentTimeMillis();
            log("performanceCost:[{}]", DfTraceViewUtil.convertToPerformanceView(after - before));
        }
    }

    // ===================================================================================
    //                                                                   SchemaPolicyCheck
    //                                                                   =================
    private void checkBadThenTheme(String console) {
        assertContains(console, "The column is no good: (商品)PRODUCT.PRODUCT_ONSALES_FLAG INTEGER(10) (NotNull)");
    }

    private void checkClassificationThenTheme(String console) {
        assertContains(console, "column.statement: if columnName is suffix:_SERVICE_RANK then classification");
        assertContains(console, "column.statement: if columnName is suffix:_SERVICE_RANK then classification(ServiceRank)");
    }

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
