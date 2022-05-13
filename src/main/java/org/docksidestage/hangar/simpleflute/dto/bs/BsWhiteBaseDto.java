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
package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;
import org.docksidestage.hangar.simpleflute.dto.*;

/**
 * The simple DTO of WHITE_BASE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, BASE_NAME, SEA_ID, LAND_ID, PIARI_ID, BONVO_ID, DSTORE_ID, AMBA_ID, MIRACO_ID, DOHOTEL_ID
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
 * [foreign-table]
 *     WHITE_BASE_ONE06_AMBA, WHITE_BASE_ONE04_BONVO, WHITE_BASE_ONE05_DSTORE, WHITE_BASE_ONE02_LAND, WHITE_BASE_ONE07_MIRACO, WHITE_BASE_ONE03_PIARI, WHITE_BASE_ONE01_SEA, WHITE_BASE_ONE08_DOHOTEL, WHITE_BASE_ONE09_PALM(AsOne), WHITE_BASE_ONE10_CELEB(AsOne), WHITE_BASE_ONE11_CIRQUE(AsOne), WHITE_BASE_ONE12_AMPHI(AsOne)
 *
 * [referrer-table]
 *     WHITE_BASE_ONE09_PALM, WHITE_BASE_ONE10_CELEB, WHITE_BASE_ONE11_CIRQUE, WHITE_BASE_ONE12_AMPHI
 *
 * [foreign-property]
 *     whiteBaseOne06Amba, whiteBaseOne04Bonvo, whiteBaseOne05Dstore, whiteBaseOne02Land, whiteBaseOne07Miraco, whiteBaseOne03Piari, whiteBaseOne01Sea, whiteBaseOne08Dohotel, whiteBaseOne09PalmAsOne, whiteBaseOne10CelebAsOne, whiteBaseOne11CirqueAsOne, whiteBaseOne12AmphiAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWhiteBaseDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BASE_ID: {PK, NotNull, INTEGER(10)} */
    @JsonKey
    protected Integer _baseId;

    /** BASE_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _baseName;

    /** SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} */
    @JsonKey
    protected Integer _seaId;

    /** LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND} */
    @JsonKey
    protected Integer _landId;

    /** PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI} */
    @JsonKey
    protected Integer _piariId;

    /** BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO} */
    @JsonKey
    protected Integer _bonvoId;

    /** DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE} */
    @JsonKey
    protected Integer _dstoreId;

    /** AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA} */
    @JsonKey
    protected Integer _ambaId;

    /** MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO} */
    @JsonKey
    protected Integer _miracoId;

    /** DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL} */
    @JsonKey
    protected Integer _dohotelId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected WhiteBaseOne06AmbaDto _whiteBaseOne06Amba;

    public WhiteBaseOne06AmbaDto getWhiteBaseOne06Amba() {
        return _whiteBaseOne06Amba;
    }

    public void setWhiteBaseOne06Amba(WhiteBaseOne06AmbaDto whiteBaseOne06Amba) {
        this._whiteBaseOne06Amba = whiteBaseOne06Amba;
    }

    protected WhiteBaseOne04BonvoDto _whiteBaseOne04Bonvo;

    public WhiteBaseOne04BonvoDto getWhiteBaseOne04Bonvo() {
        return _whiteBaseOne04Bonvo;
    }

    public void setWhiteBaseOne04Bonvo(WhiteBaseOne04BonvoDto whiteBaseOne04Bonvo) {
        this._whiteBaseOne04Bonvo = whiteBaseOne04Bonvo;
    }

    protected WhiteBaseOne05DstoreDto _whiteBaseOne05Dstore;

    public WhiteBaseOne05DstoreDto getWhiteBaseOne05Dstore() {
        return _whiteBaseOne05Dstore;
    }

    public void setWhiteBaseOne05Dstore(WhiteBaseOne05DstoreDto whiteBaseOne05Dstore) {
        this._whiteBaseOne05Dstore = whiteBaseOne05Dstore;
    }

    protected WhiteBaseOne02LandDto _whiteBaseOne02Land;

    public WhiteBaseOne02LandDto getWhiteBaseOne02Land() {
        return _whiteBaseOne02Land;
    }

    public void setWhiteBaseOne02Land(WhiteBaseOne02LandDto whiteBaseOne02Land) {
        this._whiteBaseOne02Land = whiteBaseOne02Land;
    }

    protected WhiteBaseOne07MiracoDto _whiteBaseOne07Miraco;

    public WhiteBaseOne07MiracoDto getWhiteBaseOne07Miraco() {
        return _whiteBaseOne07Miraco;
    }

    public void setWhiteBaseOne07Miraco(WhiteBaseOne07MiracoDto whiteBaseOne07Miraco) {
        this._whiteBaseOne07Miraco = whiteBaseOne07Miraco;
    }

    protected WhiteBaseOne03PiariDto _whiteBaseOne03Piari;

    public WhiteBaseOne03PiariDto getWhiteBaseOne03Piari() {
        return _whiteBaseOne03Piari;
    }

    public void setWhiteBaseOne03Piari(WhiteBaseOne03PiariDto whiteBaseOne03Piari) {
        this._whiteBaseOne03Piari = whiteBaseOne03Piari;
    }

    protected WhiteBaseOne01SeaDto _whiteBaseOne01Sea;

    public WhiteBaseOne01SeaDto getWhiteBaseOne01Sea() {
        return _whiteBaseOne01Sea;
    }

    public void setWhiteBaseOne01Sea(WhiteBaseOne01SeaDto whiteBaseOne01Sea) {
        this._whiteBaseOne01Sea = whiteBaseOne01Sea;
    }

    protected WhiteBaseOne08DohotelDto _whiteBaseOne08Dohotel;

    public WhiteBaseOne08DohotelDto getWhiteBaseOne08Dohotel() {
        return _whiteBaseOne08Dohotel;
    }

    public void setWhiteBaseOne08Dohotel(WhiteBaseOne08DohotelDto whiteBaseOne08Dohotel) {
        this._whiteBaseOne08Dohotel = whiteBaseOne08Dohotel;
    }

    protected WhiteBaseOne09PalmDto _whiteBaseOne09PalmAsOne;

    public WhiteBaseOne09PalmDto getWhiteBaseOne09PalmAsOne() {
        return _whiteBaseOne09PalmAsOne;
    }

    public void setWhiteBaseOne09PalmAsOne(WhiteBaseOne09PalmDto whiteBaseOne09PalmAsOne) {
        this._whiteBaseOne09PalmAsOne = whiteBaseOne09PalmAsOne;
    }

    protected WhiteBaseOne10CelebDto _whiteBaseOne10CelebAsOne;

    public WhiteBaseOne10CelebDto getWhiteBaseOne10CelebAsOne() {
        return _whiteBaseOne10CelebAsOne;
    }

    public void setWhiteBaseOne10CelebAsOne(WhiteBaseOne10CelebDto whiteBaseOne10CelebAsOne) {
        this._whiteBaseOne10CelebAsOne = whiteBaseOne10CelebAsOne;
    }

    protected WhiteBaseOne11CirqueDto _whiteBaseOne11CirqueAsOne;

    public WhiteBaseOne11CirqueDto getWhiteBaseOne11CirqueAsOne() {
        return _whiteBaseOne11CirqueAsOne;
    }

    public void setWhiteBaseOne11CirqueAsOne(WhiteBaseOne11CirqueDto whiteBaseOne11CirqueAsOne) {
        this._whiteBaseOne11CirqueAsOne = whiteBaseOne11CirqueAsOne;
    }

    protected WhiteBaseOne12AmphiDto _whiteBaseOne12AmphiAsOne;

    public WhiteBaseOne12AmphiDto getWhiteBaseOne12AmphiAsOne() {
        return _whiteBaseOne12AmphiAsOne;
    }

    public void setWhiteBaseOne12AmphiAsOne(WhiteBaseOne12AmphiDto whiteBaseOne12AmphiAsOne) {
        this._whiteBaseOne12AmphiAsOne = whiteBaseOne12AmphiAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteBaseDto)) { return false; }
        final BsWhiteBaseDto otherEntity = (BsWhiteBaseDto)other;
        if (!helpComparingValue(getBaseId(), otherEntity.getBaseId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_BASE");
        result = xCH(result, getBaseId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getBaseId());
        sb.append(c).append(getBaseName());
        sb.append(c).append(getSeaId());
        sb.append(c).append(getLandId());
        sb.append(c).append(getPiariId());
        sb.append(c).append(getBonvoId());
        sb.append(c).append(getDstoreId());
        sb.append(c).append(getAmbaId());
        sb.append(c).append(getMiracoId());
        sb.append(c).append(getDohotelId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BASE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @return The value of the column 'BASE_ID'. (NullAllowed)
     */
    public Integer getBaseId() {
        return _baseId;
    }

    /**
     * [set] BASE_ID: {PK, NotNull, INTEGER(10)} <br>
     * @param baseId The value of the column 'BASE_ID'. (NullAllowed)
     */
    public void setBaseId(Integer baseId) {
        __modifiedProperties.add("baseId");
        this._baseId = baseId;
    }

    /**
     * [get] BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'BASE_NAME'. (NullAllowed)
     */
    public String getBaseName() {
        return _baseName;
    }

    /**
     * [set] BASE_NAME: {NotNull, VARCHAR(200)} <br>
     * @param baseName The value of the column 'BASE_NAME'. (NullAllowed)
     */
    public void setBaseName(String baseName) {
        __modifiedProperties.add("baseName");
        this._baseName = baseName;
    }

    /**
     * [get] SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @return The value of the column 'SEA_ID'. (NullAllowed)
     */
    public Integer getSeaId() {
        return _seaId;
    }

    /**
     * [set] SEA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE01_SEA} <br>
     * @param seaId The value of the column 'SEA_ID'. (NullAllowed)
     */
    public void setSeaId(Integer seaId) {
        __modifiedProperties.add("seaId");
        this._seaId = seaId;
    }

    /**
     * [get] LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND} <br>
     * @return The value of the column 'LAND_ID'. (NullAllowed)
     */
    public Integer getLandId() {
        return _landId;
    }

    /**
     * [set] LAND_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE02_LAND} <br>
     * @param landId The value of the column 'LAND_ID'. (NullAllowed)
     */
    public void setLandId(Integer landId) {
        __modifiedProperties.add("landId");
        this._landId = landId;
    }

    /**
     * [get] PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI} <br>
     * @return The value of the column 'PIARI_ID'. (NullAllowed)
     */
    public Integer getPiariId() {
        return _piariId;
    }

    /**
     * [set] PIARI_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE03_PIARI} <br>
     * @param piariId The value of the column 'PIARI_ID'. (NullAllowed)
     */
    public void setPiariId(Integer piariId) {
        __modifiedProperties.add("piariId");
        this._piariId = piariId;
    }

    /**
     * [get] BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO} <br>
     * @return The value of the column 'BONVO_ID'. (NullAllowed)
     */
    public Integer getBonvoId() {
        return _bonvoId;
    }

    /**
     * [set] BONVO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE04_BONVO} <br>
     * @param bonvoId The value of the column 'BONVO_ID'. (NullAllowed)
     */
    public void setBonvoId(Integer bonvoId) {
        __modifiedProperties.add("bonvoId");
        this._bonvoId = bonvoId;
    }

    /**
     * [get] DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE} <br>
     * @return The value of the column 'DSTORE_ID'. (NullAllowed)
     */
    public Integer getDstoreId() {
        return _dstoreId;
    }

    /**
     * [set] DSTORE_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE05_DSTORE} <br>
     * @param dstoreId The value of the column 'DSTORE_ID'. (NullAllowed)
     */
    public void setDstoreId(Integer dstoreId) {
        __modifiedProperties.add("dstoreId");
        this._dstoreId = dstoreId;
    }

    /**
     * [get] AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA} <br>
     * @return The value of the column 'AMBA_ID'. (NullAllowed)
     */
    public Integer getAmbaId() {
        return _ambaId;
    }

    /**
     * [set] AMBA_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE06_AMBA} <br>
     * @param ambaId The value of the column 'AMBA_ID'. (NullAllowed)
     */
    public void setAmbaId(Integer ambaId) {
        __modifiedProperties.add("ambaId");
        this._ambaId = ambaId;
    }

    /**
     * [get] MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO} <br>
     * @return The value of the column 'MIRACO_ID'. (NullAllowed)
     */
    public Integer getMiracoId() {
        return _miracoId;
    }

    /**
     * [set] MIRACO_ID: {IX, INTEGER(10), FK to WHITE_BASE_ONE07_MIRACO} <br>
     * @param miracoId The value of the column 'MIRACO_ID'. (NullAllowed)
     */
    public void setMiracoId(Integer miracoId) {
        __modifiedProperties.add("miracoId");
        this._miracoId = miracoId;
    }

    /**
     * [get] DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL} <br>
     * @return The value of the column 'DOHOTEL_ID'. (NullAllowed)
     */
    public Integer getDohotelId() {
        return _dohotelId;
    }

    /**
     * [set] DOHOTEL_ID: {INTEGER(10), FK to WHITE_BASE_ONE08_DOHOTEL} <br>
     * @param dohotelId The value of the column 'DOHOTEL_ID'. (NullAllowed)
     */
    public void setDohotelId(Integer dohotelId) {
        __modifiedProperties.add("dohotelId");
        this._dohotelId = dohotelId;
    }

}
