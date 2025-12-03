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
 * The behavior of WHITE_BASE_ONE01_SEA_BROADWAY as TABLE.
 * <pre>
 * [primary-key]
 *     BROADWAY_ID
 *
 * [column]
 *     BROADWAY_ID, BROADWAY_NAME
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseOne01SeaList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer broadwayId = entity.getBroadwayId();
 * String broadwayName = entity.getBroadwayName();
 * entity.setBroadwayId(broadwayId);
 * entity.setBroadwayName(broadwayName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01SeaBroadwayBhv extends org.docksidestage.hangar.dbflute.nogen.ExtendedAbstractBehaviorWritable<WhiteBaseOne01SeaBroadway, WhiteBaseOne01SeaBroadwayCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteBaseOne01SeaBroadwayDbm asDBMeta() { return WhiteBaseOne01SeaBroadwayDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_BASE_ONE01_SEA_BROADWAY"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteBaseOne01SeaBroadwayCB newConditionBean() { return new WhiteBaseOne01SeaBroadwayCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
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
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteBaseOne01SeaBroadway</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteBaseOne01SeaBroadway</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteBaseOne01SeaBroadway</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteBaseOne01SeaBroadway</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne01SeaBroadway> selectEntity(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<WhiteBaseOne01SeaBroadway> facadeSelectEntity(WhiteBaseOne01SeaBroadwayCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne01SeaBroadway> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteBaseOne01SeaBroadwayCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteBaseOne01SeaBroadway <span style="color: #553000">whiteBaseOne01SeaBroadway</span> = <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteBaseOne01SeaBroadway</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteBaseOne01SeaBroadway selectEntityWithDeletedCheck(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param broadwayId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne01SeaBroadway> selectByPK(Integer broadwayId) {
        return facadeSelectByPK(broadwayId);
    }

    protected OptionalEntity<WhiteBaseOne01SeaBroadway> facadeSelectByPK(Integer broadwayId) {
        return doSelectOptionalByPK(broadwayId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne01SeaBroadway> ENTITY doSelectByPK(Integer broadwayId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(broadwayId), tp);
    }

    protected <ENTITY extends WhiteBaseOne01SeaBroadway> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer broadwayId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(broadwayId, tp), broadwayId);
    }

    protected WhiteBaseOne01SeaBroadwayCB xprepareCBAsPK(Integer broadwayId) {
        assertObjectNotNull("broadwayId", broadwayId);
        return newConditionBean().acceptPK(broadwayId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteBaseOne01SeaBroadway&gt; <span style="color: #553000">whiteBaseOne01SeaBroadwayList</span> = <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteBaseOne01SeaBroadway <span style="color: #553000">whiteBaseOne01SeaBroadway</span> : <span style="color: #553000">whiteBaseOne01SeaBroadwayList</span>) {
     *     ... = <span style="color: #553000">whiteBaseOne01SeaBroadway</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteBaseOne01SeaBroadway> selectList(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
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
     * PagingResultBean&lt;WhiteBaseOne01SeaBroadway&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway : <span style="color: #553000">page</span>) {
     *     ... = whiteBaseOne01SeaBroadway.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteBaseOne01SeaBroadway> selectPage(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @param entityLambda The handler of entity row of WhiteBaseOne01SeaBroadway. (NotNull)
     */
    public void selectCursor(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda, EntityRowHandler<WhiteBaseOne01SeaBroadway> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteBaseOne01SeaBroadwayCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteBaseOne01SeaBroadwayList The entity list of whiteBaseOne01SeaBroadway. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList, ReferrerLoaderHandler<LoaderOfWhiteBaseOne01SeaBroadway> loaderLambda) {
        xassLRArg(whiteBaseOne01SeaBroadwayList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne01SeaBroadway().ready(whiteBaseOne01SeaBroadwayList, _behaviorSelector));
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
     * @param whiteBaseOne01SeaBroadway The entity of whiteBaseOne01SeaBroadway. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, ReferrerLoaderHandler<LoaderOfWhiteBaseOne01SeaBroadway> loaderLambda) {
        xassLRArg(whiteBaseOne01SeaBroadway, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne01SeaBroadway().ready(xnewLRAryLs(whiteBaseOne01SeaBroadway), _behaviorSelector));
    }

    /**
     * Load referrer of whiteBaseOne01SeaList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">loadWhiteBaseOne01Sea</span>(<span style="color: #553000">whiteBaseOne01SeaBroadwayList</span>, <span style="color: #553000">seaCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">seaCB</span>.setupSelect...
     *     <span style="color: #553000">seaCB</span>.query().set...
     *     <span style="color: #553000">seaCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway : <span style="color: #553000">whiteBaseOne01SeaBroadwayList</span>) {
     *     ... = whiteBaseOne01SeaBroadway.<span style="color: #CC4747">getWhiteBaseOne01SeaList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBroadwayId_InScope(pkList);
     * cb.query().addOrderBy_BroadwayId_Asc();
     * </pre>
     * @param whiteBaseOne01SeaBroadwayList The entity list of whiteBaseOne01SeaBroadway. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteBaseOne01Sea> loadWhiteBaseOne01Sea(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList, ReferrerConditionSetupper<WhiteBaseOne01SeaCB> refCBLambda) {
        xassLRArg(whiteBaseOne01SeaBroadwayList, refCBLambda);
        return doLoadWhiteBaseOne01Sea(whiteBaseOne01SeaBroadwayList, new LoadReferrerOption<WhiteBaseOne01SeaCB, WhiteBaseOne01Sea>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteBaseOne01SeaList by the set-upper of referrer. <br>
     * WHITE_BASE_ONE01_SEA by BROADWAY_ID, named 'whiteBaseOne01SeaList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">loadWhiteBaseOne01Sea</span>(<span style="color: #553000">whiteBaseOne01SeaBroadway</span>, <span style="color: #553000">seaCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">seaCB</span>.setupSelect...
     *     <span style="color: #553000">seaCB</span>.query().set...
     *     <span style="color: #553000">seaCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteBaseOne01SeaBroadway</span>.<span style="color: #CC4747">getWhiteBaseOne01SeaList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBroadwayId_InScope(pkList);
     * cb.query().addOrderBy_BroadwayId_Asc();
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity of whiteBaseOne01SeaBroadway. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteBaseOne01Sea> loadWhiteBaseOne01Sea(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, ReferrerConditionSetupper<WhiteBaseOne01SeaCB> refCBLambda) {
        xassLRArg(whiteBaseOne01SeaBroadway, refCBLambda);
        return doLoadWhiteBaseOne01Sea(xnewLRLs(whiteBaseOne01SeaBroadway), new LoadReferrerOption<WhiteBaseOne01SeaCB, WhiteBaseOne01Sea>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<WhiteBaseOne01Sea> doLoadWhiteBaseOne01Sea(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList, LoadReferrerOption<WhiteBaseOne01SeaCB, WhiteBaseOne01Sea> option) {
        return helpLoadReferrerInternally(whiteBaseOne01SeaBroadwayList, option, "whiteBaseOne01SeaList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key broadwayId.
     * @param whiteBaseOne01SeaBroadwayList The list of whiteBaseOne01SeaBroadway. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractBroadwayIdList(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList)
    { return helpExtractListInternally(whiteBaseOne01SeaBroadwayList, "broadwayId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne01SeaBroadway.setFoo...(value);
     * whiteBaseOne01SeaBroadway.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.set...;</span>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">insert</span>(whiteBaseOne01SeaBroadway);
     * ... = whiteBaseOne01SeaBroadway.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteBaseOne01SeaBroadway The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway) {
        doInsert(whiteBaseOne01SeaBroadway, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * whiteBaseOne01SeaBroadway.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne01SeaBroadway.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne01SeaBroadway.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">update</span>(whiteBaseOne01SeaBroadway);
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway) {
        doUpdate(whiteBaseOne01SeaBroadway, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteBaseOne01SeaBroadway The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway) {
        doInsertOrUpdate(whiteBaseOne01SeaBroadway, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * whiteBaseOne01SeaBroadway.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne01SeaBroadway.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">delete</span>(whiteBaseOne01SeaBroadway);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway) {
        doDelete(whiteBaseOne01SeaBroadway, null);
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
     *     WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     *     whiteBaseOne01SeaBroadway.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne01SeaBroadway.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteBaseOne01SeaBroadwayList.add(whiteBaseOne01SeaBroadway);
     * }
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteBaseOne01SeaBroadwayList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteBaseOne01SeaBroadwayList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList) {
        return doBatchInsert(whiteBaseOne01SeaBroadwayList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     *     whiteBaseOne01SeaBroadway.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne01SeaBroadway.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteBaseOne01SeaBroadway.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteBaseOne01SeaBroadwayList.add(whiteBaseOne01SeaBroadway);
     * }
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteBaseOne01SeaBroadwayList);
     * </pre>
     * @param whiteBaseOne01SeaBroadwayList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList) {
        return doBatchUpdate(whiteBaseOne01SeaBroadwayList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteBaseOne01SeaBroadwayList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList) {
        return doBatchDelete(whiteBaseOne01SeaBroadwayList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteBaseOne01SeaBroadway, WhiteBaseOne01SeaBroadwayCB&gt;() {
     *     public ConditionBean setup(WhiteBaseOne01SeaBroadway entity, WhiteBaseOne01SeaBroadwayCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteBaseOne01SeaBroadway, WhiteBaseOne01SeaBroadwayCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setPK...(value);</span>
     * whiteBaseOne01SeaBroadway.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteBaseOne01SeaBroadway, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
        return doQueryUpdate(whiteBaseOne01SeaBroadway, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda) {
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
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne01SeaBroadway.setFoo...(value);
     * whiteBaseOne01SeaBroadway.setBar...(value);
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteBaseOne01SeaBroadway, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteBaseOne01SeaBroadway.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, InsertOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        doInsert(whiteBaseOne01SeaBroadway, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * whiteBaseOne01SeaBroadway.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne01SeaBroadway.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne01SeaBroadway.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteBaseOne01SeaBroadway, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, UpdateOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        doUpdate(whiteBaseOne01SeaBroadway, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteBaseOne01SeaBroadway The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, InsertOption<WhiteBaseOne01SeaBroadwayCB>> insertOpLambda, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, UpdateOption<WhiteBaseOne01SeaBroadwayCB>> updateOpLambda) {
        doInsertOrUpdate(whiteBaseOne01SeaBroadway, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteBaseOne01SeaBroadway The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, DeleteOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        doDelete(whiteBaseOne01SeaBroadway, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteBaseOne01SeaBroadwayList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, InsertOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        return doBatchInsert(whiteBaseOne01SeaBroadwayList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteBaseOne01SeaBroadwayList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, UpdateOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        return doBatchUpdate(whiteBaseOne01SeaBroadwayList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteBaseOne01SeaBroadwayList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteBaseOne01SeaBroadway> whiteBaseOne01SeaBroadwayList, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, DeleteOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        return doBatchDelete(whiteBaseOne01SeaBroadwayList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteBaseOne01SeaBroadway, WhiteBaseOne01SeaBroadwayCB> manyArgLambda, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, InsertOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway = <span style="color: #70226C">new</span> WhiteBaseOne01SeaBroadway();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setPK...(value);</span>
     * whiteBaseOne01SeaBroadway.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne01SeaBroadway.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteBaseOne01SeaBroadway, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne01SeaBroadway The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteBaseOne01SeaBroadway whiteBaseOne01SeaBroadway, CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, UpdateOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        return doQueryUpdate(whiteBaseOne01SeaBroadway, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBroadwayBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteBaseOne01SeaBroadway, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne01SeaBroadway. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteBaseOne01SeaBroadwayCB> cbLambda, WritableOptionCall<WhiteBaseOne01SeaBroadwayCB, DeleteOption<WhiteBaseOne01SeaBroadwayCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteBaseOne01SeaBroadwayBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteBaseOne01SeaBroadwayBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteBaseOne01SeaBroadwayBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteBaseOne01SeaBroadwayBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteBaseOne01SeaBroadwayBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteBaseOne01SeaBroadwayBhv.outideSql().removeBlockComment().selectList()
     * whiteBaseOne01SeaBroadwayBhv.outideSql().removeLineComment().selectList()
     * whiteBaseOne01SeaBroadwayBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteBaseOne01SeaBroadwayBhv> outsideSql() {
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
    protected Class<? extends WhiteBaseOne01SeaBroadway> typeOfSelectedEntity() { return WhiteBaseOne01SeaBroadway.class; }
    protected Class<WhiteBaseOne01SeaBroadway> typeOfHandlingEntity() { return WhiteBaseOne01SeaBroadway.class; }
    protected Class<WhiteBaseOne01SeaBroadwayCB> typeOfHandlingConditionBean() { return WhiteBaseOne01SeaBroadwayCB.class; }
}
