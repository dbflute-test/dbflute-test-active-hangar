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
package org.docksidestage.hangar.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsProductStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsProductStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "PRODUCT_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @param productStatusCode The value of productStatusCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    /**
     * Equal(=). As ProductStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br>
     * status for product
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductStatusCode_Equal_AsProductStatus(CDef.ProductStatus cdef) {
        doSetProductStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 生産販売可能 (ONS). And OnlyOnceRegistered. <br>
     * 生産販売可能
     */
    public void setProductStatusCode_Equal_生産販売可能() {
        setProductStatusCode_Equal_AsProductStatus(CDef.ProductStatus.生産販売可能);
    }

    /**
     * Equal(=). As 生産中止 (PST). And OnlyOnceRegistered. <br>
     * 生産中止
     */
    public void setProductStatusCode_Equal_生産中止() {
        setProductStatusCode_Equal_AsProductStatus(CDef.ProductStatus.生産中止);
    }

    /**
     * Equal(=). As 販売中止 (SST). And OnlyOnceRegistered. <br>
     * 販売中止
     */
    public void setProductStatusCode_Equal_販売中止() {
        setProductStatusCode_Equal_AsProductStatus(CDef.ProductStatus.販売中止);
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @param productStatusCode The value of productStatusCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As ProductStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br>
     * status for product
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setProductStatusCode_NotEqual_AsProductStatus(CDef.ProductStatus cdef) {
        doSetProductStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 生産販売可能 (ONS). And OnlyOnceRegistered. <br>
     * 生産販売可能
     */
    public void setProductStatusCode_NotEqual_生産販売可能() {
        setProductStatusCode_NotEqual_AsProductStatus(CDef.ProductStatus.生産販売可能);
    }

    /**
     * NotEqual(&lt;&gt;). As 生産中止 (PST). And OnlyOnceRegistered. <br>
     * 生産中止
     */
    public void setProductStatusCode_NotEqual_生産中止() {
        setProductStatusCode_NotEqual_AsProductStatus(CDef.ProductStatus.生産中止);
    }

    /**
     * NotEqual(&lt;&gt;). As 販売中止 (SST). And OnlyOnceRegistered. <br>
     * 販売中止
     */
    public void setProductStatusCode_NotEqual_販売中止() {
        setProductStatusCode_NotEqual_AsProductStatus(CDef.ProductStatus.販売中止);
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As ProductStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br>
     * status for product
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStatusCode_InScope_AsProductStatus(Collection<CDef.ProductStatus> cdefList) {
        doSetProductStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_NotInScope(productStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ProductStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br>
     * status for product
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStatusCode_NotInScope_AsProductStatus(Collection<CDef.ProductStatus> cdefList) {
        doSetProductStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regINS(CK_NINS, cTL(productStatusCodeList), xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_STATUS_CODE from PRODUCT where ...)} <br>
     * (眠い商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductList for 'exists'. (NotNull)
     */
    public void existsProduct(SubQuery<ProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_ExistsReferrer_ProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "productList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_ProductList(ProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PRODUCT_STATUS_CODE from SUMMARY_PRODUCT where ...)} <br>
     * SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSummaryProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SummaryProductList for 'exists'. (NotNull)
     */
    public void existsSummaryProduct(SubQuery<SummaryProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SummaryProductCB cb = new SummaryProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_ExistsReferrer_SummaryProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "summaryProductList");
    }
    public abstract String keepProductStatusCode_ExistsReferrer_SummaryProductList(SummaryProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_STATUS_CODE from PRODUCT where ...)} <br>
     * (眠い商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductStatusCode_NotExistsReferrer_ProductList for 'not exists'. (NotNull)
     */
    public void notExistsProduct(SubQuery<ProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProductCB cb = new ProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_NotExistsReferrer_ProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "productList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_ProductList(ProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PRODUCT_STATUS_CODE from SUMMARY_PRODUCT where ...)} <br>
     * SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSummaryProduct</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProductStatusCode_NotExistsReferrer_SummaryProductList for 'not exists'. (NotNull)
     */
    public void notExistsSummaryProduct(SubQuery<SummaryProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SummaryProductCB cb = new SummaryProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepProductStatusCode_NotExistsReferrer_SummaryProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "summaryProductList");
    }
    public abstract String keepProductStatusCode_NotExistsReferrer_SummaryProductList(SummaryProductCQ sq);

    public void xsderiveProductList(String fn, SubQuery<ProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductStatusCode_SpecifyDerivedReferrer_ProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "productList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq);

    public void xsderiveSummaryProductList(String fn, SubQuery<SummaryProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SummaryProductCB cb = new SummaryProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepProductStatusCode_SpecifyDerivedReferrer_SummaryProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "summaryProductList", al, op);
    }
    public abstract String keepProductStatusCode_SpecifyDerivedReferrer_SummaryProductList(SummaryProductCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from PRODUCT where ...)} <br>
     * (眠い商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedProduct()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProductCB> derivedProduct() {
        return xcreateQDRFunctionProductList();
    }
    protected HpQDRFunction<ProductCB> xcreateQDRFunctionProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveProductList(String fn, SubQuery<ProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductStatusCode_QueryDerivedReferrer_ProductList(cb.query()); String prpp = keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", sqpp, "productList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_ProductList(ProductCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SUMMARY_PRODUCT where ...)} <br>
     * SUMMARY_PRODUCT by PRODUCT_STATUS_CODE, named 'summaryProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSummaryProduct()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SummaryProductCB> derivedSummaryProduct() {
        return xcreateQDRFunctionSummaryProductList();
    }
    protected HpQDRFunction<SummaryProductCB> xcreateQDRFunctionSummaryProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSummaryProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveSummaryProductList(String fn, SubQuery<SummaryProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SummaryProductCB cb = new SummaryProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepProductStatusCode_QueryDerivedReferrer_SummaryProductList(cb.query()); String prpp = keepProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", sqpp, "summaryProductList", rd, vl, prpp, op);
    }
    public abstract String keepProductStatusCode_QueryDerivedReferrer_SummaryProductList(SummaryProductCQ sq);
    public abstract String keepProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     */
    public void setProductStatusCode_IsNull() { regProductStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     */
    public void setProductStatusCode_IsNotNull() { regProductStatusCode(CK_ISNN, DOBJ); }

    protected void regProductStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueProductStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStatusName_Equal(String productStatusName) {
        doSetProductStatusName_Equal(fRES(productStatusName));
    }

    protected void doSetProductStatusName_Equal(String productStatusName) {
        regProductStatusName(CK_EQ, productStatusName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductStatusName_LikeSearch(String productStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductStatusName_LikeSearch(productStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setProductStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusName The value of productStatusName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setProductStatusName_LikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusName), xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProductStatusName_NotLikeSearch(String productStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProductStatusName_NotLikeSearch(productStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param productStatusName The value of productStatusName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setProductStatusName_NotLikeSearch(String productStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusName), xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME", likeSearchOption);
    }

    protected void regProductStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductStatusName(), "PRODUCT_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueProductStatusName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param minNumber The min number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param minNumber The min number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of displayOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ProductStatusCB newMyCB() {
        return new ProductStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ProductStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
