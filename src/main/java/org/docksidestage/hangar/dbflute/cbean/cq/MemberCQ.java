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
package org.docksidestage.hangar.dbflute.cbean.cq;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.hangar.dbflute.cbean.cq.bs.BsMemberCQ;

/**
 * The condition-query of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberCQ extends BsMemberCQ {

    /** noise for arrange query analyze */
    @SuppressWarnings("unused")
    private static final String JAVADOC_NOISE_DEF1 = "dummy";

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public MemberCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here. e.g. public void arrangeXxx()
    /**
     * Arrange the query for selecting service members.
     * o starts 'S'
     * o status 'Formalized'
     * o exists the special product
     */
    public void arrangeSpecialServiceMember() {
        final Integer specialProductId = 3;
        setMemberName_LikeSearch("S", op -> op.likePrefix());
        setMemberStatusCode_Equal_Formalized();
        existsPurchase(purCB -> {
            purCB.query().setProductId_Equal(specialProductId);
        });
    }

    public void arrangeNoJavaDocMember() {
        setMemberName_LikeSearch("S", op -> op.likePrefix());
    }

    /** arrange query for one liner javadoc */
    public void arrangeOneLinerJavaDocMember() {
        setMemberName_LikeSearch("S", op -> op.likePrefix());
    }

    /** noise for arrange query analyze */
    @SuppressWarnings("unused")
    private static final String JAVADOC_NOISE_DEF2 = "dummy";

    /**
     * arrange query for title-only javadoc
     */
    public void arrangeTitleOnlyJavaDocMember() {
        setMemberName_LikeSearch("S", op -> op.likePrefix());
    }

    /**
     * arrange query for <strong>HTML</strong> javadoc, e.g. List<String>, Map<String, Object>, ... <br>
     * <pre>
     * dummy text
     * </pre>
     */
    public void arrangeHtmlJavaDocMember() {
        setMemberName_LikeSearch("S", op -> op.likePrefix());
    }

    /**
     * arrange query for method annotation javadoc
     */
    @SuppressWarnings("unused")
    public void arrangeMethodAnnotationJavaDocMember() {
        String unusedStr = "dummy";
    }

    // ===================================================================================
    //                                                                            Sorry...
    //                                                                            ========
    // the test of trick for classification's like search
    public void setMemberStatusCode_LikeSearch(String statusCode, LikeSearchOption likeSearchOption) {
        String columnDbName = MemberDbm.getInstance().columnMemberStatusCode().getColumnDbName();
        regLSQ(CK_LS, fRES(statusCode), xgetCValueMemberStatusCode(), columnDbName, likeSearchOption);
    }
}
