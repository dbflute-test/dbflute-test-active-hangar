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
 * The DTO mapper of WHITE_SELF_REFERENCE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     WHITE_SELF_REFERENCE
 *
 * [referrer-table]
 *     WHITE_SELF_REFERENCE
 *
 * [foreign-property]
 *     whiteSelfReferenceSelf
 *
 * [referrer-property]
 *     whiteSelfReferenceSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceDtoMapper implements DtoMapper<WhiteSelfReference, WhiteSelfReferenceDto>, Serializable {

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
    protected boolean _suppressWhiteSelfReferenceSelf;
    protected boolean _suppressWhiteSelfReferenceSelfList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSelfReferenceDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteSelfReferenceDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteSelfReferenceDto mappingToDto(WhiteSelfReference entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteSelfReferenceDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteSelfReferenceDto dto = new WhiteSelfReferenceDto();
        dto.setSelfReferenceId(entity.getSelfReferenceId());
        dto.setSelfReferenceName(entity.getSelfReferenceName());
        dto.setParentId(entity.getParentId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteSelfReferenceSelf && entity.getWhiteSelfReferenceSelf().isPresent()) {
            WhiteSelfReference relationEntity = entity.getWhiteSelfReferenceSelf().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteSelfReferenceDto relationDto = (WhiteSelfReferenceDto)cachedDto;
                dto.setWhiteSelfReferenceSelf(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteSelfReferenceSelfList().add(dto);
                }
            } else {
                WhiteSelfReferenceDtoMapper mapper = new WhiteSelfReferenceDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteSelfReferenceSelfList();
                WhiteSelfReferenceDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteSelfReferenceSelf(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteSelfReferenceSelfList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteSelfReferenceSelf());
                }
            }
        };
        if (!_suppressWhiteSelfReferenceSelfList && !entity.getWhiteSelfReferenceSelfList().isEmpty()) {
            WhiteSelfReferenceDtoMapper mapper = new WhiteSelfReferenceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteSelfReferenceSelf();
            List<WhiteSelfReferenceDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteSelfReferenceSelfList());
            dto.setWhiteSelfReferenceSelfList(relationDtoList);
            if (reverseReference) {
                for (WhiteSelfReferenceDto relationDto : relationDtoList) {
                    relationDto.setWhiteSelfReferenceSelf(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteSelfReferenceDto> mappingToDtoList(List<WhiteSelfReference> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteSelfReferenceDto> dtoList = new ArrayList<WhiteSelfReferenceDto>();
        for (WhiteSelfReference entity : entityList) {
            WhiteSelfReferenceDto dto = mappingToDto(entity);
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
    public WhiteSelfReference mappingToEntity(WhiteSelfReferenceDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteSelfReference)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteSelfReference entity = new WhiteSelfReference();
        if (needsMapping(dto, dto.getSelfReferenceId(), "selfReferenceId")) {
            entity.setSelfReferenceId(dto.getSelfReferenceId());
        }
        if (needsMapping(dto, dto.getSelfReferenceName(), "selfReferenceName")) {
            entity.setSelfReferenceName(dto.getSelfReferenceName());
        }
        if (needsMapping(dto, dto.getParentId(), "parentId")) {
            entity.setParentId(dto.getParentId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteSelfReferenceSelf && dto.getWhiteSelfReferenceSelf() != null) {
            WhiteSelfReferenceDto relationDto = dto.getWhiteSelfReferenceSelf();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteSelfReference relationEntity = (WhiteSelfReference)cachedEntity;
                entity.setWhiteSelfReferenceSelf(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteSelfReferenceSelfList().add(entity);
                }
            } else {
                WhiteSelfReferenceDtoMapper mapper = new WhiteSelfReferenceDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteSelfReferenceSelfList();
                WhiteSelfReference relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteSelfReferenceSelf(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteSelfReferenceSelfList().add(entity);
                }
                if (instanceCache && entity.getWhiteSelfReferenceSelf().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteSelfReferenceSelf().get());
                }
            }
        };
        if (!_suppressWhiteSelfReferenceSelfList && !dto.getWhiteSelfReferenceSelfList().isEmpty()) {
            WhiteSelfReferenceDtoMapper mapper = new WhiteSelfReferenceDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteSelfReferenceSelf();
            List<WhiteSelfReference> relationEntityList = mapper.mappingToEntityList(dto.getWhiteSelfReferenceSelfList());
            entity.setWhiteSelfReferenceSelfList(relationEntityList);
            if (reverseReference) {
                for (WhiteSelfReference relationEntity : relationEntityList) {
                    relationEntity.setWhiteSelfReferenceSelf(OptionalEntity.of(entity));
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
    protected boolean needsMapping(WhiteSelfReferenceDto dto, Object value, String propName) {
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
    public List<WhiteSelfReference> mappingToEntityList(List<WhiteSelfReferenceDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteSelfReference> entityList = new ArrayList<WhiteSelfReference>();
        for (WhiteSelfReferenceDto dto : dtoList) {
            WhiteSelfReference entity = mappingToEntity(dto);
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
    public void suppressWhiteSelfReferenceSelf() {
        _suppressWhiteSelfReferenceSelf = true;
    }
    public void suppressWhiteSelfReferenceSelfList() {
        _suppressWhiteSelfReferenceSelfList = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteSelfReferenceSelf();
        suppressWhiteSelfReferenceSelfList();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteSelfReferenceSelf = false;
        _suppressWhiteSelfReferenceSelfList = false;
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
    public WhiteSelfReferenceDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteSelfReferenceDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteSelfReferenceDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteSelfReferenceDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteSelfReferenceDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteSelfReferenceDtoMapper)this;
    }
}
