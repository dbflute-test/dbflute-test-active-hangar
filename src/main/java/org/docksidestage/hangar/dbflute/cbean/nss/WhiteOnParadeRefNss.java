package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteOnParadeRefCQ;

/**
 * The nest select set-upper of WHITE_ON_PARADE_REF.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteOnParadeRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteOnParadeRefCQ _query;
    public WhiteOnParadeRefNss(WhiteOnParadeRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'.
     */
    public void withWhiteOnParadeNullableToMany() {
        _query.xdoNss(() -> _query.queryWhiteOnParadeNullableToMany());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'.
     */
    public void withWhiteOnParade() {
        _query.xdoNss(() -> _query.queryWhiteOnParade());
    }
}
