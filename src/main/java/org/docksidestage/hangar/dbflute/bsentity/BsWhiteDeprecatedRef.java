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
package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_DEPRECATED_REF as TABLE. <br>
 * #deprecated test of deprecated referrer &lt;br&gt; is HTML test
 * <pre>
 * [primary-key]
 *     DEPRECATED_REF_ID
 *
 * [column]
 *     DEPRECATED_REF_ID, DEPRECATED_ID, DEPRECATED_REF_NAME, DEPRECATED_REF_CODE, PRODUCT_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     WHITE_DEPRECATED, PRODUCT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteDeprecated, product
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long deprecatedRefId = entity.getDeprecatedRefId();
 * Long deprecatedId = entity.getDeprecatedId();
 * String deprecatedRefName = entity.getDeprecatedRefName();
 * String deprecatedRefCode = entity.getDeprecatedRefCode();
 * Integer productId = entity.getProductId();
 * entity.setDeprecatedRefId(deprecatedRefId);
 * entity.setDeprecatedId(deprecatedId);
 * entity.setDeprecatedRefName(deprecatedRefName);
 * entity.setDeprecatedRefCode(deprecatedRefCode);
 * entity.setProductId(productId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _deprecatedRefId;

    /** DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} */
    protected Long _deprecatedId;

    /** DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} */
    protected String _deprecatedRefName;

    /** DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} */
    protected String _deprecatedRefCode;

    /** PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT} */
    protected Integer _productId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DEPRECATED_REF";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_deprecatedRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (非推奨テスト)WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'. */
    protected OptionalEntity<WhiteDeprecated> _whiteDeprecated;

    /**
     * [get] (非推奨テスト)WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteDeprecated'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteDeprecated> getWhiteDeprecated() {
        if (_whiteDeprecated == null) { _whiteDeprecated = OptionalEntity.relationEmpty(this, "whiteDeprecated"); }
        return _whiteDeprecated;
    }

    /**
     * [set] (非推奨テスト)WHITE_DEPRECATED by my DEPRECATED_ID, named 'whiteDeprecated'.
     * @param whiteDeprecated The entity of foreign property 'whiteDeprecated'. (NullAllowed)
     */
    public void setWhiteDeprecated(OptionalEntity<WhiteDeprecated> whiteDeprecated) {
        _whiteDeprecated = whiteDeprecated;
    }

    /** (眠い商品)PRODUCT by my PRODUCT_ID, named 'product'. */
    protected OptionalEntity<Product> _product;

    /**
     * [get] (眠い商品)PRODUCT by my PRODUCT_ID, named 'product'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'product'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Product> getProduct() {
        if (_product == null) { _product = OptionalEntity.relationEmpty(this, "product"); }
        return _product;
    }

    /**
     * [set] (眠い商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (NullAllowed)
     */
    public void setProduct(OptionalEntity<Product> product) {
        _product = product;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteDeprecatedRef) {
            BsWhiteDeprecatedRef other = (BsWhiteDeprecatedRef)obj;
            if (!xSV(_deprecatedRefId, other._deprecatedRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _deprecatedRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteDeprecated != null && _whiteDeprecated.isPresent())
        { sb.append(li).append(xbRDS(_whiteDeprecated, "whiteDeprecated")); }
        if (_product != null && _product.isPresent())
        { sb.append(li).append(xbRDS(_product, "product")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deprecatedRefId));
        sb.append(dm).append(xfND(_deprecatedId));
        sb.append(dm).append(xfND(_deprecatedRefName));
        sb.append(dm).append(xfND(_deprecatedRefCode));
        sb.append(dm).append(xfND(_productId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteDeprecated != null && _whiteDeprecated.isPresent())
        { sb.append(dm).append("whiteDeprecated"); }
        if (_product != null && _product.isPresent())
        { sb.append(dm).append("product"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteDeprecatedRef clone() {
        return (WhiteDeprecatedRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DEPRECATED_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeprecatedRefId() {
        checkSpecifiedProperty("deprecatedRefId");
        return _deprecatedRefId;
    }

    /**
     * [set] DEPRECATED_REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param deprecatedRefId The value of the column 'DEPRECATED_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedRefId(Long deprecatedRefId) {
        registerModifiedProperty("deprecatedRefId");
        _deprecatedRefId = deprecatedRefId;
    }

    /**
     * [get] DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} <br>
     * @return The value of the column 'DEPRECATED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDeprecatedId() {
        checkSpecifiedProperty("deprecatedId");
        return _deprecatedId;
    }

    /**
     * [set] DEPRECATED_ID: {IX, NotNull, DECIMAL(16), FK to WHITE_DEPRECATED} <br>
     * @param deprecatedId The value of the column 'DEPRECATED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedId(Long deprecatedId) {
        registerModifiedProperty("deprecatedId");
        _deprecatedId = deprecatedId;
    }

    /**
     * [get] DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DEPRECATED_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedRefName() {
        checkSpecifiedProperty("deprecatedRefName");
        return convertEmptyToNull(_deprecatedRefName);
    }

    /**
     * [set] DEPRECATED_REF_NAME: {NotNull, VARCHAR(200)} <br>
     * @param deprecatedRefName The value of the column 'DEPRECATED_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedRefName(String deprecatedRefName) {
        registerModifiedProperty("deprecatedRefName");
        _deprecatedRefName = deprecatedRefName;
    }

    /**
     * [get] DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * @return The value of the column 'DEPRECATED_REF_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedRefCode() {
        checkSpecifiedProperty("deprecatedRefCode");
        return convertEmptyToNull(_deprecatedRefCode);
    }

    /**
     * [set] DEPRECATED_REF_CODE: {NotNull, VARCHAR(16)} <br>
     * @param deprecatedRefCode The value of the column 'DEPRECATED_REF_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setDeprecatedRefCode(String deprecatedRefCode) {
        registerModifiedProperty("deprecatedRefCode");
        _deprecatedRefCode = deprecatedRefCode;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT} <br>
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, INTEGER(10), FK to PRODUCT} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }
}
