package org.docksidestage.hangar.dbflute.whitebox.world.syncworld;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

/**
 * @author jflute
 */
public class WxSyncworldTest extends PlainTestCase {

    public void test_syncworld() throws IOException {
        // #hope jflute tests failure pattern here (2018/06/02)
        doTest_syncworld(/*clean*/true); // no existing resources
        doTest_syncworld(/*clean*/false); // overriding existing resources
    }

    private void doTest_syncworld(boolean clean) {
        // ## Arrange ##
        long before = System.currentTimeMillis();
        try {
            SystemScript script = new SystemScript();
            String clientPath = getClientPath();
            File clientDir = new File(clientPath);
            assertTrue(clientDir.exists());
            String fileName = "syncworld-test.sh";

            // ## Act ##
            String[] scriptArgs = clean ? new String[] { "clean" } : new String[] {};
            log("...Executing syncworld: {}, {}", fileName, Arrays.asList(scriptArgs));
            ProcessResult result = script.execute(clientDir, fileName);

            // ## Assert ##
            log("Finished the syncworld: {}, {}", result.getProcessName(), result.getExitCode());
            assertEquals(0, result.getExitCode());
            String console = result.getConsole();
            log(console);
            assertContains(console, "BUILD SUCCESSFUL"); // no difference

            String docPath = getOutputDocPath();
            assertFalse(new File(docPath + "/syncworld-sync-check-result.html").exists()); // success
        } finally {
            long after = System.currentTimeMillis();
            log("performanceCost:[{}]", DfTraceViewUtil.convertToPerformanceView(after - before));
        }
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

    private String getOutputDocPath() {
        return getClientPath() + "/output/doc";
    }
}
