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
package org.docksidestage.hangar.dbflute.dtomapper.bs;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.InstanceKeyEntity;
import org.dbflute.dbmeta.dtomap.DtoMapper;
import org.dbflute.dbmeta.dtomap.InstanceKeyDto;
import org.dbflute.helper.beans.DfBeanDesc;
import org.dbflute.helper.beans.DfPropertyDesc;
import org.dbflute.helper.beans.factory.DfBeanDescFactory;
import org.dbflute.jdbc.Classification;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.simpleflute.dto.*;
import org.docksidestage.hangar.dbflute.dtomapper.*;

/**
 * The DTO mapper of (DBコメント追加的)WHITE_DB_COMMENT_ADDITIONAL as TABLE. <br>
 * まず一行目がこれで...<br>
 * 二行目に改行を入れてみたけど...<br>
 *   三行目は空白二つでインデントしてみた。<br>
 * <br>
 * 五行目の前に空行を開けた (つまり四行目が空行)<br>
 * テーブルコメントのエスケープのテスト...<br>
 * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/<br>
 * o (table)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ <br>
 * o (table)mapStyle, map:\{ sea \= mystic \; land \= oneman \} エスケープされてても大丈夫？ <br>
 * o (table)DBコメントで、ベタッと 'シングルクォーテーション' で囲うけど大丈夫？<br>
 * o (table)DBコメントで、ベタッと &lt;span&gt;HTMLタグ&lt;/span&gt; で囲うけど大丈夫？<br>
 * o (table)DBコメントで、ベタッと &amp;lt;HTMLエスケープ表現&amp;gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)<br>
 * o (table)あと、DBコメントは、"JavaDoc" でも使われるし、DBMetaで "文字列リテラル" で使われるけど大丈夫？<br>
 * o (table)なので、@author jflute とか入ってても大丈夫？ あと、改行 "\n" とか、エスケエスケ "\\" とか大丈夫？<br>
 * _/_/_/_/_/_/_/_/_/_/
 * <pre>
 * [primary-key]
 *     DB_COMMENT_ID
 *
 * [column]
 *     DB_COMMENT_ID, DB_COMMENT_NAME, DB_COMMENT_COUNT, DB_COMMENT_DATE, DB_COMMENT_DATETIME
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
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDbCommentAdditionalDtoMapper implements DtoMapper<WhiteDbCommentAdditional, WhiteDbCommentAdditionalDto>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<Entity, Object> _relationDtoMap;
    protected final Map<Object, Entity> _relationEntityMap;
    protected boolean _exceptCommonColumn;
    protected boolean _reverseReference; // default: one-way reference
    protected boolean _instanceCache = true; // default: cached

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDbCommentAdditionalDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteDbCommentAdditionalDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        _relationDtoMap = relationDtoMap;
        _relationEntityMap = relationEntityMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    // -----------------------------------------------------
    //                                                to DTO
    //                                                ------
    /**
     * {@inheritDoc}
     */
    public WhiteDbCommentAdditionalDto mappingToDto(WhiteDbCommentAdditional entity) {
        if (entity == null) {
            return null;
        }
        WhiteDbCommentAdditionalDto dto = new WhiteDbCommentAdditionalDto();
        dto.setDbCommentId(entity.getDbCommentId());
        dto.setDbCommentName(entity.getDbCommentName());
        dto.setDbCommentCount(entity.getDbCommentCount());
        dto.setDbCommentDate(entity.getDbCommentDate());
        dto.setDbCommentDatetime(entity.getDbCommentDatetime());
        reflectDerivedProperty(entity, dto, true);
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteDbCommentAdditionalDto> mappingToDtoList(List<WhiteDbCommentAdditional> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteDbCommentAdditionalDto> dtoList = new ArrayList<WhiteDbCommentAdditionalDto>();
        for (WhiteDbCommentAdditional entity : entityList) {
            WhiteDbCommentAdditionalDto dto = mappingToDto(entity);
            if (dto != null) {
                dtoList.add(dto);
            } else {
                if (isAcceptNullElementOnList()) {
                    dtoList.add(null);
                }
            }
        }
        return dtoList;
    }

    // -----------------------------------------------------
    //                                             to Entity
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    public WhiteDbCommentAdditional mappingToEntity(WhiteDbCommentAdditionalDto dto) {
        if (dto == null) {
            return null;
        }
        WhiteDbCommentAdditional entity = new WhiteDbCommentAdditional();
        if (needsMapping(dto, dto.getDbCommentId(), "dbCommentId")) {
            entity.setDbCommentId(dto.getDbCommentId());
        }
        if (needsMapping(dto, dto.getDbCommentName(), "dbCommentName")) {
            entity.setDbCommentName(dto.getDbCommentName());
        }
        if (needsMapping(dto, dto.getDbCommentCount(), "dbCommentCount")) {
            entity.setDbCommentCount(dto.getDbCommentCount());
        }
        if (needsMapping(dto, dto.getDbCommentDate(), "dbCommentDate")) {
            entity.setDbCommentDate(dto.getDbCommentDate());
        }
        if (needsMapping(dto, dto.getDbCommentDatetime(), "dbCommentDatetime")) {
            entity.setDbCommentDatetime(dto.getDbCommentDatetime());
        }
        reflectDerivedProperty(entity, dto, false);
        return entity;
    }

    /**
     * Does the property need to be mapped to an entity? <br>
     * If modified info of DTO has at least one property, only modified properties are mapped.
     * And if no property is modified, all properties are mapped (but the other option exists).
     * @param dto The instance of DTO. (NotNull)
     * @param value The value of DTO's property. (NotNull)
     * @param propName The property name of DTO. (NotNull)
     * @return The determination, true or false.
     */
    protected boolean needsMapping(WhiteDbCommentAdditionalDto dto, Object value, String propName) {
        Set<String> modifiedProperties = dto.mymodifiedProperties();
        if (modifiedProperties.isEmpty()) {
            return isMappingToEntityContainsNull() || value != null;
        }
        return modifiedProperties.contains(propName);
    }

    /**
     * Does the mapping to an entity contain null values? (when no property is modified) <br>
     * Default is true that means a setter is called if the value is null.
     * But this method is valid only when no property is modified.
     * @return The determination, true or false.
     */
    protected boolean isMappingToEntityContainsNull() { // for extension
        return true; // as default
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteDbCommentAdditional> mappingToEntityList(List<WhiteDbCommentAdditionalDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteDbCommentAdditional> entityList = new ArrayList<WhiteDbCommentAdditional>();
        for (WhiteDbCommentAdditionalDto dto : dtoList) {
            WhiteDbCommentAdditional entity = mappingToEntity(dto);
            if (entity != null) {
                entityList.add(entity);
            } else {
                if (isAcceptNullElementOnList()) {
                    entityList.add(null);
                }
            }
        }
        return entityList;
    }

    protected boolean isAcceptNullElementOnList() {
        return true; // as default
    }

    // -----------------------------------------------------
    //                                          Instance Key
    //                                          ------------
    protected Object createInstanceKeyDto(final Object dto, final int instanceHash) {
        return new InstanceKeyDto(dto, instanceHash);
    }

    protected InstanceKeyEntity createInstanceKeyEntity(Entity entity) {
        return new InstanceKeyEntity(entity);
    }

    public void disableInstanceCache() { // internal option
        _instanceCache = false;
    }

    // -----------------------------------------------------
    //                                      Derived Property
    //                                      ----------------
    protected void reflectDerivedProperty(Entity entity, Object dto, boolean toDto) {
        DfBeanDesc entityDesc = DfBeanDescFactory.getBeanDesc(entity.getClass());
        DfBeanDesc dtoDesc = DfBeanDescFactory.getBeanDesc(dto.getClass());
        DBMeta dbmeta = entity.asDBMeta();
        for (String propertyName : entityDesc.getProppertyNameList()) {
            if (isOutOfDerivedPropertyName(entity, dto, toDto, dbmeta, entityDesc, dtoDesc, propertyName)) {
                continue;
            }
            DfPropertyDesc entityProp = entityDesc.getPropertyDesc(propertyName);
            Class<?> propertyType = entityProp.getPropertyType();
            if (isOutOfDerivedPropertyType(entity, dto, toDto, propertyName, propertyType)) {
                continue;
            }
            if (entityProp.isReadable() && entityProp.isWritable()) {
                DfPropertyDesc dtoProp = dtoDesc.getPropertyDesc(propertyName);
                if (dtoProp.isReadable() && dtoProp.isWritable()) {
                    if (toDto) {
                        dtoProp.setValue(dto, entityProp.getValue(entity));
                    } else {
                        entityProp.setValue(entity, dtoProp.getValue(dto));
                    }
                }
            }
        }
    }

    protected boolean isOutOfDerivedPropertyName(Entity entity, Object dto, boolean toDto
                                               , DBMeta dbmeta, DfBeanDesc entityDesc, DfBeanDesc dtoDesc
                                               , String propertyName) {
        return dbmeta.hasColumn(propertyName)
                    || dbmeta.hasForeign(propertyName) || dbmeta.hasReferrer(propertyName)
                    || !dtoDesc.hasPropertyDesc(propertyName);
    }

    protected boolean isOutOfDerivedPropertyType(Entity entity, Object dto, boolean toDto
                                               , String propertyName, Class<?> propertyType) {
        return List.class.isAssignableFrom(propertyType)
                || Entity.class.isAssignableFrom(propertyType)
                || Classification.class.isAssignableFrom(propertyType);
    }

    // ===================================================================================
    //                                                                   Suppress Relation
    //                                                                   =================
    // (basically) to suppress infinity loop
    protected void doSuppressAll() { // internal
    }
    protected void doSuppressClear() { // internal
    }

    // ===================================================================================
    //                                                                      Mapping Option
    //                                                                      ==============
    /**
     * {@inheritDoc}
     */
    public void setBaseOnlyMapping(boolean baseOnlyMapping) {
        if (baseOnlyMapping) {
            doSuppressAll();
        } else {
            doSuppressClear();
        }
    }

    protected boolean isExceptCommonColumn() {
        return _exceptCommonColumn;
    }

    /**
     * {@inheritDoc}
     */
    public void setExceptCommonColumn(boolean exceptCommonColumn) {
        _exceptCommonColumn = exceptCommonColumn;
    }

    protected boolean isReverseReference() {
        return _reverseReference;
    }

    /**
     * {@inheritDoc}
     */
    public void setReverseReference(boolean reverseReference) {
        _reverseReference = reverseReference;
    }

    // -----------------------------------------------------
    //                                           Easy-to-Use
    //                                           -----------
    /**
     * Enable base-only mapping that means the mapping ignores all references.
     * @return this. (NotNull)
     */
    public WhiteDbCommentAdditionalDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteDbCommentAdditionalDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteDbCommentAdditionalDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteDbCommentAdditionalDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteDbCommentAdditionalDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteDbCommentAdditionalDtoMapper)this;
    }
}
