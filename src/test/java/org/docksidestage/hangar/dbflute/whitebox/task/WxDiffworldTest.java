package org.docksidestage.hangar.dbflute.whitebox.task;

import java.io.File;
import java.io.IOException;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;

/**
 * @author jflute
 */
public class WxDiffworldTest extends PlainTestCase {

    public void test_diffworld() throws IOException {
        // ## Arrange ##
        SystemScript script = new SystemScript();
        String clientPath = getProjectDir().getCanonicalFile() + "/dbflute_maihamadb";
        File clientDir = new File(clientPath);
        assertTrue(clientDir.exists());
        String fileName = "diffworld-test.sh";

        // ## Act ##
        log("...Executing diffworld: {}", fileName);
        ProcessResult result = script.execute(clientDir, fileName);

        // ## Assert ##
        log("Finished the diffworld: {}, {}", result.getProcessName(), result.getExitCode());
        assertEquals(0, result.getExitCode());
        String console = result.getConsole();
        log(console);
        assertContains(console, "Ghastly Tragedy"); // SchemaSyncCheck
        assertContains(console, "Migration Failure"); // AlterCheck
    }
}
