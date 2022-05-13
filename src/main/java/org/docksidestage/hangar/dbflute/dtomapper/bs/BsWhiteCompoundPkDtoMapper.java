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
 * The DTO mapper of WHITE_COMPOUND_PK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PK_FIRST_ID, PK_SECOND_ID
 *
 * [column]
 *     PK_FIRST_ID, PK_SECOND_ID, COMPOUND_PK_NAME, REFERRED_ID
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
 *     WHITE_COMPOUND_PK_REF_PHYSICAL, WHITE_COMPOUND_PK_REF_VIRTURL
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     whiteCompoundPkRefPhysicalList, whiteCompoundPkRefVirturlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkDtoMapper implements DtoMapper<WhiteCompoundPk, WhiteCompoundPkDto>, Serializable {

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
    protected boolean _suppressWhiteCompoundPkRefPhysicalList;
    protected boolean _suppressWhiteCompoundPkRefVirturlList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteCompoundPkDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteCompoundPkDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteCompoundPkDto mappingToDto(WhiteCompoundPk entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteCompoundPkDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteCompoundPkDto dto = new WhiteCompoundPkDto();
        dto.setPkFirstId(entity.getPkFirstId());
        dto.setPkSecondId(entity.getPkSecondId());
        dto.setCompoundPkName(entity.getCompoundPkName());
        dto.setReferredId(entity.getReferredId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteCompoundPkRefPhysicalList && !entity.getWhiteCompoundPkRefPhysicalList().isEmpty()) {
            WhiteCompoundPkRefPhysicalDtoMapper mapper = new WhiteCompoundPkRefPhysicalDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteCompoundPk();
            List<WhiteCompoundPkRefPhysicalDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteCompoundPkRefPhysicalList());
            dto.setWhiteCompoundPkRefPhysicalList(relationDtoList);
            if (reverseReference) {
                for (WhiteCompoundPkRefPhysicalDto relationDto : relationDtoList) {
                    relationDto.setWhiteCompoundPk(dto);
                }
            }
        };
        if (!_suppressWhiteCompoundPkRefVirturlList && !entity.getWhiteCompoundPkRefVirturlList().isEmpty()) {
            WhiteCompoundPkRefVirturlDtoMapper mapper = new WhiteCompoundPkRefVirturlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteCompoundPk();
            List<WhiteCompoundPkRefVirturlDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteCompoundPkRefVirturlList());
            dto.setWhiteCompoundPkRefVirturlList(relationDtoList);
            if (reverseReference) {
                for (WhiteCompoundPkRefVirturlDto relationDto : relationDtoList) {
                    relationDto.setWhiteCompoundPk(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteCompoundPkDto> mappingToDtoList(List<WhiteCompoundPk> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteCompoundPkDto> dtoList = new ArrayList<WhiteCompoundPkDto>();
        for (WhiteCompoundPk entity : entityList) {
            WhiteCompoundPkDto dto = mappingToDto(entity);
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
    public WhiteCompoundPk mappingToEntity(WhiteCompoundPkDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteCompoundPk)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteCompoundPk entity = new WhiteCompoundPk();
        if (needsMapping(dto, dto.getPkFirstId(), "pkFirstId")) {
            entity.setPkFirstId(dto.getPkFirstId());
        }
        if (needsMapping(dto, dto.getPkSecondId(), "pkSecondId")) {
            entity.setPkSecondId(dto.getPkSecondId());
        }
        if (needsMapping(dto, dto.getCompoundPkName(), "compoundPkName")) {
            entity.setCompoundPkName(dto.getCompoundPkName());
        }
        if (needsMapping(dto, dto.getReferredId(), "referredId")) {
            entity.setReferredId(dto.getReferredId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteCompoundPkRefPhysicalList && !dto.getWhiteCompoundPkRefPhysicalList().isEmpty()) {
            WhiteCompoundPkRefPhysicalDtoMapper mapper = new WhiteCompoundPkRefPhysicalDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteCompoundPk();
            List<WhiteCompoundPkRefPhysical> relationEntityList = mapper.mappingToEntityList(dto.getWhiteCompoundPkRefPhysicalList());
            entity.setWhiteCompoundPkRefPhysicalList(relationEntityList);
            if (reverseReference) {
                for (WhiteCompoundPkRefPhysical relationEntity : relationEntityList) {
                    relationEntity.setWhiteCompoundPk(OptionalEntity.of(entity));
                }
            }
        };
        if (!_suppressWhiteCompoundPkRefVirturlList && !dto.getWhiteCompoundPkRefVirturlList().isEmpty()) {
            WhiteCompoundPkRefVirturlDtoMapper mapper = new WhiteCompoundPkRefVirturlDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteCompoundPk();
            List<WhiteCompoundPkRefVirturl> relationEntityList = mapper.mappingToEntityList(dto.getWhiteCompoundPkRefVirturlList());
            entity.setWhiteCompoundPkRefVirturlList(relationEntityList);
            if (reverseReference) {
                for (WhiteCompoundPkRefVirturl relationEntity : relationEntityList) {
                    relationEntity.setWhiteCompoundPk(OptionalEntity.of(entity));
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
    protected boolean needsMapping(WhiteCompoundPkDto dto, Object value, String propName) {
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
    public List<WhiteCompoundPk> mappingToEntityList(List<WhiteCompoundPkDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteCompoundPk> entityList = new ArrayList<WhiteCompoundPk>();
        for (WhiteCompoundPkDto dto : dtoList) {
            WhiteCompoundPk entity = mappingToEntity(dto);
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
    public void suppressWhiteCompoundPkRefPhysicalList() {
        _suppressWhiteCompoundPkRefPhysicalList = true;
    }
    public void suppressWhiteCompoundPkRefVirturlList() {
        _suppressWhiteCompoundPkRefVirturlList = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteCompoundPkRefPhysicalList();
        suppressWhiteCompoundPkRefVirturlList();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteCompoundPkRefPhysicalList = false;
        _suppressWhiteCompoundPkRefVirturlList = false;
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
    public WhiteCompoundPkDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteCompoundPkDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteCompoundPkDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteCompoundPkDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteCompoundPkDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteCompoundPkDtoMapper)this;
    }
}
