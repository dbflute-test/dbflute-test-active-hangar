package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseOne12AmphiCQ;

/**
 * The nest select set-upper of WHITE_BASE_ONE12_AMPHI.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne12AmphiNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseOne12AmphiCQ _query;
    public WhiteBaseOne12AmphiNss(WhiteBaseOne12AmphiCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE by my BASE_ID, named 'whiteBase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseNss withWhiteBase() {
        _query.xdoNss(() -> _query.queryWhiteBase());
        return new WhiteBaseNss(_query.queryWhiteBase());
    }
}
