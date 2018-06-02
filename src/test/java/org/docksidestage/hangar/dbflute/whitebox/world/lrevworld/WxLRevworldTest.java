package org.docksidestage.hangar.dbflute.whitebox.world.lrevworld;

import java.io.File;
import java.io.IOException;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

/**
 * @author jflute
 */
public class WxLRevworldTest extends PlainTestCase {

    public void test_lrevworld() throws IOException {
        // ## Arrange ##
        long before = System.currentTimeMillis();
        try {
            SystemScript script = new SystemScript();
            String clientPath = getClientPath();
            File clientDir = new File(clientPath);
            assertTrue(clientDir.exists());
            String fileName = "lrevworld-test.sh";

            // ## Act ##
            log("...Executing lrevworld: {}", fileName);
            ProcessResult result = script.execute(clientDir, fileName);

            // ## Assert ##
            log("Finished the lrevworld: {}, {}", result.getProcessName(), result.getExitCode());
            assertEquals(0, result.getExitCode());
            String console = result.getConsole();
            log(console);
            assertContains(console, "...Outputting load data");
            assertContains(console, "MEMBER (10)");
            assertContains(console, "BUILD SUCCESSFUL");

            String dataPath = getOutputDocPath() + "/data";
            assertTrue(new File(dataPath + "/reverse-data-05-MEMBER.xls").exists());
            assertTrue(new File(dataPath + "/reverse-data-result.dfmark").exists());
            assertTrue(new File(dataPath + "/tableNameMap.dataprop").exists());
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
