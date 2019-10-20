package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteCompoundPkRefVirturlCQ;

/**
 * The nest select set-upper of WHITE_COMPOUND_PK_REF_VIRTURL.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefVirturlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteCompoundPkRefVirturlCQ _query;
    public WhiteCompoundPkRefVirturlNss(WhiteCompoundPkRefVirturlCQ query) { _query = query; }
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
