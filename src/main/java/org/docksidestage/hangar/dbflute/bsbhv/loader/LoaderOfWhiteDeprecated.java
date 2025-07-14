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
 * The referrer loader of WHITE_DEPRECATED as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteDeprecated {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDeprecated> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDeprecatedBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDeprecated ready(List<WhiteDeprecated> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDeprecatedBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDeprecatedBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteDeprecatedRef> _referrerWhiteDeprecatedRef;

    /**
     * Load referrer of whiteDeprecatedRefList by the set-upper of referrer. <br>
     * WHITE_DEPRECATED_REF by DEPRECATED_ID, named 'whiteDeprecatedRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteDeprecatedBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteDeprecatedList</span>, <span style="color: #553000">deprecatedLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deprecatedLoader</span>.<span style="color: #CC4747">loadWhiteDeprecatedRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteDeprecated whiteDeprecated : <span style="color: #553000">whiteDeprecatedList</span>) {
     *     ... = whiteDeprecated.<span style="color: #CC4747">getWhiteDeprecatedRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDeprecatedId_InScope(pkList);
     * cb.query().addOrderBy_DeprecatedId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteDeprecatedRef> loadWhiteDeprecatedRef(ReferrerConditionSetupper<WhiteDeprecatedRefCB> refCBLambda) {
        myBhv().loadWhiteDeprecatedRef(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteDeprecatedRef = refLs);
        return hd -> hd.handle(new LoaderOfWhiteDeprecatedRef().ready(_referrerWhiteDeprecatedRef, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDeprecated> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
