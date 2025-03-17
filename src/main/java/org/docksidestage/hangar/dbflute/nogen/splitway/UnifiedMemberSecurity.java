package org.docksidestage.hangar.dbflute.nogen.splitway;

import java.time.LocalDateTime;

import org.dbflute.optional.OptionalEntity;

/**
 * @author jflute
 */
public interface UnifiedMemberSecurity extends UnifiedEntity {

    /**
     * 会員ID: INTEGER(10) not null <br>
     * そのまま one-to-one を構成するためのFKとなる。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    Integer getMemberId();

    /**
     * ログインパスワード: VARCHAR(100) not null <br>
     * ログイン時に利用するパスワード。 <br>
     * 本当は良くないが、Exampleなのでひとまず暗号化していない。
     * @return The value of the column 'LOGIN_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    String getLoginPassword();

    /**
     * リマインダ質問: VARCHAR(50) not null <br>
     * パスワードを忘れた際のリマインダ機能における質問の内容。
     * @return The value of the column 'REMINDER_QUESTION'. (basically NotNull if selected: for the constraint)
     */
    String getReminderQuestion();

    /**
     * リマインダ回答: VARCHAR(50) not null <br>
     * パスワードを忘れた際のリマインダ機能における質問の答え。
     * @return The value of the column 'REMINDER_ANSWER'. (basically NotNull if selected: for the constraint)
     */
    String getReminderAnswer();

    /**
     * リマインダ利用回数: INTEGER(10) not null <br>
     * リマインダを利用した回数。 <br>
     * これが多いと忘れっぽい会員と言えるが、そんなことを知ってもしょうがない。
     * @return The value of the column 'REMINDER_USE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    Integer getReminderUseCount();

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
     * 会員: 眠いときは寝た方が良い。 <br>
     * 会員のプロフィールやアカウントなどの基本情報を保持する。 <br>
     * 基本的に物理削除はなく、退会したらステータスが退会会員になる。 <br>
     * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    OptionalEntity<? extends UnifiedMember> getUnifiedMember();
}
