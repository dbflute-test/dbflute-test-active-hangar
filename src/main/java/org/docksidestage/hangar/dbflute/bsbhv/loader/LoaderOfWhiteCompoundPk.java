package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_COMPOUND_PK as TABLE. <br>
 * <pre>
 * [primary key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, COMPOUND_PK_NAME, REFERRED_ID
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
public class LoaderOfWhiteCompoundPk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPk ready(List<WhiteCompoundPk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
