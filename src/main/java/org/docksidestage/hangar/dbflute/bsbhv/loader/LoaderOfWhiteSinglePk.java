package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_SINGLE_PK as TABLE. <br>
 * <pre>
 * [primary key]
 *     ONLY_ONE_PK_ID
 *
 * [column]
 *     ONLY_ONE_PK_ID, SINGLE_PK_NAME, REFERRED_ID
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
public class LoaderOfWhiteSinglePk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSinglePk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSinglePkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSinglePk ready(List<WhiteSinglePk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSinglePkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSinglePkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSinglePk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
