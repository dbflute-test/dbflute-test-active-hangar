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
package org.docksidestage.hangar.dbflute.cbean;

import java.util.function.Function;

import org.dbflute.cbean.ConditionBean;
import org.docksidestage.hangar.dbflute.cbean.bs.BsMemberCB;
import org.docksidestage.hangar.dbflute.cbean.cq.MemberCQ;
import org.docksidestage.hangar.dbflute.nogen.OrScopeable;

/**
 * The condition-bean of MEMBER.
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class MemberCB extends BsMemberCB implements OrScopeable<MemberCB> {

    public void arrangeOrOrParade() {
        new OrOrParadeTemplate<>(this, cb -> cb.query()).arrange();
    }

    public static class OrOrParadeTemplate<BASE_CB extends ConditionBean> {

        private OrScopeable<BASE_CB> scopeable;
        private Function<BASE_CB, MemberCQ> relationshipTracer;

        public OrOrParadeTemplate(OrScopeable<BASE_CB> scopeable, Function<BASE_CB, MemberCQ> relationshipTracer) {
            this.scopeable = scopeable;
            this.relationshipTracer = relationshipTracer;
        }

        public void arrange() {
            scopeable.orScopeQuery(orCB -> {
                query(orCB).setBirthdate_IsNotNull();
                cast(orCB).orScopeQueryAndPart(andCB -> {
                    query(andCB).setMemberName_LikeSearch("S", op -> op.likePrefix());
                    query(andCB).setMemberAccount_LikeSearch("P", op -> op.likePrefix());
                });
                cast(orCB).orScopeQueryAndPart(andCB -> {
                    query(andCB).setMemberName_LikeSearch("M", op -> op.likePrefix());
                    query(andCB).setMemberStatusCode_Equal_Withdrawal();
                });
            });
        }

        private MemberCQ query(BASE_CB orCB) {
            return relationshipTracer.apply(orCB);
        }

        @SuppressWarnings("unchecked")
        private OrScopeable<BASE_CB> cast(BASE_CB orCB) {
            return (OrScopeable<BASE_CB>) orCB;
        }
    }

    @SuppressWarnings("deprecation")
    public void useTrickPrimaryIndexForcedly() {
        // maybe H2 database does not support hint but logical test here 
        getSqlClause().registerDynamicHintFromBaseTable("use index (PRIMARY)"); // for test
    }
}
