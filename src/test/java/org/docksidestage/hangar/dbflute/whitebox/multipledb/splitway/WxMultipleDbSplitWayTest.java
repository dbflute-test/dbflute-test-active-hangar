package org.docksidestage.hangar.dbflute.whitebox.multipledb.splitway;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.dbflute.exentity.MemberStatus;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMemberSecurity;
import org.docksidestage.hangar.dbflute.resola.exbhv.ResolaMemberBhv;
import org.docksidestage.hangar.dbflute.resola.exentity.ResolaMember;
import org.docksidestage.hangar.dbflute.whitebox.multipledb.base.UnitContainerMultipleDbTestCase;

import com.google.inject.Inject;

/**
 * 複数DBでデータ分離方式 (SplitWay) をやってみる。<br>
 * 例えば、会員テーブルの一部データのみ本家スキーマに残して、残りのデータは分離スキーマで保存していくなど。<br>
 * または、購入テーブルの最新データのみ本家スキーマに残して、過去のデータは分離スキーマで保存していくなど。<br>
 * 
 * <p>ただ、アプリでは本家スキーマのみだけを検索するのではなく「分離スキーマのデータも検索する必要がある」
 * というケースをここでは想定している。そのときアプリでは「どっちのスキーマか？」をある程度気にせずに扱えると嬉しい。
 * ゆえに、ここでは統合されたEntity(UnifiedEntity)という概念を検証している。</p>
 * 
 * <pre>課題と解決方法:
 * A. 同じテーブル(名)でも、Entityはそれぞれ別のプログラム型になってしまう
 *  → 型を統合するためのinterfaceを用意して、アプリ側ではそのinterfaceを使ってEntityを扱う
 * 
 * B. 一部の関連テーブルが分離スキーマには存在しないので、SQL上でjoinして関連データとして扱うことができない
 *  → 別途本家スキーマを検索して、プログラム上でEntityに紐づける (べたべたWay)
 * </pre>
 * 
 * <pre>このExampleの構成/特徴:
 * o 分離対象テーブルが、MEMBER, MEMBER_SECURITY, PURCHASE のみ
 * o 分離スキーマとして、resortlinedb を使う
 * 
 * o MEMBER_STATUS や MEMBER_SERVICE などの関連テーブルは分離スキーマには存在しない
 * o MEMBER を基点とすると分離スキーマでは...
 *  i MEMBER_STATUS は join できない
 *  i MEMBER_SECURITY は join できる
 * </pre>
 * 
 * <pre>統合interfaceの作り方:
 * (ここでの説明は、MEMBER と MEMBER_SECURITY のみ分離されていると想定した場合)
 * 1. 本家スキーマのdbflute package配下に "nogen" package を作って...
 * 2. UnifiedMember.java, UnifiedMemberSecurity.java を作成する (この時点ではメソッドは空っぽ)
 * 3. Exクラスの Member.java, ResolaMember.java, (securityも) にて implements する
 * 4. WxUnifiedInterfaceMakingTest.java を実行してログからgetterをコピーして貼り付ける
 * 5. コンパイルエラーになるメソッドを実装、かつ、分離されたリレーションシップを埋める実装をResola側に実装
 * (exampleのコードを参考に)
 * #for_now まだ one-to-many を試してない。Purchase入れたらちょっと変わるかも by jflute (2025/03/20)
 * </pre>
 * 
 * <pre>統合interfaceを使った検索のexample:
 * o 本家スキーマの検索: test_unifiedSelect_selectHonke()
 * o 分離スキーマの検索: test_unifiedSelect_selectSplit()
 * </pre>
 * 
 * @author jflute
 * @since DBFlute-1.2.8 (2025/03/18 Tuesday at ichihara)
 */
public class WxMultipleDbSplitWayTest extends UnitContainerMultipleDbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Inject
    private MemberBhv memberBhv;
    @Inject
    private MemberStatusBhv memberStatusBhv;
    @Inject
    private ResolaMemberBhv resolaMemberBhv;

    // ===================================================================================
    //                                                                      Unified Select
    //                                                                      ==============
    public void test_unifiedSelect_selectHonke() {
        // ## Arrange ##

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberSecurityAsOne();
        });

        // ## Assert ##
        mappingToResult(memberList);
    }

    public void test_unifiedSelect_selectSplit() {
        // ## Arrange ##

        // ## Act ##
        ListResultBean<ResolaMember> memberList = resolaMemberBhv.selectList(cb -> {
            cb.setupSelect_MemberSecurityAsOne();
        });
        joinMemberStatus(memberList); // setupSelect_MemberStatus()の代わり

        // ## Assert ##
        mappingToResult(memberList);
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private void joinMemberStatus(ListResultBean<ResolaMember> memberList) {
        // split側にはMemberStatusの区分値が存在しないので、codeで変換するしかない。
        // (split側で区分値定義すると定義が冗長になるので)
        List<CDef.MemberStatus> cdefList = memberList.extractColumnList(member -> {
            String memberStatusCode = member.getMemberStatusCode();
            return CDef.MemberStatus.of(memberStatusCode).orElseThrow(); // 絶対にズレてないこと前提
        });

        // 関連するstatusだけ検索してきて...
        Map<String, MemberStatus> statusMap = memberStatusBhv.selectList(cb -> {
            cb.query().setMemberStatusCode_InScope_AsMemberStatus(cdefList);
        }).stream().collect(Collectors.toMap(mb -> mb.getMemberStatusCode(), mb -> mb));

        // 会員一覧にstatusを関連付ける
        for (ResolaMember member : memberList) {
            MemberStatus status = statusMap.get(member.getMemberStatusCode());
            if (status == null) { // 絶対に存在するはず
                throw new IllegalStateException("Not found the status: " + member.getMemberStatusCode());
            }
            member.setMemberStatus(OptionalEntity.of(status));
        }
    }

    private void mappingToResult(List<? extends UnifiedMember> memberList) {
        for (UnifiedMember member : memberList) {
            String memberName = member.getMemberName();
            LocalDate birthdate = member.getBirthdate();
            MemberStatus status = member.getMemberStatus().get();
            UnifiedMemberSecurity security = member.getUnifiedMemberSecurityAsOne().get();

            // dummy, only show log
            log(memberName, birthdate, status.getMemberStatusName(), security.getReminderQuestion());
        }
    }
}
