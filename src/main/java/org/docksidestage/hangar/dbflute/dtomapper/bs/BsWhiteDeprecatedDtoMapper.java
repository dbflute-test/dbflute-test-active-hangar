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
import org.dbflute.optional.OptionalEntity;
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
 * The DTO mapper of (非推奨テスト)WHITE_DEPRECATED as TABLE. <br>
 * コメントがある場合<br>
 * #deprecated test of deprecated
 * <pre>
 * [primary-key]
 *     DEPRECATED_ID
 *
 * [column]
 *     DEPRECATED_ID, DEPRECATED_NAME, DEPRECATED_CODE
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
 *     WHITE_DEPRECATED_REF
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteDeprecatedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedDtoMapper implements DtoMapper<WhiteDeprecated, WhiteDeprecatedDto>, Serializable {

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
    protected boolean _suppressWhiteDeprecatedRefList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteDeprecatedDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteDeprecatedDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteDeprecatedDto mappingToDto(WhiteDeprecated entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteDeprecatedDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteDeprecatedDto dto = new WhiteDeprecatedDto();
        dto.setDeprecatedId(entity.getDeprecatedId());
        dto.setDeprecatedName(entity.getDeprecatedName());
        dto.setDeprecatedCode(entity.getDeprecatedCode());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteDeprecatedRefList && !entity.getWhiteDeprecatedRefList().isEmpty()) {
            WhiteDeprecatedRefDtoMapper mapper = new WhiteDeprecatedRefDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteDeprecated();
            List<WhiteDeprecatedRefDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteDeprecatedRefList());
            dto.setWhiteDeprecatedRefList(relationDtoList);
            if (reverseReference) {
                for (WhiteDeprecatedRefDto relationDto : relationDtoList) {
                    relationDto.setWhiteDeprecated(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteDeprecatedDto> mappingToDtoList(List<WhiteDeprecated> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteDeprecatedDto> dtoList = new ArrayList<WhiteDeprecatedDto>();
        for (WhiteDeprecated entity : entityList) {
            WhiteDeprecatedDto dto = mappingToDto(entity);
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
    public WhiteDeprecated mappingToEntity(WhiteDeprecatedDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteDeprecated)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteDeprecated entity = new WhiteDeprecated();
        if (needsMapping(dto, dto.getDeprecatedId(), "deprecatedId")) {
            entity.setDeprecatedId(dto.getDeprecatedId());
        }
        if (needsMapping(dto, dto.getDeprecatedName(), "deprecatedName")) {
            entity.setDeprecatedName(dto.getDeprecatedName());
        }
        if (needsMapping(dto, dto.getDeprecatedCode(), "deprecatedCode")) {
            entity.setDeprecatedCode(dto.getDeprecatedCode());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteDeprecatedRefList && !dto.getWhiteDeprecatedRefList().isEmpty()) {
            WhiteDeprecatedRefDtoMapper mapper = new WhiteDeprecatedRefDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteDeprecated();
            List<WhiteDeprecatedRef> relationEntityList = mapper.mappingToEntityList(dto.getWhiteDeprecatedRefList());
            entity.setWhiteDeprecatedRefList(relationEntityList);
            if (reverseReference) {
                for (WhiteDeprecatedRef relationEntity : relationEntityList) {
                    relationEntity.setWhiteDeprecated(OptionalEntity.of(entity));
                }
            }
        };
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
    protected boolean needsMapping(WhiteDeprecatedDto dto, Object value, String propName) {
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
    public List<WhiteDeprecated> mappingToEntityList(List<WhiteDeprecatedDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteDeprecated> entityList = new ArrayList<WhiteDeprecated>();
        for (WhiteDeprecatedDto dto : dtoList) {
            WhiteDeprecated entity = mappingToEntity(dto);
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
    public void suppressWhiteDeprecatedRefList() {
        _suppressWhiteDeprecatedRefList = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteDeprecatedRefList();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteDeprecatedRefList = false;
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
    public WhiteDeprecatedDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteDeprecatedDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteDeprecatedDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteDeprecatedDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteDeprecatedDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteDeprecatedDtoMapper)this;
    }
}
