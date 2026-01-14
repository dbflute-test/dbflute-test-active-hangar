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
 * The referrer loader of WHITE_OPTIMISTIC_LOCK_BY_DATE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteOptimisticLockByDate {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOptimisticLockByDate> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOptimisticLockByDateBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOptimisticLockByDate ready(List<WhiteOptimisticLockByDate> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOptimisticLockByDateBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOptimisticLockByDateBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteOptimisticLockByDate> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
