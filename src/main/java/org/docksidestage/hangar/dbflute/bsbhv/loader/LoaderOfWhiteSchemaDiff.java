package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_SCHEMA_DIFF as TABLE. <br>
 * <pre>
 * [primary key]
 *     SCHEMA_DIFF_ID
 *
 * [column]
 *     SCHEMA_DIFF_ID, SCHEMA_DIFF_NAME, SCHEMA_DIFF_DATE
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
public class LoaderOfWhiteSchemaDiff {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSchemaDiff> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSchemaDiffBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSchemaDiff ready(List<WhiteSchemaDiff> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSchemaDiffBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSchemaDiffBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSchemaDiff> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
