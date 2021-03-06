package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_BASE_ONE04_BONVO_STATIONSIDE as TABLE. <br>
 * <pre>
 * [primary key]
 *     STATIONSIDE_ID
 *
 * [column]
 *     STATIONSIDE_ID, STATIONSIDE_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     WHITE_BASE_ONE04_BONVO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne04BonvoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne04BonvoStationside {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne04BonvoStationside> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne04BonvoStationsideBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne04BonvoStationside ready(List<WhiteBaseOne04BonvoStationside> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne04BonvoStationsideBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne04BonvoStationsideBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBaseOne04Bonvo> _referrerWhiteBaseOne04Bonvo;

    /**
     * Load referrer of whiteBaseOne04BonvoList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE04_BONVO by STATIONSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoStationsideBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne04BonvoStationsideList</span>, <span style="color: #553000">stationsideLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stationsideLoader</span>.<span style="color: #CC4747">loadWhiteBaseOne04Bonvo</span>(<span style="color: #553000">bonvoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bonvoCB</span>.setupSelect...
     *         <span style="color: #553000">bonvoCB</span>.query().set...
     *         <span style="color: #553000">bonvoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bonvoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bonvoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne04BonvoStationside whiteBaseOne04BonvoStationside : <span style="color: #553000">whiteBaseOne04BonvoStationsideList</span>) {
     *     ... = whiteBaseOne04BonvoStationside.<span style="color: #CC4747">getWhiteBaseOne04BonvoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStationsideId_InScope(pkList);
     * cb.query().addOrderBy_StationsideId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteBaseOne04Bonvo> loadWhiteBaseOne04Bonvo(ReferrerConditionSetupper<WhiteBaseOne04BonvoCB> refCBLambda) {
        myBhv().loadWhiteBaseOne04Bonvo(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteBaseOne04Bonvo = refLs);
        return hd -> hd.handle(new LoaderOfWhiteBaseOne04Bonvo().ready(_referrerWhiteBaseOne04Bonvo, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne04BonvoStationside> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
