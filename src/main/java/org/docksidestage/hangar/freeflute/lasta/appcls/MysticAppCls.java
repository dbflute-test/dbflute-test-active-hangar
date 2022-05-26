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
package org.docksidestage.hangar.freeflute.lasta.appcls;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

import org.dbflute.exception.ClassificationNotFoundException;
import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;
import org.dbflute.optional.OptionalThing;
import org.docksidestage.hangar.dbflute.allcommon.CDef;

/**
 * The definition of mystic classification.
 * @author FreeGen
 */
public interface MysticAppCls extends Classification {

    /**
     * MemberStatus for search condition
     */
    public enum SearchMemberStatus implements MysticAppCls {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"}),
        /** All Statuses: without status filter */
        All("ALL", "All Statuses", emptyStrings());
        private static String[] emptyStrings() { return new String[0]; }
        private static ZzzoneSlimmer<SearchMemberStatus> _slimmer = new ZzzoneSlimmer<>(SearchMemberStatus.class, values());
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                _subItemMapMap.put(All.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private SearchMemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return MysticAppCls.DefMeta.SearchMemberStatus; }
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
        public static OptionalThing<SearchMemberStatus> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<SearchMemberStatus> byName(String name) { return _slimmer.byName(name); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<SearchMemberStatus> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<SearchMemberStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: SearchMemberStatus." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SearchMemberStatus> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SearchMemberStatus> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SearchMemberStatus> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        /**
         * @param refCls The DB classification to find. (NullAllowed: if null, returns empty)
         * @return The the app classification corresponding to the DB classification. (NotNull, EmptyAllowed: when null specified, not found)
         */
        public static OptionalThing<SearchMemberStatus> fromDBCls(CDef.MemberStatus refCls) {
            String refCode = refCls != null ? refCls.code() : null;
            return OptionalThing.ofNullable(of(refCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert CDef.MemberStatus to SearchMemberStatus by the referred code: " + refCode);
            });
        }
        /**
         * @return The DB classification corresponding to the app classification. (NotNull, EmptyAllowed: when no-related to DB)
         */
        public OptionalThing<CDef.MemberStatus> toDBCls() {
            String appCode = code();
            return OptionalThing.ofNullable(CDef.MemberStatus.of(appCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert SearchMemberStatus to MemberStatus by the app code: " + appCode);
            });
        }
        @Override public String toString() { return code(); }
    }

    /**
     * MemberStatus for search condition
     */
    public enum DeepWxDeprecatedCls implements MysticAppCls {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"}),
        /** All Statuses: without status filter */
        All("ALL", "All Statuses", emptyStrings());
        private static String[] emptyStrings() { return new String[0]; }
        private static ZzzoneSlimmer<DeepWxDeprecatedCls> _slimmer = new ZzzoneSlimmer<>(DeepWxDeprecatedCls.class, values());
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                _subItemMapMap.put(All.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeepWxDeprecatedCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return MysticAppCls.DefMeta.DeepWxDeprecatedCls; }
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
        public static OptionalThing<DeepWxDeprecatedCls> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxDeprecatedCls> byName(String name) { return _slimmer.byName(name); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DeepWxDeprecatedCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeepWxDeprecatedCls." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        /**
         * @param refCls The DB classification to find. (NullAllowed: if null, returns empty)
         * @return The the app classification corresponding to the DB classification. (NotNull, EmptyAllowed: when null specified, not found)
         */
        public static OptionalThing<DeepWxDeprecatedCls> fromDBCls(CDef.MemberStatus refCls) {
            String refCode = refCls != null ? refCls.code() : null;
            return OptionalThing.ofNullable(of(refCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert CDef.MemberStatus to DeepWxDeprecatedCls by the referred code: " + refCode);
            });
        }
        /**
         * @return The DB classification corresponding to the app classification. (NotNull, EmptyAllowed: when no-related to DB)
         */
        public OptionalThing<CDef.MemberStatus> toDBCls() {
            String appCode = code();
            return OptionalThing.ofNullable(CDef.MemberStatus.of(appCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert DeepWxDeprecatedCls to MemberStatus by the app code: " + appCode);
            });
        }
        @Override public String toString() { return code(); }
    }

