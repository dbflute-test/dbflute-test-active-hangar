package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteCompoundPkRefPhysicalCQ;

/**
 * The nest select set-upper of WHITE_COMPOUND_PK_REF_PHYSICAL.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefPhysicalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteCompoundPkRefPhysicalCQ _query;
    public WhiteCompoundPkRefPhysicalNss(WhiteCompoundPkRefPhysicalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_COMPOUND_PK by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     */
    public void withWhiteCompoundPk() {
        _query.xdoNss(() -> _query.queryWhiteCompoundPk());
    }
}
