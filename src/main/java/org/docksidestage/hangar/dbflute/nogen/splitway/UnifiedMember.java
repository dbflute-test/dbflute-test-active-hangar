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

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.exentity.MemberAddress;
import org.docksidestage.hangar.dbflute.exentity.MemberService;
import org.docksidestage.hangar.dbflute.exentity.MemberStatus;
import org.docksidestage.hangar.dbflute.exentity.MemberWithdrawal;

/**
 * @author jflute
 */
public interface UnifiedMember extends UnifiedEntity {

    /**
     * 会員ID: INTEGER(10) not null <br>
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    Integer getMemberId();

    /**
     * 会員名称: VARCHAR(200) not null <br>
     * 会員のフルネームの名称。 <br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    String getMemberName();

    /**
     * 会員アカウント: VARCHAR(50) not null <br>
     * ログインIDとして利用する。 <br>
     * 昨今メールアドレスをログインIDとすることが多いので、あまり見かけないかも!?
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    String getMemberAccount();

    /**
     * 会員ステータスコード: CHAR(3) not null <br>
     * 会員ステータスを参照するコード。 <br>
     * ステータスが変わるたびに、このカラムが更新される。
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    String getMemberStatusCode();

    /**
     * 正式会員日時: TIMESTAMP(26) null allowed <br>
     * 会員が正式に確定した(正式会員になった)日時。 <br>
     * 一度確定したらもう二度と更新されないはずだ！
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    LocalDateTime getFormalizedDatetime();

    /**
     * 生年月日: DATE(10) null allowed <br>
     * お腹が空いたら食べた方が良い。 <br>
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    LocalDate getBirthdate();

    /**
     * 登録日時: TIMESTAMP(26) not null <br>
     * レコードが登録された日時。 <br>
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。といいつつ、このテーブルには会員登録日時がない... <br>
     * 仕様はどのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    LocalDateTime getRegisterDatetime();

    /**
     * 登録ユーザ: VARCHAR(200) not null <br>
     * レコードを登録したユーザ。 <br>
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    String getRegisterUser();

    /**
     * 更新日時: TIMESTAMP(26) not null <br>
     * レコードが（最後に）更新された日時。 <br>
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    LocalDateTime getUpdateDatetime();

    /**
     * 更新ユーザ: VARCHAR(200) not null <br>
     * レコードを更新したユーザ。 <br>
     * システムは誰が何をしたのかちゃんと覚えているのさ。
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    String getUpdateUser();

    /**
     * バージョンNO: BIGINT(19) not null <br>
     * データのバージョンを示すナンバー。 <br>
     * 更新回数と等しく、主に排他制御のために利用される。
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    Long getVersionNo();

    /**
     * 会員住所情報: 会員の住所に関する情報で、同時に有効期間ごとに履歴管理されている。 <br>
     * 会員を基点に考えた場合、構造的には one-to-many だが、業務的な定型条件で one-to-one になる。このような構造を「業務的one-to-one」と呼ぶ！ <br>
     * 有効期間は隙間なく埋められるが、ここでは住所情報のない会員も存在し、厳密には(業務的な) "1 : 0..1" である。
     * @return The entity of foreign property 'memberAddressAsValid'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<MemberAddress> getMemberAddressAsValid();

    /**
     * 会員サービス: 会員のサービス情報（ポイントサービスなど）。 <br>
     * テストケースのために、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。
     * @return The entity of foreign property 'memberServiceWithIfComment'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<MemberService> getMemberServiceWithIfComment();

    /**
     * 会員セキュリティ情報: 会員とは one-to-one で、会員一人につき必ず一つのセキュリティ情報がある
     * @return The entity of foreign property 'memberSecurityAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    OptionalEntity<? extends UnifiedMemberSecurity> getUnifiedMemberSecurityAsOne();

    /**
     * 会員サービス: 会員のサービス情報（ポイントサービスなど）。 <br>
     * テストケースのために、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。
     * @return The entity of foreign property 'memberServiceAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    OptionalEntity<MemberService> getMemberServiceAsOne();

    /**
     * 会員退会情報: 退会会員の退会に関する詳細な情報。 <br>
     * 退会会員のみデータが存在し、"1 : 0..1" のパターンの one-to-one である。 <br>
     * 共通カラムがあってバージョンNOがないパターン。 <br>
     * 基本的に更新は入らないが、重要なデータなので万が一のために更新系の共通カラムも。
     * @return The entity of foreign property 'memberWithdrawalAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    OptionalEntity<MemberWithdrawal> getMemberWithdrawalAsOne();

    /**
     * 会員ステータス: 会員のステータスを示す固定的なマスタテーブル。いわゆるテーブル区分値！ <br>
     * 業務運用上で増えることはなく、増減するときはプログラム修正ともなうレベルの業務変更と考えられる。 <br>
     *  <br>
     * こういった固定的なマスタテーブルには、更新日時などの共通カラムは定義していないが、業務上そういった情報を管理する必要性が低いという理由に加え、ExampleDBとして共通カラムでER図が埋め尽くされてしまい見づらくなるというところで割り切っている。実業務では統一的に定義することもある。
     * @return The entity of foreign property 'memberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<MemberStatus> getMemberStatus();
}
