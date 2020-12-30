package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_BASE_ONE11_CIRQUE as TABLE. <br>
 * <pre>
 * [primary key]
 *     CIRQUE_ID
 *
 * [column]
 *     CIRQUE_ID, CIRQUE_NAME
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
public class LoaderOfWhiteBaseOne11Cirque {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne11Cirque> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne11CirqueBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne11Cirque ready(List<WhiteBaseOne11Cirque> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne11CirqueBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne11CirqueBhv.class); return _myBhv; } }

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
    public List<WhiteBaseOne11Cirque> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
