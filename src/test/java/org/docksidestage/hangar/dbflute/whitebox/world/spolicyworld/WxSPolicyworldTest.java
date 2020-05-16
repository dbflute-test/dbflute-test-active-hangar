package org.docksidestage.hangar.dbflute.whitebox.world.spolicyworld;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.dbflute.helper.process.ProcessResult;
import org.dbflute.helper.process.SystemScript;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;
import org.dbflute.util.Srl;
import org.dbflute.util.Srl.ScopeInfo;

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
            String vioExp = extractVioExp(result);
            log(ln() + vioExp.trim());
            checkWholeTheme(vioExp);
            checkConstraint(vioExp);
            checkBasicFlgBadThenTheme(vioExp);
            checkClassificationIfValue(vioExp);
            checkClassificationThenTheme(vioExp);
            checkFirstDate(vioExp);
        } finally {
            long after = System.currentTimeMillis();
            log("performanceCost:[{}]", DfTraceViewUtil.convertToPerformanceView(after - before));
        }
    }

    private String extractVioExp(ProcessResult result) {
        String console = result.getConsole();
        ScopeInfo vioScope = Srl.extractScopeFirst(console, "[Violation]", "* * * * * * * * * */");
        assertNotNull(vioScope); // violation exists, failure may mean other error
        return Srl.replace(vioScope.getContent(), "[df-replace-schema] ", "");
    }

    // ===================================================================================
    //                                                                   SchemaPolicyCheck
    //                                                                   =================
    private void checkWholeTheme(String vioExp) {
        assertContains(vioExp, "whole.theme: sameColumnDbTypeIfSameColumnName");
    }

    private void checkConstraint(String vioExp) {
        assertContains(vioExp, "table.statement: if tableName is $$ALL$$ then fkName is prefix:FK_$$table$$");
        assertNotContains(vioExp, "table.statement: if tableName is $$ALL$$ then uniqueName is prefix:UQ_$$table$$");
    }

    private void checkBasicFlgBadThenTheme(String vioExp) {
        assertContains(vioExp, "column.statement: if columnName is suffix:_FLAG then bad");
    }

    private void checkClassificationIfValue(String vioExp) {
        assertContains(vioExp, "column.statement: if column is classification then dbType is CHAR or INTEGER");
        assertContains(vioExp, "column.statement: if column is classification(Flg) then dbType is CHAR or INTEGER");
    }

    private void checkClassificationThenTheme(String vioExp) {
        assertContains(vioExp, "column.statement: if columnName is suffix:_RANK_CODE then classification");
        assertContains(vioExp, "column.statement: if columnName is suffix:_RANK_CODE then classification(ServiceRank)");
        assertContains(vioExp, "column.statement: if columnName is suffix:_RANK_CODE then column is classification");
        assertContains(vioExp, "column.statement: if columnName is suffix:_RANK_CODE then column is classification(ServiceRank)");
    }

    private void checkFirstDate(String vioExp) {
        assertContains(vioExp, "table.statement: if firstDate is after:2019/05/11 and tableName is SPOLICY_NEW_CREATED then bad");
        assertContains(vioExp,
                "column.statement: if firstDate is after:2019/05/11 and tableName is SPOLICY_NEW_CREATED and columnName is NEW_CREATED_NAME then bad");
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
