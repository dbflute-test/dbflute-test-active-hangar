package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_ON_PARADE_REF as TABLE. <br>
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REF_NAME, NULLABLE_FK_ON_PARADE_ID, NULLABLE_FK_TO_MANY_ID
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
 *     WHITE_ON_PARADE_NULLABLE_TO_MANY, WHITE_ON_PARADE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteOnParadeNullableToMany, whiteOnParade
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteOnParadeRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteOnParadeRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteOnParadeRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteOnParadeRef ready(List<WhiteOnParadeRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteOnParadeRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteOnParadeRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteOnParadeNullableToMany _foreignWhiteOnParadeNullableToManyLoader;
    public LoaderOfWhiteOnParadeNullableToMany pulloutWhiteOnParadeNullableToMany() {
        if (_foreignWhiteOnParadeNullableToManyLoader == null)
        { _foreignWhiteOnParadeNullableToManyLoader = new LoaderOfWhiteOnParadeNullableToMany().ready(myBhv().pulloutWhiteOnParadeNullableToMany(_selectedList), _selector); }
        return _foreignWhiteOnParadeNullableToManyLoader;
    }

    protected LoaderOfWhiteOnParade _foreignWhiteOnParadeLoader;
    public LoaderOfWhiteOnParade pulloutWhiteOnParade() {
        if (_foreignWhiteOnParadeLoader == null)
        { _foreignWhiteOnParadeLoader = new LoaderOfWhiteOnParade().ready(myBhv().pulloutWhiteOnParade(_selectedList), _selector); }
        return _foreignWhiteOnParadeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteOnParadeRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
