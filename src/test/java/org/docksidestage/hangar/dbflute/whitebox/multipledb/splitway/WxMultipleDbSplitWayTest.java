package org.docksidestage.hangar.dbflute.whitebox.multipledb.splitway;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.hangar.dbflute.exbhv.ProductBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.dbflute.exentity.MemberStatus;
import org.docksidestage.hangar.dbflute.exentity.Product;
import org.docksidestage.hangar.dbflute.exentity.PurchasePayment;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMember;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedMemberSecurity;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedPurchase;
import org.docksidestage.hangar.dbflute.resola.exbhv.ResolaMemberBhv;
import org.docksidestage.hangar.dbflute.resola.exentity.ResolaMember;
import org.docksidestage.hangar.dbflute.resola.exentity.ResolaPurchase;
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
 * (ここでの説明は、MEMBER と MEMBER_SECURITY と PURCHASE のみ分離されていると想定した場合)
 * 1. 本家スキーマのdbflute package配下に "nogen" package を作って...
 * 2. UnifiedMember.java, UnifiedMemberSecurity.java, UnifiedPurchase.java を作成する (ひとまずメソッドなし)
 * 3. Exクラスの Member.java, ResolaMember.java, (security と purchase も同じく) にて implements する
 * 4. WxUnifiedInterfaceMakingTest.java を実行してログからgetterをコピーして貼り付ける
 * 5. とにかくコンパイルエラーになるメソッドを実装 (主にはResola側Entityで分離のギャップを埋める)
 * (exampleのコードを参考に)
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

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // jflute memo: (2025/03/26)
    // 現場からドキュメントとしてリンクされている可能性があるので、package移動やクラス名を変更などのリファクタリングは極力しない。
    // リファクタリングするにしても、ダミークラスで以下のリンクを残して誘導するようにする。
    // https://github.com/dbflute-test/dbflute-test-active-hangar/blob/master/src/test/java/org/docksidestage/hangar/dbflute/whitebox/multipledb/splitway/WxMultipleDbSplitWayTest.java
    // _/_/_/_/_/_/_/_/_/_/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                           Split Table
    //                                           -----------
    @Inject
    private MemberBhv memberBhv;
    @Inject
    private ResolaMemberBhv resolaMemberBhv;

    // -----------------------------------------------------
    //                                   Broken Relationship
    //                                   -------------------
    @Inject
    private MemberStatusBhv memberStatusBhv;
    @Resource
    private ProductBhv productBhv;

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
        memberBhv.load(memberList, memberLoader -> {
            memberLoader.loadPurchase(purchaseCB -> {
                purchaseCB.setupSelect_Product();
                purchaseCB.query().addOrderBy_PurchaseDatetime_Desc();
            }).withNestedReferrer(purchaseLoader -> {
                purchaseLoader.loadPurchasePayment(paymentCB -> {
                    paymentCB.query().addOrderBy_PaymentDatetime_Desc();
                });
            });
        });

        // ## Assert ##
        mappingToResult(memberList);
    }

    public void test_unifiedSelect_selectSplit() {
        // ## Arrange ##

        // ## Act ##
        ListResultBean<ResolaMember> memberList = resolaMemberBhv.selectList(cb -> {
            // MEMBER_STATUSはSplitスキーマ側に存在しないので呼べない
            //cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberSecurityAsOne();
        });
        loadMemberStatus(memberList); // setupSelect_MemberStatus()の代わり
        resolaMemberBhv.loadPurchase(memberList, purchaseCB -> {
            // PRODUCTはSplitスキーマ側に存在しないので呼べない
            //purchaseCB.setupSelect_Product();
            purchaseCB.query().addOrderBy_PurchaseDatetime_Desc();
        }).withNestedReferrer(purchaseList -> {
            loadProduct(purchaseList); // setupSelect_Product()の代わり

            // #for_now jflute 型違いで呼べない。ただ、親がsplitされてるのに子がsplitされていないって考えにくい？ (2025/03/20)
            // (FK参照的に本家スキーマ側で不整合が起きるので、やはりありえないと思われるのでここは気にしなくて良さそう)
            //purchaseBhv.loadPurchasePayment(purchaseList, paymentCB -> {
            //    paymentCB.query().addOrderBy_PaymentDatetime_Desc();
            //});
        });

        // ## Assert ##
        mappingToResult(memberList);
    }

    // ===================================================================================
    //                                                                          Load Honke
    //                                                                          ==========
    // #for_now jflute load本家、ちょっと頑張れば自動化できそうだけど... (2025/03/20)
    private void loadMemberStatus(ListResultBean<ResolaMember> memberList) {
        // 会員一覧が持っている会員ステータスコードの一覧を取得 (検索用)
        // split側にはMemberStatusの区分値が存在しないので、codeで変換するしかない。
        // (split側で区分値定義すると定義が冗長になるので)
        List<CDef.MemberStatus> cdefList = memberList.extractColumnList(member -> {
            String memberStatusCode = member.getMemberStatusCode();
            return CDef.MemberStatus.of(memberStatusCode).orElseThrow(); // 絶対にズレてないこと前提
        });

        // 関連する会員ステータスだけ検索してきて...
        Map<String, MemberStatus> statusMap = memberStatusBhv.selectList(cb -> {
            cb.query().setMemberStatusCode_InScope_AsMemberStatus(cdefList);
        }).stream().collect(Collectors.toMap(mb -> mb.getMemberStatusCode(), mb -> mb));

        // 会員一覧に会員ステータスを関連付ける
        for (ResolaMember member : memberList) {
            MemberStatus status = statusMap.get(member.getMemberStatusCode());
            if (status == null) { // 業務的に必ず存在するはず
                throw new IllegalStateException("Not found the status: member=" + member);
            }
            member.setMemberStatus(OptionalEntity.of(status));
        }
    }

    private void loadProduct(List<ResolaPurchase> purchaseList) {
        // 購入一覧が持っている商品IDの一覧を取得 (検索用)
        List<Integer> productIdList = purchaseList.stream().map(pur -> {
            return pur.getProductId();
        }).distinct().collect(Collectors.toList());

        // 関連する商品だけ検索してきて...
        Map<Integer, Product> productMap = productBhv.selectList(cb -> {
            cb.query().setProductId_InScope(productIdList);
        }).stream().collect(Collectors.toMap(bean -> bean.getProductId(), bean -> bean));

        // 購入一覧に商品を関連付ける
        for (ResolaPurchase purchase : purchaseList) {
            Product product = productMap.get(purchase.getProductId()); // 業務的に必ず存在するはず
            if (product == null) { // 業務的に必ず存在するはず
                throw new IllegalStateException("Not found the product: purchase=" + purchase);
            }
            purchase.setProduct(OptionalEntity.of(product));
        }
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private void mappingToResult(List<? extends UnifiedMember> memberList) {
        for (UnifiedMember member : memberList) {
            String memberName = member.getMemberName();
            LocalDate birthdate = member.getBirthdate();
            MemberStatus status = member.getMemberStatus().get();
            UnifiedMemberSecurity security = member.getUnifiedMemberSecurityAsOne().get();

            String memberStatusName = status.getMemberStatusName();
            String reminderQuestion = security.getReminderQuestion();

            // dummy, only show log
            log(memberName, birthdate, memberStatusName, reminderQuestion);
            List<? extends UnifiedPurchase> purchaseList = member.getUnifiedPurchaseList();
            for (UnifiedPurchase purchase : purchaseList) {
                Product product = purchase.getProduct().get();
                log("  " + purchase.getPurchaseDatetime(), purchase.getPurchasePrice(), product.getProductName());
                List<PurchasePayment> paymentList = purchase.getPurchasePaymentList();
                for (PurchasePayment payment : paymentList) {
                    log("    " + payment.getPaymentMethodCodeName());
                }
            }
        }
    }
}
