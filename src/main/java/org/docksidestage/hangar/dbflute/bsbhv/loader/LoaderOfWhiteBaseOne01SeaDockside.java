package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_BASE_ONE01_SEA_DOCKSIDE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DOCKSIDE_ID
 *
 * [column]
 *     DOCKSIDE_ID, DOCKSIDE_NAME
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne01SeaList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne01SeaDockside {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne01SeaDockside> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne01SeaDocksideBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne01SeaDockside ready(List<WhiteBaseOne01SeaDockside> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne01SeaDocksideBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne01SeaDocksideBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBaseOne01Sea> _referrerWhiteBaseOne01Sea;

    /**
     * Load referrer of whiteBaseOne01SeaList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE01_SEA by DOCKSIDE_ID, named 'whiteBaseOne01SeaList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaDocksideBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne01SeaDocksideList</span>, <span style="color: #553000">docksideLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">docksideLoader</span>.<span style="color: #CC4747">loadWhiteBaseOne01Sea</span>(<span style="color: #553000">seaCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">seaCB</span>.setupSelect...
     *         <span style="color: #553000">seaCB</span>.query().set...
     *         <span style="color: #553000">seaCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">seaLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    seaLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne01SeaDockside whiteBaseOne01SeaDockside : <span style="color: #553000">whiteBaseOne01SeaDocksideList</span>) {
     *     ... = whiteBaseOne01SeaDockside.<span style="color: #CC4747">getWhiteBaseOne01SeaList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDocksideId_InScope(pkList);
     * cb.query().addOrderBy_DocksideId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteBaseOne01Sea> loadWhiteBaseOne01Sea(ReferrerConditionSetupper<WhiteBaseOne01SeaCB> refCBLambda) {
        myBhv().loadWhiteBaseOne01Sea(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteBaseOne01Sea = refLs);
        return hd -> hd.handle(new LoaderOfWhiteBaseOne01Sea().ready(_referrerWhiteBaseOne01Sea, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne01SeaDockside> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
