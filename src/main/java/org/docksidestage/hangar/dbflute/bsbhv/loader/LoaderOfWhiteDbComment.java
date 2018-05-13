package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of (DBコメント)WHITE_DB_COMMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     DB_COMMENT_ID
 *
 * [column]
 *     DB_COMMENT_ID, DB_COMMENT_NAME
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
public class LoaderOfWhiteDbComment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteDbComment> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteDbCommentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteDbComment ready(List<WhiteDbComment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteDbCommentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteDbCommentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteDbComment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
