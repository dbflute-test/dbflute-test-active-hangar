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
 * The behavior of WHITE_BASE_ONE07_MIRACO as TABLE.
 * <pre>
 * [primary-key]
 *     MIRACO_ID
 *
 * [column]
 *     MIRACO_ID, MIRACO_NAME
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
 *     WHITE_BASE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteBaseList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer miracoId = entity.getMiracoId();
 * String miracoName = entity.getMiracoName();
 * entity.setMiracoId(miracoId);
 * entity.setMiracoName(miracoName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne07MiracoBhv extends org.docksidestage.hangar.dbflute.nogen.ExtendedAbstractBehaviorWritable<WhiteBaseOne07Miraco, WhiteBaseOne07MiracoCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteBaseOne07MiracoDbm asDBMeta() { return WhiteBaseOne07MiracoDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_BASE_ONE07_MIRACO"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteBaseOne07MiracoCB newConditionBean() { return new WhiteBaseOne07MiracoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
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
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteBaseOne07Miraco</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteBaseOne07Miraco</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteBaseOne07Miraco</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteBaseOne07Miraco</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne07Miraco> selectEntity(CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<WhiteBaseOne07Miraco> facadeSelectEntity(WhiteBaseOne07MiracoCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne07Miraco> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteBaseOne07MiracoCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteBaseOne07Miraco <span style="color: #553000">whiteBaseOne07Miraco</span> = <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteBaseOne07Miraco</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteBaseOne07Miraco selectEntityWithDeletedCheck(CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param miracoId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteBaseOne07Miraco> selectByPK(Integer miracoId) {
        return facadeSelectByPK(miracoId);
    }

    protected OptionalEntity<WhiteBaseOne07Miraco> facadeSelectByPK(Integer miracoId) {
        return doSelectOptionalByPK(miracoId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteBaseOne07Miraco> ENTITY doSelectByPK(Integer miracoId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(miracoId), tp);
    }

    protected <ENTITY extends WhiteBaseOne07Miraco> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer miracoId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(miracoId, tp), miracoId);
    }

    protected WhiteBaseOne07MiracoCB xprepareCBAsPK(Integer miracoId) {
        assertObjectNotNull("miracoId", miracoId);
        return newConditionBean().acceptPK(miracoId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteBaseOne07Miraco&gt; <span style="color: #553000">whiteBaseOne07MiracoList</span> = <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteBaseOne07Miraco <span style="color: #553000">whiteBaseOne07Miraco</span> : <span style="color: #553000">whiteBaseOne07MiracoList</span>) {
     *     ... = <span style="color: #553000">whiteBaseOne07Miraco</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteBaseOne07Miraco> selectList(CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
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
     * PagingResultBean&lt;WhiteBaseOne07Miraco&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteBaseOne07Miraco whiteBaseOne07Miraco : <span style="color: #553000">page</span>) {
     *     ... = whiteBaseOne07Miraco.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteBaseOne07Miraco> selectPage(CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @param entityLambda The handler of entity row of WhiteBaseOne07Miraco. (NotNull)
     */
    public void selectCursor(CBCall<WhiteBaseOne07MiracoCB> cbLambda, EntityRowHandler<WhiteBaseOne07Miraco> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteBaseOne07MiracoCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteBaseOne07MiracoList The entity list of whiteBaseOne07Miraco. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList, ReferrerLoaderHandler<LoaderOfWhiteBaseOne07Miraco> loaderLambda) {
        xassLRArg(whiteBaseOne07MiracoList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne07Miraco().ready(whiteBaseOne07MiracoList, _behaviorSelector));
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
     * @param whiteBaseOne07Miraco The entity of whiteBaseOne07Miraco. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteBaseOne07Miraco whiteBaseOne07Miraco, ReferrerLoaderHandler<LoaderOfWhiteBaseOne07Miraco> loaderLambda) {
        xassLRArg(whiteBaseOne07Miraco, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteBaseOne07Miraco().ready(xnewLRAryLs(whiteBaseOne07Miraco), _behaviorSelector));
    }

    /**
     * Load referrer of whiteBaseList by the set-upper of referrer. <br>
     * WHITE_BASE by MIRACO_ID, named 'whiteBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">loadWhiteBase</span>(<span style="color: #553000">whiteBaseOne07MiracoList</span>, <span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseCB</span>.setupSelect...
     *     <span style="color: #553000">baseCB</span>.query().set...
     *     <span style="color: #553000">baseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteBaseOne07Miraco whiteBaseOne07Miraco : <span style="color: #553000">whiteBaseOne07MiracoList</span>) {
     *     ... = whiteBaseOne07Miraco.<span style="color: #CC4747">getWhiteBaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMiracoId_InScope(pkList);
     * cb.query().addOrderBy_MiracoId_Asc();
     * </pre>
     * @param whiteBaseOne07MiracoList The entity list of whiteBaseOne07Miraco. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteBase> loadWhiteBase(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList, ReferrerConditionSetupper<WhiteBaseCB> refCBLambda) {
        xassLRArg(whiteBaseOne07MiracoList, refCBLambda);
        return doLoadWhiteBase(whiteBaseOne07MiracoList, new LoadReferrerOption<WhiteBaseCB, WhiteBase>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteBaseList by the set-upper of referrer. <br>
     * WHITE_BASE by MIRACO_ID, named 'whiteBaseList'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">loadWhiteBase</span>(<span style="color: #553000">whiteBaseOne07Miraco</span>, <span style="color: #553000">baseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">baseCB</span>.setupSelect...
     *     <span style="color: #553000">baseCB</span>.query().set...
     *     <span style="color: #553000">baseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteBaseOne07Miraco</span>.<span style="color: #CC4747">getWhiteBaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMiracoId_InScope(pkList);
     * cb.query().addOrderBy_MiracoId_Asc();
     * </pre>
     * @param whiteBaseOne07Miraco The entity of whiteBaseOne07Miraco. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteBase> loadWhiteBase(WhiteBaseOne07Miraco whiteBaseOne07Miraco, ReferrerConditionSetupper<WhiteBaseCB> refCBLambda) {
        xassLRArg(whiteBaseOne07Miraco, refCBLambda);
        return doLoadWhiteBase(xnewLRLs(whiteBaseOne07Miraco), new LoadReferrerOption<WhiteBaseCB, WhiteBase>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<WhiteBase> doLoadWhiteBase(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList, LoadReferrerOption<WhiteBaseCB, WhiteBase> option) {
        return helpLoadReferrerInternally(whiteBaseOne07MiracoList, option, "whiteBaseList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key miracoId.
     * @param whiteBaseOne07MiracoList The list of whiteBaseOne07Miraco. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMiracoIdList(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList)
    { return helpExtractListInternally(whiteBaseOne07MiracoList, "miracoId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne07Miraco.setFoo...(value);
     * whiteBaseOne07Miraco.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.set...;</span>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">insert</span>(whiteBaseOne07Miraco);
     * ... = whiteBaseOne07Miraco.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteBaseOne07Miraco The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteBaseOne07Miraco whiteBaseOne07Miraco) {
        doInsert(whiteBaseOne07Miraco, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * whiteBaseOne07Miraco.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne07Miraco.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne07Miraco.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">update</span>(whiteBaseOne07Miraco);
     * </pre>
     * @param whiteBaseOne07Miraco The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteBaseOne07Miraco whiteBaseOne07Miraco) {
        doUpdate(whiteBaseOne07Miraco, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteBaseOne07Miraco The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteBaseOne07Miraco whiteBaseOne07Miraco) {
        doInsertOrUpdate(whiteBaseOne07Miraco, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * whiteBaseOne07Miraco.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne07Miraco.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">delete</span>(whiteBaseOne07Miraco);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteBaseOne07Miraco The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteBaseOne07Miraco whiteBaseOne07Miraco) {
        doDelete(whiteBaseOne07Miraco, null);
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
     *     WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     *     whiteBaseOne07Miraco.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne07Miraco.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteBaseOne07MiracoList.add(whiteBaseOne07Miraco);
     * }
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteBaseOne07MiracoList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteBaseOne07MiracoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList) {
        return doBatchInsert(whiteBaseOne07MiracoList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     *     whiteBaseOne07Miraco.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteBaseOne07Miraco.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteBaseOne07Miraco.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteBaseOne07MiracoList.add(whiteBaseOne07Miraco);
     * }
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteBaseOne07MiracoList);
     * </pre>
     * @param whiteBaseOne07MiracoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList) {
        return doBatchUpdate(whiteBaseOne07MiracoList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteBaseOne07MiracoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList) {
        return doBatchDelete(whiteBaseOne07MiracoList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteBaseOne07Miraco, WhiteBaseOne07MiracoCB&gt;() {
     *     public ConditionBean setup(WhiteBaseOne07Miraco entity, WhiteBaseOne07MiracoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteBaseOne07Miraco, WhiteBaseOne07MiracoCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setPK...(value);</span>
     * whiteBaseOne07Miraco.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteBaseOne07Miraco, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteBaseOne07Miraco The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteBaseOne07Miraco whiteBaseOne07Miraco, CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
        return doQueryUpdate(whiteBaseOne07Miraco, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteBaseOne07MiracoCB> cbLambda) {
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
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteBaseOne07Miraco.setFoo...(value);
     * whiteBaseOne07Miraco.setBar...(value);
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteBaseOne07Miraco, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteBaseOne07Miraco.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteBaseOne07Miraco The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteBaseOne07Miraco whiteBaseOne07Miraco, WritableOptionCall<WhiteBaseOne07MiracoCB, InsertOption<WhiteBaseOne07MiracoCB>> opLambda) {
        doInsert(whiteBaseOne07Miraco, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * whiteBaseOne07Miraco.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteBaseOne07Miraco.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteBaseOne07Miraco.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteBaseOne07Miraco, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne07Miraco The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteBaseOne07Miraco whiteBaseOne07Miraco, WritableOptionCall<WhiteBaseOne07MiracoCB, UpdateOption<WhiteBaseOne07MiracoCB>> opLambda) {
        doUpdate(whiteBaseOne07Miraco, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteBaseOne07Miraco The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteBaseOne07Miraco whiteBaseOne07Miraco, WritableOptionCall<WhiteBaseOne07MiracoCB, InsertOption<WhiteBaseOne07MiracoCB>> insertOpLambda, WritableOptionCall<WhiteBaseOne07MiracoCB, UpdateOption<WhiteBaseOne07MiracoCB>> updateOpLambda) {
        doInsertOrUpdate(whiteBaseOne07Miraco, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteBaseOne07Miraco The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteBaseOne07Miraco whiteBaseOne07Miraco, WritableOptionCall<WhiteBaseOne07MiracoCB, DeleteOption<WhiteBaseOne07MiracoCB>> opLambda) {
        doDelete(whiteBaseOne07Miraco, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteBaseOne07MiracoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList, WritableOptionCall<WhiteBaseOne07MiracoCB, InsertOption<WhiteBaseOne07MiracoCB>> opLambda) {
        return doBatchInsert(whiteBaseOne07MiracoList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteBaseOne07MiracoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList, WritableOptionCall<WhiteBaseOne07MiracoCB, UpdateOption<WhiteBaseOne07MiracoCB>> opLambda) {
        return doBatchUpdate(whiteBaseOne07MiracoList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteBaseOne07MiracoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteBaseOne07Miraco> whiteBaseOne07MiracoList, WritableOptionCall<WhiteBaseOne07MiracoCB, DeleteOption<WhiteBaseOne07MiracoCB>> opLambda) {
        return doBatchDelete(whiteBaseOne07MiracoList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteBaseOne07Miraco, WhiteBaseOne07MiracoCB> manyArgLambda, WritableOptionCall<WhiteBaseOne07MiracoCB, InsertOption<WhiteBaseOne07MiracoCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteBaseOne07Miraco whiteBaseOne07Miraco = <span style="color: #70226C">new</span> WhiteBaseOne07Miraco();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setPK...(value);</span>
     * whiteBaseOne07Miraco.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteBaseOne07Miraco.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteBaseOne07Miraco, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteBaseOne07Miraco The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteBaseOne07Miraco whiteBaseOne07Miraco, CBCall<WhiteBaseOne07MiracoCB> cbLambda, WritableOptionCall<WhiteBaseOne07MiracoCB, UpdateOption<WhiteBaseOne07MiracoCB>> opLambda) {
        return doQueryUpdate(whiteBaseOne07Miraco, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne07MiracoBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteBaseOne07Miraco, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteBaseOne07Miraco. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteBaseOne07MiracoCB> cbLambda, WritableOptionCall<WhiteBaseOne07MiracoCB, DeleteOption<WhiteBaseOne07MiracoCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteBaseOne07MiracoBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteBaseOne07MiracoBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne07MiracoBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteBaseOne07MiracoBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteBaseOne07MiracoBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteBaseOne07MiracoBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteBaseOne07MiracoBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteBaseOne07MiracoBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteBaseOne07MiracoBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteBaseOne07MiracoBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteBaseOne07MiracoBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteBaseOne07MiracoBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteBaseOne07MiracoBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteBaseOne07MiracoBhv.outideSql().removeBlockComment().selectList()
     * whiteBaseOne07MiracoBhv.outideSql().removeLineComment().selectList()
     * whiteBaseOne07MiracoBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteBaseOne07MiracoBhv> outsideSql() {
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
    protected Class<? extends WhiteBaseOne07Miraco> typeOfSelectedEntity() { return WhiteBaseOne07Miraco.class; }
    protected Class<WhiteBaseOne07Miraco> typeOfHandlingEntity() { return WhiteBaseOne07Miraco.class; }
    protected Class<WhiteBaseOne07MiracoCB> typeOfHandlingConditionBean() { return WhiteBaseOne07MiracoCB.class; }
}
