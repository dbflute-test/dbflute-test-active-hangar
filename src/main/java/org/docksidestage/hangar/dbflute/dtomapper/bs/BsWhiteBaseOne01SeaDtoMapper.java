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
 * The DTO mapper of WHITE_BASE_ONE01_SEA as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SEA_ID
 *
 * [column]
 *     SEA_ID, SEA_NAME, BROADWAY_ID, DOCKSIDE_ID
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
 *     WHITE_BASE_ONE01_SEA_BROADWAY, WHITE_BASE_ONE01_SEA_DOCKSIDE, WHITE_BASE_ONE01_SEA_HANGAR(AsOne)
 *
 * [referrer-table]
 *     WHITE_BASE, WHITE_BASE_ONE01_SEA_MAGICLAMP, WHITE_BASE_ONE01_SEA_HANGAR
 *
 * [foreign-property]
 *     whiteBaseOne01SeaBroadway, whiteBaseOne01SeaDockside, whiteBaseOne01SeaHangarAsOne
 *
 * [referrer-property]
 *     whiteBaseList, whiteBaseOne01SeaMagiclampList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01SeaDtoMapper implements DtoMapper<WhiteBaseOne01Sea, WhiteBaseOne01SeaDto>, Serializable {

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
    protected boolean _suppressWhiteBaseOne01SeaBroadway;
    protected boolean _suppressWhiteBaseOne01SeaDockside;
    protected boolean _suppressWhiteBaseList;
    protected boolean _suppressWhiteBaseOne01SeaHangarAsOne;
    protected boolean _suppressWhiteBaseOne01SeaMagiclampList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteBaseOne01SeaDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteBaseOne01SeaDto mappingToDto(WhiteBaseOne01Sea entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteBaseOne01SeaDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne01SeaDto dto = new WhiteBaseOne01SeaDto();
        dto.setSeaId(entity.getSeaId());
        dto.setSeaName(entity.getSeaName());
        dto.setBroadwayId(entity.getBroadwayId());
        dto.setDocksideId(entity.getDocksideId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne01SeaBroadway && entity.getWhiteBaseOne01SeaBroadway().isPresent()) {
            WhiteBaseOne01SeaBroadway relationEntity = entity.getWhiteBaseOne01SeaBroadway().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne01SeaBroadwayDto relationDto = (WhiteBaseOne01SeaBroadwayDto)cachedDto;
                dto.setWhiteBaseOne01SeaBroadway(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne01SeaList().add(dto);
                }
            } else {
                WhiteBaseOne01SeaBroadwayDtoMapper mapper = new WhiteBaseOne01SeaBroadwayDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01SeaList();
                WhiteBaseOne01SeaBroadwayDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne01SeaBroadway(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne01SeaList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne01SeaBroadway());
                }
            }
        };
        if (!_suppressWhiteBaseOne01SeaDockside && entity.getWhiteBaseOne01SeaDockside().isPresent()) {
            WhiteBaseOne01SeaDockside relationEntity = entity.getWhiteBaseOne01SeaDockside().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne01SeaDocksideDto relationDto = (WhiteBaseOne01SeaDocksideDto)cachedDto;
                dto.setWhiteBaseOne01SeaDockside(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne01SeaList().add(dto);
                }
            } else {
                WhiteBaseOne01SeaDocksideDtoMapper mapper = new WhiteBaseOne01SeaDocksideDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01SeaList();
                WhiteBaseOne01SeaDocksideDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne01SeaDockside(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne01SeaList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne01SeaDockside());
                }
            }
        };
        if (!_suppressWhiteBaseList && !entity.getWhiteBaseList().isEmpty()) {
            WhiteBaseDtoMapper mapper = new WhiteBaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteBaseOne01Sea();
            List<WhiteBaseDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteBaseList());
            dto.setWhiteBaseList(relationDtoList);
            if (reverseReference) {
                for (WhiteBaseDto relationDto : relationDtoList) {
                    relationDto.setWhiteBaseOne01Sea(dto);
                }
            }
        };
        if (!_suppressWhiteBaseOne01SeaHangarAsOne && entity.getWhiteBaseOne01SeaHangarAsOne().isPresent()) {
            WhiteBaseOne01SeaHangar relationEntity = entity.getWhiteBaseOne01SeaHangarAsOne().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne01SeaHangarDto relationDto = (WhiteBaseOne01SeaHangarDto)cachedDto;
                dto.setWhiteBaseOne01SeaHangarAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBaseOne01Sea(dto);
                }
            } else {
                WhiteBaseOne01SeaHangarDtoMapper mapper = new WhiteBaseOne01SeaHangarDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01Sea();
                WhiteBaseOne01SeaHangarDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne01SeaHangarAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBaseOne01Sea(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne01SeaHangarAsOne());
                }
            }
        };
        if (!_suppressWhiteBaseOne01SeaMagiclampList && !entity.getWhiteBaseOne01SeaMagiclampList().isEmpty()) {
            WhiteBaseOne01SeaMagiclampDtoMapper mapper = new WhiteBaseOne01SeaMagiclampDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteBaseOne01Sea();
            List<WhiteBaseOne01SeaMagiclampDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteBaseOne01SeaMagiclampList());
            dto.setWhiteBaseOne01SeaMagiclampList(relationDtoList);
            if (reverseReference) {
                for (WhiteBaseOne01SeaMagiclampDto relationDto : relationDtoList) {
                    relationDto.setWhiteBaseOne01Sea(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteBaseOne01SeaDto> mappingToDtoList(List<WhiteBaseOne01Sea> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteBaseOne01SeaDto> dtoList = new ArrayList<WhiteBaseOne01SeaDto>();
        for (WhiteBaseOne01Sea entity : entityList) {
            WhiteBaseOne01SeaDto dto = mappingToDto(entity);
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
    public WhiteBaseOne01Sea mappingToEntity(WhiteBaseOne01SeaDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteBaseOne01Sea)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne01Sea entity = new WhiteBaseOne01Sea();
        if (needsMapping(dto, dto.getSeaId(), "seaId")) {
            entity.setSeaId(dto.getSeaId());
        }
        if (needsMapping(dto, dto.getSeaName(), "seaName")) {
            entity.setSeaName(dto.getSeaName());
        }
        if (needsMapping(dto, dto.getBroadwayId(), "broadwayId")) {
            entity.setBroadwayId(dto.getBroadwayId());
        }
        if (needsMapping(dto, dto.getDocksideId(), "docksideId")) {
            entity.setDocksideId(dto.getDocksideId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne01SeaBroadway && dto.getWhiteBaseOne01SeaBroadway() != null) {
            WhiteBaseOne01SeaBroadwayDto relationDto = dto.getWhiteBaseOne01SeaBroadway();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne01SeaBroadway relationEntity = (WhiteBaseOne01SeaBroadway)cachedEntity;
                entity.setWhiteBaseOne01SeaBroadway(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne01SeaList().add(entity);
                }
            } else {
                WhiteBaseOne01SeaBroadwayDtoMapper mapper = new WhiteBaseOne01SeaBroadwayDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01SeaList();
                WhiteBaseOne01SeaBroadway relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne01SeaBroadway(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne01SeaList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne01SeaBroadway().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne01SeaBroadway().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne01SeaDockside && dto.getWhiteBaseOne01SeaDockside() != null) {
            WhiteBaseOne01SeaDocksideDto relationDto = dto.getWhiteBaseOne01SeaDockside();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne01SeaDockside relationEntity = (WhiteBaseOne01SeaDockside)cachedEntity;
                entity.setWhiteBaseOne01SeaDockside(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne01SeaList().add(entity);
                }
            } else {
                WhiteBaseOne01SeaDocksideDtoMapper mapper = new WhiteBaseOne01SeaDocksideDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01SeaList();
                WhiteBaseOne01SeaDockside relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne01SeaDockside(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne01SeaList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne01SeaDockside().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne01SeaDockside().get());
                }
            }
        };
        if (!_suppressWhiteBaseList && !dto.getWhiteBaseList().isEmpty()) {
            WhiteBaseDtoMapper mapper = new WhiteBaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteBaseOne01Sea();
            List<WhiteBase> relationEntityList = mapper.mappingToEntityList(dto.getWhiteBaseList());
            entity.setWhiteBaseList(relationEntityList);
            if (reverseReference) {
                for (WhiteBase relationEntity : relationEntityList) {
                    relationEntity.setWhiteBaseOne01Sea(OptionalEntity.of(entity));
                }
            }
        };
        if (!_suppressWhiteBaseOne01SeaHangarAsOne && dto.getWhiteBaseOne01SeaHangarAsOne() != null) {
            WhiteBaseOne01SeaHangarDto relationDto = dto.getWhiteBaseOne01SeaHangarAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne01SeaHangar relationEntity = (WhiteBaseOne01SeaHangar)cachedEntity;
                entity.setWhiteBaseOne01SeaHangarAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBaseOne01Sea(OptionalEntity.of(entity));
                }
            } else {
                WhiteBaseOne01SeaHangarDtoMapper mapper = new WhiteBaseOne01SeaHangarDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01Sea();
                WhiteBaseOne01SeaHangar relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne01SeaHangarAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBaseOne01Sea(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getWhiteBaseOne01SeaHangarAsOne().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne01SeaHangarAsOne().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne01SeaMagiclampList && !dto.getWhiteBaseOne01SeaMagiclampList().isEmpty()) {
            WhiteBaseOne01SeaMagiclampDtoMapper mapper = new WhiteBaseOne01SeaMagiclampDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteBaseOne01Sea();
            List<WhiteBaseOne01SeaMagiclamp> relationEntityList = mapper.mappingToEntityList(dto.getWhiteBaseOne01SeaMagiclampList());
            entity.setWhiteBaseOne01SeaMagiclampList(relationEntityList);
            if (reverseReference) {
                for (WhiteBaseOne01SeaMagiclamp relationEntity : relationEntityList) {
                    relationEntity.setWhiteBaseOne01Sea(OptionalEntity.of(entity));
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
    protected boolean needsMapping(WhiteBaseOne01SeaDto dto, Object value, String propName) {
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
    public List<WhiteBaseOne01Sea> mappingToEntityList(List<WhiteBaseOne01SeaDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteBaseOne01Sea> entityList = new ArrayList<WhiteBaseOne01Sea>();
        for (WhiteBaseOne01SeaDto dto : dtoList) {
            WhiteBaseOne01Sea entity = mappingToEntity(dto);
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
    public void suppressWhiteBaseOne01SeaBroadway() {
        _suppressWhiteBaseOne01SeaBroadway = true;
    }
    public void suppressWhiteBaseOne01SeaDockside() {
        _suppressWhiteBaseOne01SeaDockside = true;
    }
    public void suppressWhiteBaseList() {
        _suppressWhiteBaseList = true;
    }
    public void suppressWhiteBaseOne01SeaHangarAsOne() {
        _suppressWhiteBaseOne01SeaHangarAsOne = true;
    }
    public void suppressWhiteBaseOne01SeaMagiclampList() {
        _suppressWhiteBaseOne01SeaMagiclampList = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteBaseOne01SeaBroadway();
        suppressWhiteBaseOne01SeaDockside();
        suppressWhiteBaseList();
        suppressWhiteBaseOne01SeaHangarAsOne();
        suppressWhiteBaseOne01SeaMagiclampList();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteBaseOne01SeaBroadway = false;
        _suppressWhiteBaseOne01SeaDockside = false;
        _suppressWhiteBaseList = false;
        _suppressWhiteBaseOne01SeaHangarAsOne = false;
        _suppressWhiteBaseOne01SeaMagiclampList = false;
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
    public WhiteBaseOne01SeaDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteBaseOne01SeaDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteBaseOne01SeaDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteBaseOne01SeaDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteBaseOne01SeaDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteBaseOne01SeaDtoMapper)this;
    }
}
