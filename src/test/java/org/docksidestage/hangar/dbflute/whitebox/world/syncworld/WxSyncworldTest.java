package org.docksidestage.hangar.dbflute.whitebox.world.syncworld;

import java.io.File;
import java.io.IOException;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

/**
 * @author jflute
 */
public class WxSyncworldTest extends PlainTestCase {

    public void test_syncworld() throws IOException {
        // ## Arrange ##
        long before = System.currentTimeMillis();
        try {
            SystemScript script = new SystemScript();
            String clientPath = getClientPath();
            File clientDir = new File(clientPath);
            assertTrue(clientDir.exists());
            String fileName = "syncworld-test.sh";

            // ## Act ##
            log("...Executing syncworld: {}", fileName);
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
