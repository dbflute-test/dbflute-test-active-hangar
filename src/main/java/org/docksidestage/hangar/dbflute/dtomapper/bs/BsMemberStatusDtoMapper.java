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
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exentity.*;
import org.docksidestage.hangar.simpleflute.dto.*;
import org.docksidestage.hangar.dbflute.dtomapper.*;

/**
 * The DTO mapper of (会員ステータス)MEMBER_STATUS as TABLE. <br>
 * 会員のステータスを示す固定的なマスタテーブル。いわゆるテーブル区分値！<br>
 * 業務運用上で増えることはなく、増減するときはプログラム修正ともなうレベルの業務変更と考えられる。<br>
 * <br>
 * こういった固定的なマスタテーブルには、更新日時などの共通カラムは定義していないが、業務上そういった情報を管理する必要性が低いという理由に加え、ExampleDBとして共通カラムでER図が埋め尽くされてしまい見づらくなるというところで割り切っている。実業務では統一的に定義することもある。
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberStatusDtoMapper implements DtoMapper<MemberStatus, MemberStatusDto>, Serializable {

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
    protected boolean _suppressMemberList;
    protected boolean _suppressMemberLoginList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberStatusDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsMemberStatusDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public MemberStatusDto mappingToDto(MemberStatus entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (MemberStatusDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MemberStatusDto dto = new MemberStatusDto();
        dto.setMemberStatusCode(entity.getMemberStatusCode());
        dto.setMemberStatusName(entity.getMemberStatusName());
        dto.setDescription(entity.getDescription());
        dto.setDisplayOrder(entity.getDisplayOrder());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMemberList && !entity.getMemberList().isEmpty()) {
            MemberDtoMapper mapper = new MemberDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMemberStatus();
            List<MemberDto> relationDtoList = mapper.mappingToDtoList(entity.getMemberList());
            dto.setMemberList(relationDtoList);
            if (reverseReference) {
                for (MemberDto relationDto : relationDtoList) {
                    relationDto.setMemberStatus(dto);
                }
            }
        };
        if (!_suppressMemberLoginList && !entity.getMemberLoginList().isEmpty()) {
            MemberLoginDtoMapper mapper = new MemberLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMemberStatus();
            List<MemberLoginDto> relationDtoList = mapper.mappingToDtoList(entity.getMemberLoginList());
            dto.setMemberLoginList(relationDtoList);
            if (reverseReference) {
                for (MemberLoginDto relationDto : relationDtoList) {
                    relationDto.setMemberStatus(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<MemberStatusDto> mappingToDtoList(List<MemberStatus> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<MemberStatusDto> dtoList = new ArrayList<MemberStatusDto>();
        for (MemberStatus entity : entityList) {
            MemberStatusDto dto = mappingToDto(entity);
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
    public MemberStatus mappingToEntity(MemberStatusDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (MemberStatus)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        MemberStatus entity = new MemberStatus();
        if (needsMapping(dto, dto.getMemberStatusCode(), "memberStatusCode")) {
            entity.setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.codeOf(dto.getMemberStatusCode()));
        }
        if (needsMapping(dto, dto.getMemberStatusName(), "memberStatusName")) {
            entity.setMemberStatusName(dto.getMemberStatusName());
        }
        if (needsMapping(dto, dto.getDescription(), "description")) {
            entity.setDescription(dto.getDescription());
        }
        if (needsMapping(dto, dto.getDisplayOrder(), "displayOrder")) {
            entity.setDisplayOrder(dto.getDisplayOrder());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressMemberList && !dto.getMemberList().isEmpty()) {
            MemberDtoMapper mapper = new MemberDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMemberStatus();
            List<Member> relationEntityList = mapper.mappingToEntityList(dto.getMemberList());
            entity.setMemberList(relationEntityList);
            if (reverseReference) {
                for (Member relationEntity : relationEntityList) {
                    relationEntity.setMemberStatus(OptionalEntity.of(entity));
                }
            }
        };
        if (!_suppressMemberLoginList && !dto.getMemberLoginList().isEmpty()) {
            MemberLoginDtoMapper mapper = new MemberLoginDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressMemberStatus();
            List<MemberLogin> relationEntityList = mapper.mappingToEntityList(dto.getMemberLoginList());
            entity.setMemberLoginList(relationEntityList);
            if (reverseReference) {
                for (MemberLogin relationEntity : relationEntityList) {
                    relationEntity.setMemberStatus(OptionalEntity.of(entity));
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
    protected boolean needsMapping(MemberStatusDto dto, Object value, String propName) {
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
    public List<MemberStatus> mappingToEntityList(List<MemberStatusDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<MemberStatus> entityList = new ArrayList<MemberStatus>();
        for (MemberStatusDto dto : dtoList) {
            MemberStatus entity = mappingToEntity(dto);
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
    public void suppressMemberList() {
        _suppressMemberList = true;
    }
    public void suppressMemberLoginList() {
        _suppressMemberLoginList = true;
    }
    protected void doSuppressAll() { // internal
        suppressMemberList();
        suppressMemberLoginList();
    }
    protected void doSuppressClear() { // internal
        _suppressMemberList = false;
        _suppressMemberLoginList = false;
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
    public MemberStatusDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (MemberStatusDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public MemberStatusDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (MemberStatusDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public MemberStatusDtoMapper reverseReference() {
        setReverseReference(true);
        return (MemberStatusDtoMapper)this;
    }
}
