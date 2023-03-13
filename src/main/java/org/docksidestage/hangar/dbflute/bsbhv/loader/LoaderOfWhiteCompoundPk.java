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
 * The referrer loader of WHITE_COMPOUND_PK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPk ready(List<WhiteCompoundPk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteCompoundPkRefPhysical> _referrerWhiteCompoundPkRefPhysical;

    /**
     * Load referrer of whiteCompoundPkRefPhysicalList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_PHYSICAL by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefPhysicalList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundPkList</span>, <span style="color: #553000">pkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pkLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefPhysical</span>(<span style="color: #553000">physicalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">physicalCB</span>.setupSelect...
     *         <span style="color: #553000">physicalCB</span>.query().set...
     *         <span style="color: #553000">physicalCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">physicalLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    physicalLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundPk whiteCompoundPk : <span style="color: #553000">whiteCompoundPkList</span>) {
     *     ... = whiteCompoundPk.<span style="color: #CC4747">getWhiteCompoundPkRefPhysicalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefPhysical> loadWhiteCompoundPkRefPhysical(ReferrerConditionSetupper<WhiteCompoundPkRefPhysicalCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefPhysical(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefPhysical = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefPhysical().ready(_referrerWhiteCompoundPkRefPhysical, _selector));
    }

    protected List<WhiteCompoundPkRefVirturl> _referrerWhiteCompoundPkRefVirturl;

    /**
     * Load referrer of whiteCompoundPkRefVirturlList by the set-upper of referrer. <br>
     * WHITE_COMPOUND_PK_REF_VIRTURL by REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPkRefVirturlList'.
     * <pre>
     * <span style="color: #0000C0">whiteCompoundPkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">whiteCompoundPkList</span>, <span style="color: #553000">pkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pkLoader</span>.<span style="color: #CC4747">loadWhiteCompoundPkRefVirturl</span>(<span style="color: #553000">virturlCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">virturlCB</span>.setupSelect...
     *         <span style="color: #553000">virturlCB</span>.query().set...
     *         <span style="color: #553000">virturlCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">virturlLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    virturlLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (WhiteCompoundPk whiteCompoundPk : <span style="color: #553000">whiteCompoundPkList</span>) {
     *     ... = whiteCompoundPk.<span style="color: #CC4747">getWhiteCompoundPkRefVirturlList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().set[ForeignKey]_InScope(pkList);
     * cb.query().addOrderBy_[ForeignKey]_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteCompoundPkRefVirturl> loadWhiteCompoundPkRefVirturl(ReferrerConditionSetupper<WhiteCompoundPkRefVirturlCB> refCBLambda) {
        myBhv().loadWhiteCompoundPkRefVirturl(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteCompoundPkRefVirturl = refLs);
        return hd -> hd.handle(new LoaderOfWhiteCompoundPkRefVirturl().ready(_referrerWhiteCompoundPkRefVirturl, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
