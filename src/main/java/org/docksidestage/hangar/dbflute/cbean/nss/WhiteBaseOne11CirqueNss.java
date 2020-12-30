package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseOne11CirqueCQ;

/**
 * The nest select set-upper of WHITE_BASE_ONE11_CIRQUE.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne11CirqueNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseOne11CirqueCQ _query;
    public WhiteBaseOne11CirqueNss(WhiteBaseOne11CirqueCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE by my CIRQUE_ID, named 'whiteBase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseNss withWhiteBase() {
        _query.xdoNss(() -> _query.queryWhiteBase());
        return new WhiteBaseNss(_query.queryWhiteBase());
    }
}
