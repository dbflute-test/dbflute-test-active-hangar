package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseCQ;

/**
 * The nest select set-upper of WHITE_BASE.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseCQ _query;
    public WhiteBaseNss(WhiteBaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'.
     */
    public void withWhiteBaseOne06Amba() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne06Amba());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne04BonvoNss withWhiteBaseOne04Bonvo() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne04Bonvo());
        return new WhiteBaseOne04BonvoNss(_query.queryWhiteBaseOne04Bonvo());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'.
     */
    public void withWhiteBaseOne05Dstore() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne05Dstore());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'.
     */
    public void withWhiteBaseOne02Land() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne02Land());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'.
     */
    public void withWhiteBaseOne07Miraco() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne07Miraco());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'.
     */
    public void withWhiteBaseOne03Piari() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne03Piari());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne01SeaNss withWhiteBaseOne01Sea() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne01Sea());
        return new WhiteBaseOne01SeaNss(_query.queryWhiteBaseOne01Sea());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'.
     */
    public void withWhiteBaseOne08Dohotel() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne08Dohotel());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne09PalmNss withWhiteBaseOne09PalmAsOne() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne09PalmAsOne());
        return new WhiteBaseOne09PalmNss(_query.queryWhiteBaseOne09PalmAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne10CelebNss withWhiteBaseOne10CelebAsOne() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne10CelebAsOne());
        return new WhiteBaseOne10CelebNss(_query.queryWhiteBaseOne10CelebAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne11CirqueNss withWhiteBaseOne11CirqueAsOne() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne11CirqueAsOne());
        return new WhiteBaseOne11CirqueNss(_query.queryWhiteBaseOne11CirqueAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteBaseOne12AmphiNss withWhiteBaseOne12AmphiAsOne() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne12AmphiAsOne());
        return new WhiteBaseOne12AmphiNss(_query.queryWhiteBaseOne12AmphiAsOne());
    }
}
