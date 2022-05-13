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
 * The behavior of WHITE_ON_PARADE_NULLABLE_TO_MANY as TABLE. <br>
 * <pre>
 * [primary key]
 *     MANY_ID
 *
 * [column]
 *     MANY_ID, MANY_NAME
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
 *     WHITE_ON_PARADE_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteOnParadeRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnParadeNullableToManyBhv extends org.docksidestage.hangar.dbflute.nogen.ExtendedAbstractBehaviorWritable<WhiteOnParadeNullableToMany, WhiteOnParadeNullableToManyCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteOnParadeNullableToManyDbm asDBMeta() { return WhiteOnParadeNullableToManyDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_ON_PARADE_NULLABLE_TO_MANY"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteOnParadeNullableToManyCB newConditionBean() { return new WhiteOnParadeNullableToManyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
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
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteOnParadeNullableToMany</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteOnParadeNullableToMany</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteOnParadeNullableToMany</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteOnParadeNullableToMany</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteOnParadeNullableToMany> selectEntity(CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<WhiteOnParadeNullableToMany> facadeSelectEntity(WhiteOnParadeNullableToManyCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnParadeNullableToMany> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteOnParadeNullableToManyCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteOnParadeNullableToMany <span style="color: #553000">whiteOnParadeNullableToMany</span> = <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteOnParadeNullableToMany</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteOnParadeNullableToMany selectEntityWithDeletedCheck(CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param manyId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteOnParadeNullableToMany> selectByPK(Long manyId) {
        return facadeSelectByPK(manyId);
    }

    protected OptionalEntity<WhiteOnParadeNullableToMany> facadeSelectByPK(Long manyId) {
        return doSelectOptionalByPK(manyId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteOnParadeNullableToMany> ENTITY doSelectByPK(Long manyId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(manyId), tp);
    }

    protected <ENTITY extends WhiteOnParadeNullableToMany> OptionalEntity<ENTITY> doSelectOptionalByPK(Long manyId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(manyId, tp), manyId);
    }

    protected WhiteOnParadeNullableToManyCB xprepareCBAsPK(Long manyId) {
        assertObjectNotNull("manyId", manyId);
        return newConditionBean().acceptPK(manyId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteOnParadeNullableToMany&gt; <span style="color: #553000">whiteOnParadeNullableToManyList</span> = <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteOnParadeNullableToMany <span style="color: #553000">whiteOnParadeNullableToMany</span> : <span style="color: #553000">whiteOnParadeNullableToManyList</span>) {
     *     ... = <span style="color: #553000">whiteOnParadeNullableToMany</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteOnParadeNullableToMany> selectList(CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
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
     * PagingResultBean&lt;WhiteOnParadeNullableToMany&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteOnParadeNullableToMany whiteOnParadeNullableToMany : <span style="color: #553000">page</span>) {
     *     ... = whiteOnParadeNullableToMany.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteOnParadeNullableToMany> selectPage(CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @param entityLambda The handler of entity row of WhiteOnParadeNullableToMany. (NotNull)
     */
    public void selectCursor(CBCall<WhiteOnParadeNullableToManyCB> cbLambda, EntityRowHandler<WhiteOnParadeNullableToMany> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteOnParadeNullableToManyCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteOnParadeNullableToManyList The entity list of whiteOnParadeNullableToMany. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList, ReferrerLoaderHandler<LoaderOfWhiteOnParadeNullableToMany> loaderLambda) {
        xassLRArg(whiteOnParadeNullableToManyList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteOnParadeNullableToMany().ready(whiteOnParadeNullableToManyList, _behaviorSelector));
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
     * @param whiteOnParadeNullableToMany The entity of whiteOnParadeNullableToMany. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, ReferrerLoaderHandler<LoaderOfWhiteOnParadeNullableToMany> loaderLambda) {
        xassLRArg(whiteOnParadeNullableToMany, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteOnParadeNullableToMany().ready(xnewLRAryLs(whiteOnParadeNullableToMany), _behaviorSelector));
    }

    /**
     * Load referrer of whiteOnParadeRefList by the set-upper of referrer. <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">loadWhiteOnParadeRef</span>(<span style="color: #553000">whiteOnParadeNullableToManyList</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (WhiteOnParadeNullableToMany whiteOnParadeNullableToMany : <span style="color: #553000">whiteOnParadeNullableToManyList</span>) {
     *     ... = whiteOnParadeNullableToMany.<span style="color: #CC4747">getWhiteOnParadeRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNullableFkToManyId_InScope(pkList);
     * cb.query().addOrderBy_NullableFkToManyId_Asc();
     * </pre>
     * @param whiteOnParadeNullableToManyList The entity list of whiteOnParadeNullableToMany. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteOnParadeRef> loadWhiteOnParadeRef(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList, ReferrerConditionSetupper<WhiteOnParadeRefCB> refCBLambda) {
        xassLRArg(whiteOnParadeNullableToManyList, refCBLambda);
        return doLoadWhiteOnParadeRef(whiteOnParadeNullableToManyList, new LoadReferrerOption<WhiteOnParadeRefCB, WhiteOnParadeRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteOnParadeRefList by the set-upper of referrer. <br>
     * WHITE_ON_PARADE_REF by NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">loadWhiteOnParadeRef</span>(<span style="color: #553000">whiteOnParadeNullableToMany</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteOnParadeNullableToMany</span>.<span style="color: #CC4747">getWhiteOnParadeRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNullableFkToManyId_InScope(pkList);
     * cb.query().addOrderBy_NullableFkToManyId_Asc();
     * </pre>
     * @param whiteOnParadeNullableToMany The entity of whiteOnParadeNullableToMany. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteOnParadeRef> loadWhiteOnParadeRef(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, ReferrerConditionSetupper<WhiteOnParadeRefCB> refCBLambda) {
        xassLRArg(whiteOnParadeNullableToMany, refCBLambda);
        return doLoadWhiteOnParadeRef(xnewLRLs(whiteOnParadeNullableToMany), new LoadReferrerOption<WhiteOnParadeRefCB, WhiteOnParadeRef>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<WhiteOnParadeRef> doLoadWhiteOnParadeRef(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList, LoadReferrerOption<WhiteOnParadeRefCB, WhiteOnParadeRef> option) {
        return helpLoadReferrerInternally(whiteOnParadeNullableToManyList, option, "whiteOnParadeRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key manyId.
     * @param whiteOnParadeNullableToManyList The list of whiteOnParadeNullableToMany. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractManyIdList(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList)
    { return helpExtractListInternally(whiteOnParadeNullableToManyList, "manyId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnParadeNullableToMany.setFoo...(value);
     * whiteOnParadeNullableToMany.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.set...;</span>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">insert</span>(whiteOnParadeNullableToMany);
     * ... = whiteOnParadeNullableToMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteOnParadeNullableToMany The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany) {
        doInsert(whiteOnParadeNullableToMany, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * whiteOnParadeNullableToMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnParadeNullableToMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnParadeNullableToMany.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">update</span>(whiteOnParadeNullableToMany);
     * </pre>
     * @param whiteOnParadeNullableToMany The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany) {
        doUpdate(whiteOnParadeNullableToMany, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteOnParadeNullableToMany The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany) {
        doInsertOrUpdate(whiteOnParadeNullableToMany, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * whiteOnParadeNullableToMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnParadeNullableToMany.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">delete</span>(whiteOnParadeNullableToMany);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteOnParadeNullableToMany The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany) {
        doDelete(whiteOnParadeNullableToMany, null);
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
     *     WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     *     whiteOnParadeNullableToMany.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteOnParadeNullableToMany.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteOnParadeNullableToManyList.add(whiteOnParadeNullableToMany);
     * }
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteOnParadeNullableToManyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteOnParadeNullableToManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList) {
        return doBatchInsert(whiteOnParadeNullableToManyList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     *     whiteOnParadeNullableToMany.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteOnParadeNullableToMany.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteOnParadeNullableToMany.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteOnParadeNullableToManyList.add(whiteOnParadeNullableToMany);
     * }
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteOnParadeNullableToManyList);
     * </pre>
     * @param whiteOnParadeNullableToManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList) {
        return doBatchUpdate(whiteOnParadeNullableToManyList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteOnParadeNullableToManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList) {
        return doBatchDelete(whiteOnParadeNullableToManyList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteOnParadeNullableToMany, WhiteOnParadeNullableToManyCB&gt;() {
     *     public ConditionBean setup(WhiteOnParadeNullableToMany entity, WhiteOnParadeNullableToManyCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteOnParadeNullableToMany, WhiteOnParadeNullableToManyCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setPK...(value);</span>
     * whiteOnParadeNullableToMany.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteOnParadeNullableToMany, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteOnParadeNullableToMany The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
        return doQueryUpdate(whiteOnParadeNullableToMany, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteOnParadeNullableToMany, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteOnParadeNullableToManyCB> cbLambda) {
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
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteOnParadeNullableToMany.setFoo...(value);
     * whiteOnParadeNullableToMany.setBar...(value);
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteOnParadeNullableToMany, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteOnParadeNullableToMany.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteOnParadeNullableToMany The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, WritableOptionCall<WhiteOnParadeNullableToManyCB, InsertOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        doInsert(whiteOnParadeNullableToMany, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * whiteOnParadeNullableToMany.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteOnParadeNullableToMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteOnParadeNullableToMany.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteOnParadeNullableToMany, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteOnParadeNullableToMany The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, WritableOptionCall<WhiteOnParadeNullableToManyCB, UpdateOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        doUpdate(whiteOnParadeNullableToMany, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteOnParadeNullableToMany The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, WritableOptionCall<WhiteOnParadeNullableToManyCB, InsertOption<WhiteOnParadeNullableToManyCB>> insertOpLambda, WritableOptionCall<WhiteOnParadeNullableToManyCB, UpdateOption<WhiteOnParadeNullableToManyCB>> updateOpLambda) {
        doInsertOrUpdate(whiteOnParadeNullableToMany, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteOnParadeNullableToMany The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, WritableOptionCall<WhiteOnParadeNullableToManyCB, DeleteOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        doDelete(whiteOnParadeNullableToMany, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteOnParadeNullableToManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList, WritableOptionCall<WhiteOnParadeNullableToManyCB, InsertOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        return doBatchInsert(whiteOnParadeNullableToManyList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteOnParadeNullableToManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList, WritableOptionCall<WhiteOnParadeNullableToManyCB, UpdateOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        return doBatchUpdate(whiteOnParadeNullableToManyList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteOnParadeNullableToManyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteOnParadeNullableToMany> whiteOnParadeNullableToManyList, WritableOptionCall<WhiteOnParadeNullableToManyCB, DeleteOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        return doBatchDelete(whiteOnParadeNullableToManyList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteOnParadeNullableToMany, WhiteOnParadeNullableToManyCB> manyArgLambda, WritableOptionCall<WhiteOnParadeNullableToManyCB, InsertOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteOnParadeNullableToMany whiteOnParadeNullableToMany = <span style="color: #70226C">new</span> WhiteOnParadeNullableToMany();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setPK...(value);</span>
     * whiteOnParadeNullableToMany.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteOnParadeNullableToMany.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteOnParadeNullableToMany, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteOnParadeNullableToMany The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteOnParadeNullableToMany whiteOnParadeNullableToMany, CBCall<WhiteOnParadeNullableToManyCB> cbLambda, WritableOptionCall<WhiteOnParadeNullableToManyCB, UpdateOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        return doQueryUpdate(whiteOnParadeNullableToMany, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteOnParadeNullableToManyBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteOnParadeNullableToMany, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteOnParadeNullableToMany. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteOnParadeNullableToManyCB> cbLambda, WritableOptionCall<WhiteOnParadeNullableToManyCB, DeleteOption<WhiteOnParadeNullableToManyCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteOnParadeNullableToManyBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteOnParadeNullableToManyBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteOnParadeNullableToManyBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteOnParadeNullableToManyBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteOnParadeNullableToManyBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteOnParadeNullableToManyBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteOnParadeNullableToManyBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteOnParadeNullableToManyBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteOnParadeNullableToManyBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteOnParadeNullableToManyBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteOnParadeNullableToManyBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteOnParadeNullableToManyBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteOnParadeNullableToManyBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteOnParadeNullableToManyBhv.outideSql().removeBlockComment().selectList()
     * whiteOnParadeNullableToManyBhv.outideSql().removeLineComment().selectList()
     * whiteOnParadeNullableToManyBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteOnParadeNullableToManyBhv> outsideSql() {
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
    protected Class<? extends WhiteOnParadeNullableToMany> typeOfSelectedEntity() { return WhiteOnParadeNullableToMany.class; }
    protected Class<WhiteOnParadeNullableToMany> typeOfHandlingEntity() { return WhiteOnParadeNullableToMany.class; }
    protected Class<WhiteOnParadeNullableToManyCB> typeOfHandlingConditionBean() { return WhiteOnParadeNullableToManyCB.class; }
}
