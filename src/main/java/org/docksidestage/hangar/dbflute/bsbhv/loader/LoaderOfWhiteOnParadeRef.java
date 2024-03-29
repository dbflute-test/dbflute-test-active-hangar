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
 * The referrer loader of WHITE_ON_PARADE_REF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteOnParadeRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOnParadeRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOnParadeRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOnParadeRef ready(List<WhiteOnParadeRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOnParadeRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOnParadeRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteOnParade _foreignWhiteOnParadeLoader;
    public LoaderOfWhiteOnParade pulloutWhiteOnParade() {
        if (_foreignWhiteOnParadeLoader == null)
        { _foreignWhiteOnParadeLoader = new LoaderOfWhiteOnParade().ready(myBhv().pulloutWhiteOnParade(_selectedList), _selector); }
        return _foreignWhiteOnParadeLoader;
    }

    protected LoaderOfWhiteOnParadeNullableToMany _foreignWhiteOnParadeNullableToManyLoader;
    public LoaderOfWhiteOnParadeNullableToMany pulloutWhiteOnParadeNullableToMany() {
        if (_foreignWhiteOnParadeNullableToManyLoader == null)
        { _foreignWhiteOnParadeNullableToManyLoader = new LoaderOfWhiteOnParadeNullableToMany().ready(myBhv().pulloutWhiteOnParadeNullableToMany(_selectedList), _selector); }
        return _foreignWhiteOnParadeNullableToManyLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteOnParadeRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
