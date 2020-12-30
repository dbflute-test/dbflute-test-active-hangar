package org.docksidestage.hangar.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import org.docksidestage.hangar.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.allcommon.ImplementedInvokerAssistant;
import org.docksidestage.hangar.dbflute.allcommon.ImplementedSqlClauseCreator;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;
import org.docksidestage.hangar.dbflute.cbean.nss.*;

/**
 * The base condition-bean of WHITE_BASE.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "WHITE_BASE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param baseId : PK, NotNull, INTEGER(10). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteBaseCB acceptPK(Integer baseId) {
        assertObjectNotNull("baseId", baseId);
        BsWhiteBaseCB cb = this;
        cb.query().setBaseId_Equal(baseId);
        return (WhiteBaseCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BaseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BaseId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public WhiteBaseCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public WhiteBaseCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteBaseCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteBaseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteBaseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteBaseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteBaseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteBaseCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<WhiteBaseCB> unionCBLambda) {
        final WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteBaseCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<WhiteBaseCB> unionCBLambda) {
        final WhiteBaseCB cb = new WhiteBaseCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteBaseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne06Amba()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne06Amba()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne06Amba() {
        assertSetupSelectPurpose("whiteBaseOne06Amba");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAmbaId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne06Amba());
    }

    protected WhiteBaseOne04BonvoNss _nssWhiteBaseOne04Bonvo;
    public WhiteBaseOne04BonvoNss xdfgetNssWhiteBaseOne04Bonvo() {
        if (_nssWhiteBaseOne04Bonvo == null) { _nssWhiteBaseOne04Bonvo = new WhiteBaseOne04BonvoNss(null); }
        return _nssWhiteBaseOne04Bonvo;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne04Bonvo()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne04Bonvo()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne04BonvoNss setupSelect_WhiteBaseOne04Bonvo() {
        assertSetupSelectPurpose("whiteBaseOne04Bonvo");
        if (hasSpecifiedLocalColumn()) {
            specify().columnBonvoId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne04Bonvo());
        if (_nssWhiteBaseOne04Bonvo == null || !_nssWhiteBaseOne04Bonvo.hasConditionQuery())
        { _nssWhiteBaseOne04Bonvo = new WhiteBaseOne04BonvoNss(query().queryWhiteBaseOne04Bonvo()); }
        return _nssWhiteBaseOne04Bonvo;
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne05Dstore()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne05Dstore()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne05Dstore() {
        assertSetupSelectPurpose("whiteBaseOne05Dstore");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDstoreId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne05Dstore());
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne02Land()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne02Land()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne02Land() {
        assertSetupSelectPurpose("whiteBaseOne02Land");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLandId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne02Land());
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne07Miraco()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne07Miraco()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne07Miraco() {
        assertSetupSelectPurpose("whiteBaseOne07Miraco");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMiracoId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne07Miraco());
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne03Piari()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne03Piari()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne03Piari() {
        assertSetupSelectPurpose("whiteBaseOne03Piari");
        if (hasSpecifiedLocalColumn()) {
            specify().columnPiariId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne03Piari());
    }

    protected WhiteBaseOne01SeaNss _nssWhiteBaseOne01Sea;
    public WhiteBaseOne01SeaNss xdfgetNssWhiteBaseOne01Sea() {
        if (_nssWhiteBaseOne01Sea == null) { _nssWhiteBaseOne01Sea = new WhiteBaseOne01SeaNss(null); }
        return _nssWhiteBaseOne01Sea;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne01Sea()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne01Sea()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne01SeaNss setupSelect_WhiteBaseOne01Sea() {
        assertSetupSelectPurpose("whiteBaseOne01Sea");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSeaId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne01Sea());
        if (_nssWhiteBaseOne01Sea == null || !_nssWhiteBaseOne01Sea.hasConditionQuery())
        { _nssWhiteBaseOne01Sea = new WhiteBaseOne01SeaNss(query().queryWhiteBaseOne01Sea()); }
        return _nssWhiteBaseOne01Sea;
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne08Dohotel()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne08Dohotel()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne08Dohotel() {
        assertSetupSelectPurpose("whiteBaseOne08Dohotel");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDohotelId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne08Dohotel());
    }

    protected WhiteBaseOne09PalmNss _nssWhiteBaseOne09PalmAsOne;
    public WhiteBaseOne09PalmNss xdfgetNssWhiteBaseOne09PalmAsOne() {
        if (_nssWhiteBaseOne09PalmAsOne == null) { _nssWhiteBaseOne09PalmAsOne = new WhiteBaseOne09PalmNss(null); }
        return _nssWhiteBaseOne09PalmAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne09PalmAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne09PalmAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne09PalmNss setupSelect_WhiteBaseOne09PalmAsOne() {
        assertSetupSelectPurpose("whiteBaseOne09PalmAsOne");
        doSetupSelect(() -> query().queryWhiteBaseOne09PalmAsOne());
        if (_nssWhiteBaseOne09PalmAsOne == null || !_nssWhiteBaseOne09PalmAsOne.hasConditionQuery())
        { _nssWhiteBaseOne09PalmAsOne = new WhiteBaseOne09PalmNss(query().queryWhiteBaseOne09PalmAsOne()); }
        return _nssWhiteBaseOne09PalmAsOne;
    }

    protected WhiteBaseOne10CelebNss _nssWhiteBaseOne10CelebAsOne;
    public WhiteBaseOne10CelebNss xdfgetNssWhiteBaseOne10CelebAsOne() {
        if (_nssWhiteBaseOne10CelebAsOne == null) { _nssWhiteBaseOne10CelebAsOne = new WhiteBaseOne10CelebNss(null); }
        return _nssWhiteBaseOne10CelebAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne10CelebAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne10CelebAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne10CelebNss setupSelect_WhiteBaseOne10CelebAsOne() {
        assertSetupSelectPurpose("whiteBaseOne10CelebAsOne");
        doSetupSelect(() -> query().queryWhiteBaseOne10CelebAsOne());
        if (_nssWhiteBaseOne10CelebAsOne == null || !_nssWhiteBaseOne10CelebAsOne.hasConditionQuery())
        { _nssWhiteBaseOne10CelebAsOne = new WhiteBaseOne10CelebNss(query().queryWhiteBaseOne10CelebAsOne()); }
        return _nssWhiteBaseOne10CelebAsOne;
    }

    protected WhiteBaseOne11CirqueNss _nssWhiteBaseOne11CirqueAsOne;
    public WhiteBaseOne11CirqueNss xdfgetNssWhiteBaseOne11CirqueAsOne() {
        if (_nssWhiteBaseOne11CirqueAsOne == null) { _nssWhiteBaseOne11CirqueAsOne = new WhiteBaseOne11CirqueNss(null); }
        return _nssWhiteBaseOne11CirqueAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne11CirqueAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne11CirqueAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne11CirqueNss setupSelect_WhiteBaseOne11CirqueAsOne() {
        assertSetupSelectPurpose("whiteBaseOne11CirqueAsOne");
        doSetupSelect(() -> query().queryWhiteBaseOne11CirqueAsOne());
        if (_nssWhiteBaseOne11CirqueAsOne == null || !_nssWhiteBaseOne11CirqueAsOne.hasConditionQuery())
        { _nssWhiteBaseOne11CirqueAsOne = new WhiteBaseOne11CirqueNss(query().queryWhiteBaseOne11CirqueAsOne()); }
        return _nssWhiteBaseOne11CirqueAsOne;
    }

    protected WhiteBaseOne12AmphiNss _nssWhiteBaseOne12AmphiAsOne;
    public WhiteBaseOne12AmphiNss xdfgetNssWhiteBaseOne12AmphiAsOne() {
        if (_nssWhiteBaseOne12AmphiAsOne == null) { _nssWhiteBaseOne12AmphiAsOne = new WhiteBaseOne12AmphiNss(null); }
        return _nssWhiteBaseOne12AmphiAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne12AmphiAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBase</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBase</span>.<span style="color: #CC4747">getWhiteBaseOne12AmphiAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne12AmphiNss setupSelect_WhiteBaseOne12AmphiAsOne() {
        assertSetupSelectPurpose("whiteBaseOne12AmphiAsOne");
        doSetupSelect(() -> query().queryWhiteBaseOne12AmphiAsOne());
        if (_nssWhiteBaseOne12AmphiAsOne == null || !_nssWhiteBaseOne12AmphiAsOne.hasConditionQuery())
        { _nssWhiteBaseOne12AmphiAsOne = new WhiteBaseOne12AmphiNss(query().queryWhiteBaseOne12AmphiAsOne()); }
        return _nssWhiteBaseOne12AmphiAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<WhiteBaseCQ> {
        protected WhiteBaseOne06AmbaCB.HpSpecification _whiteBaseOne06Amba;
        protected WhiteBaseOne04BonvoCB.HpSpecification _whiteBaseOne04Bonvo;
        protected WhiteBaseOne05DstoreCB.HpSpecification _whiteBaseOne05Dstore;
        protected WhiteBaseOne02LandCB.HpSpecification _whiteBaseOne02Land;
        protected WhiteBaseOne07MiracoCB.HpSpecification _whiteBaseOne07Miraco;
        protected WhiteBaseOne03PiariCB.HpSpecification _whiteBaseOne03Piari;
        protected WhiteBaseOne01SeaCB.HpSpecification _whiteBaseOne01Sea;
        protected WhiteBaseOne08DohotelCB.HpSpecification _whiteBaseOne08Dohotel;
        protected WhiteBaseOne09PalmCB.HpSpecification _whiteBaseOne09PalmAsOne;
        protected WhiteBaseOne10CelebCB.HpSpecification _whiteBaseOne10CelebAsOne;
        protected WhiteBaseOne11CirqueCB.HpSpecification _whiteBaseOne11CirqueAsOne;
        protected WhiteBaseOne12AmphiCB.HpSpecification _whiteBaseOne12AmphiAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteBaseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * BASE_ID: {PK, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBaseId() { return doColumn("BASE_ID"); }
        /**
         * BASE_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBaseName() { return doColumn("BASE_NAME"); }
        /**
         * SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSeaId() { return doColumn("SEA_ID"); }
        /**
         * LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLandId() { return doColumn("LAND_ID"); }
        /**
         * PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPiariId() { return doColumn("PIARI_ID"); }
        /**
         * BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBonvoId() { return doColumn("BONVO_ID"); }
        /**
         * DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDstoreId() { return doColumn("DSTORE_ID"); }
        /**
         * AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAmbaId() { return doColumn("AMBA_ID"); }
        /**
         * MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMiracoId() { return doColumn("MIRACO_ID"); }
        /**
         * DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDohotelId() { return doColumn("DOHOTEL_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnBaseId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteBaseOne06Amba()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne06AmbaCQ) {
                columnAmbaId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne04Bonvo()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne04BonvoCQ) {
                columnBonvoId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne05Dstore()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne05DstoreCQ) {
                columnDstoreId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne02Land()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne02LandCQ) {
                columnLandId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne07Miraco()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne07MiracoCQ) {
                columnMiracoId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne03Piari()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne03PiariCQ) {
                columnPiariId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne01Sea()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne01SeaCQ) {
                columnSeaId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne08Dohotel()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne08DohotelCQ) {
                columnDohotelId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "WHITE_BASE"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne06AmbaCB.HpSpecification specifyWhiteBaseOne06Amba() {
            assertRelation("whiteBaseOne06Amba");
            if (_whiteBaseOne06Amba == null) {
                _whiteBaseOne06Amba = new WhiteBaseOne06AmbaCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne06Amba()
                                    , () -> _qyCall.qy().queryWhiteBaseOne06Amba())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne06Amba.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne06Amba()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne06Amba()));
                }
            }
            return _whiteBaseOne06Amba;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne04BonvoCB.HpSpecification specifyWhiteBaseOne04Bonvo() {
            assertRelation("whiteBaseOne04Bonvo");
            if (_whiteBaseOne04Bonvo == null) {
                _whiteBaseOne04Bonvo = new WhiteBaseOne04BonvoCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne04Bonvo()
                                    , () -> _qyCall.qy().queryWhiteBaseOne04Bonvo())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne04Bonvo.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne04Bonvo()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne04Bonvo()));
                }
            }
            return _whiteBaseOne04Bonvo;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne05DstoreCB.HpSpecification specifyWhiteBaseOne05Dstore() {
            assertRelation("whiteBaseOne05Dstore");
            if (_whiteBaseOne05Dstore == null) {
                _whiteBaseOne05Dstore = new WhiteBaseOne05DstoreCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne05Dstore()
                                    , () -> _qyCall.qy().queryWhiteBaseOne05Dstore())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne05Dstore.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne05Dstore()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne05Dstore()));
                }
            }
            return _whiteBaseOne05Dstore;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne02LandCB.HpSpecification specifyWhiteBaseOne02Land() {
            assertRelation("whiteBaseOne02Land");
            if (_whiteBaseOne02Land == null) {
                _whiteBaseOne02Land = new WhiteBaseOne02LandCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne02Land()
                                    , () -> _qyCall.qy().queryWhiteBaseOne02Land())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne02Land.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne02Land()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne02Land()));
                }
            }
            return _whiteBaseOne02Land;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne07MiracoCB.HpSpecification specifyWhiteBaseOne07Miraco() {
            assertRelation("whiteBaseOne07Miraco");
            if (_whiteBaseOne07Miraco == null) {
                _whiteBaseOne07Miraco = new WhiteBaseOne07MiracoCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne07Miraco()
                                    , () -> _qyCall.qy().queryWhiteBaseOne07Miraco())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne07Miraco.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne07Miraco()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne07Miraco()));
                }
            }
            return _whiteBaseOne07Miraco;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne03PiariCB.HpSpecification specifyWhiteBaseOne03Piari() {
            assertRelation("whiteBaseOne03Piari");
            if (_whiteBaseOne03Piari == null) {
                _whiteBaseOne03Piari = new WhiteBaseOne03PiariCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne03Piari()
                                    , () -> _qyCall.qy().queryWhiteBaseOne03Piari())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne03Piari.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne03Piari()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne03Piari()));
                }
            }
            return _whiteBaseOne03Piari;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne01SeaCB.HpSpecification specifyWhiteBaseOne01Sea() {
            assertRelation("whiteBaseOne01Sea");
            if (_whiteBaseOne01Sea == null) {
                _whiteBaseOne01Sea = new WhiteBaseOne01SeaCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne01Sea()
                                    , () -> _qyCall.qy().queryWhiteBaseOne01Sea())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne01Sea.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne01Sea()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne01Sea()));
                }
            }
            return _whiteBaseOne01Sea;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne08DohotelCB.HpSpecification specifyWhiteBaseOne08Dohotel() {
            assertRelation("whiteBaseOne08Dohotel");
            if (_whiteBaseOne08Dohotel == null) {
                _whiteBaseOne08Dohotel = new WhiteBaseOne08DohotelCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne08Dohotel()
                                    , () -> _qyCall.qy().queryWhiteBaseOne08Dohotel())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne08Dohotel.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne08Dohotel()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne08Dohotel()));
                }
            }
            return _whiteBaseOne08Dohotel;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne09PalmCB.HpSpecification specifyWhiteBaseOne09PalmAsOne() {
            assertRelation("whiteBaseOne09PalmAsOne");
            if (_whiteBaseOne09PalmAsOne == null) {
                _whiteBaseOne09PalmAsOne = new WhiteBaseOne09PalmCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne09PalmAsOne()
                                    , () -> _qyCall.qy().queryWhiteBaseOne09PalmAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne09PalmAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne09PalmAsOne()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne09PalmAsOne()));
                }
            }
            return _whiteBaseOne09PalmAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne10CelebCB.HpSpecification specifyWhiteBaseOne10CelebAsOne() {
            assertRelation("whiteBaseOne10CelebAsOne");
            if (_whiteBaseOne10CelebAsOne == null) {
                _whiteBaseOne10CelebAsOne = new WhiteBaseOne10CelebCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne10CelebAsOne()
                                    , () -> _qyCall.qy().queryWhiteBaseOne10CelebAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne10CelebAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne10CelebAsOne()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne10CelebAsOne()));
                }
            }
            return _whiteBaseOne10CelebAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne11CirqueCB.HpSpecification specifyWhiteBaseOne11CirqueAsOne() {
            assertRelation("whiteBaseOne11CirqueAsOne");
            if (_whiteBaseOne11CirqueAsOne == null) {
                _whiteBaseOne11CirqueAsOne = new WhiteBaseOne11CirqueCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne11CirqueAsOne()
                                    , () -> _qyCall.qy().queryWhiteBaseOne11CirqueAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne11CirqueAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne11CirqueAsOne()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne11CirqueAsOne()));
                }
            }
            return _whiteBaseOne11CirqueAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne12AmphiCB.HpSpecification specifyWhiteBaseOne12AmphiAsOne() {
            assertRelation("whiteBaseOne12AmphiAsOne");
            if (_whiteBaseOne12AmphiAsOne == null) {
                _whiteBaseOne12AmphiAsOne = new WhiteBaseOne12AmphiCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne12AmphiAsOne()
                                    , () -> _qyCall.qy().queryWhiteBaseOne12AmphiAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne12AmphiAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne12AmphiAsOne()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne12AmphiAsOne()));
                }
            }
            return _whiteBaseOne12AmphiAsOne;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteBaseCB, WhiteBaseCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhiteBaseCB> sq, WhiteBaseCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public WhiteBaseCB dreamCruiseCB() {
        WhiteBaseCB cb = new WhiteBaseCB();
        cb.xsetupForDreamCruise((WhiteBaseCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<WhiteBaseCB> columnQuery(final SpecifyQuery<WhiteBaseCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected WhiteBaseCB xcreateColumnQueryCB() {
        WhiteBaseCB cb = new WhiteBaseCB();
        cb.xsetupForColumnQuery((WhiteBaseCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<WhiteBaseCB> orCBLambda) {
        xorSQ((WhiteBaseCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<WhiteBaseCB> andCBLambda) {
        xorSQAP((WhiteBaseCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final WhiteBaseCB cb;
        if (mainCB != null) {
            cb = (WhiteBaseCB)mainCB;
        } else {
            cb = new WhiteBaseCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteBaseCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteBaseCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
