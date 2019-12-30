package org.docksidestage.hangar.dbflute.cbean.nss;

import org.docksidestage.hangar.dbflute.cbean.cq.PurchaseCQ;

/**
 * The nest select set-upper of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PurchaseCQ _query;
    public PurchaseNss(PurchaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductNss withProduct() {
        _query.xdoNss(() -> _query.queryProduct());
        return new ProductNss(_query.queryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SUMMARY_PRODUCT by my PRODUCT_ID, named 'summaryProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SummaryProductNss withSummaryProduct() {
        _query.xdoNss(() -> _query.querySummaryProduct());
        return new SummaryProductNss(_query.querySummaryProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * WHITE_DATE_TERM by my , named 'whiteDateTermAsValid'.
     */
    public void withWhiteDateTermAsValid() {
        _query.xdoNss(() -> _query.queryWhiteDateTermAsValid());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (会員ログイン)MEMBER_LOGIN by my MEMBER_ID, named 'memberLoginAsBizManyToOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberLoginNss withMemberLoginAsBizManyToOne() {
        _query.xdoNss(() -> _query.queryMemberLoginAsBizManyToOne());
        return new MemberLoginNss(_query.queryMemberLoginAsBizManyToOne());
    }
}
