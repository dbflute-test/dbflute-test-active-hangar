package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_ON_PARADE_NULLABLE_TO_MANY as TABLE. <br>
 * <pre>
 * [primary key]
 *     MANY_ID
 *
 * [column]
 *     MANY_ID, MANY_NAME
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
 *     WHITE_ON_PARADE_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteOnParadeRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteOnParadeNullableToMany {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOnParadeNullableToMany> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOnParadeNullableToManyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOnParadeNullableToMany ready(List<WhiteOnParadeNullableToMany> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOnParadeNullableToManyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOnParadeNullableToManyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteOnParadeRef> _referrerWhiteOnParadeRef;

    /**
     * Load referrer of whiteOnParadeRefList by the set-upper of referrer. <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteOnParadeNullableToManyList</span>, <span style="color: #553000">manyLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">manyLoader</span>.<span style="color: #CC4747">loadWhiteOnParadeRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteOnParadeNullableToMany whiteOnParadeNullableToMany : <span style="color: #553000">whiteOnParadeNullableToManyList</span>) {
     *     ... = whiteOnParadeNullableToMany.<span style="color: #CC4747">getWhiteOnParadeRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNullableFkToManyId_InScope(pkList);
     * cb.query().addOrderBy_NullableFkToManyId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteOnParadeRef> loadWhiteOnParadeRef(ReferrerConditionSetupper<WhiteOnParadeRefCB> refCBLambda) {
        myBhv().loadWhiteOnParadeRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteOnParadeRef = refLs);
        return hd -> hd.handle(new LoaderOfWhiteOnParadeRef().ready(_referrerWhiteOnParadeRef, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteOnParadeNullableToMany> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
