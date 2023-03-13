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
 * The entity of WHITE_BASE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBase extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** BASE_ID: {PK, NotNull, INTEGER(10)} */
    protected Integer _baseId;

    /** BASE_NAME: {NotNull, VARCHAR(200)} */
    protected String _baseName;

    /** SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} */
    protected Integer _seaId;

    /** LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND} */
    protected Integer _landId;

    /** PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI} */
    protected Integer _piariId;

    /** BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO} */
    protected Integer _bonvoId;

    /** DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE} */
    protected Integer _dstoreId;

    /** AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA} */
    protected Integer _ambaId;

    /** MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO} */
    protected Integer _miracoId;

    /** DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL} */
    protected Integer _dohotelId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_BASE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_baseId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'. */
    protected OptionalEntity<WhiteBaseOne06Amba> _whiteBaseOne06Amba;

    /**
     * [get] WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne06Amba'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne06Amba> getWhiteBaseOne06Amba() {
        if (_whiteBaseOne06Amba == null) { _whiteBaseOne06Amba = OptionalEntity.relationEmpty(this, "whiteBaseOne06Amba"); }
        return _whiteBaseOne06Amba;
    }

    /**
     * [set] WHITE_BASE_ONE06_AMBA by my AMBA_ID, named 'whiteBaseOne06Amba'.
     * @param whiteBaseOne06Amba The entity of foreign property 'whiteBaseOne06Amba'. (NullAllowed)
     */
    public void setWhiteBaseOne06Amba(OptionalEntity<WhiteBaseOne06Amba> whiteBaseOne06Amba) {
        _whiteBaseOne06Amba = whiteBaseOne06Amba;
    }

    /** WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'. */
    protected OptionalEntity<WhiteBaseOne04Bonvo> _whiteBaseOne04Bonvo;

    /**
     * [get] WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne04Bonvo'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne04Bonvo> getWhiteBaseOne04Bonvo() {
        if (_whiteBaseOne04Bonvo == null) { _whiteBaseOne04Bonvo = OptionalEntity.relationEmpty(this, "whiteBaseOne04Bonvo"); }
        return _whiteBaseOne04Bonvo;
    }

    /**
     * [set] WHITE_BASE_ONE04_BONVO by my BONVO_ID, named 'whiteBaseOne04Bonvo'.
     * @param whiteBaseOne04Bonvo The entity of foreign property 'whiteBaseOne04Bonvo'. (NullAllowed)
     */
    public void setWhiteBaseOne04Bonvo(OptionalEntity<WhiteBaseOne04Bonvo> whiteBaseOne04Bonvo) {
        _whiteBaseOne04Bonvo = whiteBaseOne04Bonvo;
    }

    /** WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'. */
    protected OptionalEntity<WhiteBaseOne05Dstore> _whiteBaseOne05Dstore;

    /**
     * [get] WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne05Dstore'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne05Dstore> getWhiteBaseOne05Dstore() {
        if (_whiteBaseOne05Dstore == null) { _whiteBaseOne05Dstore = OptionalEntity.relationEmpty(this, "whiteBaseOne05Dstore"); }
        return _whiteBaseOne05Dstore;
    }

    /**
     * [set] WHITE_BASE_ONE05_DSTORE by my DSTORE_ID, named 'whiteBaseOne05Dstore'.
     * @param whiteBaseOne05Dstore The entity of foreign property 'whiteBaseOne05Dstore'. (NullAllowed)
     */
    public void setWhiteBaseOne05Dstore(OptionalEntity<WhiteBaseOne05Dstore> whiteBaseOne05Dstore) {
        _whiteBaseOne05Dstore = whiteBaseOne05Dstore;
    }

    /** WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'. */
    protected OptionalEntity<WhiteBaseOne02Land> _whiteBaseOne02Land;

    /**
     * [get] WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne02Land'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne02Land> getWhiteBaseOne02Land() {
        if (_whiteBaseOne02Land == null) { _whiteBaseOne02Land = OptionalEntity.relationEmpty(this, "whiteBaseOne02Land"); }
        return _whiteBaseOne02Land;
    }

    /**
     * [set] WHITE_BASE_ONE02_LAND by my LAND_ID, named 'whiteBaseOne02Land'.
     * @param whiteBaseOne02Land The entity of foreign property 'whiteBaseOne02Land'. (NullAllowed)
     */
    public void setWhiteBaseOne02Land(OptionalEntity<WhiteBaseOne02Land> whiteBaseOne02Land) {
        _whiteBaseOne02Land = whiteBaseOne02Land;
    }

    /** WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'. */
    protected OptionalEntity<WhiteBaseOne07Miraco> _whiteBaseOne07Miraco;

    /**
     * [get] WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne07Miraco'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne07Miraco> getWhiteBaseOne07Miraco() {
        if (_whiteBaseOne07Miraco == null) { _whiteBaseOne07Miraco = OptionalEntity.relationEmpty(this, "whiteBaseOne07Miraco"); }
        return _whiteBaseOne07Miraco;
    }

    /**
     * [set] WHITE_BASE_ONE07_MIRACO by my MIRACO_ID, named 'whiteBaseOne07Miraco'.
     * @param whiteBaseOne07Miraco The entity of foreign property 'whiteBaseOne07Miraco'. (NullAllowed)
     */
    public void setWhiteBaseOne07Miraco(OptionalEntity<WhiteBaseOne07Miraco> whiteBaseOne07Miraco) {
        _whiteBaseOne07Miraco = whiteBaseOne07Miraco;
    }

    /** WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'. */
    protected OptionalEntity<WhiteBaseOne03Piari> _whiteBaseOne03Piari;

    /**
     * [get] WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne03Piari'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne03Piari> getWhiteBaseOne03Piari() {
        if (_whiteBaseOne03Piari == null) { _whiteBaseOne03Piari = OptionalEntity.relationEmpty(this, "whiteBaseOne03Piari"); }
        return _whiteBaseOne03Piari;
    }

    /**
     * [set] WHITE_BASE_ONE03_PIARI by my PIARI_ID, named 'whiteBaseOne03Piari'.
     * @param whiteBaseOne03Piari The entity of foreign property 'whiteBaseOne03Piari'. (NullAllowed)
     */
    public void setWhiteBaseOne03Piari(OptionalEntity<WhiteBaseOne03Piari> whiteBaseOne03Piari) {
        _whiteBaseOne03Piari = whiteBaseOne03Piari;
    }

    /** WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'. */
    protected OptionalEntity<WhiteBaseOne01Sea> _whiteBaseOne01Sea;

    /**
     * [get] WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne01Sea'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne01Sea> getWhiteBaseOne01Sea() {
        if (_whiteBaseOne01Sea == null) { _whiteBaseOne01Sea = OptionalEntity.relationEmpty(this, "whiteBaseOne01Sea"); }
        return _whiteBaseOne01Sea;
    }

    /**
     * [set] WHITE_BASE_ONE01_SEA by my SEA_ID, named 'whiteBaseOne01Sea'.
     * @param whiteBaseOne01Sea The entity of foreign property 'whiteBaseOne01Sea'. (NullAllowed)
     */
    public void setWhiteBaseOne01Sea(OptionalEntity<WhiteBaseOne01Sea> whiteBaseOne01Sea) {
        _whiteBaseOne01Sea = whiteBaseOne01Sea;
    }

    /** WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'. */
    protected OptionalEntity<WhiteBaseOne08Dohotel> _whiteBaseOne08Dohotel;

    /**
     * [get] WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteBaseOne08Dohotel'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne08Dohotel> getWhiteBaseOne08Dohotel() {
        if (_whiteBaseOne08Dohotel == null) { _whiteBaseOne08Dohotel = OptionalEntity.relationEmpty(this, "whiteBaseOne08Dohotel"); }
        return _whiteBaseOne08Dohotel;
    }

    /**
     * [set] WHITE_BASE_ONE08_DOHOTEL by my DOHOTEL_ID, named 'whiteBaseOne08Dohotel'.
     * @param whiteBaseOne08Dohotel The entity of foreign property 'whiteBaseOne08Dohotel'. (NullAllowed)
     */
    public void setWhiteBaseOne08Dohotel(OptionalEntity<WhiteBaseOne08Dohotel> whiteBaseOne08Dohotel) {
        _whiteBaseOne08Dohotel = whiteBaseOne08Dohotel;
    }

    /** WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'. */
    protected OptionalEntity<WhiteBaseOne09Palm> _whiteBaseOne09PalmAsOne;

    /**
     * [get] WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteBaseOne09PalmAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne09Palm> getWhiteBaseOne09PalmAsOne() {
        if (_whiteBaseOne09PalmAsOne == null) { _whiteBaseOne09PalmAsOne = OptionalEntity.relationEmpty(this, "whiteBaseOne09PalmAsOne"); }
        return _whiteBaseOne09PalmAsOne;
    }

    /**
     * [set] WHITE_BASE_ONE09_PALM by BASE_ID, named 'whiteBaseOne09PalmAsOne'.
     * @param whiteBaseOne09PalmAsOne The entity of foreign property(referrer-as-one) 'whiteBaseOne09PalmAsOne'. (NullAllowed)
     */
    public void setWhiteBaseOne09PalmAsOne(OptionalEntity<WhiteBaseOne09Palm> whiteBaseOne09PalmAsOne) {
        _whiteBaseOne09PalmAsOne = whiteBaseOne09PalmAsOne;
    }

    /** WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'. */
    protected OptionalEntity<WhiteBaseOne10Celeb> _whiteBaseOne10CelebAsOne;

    /**
     * [get] WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteBaseOne10CelebAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne10Celeb> getWhiteBaseOne10CelebAsOne() {
        if (_whiteBaseOne10CelebAsOne == null) { _whiteBaseOne10CelebAsOne = OptionalEntity.relationEmpty(this, "whiteBaseOne10CelebAsOne"); }
        return _whiteBaseOne10CelebAsOne;
    }

    /**
     * [set] WHITE_BASE_ONE10_CELEB by BASE_ID, named 'whiteBaseOne10CelebAsOne'.
     * @param whiteBaseOne10CelebAsOne The entity of foreign property(referrer-as-one) 'whiteBaseOne10CelebAsOne'. (NullAllowed)
     */
    public void setWhiteBaseOne10CelebAsOne(OptionalEntity<WhiteBaseOne10Celeb> whiteBaseOne10CelebAsOne) {
        _whiteBaseOne10CelebAsOne = whiteBaseOne10CelebAsOne;
    }

    /** WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'. */
    protected OptionalEntity<WhiteBaseOne11Cirque> _whiteBaseOne11CirqueAsOne;

    /**
     * [get] WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteBaseOne11CirqueAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne11Cirque> getWhiteBaseOne11CirqueAsOne() {
        if (_whiteBaseOne11CirqueAsOne == null) { _whiteBaseOne11CirqueAsOne = OptionalEntity.relationEmpty(this, "whiteBaseOne11CirqueAsOne"); }
        return _whiteBaseOne11CirqueAsOne;
    }

    /**
     * [set] WHITE_BASE_ONE11_CIRQUE by CIRQUE_ID, named 'whiteBaseOne11CirqueAsOne'.
     * @param whiteBaseOne11CirqueAsOne The entity of foreign property(referrer-as-one) 'whiteBaseOne11CirqueAsOne'. (NullAllowed)
     */
    public void setWhiteBaseOne11CirqueAsOne(OptionalEntity<WhiteBaseOne11Cirque> whiteBaseOne11CirqueAsOne) {
        _whiteBaseOne11CirqueAsOne = whiteBaseOne11CirqueAsOne;
    }

    /** WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'. */
    protected OptionalEntity<WhiteBaseOne12Amphi> _whiteBaseOne12AmphiAsOne;

    /**
     * [get] WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'whiteBaseOne12AmphiAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<WhiteBaseOne12Amphi> getWhiteBaseOne12AmphiAsOne() {
        if (_whiteBaseOne12AmphiAsOne == null) { _whiteBaseOne12AmphiAsOne = OptionalEntity.relationEmpty(this, "whiteBaseOne12AmphiAsOne"); }
        return _whiteBaseOne12AmphiAsOne;
    }

    /**
     * [set] WHITE_BASE_ONE12_AMPHI by BASE_ID, named 'whiteBaseOne12AmphiAsOne'.
     * @param whiteBaseOne12AmphiAsOne The entity of foreign property(referrer-as-one) 'whiteBaseOne12AmphiAsOne'. (NullAllowed)
     */
    public void setWhiteBaseOne12AmphiAsOne(OptionalEntity<WhiteBaseOne12Amphi> whiteBaseOne12AmphiAsOne) {
        _whiteBaseOne12AmphiAsOne = whiteBaseOne12AmphiAsOne;
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
        if (obj instanceof BsWhiteBase) {
            BsWhiteBase other = (BsWhiteBase)obj;
            if (!xSV(_baseId, other._baseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _baseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne06Amba != null && _whiteBaseOne06Amba.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne06Amba, "whiteBaseOne06Amba")); }
        if (_whiteBaseOne04Bonvo != null && _whiteBaseOne04Bonvo.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne04Bonvo, "whiteBaseOne04Bonvo")); }
        if (_whiteBaseOne05Dstore != null && _whiteBaseOne05Dstore.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne05Dstore, "whiteBaseOne05Dstore")); }
        if (_whiteBaseOne02Land != null && _whiteBaseOne02Land.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne02Land, "whiteBaseOne02Land")); }
        if (_whiteBaseOne07Miraco != null && _whiteBaseOne07Miraco.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne07Miraco, "whiteBaseOne07Miraco")); }
        if (_whiteBaseOne03Piari != null && _whiteBaseOne03Piari.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne03Piari, "whiteBaseOne03Piari")); }
        if (_whiteBaseOne01Sea != null && _whiteBaseOne01Sea.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne01Sea, "whiteBaseOne01Sea")); }
        if (_whiteBaseOne08Dohotel != null && _whiteBaseOne08Dohotel.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne08Dohotel, "whiteBaseOne08Dohotel")); }
        if (_whiteBaseOne09PalmAsOne != null && _whiteBaseOne09PalmAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne09PalmAsOne, "whiteBaseOne09PalmAsOne")); }
        if (_whiteBaseOne10CelebAsOne != null && _whiteBaseOne10CelebAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne10CelebAsOne, "whiteBaseOne10CelebAsOne")); }
        if (_whiteBaseOne11CirqueAsOne != null && _whiteBaseOne11CirqueAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne11CirqueAsOne, "whiteBaseOne11CirqueAsOne")); }
        if (_whiteBaseOne12AmphiAsOne != null && _whiteBaseOne12AmphiAsOne.isPresent())
        { sb.append(li).append(xbRDS(_whiteBaseOne12AmphiAsOne, "whiteBaseOne12AmphiAsOne")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_baseId));
        sb.append(dm).append(xfND(_baseName));
        sb.append(dm).append(xfND(_seaId));
        sb.append(dm).append(xfND(_landId));
        sb.append(dm).append(xfND(_piariId));
        sb.append(dm).append(xfND(_bonvoId));
        sb.append(dm).append(xfND(_dstoreId));
        sb.append(dm).append(xfND(_ambaId));
        sb.append(dm).append(xfND(_miracoId));
        sb.append(dm).append(xfND(_dohotelId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteBaseOne06Amba != null && _whiteBaseOne06Amba.isPresent())
        { sb.append(dm).append("whiteBaseOne06Amba"); }
        if (_whiteBaseOne04Bonvo != null && _whiteBaseOne04Bonvo.isPresent())
        { sb.append(dm).append("whiteBaseOne04Bonvo"); }
        if (_whiteBaseOne05Dstore != null && _whiteBaseOne05Dstore.isPresent())
        { sb.append(dm).append("whiteBaseOne05Dstore"); }
        if (_whiteBaseOne02Land != null && _whiteBaseOne02Land.isPresent())
        { sb.append(dm).append("whiteBaseOne02Land"); }
        if (_whiteBaseOne07Miraco != null && _whiteBaseOne07Miraco.isPresent())
        { sb.append(dm).append("whiteBaseOne07Miraco"); }
        if (_whiteBaseOne03Piari != null && _whiteBaseOne03Piari.isPresent())
        { sb.append(dm).append("whiteBaseOne03Piari"); }
        if (_whiteBaseOne01Sea != null && _whiteBaseOne01Sea.isPresent())
        { sb.append(dm).append("whiteBaseOne01Sea"); }
        if (_whiteBaseOne08Dohotel != null && _whiteBaseOne08Dohotel.isPresent())
        { sb.append(dm).append("whiteBaseOne08Dohotel"); }
        if (_whiteBaseOne09PalmAsOne != null && _whiteBaseOne09PalmAsOne.isPresent())
        { sb.append(dm).append("whiteBaseOne09PalmAsOne"); }
        if (_whiteBaseOne10CelebAsOne != null && _whiteBaseOne10CelebAsOne.isPresent())
        { sb.append(dm).append("whiteBaseOne10CelebAsOne"); }
        if (_whiteBaseOne11CirqueAsOne != null && _whiteBaseOne11CirqueAsOne.isPresent())
        { sb.append(dm).append("whiteBaseOne11CirqueAsOne"); }
        if (_whiteBaseOne12AmphiAsOne != null && _whiteBaseOne12AmphiAsOne.isPresent())
        { sb.append(dm).append("whiteBaseOne12AmphiAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteBase clone() {
        return (WhiteBase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BASE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBaseId() {
        checkSpecifiedProperty("baseId");
        return _baseId;
    }

    /**
     * [set] BASE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Integer baseId) {
        registerModifiedProperty("baseId");
        _baseId = baseId;
    }

    /**
     * [get] BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'BASE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getBaseName() {
        checkSpecifiedProperty("baseName");
        return convertEmptyToNull(_baseName);
    }

    /**
     * [set] BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param baseName The value of the column 'BASE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setBaseName(String baseName) {
        registerModifiedProperty("baseName");
        _baseName = baseName;
    }

    /**
     * [get] SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @return The value of the column 'SEA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSeaId() {
        checkSpecifiedProperty("seaId");
        return _seaId;
    }

    /**
     * [set] SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @param seaId The value of the column 'SEA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeaId(Integer seaId) {
        registerModifiedProperty("seaId");
        _seaId = seaId;
    }

    /**
     * [get] LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND} <br>
     * @return The value of the column 'LAND_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getLandId() {
        checkSpecifiedProperty("landId");
        return _landId;
    }

    /**
     * [set] LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND} <br>
     * @param landId The value of the column 'LAND_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLandId(Integer landId) {
        registerModifiedProperty("landId");
        _landId = landId;
    }

    /**
     * [get] PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI} <br>
     * @return The value of the column 'PIARI_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPiariId() {
        checkSpecifiedProperty("piariId");
        return _piariId;
    }

    /**
     * [set] PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI} <br>
     * @param piariId The value of the column 'PIARI_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPiariId(Integer piariId) {
        registerModifiedProperty("piariId");
        _piariId = piariId;
    }

    /**
     * [get] BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO} <br>
     * @return The value of the column 'BONVO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBonvoId() {
        checkSpecifiedProperty("bonvoId");
        return _bonvoId;
    }

    /**
     * [set] BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO} <br>
     * @param bonvoId The value of the column 'BONVO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBonvoId(Integer bonvoId) {
        registerModifiedProperty("bonvoId");
        _bonvoId = bonvoId;
    }

    /**
     * [get] DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE} <br>
     * @return The value of the column 'DSTORE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDstoreId() {
        checkSpecifiedProperty("dstoreId");
        return _dstoreId;
    }

    /**
     * [set] DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE} <br>
     * @param dstoreId The value of the column 'DSTORE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDstoreId(Integer dstoreId) {
        registerModifiedProperty("dstoreId");
        _dstoreId = dstoreId;
    }

    /**
     * [get] AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA} <br>
     * @return The value of the column 'AMBA_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAmbaId() {
        checkSpecifiedProperty("ambaId");
        return _ambaId;
    }

    /**
     * [set] AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA} <br>
     * @param ambaId The value of the column 'AMBA_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAmbaId(Integer ambaId) {
        registerModifiedProperty("ambaId");
        _ambaId = ambaId;
    }

    /**
     * [get] MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO} <br>
     * @return The value of the column 'MIRACO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMiracoId() {
        checkSpecifiedProperty("miracoId");
        return _miracoId;
    }

    /**
     * [set] MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO} <br>
     * @param miracoId The value of the column 'MIRACO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMiracoId(Integer miracoId) {
        registerModifiedProperty("miracoId");
        _miracoId = miracoId;
    }

    /**
     * [get] DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL} <br>
     * @return The value of the column 'DOHOTEL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDohotelId() {
        checkSpecifiedProperty("dohotelId");
        return _dohotelId;
    }

    /**
     * [set] DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL} <br>
     * @param dohotelId The value of the column 'DOHOTEL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDohotelId(Integer dohotelId) {
        registerModifiedProperty("dohotelId");
        _dohotelId = dohotelId;
    }
}
