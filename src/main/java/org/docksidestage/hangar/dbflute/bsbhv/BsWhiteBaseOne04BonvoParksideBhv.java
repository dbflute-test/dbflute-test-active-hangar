/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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
 * The behavior of WHITE_BASE_ONE04_BONVO_PARKSIDE as TABLE.
 * <pre>
 * [primary-key]
 *     PARKSIDE_ID
 *
 * [column]
 *     PARKSIDE_ID, PARKSIDE_NAME
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
 *     WHITE_BASE_ONE04_BONVO
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne04BonvoList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer parksideId = entity.getParksideId();
 * String parksideName = entity.getParksideName();
 * entity.setParksideId(parksideId);
 * entity.setParksideName(parksideName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne04BonvoParksideBhv extends org.docksidestage.hangar.dbflute.nogen.ExtendedAbstractBehaviorWritable<WhiteBaseOne04BonvoParkside, WhiteBaseOne04BonvoParksideCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteBaseOne04BonvoParksideDbm asDBMeta() { return WhiteBaseOne04BonvoParksideDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_BASE_ONE04_BONVO_PARKSIDE"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteBaseOne04BonvoParksideCB newConditionBean() { return new WhiteBaseOne04BonvoParksideCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
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
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteBaseOne04BonvoParkside</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteBaseOne04BonvoParkside</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteBaseOne04BonvoParkside</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteBaseOne04BonvoParkside</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne04BonvoParkside> selectEntity(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<WhiteBaseOne04BonvoParkside> facadeSelectEntity(WhiteBaseOne04BonvoParksideCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne04BonvoParkside> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteBaseOne04BonvoParksideCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteBaseOne04BonvoParkside <span style="color: #553000">whiteBaseOne04BonvoParkside</span> = <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteBaseOne04BonvoParkside</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteBaseOne04BonvoParkside selectEntityWithDeletedCheck(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param parksideId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne04BonvoParkside> selectByPK(Integer parksideId) {
        return facadeSelectByPK(parksideId);
    }

    protected OptionalEntity<WhiteBaseOne04BonvoParkside> facadeSelectByPK(Integer parksideId) {
        return doSelectOptionalByPK(parksideId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne04BonvoParkside> ENTITY doSelectByPK(Integer parksideId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(parksideId), tp);
    }

    protected <ENTITY extends WhiteBaseOne04BonvoParkside> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer parksideId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(parksideId, tp), parksideId);
    }

    protected WhiteBaseOne04BonvoParksideCB xprepareCBAsPK(Integer parksideId) {
        assertObjectNotNull("parksideId", parksideId);
        return newConditionBean().acceptPK(parksideId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteBaseOne04BonvoParkside&gt; <span style="color: #553000">whiteBaseOne04BonvoParksideList</span> = <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteBaseOne04BonvoParkside <span style="color: #553000">whiteBaseOne04BonvoParkside</span> : <span style="color: #553000">whiteBaseOne04BonvoParksideList</span>) {
     *     ... = <span style="color: #553000">whiteBaseOne04BonvoParkside</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteBaseOne04BonvoParkside> selectList(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
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
     * PagingResultBean&lt;WhiteBaseOne04BonvoParkside&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside : <span style="color: #553000">page</span>) {
     *     ... = whiteBaseOne04BonvoParkside.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteBaseOne04BonvoParkside> selectPage(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @param entityLambda The handler of entity row of WhiteBaseOne04BonvoParkside. (NotNull)
     */
    public void selectCursor(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda, EntityRowHandler<WhiteBaseOne04BonvoParkside> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteBaseOne04BonvoParksideCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteBaseOne04BonvoParksideList The entity list of whiteBaseOne04BonvoParkside. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList, ReferrerLoaderHandler<LoaderOfWhiteBaseOne04BonvoParkside> loaderLambda) {
        xassLRArg(whiteBaseOne04BonvoParksideList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne04BonvoParkside().ready(whiteBaseOne04BonvoParksideList, _behaviorSelector));
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
     * @param whiteBaseOne04BonvoParkside The entity of whiteBaseOne04BonvoParkside. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, ReferrerLoaderHandler<LoaderOfWhiteBaseOne04BonvoParkside> loaderLambda) {
        xassLRArg(whiteBaseOne04BonvoParkside, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne04BonvoParkside().ready(xnewLRAryLs(whiteBaseOne04BonvoParkside), _behaviorSelector));
    }

    /**
     * Load referrer of whiteBaseOne04BonvoList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">loadWhiteBaseOne04Bonvo</span>(<span style="color: #553000">whiteBaseOne04BonvoParksideList</span>, <span style="color: #553000">bonvoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bonvoCB</span>.setupSelect...
     *     <span style="color: #553000">bonvoCB</span>.query().set...
     *     <span style="color: #553000">bonvoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside : <span style="color: #553000">whiteBaseOne04BonvoParksideList</span>) {
     *     ... = whiteBaseOne04BonvoParkside.<span style="color: #CC4747">getWhiteBaseOne04BonvoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParksideId_InScope(pkList);
     * cb.query().addOrderBy_ParksideId_Asc();
     * </pre>
     * @param whiteBaseOne04BonvoParksideList The entity list of whiteBaseOne04BonvoParkside. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteBaseOne04Bonvo> loadWhiteBaseOne04Bonvo(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList, ReferrerConditionSetupper<WhiteBaseOne04BonvoCB> refCBLambda) {
        xassLRArg(whiteBaseOne04BonvoParksideList, refCBLambda);
        return doLoadWhiteBaseOne04Bonvo(whiteBaseOne04BonvoParksideList, new LoadReferrerOption<WhiteBaseOne04BonvoCB, WhiteBaseOne04Bonvo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteBaseOne04BonvoList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE04_BONVO by PARKSIDE_ID, named 'whiteBaseOne04BonvoList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">loadWhiteBaseOne04Bonvo</span>(<span style="color: #553000">whiteBaseOne04BonvoParkside</span>, <span style="color: #553000">bonvoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bonvoCB</span>.setupSelect...
     *     <span style="color: #553000">bonvoCB</span>.query().set...
     *     <span style="color: #553000">bonvoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteBaseOne04BonvoParkside</span>.<span style="color: #CC4747">getWhiteBaseOne04BonvoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParksideId_InScope(pkList);
     * cb.query().addOrderBy_ParksideId_Asc();
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity of whiteBaseOne04BonvoParkside. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteBaseOne04Bonvo> loadWhiteBaseOne04Bonvo(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, ReferrerConditionSetupper<WhiteBaseOne04BonvoCB> refCBLambda) {
        xassLRArg(whiteBaseOne04BonvoParkside, refCBLambda);
        return doLoadWhiteBaseOne04Bonvo(xnewLRLs(whiteBaseOne04BonvoParkside), new LoadReferrerOption<WhiteBaseOne04BonvoCB, WhiteBaseOne04Bonvo>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<WhiteBaseOne04Bonvo> doLoadWhiteBaseOne04Bonvo(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList, LoadReferrerOption<WhiteBaseOne04BonvoCB, WhiteBaseOne04Bonvo> option) {
        return helpLoadReferrerInternally(whiteBaseOne04BonvoParksideList, option, "whiteBaseOne04BonvoList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key parksideId.
     * @param whiteBaseOne04BonvoParksideList The list of whiteBaseOne04BonvoParkside. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractParksideIdList(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList)
    { return helpExtractListInternally(whiteBaseOne04BonvoParksideList, "parksideId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne04BonvoParkside.setFoo...(value);
     * whiteBaseOne04BonvoParkside.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.set...;</span>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">insert</span>(whiteBaseOne04BonvoParkside);
     * ... = whiteBaseOne04BonvoParkside.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteBaseOne04BonvoParkside The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside) {
        doInsert(whiteBaseOne04BonvoParkside, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * whiteBaseOne04BonvoParkside.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne04BonvoParkside.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne04BonvoParkside.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">update</span>(whiteBaseOne04BonvoParkside);
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside) {
        doUpdate(whiteBaseOne04BonvoParkside, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteBaseOne04BonvoParkside The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside) {
        doInsertOrUpdate(whiteBaseOne04BonvoParkside, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * whiteBaseOne04BonvoParkside.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne04BonvoParkside.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">delete</span>(whiteBaseOne04BonvoParkside);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside) {
        doDelete(whiteBaseOne04BonvoParkside, null);
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
     *     WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     *     whiteBaseOne04BonvoParkside.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne04BonvoParkside.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteBaseOne04BonvoParksideList.add(whiteBaseOne04BonvoParkside);
     * }
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteBaseOne04BonvoParksideList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteBaseOne04BonvoParksideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList) {
        return doBatchInsert(whiteBaseOne04BonvoParksideList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     *     whiteBaseOne04BonvoParkside.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne04BonvoParkside.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteBaseOne04BonvoParkside.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteBaseOne04BonvoParksideList.add(whiteBaseOne04BonvoParkside);
     * }
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteBaseOne04BonvoParksideList);
     * </pre>
     * @param whiteBaseOne04BonvoParksideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList) {
        return doBatchUpdate(whiteBaseOne04BonvoParksideList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteBaseOne04BonvoParksideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList) {
        return doBatchDelete(whiteBaseOne04BonvoParksideList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteBaseOne04BonvoParkside, WhiteBaseOne04BonvoParksideCB&gt;() {
     *     public ConditionBean setup(WhiteBaseOne04BonvoParkside entity, WhiteBaseOne04BonvoParksideCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteBaseOne04BonvoParkside, WhiteBaseOne04BonvoParksideCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setPK...(value);</span>
     * whiteBaseOne04BonvoParkside.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteBaseOne04BonvoParkside, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
        return doQueryUpdate(whiteBaseOne04BonvoParkside, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda) {
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
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne04BonvoParkside.setFoo...(value);
     * whiteBaseOne04BonvoParkside.setBar...(value);
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteBaseOne04BonvoParkside, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteBaseOne04BonvoParkside.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, InsertOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        doInsert(whiteBaseOne04BonvoParkside, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * whiteBaseOne04BonvoParkside.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne04BonvoParkside.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne04BonvoParkside.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteBaseOne04BonvoParkside, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, UpdateOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        doUpdate(whiteBaseOne04BonvoParkside, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteBaseOne04BonvoParkside The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, InsertOption<WhiteBaseOne04BonvoParksideCB>> insertOpLambda, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, UpdateOption<WhiteBaseOne04BonvoParksideCB>> updateOpLambda) {
        doInsertOrUpdate(whiteBaseOne04BonvoParkside, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteBaseOne04BonvoParkside The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, DeleteOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        doDelete(whiteBaseOne04BonvoParkside, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteBaseOne04BonvoParksideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, InsertOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        return doBatchInsert(whiteBaseOne04BonvoParksideList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteBaseOne04BonvoParksideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, UpdateOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        return doBatchUpdate(whiteBaseOne04BonvoParksideList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteBaseOne04BonvoParksideList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteBaseOne04BonvoParkside> whiteBaseOne04BonvoParksideList, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, DeleteOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        return doBatchDelete(whiteBaseOne04BonvoParksideList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteBaseOne04BonvoParkside, WhiteBaseOne04BonvoParksideCB> manyArgLambda, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, InsertOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside = <span style="color: #70226C">new</span> WhiteBaseOne04BonvoParkside();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setPK...(value);</span>
     * whiteBaseOne04BonvoParkside.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne04BonvoParkside.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteBaseOne04BonvoParkside, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne04BonvoParkside The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteBaseOne04BonvoParkside whiteBaseOne04BonvoParkside, CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, UpdateOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        return doQueryUpdate(whiteBaseOne04BonvoParkside, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne04BonvoParksideBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteBaseOne04BonvoParkside, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne04BonvoParkside. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteBaseOne04BonvoParksideCB> cbLambda, WritableOptionCall<WhiteBaseOne04BonvoParksideCB, DeleteOption<WhiteBaseOne04BonvoParksideCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteBaseOne04BonvoParksideBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteBaseOne04BonvoParksideBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteBaseOne04BonvoParksideBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteBaseOne04BonvoParksideBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteBaseOne04BonvoParksideBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteBaseOne04BonvoParksideBhv.outideSql().removeBlockComment().selectList()
     * whiteBaseOne04BonvoParksideBhv.outideSql().removeLineComment().selectList()
     * whiteBaseOne04BonvoParksideBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteBaseOne04BonvoParksideBhv> outsideSql() {
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
    protected Class<? extends WhiteBaseOne04BonvoParkside> typeOfSelectedEntity() { return WhiteBaseOne04BonvoParkside.class; }
    protected Class<WhiteBaseOne04BonvoParkside> typeOfHandlingEntity() { return WhiteBaseOne04BonvoParkside.class; }
    protected Class<WhiteBaseOne04BonvoParksideCB> typeOfHandlingConditionBean() { return WhiteBaseOne04BonvoParksideCB.class; }
}
