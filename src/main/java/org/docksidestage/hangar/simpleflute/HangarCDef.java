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
package org.docksidestage.hangar.simpleflute;

import java.util.*;

import static org.docksidestage.hangar.simpleflute.HangarCDef.XInternalCDefUtil.emptyStrings;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
public interface HangarCDef {

    /**
     * Get the code of the classification.
     * @return The code of the classification. (NotNull)
     */
    String code();

    /**
     * Get the name, means identity name, of the classification.
     * @return The name of the classification. (NotNull)
     */
    String name();

    /**
     * Get the alias, means display name, of the classification.
     * @return The code of the classification. (NullAllowed: when an alias is not specified in its setting)
     */
    String alias();

    /**
     * Get the set of sisters (alternate codes) for the classification.
     * @return The read-only set of sister code for the classification. (NotNull, EmptyAllowed)
     */
    Set<String> sisterSet();

    /**
     * Is the classification in the group?
     * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns false)
     * @return The determination, true or false. (true: this classification is in the group)
     */
    boolean inGroup(String groupName);

    /**
     * Get the map of sub items that are your original attributes.
     * @return The read-only map of sub-items. (NotNull, EmptyAllowed)
     */
    Map<String, Object> subItemMap();

    /**
     * Get the meta of the classification.
     * @return The meta of the classification. (NotNull)
     */
    DefMeta meta();

    class XInternalCDefUtil {
        private static String[] EMPTY_SISTERS = new String[]{};
        public static String[] emptyStrings() { return EMPTY_SISTERS; }
    }

