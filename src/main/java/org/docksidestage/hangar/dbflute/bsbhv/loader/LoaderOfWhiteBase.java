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
 * The referrer loader of WHITE_BASE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBase> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBase ready(List<WhiteBase> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteBaseOne06Amba _foreignWhiteBaseOne06AmbaLoader;
    public LoaderOfWhiteBaseOne06Amba pulloutWhiteBaseOne06Amba() {
        if (_foreignWhiteBaseOne06AmbaLoader == null)
        { _foreignWhiteBaseOne06AmbaLoader = new LoaderOfWhiteBaseOne06Amba().ready(myBhv().pulloutWhiteBaseOne06Amba(_selectedList), _selector); }
        return _foreignWhiteBaseOne06AmbaLoader;
    }

    protected LoaderOfWhiteBaseOne04Bonvo _foreignWhiteBaseOne04BonvoLoader;
    public LoaderOfWhiteBaseOne04Bonvo pulloutWhiteBaseOne04Bonvo() {
        if (_foreignWhiteBaseOne04BonvoLoader == null)
        { _foreignWhiteBaseOne04BonvoLoader = new LoaderOfWhiteBaseOne04Bonvo().ready(myBhv().pulloutWhiteBaseOne04Bonvo(_selectedList), _selector); }
        return _foreignWhiteBaseOne04BonvoLoader;
    }

    protected LoaderOfWhiteBaseOne05Dstore _foreignWhiteBaseOne05DstoreLoader;
    public LoaderOfWhiteBaseOne05Dstore pulloutWhiteBaseOne05Dstore() {
        if (_foreignWhiteBaseOne05DstoreLoader == null)
        { _foreignWhiteBaseOne05DstoreLoader = new LoaderOfWhiteBaseOne05Dstore().ready(myBhv().pulloutWhiteBaseOne05Dstore(_selectedList), _selector); }
        return _foreignWhiteBaseOne05DstoreLoader;
    }

    protected LoaderOfWhiteBaseOne02Land _foreignWhiteBaseOne02LandLoader;
    public LoaderOfWhiteBaseOne02Land pulloutWhiteBaseOne02Land() {
        if (_foreignWhiteBaseOne02LandLoader == null)
        { _foreignWhiteBaseOne02LandLoader = new LoaderOfWhiteBaseOne02Land().ready(myBhv().pulloutWhiteBaseOne02Land(_selectedList), _selector); }
        return _foreignWhiteBaseOne02LandLoader;
    }

    protected LoaderOfWhiteBaseOne07Miraco _foreignWhiteBaseOne07MiracoLoader;
    public LoaderOfWhiteBaseOne07Miraco pulloutWhiteBaseOne07Miraco() {
        if (_foreignWhiteBaseOne07MiracoLoader == null)
        { _foreignWhiteBaseOne07MiracoLoader = new LoaderOfWhiteBaseOne07Miraco().ready(myBhv().pulloutWhiteBaseOne07Miraco(_selectedList), _selector); }
        return _foreignWhiteBaseOne07MiracoLoader;
    }

    protected LoaderOfWhiteBaseOne03Piari _foreignWhiteBaseOne03PiariLoader;
    public LoaderOfWhiteBaseOne03Piari pulloutWhiteBaseOne03Piari() {
        if (_foreignWhiteBaseOne03PiariLoader == null)
        { _foreignWhiteBaseOne03PiariLoader = new LoaderOfWhiteBaseOne03Piari().ready(myBhv().pulloutWhiteBaseOne03Piari(_selectedList), _selector); }
        return _foreignWhiteBaseOne03PiariLoader;
    }

    protected LoaderOfWhiteBaseOne01Sea _foreignWhiteBaseOne01SeaLoader;
    public LoaderOfWhiteBaseOne01Sea pulloutWhiteBaseOne01Sea() {
        if (_foreignWhiteBaseOne01SeaLoader == null)
        { _foreignWhiteBaseOne01SeaLoader = new LoaderOfWhiteBaseOne01Sea().ready(myBhv().pulloutWhiteBaseOne01Sea(_selectedList), _selector); }
        return _foreignWhiteBaseOne01SeaLoader;
    }

    protected LoaderOfWhiteBaseOne08Dohotel _foreignWhiteBaseOne08DohotelLoader;
    public LoaderOfWhiteBaseOne08Dohotel pulloutWhiteBaseOne08Dohotel() {
        if (_foreignWhiteBaseOne08DohotelLoader == null)
        { _foreignWhiteBaseOne08DohotelLoader = new LoaderOfWhiteBaseOne08Dohotel().ready(myBhv().pulloutWhiteBaseOne08Dohotel(_selectedList), _selector); }
        return _foreignWhiteBaseOne08DohotelLoader;
    }

    protected LoaderOfWhiteBaseOne09Palm _foreignWhiteBaseOne09PalmAsOneLoader;
    public LoaderOfWhiteBaseOne09Palm pulloutWhiteBaseOne09PalmAsOne() {
        if (_foreignWhiteBaseOne09PalmAsOneLoader == null)
        { _foreignWhiteBaseOne09PalmAsOneLoader = new LoaderOfWhiteBaseOne09Palm().ready(myBhv().pulloutWhiteBaseOne09PalmAsOne(_selectedList), _selector); }
        return _foreignWhiteBaseOne09PalmAsOneLoader;
    }

    protected LoaderOfWhiteBaseOne10Celeb _foreignWhiteBaseOne10CelebAsOneLoader;
    public LoaderOfWhiteBaseOne10Celeb pulloutWhiteBaseOne10CelebAsOne() {
        if (_foreignWhiteBaseOne10CelebAsOneLoader == null)
        { _foreignWhiteBaseOne10CelebAsOneLoader = new LoaderOfWhiteBaseOne10Celeb().ready(myBhv().pulloutWhiteBaseOne10CelebAsOne(_selectedList), _selector); }
        return _foreignWhiteBaseOne10CelebAsOneLoader;
    }

    protected LoaderOfWhiteBaseOne11Cirque _foreignWhiteBaseOne11CirqueAsOneLoader;
    public LoaderOfWhiteBaseOne11Cirque pulloutWhiteBaseOne11CirqueAsOne() {
        if (_foreignWhiteBaseOne11CirqueAsOneLoader == null)
        { _foreignWhiteBaseOne11CirqueAsOneLoader = new LoaderOfWhiteBaseOne11Cirque().ready(myBhv().pulloutWhiteBaseOne11CirqueAsOne(_selectedList), _selector); }
        return _foreignWhiteBaseOne11CirqueAsOneLoader;
    }

    protected LoaderOfWhiteBaseOne12Amphi _foreignWhiteBaseOne12AmphiAsOneLoader;
    public LoaderOfWhiteBaseOne12Amphi pulloutWhiteBaseOne12AmphiAsOne() {
        if (_foreignWhiteBaseOne12AmphiAsOneLoader == null)
        { _foreignWhiteBaseOne12AmphiAsOneLoader = new LoaderOfWhiteBaseOne12Amphi().ready(myBhv().pulloutWhiteBaseOne12AmphiAsOne(_selectedList), _selector); }
        return _foreignWhiteBaseOne12AmphiAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBase> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
