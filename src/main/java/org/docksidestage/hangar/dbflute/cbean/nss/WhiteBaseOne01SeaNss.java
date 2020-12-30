package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseOne01SeaCQ;

/**
 * The nest select set-upper of WHITE_BASE_ONE01_SEA.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne01SeaNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseOne01SeaCQ _query;
    public WhiteBaseOne01SeaNss(WhiteBaseOne01SeaCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'.
     */
    public void withWhiteBaseOne01SeaBroadway() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne01SeaBroadway());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'.
     */
    public void withWhiteBaseOne01SeaDockside() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne01SeaDockside());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne01SeaHangarNss withWhiteBaseOne01SeaHangarAsOne() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne01SeaHangarAsOne());
        return new WhiteBaseOne01SeaHangarNss(_query.queryWhiteBaseOne01SeaHangarAsOne());
    }
}
