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
 * The DTO mapper of WHITE_BASE_ONE09_PALM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     PALM_ID
 *
 * [column]
 *     PALM_ID, PALM_NAME, BASE_ID
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
 *     WHITE_BASE
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     whiteBase
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseOne09PalmDtoMapper implements DtoMapper<WhiteBaseOne09Palm, WhiteBaseOne09PalmDto>, Serializable {

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
    protected boolean _suppressWhiteBase;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseOne09PalmDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteBaseOne09PalmDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteBaseOne09PalmDto mappingToDto(WhiteBaseOne09Palm entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteBaseOne09PalmDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne09PalmDto dto = new WhiteBaseOne09PalmDto();
        dto.setPalmId(entity.getPalmId());
        dto.setPalmName(entity.getPalmName());
        dto.setBaseId(entity.getBaseId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBase && entity.getWhiteBase().isPresent()) {
            WhiteBase relationEntity = entity.getWhiteBase().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseDto relationDto = (WhiteBaseDto)cachedDto;
                dto.setWhiteBase(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBaseOne09PalmAsOne(dto);
                }
            } else {
                WhiteBaseDtoMapper mapper = new WhiteBaseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne09PalmAsOne();
                WhiteBaseDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBase(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBaseOne09PalmAsOne(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBase());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteBaseOne09PalmDto> mappingToDtoList(List<WhiteBaseOne09Palm> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteBaseOne09PalmDto> dtoList = new ArrayList<WhiteBaseOne09PalmDto>();
        for (WhiteBaseOne09Palm entity : entityList) {
            WhiteBaseOne09PalmDto dto = mappingToDto(entity);
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
    public WhiteBaseOne09Palm mappingToEntity(WhiteBaseOne09PalmDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteBaseOne09Palm)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseOne09Palm entity = new WhiteBaseOne09Palm();
        if (needsMapping(dto, dto.getPalmId(), "palmId")) {
            entity.setPalmId(dto.getPalmId());
        }
        if (needsMapping(dto, dto.getPalmName(), "palmName")) {
            entity.setPalmName(dto.getPalmName());
        }
        if (needsMapping(dto, dto.getBaseId(), "baseId")) {
            entity.setBaseId(dto.getBaseId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBase && dto.getWhiteBase() != null) {
            WhiteBaseDto relationDto = dto.getWhiteBase();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBase relationEntity = (WhiteBase)cachedEntity;
                entity.setWhiteBase(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBaseOne09PalmAsOne(OptionalEntity.of(entity));
                }
            } else {
                WhiteBaseDtoMapper mapper = new WhiteBaseDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseOne09PalmAsOne();
                WhiteBase relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBase(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBaseOne09PalmAsOne(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getWhiteBase().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBase().get());
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
    protected boolean needsMapping(WhiteBaseOne09PalmDto dto, Object value, String propName) {
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
    public List<WhiteBaseOne09Palm> mappingToEntityList(List<WhiteBaseOne09PalmDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteBaseOne09Palm> entityList = new ArrayList<WhiteBaseOne09Palm>();
        for (WhiteBaseOne09PalmDto dto : dtoList) {
            WhiteBaseOne09Palm entity = mappingToEntity(dto);
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
    public void suppressWhiteBase() {
        _suppressWhiteBase = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteBase();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteBase = false;
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
    public WhiteBaseOne09PalmDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteBaseOne09PalmDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteBaseOne09PalmDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteBaseOne09PalmDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteBaseOne09PalmDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteBaseOne09PalmDtoMapper)this;
    }
}
