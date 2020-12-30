package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_BASE_ONE09_PALM as TABLE. <br>
 * <pre>
 * [primary key]
 *     PALM_ID
 *
 * [column]
 *     PALM_ID, PALM_NAME, BASE_ID
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
public class LoaderOfWhiteBaseOne09Palm {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne09Palm> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne09PalmBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne09Palm ready(List<WhiteBaseOne09Palm> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne09PalmBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne09PalmBhv.class); return _myBhv; } }

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
    public List<WhiteBaseOne09Palm> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
