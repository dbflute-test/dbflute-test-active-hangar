package org.docksidestage.hangar.dbflute.whitebox.world.spolicyworld;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

/**
 * @author subaru
 * @author jflute
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
            script.consoleLiner(line -> {
                log(line);
            });
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
            checkClassificationIfValue(console);
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
    private void checkClassificationIfValue(String console) {
        assertContains(console, "column.statement: if column is classification then dbType is CHAR or INTEGER");
        assertContains(console, "column.statement: if column is classification(Flg) then dbType is CHAR or INTEGER");
    }

    private void checkBadThenTheme(String console) {
        assertContains(console, "column.statement: if columnName is suffix:_FLAG then bad");
    }

    private void checkClassificationThenTheme(String console) {
        assertContains(console, "column.statement: if columnName is suffix:_SERVICE_RANK then classification");
        assertContains(console, "column.statement: if columnName is suffix:_SERVICE_RANK then classification(ServiceRank)");
        assertContains(console, "column.statement: if columnName is suffix:_SERVICE_RANK then column is classification");
        assertContains(console, "column.statement: if columnName is suffix:_SERVICE_RANK then column is classification(ServiceRank)");
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
