package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import javax.annotation.Resource;

import org.dbflute.bhv.BehaviorWritable;
import org.docksidestage.hangar.dbflute.exbhv.WhiteReadOnlyBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxReadOnlyTableTest extends UnitContainerTestCase {

    @Resource
    private WhiteReadOnlyBhv readOnlyBhv;

    public void test_everyColumn() {
        assertFalse(readOnlyBhv instanceof BehaviorWritable);
    }
}
