package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_BASE_ONE01_SEA_MAGICLAMP as TABLE. <br>
 * <pre>
 * [primary key]
 *     MAGICLAMP_ID
 *
 * [column]
 *     MAGICLAMP_ID, MAGICLAMP_NAME, SEA_ID
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBaseOne01Sea
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteBaseOne01SeaMagiclamp {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteBaseOne01SeaMagiclamp> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteBaseOne01SeaMagiclampBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteBaseOne01SeaMagiclamp ready(List<WhiteBaseOne01SeaMagiclamp> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteBaseOne01SeaMagiclampBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteBaseOne01SeaMagiclampBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteBaseOne01Sea _foreignWhiteBaseOne01SeaLoader;
    public LoaderOfWhiteBaseOne01Sea pulloutWhiteBaseOne01Sea() {
        if (_foreignWhiteBaseOne01SeaLoader == null)
        { _foreignWhiteBaseOne01SeaLoader = new LoaderOfWhiteBaseOne01Sea().ready(myBhv().pulloutWhiteBaseOne01Sea(_selectedList), _selector); }
        return _foreignWhiteBaseOne01SeaLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteBaseOne01SeaMagiclamp> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
