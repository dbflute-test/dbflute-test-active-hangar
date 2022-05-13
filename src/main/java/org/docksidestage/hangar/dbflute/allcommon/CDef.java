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

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import org.dbflute.exception.ClassificationNotFoundException;
import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;
import org.dbflute.optional.OptionalThing;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface CDef extends Classification {

    /**
     * general boolean classification for every flg-column
     */
    public enum Flg implements CDef {
        /** Yes: means valid */
        True("1", "Yes", new String[] {"true"}),
        /** No: means invalid */
        False("0", "No", new String[] {"false"});
        private static ZzzoneSlimmer<Flg> _slimmer = new ZzzoneSlimmer<>(Flg.class, values());
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "value1");
                _subItemMapMap.put(True.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "value1");
                _subItemMapMap.put(False.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private Flg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.Flg; }
        public String key1() {
            return (String)subItemMap().get("key1");
        }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Flg> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Flg> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flg codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<Flg> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<Flg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: Flg." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * status of member from entry to withdrawal
     */
    public enum MemberStatus implements CDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"});
        private static ZzzoneSlimmer<MemberStatus> _slimmer = new ZzzoneSlimmer<>(MemberStatus.class, values());
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "1");
                subItemMap.put("desc", "as formal member, allowed to use all service");
                _subItemMapMap.put(Formalized.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "2");
                subItemMap.put("desc", "withdrawal is fixed, not allowed to use service");
                _subItemMapMap.put(Withdrawal.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "3");
                subItemMap.put("desc", "first status after entry, allowed to use only part of service");
                _subItemMapMap.put(Provisional.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private MemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.MemberStatus; }
        public String order() {
            return (String)subItemMap().get("order");
        }
        public String desc() {
            return (String)subItemMap().get("desc");
        }
        /**
         * Is the classification in the group? <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() { return Withdrawal.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return isShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return isUnauthorized(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<MemberStatus> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<MemberStatus> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<MemberStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: MemberStatus." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * rank of service member gets
     */
    public enum ServiceRank implements CDef {
        /** PLATINUM: platinum rank */
        Platinum("PLT", "PLATINUM"),
        /** GOLD: gold rank */
        Gold("GLD", "GOLD"),
        /** SILVER: silver rank */
        Silver("SIL", "SILVER"),
        /** BRONZE: bronze rank */
        Bronze("BRZ", "BRONZE"),
        /** PLASTIC: plastic rank */
        Plastic("PLS", "PLASTIC");
        private static ZzzoneSlimmer<ServiceRank> _slimmer = new ZzzoneSlimmer<>(ServiceRank.class, values());
        private String _code; private String _alias;
        private ServiceRank(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.ServiceRank; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<ServiceRank> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<ServiceRank> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<ServiceRank> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<ServiceRank> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: ServiceRank." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * mainly region of member address
     */
    public enum Region implements CDef {
        /** AMERICA */
        America("1", "AMERICA"),
        /** CANADA */
        Canada("2", "CANADA"),
        /** CHINA */
        China("3", "CHINA"),
        /** CHIBA */
        Chiba("4", "CHIBA");
        private static ZzzoneSlimmer<Region> _slimmer = new ZzzoneSlimmer<>(Region.class, values());
        private String _code; private String _alias;
        private Region(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.Region; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Region> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<Region> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Region codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<Region> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<Region> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: Region." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * reason for member withdrawal
     */
    public enum WithdrawalReason implements CDef {
        /** SIT: サイトが使いにくいから */
        Sit("SIT", "SIT", new String[] {"1"}),
        /** PRD: 商品に魅力がないから */
        Prd("PRD", "PRD", new String[] {"2"}),
        /** FRT: フリテンだから */
        Frt("FRT", "FRT", new String[] {"3"}),
        /** OTH: その他理由 */
        Oth("OTH", "OTH", new String[] {"4"});
        private static ZzzoneSlimmer<WithdrawalReason> _slimmer = new ZzzoneSlimmer<>(WithdrawalReason.class, values());
        private String _code; private String _alias; private Set<String> _sisterSet;
        private WithdrawalReason(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.WithdrawalReason; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WithdrawalReason> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WithdrawalReason> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WithdrawalReason codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WithdrawalReason> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<WithdrawalReason> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: WithdrawalReason." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * category of product. self reference
     */
    public enum ProductCategory implements CDef {
        /** 音楽 */
        音楽("MSC", "音楽"),
        /** 食品 */
        食品("FOD", "食品"),
        /** ハーブ: of 食品 */
        ハーブ("HEB", "ハーブ"),
        /** 音楽CD: of 音楽 */
        音楽cd("MCD", "音楽CD"),
        /** 楽器: of 音楽 */
        楽器("INS", "楽器");
        private static ZzzoneSlimmer<ProductCategory> _slimmer = new ZzzoneSlimmer<>(ProductCategory.class, values());
        private String _code; private String _alias;
        private ProductCategory(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.ProductCategory; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<ProductCategory> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<ProductCategory> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductCategory codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<ProductCategory> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<ProductCategory> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: ProductCategory." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * status for product
     */
    public enum ProductStatus implements CDef {
        /** 生産販売可能 */
        生産販売可能("ONS", "生産販売可能"),
        /** 生産中止 */
        生産中止("PST", "生産中止"),
        /** 販売中止 */
        販売中止("SST", "販売中止");
        private static ZzzoneSlimmer<ProductStatus> _slimmer = new ZzzoneSlimmer<>(ProductStatus.class, values());
        private String _code; private String _alias;
        private ProductStatus(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.ProductStatus; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<ProductStatus> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<ProductStatus> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<ProductStatus> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<ProductStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: ProductStatus." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * method of payment for purchase
     */
    public enum PaymentMethod implements CDef {
        /** by hand: payment by hand, face-to-face */
        ByHand("HAN", "by hand"),
        /** bank transfer: bank transfer payment */
        BankTransfer("BAK", "bank transfer"),
        /** credit card: credit card payment */
        CreditCard("CRC", "credit card");
        private static ZzzoneSlimmer<PaymentMethod> _slimmer = new ZzzoneSlimmer<>(PaymentMethod.class, values());
        private String _code; private String _alias;
        private PaymentMethod(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.PaymentMethod; }
        /**
         * Is the classification in the group? <br>
         * the most recommended method <br>
         * The group elements:[ByHand]
         * @return The determination, true or false.
         */
        public boolean isRecommended() { return ByHand.equals(this); }
        public boolean inGroup(String groupName) {
            if ("recommended".equalsIgnoreCase(groupName)) { return isRecommended(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<PaymentMethod> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<PaymentMethod> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<PaymentMethod> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<PaymentMethod> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("recommended".equalsIgnoreCase(groupName)) { return listOfRecommended(); }
            throw new ClassificationNotFoundException("Unknown classification group: PaymentMethod." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * the most recommended method <br>
         * The group elements:[ByHand]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<PaymentMethod> listOfRecommended() {
            return new ArrayList<>(Arrays.asList(ByHand));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of deployment
     */
    public enum WhiteClassifiationDeploymentType implements CDef {
        /** sea */
        Sea("SEA", "sea"),
        /** land */
        Land("LAN", "land");
        private static ZzzoneSlimmer<WhiteClassifiationDeploymentType> _slimmer = new ZzzoneSlimmer<>(WhiteClassifiationDeploymentType.class, values());
        private String _code; private String _alias;
        private WhiteClassifiationDeploymentType(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.WhiteClassifiationDeploymentType; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WhiteClassifiationDeploymentType> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WhiteClassifiationDeploymentType> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WhiteClassifiationDeploymentType codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WhiteClassifiationDeploymentType> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<WhiteClassifiationDeploymentType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: WhiteClassifiationDeploymentType." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of various options when table classification
     */
    public enum WhiteTableOptionStatus implements CDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"1"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"2"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"3"});
        private static ZzzoneSlimmer<WhiteTableOptionStatus> _slimmer = new ZzzoneSlimmer<>(WhiteTableOptionStatus.class, values());
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "1");
                subItemMap.put("key2", "as formal member, allowed to use all service");
                _subItemMapMap.put(Formalized.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "2");
                subItemMap.put("key2", "withdrawal is fixed, not allowed to use service");
                _subItemMapMap.put(Withdrawal.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "3");
                subItemMap.put("key2", "first status after entry, allowed to use only part of service");
                _subItemMapMap.put(Provisional.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private WhiteTableOptionStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.WhiteTableOptionStatus; }
        public String key1() {
            return (String)subItemMap().get("key1");
        }
        public String key2() {
            return (String)subItemMap().get("key2");
        }
        /**
         * Is the classification in the group? <br>
         * can use service <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WhiteTableOptionStatus> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<WhiteTableOptionStatus> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WhiteTableOptionStatus codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WhiteTableOptionStatus> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<WhiteTableOptionStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            throw new ClassificationNotFoundException("Unknown classification group: WhiteTableOptionStatus." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * can use service <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<WhiteTableOptionStatus> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * the test of reference variable in grouping map
     */
    public enum GroupingReference implements CDef {
        /** LAND_NAME */
        LAND_NAME("LND", "LAND_NAME"),
        /** SEA_NAME */
        SEA_NAME("SEA", "SEA_NAME"),
        /** IKSPIARY_NAME */
        IKSPIARY_NAME("IKS", "IKSPIARY_NAME"),
        /** AMPHI_NAME */
        AMPHI_NAME("AMP", "AMPHI_NAME");
        private static ZzzoneSlimmer<GroupingReference> _slimmer = new ZzzoneSlimmer<>(GroupingReference.class, values());
        private String _code; private String _alias;
        private GroupingReference(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.GroupingReference; }
        /**
         * Is the classification in the group? <br>
         * サービスが利用できる会員 <br>
         * The group elements:[LAND_NAME, SEA_NAME]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return LAND_NAME.equals(this) || SEA_NAME.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isServicePlus() { return LAND_NAME.equals(this) || SEA_NAME.equals(this) || IKSPIARY_NAME.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isNestedPlus() { return AMPHI_NAME.equals(this) || LAND_NAME.equals(this) || SEA_NAME.equals(this) || IKSPIARY_NAME.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isOneDef() { return IKSPIARY_NAME.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isDupRef() { return LAND_NAME.equals(this) || SEA_NAME.equals(this) || IKSPIARY_NAME.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("servicePlus".equalsIgnoreCase(groupName)) { return isServicePlus(); }
            if ("nestedPlus".equalsIgnoreCase(groupName)) { return isNestedPlus(); }
            if ("oneDef".equalsIgnoreCase(groupName)) { return isOneDef(); }
            if ("dupRef".equalsIgnoreCase(groupName)) { return isDupRef(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<GroupingReference> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<GroupingReference> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static GroupingReference codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<GroupingReference> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<GroupingReference> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("servicePlus".equalsIgnoreCase(groupName)) { return listOfServicePlus(); }
            if ("nestedPlus".equalsIgnoreCase(groupName)) { return listOfNestedPlus(); }
            if ("oneDef".equalsIgnoreCase(groupName)) { return listOfOneDef(); }
            if ("dupRef".equalsIgnoreCase(groupName)) { return listOfDupRef(); }
            throw new ClassificationNotFoundException("Unknown classification group: GroupingReference." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * サービスが利用できる会員 <br>
         * The group elements:[LAND_NAME, SEA_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(LAND_NAME, SEA_NAME));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfServicePlus() {
            return new ArrayList<>(Arrays.asList(LAND_NAME, SEA_NAME, IKSPIARY_NAME));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfNestedPlus() {
            return new ArrayList<>(Arrays.asList(AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfOneDef() {
            return new ArrayList<>(Arrays.asList(IKSPIARY_NAME));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfDupRef() {
            return new ArrayList<>(Arrays.asList(LAND_NAME, SEA_NAME, IKSPIARY_NAME));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * is deprecated classification
     */
    @Deprecated
    public enum DeprecatedTopBasicType implements CDef {
        /** FooName */
        FooName("FOO", "FooName"),
        /** BarName */
        BarName("BAR", "BarName"),
        /** QuxName */
        QuxName("QUX", "QuxName");
        private static ZzzoneSlimmer<DeprecatedTopBasicType> _slimmer = new ZzzoneSlimmer<>(DeprecatedTopBasicType.class, values());
        private String _code; private String _alias;
        private DeprecatedTopBasicType(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.DeprecatedTopBasicType; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeprecatedTopBasicType> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeprecatedTopBasicType> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedTopBasicType codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeprecatedTopBasicType> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DeprecatedTopBasicType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: DeprecatedTopBasicType." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * has deprecated element
     */
    public enum DeprecatedMapBasicType implements CDef {
        /** FooName */
        FooName("FOO", "FooName"),
        /** BarName: (deprecated: test of deprecated) */
        @Deprecated
        BarName("BAR", "BarName"),
        /** QuxName */
        QuxName("QUX", "QuxName");
        private static ZzzoneSlimmer<DeprecatedMapBasicType> _slimmer = new ZzzoneSlimmer<>(DeprecatedMapBasicType.class, values());
        private String _code; private String _alias;
        private DeprecatedMapBasicType(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.DeprecatedMapBasicType; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeprecatedMapBasicType> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeprecatedMapBasicType> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapBasicType codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeprecatedMapBasicType> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DeprecatedMapBasicType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: DeprecatedMapBasicType." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * has deprecated element
     */
    public enum DeprecatedMapCollaborationType implements CDef {
        /** FooName */
        FooName("FOO", "FooName"),
        /** BarBar: here (deprecated: test of deprecated) */
        @Deprecated
        BarName("BAR", "BarBar"),
        /** QuxQux: (deprecated: no original comment) */
        @Deprecated
        QuxName("QUX", "QuxQux");
        private static ZzzoneSlimmer<DeprecatedMapCollaborationType> _slimmer = new ZzzoneSlimmer<>(DeprecatedMapCollaborationType.class, values());
        private String _code; private String _alias;
        private DeprecatedMapCollaborationType(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.DeprecatedMapCollaborationType; }
        /**
         * Is the classification in the group? <br>
         * contains deprecated element here <br>
         * The group elements:[FooName, BarName]
         * @return The determination, true or false.
         */
        public boolean isContainsDeprecated() { return FooName.equals(this) || BarName.equals(this); }
        public boolean inGroup(String groupName) {
            if ("containsDeprecated".equalsIgnoreCase(groupName)) { return isContainsDeprecated(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeprecatedMapCollaborationType> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeprecatedMapCollaborationType> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapCollaborationType codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DeprecatedMapCollaborationType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("containsDeprecated".equalsIgnoreCase(groupName)) { return listOfContainsDeprecated(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeprecatedMapCollaborationType." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * contains deprecated element here <br>
         * The group elements:[FooName, BarName]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> listOfContainsDeprecated() {
            return new ArrayList<>(Arrays.asList(FooName, BarName));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * The test of top only
     */
    public enum TopCommentOnly implements CDef {
        ;
        private static ZzzoneSlimmer<TopCommentOnly> _slimmer = new ZzzoneSlimmer<>(TopCommentOnly.class, values());
        private String _code; private String _alias;
        private TopCommentOnly(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.TopCommentOnly; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<TopCommentOnly> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<TopCommentOnly> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static TopCommentOnly codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<TopCommentOnly> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<TopCommentOnly> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: TopCommentOnly." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * the test of sub-item map for implicit classification
     */
    public enum SubItemImplicit implements CDef {
        /** Aaa: means foo */
        Foo("FOO", "Aaa"),
        /** Bbb: means bar */
        Bar("BAR", "Bbb");
        private static ZzzoneSlimmer<SubItemImplicit> _slimmer = new ZzzoneSlimmer<>(SubItemImplicit.class, values());
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("regularStringItem", "value1<tag>");
                subItemMap.put("regularNumberItem", "123");
                subItemMap.put("regularVariousItem", "list:{\n    ; reg\n    ; var\n    ; ite\n}");
                subItemMap.put("listItem", "list:{\n    ; aa\n    ; bb\n    ; cc\n}");
                _subItemMapMap.put(Foo.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("regularStringItem", "value2<teg>");
                subItemMap.put("regularNumberItem", "456");
                subItemMap.put("regularVariousItem", "map:{\n    ; reg = var\n    ; ous = ite\n}");
                subItemMap.put("mapItem", "map:{\n    ; key11 = value11\n}");
                subItemMap.put("containsLine", "va\nlue");
                _subItemMapMap.put(Bar.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias;
        private SubItemImplicit(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.SubItemImplicit; }
        public String regularStringItem() {
            return (String)subItemMap().get("regularStringItem");
        }
        public String regularNumberItem() {
            return (String)subItemMap().get("regularNumberItem");
        }
        public Object regularVariousItem() {
            return subItemMap().get("regularVariousItem");
        }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<SubItemImplicit> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<SubItemImplicit> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SubItemImplicit codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<SubItemImplicit> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<SubItemImplicit> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: SubItemImplicit." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * the test of sub-item map for table classification
     */
    public enum SubItemTable implements CDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized"),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal"),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional");
        private static ZzzoneSlimmer<SubItemTable> _slimmer = new ZzzoneSlimmer<>(SubItemTable.class, values());
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "1");
                subItemMap.put("key2", "Formalized");
                subItemMap.put("key3", null);
                _subItemMapMap.put(Formalized.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "2");
                subItemMap.put("key2", "Withdrawal");
                subItemMap.put("key3", null);
                _subItemMapMap.put(Withdrawal.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "3");
                subItemMap.put("key2", "Provisional");
                subItemMap.put("key3", null);
                _subItemMapMap.put(Provisional.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias;
        private SubItemTable(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return CDef.DefMeta.SubItemTable; }
        public String key1() {
            return (String)subItemMap().get("key1");
        }
        public String key2() {
            return (String)subItemMap().get("key2");
        }
        public String key3() {
            return (String)subItemMap().get("key3");
        }
        /**
         * Is the classification in the group? <br>
         * サービスが利用できる会員 <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Withdrawal]
         * @return The determination, true or false.
         */
        public boolean isLastestStatus() { return Withdrawal.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("lastestStatus".equalsIgnoreCase(groupName)) { return isLastestStatus(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<SubItemTable> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<SubItemTable> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SubItemTable codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<SubItemTable> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<SubItemTable> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("lastestStatus".equalsIgnoreCase(groupName)) { return listOfLastestStatus(); }
            throw new ClassificationNotFoundException("Unknown classification group: SubItemTable." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * サービスが利用できる会員 <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> listOfLastestStatus() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * boolean classification for boolean column
     */
    public enum BooleanFlg implements CDef {
        /** Checked: means yes */
        True("true", "Checked"),
        /** Unchecked: means no */
        False("false", "Unchecked");
        private static ZzzoneSlimmer<BooleanFlg> _slimmer = new ZzzoneSlimmer<>(BooleanFlg.class, values());
        private String _code; private String _alias;
        private BooleanFlg(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.BooleanFlg; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<BooleanFlg> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<BooleanFlg> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static BooleanFlg codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<BooleanFlg> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<BooleanFlg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: BooleanFlg." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * master type of variant relation (biz-many-to-one)
     */
    public enum VariantRelationMasterType implements CDef {
        /** FooCls */
        FooCls("FOO", "FooCls"),
        /** BarCls */
        BarCls("BAR", "BarCls"),
        /** QuxCls */
        QuxCls("QUX", "QuxCls"),
        /** CorgeCls */
        CorgeCls("CORGE", "CorgeCls");
        private static ZzzoneSlimmer<VariantRelationMasterType> _slimmer = new ZzzoneSlimmer<>(VariantRelationMasterType.class, values());
        private String _code; private String _alias;
        private VariantRelationMasterType(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.VariantRelationMasterType; }
        /**
         * Is the classification in the group? <br>
         * Foo or Bar or Qux <br>
         * The group elements:[FooCls, BarCls, QuxCls]
         * @return The determination, true or false.
         */
        public boolean isFooBarQux() { return FooCls.equals(this) || BarCls.equals(this) || QuxCls.equals(this); }
        public boolean inGroup(String groupName) {
            if ("fooBarQux".equalsIgnoreCase(groupName)) { return isFooBarQux(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<VariantRelationMasterType> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<VariantRelationMasterType> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationMasterType codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<VariantRelationMasterType> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<VariantRelationMasterType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("fooBarQux".equalsIgnoreCase(groupName)) { return listOfFooBarQux(); }
            throw new ClassificationNotFoundException("Unknown classification group: VariantRelationMasterType." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Foo or Bar or Qux <br>
         * The group elements:[FooCls, BarCls, QuxCls]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<VariantRelationMasterType> listOfFooBarQux() {
            return new ArrayList<>(Arrays.asList(FooCls, BarCls, QuxCls));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * qux type of variant relation (biz-many-to-one)
     */
    public enum VariantRelationQuxType implements CDef {
        /** Qua */
        Qua("Qua", "Qua"),
        /** Que */
        Que("Que", "Que"),
        /** Quo */
        Quo("Quo", "Quo");
        private static ZzzoneSlimmer<VariantRelationQuxType> _slimmer = new ZzzoneSlimmer<>(VariantRelationQuxType.class, values());
        private String _code; private String _alias;
        private VariantRelationQuxType(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.VariantRelationQuxType; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<VariantRelationQuxType> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<VariantRelationQuxType> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationQuxType codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<VariantRelationQuxType> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<VariantRelationQuxType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: VariantRelationQuxType." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * merged
     */
    public enum QuxCls implements CDef {
        /** Merged: merged qux element */
        Merged("MRG", "Merged");
        private static ZzzoneSlimmer<QuxCls> _slimmer = new ZzzoneSlimmer<>(QuxCls.class, values());
        private String _code; private String _alias;
        private QuxCls(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.QuxCls; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<QuxCls> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<QuxCls> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static QuxCls codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<QuxCls> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<QuxCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: QuxCls." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * delimiter; &amp; endBrace} &amp; path\foo\bar
     */
    public enum EscapedDfpropCls implements CDef {
        /** First: delimiter &amp; rear escape char */
        First(";@\\", "First"),
        /** Second: escape char &amp; endBrace &amp; delimiter */
        Second("\\};", "Second"),
        /** Third: startBrace &amp; equal &amp; endBrace */
        Third("{=}", "Third");
        private static ZzzoneSlimmer<EscapedDfpropCls> _slimmer = new ZzzoneSlimmer<>(EscapedDfpropCls.class, values());
        private String _code; private String _alias;
        private EscapedDfpropCls(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.EscapedDfpropCls; }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<EscapedDfpropCls> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<EscapedDfpropCls> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static EscapedDfpropCls codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<EscapedDfpropCls> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<EscapedDfpropCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: EscapedDfpropCls." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     */
    public enum EscapedJavaDocCls implements CDef {
        /** First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&amp; */
        First("FOO", "First"),
        /** Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&amp; */
        Second("BAR", "Second");
        private static ZzzoneSlimmer<EscapedJavaDocCls> _slimmer = new ZzzoneSlimmer<>(EscapedJavaDocCls.class, values());
        private String _code; private String _alias;
        private EscapedJavaDocCls(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.EscapedJavaDocCls; }
        /**
         * Is the classification in the group? <br>
         * /*IF pmb.yourGroup&#42;/&gt;&lt;&amp; <br>
         * The group elements:[First, Second]
         * @return The determination, true or false.
         */
        public boolean isLineGroup() { return First.equals(this) || Second.equals(this); }
        public boolean inGroup(String groupName) {
            if ("lineGroup".equalsIgnoreCase(groupName)) { return isLineGroup(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<EscapedJavaDocCls> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<EscapedJavaDocCls> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static EscapedJavaDocCls codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<EscapedJavaDocCls> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<EscapedJavaDocCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("lineGroup".equalsIgnoreCase(groupName)) { return listOfLineGroup(); }
            throw new ClassificationNotFoundException("Unknown classification group: EscapedJavaDocCls." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * /*IF pmb.yourGroup&#42;/&gt;&lt;&amp; <br>
         * The group elements:[First, Second]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<EscapedJavaDocCls> listOfLineGroup() {
            return new ArrayList<>(Arrays.asList(First, Second));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * top first line            top second line            top third line
     */
    public enum LineSepCommentCls implements CDef {
        /** First: foo first line            foo second line */
        First("FOO", "First"),
        /** Second: bar first line            bar second line */
        Second("BAR", "Second");
        private static ZzzoneSlimmer<LineSepCommentCls> _slimmer = new ZzzoneSlimmer<>(LineSepCommentCls.class, values());
        private String _code; private String _alias;
        private LineSepCommentCls(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return CDef.DefMeta.LineSepCommentCls; }
        /**
         * Is the classification in the group? <br>
         * group first line                    group second line <br>
         * The group elements:[First, Second]
         * @return The determination, true or false.
         */
        public boolean isLineGroup() { return First.equals(this) || Second.equals(this); }
        public boolean inGroup(String groupName) {
            if ("lineGroup".equalsIgnoreCase(groupName)) { return isLineGroup(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<LineSepCommentCls> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<LineSepCommentCls> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static LineSepCommentCls codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<LineSepCommentCls> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<LineSepCommentCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("lineGroup".equalsIgnoreCase(groupName)) { return listOfLineGroup(); }
            throw new ClassificationNotFoundException("Unknown classification group: LineSepCommentCls." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * group first line                    group second line <br>
         * The group elements:[First, Second]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<LineSepCommentCls> listOfLineGroup() {
            return new ArrayList<>(Arrays.asList(First, Second));
        }
        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** general boolean classification for every flg-column */
        Flg(cd -> CDef.Flg.of(cd), nm -> CDef.Flg.byName(nm)
        , () -> CDef.Flg.listAll(), gp -> CDef.Flg.listByGroup(gp)
        , ClassificationCodeType.Number, ClassificationUndefinedHandlingType.EXCEPTION),

        /** status of member from entry to withdrawal */
        MemberStatus(cd -> CDef.MemberStatus.of(cd), nm -> CDef.MemberStatus.byName(nm)
        , () -> CDef.MemberStatus.listAll(), gp -> CDef.MemberStatus.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** rank of service member gets */
        ServiceRank(cd -> CDef.ServiceRank.of(cd), nm -> CDef.ServiceRank.byName(nm)
        , () -> CDef.ServiceRank.listAll(), gp -> CDef.ServiceRank.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** mainly region of member address */
        Region(cd -> CDef.Region.of(cd), nm -> CDef.Region.byName(nm)
        , () -> CDef.Region.listAll(), gp -> CDef.Region.listByGroup(gp)
        , ClassificationCodeType.Number, ClassificationUndefinedHandlingType.ALLOWED),

        /** reason for member withdrawal */
        WithdrawalReason(cd -> CDef.WithdrawalReason.of(cd), nm -> CDef.WithdrawalReason.byName(nm)
        , () -> CDef.WithdrawalReason.listAll(), gp -> CDef.WithdrawalReason.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** category of product. self reference */
        ProductCategory(cd -> CDef.ProductCategory.of(cd), nm -> CDef.ProductCategory.byName(nm)
        , () -> CDef.ProductCategory.listAll(), gp -> CDef.ProductCategory.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** status for product */
        ProductStatus(cd -> CDef.ProductStatus.of(cd), nm -> CDef.ProductStatus.byName(nm)
        , () -> CDef.ProductStatus.listAll(), gp -> CDef.ProductStatus.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** method of payment for purchase */
        PaymentMethod(cd -> CDef.PaymentMethod.of(cd), nm -> CDef.PaymentMethod.byName(nm)
        , () -> CDef.PaymentMethod.listAll(), gp -> CDef.PaymentMethod.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** test of deployment */
        WhiteClassifiationDeploymentType(cd -> CDef.WhiteClassifiationDeploymentType.of(cd), nm -> CDef.WhiteClassifiationDeploymentType.byName(nm)
        , () -> CDef.WhiteClassifiationDeploymentType.listAll(), gp -> CDef.WhiteClassifiationDeploymentType.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** test of various options when table classification */
        WhiteTableOptionStatus(cd -> CDef.WhiteTableOptionStatus.of(cd), nm -> CDef.WhiteTableOptionStatus.byName(nm)
        , () -> CDef.WhiteTableOptionStatus.listAll(), gp -> CDef.WhiteTableOptionStatus.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** the test of reference variable in grouping map */
        GroupingReference(cd -> CDef.GroupingReference.of(cd), nm -> CDef.GroupingReference.byName(nm)
        , () -> CDef.GroupingReference.listAll(), gp -> CDef.GroupingReference.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** is deprecated classification */
        DeprecatedTopBasicType(cd -> CDef.DeprecatedTopBasicType.of(cd), nm -> CDef.DeprecatedTopBasicType.byName(nm)
        , () -> CDef.DeprecatedTopBasicType.listAll(), gp -> CDef.DeprecatedTopBasicType.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** has deprecated element */
        DeprecatedMapBasicType(cd -> CDef.DeprecatedMapBasicType.of(cd), nm -> CDef.DeprecatedMapBasicType.byName(nm)
        , () -> CDef.DeprecatedMapBasicType.listAll(), gp -> CDef.DeprecatedMapBasicType.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** has deprecated element */
        DeprecatedMapCollaborationType(cd -> CDef.DeprecatedMapCollaborationType.of(cd), nm -> CDef.DeprecatedMapCollaborationType.byName(nm)
        , () -> CDef.DeprecatedMapCollaborationType.listAll(), gp -> CDef.DeprecatedMapCollaborationType.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** The test of top only */
        TopCommentOnly(cd -> CDef.TopCommentOnly.of(cd), nm -> CDef.TopCommentOnly.byName(nm)
        , () -> CDef.TopCommentOnly.listAll(), gp -> CDef.TopCommentOnly.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** the test of sub-item map for implicit classification */
        SubItemImplicit(cd -> CDef.SubItemImplicit.of(cd), nm -> CDef.SubItemImplicit.byName(nm)
        , () -> CDef.SubItemImplicit.listAll(), gp -> CDef.SubItemImplicit.listByGroup(gp)
        , ClassificationCodeType.Number, ClassificationUndefinedHandlingType.EXCEPTION),

        /** the test of sub-item map for table classification */
        SubItemTable(cd -> CDef.SubItemTable.of(cd), nm -> CDef.SubItemTable.byName(nm)
        , () -> CDef.SubItemTable.listAll(), gp -> CDef.SubItemTable.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** boolean classification for boolean column */
        BooleanFlg(cd -> CDef.BooleanFlg.of(cd), nm -> CDef.BooleanFlg.byName(nm)
        , () -> CDef.BooleanFlg.listAll(), gp -> CDef.BooleanFlg.listByGroup(gp)
        , ClassificationCodeType.Boolean, ClassificationUndefinedHandlingType.LOGGING),

        /** master type of variant relation (biz-many-to-one) */
        VariantRelationMasterType(cd -> CDef.VariantRelationMasterType.of(cd), nm -> CDef.VariantRelationMasterType.byName(nm)
        , () -> CDef.VariantRelationMasterType.listAll(), gp -> CDef.VariantRelationMasterType.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** qux type of variant relation (biz-many-to-one) */
        VariantRelationQuxType(cd -> CDef.VariantRelationQuxType.of(cd), nm -> CDef.VariantRelationQuxType.byName(nm)
        , () -> CDef.VariantRelationQuxType.listAll(), gp -> CDef.VariantRelationQuxType.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.EXCEPTION),

        /** merged */
        QuxCls(cd -> CDef.QuxCls.of(cd), nm -> CDef.QuxCls.byName(nm)
        , () -> CDef.QuxCls.listAll(), gp -> CDef.QuxCls.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** delimiter; &amp; endBrace} &amp; path\foo\bar */
        EscapedDfpropCls(cd -> CDef.EscapedDfpropCls.of(cd), nm -> CDef.EscapedDfpropCls.byName(nm)
        , () -> CDef.EscapedDfpropCls.listAll(), gp -> CDef.EscapedDfpropCls.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** /*IF pmb.yourTop&#42;/&gt;&lt;&amp; */
        EscapedJavaDocCls(cd -> CDef.EscapedJavaDocCls.of(cd), nm -> CDef.EscapedJavaDocCls.byName(nm)
        , () -> CDef.EscapedJavaDocCls.listAll(), gp -> CDef.EscapedJavaDocCls.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** top first line            top second line            top third line */
        LineSepCommentCls(cd -> CDef.LineSepCommentCls.of(cd), nm -> CDef.LineSepCommentCls.byName(nm)
        , () -> CDef.LineSepCommentCls.listAll(), gp -> CDef.LineSepCommentCls.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING);

        private static final Map<String, DefMeta> _nameMetaMap = new HashMap<>();
        static {
            for (DefMeta value : values()) {
                _nameMetaMap.put(value.name().toLowerCase(), value);
            }
        }
        private final Function<Object, OptionalThing<? extends Classification>> _ofCall;
        private final Function<String, OptionalThing<? extends Classification>> _byNameCall;
        private final Supplier<List<? extends Classification>> _listAllCall;
        private final Function<String, List<? extends Classification>> _listByGroupCall;
        private final ClassificationCodeType _codeType;
        private final ClassificationUndefinedHandlingType _undefinedHandlingType;
        private DefMeta(Function<Object, OptionalThing<? extends Classification>> ofCall
                      , Function<String, OptionalThing<? extends Classification>> byNameCall
                      , Supplier<List<? extends Classification>> listAllCall
                      , Function<String, List<? extends Classification>> listByGroupCall
                      , ClassificationCodeType codeType
                      , ClassificationUndefinedHandlingType undefinedHandlingType
                ) {
            _ofCall = ofCall;
            _byNameCall = byNameCall;
            _listAllCall = listAllCall;
            _listByGroupCall = listByGroupCall;
            _codeType = codeType;
            _undefinedHandlingType = undefinedHandlingType;
        }
        public String classificationName() { return name(); } // same as definition name

        public OptionalThing<? extends Classification> of(Object code) { return _ofCall.apply(code); }
        public OptionalThing<? extends Classification> byName(String name) { return _byNameCall.apply(name); }

        public Classification codeOf(Object code) // null allowed, old style
        { return of(code).orElse(null); }
        public Classification nameOf(String name) { // null allowed, old style
            if (name == null) { return null; } // for compatible
            return byName(name).orElse(null); // case insensitive
        }

        public List<Classification> listAll()
        { return toClsList(_listAllCall.get()); }
        public List<Classification> listByGroup(String groupName) // exception if not found
        { return toClsList(_listByGroupCall.apply(groupName)); }

        @SuppressWarnings("unchecked")
        private List<Classification> toClsList(List<?> clsList) { return (List<Classification>)clsList; }

        public List<Classification> listOf(Collection<String> codeList) { // copied from slimmer, old style
            if (codeList == null) {
                throw new IllegalArgumentException("The argument 'codeList' should not be null.");
            }
            List<Classification> clsList = new ArrayList<>(codeList.size());
            for (String code : codeList) {
                clsList.add(of(code).get());
            }
            return clsList;
        }
        public List<Classification> groupOf(String groupName) { // empty if not found, old style
            try {
                return listByGroup(groupName); // case insensitive
            } catch (IllegalArgumentException | ClassificationNotFoundException e) {
                return new ArrayList<>(); // null or not found
            }
        }

        public ClassificationCodeType codeType() { return _codeType; }
        public ClassificationUndefinedHandlingType undefinedHandlingType() { return _undefinedHandlingType; }

        public static OptionalThing<CDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            return OptionalThing.ofNullable(_nameMetaMap.get(classificationName.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }
        public static CDef.DefMeta meta(String classificationName) { // old style so use find(name)
            return find(classificationName).orElseTranslatingThrow(cause -> {
                return new IllegalStateException("Unknown classification: " + classificationName);
            });
        }
    }

    public static class ZzzoneSlimmer<CLS extends CDef> {

        public static Set<String> toSisterSet(String[] sisters) { // used by initializer so static
            return Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters)));
        }

        private final Class<CLS> _clsType;
        private final Map<String, CLS> _codeClsMap = new HashMap<>();
        private final Map<String, CLS> _nameClsMap = new HashMap<>();

        public ZzzoneSlimmer(Class<CLS> clsType, CLS[] values) {
            _clsType = clsType;
            initMap(values);
        }

        private void initMap(CLS[] values) {
            for (CLS value : values) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) {
                    _codeClsMap.put(sister.toLowerCase(), value);
                }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }

        public OptionalThing<CLS> of(Object code) {
            if (code == null) {
                return OptionalThing.ofNullable(null, () -> {
                    throw new ClassificationNotFoundException("null code specified");
                });
            }
            if (_clsType.isAssignableFrom(code.getClass())) {
                @SuppressWarnings("unchecked")
                CLS cls = (CLS) code;
                return OptionalThing.of(cls);
            }
            if (code instanceof OptionalThing<?>) {
                return of(((OptionalThing<?>) code).orElse(null));
            }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        public OptionalThing<CLS> byName(String name) {
            if (name == null) {
                throw new IllegalArgumentException("The argument 'name' should not be null.");
            }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        public CLS codeOf(Object code) {
            if (code == null) {
                return null;
            }
            if (_clsType.isAssignableFrom(code.getClass())) {
                @SuppressWarnings("unchecked")
                CLS cls = (CLS) code;
                return cls;
            }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        public CLS nameOf(String name, java.util.function.Function<String, CLS> valueOfCall) {
            if (name == null) {
                return null;
            }
            try {
                return valueOfCall.apply(name);
            } catch (RuntimeException ignored) { // not found
                return null;
            }
        }

        public List<CLS> listAll(CLS[] clss) {
            return new ArrayList<>(Arrays.asList(clss));
        }

        public List<CLS> listOf(Collection<String> codeList) {
            if (codeList == null) {
                throw new IllegalArgumentException("The argument 'codeList' should not be null.");
            }
            List<CLS> clsList = new ArrayList<>(codeList.size());
            for (String code : codeList) {
                clsList.add(of(code).get());
            }
            return clsList;
        }
    }
}
