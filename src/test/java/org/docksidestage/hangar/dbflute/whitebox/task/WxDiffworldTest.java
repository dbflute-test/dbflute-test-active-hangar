package org.docksidestage.hangar.dbflute.whitebox.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.infra.diffmap.DfDiffMapFile;
import org.dbflute.utflute.core.PlainTestCase;

/**
 * @author jflute
 */
public class WxDiffworldTest extends PlainTestCase {

    public void test_diffworld() throws IOException {
        // ## Arrange ##
        SystemScript script = new SystemScript();
        String clientPath = getClientPath();
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

        checkAlterCheck();
    }

    protected void checkAlterCheck() throws IOException {
        String clientPath = getClientPath();
        DfDiffMapFile diffMapFile = new DfDiffMapFile();
        String diffmapPath = clientPath + "/playsql/migration/schema/migration-alter-check.diffmap";
        File alterCheckFile = new File(diffmapPath);
        log("...Checking alter-check diffmap: {}", alterCheckFile);
        assertTrue(alterCheckFile.exists());
        Map<String, Object> alterCheckMap = diffMapFile.readMap(new FileInputStream(alterCheckFile));
        assertEquals(1, alterCheckMap.size());
        @SuppressWarnings("unchecked")
        Map<String, Object> firstMap = (Map<String, Object>) alterCheckMap.values().iterator().next();
        @SuppressWarnings("unchecked")
        Map<String, Object> tableDiffMap = (Map<String, Object>) firstMap.get("tableDiff");
        doCheckAlterCheckTableDiff(tableDiffMap);
    }

    @SuppressWarnings("unchecked")
    private void doCheckAlterCheckTableDiff(Map<String, Object> tableDiffMap) {
        {
            Map<String, Object> tableMap = (Map<String, Object>) tableDiffMap.get("MEMBER");
            assertEquals("CHANGE", tableMap.get("diffType"));
            Map<String, Object> columnDiffMap = (Map<String, Object>) tableMap.get("columnDiff");
            Map<String, Object> memberAccoutMap = (Map<String, Object>) columnDiffMap.get("MEMBER_ACCOUNT");
            assertEquals("CHANGE", memberAccoutMap.get("diffType"));
            Map<String, Object> columnSizeDiffMap = (Map<String, Object>) memberAccoutMap.get("columnSizeDiff");
            assertEquals("80", columnSizeDiffMap.get("next"));
            assertEquals("50", columnSizeDiffMap.get("previous"));
        }
        {
            Map<String, Object> tableMap = (Map<String, Object>) tableDiffMap.get("MEMBER_LOGIN");
            assertEquals("CHANGE", tableMap.get("diffType"));
            Map<String, Object> columnDefOrderDiffMap = (Map<String, Object>) tableMap.get("columnDefOrderDiff");
            assertEquals("MOBILE_LOGIN_FLG(2)", columnDefOrderDiffMap.get("next"));
            assertEquals("MOBILE_LOGIN_FLG(4)", columnDefOrderDiffMap.get("previous"));
        }
    }

    private String getClientPath() throws IOException {
        return getProjectDir().getCanonicalPath() + "/dbflute_maihamadb";
    }
}
