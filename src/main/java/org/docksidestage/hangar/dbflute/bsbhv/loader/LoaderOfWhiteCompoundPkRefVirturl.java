package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_COMPOUND_PK_REF_VIRTURL as TABLE. <br>
 * <pre>
 * [primary key]
 *     REF_FIRST_ID, REF_SECOND_ID, REF_THIRD_ID
 *
 * [column]
 *     REF_FIRST_ID, REF_SECOND_ID, REF_THIRD_ID, COMPOUND_REF_NAME
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
 *     WHITE_COMPOUND_PK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteCompoundPkRefVirturl {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteCompoundPkRefVirturl> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteCompoundPkRefVirturlBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteCompoundPkRefVirturl ready(List<WhiteCompoundPkRefVirturl> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteCompoundPkRefVirturlBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteCompoundPkRefVirturlBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteCompoundPk _foreignWhiteCompoundPkLoader;
    public LoaderOfWhiteCompoundPk pulloutWhiteCompoundPk() {
        if (_foreignWhiteCompoundPkLoader == null)
        { _foreignWhiteCompoundPkLoader = new LoaderOfWhiteCompoundPk().ready(myBhv().pulloutWhiteCompoundPk(_selectedList), _selector); }
        return _foreignWhiteCompoundPkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteCompoundPkRefVirturl> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
