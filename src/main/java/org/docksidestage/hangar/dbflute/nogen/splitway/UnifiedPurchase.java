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
package org.docksidestage.hangar.dbflute.nogen.splitway;

import java.time.LocalDateTime;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exentity.MemberLogin;
import org.docksidestage.hangar.dbflute.exentity.Product;
import org.docksidestage.hangar.dbflute.exentity.PurchasePayment;
import org.docksidestage.hangar.dbflute.exentity.SummaryProduct;
import org.docksidestage.hangar.dbflute.exentity.WhiteDateTerm;

/**
 * @author jflute
 */
public interface UnifiedPurchase extends UnifiedEntity {

    /**
     * BIGINT(19) not null <br>
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    Long getPurchaseId();

    /**
     * 会員ID: INTEGER(10) not null <br>
     * 会員を参照するID。 <br>
     * 購入を識別する自然キー(複合ユニーク制約)の筆頭要素。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    Integer getMemberId();

    /**
     * 商品ID: INTEGER(10) not null <br>
     * あなたは何を買ったのか？
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    Integer getProductId();

    /**
     * 購入日時: TIMESTAMP(26) not null <br>
     * 購入した瞬間の日時。
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    LocalDateTime getPurchaseDatetime();

    /**
     * 購入数量: INTEGER(10) not null <br>
     * 購入した商品の一回の購入における数量。
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    Integer getPurchaseCount();

    /**
     * 購入価格: INTEGER(10) not null <br>
     * 眠いのはプライスレス。 <br>
     * 購入によって実際に会員が支払った（支払う予定の）価格。 <br>
     * 基本は商品の定価に購入数量を掛けたものになるが、ポイント利用や割引があったりと必ずしもそうはならない。
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    Integer getPurchasePrice();

    /**
     * 支払完了フラグ: INTEGER(10) not null <br>
     * この購入に関しての支払いが完了しているか否か。
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    CDef.Flg getPaymentCompleteFlgAsFlg();

    /**
     * TIMESTAMP(26) not null <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    LocalDateTime getRegisterDatetime();

    /**
     * VARCHAR(200) not null <br>
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    String getRegisterUser();

    /**
     * TIMESTAMP(26) not null <br>
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    LocalDateTime getUpdateDatetime();

    /**
     * VARCHAR(200) not null <br>
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    String getUpdateUser();

    /**
     * BIGINT(19) not null <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    Long getVersionNo();

    /**
     * @return The entity of foreign property 'whiteDateTermAsValid'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<WhiteDateTerm> getWhiteDateTermAsValid();

    /**
     * 会員ログイン: ログインするたびに登録されるログイン履歴。 <br>
     * 登録されたら更新されるも削除されることもない。さらには、登録する人もプログラムもはっきりしているので、(紙面の都合上もあって)ここでは共通カラムは省略している。
     * @return The entity of foreign property 'memberLoginAsBizManyToOne'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<MemberLogin> getMemberLoginAsBizManyToOne();

    /**
     * 会員: 眠いときは寝た方が良い。 <br>
     * 会員のプロフィールやアカウントなどの基本情報を保持する。 <br>
     * 基本的に物理削除はなく、退会したらステータスが退会会員になる。 <br>
     * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<? extends UnifiedMember> getUnifiedMember();

    /**
     * 眠い商品: 商品:
     * @return The entity of foreign property 'product'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<Product> getProduct();

    /**
     * @return The entity of foreign property 'summaryProduct'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<SummaryProduct> getSummaryProduct();

    /**
     * 購入支払: 購入に対する支払。 <br>
     * 分割払いもできるのでmanyとなり、会員からの孫テーブルのテストができてうれしい。
     * @return The entity list of referrer property 'purchasePaymentList'. (NotNull: even if no loading, returns empty list)
     */
    List<PurchasePayment> getPurchasePaymentList();
}
