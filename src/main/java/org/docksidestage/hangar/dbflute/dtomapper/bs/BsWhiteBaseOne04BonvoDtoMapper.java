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
 * The DTO mapper of WHITE_BASE_ONE04_BONVO as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BONVO_ID
 *
 * [column]
 *     BONVO_ID, BONVO_NAME, PARKSIDE_ID, STATIONSIDE_ID
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
 *     WHITE_BASE_ONE04_BONVO_PARKSIDE, WHITE_BASE_ONE04_BONVO_STATIONSIDE
 *
 * [referrer-table]
 *     WHITE_BASE
 *
 * [foreign-property]
 *     whiteBaseOne04BonvoParkside, whiteBaseOne04BonvoStationside
 *
 * [referrer-property]
 *     whiteBaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne04BonvoDtoMapper implements DtoMapper<WhiteBaseOne04Bonvo, WhiteBaseOne04BonvoDto>, Serializable {

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
    protected boolean _suppressWhiteBaseOne04BonvoParkside;
    protected boolean _suppressWhiteBaseOne04BonvoStationside;
    protected boolean _suppressWhiteBaseList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne04BonvoDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteBaseOne04BonvoDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteBaseOne04BonvoDto mappingToDto(WhiteBaseOne04Bonvo entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteBaseOne04BonvoDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne04BonvoDto dto = new WhiteBaseOne04BonvoDto();
        dto.setBonvoId(entity.getBonvoId());
        dto.setBonvoName(entity.getBonvoName());
        dto.setParksideId(entity.getParksideId());
        dto.setStationsideId(entity.getStationsideId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne04BonvoParkside && entity.getWhiteBaseOne04BonvoParkside().isPresent()) {
            WhiteBaseOne04BonvoParkside relationEntity = entity.getWhiteBaseOne04BonvoParkside().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne04BonvoParksideDto relationDto = (WhiteBaseOne04BonvoParksideDto)cachedDto;
                dto.setWhiteBaseOne04BonvoParkside(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne04BonvoList().add(dto);
                }
            } else {
                WhiteBaseOne04BonvoParksideDtoMapper mapper = new WhiteBaseOne04BonvoParksideDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne04BonvoList();
                WhiteBaseOne04BonvoParksideDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne04BonvoParkside(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne04BonvoList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne04BonvoParkside());
                }
            }
        };
        if (!_suppressWhiteBaseOne04BonvoStationside && entity.getWhiteBaseOne04BonvoStationside().isPresent()) {
            WhiteBaseOne04BonvoStationside relationEntity = entity.getWhiteBaseOne04BonvoStationside().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne04BonvoStationsideDto relationDto = (WhiteBaseOne04BonvoStationsideDto)cachedDto;
                dto.setWhiteBaseOne04BonvoStationside(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne04BonvoList().add(dto);
                }
            } else {
                WhiteBaseOne04BonvoStationsideDtoMapper mapper = new WhiteBaseOne04BonvoStationsideDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne04BonvoList();
                WhiteBaseOne04BonvoStationsideDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne04BonvoStationside(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne04BonvoList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne04BonvoStationside());
                }
            }
        };
        if (!_suppressWhiteBaseList && !entity.getWhiteBaseList().isEmpty()) {
            WhiteBaseDtoMapper mapper = new WhiteBaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteBaseOne04Bonvo();
            List<WhiteBaseDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteBaseList());
            dto.setWhiteBaseList(relationDtoList);
            if (reverseReference) {
                for (WhiteBaseDto relationDto : relationDtoList) {
                    relationDto.setWhiteBaseOne04Bonvo(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteBaseOne04BonvoDto> mappingToDtoList(List<WhiteBaseOne04Bonvo> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteBaseOne04BonvoDto> dtoList = new ArrayList<WhiteBaseOne04BonvoDto>();
        for (WhiteBaseOne04Bonvo entity : entityList) {
            WhiteBaseOne04BonvoDto dto = mappingToDto(entity);
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
    public WhiteBaseOne04Bonvo mappingToEntity(WhiteBaseOne04BonvoDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteBaseOne04Bonvo)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne04Bonvo entity = new WhiteBaseOne04Bonvo();
        if (needsMapping(dto, dto.getBonvoId(), "bonvoId")) {
            entity.setBonvoId(dto.getBonvoId());
        }
        if (needsMapping(dto, dto.getBonvoName(), "bonvoName")) {
            entity.setBonvoName(dto.getBonvoName());
        }
        if (needsMapping(dto, dto.getParksideId(), "parksideId")) {
            entity.setParksideId(dto.getParksideId());
        }
        if (needsMapping(dto, dto.getStationsideId(), "stationsideId")) {
            entity.setStationsideId(dto.getStationsideId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne04BonvoParkside && dto.getWhiteBaseOne04BonvoParkside() != null) {
            WhiteBaseOne04BonvoParksideDto relationDto = dto.getWhiteBaseOne04BonvoParkside();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne04BonvoParkside relationEntity = (WhiteBaseOne04BonvoParkside)cachedEntity;
                entity.setWhiteBaseOne04BonvoParkside(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne04BonvoList().add(entity);
                }
            } else {
                WhiteBaseOne04BonvoParksideDtoMapper mapper = new WhiteBaseOne04BonvoParksideDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne04BonvoList();
                WhiteBaseOne04BonvoParkside relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne04BonvoParkside(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne04BonvoList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne04BonvoParkside().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne04BonvoParkside().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne04BonvoStationside && dto.getWhiteBaseOne04BonvoStationside() != null) {
            WhiteBaseOne04BonvoStationsideDto relationDto = dto.getWhiteBaseOne04BonvoStationside();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne04BonvoStationside relationEntity = (WhiteBaseOne04BonvoStationside)cachedEntity;
                entity.setWhiteBaseOne04BonvoStationside(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne04BonvoList().add(entity);
                }
            } else {
                WhiteBaseOne04BonvoStationsideDtoMapper mapper = new WhiteBaseOne04BonvoStationsideDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne04BonvoList();
                WhiteBaseOne04BonvoStationside relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne04BonvoStationside(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne04BonvoList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne04BonvoStationside().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne04BonvoStationside().get());
                }
            }
        };
        if (!_suppressWhiteBaseList && !dto.getWhiteBaseList().isEmpty()) {
            WhiteBaseDtoMapper mapper = new WhiteBaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressWhiteBaseOne04Bonvo();
            List<WhiteBase> relationEntityList = mapper.mappingToEntityList(dto.getWhiteBaseList());
            entity.setWhiteBaseList(relationEntityList);
            if (reverseReference) {
                for (WhiteBase relationEntity : relationEntityList) {
                    relationEntity.setWhiteBaseOne04Bonvo(OptionalEntity.of(entity));
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
    protected boolean needsMapping(WhiteBaseOne04BonvoDto dto, Object value, String propName) {
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
    public List<WhiteBaseOne04Bonvo> mappingToEntityList(List<WhiteBaseOne04BonvoDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteBaseOne04Bonvo> entityList = new ArrayList<WhiteBaseOne04Bonvo>();
        for (WhiteBaseOne04BonvoDto dto : dtoList) {
            WhiteBaseOne04Bonvo entity = mappingToEntity(dto);
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
    public void suppressWhiteBaseOne04BonvoParkside() {
        _suppressWhiteBaseOne04BonvoParkside = true;
    }
    public void suppressWhiteBaseOne04BonvoStationside() {
        _suppressWhiteBaseOne04BonvoStationside = true;
    }
    public void suppressWhiteBaseList() {
        _suppressWhiteBaseList = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteBaseOne04BonvoParkside();
        suppressWhiteBaseOne04BonvoStationside();
        suppressWhiteBaseList();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteBaseOne04BonvoParkside = false;
        _suppressWhiteBaseOne04BonvoStationside = false;
        _suppressWhiteBaseList = false;
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
    public WhiteBaseOne04BonvoDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteBaseOne04BonvoDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteBaseOne04BonvoDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteBaseOne04BonvoDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteBaseOne04BonvoDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteBaseOne04BonvoDtoMapper)this;
    }
}
