package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_BASE_ONE10_CELEB as TABLE. <br>
 * <pre>
 * [primary key]
 *     CELEB_ID
 *
 * [column]
 *     CELEB_ID, CELEB_NAME, BASE_ID
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
public class LoaderOfWhiteBaseOne10Celeb {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne10Celeb> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne10CelebBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne10Celeb ready(List<WhiteBaseOne10Celeb> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne10CelebBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne10CelebBhv.class); return _myBhv; } }

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
    public List<WhiteBaseOne10Celeb> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
