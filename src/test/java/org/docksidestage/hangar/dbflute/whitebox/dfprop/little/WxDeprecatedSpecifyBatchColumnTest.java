package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import javax.annotation.Resource;

import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.WhiteDeprecatedSpecifyBatchColumnBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxDeprecatedSpecifyBatchColumnTest extends UnitContainerTestCase {

    @Resource
    private WhiteDeprecatedSpecifyBatchColumnBhv specifyBatchColumnBhv;
    @Resource
    private MemberBhv memberBhv;

    @SuppressWarnings("deprecation")
    public void test_everyColumn() {
        specifyBatchColumnBhv.selectList(cb -> {
            cb.specify().everyColumn();
        });
    }

    @SuppressWarnings("deprecation")
    public void test_exceptRecordMetaColumn() {
        specifyBatchColumnBhv.selectList(cb -> {
            cb.specify().exceptRecordMetaColumn();
        });
    }

    public void test_nonTargetTable() {
        memberBhv.selectList(cb -> {
            cb.specify().everyColumn();
        });
    }
}
