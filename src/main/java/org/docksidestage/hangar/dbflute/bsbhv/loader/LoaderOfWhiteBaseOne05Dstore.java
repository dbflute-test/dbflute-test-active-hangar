package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_BASE_ONE05_DSTORE as TABLE. <br>
 * <pre>
 * [primary key]
 *     DSTORE_ID
 *
 * [column]
 *     DSTORE_ID, DSTORE_NAME
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
 *     WHITE_BASE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne05Dstore {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne05Dstore> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne05DstoreBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne05Dstore ready(List<WhiteBaseOne05Dstore> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne05DstoreBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne05DstoreBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBase> _referrerWhiteBase;

    /**
     * Load referrer of whiteBaseList by the set-upper of referrer. <br>
     * WHITE_BASE by DSTORE_ID, named 'whiteBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne05DstoreBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne05DstoreList</span>, <span style="color: #553000">dstoreLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dstoreLoader</span>.<span style="color: #CC4747">loadWhiteBase</span>(<span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">baseCB</span>.setupSelect...
     *         <span style="color: #553000">baseCB</span>.query().set...
     *         <span style="color: #553000">baseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">baseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    baseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne05Dstore whiteBaseOne05Dstore : <span style="color: #553000">whiteBaseOne05DstoreList</span>) {
     *     ... = whiteBaseOne05Dstore.<span style="color: #CC4747">getWhiteBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDstoreId_InScope(pkList);
     * cb.query().addOrderBy_DstoreId_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne05Dstore> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
