package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_DEPRECATED_SELECT_BY_PKUQ as TABLE. <br>
 * <pre>
 * [primary key]
 *     SELECT_BY_PKUQ_ID
 *
 * [column]
 *     SELECT_BY_PKUQ_ID, SELECT_BY_PKUQ_NAME, SELECT_BY_PKUQ_CODE
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteDeprecatedSelectByPkuq {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDeprecatedSelectByPkuq> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDeprecatedSelectByPkuqBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDeprecatedSelectByPkuq ready(List<WhiteDeprecatedSelectByPkuq> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDeprecatedSelectByPkuqBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDeprecatedSelectByPkuqBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDeprecatedSelectByPkuq> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
