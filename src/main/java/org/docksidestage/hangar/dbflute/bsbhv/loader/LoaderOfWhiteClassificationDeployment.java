package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_CLASSIFICATION_DEPLOYMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     DEPLOYMENT_ID
 *
 * [column]
 *     DEPLOYMENT_ID, SEA_FLG, DEPLOYMENT_TYPE_CODE
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
public class LoaderOfWhiteClassificationDeployment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteClassificationDeployment> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteClassificationDeploymentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteClassificationDeployment ready(List<WhiteClassificationDeployment> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteClassificationDeploymentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteClassificationDeploymentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteClassificationDeployment> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
