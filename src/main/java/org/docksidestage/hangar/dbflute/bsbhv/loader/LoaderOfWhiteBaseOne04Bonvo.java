package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_BASE_ONE04_BONVO as TABLE. <br>
 * <pre>
 * [primary key]
 *     BONVO_ID
 *
 * [column]
 *     BONVO_ID, BONVO_NAME, PARKSIDE_ID, STATIONSIDE_ID
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
 *     WHITE_BASE_ONE04_BONVO_PARKSIDE, WHITE_BASE_ONE04_BONVO_STATIONSIDE
 *
 * [referrer table]
 *     WHITE_BASE
 *
 * [foreign property]
 *     whiteBaseOne04BonvoParkside, whiteBaseOne04BonvoStationside
 *
 * [referrer property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne04Bonvo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne04Bonvo> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne04BonvoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne04Bonvo ready(List<WhiteBaseOne04Bonvo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne04BonvoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne04BonvoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBase> _referrerWhiteBase;

    /**
     * Load referrer of whiteBaseList by the set-upper of referrer. <br>
     * WHITE_BASE by BONVO_ID, named 'whiteBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne04BonvoList</span>, <span style="color: #553000">bonvoLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bonvoLoader</span>.<span style="color: #CC4747">loadWhiteBase</span>(<span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">baseCB</span>.setupSelect...
     *         <span style="color: #553000">baseCB</span>.query().set...
     *         <span style="color: #553000">baseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">baseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    baseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne04Bonvo whiteBaseOne04Bonvo : <span style="color: #553000">whiteBaseOne04BonvoList</span>) {
     *     ... = whiteBaseOne04Bonvo.<span style="color: #CC4747">getWhiteBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBonvoId_InScope(pkList);
     * cb.query().addOrderBy_BonvoId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteBase> loadWhiteBase(ReferrerConditionSetupper<WhiteBaseCB> refCBLambda) {
        myBhv().loadWhiteBase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteBase = refLs);
        return hd -> hd.handle(new LoaderOfWhiteBase().ready(_referrerWhiteBase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteBaseOne04BonvoParkside _foreignWhiteBaseOne04BonvoParksideLoader;
    public LoaderOfWhiteBaseOne04BonvoParkside pulloutWhiteBaseOne04BonvoParkside() {
        if (_foreignWhiteBaseOne04BonvoParksideLoader == null)
        { _foreignWhiteBaseOne04BonvoParksideLoader = new LoaderOfWhiteBaseOne04BonvoParkside().ready(myBhv().pulloutWhiteBaseOne04BonvoParkside(_selectedList), _selector); }
        return _foreignWhiteBaseOne04BonvoParksideLoader;
    }

    protected LoaderOfWhiteBaseOne04BonvoStationside _foreignWhiteBaseOne04BonvoStationsideLoader;
    public LoaderOfWhiteBaseOne04BonvoStationside pulloutWhiteBaseOne04BonvoStationside() {
        if (_foreignWhiteBaseOne04BonvoStationsideLoader == null)
        { _foreignWhiteBaseOne04BonvoStationsideLoader = new LoaderOfWhiteBaseOne04BonvoStationside().ready(myBhv().pulloutWhiteBaseOne04BonvoStationside(_selectedList), _selector); }
        return _foreignWhiteBaseOne04BonvoStationsideLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne04Bonvo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
