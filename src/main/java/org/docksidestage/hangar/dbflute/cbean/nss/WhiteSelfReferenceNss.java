package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteSelfReferenceCQ;

/**
 * The nest select set-upper of WHITE_SELF_REFERENCE.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteSelfReferenceCQ _query;
    public WhiteSelfReferenceNss(WhiteSelfReferenceCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_SELF_REFERENCE by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSelfReferenceNss withWhiteSelfReferenceSelf() {
        _query.xdoNss(() -> _query.queryWhiteSelfReferenceSelf());
        return new WhiteSelfReferenceNss(_query.queryWhiteSelfReferenceSelf());
    }
}
