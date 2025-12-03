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
 * The entity of (オンパレードれふ)WHITE_ON_PARADE_REF as TABLE. <br>
 * shalias:{ オンパレードREF } dfalias:{ オンパレードれふ }
 * <pre>
 * [primary-key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REF_NAME, NULLABLE_FK_ON_PARADE_ID, NULLABLE_FK_TO_MANY_ID
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
 *     WHITE_ON_PARADE, WHITE_ON_PARADE_NULLABLE_TO_MANY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteOnParade, whiteOnParadeNullableToMany
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refId = entity.getRefId();
 * String refName = entity.getRefName();
 * Long nullableFkOnParadeId = entity.getNullableFkOnParadeId();
 * Long nullableFkToManyId = entity.getNullableFkToManyId();
 * entity.setRefId(refId);
 * entity.setRefName(refName);
 * entity.setNullableFkOnParadeId(nullableFkOnParadeId);
 * entity.setNullableFkToManyId(nullableFkToManyId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnParadeRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _refId;

    /** REF_NAME: {NotNull, VARCHAR(100)} */
    protected String _refName;

    /** NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE} */
    protected Long _nullableFkOnParadeId;

    /** NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY} */
    protected Long _nullableFkToManyId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_ON_PARADE_REF";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_refId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'. */
    protected OptionalEntity<WhiteOnParade> _whiteOnParade;

    /**
     * [get] WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteOnParade'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteOnParade> getWhiteOnParade() {
        if (_whiteOnParade == null) { _whiteOnParade = OptionalEntity.relationEmpty(this, "whiteOnParade"); }
        return _whiteOnParade;
    }

    /**
     * [set] WHITE_ON_PARADE by my NULLABLE_FK_ON_PARADE_ID, named 'whiteOnParade'.
     * @param whiteOnParade The entity of foreign property 'whiteOnParade'. (NullAllowed)
     */
    public void setWhiteOnParade(OptionalEntity<WhiteOnParade> whiteOnParade) {
        _whiteOnParade = whiteOnParade;
    }

    /** WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'. */
    protected OptionalEntity<WhiteOnParadeNullableToMany> _whiteOnParadeNullableToMany;

    /**
     * [get] WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteOnParadeNullableToMany'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteOnParadeNullableToMany> getWhiteOnParadeNullableToMany() {
        if (_whiteOnParadeNullableToMany == null) { _whiteOnParadeNullableToMany = OptionalEntity.relationEmpty(this, "whiteOnParadeNullableToMany"); }
        return _whiteOnParadeNullableToMany;
    }

    /**
     * [set] WHITE_ON_PARADE_NULLABLE_TO_MANY by my NULLABLE_FK_TO_MANY_ID, named 'whiteOnParadeNullableToMany'.
     * @param whiteOnParadeNullableToMany The entity of foreign property 'whiteOnParadeNullableToMany'. (NullAllowed)
     */
    public void setWhiteOnParadeNullableToMany(OptionalEntity<WhiteOnParadeNullableToMany> whiteOnParadeNullableToMany) {
        _whiteOnParadeNullableToMany = whiteOnParadeNullableToMany;
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
        if (obj instanceof BsWhiteOnParadeRef) {
            BsWhiteOnParadeRef other = (BsWhiteOnParadeRef)obj;
            if (!xSV(_refId, other._refId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _refId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnParade != null && _whiteOnParade.isPresent())
        { sb.append(li).append(xbRDS(_whiteOnParade, "whiteOnParade")); }
        if (_whiteOnParadeNullableToMany != null && _whiteOnParadeNullableToMany.isPresent())
        { sb.append(li).append(xbRDS(_whiteOnParadeNullableToMany, "whiteOnParadeNullableToMany")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refId));
        sb.append(dm).append(xfND(_refName));
        sb.append(dm).append(xfND(_nullableFkOnParadeId));
        sb.append(dm).append(xfND(_nullableFkToManyId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnParade != null && _whiteOnParade.isPresent())
        { sb.append(dm).append("whiteOnParade"); }
        if (_whiteOnParadeNullableToMany != null && _whiteOnParadeNullableToMany.isPresent())
        { sb.append(dm).append("whiteOnParadeNullableToMany"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteOnParadeRef clone() {
        return (WhiteOnParadeRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefId() {
        checkSpecifiedProperty("refId");
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Long refId) {
        registerModifiedProperty("refId");
        _refId = refId;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefName() {
        checkSpecifiedProperty("refName");
        return convertEmptyToNull(_refName);
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR(100)} <br>
     * @param refName The value of the column 'REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefName(String refName) {
        registerModifiedProperty("refName");
        _refName = refName;
    }

    /**
     * [get] NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE} <br>
     * @return The value of the column 'NULLABLE_FK_ON_PARADE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNullableFkOnParadeId() {
        checkSpecifiedProperty("nullableFkOnParadeId");
        return _nullableFkOnParadeId;
    }

    /**
     * [set] NULLABLE_FK_ON_PARADE_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE} <br>
     * @param nullableFkOnParadeId The value of the column 'NULLABLE_FK_ON_PARADE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableFkOnParadeId(Long nullableFkOnParadeId) {
        registerModifiedProperty("nullableFkOnParadeId");
        _nullableFkOnParadeId = nullableFkOnParadeId;
    }

    /**
     * [get] NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY} <br>
     * @return The value of the column 'NULLABLE_FK_TO_MANY_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNullableFkToManyId() {
        checkSpecifiedProperty("nullableFkToManyId");
        return _nullableFkToManyId;
    }

    /**
     * [set] NULLABLE_FK_TO_MANY_ID: {IX, DECIMAL(16), FK to WHITE_ON_PARADE_NULLABLE_TO_MANY} <br>
     * @param nullableFkToManyId The value of the column 'NULLABLE_FK_TO_MANY_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableFkToManyId(Long nullableFkToManyId) {
        registerModifiedProperty("nullableFkToManyId");
        _nullableFkToManyId = nullableFkToManyId;
    }
}
