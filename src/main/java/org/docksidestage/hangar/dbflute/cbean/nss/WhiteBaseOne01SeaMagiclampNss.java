package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseOne01SeaMagiclampCQ;

/**
 * The nest select set-upper of WHITE_BASE_ONE01_SEA_MAGICLAMP.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaMagiclampNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseOne01SeaMagiclampCQ _query;
    public WhiteBaseOne01SeaMagiclampNss(WhiteBaseOne01SeaMagiclampCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne01SeaNss withWhiteBaseOne01Sea() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne01Sea());
        return new WhiteBaseOne01SeaNss(_query.queryWhiteBaseOne01Sea());
    }
}
