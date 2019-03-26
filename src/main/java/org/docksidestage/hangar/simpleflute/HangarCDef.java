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
        Formalized("FML", "Formalized", emptyStrings())
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", emptyStrings())
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", emptyStrings())
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
        private MemberStatus(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public DefMeta meta() { return HangarCDef.DefMeta.MemberStatus; }

        public String key1() {
            return (String)subItemMap().get("key1");
        }

        public String key2() {
            return (String)subItemMap().get("key2");
        }

        public boolean inGroup(String groupName) {
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
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<MemberStatus> groupOf(String groupName) {
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
            throw new IllegalStateException("Unknown classification: " + classificationName);
        }

        @SuppressWarnings("unused")
        private String[] xinternalEmptyString() {
            return emptyStrings(); // to suppress 'unused' warning of import statement
        }
    }
}
