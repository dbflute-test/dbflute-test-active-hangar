package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN as TABLE. <br>
 * <pre>
 * [primary key]
 *     SPECIFY_BATCH_COLUMN_ID
 *
 * [column]
 *     SPECIFY_BATCH_COLUMN_ID, SPECIFY_BATCH_COLUMN_NAME
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
public class LoaderOfWhiteDeprecatedSpecifyBatchColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDeprecatedSpecifyBatchColumn> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDeprecatedSpecifyBatchColumnBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDeprecatedSpecifyBatchColumn ready(List<WhiteDeprecatedSpecifyBatchColumn> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDeprecatedSpecifyBatchColumnBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDeprecatedSpecifyBatchColumnBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDeprecatedSpecifyBatchColumn> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
