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
 * The referrer loader of WHITE_BASE_ONE04_BONVO_PARKSIDE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne04BonvoParkside {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne04BonvoParkside> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne04BonvoParksideBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne04BonvoParkside ready(List<WhiteBaseOne04BonvoParkside> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne04BonvoParksideBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne04BonvoParksideBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteBaseOne04Bonvo> _referrerWhiteBaseOne04Bonvo;

    /**
     * Load referrer of whiteBaseOne04BonvoList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteBaseOne04BonvoParksideList</span>, <span style="color: #553000">parksideLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">parksideLoader</span>.<span style="color: #CC4747">loadWhiteBaseOne04Bonvo</span>(<span style="color: #553000">bonvoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bonvoCB</span>.setupSelect...
     *         <span style="color: #553000">bonvoCB</span>.query().set...
     *         <span style="color: #553000">bonvoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bonvoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bonvoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside : <span style="color: #553000">whiteBaseOne04BonvoParksideList</span>) {
     *     ... = whiteBaseOne04BonvoParkside.<span style="color: #CC4747">getWhiteBaseOne04BonvoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParksideId_InScope(pkList);
     * cb.query().addOrderBy_ParksideId_Asc();
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
    public List<WhiteBaseOne04BonvoParkside> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
