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
 * The DTO mapper of WHITE_ON_PARADE_REF as TABLE. <br>
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
 * [foreign-table]
 *     WHITE_ON_PARADE, WHITE_ON_PARADE_NULLABLE_TO_MANY
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteOnParade, whiteOnParadeNullableToMany
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnParadeRefDtoMapper implements DtoMapper<WhiteOnParadeRef, WhiteOnParadeRefDto>, Serializable {

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
    protected boolean _suppressWhiteOnParade;
    protected boolean _suppressWhiteOnParadeNullableToMany;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteOnParadeRefDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteOnParadeRefDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteOnParadeRefDto mappingToDto(WhiteOnParadeRef entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteOnParadeRefDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteOnParadeRefDto dto = new WhiteOnParadeRefDto();
        dto.setRefId(entity.getRefId());
        dto.setRefName(entity.getRefName());
        dto.setNullableFkOnParadeId(entity.getNullableFkOnParadeId());
        dto.setNullableFkToManyId(entity.getNullableFkToManyId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteOnParade && entity.getWhiteOnParade().isPresent()) {
            WhiteOnParade relationEntity = entity.getWhiteOnParade().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteOnParadeDto relationDto = (WhiteOnParadeDto)cachedDto;
                dto.setWhiteOnParade(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteOnParadeRefList().add(dto);
                }
            } else {
                WhiteOnParadeDtoMapper mapper = new WhiteOnParadeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteOnParadeRefList();
                WhiteOnParadeDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteOnParade(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteOnParadeRefList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteOnParade());
                }
            }
        };
        if (!_suppressWhiteOnParadeNullableToMany && entity.getWhiteOnParadeNullableToMany().isPresent()) {
            WhiteOnParadeNullableToMany relationEntity = entity.getWhiteOnParadeNullableToMany().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteOnParadeNullableToManyDto relationDto = (WhiteOnParadeNullableToManyDto)cachedDto;
                dto.setWhiteOnParadeNullableToMany(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteOnParadeRefList().add(dto);
                }
            } else {
                WhiteOnParadeNullableToManyDtoMapper mapper = new WhiteOnParadeNullableToManyDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteOnParadeRefList();
                WhiteOnParadeNullableToManyDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteOnParadeNullableToMany(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteOnParadeRefList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteOnParadeNullableToMany());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteOnParadeRefDto> mappingToDtoList(List<WhiteOnParadeRef> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteOnParadeRefDto> dtoList = new ArrayList<WhiteOnParadeRefDto>();
        for (WhiteOnParadeRef entity : entityList) {
            WhiteOnParadeRefDto dto = mappingToDto(entity);
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
    public WhiteOnParadeRef mappingToEntity(WhiteOnParadeRefDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteOnParadeRef)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteOnParadeRef entity = new WhiteOnParadeRef();
        if (needsMapping(dto, dto.getRefId(), "refId")) {
            entity.setRefId(dto.getRefId());
        }
        if (needsMapping(dto, dto.getRefName(), "refName")) {
            entity.setRefName(dto.getRefName());
        }
        if (needsMapping(dto, dto.getNullableFkOnParadeId(), "nullableFkOnParadeId")) {
            entity.setNullableFkOnParadeId(dto.getNullableFkOnParadeId());
        }
        if (needsMapping(dto, dto.getNullableFkToManyId(), "nullableFkToManyId")) {
            entity.setNullableFkToManyId(dto.getNullableFkToManyId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteOnParade && dto.getWhiteOnParade() != null) {
            WhiteOnParadeDto relationDto = dto.getWhiteOnParade();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteOnParade relationEntity = (WhiteOnParade)cachedEntity;
                entity.setWhiteOnParade(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteOnParadeRefList().add(entity);
                }
            } else {
                WhiteOnParadeDtoMapper mapper = new WhiteOnParadeDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteOnParadeRefList();
                WhiteOnParade relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteOnParade(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteOnParadeRefList().add(entity);
                }
                if (instanceCache && entity.getWhiteOnParade().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteOnParade().get());
                }
            }
        };
        if (!_suppressWhiteOnParadeNullableToMany && dto.getWhiteOnParadeNullableToMany() != null) {
            WhiteOnParadeNullableToManyDto relationDto = dto.getWhiteOnParadeNullableToMany();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteOnParadeNullableToMany relationEntity = (WhiteOnParadeNullableToMany)cachedEntity;
                entity.setWhiteOnParadeNullableToMany(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteOnParadeRefList().add(entity);
                }
            } else {
                WhiteOnParadeNullableToManyDtoMapper mapper = new WhiteOnParadeNullableToManyDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteOnParadeRefList();
                WhiteOnParadeNullableToMany relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteOnParadeNullableToMany(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteOnParadeRefList().add(entity);
                }
                if (instanceCache && entity.getWhiteOnParadeNullableToMany().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteOnParadeNullableToMany().get());
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
    protected boolean needsMapping(WhiteOnParadeRefDto dto, Object value, String propName) {
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
    public List<WhiteOnParadeRef> mappingToEntityList(List<WhiteOnParadeRefDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteOnParadeRef> entityList = new ArrayList<WhiteOnParadeRef>();
        for (WhiteOnParadeRefDto dto : dtoList) {
            WhiteOnParadeRef entity = mappingToEntity(dto);
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
    public void suppressWhiteOnParade() {
        _suppressWhiteOnParade = true;
    }
    public void suppressWhiteOnParadeNullableToMany() {
        _suppressWhiteOnParadeNullableToMany = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteOnParade();
        suppressWhiteOnParadeNullableToMany();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteOnParade = false;
        _suppressWhiteOnParadeNullableToMany = false;
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
    public WhiteOnParadeRefDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteOnParadeRefDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteOnParadeRefDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteOnParadeRefDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteOnParadeRefDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteOnParadeRefDtoMapper)this;
    }
}
