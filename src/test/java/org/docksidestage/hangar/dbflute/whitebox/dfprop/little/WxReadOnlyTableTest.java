package org.docksidestage.hangar.dbflute.whitebox.dfprop.little;

import org.dbflute.bhv.BehaviorWritable;
import org.docksidestage.hangar.dbflute.exbhv.WhiteReadOnlyBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxReadOnlyTableTest extends UnitContainerTestCase {

    private WhiteReadOnlyBhv readOnlyBhv;

    public void test_everyColumn() {
        assertFalse(readOnlyBhv instanceof BehaviorWritable);
    }
}
