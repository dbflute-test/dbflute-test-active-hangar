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
 * The behavior of WHITE_UNEVEN_COMMON_COLUMN_3RD as TABLE.
 * <pre>
 * [primary-key]
 *     UNEVEN_ID
 *
 * [column]
 *     UNEVEN_ID, UNEVEN_NAME, REGISTER_DATETIME, UPDATE_DATETIME
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer unevenId = entity.getUnevenId();
 * String unevenName = entity.getUnevenName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setUnevenId(unevenId);
 * entity.setUnevenName(unevenName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUnevenCommonColumn3rdBhv extends org.docksidestage.hangar.dbflute.nogen.ExtendedAbstractBehaviorWritable<WhiteUnevenCommonColumn3rd, WhiteUnevenCommonColumn3rdCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WhiteUnevenCommonColumn3rdDbm asDBMeta() { return WhiteUnevenCommonColumn3rdDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "WHITE_UNEVEN_COMMON_COLUMN_3RD"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUnevenCommonColumn3rdCB newConditionBean() { return new WhiteUnevenCommonColumn3rdCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
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
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteUnevenCommonColumn3rd</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteUnevenCommonColumn3rd</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteUnevenCommonColumn3rd</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteUnevenCommonColumn3rd</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUnevenCommonColumn3rd> selectEntity(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<WhiteUnevenCommonColumn3rd> facadeSelectEntity(WhiteUnevenCommonColumn3rdCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUnevenCommonColumn3rd> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUnevenCommonColumn3rdCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WhiteUnevenCommonColumn3rd <span style="color: #553000">whiteUnevenCommonColumn3rd</span> = <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteUnevenCommonColumn3rd</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUnevenCommonColumn3rd selectEntityWithDeletedCheck(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param unevenId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), alwaysPresent() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUnevenCommonColumn3rd> selectByPK(Integer unevenId) {
        return facadeSelectByPK(unevenId);
    }

    protected OptionalEntity<WhiteUnevenCommonColumn3rd> facadeSelectByPK(Integer unevenId) {
        return doSelectOptionalByPK(unevenId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUnevenCommonColumn3rd> ENTITY doSelectByPK(Integer unevenId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(unevenId), tp);
    }

    protected <ENTITY extends WhiteUnevenCommonColumn3rd> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer unevenId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(unevenId, tp), unevenId);
    }

    protected WhiteUnevenCommonColumn3rdCB xprepareCBAsPK(Integer unevenId) {
        assertObjectNotNull("unevenId", unevenId);
        return newConditionBean().acceptPK(unevenId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WhiteUnevenCommonColumn3rd&gt; <span style="color: #553000">whiteUnevenCommonColumn3rdList</span> = <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (WhiteUnevenCommonColumn3rd <span style="color: #553000">whiteUnevenCommonColumn3rd</span> : <span style="color: #553000">whiteUnevenCommonColumn3rdList</span>) {
     *     ... = <span style="color: #553000">whiteUnevenCommonColumn3rd</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUnevenCommonColumn3rd> selectList(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
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
     * PagingResultBean&lt;WhiteUnevenCommonColumn3rd&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd : <span style="color: #553000">page</span>) {
     *     ... = whiteUnevenCommonColumn3rd.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUnevenCommonColumn3rd> selectPage(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @param entityLambda The handler of entity row of WhiteUnevenCommonColumn3rd. (NotNull)
     */
    public void selectCursor(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda, EntityRowHandler<WhiteUnevenCommonColumn3rd> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUnevenCommonColumn3rdCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param whiteUnevenCommonColumn3rdList The entity list of whiteUnevenCommonColumn3rd. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList, ReferrerLoaderHandler<LoaderOfWhiteUnevenCommonColumn3rd> loaderLambda) {
        xassLRArg(whiteUnevenCommonColumn3rdList, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUnevenCommonColumn3rd().ready(whiteUnevenCommonColumn3rdList, _behaviorSelector));
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
     * @param whiteUnevenCommonColumn3rd The entity of whiteUnevenCommonColumn3rd. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, ReferrerLoaderHandler<LoaderOfWhiteUnevenCommonColumn3rd> loaderLambda) {
        xassLRArg(whiteUnevenCommonColumn3rd, loaderLambda);
        loaderLambda.handle(new LoaderOfWhiteUnevenCommonColumn3rd().ready(xnewLRAryLs(whiteUnevenCommonColumn3rd), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key unevenId.
     * @param whiteUnevenCommonColumn3rdList The list of whiteUnevenCommonColumn3rd. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractUnevenIdList(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList)
    { return helpExtractListInternally(whiteUnevenCommonColumn3rdList, "unevenId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUnevenCommonColumn3rd.setFoo...(value);
     * whiteUnevenCommonColumn3rd.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.set...;</span>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">insert</span>(whiteUnevenCommonColumn3rd);
     * ... = whiteUnevenCommonColumn3rd.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUnevenCommonColumn3rd The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd) {
        doInsert(whiteUnevenCommonColumn3rd, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * whiteUnevenCommonColumn3rd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUnevenCommonColumn3rd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUnevenCommonColumn3rd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">update</span>(whiteUnevenCommonColumn3rd);
     * </pre>
     * @param whiteUnevenCommonColumn3rd The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd) {
        doUpdate(whiteUnevenCommonColumn3rd, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteUnevenCommonColumn3rd The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd) {
        doInsertOrUpdate(whiteUnevenCommonColumn3rd, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * whiteUnevenCommonColumn3rd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUnevenCommonColumn3rd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">delete</span>(whiteUnevenCommonColumn3rd);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUnevenCommonColumn3rd The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd) {
        doDelete(whiteUnevenCommonColumn3rd, null);
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
     *     WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     *     whiteUnevenCommonColumn3rd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteUnevenCommonColumn3rd.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUnevenCommonColumn3rdList.add(whiteUnevenCommonColumn3rd);
     * }
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteUnevenCommonColumn3rdList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUnevenCommonColumn3rdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList) {
        return doBatchInsert(whiteUnevenCommonColumn3rdList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     *     whiteUnevenCommonColumn3rd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteUnevenCommonColumn3rd.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteUnevenCommonColumn3rd.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUnevenCommonColumn3rdList.add(whiteUnevenCommonColumn3rd);
     * }
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteUnevenCommonColumn3rdList);
     * </pre>
     * @param whiteUnevenCommonColumn3rdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList) {
        return doBatchUpdate(whiteUnevenCommonColumn3rdList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUnevenCommonColumn3rdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList) {
        return doBatchDelete(whiteUnevenCommonColumn3rdList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUnevenCommonColumn3rd, WhiteUnevenCommonColumn3rdCB&gt;() {
     *     public ConditionBean setup(WhiteUnevenCommonColumn3rd entity, WhiteUnevenCommonColumn3rdCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUnevenCommonColumn3rd, WhiteUnevenCommonColumn3rdCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setPK...(value);</span>
     * whiteUnevenCommonColumn3rd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteUnevenCommonColumn3rd, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteUnevenCommonColumn3rd The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
        return doQueryUpdate(whiteUnevenCommonColumn3rd, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">queryDelete</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda) {
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
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUnevenCommonColumn3rd.setFoo...(value);
     * whiteUnevenCommonColumn3rd.setBar...(value);
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteUnevenCommonColumn3rd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteUnevenCommonColumn3rd.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUnevenCommonColumn3rd The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, InsertOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        doInsert(whiteUnevenCommonColumn3rd, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * whiteUnevenCommonColumn3rd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUnevenCommonColumn3rd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUnevenCommonColumn3rd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteUnevenCommonColumn3rd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteUnevenCommonColumn3rd The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, UpdateOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        doUpdate(whiteUnevenCommonColumn3rd, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUnevenCommonColumn3rd The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, InsertOption<WhiteUnevenCommonColumn3rdCB>> insertOpLambda, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, UpdateOption<WhiteUnevenCommonColumn3rdCB>> updateOpLambda) {
        doInsertOrUpdate(whiteUnevenCommonColumn3rd, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteUnevenCommonColumn3rd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, DeleteOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        doDelete(whiteUnevenCommonColumn3rd, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUnevenCommonColumn3rdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, InsertOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        return doBatchInsert(whiteUnevenCommonColumn3rdList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUnevenCommonColumn3rdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, UpdateOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        return doBatchUpdate(whiteUnevenCommonColumn3rdList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUnevenCommonColumn3rdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUnevenCommonColumn3rd> whiteUnevenCommonColumn3rdList, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, DeleteOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        return doBatchDelete(whiteUnevenCommonColumn3rdList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUnevenCommonColumn3rd, WhiteUnevenCommonColumn3rdCB> manyArgLambda, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, InsertOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd = <span style="color: #70226C">new</span> WhiteUnevenCommonColumn3rd();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setPK...(value);</span>
     * whiteUnevenCommonColumn3rd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUnevenCommonColumn3rd.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteUnevenCommonColumn3rd, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteUnevenCommonColumn3rd The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUnevenCommonColumn3rd whiteUnevenCommonColumn3rd, CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, UpdateOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        return doQueryUpdate(whiteUnevenCommonColumn3rd, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteUnevenCommonColumn3rdBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteUnevenCommonColumn3rd, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WhiteUnevenCommonColumn3rd. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WhiteUnevenCommonColumn3rdCB> cbLambda, WritableOptionCall<WhiteUnevenCommonColumn3rdCB, DeleteOption<WhiteUnevenCommonColumn3rdCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteUnevenCommonColumn3rdBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteUnevenCommonColumn3rdBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteUnevenCommonColumn3rdBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteUnevenCommonColumn3rdBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteUnevenCommonColumn3rdBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * whiteUnevenCommonColumn3rdBhv.outideSql().removeBlockComment().selectList()
     * whiteUnevenCommonColumn3rdBhv.outideSql().removeLineComment().selectList()
     * whiteUnevenCommonColumn3rdBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<WhiteUnevenCommonColumn3rdBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                           Framework Filter Override
    //                                                           =========================
    @Override
    protected void frameworkFilterEntityOfInsert(Entity tgt, org.dbflute.optional.OptionalThing<InsertOption<? extends ConditionBean>> op) {
        super.frameworkFilterEntityOfInsert(tgt, op);
        WhiteUnevenCommonColumn3rd entity = downcast(tgt);
        entity.setRegisterDatetime(org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread());
        entity.setUpdateDatetime(entity.getRegisterDatetime());
        xcreateDateUpdateAdjuster().truncatePrecisionOfEntityProperty(tgt);
    }

    @Override
    protected void frameworkFilterEntityOfUpdate(Entity tgt, org.dbflute.optional.OptionalThing<UpdateOption<? extends ConditionBean>> op) {
        super.frameworkFilterEntityOfUpdate(tgt, op);
        WhiteUnevenCommonColumn3rd entity = downcast(tgt);
        entity.setUpdateDatetime(org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread());
        xcreateDateUpdateAdjuster().truncatePrecisionOfEntityProperty(tgt);
    }

    protected DateUpdateAdjuster xcreateDateUpdateAdjuster() {
        return new DateUpdateAdjuster();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteUnevenCommonColumn3rd> typeOfSelectedEntity() { return WhiteUnevenCommonColumn3rd.class; }
    protected Class<WhiteUnevenCommonColumn3rd> typeOfHandlingEntity() { return WhiteUnevenCommonColumn3rd.class; }
    protected Class<WhiteUnevenCommonColumn3rdCB> typeOfHandlingConditionBean() { return WhiteUnevenCommonColumn3rdCB.class; }
}
