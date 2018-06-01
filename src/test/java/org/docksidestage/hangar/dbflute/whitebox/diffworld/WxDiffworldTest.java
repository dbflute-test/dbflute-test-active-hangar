package org.docksidestage.hangar.dbflute.whitebox.diffworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

import org.dbflute.helper.filesystem.FileTextIO;
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

        checkDBFluteEnvironmentType();
        checkArrangeBeforeReps();
        checkCraftDiff();
        checkSchemaSyncCheck();
        checkAlterCheck();
    }

    // ===================================================================================
    //                                                              DBFluteEnvironmentType
    //                                                              ======================
    protected void checkDBFluteEnvironmentType() {
        assertTrue(new File(getDfpropPath() + "/diffworld/diffworlddb.mv.db").exists());
        assertTrue(new File(getDfpropPath() + "/diffworld/diffworlddb.trace.db").exists());
    }

    // ===================================================================================
    //                                                                   ArrangeBeforeReps
    //                                                                   =================
    protected void checkArrangeBeforeReps() {
        String diffworldPath = getPlaysqlPath() + "/data/diffworld/xls";
        assertTrue(new File(diffworldPath + "/20-member.xls").exists());
        assertTrue(new File(diffworldPath + "/30-product.xls").exists());
        assertTrue(new File(diffworldPath + "/defaultValueMap.dataprop").exists());
    }

    // ===================================================================================
    //                                                                           CraftDiff
    //                                                                           =========
    protected void checkCraftDiff() throws IOException {
        FileTextIO textIO = new FileTextIO().encodeAsUTF8();
        String diffworldPath = getSchemaPath() + "/craftdiff/diffworld";
        {
            File memberNext = new File(diffworldPath + "/craft-meta-Member-next.tsv");
            assertTrue(memberNext.exists());
            assertFalse(new File(diffworldPath + "/craft-meta-Member-previous.tsv").exists());
            String nextText = textIO.read(new FileInputStream(memberNext));
            assertContainsAll(nextText, "Stojkovic", "Pixy", "diffworld", "\"diff\"\"\t\"\"world\"");
        }
        {
            File statusNext = new File(diffworldPath + "/craft-meta-MemberStatus-next.tsv");
            assertTrue(statusNext.exists());
            File statusPrevious = new File(diffworldPath + "/craft-meta-MemberStatus-previous.tsv");
            assertTrue(statusPrevious.exists());
            String nextText = textIO.read(new FileInputStream(statusNext));
            String previousText = textIO.read(new FileInputStream(statusPrevious));
            assertContainsAll(nextText, "DIF", "DiffWorld", "\"9\"");
            assertNotContains(previousText, "DIF");
            assertNotContains(previousText, "DiffWorld");
            assertNotContains(previousText, "\"9\"");
        }
        {
            assertTrue(new File(diffworldPath + "/craft-meta-Product-next.tsv").exists());
            assertTrue(new File(diffworldPath + "/craft-meta-TableCls-next.tsv").exists());
            assertTrue(new File(diffworldPath + "/craft-meta-TableCls-previous.tsv").exists());
        }
    }

    // ===================================================================================
    //                                                                     SchemaSyncCheck
    //                                                                     ===============
    protected void checkSchemaSyncCheck() throws IOException {
        String diffmapPath = getSchemaPath() + "/project-sync-check.diffmap";
        DfDiffMapFile diffMapFile = new DfDiffMapFile();
        Map<String, Object> diffMap = diffMapFile.readMap(new FileInputStream(new File(diffmapPath)));
        assertHasOnlyOneElement(diffMap.keySet());
        @SuppressWarnings("unchecked")
        Map<String, Object> itemMap = (Map<String, Object>) diffMap.values().iterator().next();
        assertNotNull(itemMap.get("diffAuthor"));
        assertNotNull(itemMap.get("diffGitBranch"));

        @SuppressWarnings("unchecked")
        Map<String, Map<String, Object>> tableDiffMap = (Map<String, Map<String, Object>>) itemMap.get("tableDiff");
        {
            Map<String, Object> memberMap = tableDiffMap.get("MEMBER");
            assertEquals("CHANGE", memberMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, Map<String, Object>> columnDiffMap = (Map<String, Map<String, Object>>) memberMap.get("columnDiff");
            Map<String, Object> accountMap = columnDiffMap.get("MEMBER_ACCOUNT");
            assertEquals("CHANGE", accountMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, String> columnSizeDiffMap = (Map<String, String>) accountMap.get("columnSizeDiff");
            assertEquals("80", columnSizeDiffMap.get("next"));
            assertEquals("50", columnSizeDiffMap.get("previous"));
        }
        {
            Map<String, Object> loingMap = tableDiffMap.get("MEMBER_LOGIN");
            assertEquals("CHANGE", loingMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, String> columnDefOrderDiffMap = (Map<String, String>) loingMap.get("columnDefOrderDiff");
            assertEquals("MOBILE_LOGIN_FLG(2)", columnDefOrderDiffMap.get("next"));
            assertEquals("MOBILE_LOGIN_FLG(4)", columnDefOrderDiffMap.get("previous"));
            @SuppressWarnings("unchecked")
            Map<String, Map<String, Object>> indexDiffMap = (Map<String, Map<String, Object>>) loingMap.get("indexDiff");
            Map<String, Object> loginDatetimeIndexMap = indexDiffMap.get("IX_MEMBER_LOGIN_DATETIME");
            assertEquals("DELETE", loginDatetimeIndexMap.get("diffType"));
        }
    }

    // ===================================================================================
    //                                                                          AlterCheck
    //                                                                          ==========
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
            Map<String, Object> tableMap = (Map<String, Object>) tableDiffMap.get("MEMBER_FOLLOWING");
            assertEquals("ADD", tableMap.get("diffType"));
        }
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

    private String getDfpropPath() {
        return getClientPath() + "/dfprop";
    }

    private String getPlaysqlPath() {
        return getClientPath() + "/playsql";
    }

    private String getSchemaPath() {
        return getClientPath() + "/schema";
    }
}
