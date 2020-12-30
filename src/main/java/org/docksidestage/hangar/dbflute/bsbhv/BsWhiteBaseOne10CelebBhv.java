package org.docksidestage.hangar.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.writable.coins.DateUpdateAdjuster;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.bsbhv.loader.*;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.*;
import org.docksidestage.hangar.dbflute.cbean.*;

/**
 * The behavior of WHITE_BASE_ONE10_CELEB as TABLE. <br>
 * <pre>
 * [primary key]
 *     CELEB_ID
 *
 * [column]
 *     CELEB_ID, CELEB_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteBase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne10CelebBhv extends org.docksidestage.hangar.dbflute.nogen.ExtendedAbstractBehaviorWritable<WhiteBaseOne10Celeb, WhiteBaseOne10CelebCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteBaseOne10CelebDbm asDBMeta() { return WhiteBaseOne10CelebDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_BASE_ONE10_CELEB"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteBaseOne10CelebCB newConditionBean() { return new WhiteBaseOne10CelebCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteBaseOne10Celeb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteBaseOne10Celeb</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteBaseOne10Celeb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteBaseOne10Celeb</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne10Celeb> selectEntity(CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<WhiteBaseOne10Celeb> facadeSelectEntity(WhiteBaseOne10CelebCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne10Celeb> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteBaseOne10CelebCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteBaseOne10Celeb <span style="color: #553000">whiteBaseOne10Celeb</span> = <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteBaseOne10Celeb</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteBaseOne10Celeb selectEntityWithDeletedCheck(CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param celebId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne10Celeb> selectByPK(Integer celebId) {
        return facadeSelectByPK(celebId);
    }

    protected OptionalEntity<WhiteBaseOne10Celeb> facadeSelectByPK(Integer celebId) {
        return doSelectOptionalByPK(celebId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne10Celeb> ENTITY doSelectByPK(Integer celebId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(celebId), tp);
    }

    protected <ENTITY extends WhiteBaseOne10Celeb> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer celebId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(celebId, tp), celebId);
    }

    protected WhiteBaseOne10CelebCB xprepareCBAsPK(Integer celebId) {
        assertObjectNotNull("celebId", celebId);
        return newConditionBean().acceptPK(celebId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param baseId : UQ, INTEGER(10), FK to WHITE_BASE. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne10Celeb> selectByUniqueOf(Integer baseId) {
        return facadeSelectByUniqueOf(baseId);
    }

    protected OptionalEntity<WhiteBaseOne10Celeb> facadeSelectByUniqueOf(Integer baseId) {
        return doSelectByUniqueOf(baseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne10Celeb> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer baseId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(baseId), tp), baseId);
    }

    protected WhiteBaseOne10CelebCB xprepareCBAsUniqueOf(Integer baseId) {
        assertObjectNotNull("baseId", baseId);
        return newConditionBean().acceptUniqueOf(baseId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteBaseOne10Celeb&gt; <span style="color: #553000">whiteBaseOne10CelebList</span> = <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteBaseOne10Celeb <span style="color: #553000">whiteBaseOne10Celeb</span> : <span style="color: #553000">whiteBaseOne10CelebList</span>) {
     *     ... = <span style="color: #553000">whiteBaseOne10Celeb</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteBaseOne10Celeb> selectList(CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;WhiteBaseOne10Celeb&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteBaseOne10Celeb whiteBaseOne10Celeb : <span style="color: #553000">page</span>) {
     *     ... = whiteBaseOne10Celeb.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteBaseOne10Celeb> selectPage(CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @param entityLambda The handler of entity row of WhiteBaseOne10Celeb. (NotNull)
     */
    public void selectCursor(CBCall<WhiteBaseOne10CelebCB> cbLambda, EntityRowHandler<WhiteBaseOne10Celeb> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteBaseOne10CelebCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteBaseOne10CelebList The entity list of whiteBaseOne10Celeb. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList, ReferrerLoaderHandler<LoaderOfWhiteBaseOne10Celeb> loaderLambda) {
        xassLRArg(whiteBaseOne10CelebList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne10Celeb().ready(whiteBaseOne10CelebList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteBaseOne10Celeb The entity of whiteBaseOne10Celeb. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteBaseOne10Celeb whiteBaseOne10Celeb, ReferrerLoaderHandler<LoaderOfWhiteBaseOne10Celeb> loaderLambda) {
        xassLRArg(whiteBaseOne10Celeb, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne10Celeb().ready(xnewLRAryLs(whiteBaseOne10Celeb), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteBase'.
     * @param whiteBaseOne10CelebList The list of whiteBaseOne10Celeb. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteBase> pulloutWhiteBase(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList)
    { return helpPulloutInternally(whiteBaseOne10CelebList, "whiteBase"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key celebId.
     * @param whiteBaseOne10CelebList The list of whiteBaseOne10Celeb. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractCelebIdList(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList)
    { return helpExtractListInternally(whiteBaseOne10CelebList, "celebId"); }

    /**
     * Extract the value list of (single) unique key baseId.
     * @param whiteBaseOne10CelebList The list of whiteBaseOne10Celeb. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractBaseIdList(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList)
    { return helpExtractListInternally(whiteBaseOne10CelebList, "baseId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne10Celeb.setFoo...(value);
     * whiteBaseOne10Celeb.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.set...;</span>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">insert</span>(whiteBaseOne10Celeb);
     * ... = whiteBaseOne10Celeb.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteBaseOne10Celeb The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteBaseOne10Celeb whiteBaseOne10Celeb) {
        doInsert(whiteBaseOne10Celeb, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * whiteBaseOne10Celeb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne10Celeb.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne10Celeb.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">update</span>(whiteBaseOne10Celeb);
     * </pre>
     * @param whiteBaseOne10Celeb The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteBaseOne10Celeb whiteBaseOne10Celeb) {
        doUpdate(whiteBaseOne10Celeb, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteBaseOne10Celeb The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteBaseOne10Celeb whiteBaseOne10Celeb) {
        doInsertOrUpdate(whiteBaseOne10Celeb, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * whiteBaseOne10Celeb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne10Celeb.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">delete</span>(whiteBaseOne10Celeb);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteBaseOne10Celeb The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteBaseOne10Celeb whiteBaseOne10Celeb) {
        doDelete(whiteBaseOne10Celeb, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     *     whiteBaseOne10Celeb.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne10Celeb.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteBaseOne10CelebList.add(whiteBaseOne10Celeb);
     * }
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteBaseOne10CelebList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteBaseOne10CelebList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList) {
        return doBatchInsert(whiteBaseOne10CelebList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     *     whiteBaseOne10Celeb.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne10Celeb.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteBaseOne10Celeb.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteBaseOne10CelebList.add(whiteBaseOne10Celeb);
     * }
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteBaseOne10CelebList);
     * </pre>
     * @param whiteBaseOne10CelebList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList) {
        return doBatchUpdate(whiteBaseOne10CelebList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteBaseOne10CelebList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList) {
        return doBatchDelete(whiteBaseOne10CelebList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteBaseOne10Celeb, WhiteBaseOne10CelebCB&gt;() {
     *     public ConditionBean setup(WhiteBaseOne10Celeb entity, WhiteBaseOne10CelebCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteBaseOne10Celeb, WhiteBaseOne10CelebCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setPK...(value);</span>
     * whiteBaseOne10Celeb.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteBaseOne10Celeb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteBaseOne10Celeb The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteBaseOne10Celeb whiteBaseOne10Celeb, CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return doQueryUpdate(whiteBaseOne10Celeb, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteBaseOne10Celeb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteBaseOne10CelebCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne10Celeb.setFoo...(value);
     * whiteBaseOne10Celeb.setBar...(value);
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteBaseOne10Celeb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteBaseOne10Celeb.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteBaseOne10Celeb The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteBaseOne10Celeb whiteBaseOne10Celeb, WritableOptionCall<WhiteBaseOne10CelebCB, InsertOption<WhiteBaseOne10CelebCB>> opLambda) {
        doInsert(whiteBaseOne10Celeb, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * whiteBaseOne10Celeb.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne10Celeb.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne10Celeb.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteBaseOne10Celeb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne10Celeb The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteBaseOne10Celeb whiteBaseOne10Celeb, WritableOptionCall<WhiteBaseOne10CelebCB, UpdateOption<WhiteBaseOne10CelebCB>> opLambda) {
        doUpdate(whiteBaseOne10Celeb, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteBaseOne10Celeb The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteBaseOne10Celeb whiteBaseOne10Celeb, WritableOptionCall<WhiteBaseOne10CelebCB, InsertOption<WhiteBaseOne10CelebCB>> insertOpLambda, WritableOptionCall<WhiteBaseOne10CelebCB, UpdateOption<WhiteBaseOne10CelebCB>> updateOpLambda) {
        doInsertOrUpdate(whiteBaseOne10Celeb, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteBaseOne10Celeb The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteBaseOne10Celeb whiteBaseOne10Celeb, WritableOptionCall<WhiteBaseOne10CelebCB, DeleteOption<WhiteBaseOne10CelebCB>> opLambda) {
        doDelete(whiteBaseOne10Celeb, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteBaseOne10CelebList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList, WritableOptionCall<WhiteBaseOne10CelebCB, InsertOption<WhiteBaseOne10CelebCB>> opLambda) {
        return doBatchInsert(whiteBaseOne10CelebList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteBaseOne10CelebList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList, WritableOptionCall<WhiteBaseOne10CelebCB, UpdateOption<WhiteBaseOne10CelebCB>> opLambda) {
        return doBatchUpdate(whiteBaseOne10CelebList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteBaseOne10CelebList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteBaseOne10Celeb> whiteBaseOne10CelebList, WritableOptionCall<WhiteBaseOne10CelebCB, DeleteOption<WhiteBaseOne10CelebCB>> opLambda) {
        return doBatchDelete(whiteBaseOne10CelebList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WhiteBaseOne10Celeb, WhiteBaseOne10CelebCB> manyArgLambda, WritableOptionCall<WhiteBaseOne10CelebCB, InsertOption<WhiteBaseOne10CelebCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteBaseOne10Celeb whiteBaseOne10Celeb = <span style="color: #70226C">new</span> WhiteBaseOne10Celeb();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setPK...(value);</span>
     * whiteBaseOne10Celeb.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne10Celeb.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteBaseOne10Celeb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne10Celeb The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteBaseOne10Celeb whiteBaseOne10Celeb, CBCall<WhiteBaseOne10CelebCB> cbLambda, WritableOptionCall<WhiteBaseOne10CelebCB, UpdateOption<WhiteBaseOne10CelebCB>> opLambda) {
        return doQueryUpdate(whiteBaseOne10Celeb, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne10CelebBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteBaseOne10Celeb, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne10Celeb. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteBaseOne10CelebCB> cbLambda, WritableOptionCall<WhiteBaseOne10CelebCB, DeleteOption<WhiteBaseOne10CelebCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteBaseOne10CelebBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteBaseOne10CelebBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne10CelebBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteBaseOne10CelebBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne10CelebBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteBaseOne10CelebBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteBaseOne10CelebBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteBaseOne10CelebBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteBaseOne10CelebBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteBaseOne10CelebBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteBaseOne10CelebBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteBaseOne10CelebBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteBaseOne10CelebBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteBaseOne10CelebBhv.outideSql().removeBlockComment().selectList()
     * whiteBaseOne10CelebBhv.outideSql().removeLineComment().selectList()
     * whiteBaseOne10CelebBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteBaseOne10CelebBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                           Framework Filter Override
    //                                                           =========================
    @Override
    protected void frameworkFilterEntityOfInsert(Entity entity, org.dbflute.optional.OptionalThing<InsertOption<? extends ConditionBean>> option) {
        super.frameworkFilterEntityOfInsert(entity, option);
        new DateUpdateAdjuster().truncatePrecisionOfEntityProperty(entity);
    }

    @Override
    protected void frameworkFilterEntityOfUpdate(Entity entity, org.dbflute.optional.OptionalThing<UpdateOption<? extends ConditionBean>> option) {
        super.frameworkFilterEntityOfUpdate(entity, option);
        new DateUpdateAdjuster().truncatePrecisionOfEntityProperty(entity);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteBaseOne10Celeb> typeOfSelectedEntity() { return WhiteBaseOne10Celeb.class; }
    protected Class<WhiteBaseOne10Celeb> typeOfHandlingEntity() { return WhiteBaseOne10Celeb.class; }
    protected Class<WhiteBaseOne10CelebCB> typeOfHandlingConditionBean() { return WhiteBaseOne10CelebCB.class; }
}
