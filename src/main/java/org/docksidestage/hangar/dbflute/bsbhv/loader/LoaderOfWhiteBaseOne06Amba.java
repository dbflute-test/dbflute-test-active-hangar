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
 * The referrer loader of WHITE_BASE_ONE06_AMBA as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne06Amba {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne06Amba> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne06AmbaBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne06Amba ready(List<WhiteBaseOne06Amba> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne06AmbaBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne06AmbaBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBase> _referrerWhiteBase;

    /**
     * Load referrer of whiteBaseList by the set-upper of referrer. <br>
     * WHITE_BASE by AMBA_ID, named 'whiteBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne06AmbaBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne06AmbaList</span>, <span style="color: #553000">ambaLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ambaLoader</span>.<span style="color: #CC4747">loadWhiteBase</span>(<span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">baseCB</span>.setupSelect...
     *         <span style="color: #553000">baseCB</span>.query().set...
     *         <span style="color: #553000">baseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">baseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    baseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne06Amba whiteBaseOne06Amba : <span style="color: #553000">whiteBaseOne06AmbaList</span>) {
     *     ... = whiteBaseOne06Amba.<span style="color: #CC4747">getWhiteBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAmbaId_InScope(pkList);
     * cb.query().addOrderBy_AmbaId_Asc();
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
    public List<WhiteBaseOne06Amba> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
