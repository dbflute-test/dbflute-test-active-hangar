package org.docksidestage.hangar.dbflute.whitebox.world.diffworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.dbflute.helper.filesystem.FileTextIO;
import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.infra.diffmap.DfDiffMapFile;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;

/**
 * @author jflute
 */
public class WxDiffworldTest extends PlainTestCase {

    public void test_diffworld() throws IOException {
        replaceSchema(); // not to depend on state
        doTest_diffworld(/*clean*/true); // no existing resources
        doTest_diffworld(/*clean*/false); // overriding existing resources
    }

    protected void doTest_diffworld(boolean clean) throws IOException {
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
            String fileName = "diffworld-test.sh";

            // ## Act ##
            String[] scriptArgs = clean ? new String[] { "clean" } : new String[] {};
            log("...Executing diffworld: {}, {}", fileName, Arrays.asList(scriptArgs));
            ProcessResult result = script.execute(clientDir, fileName, scriptArgs);

            // ## Assert ##
            log("Finished the diffworld: {}, {}", result.getProcessName(), result.getExitCode());
            assertEquals(0, result.getExitCode());
            String console = result.getConsole();
            log(console);
            if (clean) {
                assertContains(console, "...Cleaning existing resources");
            }
            assertContains(console, "Ghastly Tragedy"); // SchemaSyncCheck
            assertContains(console, "Migration Failure"); // AlterCheck

            checkDBFluteEnvironmentType();
            checkArrangeBeforeReps();
            checkCraftDiff(clean);
            checkSchemaSyncCheck();
            checkAlterCheck();
        } finally {
            long after = System.currentTimeMillis();
            log("performanceCost:[{}]", DfTraceViewUtil.convertToPerformanceView(after - before));
        }
    }

    // ===================================================================================
    //                                                              DBFluteEnvironmentType
    //                                                              ======================
    protected void checkDBFluteEnvironmentType() {
        assertTrue(new File(getDfpropPath() + "/diffworld/diffworlddb.mv.db").exists());
        assertTrue(new File(getDfpropPath() + "/diffworld/diffworlddb.trace.db").exists());
        assertTrue(new File(getOutputDocPath() + "/diffworld-history-maihamadb.html").exists());
        assertTrue(new File(getOutputDocPath() + "/diffworld-schema-maihamadb.html").exists());
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
    protected void checkCraftDiff(boolean clean) throws IOException {
        FileTextIO textIO = new FileTextIO().encodeAsUTF8();
        String diffworldPath = getSchemaPath() + "/craftdiff/diffworld";
        {
            File memberNext = new File(diffworldPath + "/craft-meta-Member-next.tsv");
            assertTrue(memberNext.exists());
            File memberPrevious = new File(diffworldPath + "/craft-meta-Member-previous.tsv");
            if (clean) {
                assertFalse(memberPrevious.exists());
            } else {
                assertTrue(memberPrevious.exists());
            }
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
    @SuppressWarnings("unchecked")
    protected void checkSchemaSyncCheck() throws IOException {
        String schemaPath = getSchemaPath();
        String diffmapPath = schemaPath + "/project-sync-check.diffmap";
        DfDiffMapFile diffMapFile = new DfDiffMapFile();
        Map<String, Object> diffMap = diffMapFile.readMap(new FileInputStream(new File(diffmapPath)));
        // already several diff histories so may be unneeded?
        //assertHasOnlyOneElement(diffMap.keySet());
        Map<String, Object> firstMap = (Map<String, Object>) diffMap.values().iterator().next();
        doCheckSchemaSyncCheckBasic(firstMap);
        doCheckSchemaSyncCheckTableDiff(firstMap);
        doCheckSchemaSyncCheckSequenceDiff(firstMap);
        doCheckSchemaSyncCheckProcedureDiff(firstMap, "MAIHAMADB"); // deleted function is main DB
        doCheckSchemaSyncCheckCraftDiff(firstMap);
        assertTrue(new File(schemaPath + "/project-sync-schema.xml").exists());
        assertTrue(new File(getOutputDocPath() + "/diffworld-sync-check-result.html").exists());
    }

    private void doCheckSchemaSyncCheckBasic(Map<String, Object> firstMap) {
        // these are changeable by environment so simple check
        assertNotNull(firstMap.get("diffDate"));
        assertNotNull(firstMap.get("diffAuthor"));
        assertNotNull(firstMap.get("diffGitBranch")); // if failed here, confirm your git command environment
    }

    private void doCheckSchemaSyncCheckTableDiff(Map<String, Object> firstMap) {
        @SuppressWarnings("unchecked")
        Map<String, Map<String, Object>> tableDiffMap = (Map<String, Map<String, Object>>) firstMap.get("tableDiff");
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
            Map<String, Object> loginMap = tableDiffMap.get("MEMBER_LOGIN");
            assertEquals("CHANGE", loginMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, String> columnDefOrderDiffMap = (Map<String, String>) loginMap.get("columnDefOrderDiff");
            assertEquals("MOBILE_LOGIN_FLG(2)", columnDefOrderDiffMap.get("next"));
            assertEquals("MOBILE_LOGIN_FLG(4)", columnDefOrderDiffMap.get("previous"));
            @SuppressWarnings("unchecked")
            Map<String, Map<String, Object>> indexDiffMap = (Map<String, Map<String, Object>>) loginMap.get("indexDiff");
            Map<String, Object> loginDatetimeIndexMap = indexDiffMap.get("IX_MEMBER_LOGIN_DATETIME");
            assertEquals("DELETE", loginDatetimeIndexMap.get("diffType"));
        }
        {
            Map<String, Object> productMap = tableDiffMap.get("PRODUCT");
            assertEquals("CHANGE", productMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, Map<String, Object>> columnDiffMap = (Map<String, Map<String, Object>>) productMap.get("columnDiff");
            Map<String, Object> accountMap = columnDiffMap.get("PRODUCT_NAME");
            assertEquals("CHANGE", accountMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, String> columnSizeDiffMap = (Map<String, String>) accountMap.get("columnSizeDiff");
            assertEquals("90", columnSizeDiffMap.get("next"));
            assertEquals("50", columnSizeDiffMap.get("previous"));
        }
        {
            // also view's metadata updated
            Map<String, Object> productMap = tableDiffMap.get("SUMMARY_PRODUCT");
            assertEquals("CHANGE", productMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, Map<String, Object>> columnDiffMap = (Map<String, Map<String, Object>>) productMap.get("columnDiff");
            Map<String, Object> accountMap = columnDiffMap.get("PRODUCT_NAME");
            assertEquals("CHANGE", accountMap.get("diffType"));
            @SuppressWarnings("unchecked")
            Map<String, String> columnSizeDiffMap = (Map<String, String>) accountMap.get("columnSizeDiff");
            assertEquals("90", columnSizeDiffMap.get("next"));
            assertEquals("50", columnSizeDiffMap.get("previous"));
        }
    }

    @SuppressWarnings("unchecked")
    private void doCheckSchemaSyncCheckSequenceDiff(Map<String, Object> firstMap) {
        Map<String, Map<String, Object>> sequenceDiffMap = (Map<String, Map<String, Object>>) firstMap.get("sequenceDiff");
        {
            Map<String, Object> diffworldSeqMap = sequenceDiffMap.get("DIFFWORLDDB.PUBLIC.SEQ_DIFFWORLD");
            assertEquals("ADD", diffworldSeqMap.get("diffType"));
        }
        {
            Map<String, Object> purchaseSeqMap = sequenceDiffMap.get("DIFFWORLDDB.PUBLIC.SEQ_PURCHASE");
            assertEquals("CHANGE", purchaseSeqMap.get("diffType"));
            Map<String, Object> incrementSizeDiffMap = (Map<String, Object>) purchaseSeqMap.get("incrementSizeDiff");
            assertEquals("99", incrementSizeDiffMap.get("next"));
            assertEquals("8", incrementSizeDiffMap.get("previous"));
        }
    }

    @SuppressWarnings("unchecked")
    private void doCheckSchemaSyncCheckProcedureDiff(Map<String, Object> firstMap, String deletedFnCatalog) {
        Map<String, Map<String, Object>> procedureDiffMap = (Map<String, Map<String, Object>>) firstMap.get("procedureDiff");
        {
            Map<String, Object> diffworldFnMap = procedureDiffMap.get("DIFFWORLDDB.PUBLIC.FN_DIFF_WORLD");
            assertEquals("ADD", diffworldFnMap.get("diffType"));
        }
        {
            Map<String, Object> noParameterSpMap = procedureDiffMap.get("DIFFWORLDDB.PUBLIC.SP_NO_PARAMETER");
            assertEquals("CHANGE", noParameterSpMap.get("diffType"));
            Map<String, Object> sourceLineDiffMap = (Map<String, Object>) noParameterSpMap.get("sourceLineDiff");
            assertEquals("\"8\"", sourceLineDiffMap.get("next")); // #hope remove unneeded quotation 
            assertEquals("\"6\"", sourceLineDiffMap.get("previous"));
            assertNotNull(noParameterSpMap.get("sourceSizeDiff"));
            assertNotNull(noParameterSpMap.get("sourceHashDiff"));
        }
        {
            Map<String, Object> noParameterFnMap = procedureDiffMap.get(deletedFnCatalog + ".PUBLIC.FN_NO_PARAMETER");
            assertEquals("DELETE", noParameterFnMap.get("diffType"));
        }
    }

    @SuppressWarnings("unchecked")
    private void doCheckSchemaSyncCheckCraftDiff(Map<String, Object> firstMap) {
        Map<String, Map<String, Object>> craftDiffMap = (Map<String, Map<String, Object>>) firstMap.get("craftDiff");
        {
            Map<String, Object> memberMap = craftDiffMap.get("Member");
            Map<String, Map<String, Object>> craftRowDiffMap = (Map<String, Map<String, Object>>) memberMap.get("craftRowDiff");
            {
                Map<String, Object> akagiMap = craftRowDiffMap.get("\u30a2\u30ab\u30ae");
                assertEquals("CHANGE", akagiMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) akagiMap.get("craftValueDiff");
                assertEquals("\"diffworld|null\"", craftValueDiffMap.get("next"));
                assertEquals("\"Akagi|null\"", craftValueDiffMap.get("previous"));
            }
            {
                Map<String, Object> maslovarMap = craftRowDiffMap.get("Maslovar");
                assertEquals("CHANGE", maslovarMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) maslovarMap.get("craftValueDiff");
                assertEquals("\"diff\"\t\"world|1967-02-20\"", craftValueDiffMap.get("next"));
                assertEquals("\"JEFUnited|1967-02-20\"", craftValueDiffMap.get("previous"));
            }
        }
        {
            Map<String, Object> statusMap = craftDiffMap.get("MemberStatus");
            Map<String, Map<String, Object>> craftRowDiffMap = (Map<String, Map<String, Object>>) statusMap.get("craftRowDiff");
            {
                Map<String, Object> difMap = craftRowDiffMap.get("DIF");
                assertEquals("ADD", difMap.get("diffType"));
            }
            {
                Map<String, Object> difMap = craftRowDiffMap.get("FML");
                assertEquals("CHANGE", difMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) difMap.get("craftValueDiff");
                assertEquals("\"Formalized|9\"", craftValueDiffMap.get("next"));
                assertEquals("\"Formalized|1\"", craftValueDiffMap.get("previous"));
            }
        }
        {
            Map<String, Object> clsMap = craftDiffMap.get("TableCls");
            Map<String, Map<String, Object>> craftRowDiffMap = (Map<String, Map<String, Object>>) clsMap.get("craftRowDiff");
            {
                Map<String, Object> difMap = craftRowDiffMap.get("MEMBER_STATUS::DIF");
                assertEquals("ADD", difMap.get("diffType"));
            }
            {
                Map<String, Object> difMap = craftRowDiffMap.get("MEMBER_STATUS::FML");
                assertEquals("CHANGE", difMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) difMap.get("craftValueDiff");
                assertEquals("\"Formalized|9\"", craftValueDiffMap.get("next"));
                assertEquals("\"Formalized|1\"", craftValueDiffMap.get("previous"));
            }
        }
    }

    // ===================================================================================
    //                                                                          AlterCheck
    //                                                                          ==========
    @SuppressWarnings("unchecked")
    protected void checkAlterCheck() throws IOException {
        String playsqlPath = getPlaysqlPath();
        DfDiffMapFile diffMapFile = new DfDiffMapFile();
        String diffmapPath = playsqlPath + "/migration/schema/migration-alter-check.diffmap";
        File alterCheckFile = new File(diffmapPath);
        log("...Checking alter-check diffmap: {}", alterCheckFile);
        assertTrue(alterCheckFile.exists());
        Map<String, Object> alterCheckMap = diffMapFile.readMap(new FileInputStream(alterCheckFile));
        assertEquals(1, alterCheckMap.size());
        Map<String, Object> firstMap = (Map<String, Object>) alterCheckMap.values().iterator().next();
        doCheckAlterCheckBasic(firstMap);
        doCheckAlterCheckTableDiff(firstMap);
        doCheckAlterCheckSequenceDiff(firstMap);
        doCheckAlterCheckProcedureDiff(firstMap);
        doCheckAlterCheckCraftDiff(firstMap);
        assertTrue(new File(playsqlPath + "/migration/alter/alter-schema.sql").exists());
        assertTrue(new File(playsqlPath + "/migration/schema/alter-check-result.html").exists());
    }

    @SuppressWarnings("unchecked")
    private void doCheckAlterCheckBasic(Map<String, Object> firstMap) {
        doCheckSchemaSyncCheckBasic(firstMap); // same

        Map<String, Object> tableCount = (Map<String, Object>) firstMap.get("tableCount");
        assertNotNull(tableCount.get("next")); // may be increased (test table will be added)
        assertEquals("22", tableCount.get("previous"));
    }

    @SuppressWarnings("unchecked")
    private void doCheckAlterCheckTableDiff(Map<String, Object> firstMap) {
        doCheckSchemaSyncCheckTableDiff(firstMap); // same

        Map<String, Object> tableDiffMap = (Map<String, Object>) firstMap.get("tableDiff");
        {
            Map<String, Object> followingMap = (Map<String, Object>) tableDiffMap.get("MEMBER_FOLLOWING");
            assertEquals("ADD", followingMap.get("diffType"));
        }
        {
            Map<String, Object> paymentMap = (Map<String, Object>) tableDiffMap.get("PURCHASE_PAYMENT");
            assertEquals("ADD", paymentMap.get("diffType"));
        }
        {
            Map<String, Object> securityMap = (Map<String, Object>) tableDiffMap.get("MEMBER_SECURITY");
            assertEquals("CHANGE", securityMap.get("diffType"));
            Map<String, Map<String, Object>> columnDiffMap = (Map<String, Map<String, Object>>) securityMap.get("columnDiff");
            Map<String, Object> passwordMap = columnDiffMap.get("LOGIN_PASSWORD");
            assertEquals("CHANGE", passwordMap.get("diffType"));
            Map<String, Object> columnSizeDiffMap = (Map<String, Object>) passwordMap.get("columnSizeDiff");
            assertEquals("100", columnSizeDiffMap.get("next"));
            assertEquals("50", columnSizeDiffMap.get("previous"));
        }
        {
            Map<String, Object> withdrawalMap = (Map<String, Object>) tableDiffMap.get("MEMBER_WITHDRAWAL");
            assertEquals("CHANGE", withdrawalMap.get("diffType"));
            Map<String, Map<String, Object>> columnDiffMap = (Map<String, Map<String, Object>>) withdrawalMap.get("columnDiff");
            Map<String, Object> passwordMap = columnDiffMap.get("VERSION_NO");
            assertEquals("DELETE", passwordMap.get("diffType"));
        }
    }

    private void doCheckAlterCheckSequenceDiff(Map<String, Object> firstMap) {
        doCheckSchemaSyncCheckSequenceDiff(firstMap); // same
    }

    private void doCheckAlterCheckProcedureDiff(Map<String, Object> firstMap) {
        // AlterCheck is executed in "diffworld" environment so all objects are DIFFWORLDDB 
        doCheckSchemaSyncCheckProcedureDiff(firstMap, "DIFFWORLDDB"); // same
    }

    @SuppressWarnings("unchecked")
    private void doCheckAlterCheckCraftDiff(Map<String, Object> firstMap) {
        //doCheckSchemaSyncCheckCraftDiff(firstMap); // not same
        Map<String, Map<String, Object>> craftDiffMap = (Map<String, Map<String, Object>>) firstMap.get("craftDiff");
        {
            Map<String, Object> memberMap = craftDiffMap.get("Member");
            Map<String, Map<String, Object>> craftRowDiffMap = (Map<String, Map<String, Object>>) memberMap.get("craftRowDiff");
            {
                Map<String, Object> akagiMap = craftRowDiffMap.get("\u30a2\u30ab\u30ae");
                assertEquals("ADD", akagiMap.get("diffType")); // different from SchemaSyncCheck
            }
            {
                Map<String, Object> maslovarMap = craftRowDiffMap.get("Maslovar");
                assertEquals("CHANGE", maslovarMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) maslovarMap.get("craftValueDiff");
                assertEquals("\"diff\"\t\"world|1967-02-20\"", craftValueDiffMap.get("next"));
                assertEquals("\"JEFUnited|1967-02-20\"", craftValueDiffMap.get("previous"));
            }
            {
                Map<String, Object> akagiMap = craftRowDiffMap.get("Og2000");
                assertEquals("DELETE", akagiMap.get("diffType")); // different from SchemaSyncCheck
            }
        }
        {
            Map<String, Object> statusMap = craftDiffMap.get("MemberStatus");
            Map<String, Map<String, Object>> craftRowDiffMap = (Map<String, Map<String, Object>>) statusMap.get("craftRowDiff");
            {
                Map<String, Object> difMap = craftRowDiffMap.get("DIF");
                assertEquals("ADD", difMap.get("diffType"));
            }
            {
                Map<String, Object> difMap = craftRowDiffMap.get("FML");
                assertEquals("CHANGE", difMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) difMap.get("craftValueDiff");
                assertEquals("\"Formalized|9\"", craftValueDiffMap.get("next"));
                assertEquals("\"Formalized|1\"", craftValueDiffMap.get("previous"));
            }
        }
        {
            Map<String, Object> clsMap = craftDiffMap.get("TableCls");
            Map<String, Map<String, Object>> craftRowDiffMap = (Map<String, Map<String, Object>>) clsMap.get("craftRowDiff");
            {
                Map<String, Object> difMap = craftRowDiffMap.get("MEMBER_STATUS::DIF");
                assertEquals("ADD", difMap.get("diffType"));
            }
            {
                Map<String, Object> difMap = craftRowDiffMap.get("MEMBER_STATUS::FML");
                assertEquals("CHANGE", difMap.get("diffType"));
                Map<String, Object> craftValueDiffMap = (Map<String, Object>) difMap.get("craftValueDiff");
                assertEquals("\"Formalized|9\"", craftValueDiffMap.get("next"));
                assertEquals("\"Formalized|1\"", craftValueDiffMap.get("previous"));
            }
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

    private String getDfpropPath() {
        return getClientPath() + "/dfprop";
    }

    private String getOutputDocPath() {
        return getClientPath() + "/output/doc";
    }

    private String getPlaysqlPath() {
        return getClientPath() + "/playsql";
    }

    private String getSchemaPath() {
        return getClientPath() + "/schema";
    }
}
