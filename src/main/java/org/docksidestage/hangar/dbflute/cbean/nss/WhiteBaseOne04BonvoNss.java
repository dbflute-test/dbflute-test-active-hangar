package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.WhiteBaseOne04BonvoCQ;

/**
 * The nest select set-upper of WHITE_BASE_ONE04_BONVO.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBaseOne04BonvoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteBaseOne04BonvoCQ _query;
    public WhiteBaseOne04BonvoNss(WhiteBaseOne04BonvoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE04_BONVO_PARKSIDE by my PARKSIDE_ID, named 'whiteBaseOne04BonvoParkside'.
     */
    public void withWhiteBaseOne04BonvoParkside() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne04BonvoParkside());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_BASE_ONE04_BONVO_STATIONSIDE by my STATIONSIDE_ID, named 'whiteBaseOne04BonvoStationside'.
     */
    public void withWhiteBaseOne04BonvoStationside() {
        _query.xdoNss(() -> _query.queryWhiteBaseOne04BonvoStationside());
    }
}
