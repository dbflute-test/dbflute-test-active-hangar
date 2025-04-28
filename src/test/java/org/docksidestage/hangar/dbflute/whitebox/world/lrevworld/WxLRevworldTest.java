package org.docksidestage.hangar.dbflute.whitebox.world.lrevworld;

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
public class WxLRevworldTest extends PlainTestCase {

    public void test_lrevworld() throws IOException {
        // #hope jflute will tests replace-schema output pattern here (2018/06/02)
        replaceSchema(); // not to depend on state
        doTest_lrevworld(/*clean*/true); // no existing resources
        doTest_lrevworld(/*clean*/false); // overriding existing resources
    }

    private void doTest_lrevworld(boolean clean) {
        // ## Arrange ##
        long before = System.currentTimeMillis();
        try {
            SystemScript script = new SystemScript();
            script.consoleLiner(line -> {
                log(line);
            });
            String clientPath = getClientPath();
            File clientDir = new File(clientPath);
            assertTrue(clientDir.exists());
            String fileName = "lrevworld-test.sh";

            // ## Act ##
            String[] scriptArgs = clean ? new String[] { "clean" } : new String[] {};
            log("...Executing lrevworld: {}, {}", fileName, Arrays.asList(scriptArgs));
            ProcessResult result = script.execute(clientDir, fileName, scriptArgs);

            // ## Assert ##
            log("Finished the lrevworld: {}, {}", result.getProcessName(), result.getExitCode());
            assertEquals(0, result.getExitCode());
            String console = result.getConsole();
            assertContains(console, "...Outputting load data");
            assertContains(console, "MEMBER (20)");
            assertContains(console, "BUILD SUCCESSFUL");

            String dataPath = getOutputDocPath() + "/data/xls";
            assertTrue(new File(dataPath + "/reverse-data-07-MEMBER.xls").exists()); // changeable
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
    private void replaceSchema() {
        SystemScript script = new SystemScript();
        script.consoleLiner(line -> log(line));
        script.env("answer", "y");
        script.execute(new File(getClientPath()), "manage.sh", new String[] { "0" });
    }

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
