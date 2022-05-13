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
 * The referrer loader of WHITE_ON_PARADE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ON_PARADE_ID
 *
 * [column]
 *     ON_PARADE_ID, ON_PARADE_NAME
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
public class LoaderOfWhiteOnParade {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOnParade> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOnParadeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOnParade ready(List<WhiteOnParade> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOnParadeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOnParadeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteOnParadeRef> _referrerWhiteOnParadeRef;

    /**
     * Load referrer of whiteOnParadeRefList by the set-upper of referrer. <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParadeRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteOnParadeList</span>, <span style="color: #553000">paradeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paradeLoader</span>.<span style="color: #CC4747">loadWhiteOnParadeRef</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteOnParade whiteOnParade : <span style="color: #553000">whiteOnParadeList</span>) {
     *     ... = whiteOnParade.<span style="color: #CC4747">getWhiteOnParadeRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNullableFkOnParadeId_InScope(pkList);
     * cb.query().addOrderBy_NullableFkOnParadeId_Asc();
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
    public List<WhiteOnParade> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
