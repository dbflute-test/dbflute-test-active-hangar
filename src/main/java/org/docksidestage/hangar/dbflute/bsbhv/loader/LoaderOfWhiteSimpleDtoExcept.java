package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_SIMPLE_DTO_EXCEPT as TABLE. <br>
 * <pre>
 * [primary key]
 *     SIMPLE_DTO_EXCEPT_ID
 *
 * [column]
 *     SIMPLE_DTO_EXCEPT_ID, SIMPLE_DTO_EXCEPT_NAME
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
public class LoaderOfWhiteSimpleDtoExcept {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSimpleDtoExcept> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSimpleDtoExceptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSimpleDtoExcept ready(List<WhiteSimpleDtoExcept> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSimpleDtoExceptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSimpleDtoExceptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSimpleDtoExcept> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
