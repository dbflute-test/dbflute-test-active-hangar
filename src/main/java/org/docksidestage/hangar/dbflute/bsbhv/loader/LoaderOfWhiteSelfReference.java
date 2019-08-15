package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_SELF_REFERENCE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     WHITE_SELF_REFERENCE
 *
 * [referrer table]
 *     WHITE_SELF_REFERENCE
 *
 * [foreign property]
 *     whiteSelfReferenceSelf
 *
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSelfReference {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSelfReference> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSelfReferenceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSelfReference ready(List<WhiteSelfReference> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSelfReferenceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSelfReferenceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSelfReference> _referrerWhiteSelfReferenceSelf;

    /**
     * Load referrer of whiteSelfReferenceSelfList by the set-upper of referrer. <br>
     * WHITE_SELF_REFERENCE by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * <pre>
     * <span style="color: #0000C0">whiteSelfReferenceBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteSelfReferenceList</span>, <span style="color: #553000">referenceLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">referenceLoader</span>.<span style="color: #CC4747">loadWhiteSelfReferenceSelf</span>(<span style="color: #553000">referenceCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">referenceCB</span>.setupSelect...
     *         <span style="color: #553000">referenceCB</span>.query().set...
     *         <span style="color: #553000">referenceCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">referenceLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    referenceLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteSelfReference whiteSelfReference : <span style="color: #553000">whiteSelfReferenceList</span>) {
     *     ... = whiteSelfReference.<span style="color: #CC4747">getWhiteSelfReferenceSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentId_InScope(pkList);
     * cb.query().addOrderBy_ParentId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSelfReference> loadWhiteSelfReferenceSelf(ReferrerConditionSetupper<WhiteSelfReferenceCB> refCBLambda) {
        myBhv().loadWhiteSelfReferenceSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSelfReferenceSelf = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSelfReference().ready(_referrerWhiteSelfReferenceSelf, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSelfReference _foreignWhiteSelfReferenceSelfLoader;
    public LoaderOfWhiteSelfReference pulloutWhiteSelfReferenceSelf() {
        if (_foreignWhiteSelfReferenceSelfLoader == null)
        { _foreignWhiteSelfReferenceSelfLoader = new LoaderOfWhiteSelfReference().ready(myBhv().pulloutWhiteSelfReferenceSelf(_selectedList), _selector); }
        return _foreignWhiteSelfReferenceSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSelfReference> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
