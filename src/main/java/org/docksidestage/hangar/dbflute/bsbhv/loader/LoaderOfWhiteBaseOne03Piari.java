/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_BASE_ONE03_PIARI as TABLE. <br>
 * <pre>
 * [primary key]
 *     PIARI_ID
 *
 * [column]
 *     PIARI_ID, PIARI_NAME
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
public class LoaderOfWhiteBaseOne03Piari {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne03Piari> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne03PiariBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne03Piari ready(List<WhiteBaseOne03Piari> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne03PiariBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne03PiariBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBase> _referrerWhiteBase;

    /**
     * Load referrer of whiteBaseList by the set-upper of referrer. <br>
     * WHITE_BASE by PIARI_ID, named 'whiteBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne03PiariBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne03PiariList</span>, <span style="color: #553000">piariLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">piariLoader</span>.<span style="color: #CC4747">loadWhiteBase</span>(<span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">baseCB</span>.setupSelect...
     *         <span style="color: #553000">baseCB</span>.query().set...
     *         <span style="color: #553000">baseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">baseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    baseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne03Piari whiteBaseOne03Piari : <span style="color: #553000">whiteBaseOne03PiariList</span>) {
     *     ... = whiteBaseOne03Piari.<span style="color: #CC4747">getWhiteBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPiariId_InScope(pkList);
     * cb.query().addOrderBy_PiariId_Asc();
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
    public List<WhiteBaseOne03Piari> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