    class ClassificationNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public ClassificationNotFoundException(String msg) {
            super(msg);
        }
    }

    /**
     * general boolean classification for every flg-column
     */
    public enum Flg implements HangarCDef {
        /** Yes: means valid */
        True("1", "Yes", new String[] {"true"})
        ,
        /** No: means invalid */
        False("0", "No", new String[] {"false"})
        ;
        private static final Map<String, Flg> _codeClsMap = new HashMap<String, Flg>();
        private static final Map<String, Flg> _nameClsMap = new HashMap<String, Flg>();
        static {
            for (Flg value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
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
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return HangarCDef.DefMeta.Flg; }

        public String key1() {
            return (String)subItemMap().get("key1");
        }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<Flg> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof Flg) { return Optional.of((Flg)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<Flg> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Flg codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Flg) { return (Flg)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Flg nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<Flg> listAll() {
            return new ArrayList<Flg>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<Flg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: Flg." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<Flg> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<Flg> clsList = new ArrayList<Flg>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<Flg> groupOf(String groupName) {
            return new ArrayList<Flg>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * status of member from entry to withdrawal
     */
    public enum MemberStatus implements HangarCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ;
        private static final Map<String, MemberStatus> _codeClsMap = new HashMap<String, MemberStatus>();
        private static final Map<String, MemberStatus> _nameClsMap = new HashMap<String, MemberStatus>();
        static {
            for (MemberStatus value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
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
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return HangarCDef.DefMeta.MemberStatus; }

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
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() {
            return Withdrawal.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return isShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return isUnauthorized(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<MemberStatus> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof MemberStatus) { return Optional.of((MemberStatus)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<MemberStatus> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof MemberStatus) { return (MemberStatus)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static MemberStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<MemberStatus> listAll() {
            return new ArrayList<MemberStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<MemberStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: MemberStatus." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<MemberStatus> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<MemberStatus> clsList = new ArrayList<MemberStatus>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> listOfServiceAvailable() {
            return new ArrayList<MemberStatus>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> listOfShortOfFormalized() {
            return new ArrayList<MemberStatus>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<MemberStatus> listOfUnauthorized() {
            return new ArrayList<MemberStatus>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<MemberStatus> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<MemberStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * rank of service member gets
     */
    public enum ServiceRank implements HangarCDef {
        /** PLATINUM: platinum rank */
        Platinum("PLT", "PLATINUM", emptyStrings())
        ,
        /** GOLD: gold rank */
        Gold("GLD", "GOLD", emptyStrings())
        ,
        /** SILVER: silver rank */
        Silver("SIL", "SILVER", emptyStrings())
        ,
        /** BRONZE: bronze rank */
        Bronze("BRZ", "BRONZE", emptyStrings())
        ,
        /** PLASTIC: plastic rank */
        Plastic("PLS", "PLASTIC", emptyStrings())
        ;
        private static final Map<String, ServiceRank> _codeClsMap = new HashMap<String, ServiceRank>();
        private static final Map<String, ServiceRank> _nameClsMap = new HashMap<String, ServiceRank>();
        static {
            for (ServiceRank value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private ServiceRank(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.ServiceRank; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<ServiceRank> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof ServiceRank) { return Optional.of((ServiceRank)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<ServiceRank> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof ServiceRank) { return (ServiceRank)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ServiceRank nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<ServiceRank> listAll() {
            return new ArrayList<ServiceRank>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<ServiceRank> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: ServiceRank." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<ServiceRank> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<ServiceRank> clsList = new ArrayList<ServiceRank>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<ServiceRank> groupOf(String groupName) {
            return new ArrayList<ServiceRank>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * mainly region of member address
     */
    public enum Region implements HangarCDef {
        /** AMERICA */
        America("1", "AMERICA", emptyStrings())
        ,
        /** CANADA */
        Canada("2", "CANADA", emptyStrings())
        ,
        /** CHINA */
        China("3", "CHINA", emptyStrings())
        ,
        /** CHIBA */
        Chiba("4", "CHIBA", emptyStrings())
        ;
        private static final Map<String, Region> _codeClsMap = new HashMap<String, Region>();
        private static final Map<String, Region> _nameClsMap = new HashMap<String, Region>();
        static {
            for (Region value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private Region(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.Region; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<Region> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof Region) { return Optional.of((Region)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<Region> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static Region codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof Region) { return (Region)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static Region nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<Region> listAll() {
            return new ArrayList<Region>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<Region> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: Region." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<Region> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<Region> clsList = new ArrayList<Region>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<Region> groupOf(String groupName) {
            return new ArrayList<Region>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * reason for member withdrawal
     */
    public enum WithdrawalReason implements HangarCDef {
        /** SIT: サイトが使いにくいから */
        Sit("SIT", "SIT", new String[] {"1"})
        ,
        /** PRD: 商品に魅力がないから */
        Prd("PRD", "PRD", new String[] {"2"})
        ,
        /** FRT: フリテンだから */
        Frt("FRT", "FRT", new String[] {"3"})
        ,
        /** OTH: その他理由 */
        Oth("OTH", "OTH", new String[] {"4"})
        ;
        private static final Map<String, WithdrawalReason> _codeClsMap = new HashMap<String, WithdrawalReason>();
        private static final Map<String, WithdrawalReason> _nameClsMap = new HashMap<String, WithdrawalReason>();
        static {
            for (WithdrawalReason value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private WithdrawalReason(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.WithdrawalReason; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<WithdrawalReason> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof WithdrawalReason) { return Optional.of((WithdrawalReason)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<WithdrawalReason> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WithdrawalReason codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof WithdrawalReason) { return (WithdrawalReason)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static WithdrawalReason nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WithdrawalReason> listAll() {
            return new ArrayList<WithdrawalReason>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<WithdrawalReason> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: WithdrawalReason." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<WithdrawalReason> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<WithdrawalReason> clsList = new ArrayList<WithdrawalReason>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<WithdrawalReason> groupOf(String groupName) {
            return new ArrayList<WithdrawalReason>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * category of product. self reference
     */
    public enum ProductCategory implements HangarCDef {
        /** 音楽 */
        音楽("MSC", "音楽", emptyStrings())
        ,
        /** 食品 */
        食品("FOD", "食品", emptyStrings())
        ,
        /** ハーブ: of 食品 */
        ハーブ("HEB", "ハーブ", emptyStrings())
        ,
        /** 音楽CD: of 音楽 */
        音楽cd("MCD", "音楽CD", emptyStrings())
        ,
        /** 楽器: of 音楽 */
        楽器("INS", "楽器", emptyStrings())
        ;
        private static final Map<String, ProductCategory> _codeClsMap = new HashMap<String, ProductCategory>();
        private static final Map<String, ProductCategory> _nameClsMap = new HashMap<String, ProductCategory>();
        static {
            for (ProductCategory value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private ProductCategory(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.ProductCategory; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<ProductCategory> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof ProductCategory) { return Optional.of((ProductCategory)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<ProductCategory> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductCategory codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof ProductCategory) { return (ProductCategory)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ProductCategory nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<ProductCategory> listAll() {
            return new ArrayList<ProductCategory>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<ProductCategory> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: ProductCategory." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<ProductCategory> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<ProductCategory> clsList = new ArrayList<ProductCategory>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<ProductCategory> groupOf(String groupName) {
            return new ArrayList<ProductCategory>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * status for product
     */
    public enum ProductStatus implements HangarCDef {
        /** 生産販売可能 */
        生産販売可能("ONS", "生産販売可能", emptyStrings())
        ,
        /** 生産中止 */
        生産中止("PST", "生産中止", emptyStrings())
        ,
        /** 販売中止 */
        販売中止("SST", "販売中止", emptyStrings())
        ;
        private static final Map<String, ProductStatus> _codeClsMap = new HashMap<String, ProductStatus>();
        private static final Map<String, ProductStatus> _nameClsMap = new HashMap<String, ProductStatus>();
        static {
            for (ProductStatus value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private ProductStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.ProductStatus; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<ProductStatus> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof ProductStatus) { return Optional.of((ProductStatus)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<ProductStatus> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof ProductStatus) { return (ProductStatus)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static ProductStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<ProductStatus> listAll() {
            return new ArrayList<ProductStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<ProductStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: ProductStatus." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<ProductStatus> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<ProductStatus> clsList = new ArrayList<ProductStatus>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<ProductStatus> groupOf(String groupName) {
            return new ArrayList<ProductStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * method of payment for purchase
     */
    public enum PaymentMethod implements HangarCDef {
        /** by hand: payment by hand, face-to-face */
        ByHand("HAN", "by hand", emptyStrings())
        ,
        /** bank transfer: bank transfer payment */
        BankTransfer("BAK", "bank transfer", emptyStrings())
        ,
        /** credit card: credit card payment */
        CreditCard("CRC", "credit card", emptyStrings())
        ;
        private static final Map<String, PaymentMethod> _codeClsMap = new HashMap<String, PaymentMethod>();
        private static final Map<String, PaymentMethod> _nameClsMap = new HashMap<String, PaymentMethod>();
        static {
            for (PaymentMethod value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private PaymentMethod(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.PaymentMethod; }

        /**
         * Is the classification in the group? <br>
         * the most recommended method <br>
         * The group elements:[ByHand]
         * @return The determination, true or false.
         */
        public boolean isRecommended() {
            return ByHand.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("recommended".equals(groupName)) { return isRecommended(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<PaymentMethod> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof PaymentMethod) { return Optional.of((PaymentMethod)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<PaymentMethod> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof PaymentMethod) { return (PaymentMethod)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static PaymentMethod nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<PaymentMethod> listAll() {
            return new ArrayList<PaymentMethod>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<PaymentMethod> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("recommended".equalsIgnoreCase(groupName)) { return listOfRecommended(); }
            throw new ClassificationNotFoundException("Unknown classification group: PaymentMethod." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<PaymentMethod> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<PaymentMethod> clsList = new ArrayList<PaymentMethod>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * the most recommended method <br>
         * The group elements:[ByHand]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<PaymentMethod> listOfRecommended() {
            return new ArrayList<PaymentMethod>(Arrays.asList(ByHand));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<PaymentMethod> groupOf(String groupName) {
            if ("recommended".equals(groupName)) { return listOfRecommended(); }
            return new ArrayList<PaymentMethod>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of deployment
     */
    public enum WhiteClassifiationDeploymentType implements HangarCDef {
        /** sea */
        Sea("SEA", "sea", emptyStrings())
        ,
        /** land */
        Land("LAN", "land", emptyStrings())
        ;
        private static final Map<String, WhiteClassifiationDeploymentType> _codeClsMap = new HashMap<String, WhiteClassifiationDeploymentType>();
        private static final Map<String, WhiteClassifiationDeploymentType> _nameClsMap = new HashMap<String, WhiteClassifiationDeploymentType>();
        static {
            for (WhiteClassifiationDeploymentType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private WhiteClassifiationDeploymentType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.WhiteClassifiationDeploymentType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<WhiteClassifiationDeploymentType> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof WhiteClassifiationDeploymentType) { return Optional.of((WhiteClassifiationDeploymentType)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<WhiteClassifiationDeploymentType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WhiteClassifiationDeploymentType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof WhiteClassifiationDeploymentType) { return (WhiteClassifiationDeploymentType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static WhiteClassifiationDeploymentType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WhiteClassifiationDeploymentType> listAll() {
            return new ArrayList<WhiteClassifiationDeploymentType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<WhiteClassifiationDeploymentType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: WhiteClassifiationDeploymentType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<WhiteClassifiationDeploymentType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<WhiteClassifiationDeploymentType> clsList = new ArrayList<WhiteClassifiationDeploymentType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<WhiteClassifiationDeploymentType> groupOf(String groupName) {
            return new ArrayList<WhiteClassifiationDeploymentType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of various options when table classification
     */
    public enum WhiteTableOptionStatus implements HangarCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"1"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"2"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"3"})
        ;
        private static final Map<String, WhiteTableOptionStatus> _codeClsMap = new HashMap<String, WhiteTableOptionStatus>();
        private static final Map<String, WhiteTableOptionStatus> _nameClsMap = new HashMap<String, WhiteTableOptionStatus>();
        static {
            for (WhiteTableOptionStatus value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
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
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return HangarCDef.DefMeta.WhiteTableOptionStatus; }

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
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<WhiteTableOptionStatus> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof WhiteTableOptionStatus) { return Optional.of((WhiteTableOptionStatus)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<WhiteTableOptionStatus> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static WhiteTableOptionStatus codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof WhiteTableOptionStatus) { return (WhiteTableOptionStatus)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static WhiteTableOptionStatus nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<WhiteTableOptionStatus> listAll() {
            return new ArrayList<WhiteTableOptionStatus>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<WhiteTableOptionStatus> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            throw new ClassificationNotFoundException("Unknown classification group: WhiteTableOptionStatus." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<WhiteTableOptionStatus> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<WhiteTableOptionStatus> clsList = new ArrayList<WhiteTableOptionStatus>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * can use service <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<WhiteTableOptionStatus> listOfServiceAvailable() {
            return new ArrayList<WhiteTableOptionStatus>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<WhiteTableOptionStatus> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            return new ArrayList<WhiteTableOptionStatus>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * the test of reference variable in grouping map
     */
    public enum GroupingReference implements HangarCDef {
        /** LAND_NAME */
        LAND_NAME("LND", "LAND_NAME", emptyStrings())
        ,
        /** SEA_NAME */
        SEA_NAME("SEA", "SEA_NAME", emptyStrings())
        ,
        /** IKSPIARY_NAME */
        IKSPIARY_NAME("IKS", "IKSPIARY_NAME", emptyStrings())
        ,
        /** AMPHI_NAME */
        AMPHI_NAME("AMP", "AMPHI_NAME", emptyStrings())
        ;
        private static final Map<String, GroupingReference> _codeClsMap = new HashMap<String, GroupingReference>();
        private static final Map<String, GroupingReference> _nameClsMap = new HashMap<String, GroupingReference>();
        static {
            for (GroupingReference value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private GroupingReference(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.GroupingReference; }

        /**
         * Is the classification in the group? <br>
         * サービスが利用できる会員 <br>
         * The group elements:[LAND_NAME, SEA_NAME]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return LAND_NAME.equals(this) || SEA_NAME.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isServicePlus() {
            return LAND_NAME.equals(this) || SEA_NAME.equals(this) || IKSPIARY_NAME.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isNestedPlus() {
            return AMPHI_NAME.equals(this) || LAND_NAME.equals(this) || SEA_NAME.equals(this) || IKSPIARY_NAME.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isOneDef() {
            return IKSPIARY_NAME.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The determination, true or false.
         */
        public boolean isDupRef() {
            return LAND_NAME.equals(this) || SEA_NAME.equals(this) || IKSPIARY_NAME.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("servicePlus".equals(groupName)) { return isServicePlus(); }
            if ("nestedPlus".equals(groupName)) { return isNestedPlus(); }
            if ("oneDef".equals(groupName)) { return isOneDef(); }
            if ("dupRef".equals(groupName)) { return isDupRef(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<GroupingReference> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof GroupingReference) { return Optional.of((GroupingReference)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<GroupingReference> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static GroupingReference codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof GroupingReference) { return (GroupingReference)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static GroupingReference nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<GroupingReference> listAll() {
            return new ArrayList<GroupingReference>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
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
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<GroupingReference> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<GroupingReference> clsList = new ArrayList<GroupingReference>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * サービスが利用できる会員 <br>
         * The group elements:[LAND_NAME, SEA_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfServiceAvailable() {
            return new ArrayList<GroupingReference>(Arrays.asList(LAND_NAME, SEA_NAME));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfServicePlus() {
            return new ArrayList<GroupingReference>(Arrays.asList(LAND_NAME, SEA_NAME, IKSPIARY_NAME));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfNestedPlus() {
            return new ArrayList<GroupingReference>(Arrays.asList(AMPHI_NAME, LAND_NAME, SEA_NAME, IKSPIARY_NAME));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfOneDef() {
            return new ArrayList<GroupingReference>(Arrays.asList(IKSPIARY_NAME));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[LAND_NAME, SEA_NAME, IKSPIARY_NAME]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<GroupingReference> listOfDupRef() {
            return new ArrayList<GroupingReference>(Arrays.asList(LAND_NAME, SEA_NAME, IKSPIARY_NAME));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<GroupingReference> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("servicePlus".equals(groupName)) { return listOfServicePlus(); }
            if ("nestedPlus".equals(groupName)) { return listOfNestedPlus(); }
            if ("oneDef".equals(groupName)) { return listOfOneDef(); }
            if ("dupRef".equals(groupName)) { return listOfDupRef(); }
            return new ArrayList<GroupingReference>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * is deprecated classification
     */
    public enum DeprecatedTopBasicType implements HangarCDef {
        /** FooName */
        FooName("FOO", "FooName", emptyStrings())
        ,
        /** BarName */
        BarName("BAR", "BarName", emptyStrings())
        ,
        /** QuxName */
        QuxName("QUX", "QuxName", emptyStrings())
        ;
        private static final Map<String, DeprecatedTopBasicType> _codeClsMap = new HashMap<String, DeprecatedTopBasicType>();
        private static final Map<String, DeprecatedTopBasicType> _nameClsMap = new HashMap<String, DeprecatedTopBasicType>();
        static {
            for (DeprecatedTopBasicType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeprecatedTopBasicType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.DeprecatedTopBasicType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<DeprecatedTopBasicType> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof DeprecatedTopBasicType) { return Optional.of((DeprecatedTopBasicType)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<DeprecatedTopBasicType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedTopBasicType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeprecatedTopBasicType) { return (DeprecatedTopBasicType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedTopBasicType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeprecatedTopBasicType> listAll() {
            return new ArrayList<DeprecatedTopBasicType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<DeprecatedTopBasicType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: DeprecatedTopBasicType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<DeprecatedTopBasicType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<DeprecatedTopBasicType> clsList = new ArrayList<DeprecatedTopBasicType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<DeprecatedTopBasicType> groupOf(String groupName) {
            return new ArrayList<DeprecatedTopBasicType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * has deprecated element
     */
    public enum DeprecatedMapBasicType implements HangarCDef {
        /** FooName */
        FooName("FOO", "FooName", emptyStrings())
        ,
        /** BarName: (deprecated: test of deprecated) */
        BarName("BAR", "BarName", emptyStrings())
        ,
        /** QuxName */
        QuxName("QUX", "QuxName", emptyStrings())
        ;
        private static final Map<String, DeprecatedMapBasicType> _codeClsMap = new HashMap<String, DeprecatedMapBasicType>();
        private static final Map<String, DeprecatedMapBasicType> _nameClsMap = new HashMap<String, DeprecatedMapBasicType>();
        static {
            for (DeprecatedMapBasicType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeprecatedMapBasicType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.DeprecatedMapBasicType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<DeprecatedMapBasicType> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof DeprecatedMapBasicType) { return Optional.of((DeprecatedMapBasicType)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<DeprecatedMapBasicType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapBasicType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeprecatedMapBasicType) { return (DeprecatedMapBasicType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapBasicType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeprecatedMapBasicType> listAll() {
            return new ArrayList<DeprecatedMapBasicType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<DeprecatedMapBasicType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: DeprecatedMapBasicType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<DeprecatedMapBasicType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<DeprecatedMapBasicType> clsList = new ArrayList<DeprecatedMapBasicType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<DeprecatedMapBasicType> groupOf(String groupName) {
            return new ArrayList<DeprecatedMapBasicType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * has deprecated element
     */
    public enum DeprecatedMapCollaborationType implements HangarCDef {
        /** FooName */
        FooName("FOO", "FooName", emptyStrings())
        ,
        /** BarBar: here (deprecated: test of deprecated) */
        BarName("BAR", "BarBar", emptyStrings())
        ,
        /** QuxQux: (deprecated: no original comment) */
        QuxName("QUX", "QuxQux", emptyStrings())
        ;
        private static final Map<String, DeprecatedMapCollaborationType> _codeClsMap = new HashMap<String, DeprecatedMapCollaborationType>();
        private static final Map<String, DeprecatedMapCollaborationType> _nameClsMap = new HashMap<String, DeprecatedMapCollaborationType>();
        static {
            for (DeprecatedMapCollaborationType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeprecatedMapCollaborationType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.DeprecatedMapCollaborationType; }

        /**
         * Is the classification in the group? <br>
         * contains deprecated element here <br>
         * The group elements:[FooName, BarName]
         * @return The determination, true or false.
         */
        public boolean isContainsDeprecated() {
            return FooName.equals(this) || BarName.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("containsDeprecated".equals(groupName)) { return isContainsDeprecated(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<DeprecatedMapCollaborationType> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof DeprecatedMapCollaborationType) { return Optional.of((DeprecatedMapCollaborationType)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<DeprecatedMapCollaborationType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapCollaborationType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeprecatedMapCollaborationType) { return (DeprecatedMapCollaborationType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeprecatedMapCollaborationType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> listAll() {
            return new ArrayList<DeprecatedMapCollaborationType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<DeprecatedMapCollaborationType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("containsDeprecated".equalsIgnoreCase(groupName)) { return listOfContainsDeprecated(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeprecatedMapCollaborationType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<DeprecatedMapCollaborationType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<DeprecatedMapCollaborationType> clsList = new ArrayList<DeprecatedMapCollaborationType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * contains deprecated element here <br>
         * The group elements:[FooName, BarName]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeprecatedMapCollaborationType> listOfContainsDeprecated() {
            return new ArrayList<DeprecatedMapCollaborationType>(Arrays.asList(FooName, BarName));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<DeprecatedMapCollaborationType> groupOf(String groupName) {
            if ("containsDeprecated".equals(groupName)) { return listOfContainsDeprecated(); }
            return new ArrayList<DeprecatedMapCollaborationType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * The test of top only
     */
    public enum TopCommentOnly implements HangarCDef {
        ;
        private static final Map<String, TopCommentOnly> _codeClsMap = new HashMap<String, TopCommentOnly>();
        private static final Map<String, TopCommentOnly> _nameClsMap = new HashMap<String, TopCommentOnly>();
        static {
            for (TopCommentOnly value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private TopCommentOnly(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.TopCommentOnly; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<TopCommentOnly> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof TopCommentOnly) { return Optional.of((TopCommentOnly)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<TopCommentOnly> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static TopCommentOnly codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof TopCommentOnly) { return (TopCommentOnly)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static TopCommentOnly nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<TopCommentOnly> listAll() {
            return new ArrayList<TopCommentOnly>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<TopCommentOnly> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: TopCommentOnly." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<TopCommentOnly> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<TopCommentOnly> clsList = new ArrayList<TopCommentOnly>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<TopCommentOnly> groupOf(String groupName) {
            return new ArrayList<TopCommentOnly>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * the test of sub-item map for implicit classification
     */
    public enum SubItemImplicit implements HangarCDef {
        /** Aaa: means foo */
        Foo("FOO", "Aaa", emptyStrings())
        ,
        /** Bbb: means bar */
        Bar("BAR", "Bbb", emptyStrings())
        ;
        private static final Map<String, SubItemImplicit> _codeClsMap = new HashMap<String, SubItemImplicit>();
        private static final Map<String, SubItemImplicit> _nameClsMap = new HashMap<String, SubItemImplicit>();
        static {
            for (SubItemImplicit value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
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
        private String _code; private String _alias; private Set<String> _sisterSet;
        private SubItemImplicit(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return HangarCDef.DefMeta.SubItemImplicit; }

        public String regularStringItem() {
            return (String)subItemMap().get("regularStringItem");
        }

        public String regularNumberItem() {
            return (String)subItemMap().get("regularNumberItem");
        }

        public Object regularVariousItem() {
            return subItemMap().get("regularVariousItem");
        }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<SubItemImplicit> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof SubItemImplicit) { return Optional.of((SubItemImplicit)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<SubItemImplicit> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SubItemImplicit codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof SubItemImplicit) { return (SubItemImplicit)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static SubItemImplicit nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<SubItemImplicit> listAll() {
            return new ArrayList<SubItemImplicit>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<SubItemImplicit> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: SubItemImplicit." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<SubItemImplicit> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<SubItemImplicit> clsList = new ArrayList<SubItemImplicit>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<SubItemImplicit> groupOf(String groupName) {
            return new ArrayList<SubItemImplicit>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * the test of sub-item map for table classification
     */
    public enum SubItemTable implements HangarCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", emptyStrings())
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", emptyStrings())
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", emptyStrings())
        ;
        private static final Map<String, SubItemTable> _codeClsMap = new HashMap<String, SubItemTable>();
        private static final Map<String, SubItemTable> _nameClsMap = new HashMap<String, SubItemTable>();
        static {
            for (SubItemTable value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "1");
                subItemMap.put("key2", "Formalized");
                subItemMap.put("key3", "null");
                _subItemMapMap.put(Formalized.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "2");
                subItemMap.put("key2", "Withdrawal");
                subItemMap.put("key3", "null");
                _subItemMapMap.put(Withdrawal.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("key1", "3");
                subItemMap.put("key2", "Provisional");
                subItemMap.put("key3", "null");
                _subItemMapMap.put(Provisional.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private SubItemTable(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return HangarCDef.DefMeta.SubItemTable; }

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
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Withdrawal]
         * @return The determination, true or false.
         */
        public boolean isLastestStatus() {
            return Withdrawal.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("lastestStatus".equals(groupName)) { return isLastestStatus(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<SubItemTable> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof SubItemTable) { return Optional.of((SubItemTable)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<SubItemTable> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static SubItemTable codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof SubItemTable) { return (SubItemTable)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static SubItemTable nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<SubItemTable> listAll() {
            return new ArrayList<SubItemTable>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<SubItemTable> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("lastestStatus".equalsIgnoreCase(groupName)) { return listOfLastestStatus(); }
            throw new ClassificationNotFoundException("Unknown classification group: SubItemTable." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<SubItemTable> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<SubItemTable> clsList = new ArrayList<SubItemTable>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * サービスが利用できる会員 <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> listOfServiceAvailable() {
            return new ArrayList<SubItemTable>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<SubItemTable> listOfLastestStatus() {
            return new ArrayList<SubItemTable>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<SubItemTable> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("lastestStatus".equals(groupName)) { return listOfLastestStatus(); }
            return new ArrayList<SubItemTable>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * boolean classification for boolean column
     */
    public enum BooleanFlg implements HangarCDef {
        /** Checked: means yes */
        True("true", "Checked", emptyStrings())
        ,
        /** Unchecked: means no */
        False("false", "Unchecked", emptyStrings())
        ;
        private static final Map<String, BooleanFlg> _codeClsMap = new HashMap<String, BooleanFlg>();
        private static final Map<String, BooleanFlg> _nameClsMap = new HashMap<String, BooleanFlg>();
        static {
            for (BooleanFlg value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private BooleanFlg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.BooleanFlg; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<BooleanFlg> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof BooleanFlg) { return Optional.of((BooleanFlg)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<BooleanFlg> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static BooleanFlg codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof BooleanFlg) { return (BooleanFlg)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static BooleanFlg nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<BooleanFlg> listAll() {
            return new ArrayList<BooleanFlg>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<BooleanFlg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: BooleanFlg." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<BooleanFlg> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<BooleanFlg> clsList = new ArrayList<BooleanFlg>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<BooleanFlg> groupOf(String groupName) {
            return new ArrayList<BooleanFlg>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * master type of variant relation (biz-many-to-one)
     */
    public enum VariantRelationMasterType implements HangarCDef {
        /** FooCls */
        FooCls("FOO", "FooCls", emptyStrings())
        ,
        /** BarCls */
        BarCls("BAR", "BarCls", emptyStrings())
        ,
        /** QuxCls */
        QuxCls("QUX", "QuxCls", emptyStrings())
        ,
        /** CorgeCls */
        CorgeCls("CORGE", "CorgeCls", emptyStrings())
        ;
        private static final Map<String, VariantRelationMasterType> _codeClsMap = new HashMap<String, VariantRelationMasterType>();
        private static final Map<String, VariantRelationMasterType> _nameClsMap = new HashMap<String, VariantRelationMasterType>();
        static {
            for (VariantRelationMasterType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private VariantRelationMasterType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.VariantRelationMasterType; }

        /**
         * Is the classification in the group? <br>
         * Foo or Bar or Qux <br>
         * The group elements:[FooCls, BarCls, QuxCls]
         * @return The determination, true or false.
         */
        public boolean isFooBarQux() {
            return FooCls.equals(this) || BarCls.equals(this) || QuxCls.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("fooBarQux".equals(groupName)) { return isFooBarQux(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<VariantRelationMasterType> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof VariantRelationMasterType) { return Optional.of((VariantRelationMasterType)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<VariantRelationMasterType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationMasterType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof VariantRelationMasterType) { return (VariantRelationMasterType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationMasterType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<VariantRelationMasterType> listAll() {
            return new ArrayList<VariantRelationMasterType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<VariantRelationMasterType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("fooBarQux".equalsIgnoreCase(groupName)) { return listOfFooBarQux(); }
            throw new ClassificationNotFoundException("Unknown classification group: VariantRelationMasterType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<VariantRelationMasterType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<VariantRelationMasterType> clsList = new ArrayList<VariantRelationMasterType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Foo or Bar or Qux <br>
         * The group elements:[FooCls, BarCls, QuxCls]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<VariantRelationMasterType> listOfFooBarQux() {
            return new ArrayList<VariantRelationMasterType>(Arrays.asList(FooCls, BarCls, QuxCls));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<VariantRelationMasterType> groupOf(String groupName) {
            if ("fooBarQux".equals(groupName)) { return listOfFooBarQux(); }
            return new ArrayList<VariantRelationMasterType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * qux type of variant relation (biz-many-to-one)
     */
    public enum VariantRelationQuxType implements HangarCDef {
        /** Qua */
        Qua("Qua", "Qua", emptyStrings())
        ,
        /** Que */
        Que("Que", "Que", emptyStrings())
        ,
        /** Quo */
        Quo("Quo", "Quo", emptyStrings())
        ;
        private static final Map<String, VariantRelationQuxType> _codeClsMap = new HashMap<String, VariantRelationQuxType>();
        private static final Map<String, VariantRelationQuxType> _nameClsMap = new HashMap<String, VariantRelationQuxType>();
        static {
            for (VariantRelationQuxType value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private VariantRelationQuxType(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.VariantRelationQuxType; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<VariantRelationQuxType> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof VariantRelationQuxType) { return Optional.of((VariantRelationQuxType)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<VariantRelationQuxType> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationQuxType codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof VariantRelationQuxType) { return (VariantRelationQuxType)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static VariantRelationQuxType nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<VariantRelationQuxType> listAll() {
            return new ArrayList<VariantRelationQuxType>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<VariantRelationQuxType> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: VariantRelationQuxType." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<VariantRelationQuxType> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<VariantRelationQuxType> clsList = new ArrayList<VariantRelationQuxType>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<VariantRelationQuxType> groupOf(String groupName) {
            return new ArrayList<VariantRelationQuxType>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * merged
     */
    public enum QuxCls implements HangarCDef {
        /** Merged: merged qux element */
        Merged("MRG", "Merged", emptyStrings())
        ;
        private static final Map<String, QuxCls> _codeClsMap = new HashMap<String, QuxCls>();
        private static final Map<String, QuxCls> _nameClsMap = new HashMap<String, QuxCls>();
        static {
            for (QuxCls value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private QuxCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.QuxCls; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<QuxCls> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof QuxCls) { return Optional.of((QuxCls)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<QuxCls> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static QuxCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof QuxCls) { return (QuxCls)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static QuxCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<QuxCls> listAll() {
            return new ArrayList<QuxCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<QuxCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: QuxCls." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<QuxCls> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<QuxCls> clsList = new ArrayList<QuxCls>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<QuxCls> groupOf(String groupName) {
            return new ArrayList<QuxCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * delimiter; &amp; endBrace} &amp; path\foo\bar
     */
    public enum EscapedDfpropCls implements HangarCDef {
        /** First: delimiter &amp; rear escape char */
        First(";@\\", "First", emptyStrings())
        ,
        /** Second: escape char &amp; endBrace &amp; delimiter */
        Second("\\};", "Second", emptyStrings())
        ,
        /** Third: startBrace &amp; equal &amp; endBrace */
        Third("{=}", "Third", emptyStrings())
        ;
        private static final Map<String, EscapedDfpropCls> _codeClsMap = new HashMap<String, EscapedDfpropCls>();
        private static final Map<String, EscapedDfpropCls> _nameClsMap = new HashMap<String, EscapedDfpropCls>();
        static {
            for (EscapedDfpropCls value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private EscapedDfpropCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.EscapedDfpropCls; }

        public boolean inGroup(String groupName) {
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<EscapedDfpropCls> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof EscapedDfpropCls) { return Optional.of((EscapedDfpropCls)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<EscapedDfpropCls> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static EscapedDfpropCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof EscapedDfpropCls) { return (EscapedDfpropCls)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static EscapedDfpropCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<EscapedDfpropCls> listAll() {
            return new ArrayList<EscapedDfpropCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<EscapedDfpropCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: EscapedDfpropCls." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<EscapedDfpropCls> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<EscapedDfpropCls> clsList = new ArrayList<EscapedDfpropCls>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<EscapedDfpropCls> groupOf(String groupName) {
            return new ArrayList<EscapedDfpropCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * /*IF pmb.yourTop&#42;/&gt;&lt;&amp;
     */
    public enum EscapedJavaDocCls implements HangarCDef {
        /** First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&amp; */
        First("FOO", "First", emptyStrings())
        ,
        /** Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&amp; */
        Second("BAR", "Second", emptyStrings())
        ;
        private static final Map<String, EscapedJavaDocCls> _codeClsMap = new HashMap<String, EscapedJavaDocCls>();
        private static final Map<String, EscapedJavaDocCls> _nameClsMap = new HashMap<String, EscapedJavaDocCls>();
        static {
            for (EscapedJavaDocCls value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private EscapedJavaDocCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.EscapedJavaDocCls; }

        /**
         * Is the classification in the group? <br>
         * /*IF pmb.yourGroup&#42;/&gt;&lt;&amp; <br>
         * The group elements:[First, Second]
         * @return The determination, true or false.
         */
        public boolean isLineGroup() {
            return First.equals(this) || Second.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("lineGroup".equals(groupName)) { return isLineGroup(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<EscapedJavaDocCls> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof EscapedJavaDocCls) { return Optional.of((EscapedJavaDocCls)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<EscapedJavaDocCls> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static EscapedJavaDocCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof EscapedJavaDocCls) { return (EscapedJavaDocCls)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static EscapedJavaDocCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<EscapedJavaDocCls> listAll() {
            return new ArrayList<EscapedJavaDocCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<EscapedJavaDocCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("lineGroup".equalsIgnoreCase(groupName)) { return listOfLineGroup(); }
            throw new ClassificationNotFoundException("Unknown classification group: EscapedJavaDocCls." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<EscapedJavaDocCls> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<EscapedJavaDocCls> clsList = new ArrayList<EscapedJavaDocCls>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * /*IF pmb.yourGroup&#42;/&gt;&lt;&amp; <br>
         * The group elements:[First, Second]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<EscapedJavaDocCls> listOfLineGroup() {
            return new ArrayList<EscapedJavaDocCls>(Arrays.asList(First, Second));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<EscapedJavaDocCls> groupOf(String groupName) {
            if ("lineGroup".equals(groupName)) { return listOfLineGroup(); }
            return new ArrayList<EscapedJavaDocCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * top first line            top second line            top third line
     */
    public enum LineSepCommentCls implements HangarCDef {
        /** First: foo first line            foo second line */
        First("FOO", "First", emptyStrings())
        ,
        /** Second: bar first line            bar second line */
        Second("BAR", "Second", emptyStrings())
        ;
        private static final Map<String, LineSepCommentCls> _codeClsMap = new HashMap<String, LineSepCommentCls>();
        private static final Map<String, LineSepCommentCls> _nameClsMap = new HashMap<String, LineSepCommentCls>();
        static {
            for (LineSepCommentCls value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
                _nameClsMap.put(value.name().toLowerCase(), value);
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private LineSepCommentCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public DefMeta meta() { return HangarCDef.DefMeta.LineSepCommentCls; }

        /**
         * Is the classification in the group? <br>
         * group first line                    group second line <br>
         * The group elements:[First, Second]
         * @return The determination, true or false.
         */
        public boolean isLineGroup() {
            return First.equals(this) || Second.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("lineGroup".equals(groupName)) { return isLineGroup(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<LineSepCommentCls> of(Object code) {
            if (code == null) { return Optional.empty(); }
            if (code instanceof LineSepCommentCls) { return Optional.of((LineSepCommentCls)code); }
            if (code instanceof Optional<?>) { return of(((Optional<?>)code).orElse(null)); }
            return Optional.ofNullable(_codeClsMap.get(code.toString().toLowerCase()));
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static Optional<LineSepCommentCls> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return Optional.ofNullable(_nameClsMap.get(name.toLowerCase()));
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static LineSepCommentCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof LineSepCommentCls) { return (LineSepCommentCls)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static LineSepCommentCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<LineSepCommentCls> listAll() {
            return new ArrayList<LineSepCommentCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<LineSepCommentCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("lineGroup".equalsIgnoreCase(groupName)) { return listOfLineGroup(); }
            throw new ClassificationNotFoundException("Unknown classification group: LineSepCommentCls." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<LineSepCommentCls> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<LineSepCommentCls> clsList = new ArrayList<LineSepCommentCls>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * group first line                    group second line <br>
         * The group elements:[First, Second]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<LineSepCommentCls> listOfLineGroup() {
            return new ArrayList<LineSepCommentCls>(Arrays.asList(First, Second));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<LineSepCommentCls> groupOf(String groupName) {
            if ("lineGroup".equals(groupName)) { return listOfLineGroup(); }
            return new ArrayList<LineSepCommentCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta {
        /** general boolean classification for every flg-column */
        Flg
        ,
        /** status of member from entry to withdrawal */
        MemberStatus
        ,
        /** rank of service member gets */
        ServiceRank
        ,
        /** mainly region of member address */
        Region
        ,
        /** reason for member withdrawal */
        WithdrawalReason
        ,
        /** category of product. self reference */
        ProductCategory
        ,
        /** status for product */
        ProductStatus
        ,
        /** method of payment for purchase */
        PaymentMethod
        ,
        /** test of deployment */
        WhiteClassifiationDeploymentType
        ,
        /** test of various options when table classification */
        WhiteTableOptionStatus
        ,
        /** the test of reference variable in grouping map */
        GroupingReference
        ,
        /** is deprecated classification */
        DeprecatedTopBasicType
        ,
        /** has deprecated element */
        DeprecatedMapBasicType
        ,
        /** has deprecated element */
        DeprecatedMapCollaborationType
        ,
        /** The test of top only */
        TopCommentOnly
        ,
        /** the test of sub-item map for implicit classification */
        SubItemImplicit
        ,
        /** the test of sub-item map for table classification */
        SubItemTable
        ,
        /** boolean classification for boolean column */
        BooleanFlg
        ,
        /** master type of variant relation (biz-many-to-one) */
        VariantRelationMasterType
        ,
        /** qux type of variant relation (biz-many-to-one) */
        VariantRelationQuxType
        ,
        /** merged */
        QuxCls
        ,
        /** delimiter; &amp; endBrace} &amp; path\foo\bar */
        EscapedDfpropCls
        ,
        /** /*IF pmb.yourTop&#42;/&gt;&lt;&amp; */
        EscapedJavaDocCls
        ,
        /** top first line            top second line            top third line */
        LineSepCommentCls
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public HangarCDef codeOf(Object code) { // null if not found, old style so use of(code)
            if (Flg.name().equals(name())) { return HangarCDef.Flg.codeOf(code); }
            if (MemberStatus.name().equals(name())) { return HangarCDef.MemberStatus.codeOf(code); }
            if (ServiceRank.name().equals(name())) { return HangarCDef.ServiceRank.codeOf(code); }
            if (Region.name().equals(name())) { return HangarCDef.Region.codeOf(code); }
            if (WithdrawalReason.name().equals(name())) { return HangarCDef.WithdrawalReason.codeOf(code); }
            if (ProductCategory.name().equals(name())) { return HangarCDef.ProductCategory.codeOf(code); }
            if (ProductStatus.name().equals(name())) { return HangarCDef.ProductStatus.codeOf(code); }
            if (PaymentMethod.name().equals(name())) { return HangarCDef.PaymentMethod.codeOf(code); }
            if (WhiteClassifiationDeploymentType.name().equals(name())) { return HangarCDef.WhiteClassifiationDeploymentType.codeOf(code); }
            if (WhiteTableOptionStatus.name().equals(name())) { return HangarCDef.WhiteTableOptionStatus.codeOf(code); }
            if (GroupingReference.name().equals(name())) { return HangarCDef.GroupingReference.codeOf(code); }
            if (DeprecatedTopBasicType.name().equals(name())) { return HangarCDef.DeprecatedTopBasicType.codeOf(code); }
            if (DeprecatedMapBasicType.name().equals(name())) { return HangarCDef.DeprecatedMapBasicType.codeOf(code); }
            if (DeprecatedMapCollaborationType.name().equals(name())) { return HangarCDef.DeprecatedMapCollaborationType.codeOf(code); }
            if (TopCommentOnly.name().equals(name())) { return HangarCDef.TopCommentOnly.codeOf(code); }
            if (SubItemImplicit.name().equals(name())) { return HangarCDef.SubItemImplicit.codeOf(code); }
            if (SubItemTable.name().equals(name())) { return HangarCDef.SubItemTable.codeOf(code); }
            if (BooleanFlg.name().equals(name())) { return HangarCDef.BooleanFlg.codeOf(code); }
            if (VariantRelationMasterType.name().equals(name())) { return HangarCDef.VariantRelationMasterType.codeOf(code); }
            if (VariantRelationQuxType.name().equals(name())) { return HangarCDef.VariantRelationQuxType.codeOf(code); }
            if (QuxCls.name().equals(name())) { return HangarCDef.QuxCls.codeOf(code); }
            if (EscapedDfpropCls.name().equals(name())) { return HangarCDef.EscapedDfpropCls.codeOf(code); }
            if (EscapedJavaDocCls.name().equals(name())) { return HangarCDef.EscapedJavaDocCls.codeOf(code); }
            if (LineSepCommentCls.name().equals(name())) { return HangarCDef.LineSepCommentCls.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public HangarCDef nameOf(String name) { // null if not found, old style so use byName(name)
            if (Flg.name().equals(name())) { return HangarCDef.Flg.valueOf(name); }
            if (MemberStatus.name().equals(name())) { return HangarCDef.MemberStatus.valueOf(name); }
            if (ServiceRank.name().equals(name())) { return HangarCDef.ServiceRank.valueOf(name); }
            if (Region.name().equals(name())) { return HangarCDef.Region.valueOf(name); }
            if (WithdrawalReason.name().equals(name())) { return HangarCDef.WithdrawalReason.valueOf(name); }
            if (ProductCategory.name().equals(name())) { return HangarCDef.ProductCategory.valueOf(name); }
            if (ProductStatus.name().equals(name())) { return HangarCDef.ProductStatus.valueOf(name); }
            if (PaymentMethod.name().equals(name())) { return HangarCDef.PaymentMethod.valueOf(name); }
            if (WhiteClassifiationDeploymentType.name().equals(name())) { return HangarCDef.WhiteClassifiationDeploymentType.valueOf(name); }
            if (WhiteTableOptionStatus.name().equals(name())) { return HangarCDef.WhiteTableOptionStatus.valueOf(name); }
            if (GroupingReference.name().equals(name())) { return HangarCDef.GroupingReference.valueOf(name); }
            if (DeprecatedTopBasicType.name().equals(name())) { return HangarCDef.DeprecatedTopBasicType.valueOf(name); }
            if (DeprecatedMapBasicType.name().equals(name())) { return HangarCDef.DeprecatedMapBasicType.valueOf(name); }
            if (DeprecatedMapCollaborationType.name().equals(name())) { return HangarCDef.DeprecatedMapCollaborationType.valueOf(name); }
            if (TopCommentOnly.name().equals(name())) { return HangarCDef.TopCommentOnly.valueOf(name); }
            if (SubItemImplicit.name().equals(name())) { return HangarCDef.SubItemImplicit.valueOf(name); }
            if (SubItemTable.name().equals(name())) { return HangarCDef.SubItemTable.valueOf(name); }
            if (BooleanFlg.name().equals(name())) { return HangarCDef.BooleanFlg.valueOf(name); }
            if (VariantRelationMasterType.name().equals(name())) { return HangarCDef.VariantRelationMasterType.valueOf(name); }
            if (VariantRelationQuxType.name().equals(name())) { return HangarCDef.VariantRelationQuxType.valueOf(name); }
            if (QuxCls.name().equals(name())) { return HangarCDef.QuxCls.valueOf(name); }
            if (EscapedDfpropCls.name().equals(name())) { return HangarCDef.EscapedDfpropCls.valueOf(name); }
            if (EscapedJavaDocCls.name().equals(name())) { return HangarCDef.EscapedJavaDocCls.valueOf(name); }
            if (LineSepCommentCls.name().equals(name())) { return HangarCDef.LineSepCommentCls.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<HangarCDef> listAll() {
            if (Flg.name().equals(name())) { return toClsList(HangarCDef.Flg.listAll()); }
            if (MemberStatus.name().equals(name())) { return toClsList(HangarCDef.MemberStatus.listAll()); }
            if (ServiceRank.name().equals(name())) { return toClsList(HangarCDef.ServiceRank.listAll()); }
            if (Region.name().equals(name())) { return toClsList(HangarCDef.Region.listAll()); }
            if (WithdrawalReason.name().equals(name())) { return toClsList(HangarCDef.WithdrawalReason.listAll()); }
            if (ProductCategory.name().equals(name())) { return toClsList(HangarCDef.ProductCategory.listAll()); }
            if (ProductStatus.name().equals(name())) { return toClsList(HangarCDef.ProductStatus.listAll()); }
            if (PaymentMethod.name().equals(name())) { return toClsList(HangarCDef.PaymentMethod.listAll()); }
            if (WhiteClassifiationDeploymentType.name().equals(name())) { return toClsList(HangarCDef.WhiteClassifiationDeploymentType.listAll()); }
            if (WhiteTableOptionStatus.name().equals(name())) { return toClsList(HangarCDef.WhiteTableOptionStatus.listAll()); }
            if (GroupingReference.name().equals(name())) { return toClsList(HangarCDef.GroupingReference.listAll()); }
            if (DeprecatedTopBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedTopBasicType.listAll()); }
            if (DeprecatedMapBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapBasicType.listAll()); }
            if (DeprecatedMapCollaborationType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapCollaborationType.listAll()); }
            if (TopCommentOnly.name().equals(name())) { return toClsList(HangarCDef.TopCommentOnly.listAll()); }
            if (SubItemImplicit.name().equals(name())) { return toClsList(HangarCDef.SubItemImplicit.listAll()); }
            if (SubItemTable.name().equals(name())) { return toClsList(HangarCDef.SubItemTable.listAll()); }
            if (BooleanFlg.name().equals(name())) { return toClsList(HangarCDef.BooleanFlg.listAll()); }
            if (VariantRelationMasterType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationMasterType.listAll()); }
            if (VariantRelationQuxType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationQuxType.listAll()); }
            if (QuxCls.name().equals(name())) { return toClsList(HangarCDef.QuxCls.listAll()); }
            if (EscapedDfpropCls.name().equals(name())) { return toClsList(HangarCDef.EscapedDfpropCls.listAll()); }
            if (EscapedJavaDocCls.name().equals(name())) { return toClsList(HangarCDef.EscapedJavaDocCls.listAll()); }
            if (LineSepCommentCls.name().equals(name())) { return toClsList(HangarCDef.LineSepCommentCls.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<HangarCDef> listByGroup(String groupName) { // exception if not found
            if (Flg.name().equals(name())) { return toClsList(HangarCDef.Flg.listByGroup(groupName)); }
            if (MemberStatus.name().equals(name())) { return toClsList(HangarCDef.MemberStatus.listByGroup(groupName)); }
            if (ServiceRank.name().equals(name())) { return toClsList(HangarCDef.ServiceRank.listByGroup(groupName)); }
            if (Region.name().equals(name())) { return toClsList(HangarCDef.Region.listByGroup(groupName)); }
            if (WithdrawalReason.name().equals(name())) { return toClsList(HangarCDef.WithdrawalReason.listByGroup(groupName)); }
            if (ProductCategory.name().equals(name())) { return toClsList(HangarCDef.ProductCategory.listByGroup(groupName)); }
            if (ProductStatus.name().equals(name())) { return toClsList(HangarCDef.ProductStatus.listByGroup(groupName)); }
            if (PaymentMethod.name().equals(name())) { return toClsList(HangarCDef.PaymentMethod.listByGroup(groupName)); }
            if (WhiteClassifiationDeploymentType.name().equals(name())) { return toClsList(HangarCDef.WhiteClassifiationDeploymentType.listByGroup(groupName)); }
            if (WhiteTableOptionStatus.name().equals(name())) { return toClsList(HangarCDef.WhiteTableOptionStatus.listByGroup(groupName)); }
            if (GroupingReference.name().equals(name())) { return toClsList(HangarCDef.GroupingReference.listByGroup(groupName)); }
            if (DeprecatedTopBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedTopBasicType.listByGroup(groupName)); }
            if (DeprecatedMapBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapBasicType.listByGroup(groupName)); }
            if (DeprecatedMapCollaborationType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapCollaborationType.listByGroup(groupName)); }
            if (TopCommentOnly.name().equals(name())) { return toClsList(HangarCDef.TopCommentOnly.listByGroup(groupName)); }
            if (SubItemImplicit.name().equals(name())) { return toClsList(HangarCDef.SubItemImplicit.listByGroup(groupName)); }
            if (SubItemTable.name().equals(name())) { return toClsList(HangarCDef.SubItemTable.listByGroup(groupName)); }
            if (BooleanFlg.name().equals(name())) { return toClsList(HangarCDef.BooleanFlg.listByGroup(groupName)); }
            if (VariantRelationMasterType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationMasterType.listByGroup(groupName)); }
            if (VariantRelationQuxType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationQuxType.listByGroup(groupName)); }
            if (QuxCls.name().equals(name())) { return toClsList(HangarCDef.QuxCls.listByGroup(groupName)); }
            if (EscapedDfpropCls.name().equals(name())) { return toClsList(HangarCDef.EscapedDfpropCls.listByGroup(groupName)); }
            if (EscapedJavaDocCls.name().equals(name())) { return toClsList(HangarCDef.EscapedJavaDocCls.listByGroup(groupName)); }
            if (LineSepCommentCls.name().equals(name())) { return toClsList(HangarCDef.LineSepCommentCls.listByGroup(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<HangarCDef> listOf(Collection<String> codeList) {
            if (Flg.name().equals(name())) { return toClsList(HangarCDef.Flg.listOf(codeList)); }
            if (MemberStatus.name().equals(name())) { return toClsList(HangarCDef.MemberStatus.listOf(codeList)); }
            if (ServiceRank.name().equals(name())) { return toClsList(HangarCDef.ServiceRank.listOf(codeList)); }
            if (Region.name().equals(name())) { return toClsList(HangarCDef.Region.listOf(codeList)); }
            if (WithdrawalReason.name().equals(name())) { return toClsList(HangarCDef.WithdrawalReason.listOf(codeList)); }
            if (ProductCategory.name().equals(name())) { return toClsList(HangarCDef.ProductCategory.listOf(codeList)); }
            if (ProductStatus.name().equals(name())) { return toClsList(HangarCDef.ProductStatus.listOf(codeList)); }
            if (PaymentMethod.name().equals(name())) { return toClsList(HangarCDef.PaymentMethod.listOf(codeList)); }
            if (WhiteClassifiationDeploymentType.name().equals(name())) { return toClsList(HangarCDef.WhiteClassifiationDeploymentType.listOf(codeList)); }
            if (WhiteTableOptionStatus.name().equals(name())) { return toClsList(HangarCDef.WhiteTableOptionStatus.listOf(codeList)); }
            if (GroupingReference.name().equals(name())) { return toClsList(HangarCDef.GroupingReference.listOf(codeList)); }
            if (DeprecatedTopBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedTopBasicType.listOf(codeList)); }
            if (DeprecatedMapBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapBasicType.listOf(codeList)); }
            if (DeprecatedMapCollaborationType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapCollaborationType.listOf(codeList)); }
            if (TopCommentOnly.name().equals(name())) { return toClsList(HangarCDef.TopCommentOnly.listOf(codeList)); }
            if (SubItemImplicit.name().equals(name())) { return toClsList(HangarCDef.SubItemImplicit.listOf(codeList)); }
            if (SubItemTable.name().equals(name())) { return toClsList(HangarCDef.SubItemTable.listOf(codeList)); }
            if (BooleanFlg.name().equals(name())) { return toClsList(HangarCDef.BooleanFlg.listOf(codeList)); }
            if (VariantRelationMasterType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationMasterType.listOf(codeList)); }
            if (VariantRelationQuxType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationQuxType.listOf(codeList)); }
            if (QuxCls.name().equals(name())) { return toClsList(HangarCDef.QuxCls.listOf(codeList)); }
            if (EscapedDfpropCls.name().equals(name())) { return toClsList(HangarCDef.EscapedDfpropCls.listOf(codeList)); }
            if (EscapedJavaDocCls.name().equals(name())) { return toClsList(HangarCDef.EscapedJavaDocCls.listOf(codeList)); }
            if (LineSepCommentCls.name().equals(name())) { return toClsList(HangarCDef.LineSepCommentCls.listOf(codeList)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<HangarCDef> groupOf(String groupName) { // old style
            if (Flg.name().equals(name())) { return toClsList(HangarCDef.Flg.groupOf(groupName)); }
            if (MemberStatus.name().equals(name())) { return toClsList(HangarCDef.MemberStatus.groupOf(groupName)); }
            if (ServiceRank.name().equals(name())) { return toClsList(HangarCDef.ServiceRank.groupOf(groupName)); }
            if (Region.name().equals(name())) { return toClsList(HangarCDef.Region.groupOf(groupName)); }
            if (WithdrawalReason.name().equals(name())) { return toClsList(HangarCDef.WithdrawalReason.groupOf(groupName)); }
            if (ProductCategory.name().equals(name())) { return toClsList(HangarCDef.ProductCategory.groupOf(groupName)); }
            if (ProductStatus.name().equals(name())) { return toClsList(HangarCDef.ProductStatus.groupOf(groupName)); }
            if (PaymentMethod.name().equals(name())) { return toClsList(HangarCDef.PaymentMethod.groupOf(groupName)); }
            if (WhiteClassifiationDeploymentType.name().equals(name())) { return toClsList(HangarCDef.WhiteClassifiationDeploymentType.groupOf(groupName)); }
            if (WhiteTableOptionStatus.name().equals(name())) { return toClsList(HangarCDef.WhiteTableOptionStatus.groupOf(groupName)); }
            if (GroupingReference.name().equals(name())) { return toClsList(HangarCDef.GroupingReference.groupOf(groupName)); }
            if (DeprecatedTopBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedTopBasicType.groupOf(groupName)); }
            if (DeprecatedMapBasicType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapBasicType.groupOf(groupName)); }
            if (DeprecatedMapCollaborationType.name().equals(name())) { return toClsList(HangarCDef.DeprecatedMapCollaborationType.groupOf(groupName)); }
            if (TopCommentOnly.name().equals(name())) { return toClsList(HangarCDef.TopCommentOnly.groupOf(groupName)); }
            if (SubItemImplicit.name().equals(name())) { return toClsList(HangarCDef.SubItemImplicit.groupOf(groupName)); }
            if (SubItemTable.name().equals(name())) { return toClsList(HangarCDef.SubItemTable.groupOf(groupName)); }
            if (BooleanFlg.name().equals(name())) { return toClsList(HangarCDef.BooleanFlg.groupOf(groupName)); }
            if (VariantRelationMasterType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationMasterType.groupOf(groupName)); }
            if (VariantRelationQuxType.name().equals(name())) { return toClsList(HangarCDef.VariantRelationQuxType.groupOf(groupName)); }
            if (QuxCls.name().equals(name())) { return toClsList(HangarCDef.QuxCls.groupOf(groupName)); }
            if (EscapedDfpropCls.name().equals(name())) { return toClsList(HangarCDef.EscapedDfpropCls.groupOf(groupName)); }
            if (EscapedJavaDocCls.name().equals(name())) { return toClsList(HangarCDef.EscapedJavaDocCls.groupOf(groupName)); }
            if (LineSepCommentCls.name().equals(name())) { return toClsList(HangarCDef.LineSepCommentCls.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<HangarCDef> toClsList(List<?> clsList) {
            return (List<HangarCDef>)clsList;
        }

        public static Optional<HangarCDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (Flg.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.Flg); }
            if (MemberStatus.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.MemberStatus); }
            if (ServiceRank.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.ServiceRank); }
            if (Region.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.Region); }
            if (WithdrawalReason.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.WithdrawalReason); }
            if (ProductCategory.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.ProductCategory); }
            if (ProductStatus.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.ProductStatus); }
            if (PaymentMethod.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.PaymentMethod); }
            if (WhiteClassifiationDeploymentType.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.WhiteClassifiationDeploymentType); }
            if (WhiteTableOptionStatus.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.WhiteTableOptionStatus); }
            if (GroupingReference.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.GroupingReference); }
            if (DeprecatedTopBasicType.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.DeprecatedTopBasicType); }
            if (DeprecatedMapBasicType.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.DeprecatedMapBasicType); }
            if (DeprecatedMapCollaborationType.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.DeprecatedMapCollaborationType); }
            if (TopCommentOnly.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.TopCommentOnly); }
            if (SubItemImplicit.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.SubItemImplicit); }
            if (SubItemTable.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.SubItemTable); }
            if (BooleanFlg.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.BooleanFlg); }
            if (VariantRelationMasterType.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.VariantRelationMasterType); }
            if (VariantRelationQuxType.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.VariantRelationQuxType); }
            if (QuxCls.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.QuxCls); }
            if (EscapedDfpropCls.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.EscapedDfpropCls); }
            if (EscapedJavaDocCls.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.EscapedJavaDocCls); }
            if (LineSepCommentCls.name().equalsIgnoreCase(classificationName)) { return Optional.of(HangarCDef.DefMeta.LineSepCommentCls); }
            return Optional.empty();
        }

        public static HangarCDef.DefMeta meta(String classificationName) { // old style so use find(name)
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (Flg.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.Flg; }
            if (MemberStatus.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.MemberStatus; }
            if (ServiceRank.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.ServiceRank; }
            if (Region.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.Region; }
            if (WithdrawalReason.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.WithdrawalReason; }
            if (ProductCategory.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.ProductCategory; }
            if (ProductStatus.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.ProductStatus; }
            if (PaymentMethod.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.PaymentMethod; }
            if (WhiteClassifiationDeploymentType.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.WhiteClassifiationDeploymentType; }
            if (WhiteTableOptionStatus.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.WhiteTableOptionStatus; }
            if (GroupingReference.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.GroupingReference; }
            if (DeprecatedTopBasicType.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.DeprecatedTopBasicType; }
            if (DeprecatedMapBasicType.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.DeprecatedMapBasicType; }
            if (DeprecatedMapCollaborationType.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.DeprecatedMapCollaborationType; }
            if (TopCommentOnly.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.TopCommentOnly; }
            if (SubItemImplicit.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.SubItemImplicit; }
            if (SubItemTable.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.SubItemTable; }
            if (BooleanFlg.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.BooleanFlg; }
            if (VariantRelationMasterType.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.VariantRelationMasterType; }
            if (VariantRelationQuxType.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.VariantRelationQuxType; }
            if (QuxCls.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.QuxCls; }
            if (EscapedDfpropCls.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.EscapedDfpropCls; }
            if (EscapedJavaDocCls.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.EscapedJavaDocCls; }
            if (LineSepCommentCls.name().equalsIgnoreCase(classificationName)) { return HangarCDef.DefMeta.LineSepCommentCls; }
            throw new IllegalStateException("Unknown classification: " + classificationName);
        }

        @SuppressWarnings("unused")
        private String[] xinternalEmptyString() {
            return emptyStrings(); // to suppress 'unused' warning of import statement
        }
    }
}