    /**
     * MemberStatus for search condition
     */
    public enum DeepWxDeprecatedElement implements MysticAppCls {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service (deprecated: why?) */
        @Deprecated
        Provisional("PRV", "Provisional", new String[] {"Provisional"}),
        /** All Statuses: without status filter (deprecated: why?why?) */
        @Deprecated
        All("ALL", "All Statuses", emptyStrings());
        private static String[] emptyStrings() { return new String[0]; }
        private static ZzzoneSlimmer<DeepWxDeprecatedElement> _slimmer = new ZzzoneSlimmer<>(DeepWxDeprecatedElement.class, values());
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                _subItemMapMap.put(All.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeepWxDeprecatedElement(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return MysticAppCls.DefMeta.DeepWxDeprecatedElement; }
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
        public static OptionalThing<DeepWxDeprecatedElement> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxDeprecatedElement> byName(String name) { return _slimmer.byName(name); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DeepWxDeprecatedElement> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeepWxDeprecatedElement." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        /**
         * @param refCls The DB classification to find. (NullAllowed: if null, returns empty)
         * @return The the app classification corresponding to the DB classification. (NotNull, EmptyAllowed: when null specified, not found)
         */
        public static OptionalThing<DeepWxDeprecatedElement> fromDBCls(CDef.MemberStatus refCls) {
            String refCode = refCls != null ? refCls.code() : null;
            return OptionalThing.ofNullable(of(refCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert CDef.MemberStatus to DeepWxDeprecatedElement by the referred code: " + refCode);
            });
        }
        /**
         * @return The DB classification corresponding to the app classification. (NotNull, EmptyAllowed: when no-related to DB)
         */
        public OptionalThing<CDef.MemberStatus> toDBCls() {
            String appCode = code();
            return OptionalThing.ofNullable(CDef.MemberStatus.of(appCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert DeepWxDeprecatedElement to MemberStatus by the app code: " + appCode);
            });
        }
        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** MemberStatus for search condition */
        SearchMemberStatus(cd -> MysticAppCls.SearchMemberStatus.of(cd), nm -> MysticAppCls.SearchMemberStatus.byName(nm)
        , () -> MysticAppCls.SearchMemberStatus.listAll(), gp -> MysticAppCls.SearchMemberStatus.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** MemberStatus for search condition */
        DeepWxDeprecatedCls(cd -> MysticAppCls.DeepWxDeprecatedCls.of(cd), nm -> MysticAppCls.DeepWxDeprecatedCls.byName(nm)
        , () -> MysticAppCls.DeepWxDeprecatedCls.listAll(), gp -> MysticAppCls.DeepWxDeprecatedCls.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** MemberStatus for search condition */
        DeepWxDeprecatedElement(cd -> MysticAppCls.DeepWxDeprecatedElement.of(cd), nm -> MysticAppCls.DeepWxDeprecatedElement.byName(nm)
        , () -> MysticAppCls.DeepWxDeprecatedElement.listAll(), gp -> MysticAppCls.DeepWxDeprecatedElement.listByGroup(gp)
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
                return new ArrayList<>();
            }
        }

        public ClassificationCodeType codeType() { return _codeType; }
        public ClassificationUndefinedHandlingType undefinedHandlingType() { return _undefinedHandlingType; }

        public static OptionalThing<MysticAppCls.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            return OptionalThing.ofNullable(_nameMetaMap.get(classificationName.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }
        public static MysticAppCls.DefMeta meta(String classificationName) { // old style so use find(name)
            return find(classificationName).orElse(null);
        }
    }

    public static class ZzzoneSlimmer<CLS extends MysticAppCls> {

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
                @SuppressWarnings("unchecked")
                CLS cls = ((OptionalThing<CLS>) code).orElse(null);
                return of(cls.code());
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
