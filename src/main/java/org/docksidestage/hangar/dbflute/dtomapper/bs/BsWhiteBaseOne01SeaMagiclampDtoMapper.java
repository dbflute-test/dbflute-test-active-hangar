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
 * The DTO mapper of WHITE_BASE_ONE01_SEA_MAGICLAMP as TABLE. <br>
 * <pre>
 * [primary-key]
 *     MAGICLAMP_ID
 *
 * [column]
 *     MAGICLAMP_ID, MAGICLAMP_NAME, SEA_ID
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
 *     WHITE_BASE_ONE01_SEA
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBaseOne01Sea
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne01SeaMagiclampDtoMapper implements DtoMapper<WhiteBaseOne01SeaMagiclamp, WhiteBaseOne01SeaMagiclampDto>, Serializable {

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
    protected boolean _suppressWhiteBaseOne01Sea;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne01SeaMagiclampDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteBaseOne01SeaMagiclampDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteBaseOne01SeaMagiclampDto mappingToDto(WhiteBaseOne01SeaMagiclamp entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteBaseOne01SeaMagiclampDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne01SeaMagiclampDto dto = new WhiteBaseOne01SeaMagiclampDto();
        dto.setMagiclampId(entity.getMagiclampId());
        dto.setMagiclampName(entity.getMagiclampName());
        dto.setSeaId(entity.getSeaId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne01Sea && entity.getWhiteBaseOne01Sea().isPresent()) {
            WhiteBaseOne01Sea relationEntity = entity.getWhiteBaseOne01Sea().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne01SeaDto relationDto = (WhiteBaseOne01SeaDto)cachedDto;
                dto.setWhiteBaseOne01Sea(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne01SeaMagiclampList().add(dto);
                }
            } else {
                WhiteBaseOne01SeaDtoMapper mapper = new WhiteBaseOne01SeaDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01SeaMagiclampList();
                WhiteBaseOne01SeaDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne01Sea(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseOne01SeaMagiclampList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne01Sea());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteBaseOne01SeaMagiclampDto> mappingToDtoList(List<WhiteBaseOne01SeaMagiclamp> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteBaseOne01SeaMagiclampDto> dtoList = new ArrayList<WhiteBaseOne01SeaMagiclampDto>();
        for (WhiteBaseOne01SeaMagiclamp entity : entityList) {
            WhiteBaseOne01SeaMagiclampDto dto = mappingToDto(entity);
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
    public WhiteBaseOne01SeaMagiclamp mappingToEntity(WhiteBaseOne01SeaMagiclampDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteBaseOne01SeaMagiclamp)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne01SeaMagiclamp entity = new WhiteBaseOne01SeaMagiclamp();
        if (needsMapping(dto, dto.getMagiclampId(), "magiclampId")) {
            entity.setMagiclampId(dto.getMagiclampId());
        }
        if (needsMapping(dto, dto.getMagiclampName(), "magiclampName")) {
            entity.setMagiclampName(dto.getMagiclampName());
        }
        if (needsMapping(dto, dto.getSeaId(), "seaId")) {
            entity.setSeaId(dto.getSeaId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne01Sea && dto.getWhiteBaseOne01Sea() != null) {
            WhiteBaseOne01SeaDto relationDto = dto.getWhiteBaseOne01Sea();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne01Sea relationEntity = (WhiteBaseOne01Sea)cachedEntity;
                entity.setWhiteBaseOne01Sea(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne01SeaMagiclampList().add(entity);
                }
            } else {
                WhiteBaseOne01SeaDtoMapper mapper = new WhiteBaseOne01SeaDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne01SeaMagiclampList();
                WhiteBaseOne01Sea relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne01Sea(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseOne01SeaMagiclampList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne01Sea().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne01Sea().get());
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
    protected boolean needsMapping(WhiteBaseOne01SeaMagiclampDto dto, Object value, String propName) {
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
    public List<WhiteBaseOne01SeaMagiclamp> mappingToEntityList(List<WhiteBaseOne01SeaMagiclampDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteBaseOne01SeaMagiclamp> entityList = new ArrayList<WhiteBaseOne01SeaMagiclamp>();
        for (WhiteBaseOne01SeaMagiclampDto dto : dtoList) {
            WhiteBaseOne01SeaMagiclamp entity = mappingToEntity(dto);
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
    public void suppressWhiteBaseOne01Sea() {
        _suppressWhiteBaseOne01Sea = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteBaseOne01Sea();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteBaseOne01Sea = false;
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
    public WhiteBaseOne01SeaMagiclampDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteBaseOne01SeaMagiclampDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteBaseOne01SeaMagiclampDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteBaseOne01SeaMagiclampDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteBaseOne01SeaMagiclampDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteBaseOne01SeaMagiclampDtoMapper)this;
    }
}
