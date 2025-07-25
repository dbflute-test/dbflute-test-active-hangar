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
 * The DTO mapper of (眠い商品)PRODUCT as TABLE. <br>
 * 商品:
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     SEQ_MEMBER_LOGIN
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 *
 * [referrer-table]
 *     PURCHASE, WHITE_DEPRECATED_REF
 *
 * [foreign-property]
 *     productCategory, productStatus
 *
 * [referrer-property]
 *     purchaseList, whiteDeprecatedRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProductDtoMapper implements DtoMapper<Product, ProductDto>, Serializable {

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
    protected boolean _suppressProductCategory;
    protected boolean _suppressProductStatus;
    protected boolean _suppressPurchaseList;
    protected boolean _suppressWhiteDeprecatedRefList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductDtoMapper() {
        _relationDtoMap = new HashMap<Entity, Object>();
        _relationEntityMap = new HashMap<Object, Entity>();
    }

    public BsProductDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
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
    public ProductDto mappingToDto(Product entity) {
        if (entity == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Entity localKey = createInstanceKeyEntity(entity);
        Object cachedLocalDto = instanceCache ? _relationDtoMap.get(localKey) : null;
        if (cachedLocalDto != null) {
            return (ProductDto)cachedLocalDto;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        ProductDto dto = new ProductDto();
        dto.setProductId(entity.getProductId());
        dto.setProductName(entity.getProductName());
        dto.setProductHandleCode(entity.getProductHandleCode());
        dto.setProductCategoryCode(entity.getProductCategoryCode());
        dto.setProductStatusCode(entity.getProductStatusCode());
        dto.setRegularPrice(entity.getRegularPrice());
        if (!exceptCommonColumn) {
            dto.setRegisterDatetime(entity.getRegisterDatetime());
        }
        if (!exceptCommonColumn) {
            dto.setRegisterUser(entity.getRegisterUser());
        }
        if (!exceptCommonColumn) {
            dto.setUpdateDatetime(entity.getUpdateDatetime());
        }
        if (!exceptCommonColumn) {
            dto.setUpdateUser(entity.getUpdateUser());
        }
        dto.setVersionNo(entity.getVersionNo());
        reflectDerivedProperty(entity, dto, true);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only a DTO that has a primary key value
            _relationDtoMap.put(localKey, dto);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductCategory && entity.getProductCategory().isPresent()) {
            ProductCategory relationEntity = entity.getProductCategory().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                ProductCategoryDto relationDto = (ProductCategoryDto)cachedDto;
                dto.setProductCategory(relationDto);
                if (reverseReference) {
                    relationDto.getProductList().add(dto);
                }
            } else {
                ProductCategoryDtoMapper mapper = new ProductCategoryDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressProductList();
                ProductCategoryDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setProductCategory(relationDto);
                if (reverseReference) {
                    relationDto.getProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getProductCategory());
                }
            }
        };
        if (!_suppressProductStatus && entity.getProductStatus().isPresent()) {
            ProductStatus relationEntity = entity.getProductStatus().get();
            Entity relationKey = createInstanceKeyEntity(relationEntity);
            Object cachedDto = instanceCache ? _relationDtoMap.get(relationKey) : null;
            if (cachedDto != null) {
                ProductStatusDto relationDto = (ProductStatusDto)cachedDto;
                dto.setProductStatus(relationDto);
                if (reverseReference) {
                    relationDto.getProductList().add(dto);
                }
            } else {
                ProductStatusDtoMapper mapper = new ProductStatusDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressProductList();
                ProductStatusDto relationDto = mapper.mappingToDto(relationEntity);
                dto.setProductStatus(relationDto);
                if (reverseReference) {
                    relationDto.getProductList().add(dto);
                }
                if (instanceCache && relationEntity.hasPrimaryKeyValue()) {
                    _relationDtoMap.put(relationKey, dto.getProductStatus());
                }
            }
        };
        if (!_suppressPurchaseList && !entity.getPurchaseList().isEmpty()) {
            PurchaseDtoMapper mapper = new PurchaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProduct();
            List<PurchaseDto> relationDtoList = mapper.mappingToDtoList(entity.getPurchaseList());
            dto.setPurchaseList(relationDtoList);
            if (reverseReference) {
                for (PurchaseDto relationDto : relationDtoList) {
                    relationDto.setProduct(dto);
                }
            }
        };
        if (!_suppressWhiteDeprecatedRefList && !entity.getWhiteDeprecatedRefList().isEmpty()) {
            WhiteDeprecatedRefDtoMapper mapper = new WhiteDeprecatedRefDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProduct();
            List<WhiteDeprecatedRefDto> relationDtoList = mapper.mappingToDtoList(entity.getWhiteDeprecatedRefList());
            dto.setWhiteDeprecatedRefList(relationDtoList);
            if (reverseReference) {
                for (WhiteDeprecatedRefDto relationDto : relationDtoList) {
                    relationDto.setProduct(dto);
                }
            }
        };
        return dto;
    }

    /**
     * {@inheritDoc}
     */
    public List<ProductDto> mappingToDtoList(List<Product> entityList) {
        if (entityList == null) {
            throw new IllegalArgumentException("The argument 'entityList' should not be null.");
        }
        List<ProductDto> dtoList = new ArrayList<ProductDto>();
        for (Product entity : entityList) {
            ProductDto dto = mappingToDto(entity);
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
    public Product mappingToEntity(ProductDto dto) {
        if (dto == null) {
            return null;
        }
        boolean instanceCache = _instanceCache;
        Object localKey = createInstanceKeyDto(dto, dto.instanceHash());
        Entity cachedLocalEntity = instanceCache ? _relationEntityMap.get(localKey) : null;
        if (cachedLocalEntity != null) {
            return (Product)cachedLocalEntity;
        }
        boolean exceptCommonColumn = isExceptCommonColumn();
        Product entity = new Product();
        if (needsMapping(dto, dto.getProductId(), "productId")) {
            entity.setProductId(dto.getProductId());
        }
        if (needsMapping(dto, dto.getProductName(), "productName")) {
            entity.setProductName(dto.getProductName());
        }
        if (needsMapping(dto, dto.getProductHandleCode(), "productHandleCode")) {
            entity.setProductHandleCode(dto.getProductHandleCode());
        }
        if (needsMapping(dto, dto.getProductCategoryCode(), "productCategoryCode")) {
            entity.setProductCategoryCode(dto.getProductCategoryCode());
        }
        if (needsMapping(dto, dto.getProductStatusCode(), "productStatusCode")) {
            entity.setProductStatusCodeAsProductStatus(CDef.ProductStatus.codeOf(dto.getProductStatusCode()));
        }
        if (needsMapping(dto, dto.getRegularPrice(), "regularPrice")) {
            entity.setRegularPrice(dto.getRegularPrice());
        }
        if (needsMapping(dto, dto.getRegisterDatetime(), "registerDatetime") && !exceptCommonColumn) {
            entity.setRegisterDatetime(dto.getRegisterDatetime());
        }
        if (needsMapping(dto, dto.getRegisterUser(), "registerUser") && !exceptCommonColumn) {
            entity.setRegisterUser(dto.getRegisterUser());
        }
        if (needsMapping(dto, dto.getUpdateDatetime(), "updateDatetime") && !exceptCommonColumn) {
            entity.setUpdateDatetime(dto.getUpdateDatetime());
        }
        if (needsMapping(dto, dto.getUpdateUser(), "updateUser") && !exceptCommonColumn) {
            entity.setUpdateUser(dto.getUpdateUser());
        }
        if (needsMapping(dto, dto.getVersionNo(), "versionNo")) {
            entity.setVersionNo(dto.getVersionNo());
        }
        reflectDerivedProperty(entity, dto, false);
        if (instanceCache && entity.hasPrimaryKeyValue()) { // caches only an entity that has a primary key value
            _relationEntityMap.put(localKey, entity);
        }
        boolean reverseReference = isReverseReference();
        if (!_suppressProductCategory && dto.getProductCategory() != null) {
            ProductCategoryDto relationDto = dto.getProductCategory();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                ProductCategory relationEntity = (ProductCategory)cachedEntity;
                entity.setProductCategory(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getProductList().add(entity);
                }
            } else {
                ProductCategoryDtoMapper mapper = new ProductCategoryDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressProductList();
                ProductCategory relationEntity = mapper.mappingToEntity(relationDto);
                entity.setProductCategory(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getProductList().add(entity);
                }
                if (instanceCache && entity.getProductCategory().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getProductCategory().get());
                }
            }
        };
        if (!_suppressProductStatus && dto.getProductStatus() != null) {
            ProductStatusDto relationDto = dto.getProductStatus();
            Object relationKey = createInstanceKeyDto(relationDto, relationDto.instanceHash());
            Entity cachedEntity = instanceCache ? _relationEntityMap.get(relationKey) : null;
            if (cachedEntity != null) {
                ProductStatus relationEntity = (ProductStatus)cachedEntity;
                entity.setProductStatus(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getProductList().add(entity);
                }
            } else {
                ProductStatusDtoMapper mapper = new ProductStatusDtoMapper(_relationDtoMap, _relationEntityMap);
                mapper.setExceptCommonColumn(exceptCommonColumn);
                mapper.setReverseReference(reverseReference);
                if (!instanceCache) { mapper.disableInstanceCache(); }
                mapper.suppressProductList();
                ProductStatus relationEntity = mapper.mappingToEntity(relationDto);
                entity.setProductStatus(OptionalEntity.of(relationEntity));
                if (reverseReference) {
                    relationEntity.getProductList().add(entity);
                }
                if (instanceCache && entity.getProductStatus().get().hasPrimaryKeyValue()) {
                    _relationEntityMap.put(relationKey, entity.getProductStatus().get());
                }
            }
        };
        if (!_suppressPurchaseList && !dto.getPurchaseList().isEmpty()) {
            PurchaseDtoMapper mapper = new PurchaseDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProduct();
            List<Purchase> relationEntityList = mapper.mappingToEntityList(dto.getPurchaseList());
            entity.setPurchaseList(relationEntityList);
            if (reverseReference) {
                for (Purchase relationEntity : relationEntityList) {
                    relationEntity.setProduct(OptionalEntity.of(entity));
                }
            }
        };
        if (!_suppressWhiteDeprecatedRefList && !dto.getWhiteDeprecatedRefList().isEmpty()) {
            WhiteDeprecatedRefDtoMapper mapper = new WhiteDeprecatedRefDtoMapper(_relationDtoMap, _relationEntityMap);
            mapper.setExceptCommonColumn(exceptCommonColumn);
            mapper.setReverseReference(reverseReference);
            if (!instanceCache) { mapper.disableInstanceCache(); }
            mapper.suppressProduct();
            List<WhiteDeprecatedRef> relationEntityList = mapper.mappingToEntityList(dto.getWhiteDeprecatedRefList());
            entity.setWhiteDeprecatedRefList(relationEntityList);
            if (reverseReference) {
                for (WhiteDeprecatedRef relationEntity : relationEntityList) {
                    relationEntity.setProduct(OptionalEntity.of(entity));
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
    protected boolean needsMapping(ProductDto dto, Object value, String propName) {
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
    public List<Product> mappingToEntityList(List<ProductDto> dtoList) {
        if (dtoList == null) {
            throw new IllegalArgumentException("The argument 'dtoList' should not be null.");
        }
        List<Product> entityList = new ArrayList<Product>();
        for (ProductDto dto : dtoList) {
            Product entity = mappingToEntity(dto);
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
    public void suppressProductCategory() {
        _suppressProductCategory = true;
    }
    public void suppressProductStatus() {
        _suppressProductStatus = true;
    }
    public void suppressPurchaseList() {
        _suppressPurchaseList = true;
    }
    public void suppressWhiteDeprecatedRefList() {
        _suppressWhiteDeprecatedRefList = true;
    }
    protected void doSuppressAll() { // internal
        suppressProductCategory();
        suppressProductStatus();
        suppressPurchaseList();
        suppressWhiteDeprecatedRefList();
    }
    protected void doSuppressClear() { // internal
        _suppressProductCategory = false;
        _suppressProductStatus = false;
        _suppressPurchaseList = false;
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
    public ProductDtoMapper baseOnlyMapping() {
        setBaseOnlyMapping(true);
        return (ProductDtoMapper)this;
    }

    /**
     * Enable except common column that means the mapping excepts common column.
     * @return this. (NotNull)
     */
    public ProductDtoMapper exceptCommonColumn() {
        setExceptCommonColumn(true);
        return (ProductDtoMapper)this;
    }

    /**
     * Enable reverse reference that means the mapping contains reverse references.
     * @return this. (NotNull)
     */
    public ProductDtoMapper reverseReference() {
        setReverseReference(true);
        return (ProductDtoMapper)this;
    }
}
