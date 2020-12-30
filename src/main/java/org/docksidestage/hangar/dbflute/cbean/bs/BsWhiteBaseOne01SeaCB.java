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
 * The base condition-bean of WHITE_BASE_ONE01_SEA.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteBaseOne01SeaCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteBaseOne01SeaCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaCB() {
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
        return "WHITE_BASE_ONE01_SEA";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param seaId : PK, NotNull, INTEGER(10). (NotNull)
     * @return this. (NotNull)
     */
    public WhiteBaseOne01SeaCB acceptPK(Integer seaId) {
        assertObjectNotNull("seaId", seaId);
        BsWhiteBaseOne01SeaCB cb = this;
        cb.query().setSeaId_Equal(seaId);
        return (WhiteBaseOne01SeaCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_SeaId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_SeaId_Desc();
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
    public WhiteBaseOne01SeaCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public WhiteBaseOne01SeaCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected WhiteBaseOne01SeaCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected WhiteBaseOne01SeaCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected WhiteBaseOne01SeaCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        WhiteBaseOne01SeaCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected WhiteBaseOne01SeaCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new WhiteBaseOne01SeaCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<WhiteBaseOne01SeaCB> unionCBLambda) {
        final WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteBaseOne01SeaCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<WhiteBaseOne01SeaCB> unionCBLambda) {
        final WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final WhiteBaseOne01SeaCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne01SeaBroadway()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBaseOne01Sea</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBaseOne01Sea</span>.<span style="color: #CC4747">getWhiteBaseOne01SeaBroadway()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne01SeaBroadway() {
        assertSetupSelectPurpose("whiteBaseOne01SeaBroadway");
        if (hasSpecifiedLocalColumn()) {
            specify().columnBroadwayId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne01SeaBroadway());
    }

    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne01SeaDockside()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBaseOne01Sea</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBaseOne01Sea</span>.<span style="color: #CC4747">getWhiteBaseOne01SeaDockside()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_WhiteBaseOne01SeaDockside() {
        assertSetupSelectPurpose("whiteBaseOne01SeaDockside");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDocksideId();
        }
        doSetupSelect(() -> query().queryWhiteBaseOne01SeaDockside());
    }

    protected WhiteBaseOne01SeaHangarNss _nssWhiteBaseOne01SeaHangarAsOne;
    public WhiteBaseOne01SeaHangarNss xdfgetNssWhiteBaseOne01SeaHangarAsOne() {
        if (_nssWhiteBaseOne01SeaHangarAsOne == null) { _nssWhiteBaseOne01SeaHangarAsOne = new WhiteBaseOne01SeaHangarNss(null); }
        return _nssWhiteBaseOne01SeaHangarAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
     * <pre>
     * <span style="color: #0000C0">whiteBaseOne01SeaBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_WhiteBaseOne01SeaHangarAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">whiteBaseOne01Sea</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">whiteBaseOne01Sea</span>.<span style="color: #CC4747">getWhiteBaseOne01SeaHangarAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public WhiteBaseOne01SeaHangarNss setupSelect_WhiteBaseOne01SeaHangarAsOne() {
        assertSetupSelectPurpose("whiteBaseOne01SeaHangarAsOne");
        doSetupSelect(() -> query().queryWhiteBaseOne01SeaHangarAsOne());
        if (_nssWhiteBaseOne01SeaHangarAsOne == null || !_nssWhiteBaseOne01SeaHangarAsOne.hasConditionQuery())
        { _nssWhiteBaseOne01SeaHangarAsOne = new WhiteBaseOne01SeaHangarNss(query().queryWhiteBaseOne01SeaHangarAsOne()); }
        return _nssWhiteBaseOne01SeaHangarAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<WhiteBaseOne01SeaCQ> {
        protected WhiteBaseOne01SeaBroadwayCB.HpSpecification _whiteBaseOne01SeaBroadway;
        protected WhiteBaseOne01SeaDocksideCB.HpSpecification _whiteBaseOne01SeaDockside;
        protected WhiteBaseOne01SeaHangarCB.HpSpecification _whiteBaseOne01SeaHangarAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<WhiteBaseOne01SeaCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * SEA_ID: {PK, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSeaId() { return doColumn("SEA_ID"); }
        /**
         * SEA_NAME: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSeaName() { return doColumn("SEA_NAME"); }
        /**
         * BROADWAY_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_BROADWAY}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBroadwayId() { return doColumn("BROADWAY_ID"); }
        /**
         * DOCKSIDE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA_DOCKSIDE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDocksideId() { return doColumn("DOCKSIDE_ID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnSeaId(); // PK
            if (qyCall().qy().hasConditionQueryWhiteBaseOne01SeaBroadway()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne01SeaBroadwayCQ) {
                columnBroadwayId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryWhiteBaseOne01SeaDockside()
                    || qyCall().qy().xgetReferrerQuery() instanceof WhiteBaseOne01SeaDocksideCQ) {
                columnDocksideId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "WHITE_BASE_ONE01_SEA"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE01_SEA_BROADWAY by my BROADWAY_ID, named 'whiteBaseOne01SeaBroadway'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne01SeaBroadwayCB.HpSpecification specifyWhiteBaseOne01SeaBroadway() {
            assertRelation("whiteBaseOne01SeaBroadway");
            if (_whiteBaseOne01SeaBroadway == null) {
                _whiteBaseOne01SeaBroadway = new WhiteBaseOne01SeaBroadwayCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne01SeaBroadway()
                                    , () -> _qyCall.qy().queryWhiteBaseOne01SeaBroadway())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne01SeaBroadway.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne01SeaBroadway()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne01SeaBroadway()));
                }
            }
            return _whiteBaseOne01SeaBroadway;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE01_SEA_DOCKSIDE by my DOCKSIDE_ID, named 'whiteBaseOne01SeaDockside'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne01SeaDocksideCB.HpSpecification specifyWhiteBaseOne01SeaDockside() {
            assertRelation("whiteBaseOne01SeaDockside");
            if (_whiteBaseOne01SeaDockside == null) {
                _whiteBaseOne01SeaDockside = new WhiteBaseOne01SeaDocksideCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne01SeaDockside()
                                    , () -> _qyCall.qy().queryWhiteBaseOne01SeaDockside())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne01SeaDockside.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne01SeaDockside()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne01SeaDockside()));
                }
            }
            return _whiteBaseOne01SeaDockside;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * WHITE_BASE_ONE01_SEA_HANGAR by SEA_ID, named 'whiteBaseOne01SeaHangarAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public WhiteBaseOne01SeaHangarCB.HpSpecification specifyWhiteBaseOne01SeaHangarAsOne() {
            assertRelation("whiteBaseOne01SeaHangarAsOne");
            if (_whiteBaseOne01SeaHangarAsOne == null) {
                _whiteBaseOne01SeaHangarAsOne = new WhiteBaseOne01SeaHangarCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryWhiteBaseOne01SeaHangarAsOne()
                                    , () -> _qyCall.qy().queryWhiteBaseOne01SeaHangarAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _whiteBaseOne01SeaHangarAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryWhiteBaseOne01SeaHangarAsOne()
                      , () -> xsyncQyCall().qy().queryWhiteBaseOne01SeaHangarAsOne()));
                }
            }
            return _whiteBaseOne01SeaHangarAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from WHITE_BASE where ...) as FOO_MAX} <br>
         * WHITE_BASE by SEA_ID, named 'whiteBaseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(baseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     baseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     baseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhiteBase.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteBaseCB, WhiteBaseOne01SeaCQ> derivedWhiteBase() {
            assertDerived("whiteBaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhiteBaseCB> sq, WhiteBaseOne01SeaCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWhiteBaseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from WHITE_BASE_ONE01_SEA_MAGICLAMP where ...) as FOO_MAX} <br>
         * WHITE_BASE_ONE01_SEA_MAGICLAMP by SEA_ID, named 'whiteBaseOne01SeaMagiclampList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(magiclampCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     magiclampCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     magiclampCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WhiteBaseOne01SeaMagiclamp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WhiteBaseOne01SeaMagiclampCB, WhiteBaseOne01SeaCQ> derivedWhiteBaseOne01SeaMagiclamp() {
            assertDerived("whiteBaseOne01SeaMagiclampList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhiteBaseOne01SeaMagiclampCB> sq, WhiteBaseOne01SeaCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWhiteBaseOne01SeaMagiclampList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<WhiteBaseOne01SeaCB, WhiteBaseOne01SeaCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WhiteBaseOne01SeaCB> sq, WhiteBaseOne01SeaCQ cq, String al, DerivedReferrerOption op)
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
    public WhiteBaseOne01SeaCB dreamCruiseCB() {
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB();
        cb.xsetupForDreamCruise((WhiteBaseOne01SeaCB) this);
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
    public HpColQyOperand<WhiteBaseOne01SeaCB> columnQuery(final SpecifyQuery<WhiteBaseOne01SeaCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected WhiteBaseOne01SeaCB xcreateColumnQueryCB() {
        WhiteBaseOne01SeaCB cb = new WhiteBaseOne01SeaCB();
        cb.xsetupForColumnQuery((WhiteBaseOne01SeaCB)this);
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
    public void orScopeQuery(OrQuery<WhiteBaseOne01SeaCB> orCBLambda) {
        xorSQ((WhiteBaseOne01SeaCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<WhiteBaseOne01SeaCB> andCBLambda) {
        xorSQAP((WhiteBaseOne01SeaCB)this, andCBLambda);
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
        final WhiteBaseOne01SeaCB cb;
        if (mainCB != null) {
            cb = (WhiteBaseOne01SeaCB)mainCB;
        } else {
            cb = new WhiteBaseOne01SeaCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return WhiteBaseOne01SeaCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return WhiteBaseOne01SeaCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
