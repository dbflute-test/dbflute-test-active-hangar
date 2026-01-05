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
package org.docksidestage.hangar.dbflute.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.exception.DBMetaNotFoundException;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull, LazyLoaded) */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected static final Map<Class<?>, DBMeta> _entityTypeInstanceMap = newHashMap();

    /** The map of table DB name and DB meta class name. (NotNull) */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("MEMBER", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberDbm");
        tmpMap.put("MEMBER_ADDRESS", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberAddressDbm");
        tmpMap.put("MEMBER_FOLLOWING", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberFollowingDbm");
        tmpMap.put("MEMBER_LOGIN", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberLoginDbm");
        tmpMap.put("MEMBER_SECURITY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberSecurityDbm");
        tmpMap.put("MEMBER_SERVICE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberServiceDbm");
        tmpMap.put("MEMBER_STATUS", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberStatusDbm");
        tmpMap.put("MEMBER_WITHDRAWAL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberWithdrawalDbm");
        tmpMap.put("PRODUCT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.ProductDbm");
        tmpMap.put("PRODUCT_CATEGORY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.ProductCategoryDbm");
        tmpMap.put("PRODUCT_STATUS", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.ProductStatusDbm");
        tmpMap.put("PURCHASE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.PurchaseDbm");
        tmpMap.put("PURCHASE_PAYMENT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.PurchasePaymentDbm");
        tmpMap.put("REGION", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.RegionDbm");
        tmpMap.put("SERVICE_RANK", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.ServiceRankDbm");
        tmpMap.put("SUMMARY_PRODUCT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.SummaryProductDbm");
        tmpMap.put("SUMMARY_WITHDRAWAL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.SummaryWithdrawalDbm");
        tmpMap.put("VENDOR_$_DOLLAR", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.Vendor$DollarDbm");
        tmpMap.put("VENDOR_CHECK", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.VendorCheckDbm");
        tmpMap.put("VENDOR_IDENTITY_ONLY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.VendorIdentityOnlyDbm");
        tmpMap.put("VENDOR_PRIMARY_KEY_ONLY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.VendorPrimaryKeyOnlyDbm");
        tmpMap.put("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.VendorTheLongAndWindingTableAndColumnDbm");
        tmpMap.put("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.VendorTheLongAndWindingTableAndColumnRefDbm");
        tmpMap.put("WHITE_BASE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseDbm");
        tmpMap.put("WHITE_BASE_ONE01_SEA", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne01SeaDbm");
        tmpMap.put("WHITE_BASE_ONE01_SEA_BROADWAY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne01SeaBroadwayDbm");
        tmpMap.put("WHITE_BASE_ONE01_SEA_DOCKSIDE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne01SeaDocksideDbm");
        tmpMap.put("WHITE_BASE_ONE01_SEA_HANGAR", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne01SeaHangarDbm");
        tmpMap.put("WHITE_BASE_ONE01_SEA_MAGICLAMP", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne01SeaMagiclampDbm");
        tmpMap.put("WHITE_BASE_ONE02_LAND", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne02LandDbm");
        tmpMap.put("WHITE_BASE_ONE03_PIARI", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne03PiariDbm");
        tmpMap.put("WHITE_BASE_ONE04_BONVO", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne04BonvoDbm");
        tmpMap.put("WHITE_BASE_ONE04_BONVO_PARKSIDE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne04BonvoParksideDbm");
        tmpMap.put("WHITE_BASE_ONE04_BONVO_STATIONSIDE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne04BonvoStationsideDbm");
        tmpMap.put("WHITE_BASE_ONE05_DSTORE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne05DstoreDbm");
        tmpMap.put("WHITE_BASE_ONE06_AMBA", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne06AmbaDbm");
        tmpMap.put("WHITE_BASE_ONE07_MIRACO", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne07MiracoDbm");
        tmpMap.put("WHITE_BASE_ONE08_DOHOTEL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne08DohotelDbm");
        tmpMap.put("WHITE_BASE_ONE09_PALM", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne09PalmDbm");
        tmpMap.put("WHITE_BASE_ONE10_CELEB", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne10CelebDbm");
        tmpMap.put("WHITE_BASE_ONE11_CIRQUE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne11CirqueDbm");
        tmpMap.put("WHITE_BASE_ONE12_AMPHI", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteBaseOne12AmphiDbm");
        tmpMap.put("WHITE_CLASSIFICATION_DEPLOYMENT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteClassificationDeploymentDbm");
        tmpMap.put("WHITE_COMPOUND_PK", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteCompoundPkDbm");
        tmpMap.put("WHITE_COMPOUND_PK_REF_PHYSICAL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteCompoundPkRefPhysicalDbm");
        tmpMap.put("WHITE_COMPOUND_PK_REF_VIRTUAL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteCompoundPkRefVirtualDbm");
        tmpMap.put("WHITE_DATE_TERM", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDateTermDbm");
        tmpMap.put("WHITE_DB_COMMENT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDbCommentDbm");
        tmpMap.put("WHITE_DB_COMMENT_ADDITIONAL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDbCommentAdditionalDbm");
        tmpMap.put("WHITE_DEFAULT_CONSTRAINT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDefaultConstraintDbm");
        tmpMap.put("WHITE_DEPRECATED", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDeprecatedDbm");
        tmpMap.put("WHITE_DEPRECATED_REF", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDeprecatedRefDbm");
        tmpMap.put("WHITE_DEPRECATED_SELECT_BY_PKUQ", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDeprecatedSelectByPkuqDbm");
        tmpMap.put("WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteDeprecatedSpecifyBatchColumnDbm");
        tmpMap.put("WHITE_FIRST_DATE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteFirstDateDbm");
        tmpMap.put("white_generate_name_switched", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteGenerateNameSwitchedDbm");
        tmpMap.put("WHITE_NOT_NULL", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteNotNullDbm");
        tmpMap.put("WHITE_ON_PARADE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteOnParadeDbm");
        tmpMap.put("WHITE_ON_PARADE_NULLABLE_TO_MANY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteOnParadeNullableToManyDbm");
        tmpMap.put("WHITE_ON_PARADE_REF", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteOnParadeRefDbm");
        tmpMap.put("WHITE_READ_ONLY", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteReadOnlyDbm");
        tmpMap.put("WHITE_SCHEMA_DIFF", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteSchemaDiffDbm");
        tmpMap.put("WHITE_SELF_REFERENCE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteSelfReferenceDbm");
        tmpMap.put("WHITE_SIMPLE_DTO_EXCEPT", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteSimpleDtoExceptDbm");
        tmpMap.put("WHITE_SINGLE_PK", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteSinglePkDbm");
        tmpMap.put("WHITE_TSV_LOADING", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteTsvLoadingDbm");
        tmpMap.put("WHITE_TYPE_MAPPING", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteTypeMappingDbm");
        tmpMap.put("WHITE_UNEVEN_COMMON_COLUMN_1ST", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteUnevenCommonColumn1stDbm");
        tmpMap.put("WHITE_UNEVEN_COMMON_COLUMN_2ND", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteUnevenCommonColumn2ndDbm");
        tmpMap.put("WHITE_UNEVEN_COMMON_COLUMN_3RD", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteUnevenCommonColumn3rdDbm");
        tmpMap.put("WHITE_UNEVEN_COMMON_COLUMN_4TH", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteUnevenCommonColumn4thDbm");
        tmpMap.put("WHITE_ZONE_ARRANGE", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WhiteZoneArrangeDbm");
        tmpMap.put("WITHDRAWAL_REASON", "org.docksidestage.hangar.dbflute.bsentity.dbmeta.WithdrawalReasonDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta. map:{tableDbName = DBMeta}
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
                findDBMeta(tableDbName); // initialize
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new DBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    public DBMeta provideDBMeta(Class<?> entityType) {
        return byEntityType(entityType);
    }

    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    public DBMeta provideDBMetaChecked(Class<?> entityType) {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(Class<?> entityType) {
        DBMeta dbmeta = byEntityType(entityType);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return tableDbName != null ? byTableDbName(tableDbName) : null;
    }

    protected static String retryByNormalizedName(String tableFlexibleName) {
        String tableDbName = null;
        String pureName = normalizeTableFlexibleName(tableFlexibleName);
        String schema = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected static String normalizeTableFlexibleName(String tableFlexibleName) {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected static String removeSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(dotLastIndex + ".".length()) : name;
    }

    protected static String extractSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(0, dotLastIndex) : null;
    }

    protected static String strip(String name) {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byEntityType(Class<?> entityType) {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String dbmetaName = _tableDbNameClassNameMap.get(tableDbName);
            if (dbmetaName == null) {
                return null;
            }
            _tableDbNameInstanceMap.put(tableDbName, toDBMetaInstance(dbmetaName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta toDBMetaInstance(String dbmetaName) {
        try {
            Class<?> dbmetaType = Class.forName(dbmetaName);
            Method method = dbmetaType.getMethod("getInstance", (Class[])null);
            Object result = method.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            String msg = "Failed to get the instance: " + dbmetaName;
            throw new IllegalStateException(msg, e);
        }
    }

    protected static DBMeta getCachedDBMeta(Class<?> entityType) { // lazy-load same as by-name
        DBMeta dbmeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_entityTypeInstanceMap) {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (Entity.class.isAssignableFrom(entityType)) { // required
                Entity entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.asTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected static Entity newEntity(Class<?> entityType) {
        try {
            return (Entity)entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            String msg = "Failed to new the instance: " + entityType;
            throw new IllegalStateException(msg, e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
