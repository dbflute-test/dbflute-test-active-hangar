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
package org.docksidestage.hangar.dbflute.resola.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.hangar.dbflute.resola.exbhv.*;
import org.docksidestage.hangar.dbflute.resola.exentity.*;
import org.docksidestage.hangar.dbflute.resola.cbean.*;

/**
 * The referrer loader of MEMBER as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class ResolaLoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ResolaMember> _selectedList;
    protected BehaviorSelector _selector;
    protected ResolaMemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ResolaLoaderOfMember ready(List<ResolaMember> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ResolaMemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ResolaMemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ResolaPurchase> _referrerPurchase;

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br>
     * PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">purchaseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ResolaMember member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ResolaLoaderOfPurchase> loadPurchase(ReferrerConditionSetupper<ResolaPurchaseCB> refCBLambda) {
        myBhv().loadPurchase(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchase = refLs);
        return hd -> hd.handle(new ResolaLoaderOfPurchase().ready(_referrerPurchase, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ResolaLoaderOfMemberSecurity _foreignMemberSecurityAsOneLoader;
    public ResolaLoaderOfMemberSecurity pulloutMemberSecurityAsOne() {
        if (_foreignMemberSecurityAsOneLoader == null)
        { _foreignMemberSecurityAsOneLoader = new ResolaLoaderOfMemberSecurity().ready(myBhv().pulloutMemberSecurityAsOne(_selectedList), _selector); }
        return _foreignMemberSecurityAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ResolaMember> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
