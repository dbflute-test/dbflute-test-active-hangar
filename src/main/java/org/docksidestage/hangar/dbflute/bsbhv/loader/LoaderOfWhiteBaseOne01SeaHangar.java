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
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_BASE_ONE01_SEA_HANGAR as TABLE. <br>
 * <pre>
 * [primary key]
 *     HANGAR_ID
 *
 * [column]
 *     HANGAR_ID, HANGAR_NAME, SEA_ID
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBaseOne01Sea
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne01SeaHangar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne01SeaHangar> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne01SeaHangarBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne01SeaHangar ready(List<WhiteBaseOne01SeaHangar> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne01SeaHangarBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne01SeaHangarBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteBaseOne01Sea _foreignWhiteBaseOne01SeaLoader;
    public LoaderOfWhiteBaseOne01Sea pulloutWhiteBaseOne01Sea() {
        if (_foreignWhiteBaseOne01SeaLoader == null)
        { _foreignWhiteBaseOne01SeaLoader = new LoaderOfWhiteBaseOne01Sea().ready(myBhv().pulloutWhiteBaseOne01Sea(_selectedList), _selector); }
        return _foreignWhiteBaseOne01SeaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne01SeaHangar> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
