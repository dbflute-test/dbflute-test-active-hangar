package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_BASE_ONE12_AMPHI as TABLE. <br>
 * <pre>
 * [primary key]
 *     AMPHI_ID
 *
 * [column]
 *     AMPHI_ID, AMPHI_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne12Amphi {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne12Amphi> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne12AmphiBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne12Amphi ready(List<WhiteBaseOne12Amphi> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne12AmphiBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne12AmphiBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteBase _foreignWhiteBaseLoader;
    public LoaderOfWhiteBase pulloutWhiteBase() {
        if (_foreignWhiteBaseLoader == null)
        { _foreignWhiteBaseLoader = new LoaderOfWhiteBase().ready(myBhv().pulloutWhiteBase(_selectedList), _selector); }
        return _foreignWhiteBaseLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne12Amphi> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
