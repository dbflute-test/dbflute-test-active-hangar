package org.docksidestage.hangar.dbflute.whitebox.runtime;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.cbean.MemberCB;

/**
 * @author jflute
 * @since 1.2.6 (2022/04/17 Sunday)
 */
public class WxAbstractConditionQueryTest extends PlainTestCase {

    // ===================================================================================
    //                                                                               of()
    //                                                                              ======
    public void test_hSC() { // handleShortChar()
        new MemberCB().query().setMemberStatusCode_Equal_Formalized(); // expect no exception
    }
}
