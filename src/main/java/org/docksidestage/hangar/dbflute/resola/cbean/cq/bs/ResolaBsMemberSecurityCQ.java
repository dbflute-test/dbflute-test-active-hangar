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
package org.docksidestage.hangar.dbflute.resola.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.hangar.dbflute.resola.cbean.cq.ciq.*;
import org.docksidestage.hangar.dbflute.resola.cbean.*;
import org.docksidestage.hangar.dbflute.resola.cbean.cq.*;

/**
 * The base condition-query of MEMBER_SECURITY.
 * @author DBFlute(AutoGenerator)
 */
public class ResolaBsMemberSecurityCQ extends ResolaAbstractBsMemberSecurityCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ResolaMemberSecurityCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ResolaBsMemberSecurityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER_SECURITY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ResolaMemberSecurityCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ResolaMemberSecurityCIQ xcreateCIQ() {
        ResolaMemberSecurityCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ResolaMemberSecurityCIQ xnewCIQ() {
        return new ResolaMemberSecurityCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER_SECURITY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ResolaMemberSecurityCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ResolaMemberSecurityCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /**
     * Add order-by as ascend. <br>
     * MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _loginPassword;
    public ConditionValue xdfgetLoginPassword()
    { if (_loginPassword == null) { _loginPassword = nCV(); }
      return _loginPassword; }
    protected ConditionValue xgetCValueLoginPassword() { return xdfgetLoginPassword(); }

    /**
     * Add order-by as ascend. <br>
     * LOGIN_PASSWORD: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_LoginPassword_Asc() { regOBA("LOGIN_PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGIN_PASSWORD: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_LoginPassword_Desc() { regOBD("LOGIN_PASSWORD"); return this; }

    protected ConditionValue _reminderQuestion;
    public ConditionValue xdfgetReminderQuestion()
    { if (_reminderQuestion == null) { _reminderQuestion = nCV(); }
      return _reminderQuestion; }
    protected ConditionValue xgetCValueReminderQuestion() { return xdfgetReminderQuestion(); }

    /**
     * Add order-by as ascend. <br>
     * REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_ReminderQuestion_Asc() { regOBA("REMINDER_QUESTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_ReminderQuestion_Desc() { regOBD("REMINDER_QUESTION"); return this; }

    protected ConditionValue _reminderAnswer;
    public ConditionValue xdfgetReminderAnswer()
    { if (_reminderAnswer == null) { _reminderAnswer = nCV(); }
      return _reminderAnswer; }
    protected ConditionValue xgetCValueReminderAnswer() { return xdfgetReminderAnswer(); }

    /**
     * Add order-by as ascend. <br>
     * REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_ReminderAnswer_Asc() { regOBA("REMINDER_ANSWER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_ReminderAnswer_Desc() { regOBD("REMINDER_ANSWER"); return this; }

    protected ConditionValue _reminderUseCount;
    public ConditionValue xdfgetReminderUseCount()
    { if (_reminderUseCount == null) { _reminderUseCount = nCV(); }
      return _reminderUseCount; }
    protected ConditionValue xgetCValueReminderUseCount() { return xdfgetReminderUseCount(); }

    /**
     * Add order-by as ascend. <br>
     * REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_ReminderUseCount_Asc() { regOBA("REMINDER_USE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_ReminderUseCount_Desc() { regOBD("REMINDER_USE_COUNT"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public ResolaBsMemberSecurityCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ResolaMemberSecurityCQ bq = (ResolaMemberSecurityCQ)bqs;
        ResolaMemberSecurityCQ uq = (ResolaMemberSecurityCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public ResolaMemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public ResolaMemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected ResolaMemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("MEMBER_SECURITY", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ResolaMemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ResolaMemberSecurityCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ResolaMemberSecurityCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ResolaMemberSecurityCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ResolaMemberSecurityCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ResolaMemberSecurityCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ResolaMemberSecurityCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ResolaMemberSecurityCQ> _myselfExistsMap;
    public Map<String, ResolaMemberSecurityCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ResolaMemberSecurityCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ResolaMemberSecurityCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ResolaMemberSecurityCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ResolaMemberSecurityCB.class.getName(); }
    protected String xCQ() { return ResolaMemberSecurityCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
