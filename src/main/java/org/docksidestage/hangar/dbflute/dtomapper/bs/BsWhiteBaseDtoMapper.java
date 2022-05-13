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
 * The DTO mapper of WHITE_BASE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     BASE_ID
 *
 * [column]
 *     BASE_ID, BASE_NAME, SEA_ID, LAND_ID, PIARI_ID, BONVO_ID, DSTORE_ID, AMBA_ID, MIRACO_ID, DOHOTEL_ID
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
 *     WHITE_BASE_ONE06_AMBA, WHITE_BASE_ONE04_BONVO, WHITE_BASE_ONE05_DSTORE, WHITE_BASE_ONE02_LAND, WHITE_BASE_ONE07_MIRACO, WHITE_BASE_ONE03_PIARI, WHITE_BASE_ONE01_SEA, WHITE_BASE_ONE08_DOHOTEL, WHITE_BASE_ONE09_PALM(AsOne), WHITE_BASE_ONE10_CELEB(AsOne), WHITE_BASE_ONE11_CIRQUE(AsOne), WHITE_BASE_ONE12_AMPHI(AsOne)
 *
 * [referrer-table]
 *     WHITE_BASE_ONE09_PALM, WHITE_BASE_ONE10_CELEB, WHITE_BASE_ONE11_CIRQUE, WHITE_BASE_ONE12_AMPHI
 *
 * [foreign-property]
 *     whiteBaseOne06Amba, whiteBaseOne04Bonvo, whiteBaseOne05Dstore, whiteBaseOne02Land, whiteBaseOne07Miraco, whiteBaseOne03Piari, whiteBaseOne01Sea, whiteBaseOne08Dohotel, whiteBaseOne09PalmAsOne, whiteBaseOne10CelebAsOne, whiteBaseOne11CirqueAsOne, whiteBaseOne12AmphiAsOne
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteBaseDtoMapper implements DtoMapper<WhiteBase, WhiteBaseDto>, Serializable {

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
    protected boolean _suppressWhiteBaseOne06Amba;
    protected boolean _suppressWhiteBaseOne04Bonvo;
    protected boolean _suppressWhiteBaseOne05Dstore;
    protected boolean _suppressWhiteBaseOne02Land;
    protected boolean _suppressWhiteBaseOne07Miraco;
    protected boolean _suppressWhiteBaseOne03Piari;
    protected boolean _suppressWhiteBaseOne01Sea;
    protected boolean _suppressWhiteBaseOne08Dohotel;
    protected boolean _suppressWhiteBaseOne09PalmAsOne;
    protected boolean _suppressWhiteBaseOne10CelebAsOne;
    protected boolean _suppressWhiteBaseOne11CirqueAsOne;
    protected boolean _suppressWhiteBaseOne12AmphiAsOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteBaseDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsWhiteBaseDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public WhiteBaseDto mappingToDto(WhiteBase entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (WhiteBaseDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBaseDto dto = new WhiteBaseDto();
        dto.setBaseId(entity.getBaseId());
        dto.setBaseName(entity.getBaseName());
        dto.setSeaId(entity.getSeaId());
        dto.setLandId(entity.getLandId());
        dto.setPiariId(entity.getPiariId());
        dto.setBonvoId(entity.getBonvoId());
        dto.setDstoreId(entity.getDstoreId());
        dto.setAmbaId(entity.getAmbaId());
        dto.setMiracoId(entity.getMiracoId());
        dto.setDohotelId(entity.getDohotelId());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne06Amba && entity.getWhiteBaseOne06Amba().isPresent()) {
            WhiteBaseOne06Amba relationEntity = entity.getWhiteBaseOne06Amba().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne06AmbaDto relationDto = (WhiteBaseOne06AmbaDto)cachedDto;
                dto.setWhiteBaseOne06Amba(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne06AmbaDtoMapper mapper = new WhiteBaseOne06AmbaDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne06AmbaDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne06Amba(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne06Amba());
                }
            }
        };
        if (!_suppressWhiteBaseOne04Bonvo && entity.getWhiteBaseOne04Bonvo().isPresent()) {
            WhiteBaseOne04Bonvo relationEntity = entity.getWhiteBaseOne04Bonvo().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne04BonvoDto relationDto = (WhiteBaseOne04BonvoDto)cachedDto;
                dto.setWhiteBaseOne04Bonvo(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne04BonvoDtoMapper mapper = new WhiteBaseOne04BonvoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne04BonvoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne04Bonvo(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne04Bonvo());
                }
            }
        };
        if (!_suppressWhiteBaseOne05Dstore && entity.getWhiteBaseOne05Dstore().isPresent()) {
            WhiteBaseOne05Dstore relationEntity = entity.getWhiteBaseOne05Dstore().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne05DstoreDto relationDto = (WhiteBaseOne05DstoreDto)cachedDto;
                dto.setWhiteBaseOne05Dstore(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne05DstoreDtoMapper mapper = new WhiteBaseOne05DstoreDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne05DstoreDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne05Dstore(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne05Dstore());
                }
            }
        };
        if (!_suppressWhiteBaseOne02Land && entity.getWhiteBaseOne02Land().isPresent()) {
            WhiteBaseOne02Land relationEntity = entity.getWhiteBaseOne02Land().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne02LandDto relationDto = (WhiteBaseOne02LandDto)cachedDto;
                dto.setWhiteBaseOne02Land(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne02LandDtoMapper mapper = new WhiteBaseOne02LandDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne02LandDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne02Land(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne02Land());
                }
            }
        };
        if (!_suppressWhiteBaseOne07Miraco && entity.getWhiteBaseOne07Miraco().isPresent()) {
            WhiteBaseOne07Miraco relationEntity = entity.getWhiteBaseOne07Miraco().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne07MiracoDto relationDto = (WhiteBaseOne07MiracoDto)cachedDto;
                dto.setWhiteBaseOne07Miraco(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne07MiracoDtoMapper mapper = new WhiteBaseOne07MiracoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne07MiracoDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne07Miraco(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne07Miraco());
                }
            }
        };
        if (!_suppressWhiteBaseOne03Piari && entity.getWhiteBaseOne03Piari().isPresent()) {
            WhiteBaseOne03Piari relationEntity = entity.getWhiteBaseOne03Piari().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne03PiariDto relationDto = (WhiteBaseOne03PiariDto)cachedDto;
                dto.setWhiteBaseOne03Piari(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne03PiariDtoMapper mapper = new WhiteBaseOne03PiariDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne03PiariDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne03Piari(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne03Piari());
                }
            }
        };
        if (!_suppressWhiteBaseOne01Sea && entity.getWhiteBaseOne01Sea().isPresent()) {
            WhiteBaseOne01Sea relationEntity = entity.getWhiteBaseOne01Sea().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne01SeaDto relationDto = (WhiteBaseOne01SeaDto)cachedDto;
                dto.setWhiteBaseOne01Sea(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne01SeaDtoMapper mapper = new WhiteBaseOne01SeaDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne01SeaDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne01Sea(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne01Sea());
                }
            }
        };
        if (!_suppressWhiteBaseOne08Dohotel && entity.getWhiteBaseOne08Dohotel().isPresent()) {
            WhiteBaseOne08Dohotel relationEntity = entity.getWhiteBaseOne08Dohotel().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne08DohotelDto relationDto = (WhiteBaseOne08DohotelDto)cachedDto;
                dto.setWhiteBaseOne08Dohotel(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
            } else {
                WhiteBaseOne08DohotelDtoMapper mapper = new WhiteBaseOne08DohotelDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne08DohotelDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne08Dohotel(relationDto);
                if (reverseReference) {
                    relationDto.getWhiteBaseList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne08Dohotel());
                }
            }
        };
        if (!_suppressWhiteBaseOne09PalmAsOne && entity.getWhiteBaseOne09PalmAsOne().isPresent()) {
            WhiteBaseOne09Palm relationEntity = entity.getWhiteBaseOne09PalmAsOne().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne09PalmDto relationDto = (WhiteBaseOne09PalmDto)cachedDto;
                dto.setWhiteBaseOne09PalmAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
            } else {
                WhiteBaseOne09PalmDtoMapper mapper = new WhiteBaseOne09PalmDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne09PalmDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne09PalmAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne09PalmAsOne());
                }
            }
        };
        if (!_suppressWhiteBaseOne10CelebAsOne && entity.getWhiteBaseOne10CelebAsOne().isPresent()) {
            WhiteBaseOne10Celeb relationEntity = entity.getWhiteBaseOne10CelebAsOne().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne10CelebDto relationDto = (WhiteBaseOne10CelebDto)cachedDto;
                dto.setWhiteBaseOne10CelebAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
            } else {
                WhiteBaseOne10CelebDtoMapper mapper = new WhiteBaseOne10CelebDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne10CelebDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne10CelebAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne10CelebAsOne());
                }
            }
        };
        if (!_suppressWhiteBaseOne11CirqueAsOne && entity.getWhiteBaseOne11CirqueAsOne().isPresent()) {
            WhiteBaseOne11Cirque relationEntity = entity.getWhiteBaseOne11CirqueAsOne().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne11CirqueDto relationDto = (WhiteBaseOne11CirqueDto)cachedDto;
                dto.setWhiteBaseOne11CirqueAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
            } else {
                WhiteBaseOne11CirqueDtoMapper mapper = new WhiteBaseOne11CirqueDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne11CirqueDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne11CirqueAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne11CirqueAsOne());
                }
            }
        };
        if (!_suppressWhiteBaseOne12AmphiAsOne && entity.getWhiteBaseOne12AmphiAsOne().isPresent()) {
            WhiteBaseOne12Amphi relationEntity = entity.getWhiteBaseOne12AmphiAsOne().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                WhiteBaseOne12AmphiDto relationDto = (WhiteBaseOne12AmphiDto)cachedDto;
                dto.setWhiteBaseOne12AmphiAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
            } else {
                WhiteBaseOne12AmphiDtoMapper mapper = new WhiteBaseOne12AmphiDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne12AmphiDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setWhiteBaseOne12AmphiAsOne(relationDto);
                if (reverseReference) {
                    relationDto.setWhiteBase(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getWhiteBaseOne12AmphiAsOne());
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<WhiteBaseDto> mappingToDtoList(List<WhiteBase> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<WhiteBaseDto> dtoList = new ArrayList<WhiteBaseDto>();
        for (WhiteBase entity : entityList) {
            WhiteBaseDto dto = mappingToDto(entity);
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
    public WhiteBase mappingToEntity(WhiteBaseDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (WhiteBase)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        WhiteBase entity = new WhiteBase();
        if (needsMapping(dto, dto.getBaseId(), "baseId")) {
            entity.setBaseId(dto.getBaseId());
        }
        if (needsMapping(dto, dto.getBaseName(), "baseName")) {
            entity.setBaseName(dto.getBaseName());
        }
        if (needsMapping(dto, dto.getSeaId(), "seaId")) {
            entity.setSeaId(dto.getSeaId());
        }
        if (needsMapping(dto, dto.getLandId(), "landId")) {
            entity.setLandId(dto.getLandId());
        }
        if (needsMapping(dto, dto.getPiariId(), "piariId")) {
            entity.setPiariId(dto.getPiariId());
        }
        if (needsMapping(dto, dto.getBonvoId(), "bonvoId")) {
            entity.setBonvoId(dto.getBonvoId());
        }
        if (needsMapping(dto, dto.getDstoreId(), "dstoreId")) {
            entity.setDstoreId(dto.getDstoreId());
        }
        if (needsMapping(dto, dto.getAmbaId(), "ambaId")) {
            entity.setAmbaId(dto.getAmbaId());
        }
        if (needsMapping(dto, dto.getMiracoId(), "miracoId")) {
            entity.setMiracoId(dto.getMiracoId());
        }
        if (needsMapping(dto, dto.getDohotelId(), "dohotelId")) {
            entity.setDohotelId(dto.getDohotelId());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressWhiteBaseOne06Amba && dto.getWhiteBaseOne06Amba() != null) {
            WhiteBaseOne06AmbaDto relationDto = dto.getWhiteBaseOne06Amba();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne06Amba relationEntity = (WhiteBaseOne06Amba)cachedEntity;
                entity.setWhiteBaseOne06Amba(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne06AmbaDtoMapper mapper = new WhiteBaseOne06AmbaDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne06Amba relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne06Amba(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne06Amba().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne06Amba().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne04Bonvo && dto.getWhiteBaseOne04Bonvo() != null) {
            WhiteBaseOne04BonvoDto relationDto = dto.getWhiteBaseOne04Bonvo();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne04Bonvo relationEntity = (WhiteBaseOne04Bonvo)cachedEntity;
                entity.setWhiteBaseOne04Bonvo(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne04BonvoDtoMapper mapper = new WhiteBaseOne04BonvoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne04Bonvo relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne04Bonvo(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne04Bonvo().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne04Bonvo().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne05Dstore && dto.getWhiteBaseOne05Dstore() != null) {
            WhiteBaseOne05DstoreDto relationDto = dto.getWhiteBaseOne05Dstore();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne05Dstore relationEntity = (WhiteBaseOne05Dstore)cachedEntity;
                entity.setWhiteBaseOne05Dstore(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne05DstoreDtoMapper mapper = new WhiteBaseOne05DstoreDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne05Dstore relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne05Dstore(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne05Dstore().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne05Dstore().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne02Land && dto.getWhiteBaseOne02Land() != null) {
            WhiteBaseOne02LandDto relationDto = dto.getWhiteBaseOne02Land();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne02Land relationEntity = (WhiteBaseOne02Land)cachedEntity;
                entity.setWhiteBaseOne02Land(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne02LandDtoMapper mapper = new WhiteBaseOne02LandDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne02Land relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne02Land(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne02Land().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne02Land().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne07Miraco && dto.getWhiteBaseOne07Miraco() != null) {
            WhiteBaseOne07MiracoDto relationDto = dto.getWhiteBaseOne07Miraco();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne07Miraco relationEntity = (WhiteBaseOne07Miraco)cachedEntity;
                entity.setWhiteBaseOne07Miraco(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne07MiracoDtoMapper mapper = new WhiteBaseOne07MiracoDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne07Miraco relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne07Miraco(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne07Miraco().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne07Miraco().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne03Piari && dto.getWhiteBaseOne03Piari() != null) {
            WhiteBaseOne03PiariDto relationDto = dto.getWhiteBaseOne03Piari();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne03Piari relationEntity = (WhiteBaseOne03Piari)cachedEntity;
                entity.setWhiteBaseOne03Piari(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne03PiariDtoMapper mapper = new WhiteBaseOne03PiariDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne03Piari relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne03Piari(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne03Piari().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne03Piari().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne01Sea && dto.getWhiteBaseOne01Sea() != null) {
            WhiteBaseOne01SeaDto relationDto = dto.getWhiteBaseOne01Sea();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne01Sea relationEntity = (WhiteBaseOne01Sea)cachedEntity;
                entity.setWhiteBaseOne01Sea(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne01SeaDtoMapper mapper = new WhiteBaseOne01SeaDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne01Sea relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne01Sea(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne01Sea().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne01Sea().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne08Dohotel && dto.getWhiteBaseOne08Dohotel() != null) {
            WhiteBaseOne08DohotelDto relationDto = dto.getWhiteBaseOne08Dohotel();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne08Dohotel relationEntity = (WhiteBaseOne08Dohotel)cachedEntity;
                entity.setWhiteBaseOne08Dohotel(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
            } else {
                WhiteBaseOne08DohotelDtoMapper mapper = new WhiteBaseOne08DohotelDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBaseList();
                WhiteBaseOne08Dohotel relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne08Dohotel(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getWhiteBaseList().add(entity);
                }
                if (instanceCache && entity.getWhiteBaseOne08Dohotel().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne08Dohotel().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne09PalmAsOne && dto.getWhiteBaseOne09PalmAsOne() != null) {
            WhiteBaseOne09PalmDto relationDto = dto.getWhiteBaseOne09PalmAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne09Palm relationEntity = (WhiteBaseOne09Palm)cachedEntity;
                entity.setWhiteBaseOne09PalmAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
            } else {
                WhiteBaseOne09PalmDtoMapper mapper = new WhiteBaseOne09PalmDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne09Palm relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne09PalmAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getWhiteBaseOne09PalmAsOne().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne09PalmAsOne().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne10CelebAsOne && dto.getWhiteBaseOne10CelebAsOne() != null) {
            WhiteBaseOne10CelebDto relationDto = dto.getWhiteBaseOne10CelebAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne10Celeb relationEntity = (WhiteBaseOne10Celeb)cachedEntity;
                entity.setWhiteBaseOne10CelebAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
            } else {
                WhiteBaseOne10CelebDtoMapper mapper = new WhiteBaseOne10CelebDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne10Celeb relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne10CelebAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getWhiteBaseOne10CelebAsOne().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne10CelebAsOne().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne11CirqueAsOne && dto.getWhiteBaseOne11CirqueAsOne() != null) {
            WhiteBaseOne11CirqueDto relationDto = dto.getWhiteBaseOne11CirqueAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne11Cirque relationEntity = (WhiteBaseOne11Cirque)cachedEntity;
                entity.setWhiteBaseOne11CirqueAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
            } else {
                WhiteBaseOne11CirqueDtoMapper mapper = new WhiteBaseOne11CirqueDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne11Cirque relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne11CirqueAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getWhiteBaseOne11CirqueAsOne().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne11CirqueAsOne().get());
                }
            }
        };
        if (!_suppressWhiteBaseOne12AmphiAsOne && dto.getWhiteBaseOne12AmphiAsOne() != null) {
            WhiteBaseOne12AmphiDto relationDto = dto.getWhiteBaseOne12AmphiAsOne();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                WhiteBaseOne12Amphi relationEntity = (WhiteBaseOne12Amphi)cachedEntity;
                entity.setWhiteBaseOne12AmphiAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
            } else {
                WhiteBaseOne12AmphiDtoMapper mapper = new WhiteBaseOne12AmphiDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressWhiteBase();
                WhiteBaseOne12Amphi relationEntity = mapper.mappingToEntity(relationDto);
                entity.setWhiteBaseOne12AmphiAsOne(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.setWhiteBase(OptionalEntity.of(entity));
                }
                if (instanceCache && entity.getWhiteBaseOne12AmphiAsOne().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getWhiteBaseOne12AmphiAsOne().get());
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
    protected boolean needsMapping(WhiteBaseDto dto, Object value, String propName) {
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
    public List<WhiteBase> mappingToEntityList(List<WhiteBaseDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<WhiteBase> entityList = new ArrayList<WhiteBase>();
        for (WhiteBaseDto dto : dtoList) {
            WhiteBase entity = mappingToEntity(dto);
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
    public void suppressWhiteBaseOne06Amba() {
        _suppressWhiteBaseOne06Amba = true;
    }
    public void suppressWhiteBaseOne04Bonvo() {
        _suppressWhiteBaseOne04Bonvo = true;
    }
    public void suppressWhiteBaseOne05Dstore() {
        _suppressWhiteBaseOne05Dstore = true;
    }
    public void suppressWhiteBaseOne02Land() {
        _suppressWhiteBaseOne02Land = true;
    }
    public void suppressWhiteBaseOne07Miraco() {
        _suppressWhiteBaseOne07Miraco = true;
    }
    public void suppressWhiteBaseOne03Piari() {
        _suppressWhiteBaseOne03Piari = true;
    }
    public void suppressWhiteBaseOne01Sea() {
        _suppressWhiteBaseOne01Sea = true;
    }
    public void suppressWhiteBaseOne08Dohotel() {
        _suppressWhiteBaseOne08Dohotel = true;
    }
    public void suppressWhiteBaseOne09PalmAsOne() {
        _suppressWhiteBaseOne09PalmAsOne = true;
    }
    public void suppressWhiteBaseOne10CelebAsOne() {
        _suppressWhiteBaseOne10CelebAsOne = true;
    }
    public void suppressWhiteBaseOne11CirqueAsOne() {
        _suppressWhiteBaseOne11CirqueAsOne = true;
    }
    public void suppressWhiteBaseOne12AmphiAsOne() {
        _suppressWhiteBaseOne12AmphiAsOne = true;
    }
    protected void doSuppressAll() { // internal
        suppressWhiteBaseOne06Amba();
        suppressWhiteBaseOne04Bonvo();
        suppressWhiteBaseOne05Dstore();
        suppressWhiteBaseOne02Land();
        suppressWhiteBaseOne07Miraco();
        suppressWhiteBaseOne03Piari();
        suppressWhiteBaseOne01Sea();
        suppressWhiteBaseOne08Dohotel();
        suppressWhiteBaseOne09PalmAsOne();
        suppressWhiteBaseOne10CelebAsOne();
        suppressWhiteBaseOne11CirqueAsOne();
        suppressWhiteBaseOne12AmphiAsOne();
    }
    protected void doSuppressClear() { // internal
        _suppressWhiteBaseOne06Amba = false;
        _suppressWhiteBaseOne04Bonvo = false;
        _suppressWhiteBaseOne05Dstore = false;
        _suppressWhiteBaseOne02Land = false;
        _suppressWhiteBaseOne07Miraco = false;
        _suppressWhiteBaseOne03Piari = false;
        _suppressWhiteBaseOne01Sea = false;
        _suppressWhiteBaseOne08Dohotel = false;
        _suppressWhiteBaseOne09PalmAsOne = false;
        _suppressWhiteBaseOne10CelebAsOne = false;
        _suppressWhiteBaseOne11CirqueAsOne = false;
        _suppressWhiteBaseOne12AmphiAsOne = false;
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
    public WhiteBaseDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (WhiteBaseDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public WhiteBaseDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (WhiteBaseDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public WhiteBaseDtoMapper reverseReference() {
        setReverseReference(true);
        return (WhiteBaseDtoMapper)this;
    }
}
