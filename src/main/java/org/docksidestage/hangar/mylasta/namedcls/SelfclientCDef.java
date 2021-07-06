package org.docksidestage.hangar.mylasta.namedcls;

import java.util.*;

import org.dbflute.exception.ClassificationNotFoundException;
import org.dbflute.jdbc.Classification;
import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.jdbc.ClassificationMeta;
import org.dbflute.jdbc.ClassificationUndefinedHandlingType;
import org.dbflute.optional.OptionalThing;
import static org.dbflute.util.DfTypeUtil.emptyStrings;

/**
 * The definition of selfclient classification.
 * @author FreeGen
 */
public interface SelfclientCDef extends Classification {

    /**
     * test of included, expects grouping, sub-item, sisters
     */
    public enum AppSea implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ;
        private static final Map<String, AppSea> _codeClsMap = new HashMap<String, AppSea>();
        private static final Map<String, AppSea> _nameClsMap = new HashMap<String, AppSea>();
        static {
            for (AppSea value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
        private AppSea(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppSea; }

        public String order() {
            return (String)subItemMap().get("order");
        }

        public String desc() {
            return (String)subItemMap().get("desc");
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<AppSea> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppSea) { return OptionalThing.of((AppSea)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppSea> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppSea codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppSea) { return (AppSea)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppSea nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppSea> listAll() {
            return new ArrayList<AppSea>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppSea> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppSea." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppSea> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppSea> clsList = new ArrayList<AppSea>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppSea> listOfServiceAvailable() {
            return new ArrayList<AppSea>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppSea> listOfShortOfFormalized() {
            return new ArrayList<AppSea>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppSea> listOfUnauthorized() {
            return new ArrayList<AppSea>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppSea> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppSea>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of exists, expects no grouping, no sub-item, sisters
     */
    public enum AppLand implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase", emptyStrings())
        ,
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean", emptyStrings())
        ;
        private static final Map<String, AppLand> _codeClsMap = new HashMap<String, AppLand>();
        private static final Map<String, AppLand> _nameClsMap = new HashMap<String, AppLand>();
        static {
            for (AppLand value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppLand(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppLand; }

        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return OneMan.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() {
            return MiniO.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("unauthorized".equals(groupName)) { return isUnauthorized(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppLand> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppLand) { return OptionalThing.of((AppLand)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppLand> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppLand codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppLand) { return (AppLand)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppLand nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppLand> listAll() {
            return new ArrayList<AppLand>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppLand> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppLand." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppLand> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppLand> clsList = new ArrayList<AppLand>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppLand> listOfServiceAvailable() {
            return new ArrayList<AppLand>(Arrays.asList(OneMan));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppLand> listOfUnauthorized() {
            return new ArrayList<AppLand>(Arrays.asList(MiniO));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppLand> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppLand>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of matches, expects no grouping, no sub-item, sisters
     */
    public enum AppPiari implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase", emptyStrings())
        ,
        /** Castle: Provisional */
        Parade("PRV", "Castle", emptyStrings())
        ,
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean", emptyStrings())
        ;
        private static final Map<String, AppPiari> _codeClsMap = new HashMap<String, AppPiari>();
        private static final Map<String, AppPiari> _nameClsMap = new HashMap<String, AppPiari>();
        static {
            for (AppPiari value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppPiari(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppPiari; }

        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan, Parade]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return OneMan.equals(this) || Parade.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Parade]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Parade.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() {
            return MiniO.equals(this);
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
        public static OptionalThing<AppPiari> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppPiari) { return OptionalThing.of((AppPiari)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppPiari> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppPiari codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppPiari) { return (AppPiari)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppPiari nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppPiari> listAll() {
            return new ArrayList<AppPiari>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppPiari> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppPiari." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppPiari> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppPiari> clsList = new ArrayList<AppPiari>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan, Parade]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPiari> listOfServiceAvailable() {
            return new ArrayList<AppPiari>(Arrays.asList(OneMan, Parade));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Parade]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPiari> listOfShortOfFormalized() {
            return new ArrayList<AppPiari>(Arrays.asList(Parade));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPiari> listOfUnauthorized() {
            return new ArrayList<AppPiari>(Arrays.asList(MiniO));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppPiari> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppPiari>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of manual grouping map using refCls as included, expects overridden, added
     */
    public enum AppBonvo implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ,
        /** Hangar: Rhythms */
        Mystic("MYS", "Hangar", emptyStrings())
        ;
        private static final Map<String, AppBonvo> _codeClsMap = new HashMap<String, AppBonvo>();
        private static final Map<String, AppBonvo> _nameClsMap = new HashMap<String, AppBonvo>();
        static {
            for (AppBonvo value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "88");
                _subItemMapMap.put(Mystic.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppBonvo(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppBonvo; }

        public String order() {
            return (String)subItemMap().get("order");
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The determination, true or false.
         */
        public boolean isAppNewLiteralAvailable() {
            return Formalized.equals(this) || Provisional.equals(this) || Mystic.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The determination, true or false.
         */
        public boolean isAppNewRefExistingGroupAvailable() {
            return Formalized.equals(this) || Provisional.equals(this) || Mystic.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Withdrawal]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() {
            return Withdrawal.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("appNewLiteralAvailable".equals(groupName)) { return isAppNewLiteralAvailable(); }
            if ("appNewRefExistingGroupAvailable".equals(groupName)) { return isAppNewRefExistingGroupAvailable(); }
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
        public static OptionalThing<AppBonvo> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppBonvo) { return OptionalThing.of((AppBonvo)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppBonvo> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppBonvo codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppBonvo) { return (AppBonvo)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppBonvo nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppBonvo> listAll() {
            return new ArrayList<AppBonvo>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppBonvo> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("appNewLiteralAvailable".equalsIgnoreCase(groupName)) { return listOfAppNewLiteralAvailable(); }
            if ("appNewRefExistingGroupAvailable".equalsIgnoreCase(groupName)) { return listOfAppNewRefExistingGroupAvailable(); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppBonvo." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppBonvo> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppBonvo> clsList = new ArrayList<AppBonvo>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfAppNewLiteralAvailable() {
            return new ArrayList<AppBonvo>(Arrays.asList(Formalized, Provisional, Mystic));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfAppNewRefExistingGroupAvailable() {
            return new ArrayList<AppBonvo>(Arrays.asList(Formalized, Provisional, Mystic));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfServiceAvailable() {
            return new ArrayList<AppBonvo>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfShortOfFormalized() {
            return new ArrayList<AppBonvo>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfUnauthorized() {
            return new ArrayList<AppBonvo>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppBonvo> groupOf(String groupName) {
            if ("appNewLiteralAvailable".equals(groupName)) { return listOfAppNewLiteralAvailable(); }
            if ("appNewRefExistingGroupAvailable".equals(groupName)) { return listOfAppNewRefExistingGroupAvailable(); }
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppBonvo>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of manual grouping map using refCls as exists, expects new grouping is available
     */
    public enum AppDstore implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase", emptyStrings())
        ,
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean", emptyStrings())
        ;
        private static final Map<String, AppDstore> _codeClsMap = new HashMap<String, AppDstore>();
        private static final Map<String, AppDstore> _nameClsMap = new HashMap<String, AppDstore>();
        static {
            for (AppDstore value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppDstore(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppDstore; }

        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan, MiniO]
         * @return The determination, true or false.
         */
        public boolean isAppNewAvailable() {
            return OneMan.equals(this) || MiniO.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return OneMan.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() {
            return MiniO.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("appNewAvailable".equals(groupName)) { return isAppNewAvailable(); }
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("unauthorized".equals(groupName)) { return isUnauthorized(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDstore> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppDstore) { return OptionalThing.of((AppDstore)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDstore> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppDstore codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppDstore) { return (AppDstore)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppDstore nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppDstore> listAll() {
            return new ArrayList<AppDstore>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppDstore> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("appNewAvailable".equalsIgnoreCase(groupName)) { return listOfAppNewAvailable(); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppDstore." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppDstore> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppDstore> clsList = new ArrayList<AppDstore>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan, MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDstore> listOfAppNewAvailable() {
            return new ArrayList<AppDstore>(Arrays.asList(OneMan, MiniO));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDstore> listOfServiceAvailable() {
            return new ArrayList<AppDstore>(Arrays.asList(OneMan));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDstore> listOfUnauthorized() {
            return new ArrayList<AppDstore>(Arrays.asList(MiniO));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppDstore> groupOf(String groupName) {
            if ("appNewAvailable".equals(groupName)) { return listOfAppNewAvailable(); }
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppDstore>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of manual sub-item and sisters as included, expects merged, only order() exists
     */
    public enum AppAmba implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ,
        /** Hangar: Rhythms */
        Mystic("MYS", "Hangar", new String[] {"Choucho"})
        ;
        private static final Map<String, AppAmba> _codeClsMap = new HashMap<String, AppAmba>();
        private static final Map<String, AppAmba> _nameClsMap = new HashMap<String, AppAmba>();
        static {
            for (AppAmba value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "1");
                subItemMap.put("newKeyword", "shining");
                _subItemMapMap.put(Mystic.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppAmba(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppAmba; }

        public String order() {
            return (String)subItemMap().get("order");
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<AppAmba> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppAmba) { return OptionalThing.of((AppAmba)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppAmba> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppAmba codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppAmba) { return (AppAmba)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppAmba nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppAmba> listAll() {
            return new ArrayList<AppAmba>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppAmba> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppAmba." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppAmba> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppAmba> clsList = new ArrayList<AppAmba>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppAmba> listOfServiceAvailable() {
            return new ArrayList<AppAmba>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppAmba> listOfShortOfFormalized() {
            return new ArrayList<AppAmba>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppAmba> listOfUnauthorized() {
            return new ArrayList<AppAmba>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppAmba> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppAmba>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of manual sub-item and sisters as exists, expects new only here
     */
    public enum AppMiraco implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase", new String[] {"ONE"})
        ,
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean", new String[] {"MIN"})
        ;
        private static final Map<String, AppMiraco> _codeClsMap = new HashMap<String, AppMiraco>();
        private static final Map<String, AppMiraco> _nameClsMap = new HashMap<String, AppMiraco>();
        static {
            for (AppMiraco value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
            }
        }
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "1");
                subItemMap.put("newKeyword", "shining");
                _subItemMapMap.put(OneMan.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("order", "8");
                subItemMap.put("newKeyword", "party");
                _subItemMapMap.put(MiniO.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppMiraco(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppMiraco; }

        public String order() {
            return (String)subItemMap().get("order");
        }

        public String newKeyword() {
            return (String)subItemMap().get("newKeyword");
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return OneMan.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() {
            return MiniO.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("unauthorized".equals(groupName)) { return isUnauthorized(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppMiraco> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppMiraco) { return OptionalThing.of((AppMiraco)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppMiraco> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppMiraco codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppMiraco) { return (AppMiraco)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppMiraco nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppMiraco> listAll() {
            return new ArrayList<AppMiraco>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppMiraco> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppMiraco." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppMiraco> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppMiraco> clsList = new ArrayList<AppMiraco>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppMiraco> listOfServiceAvailable() {
            return new ArrayList<AppMiraco>(Arrays.asList(OneMan));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppMiraco> listOfUnauthorized() {
            return new ArrayList<AppMiraco>(Arrays.asList(MiniO));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppMiraco> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<AppMiraco>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of referring group, expects grouped elements only and sub-item, sisters exist
     */
    public enum AppDohotel implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ;
        private static final Map<String, AppDohotel> _codeClsMap = new HashMap<String, AppDohotel>();
        private static final Map<String, AppDohotel> _nameClsMap = new HashMap<String, AppDohotel>();
        static {
            for (AppDohotel value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
                subItemMap.put("order", "3");
                subItemMap.put("desc", "first status after entry, allowed to use only part of service");
                _subItemMapMap.put(Provisional.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppDohotel(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppDohotel; }

        public String order() {
            return (String)subItemMap().get("order");
        }

        public String desc() {
            return (String)subItemMap().get("desc");
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return isServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return isShortOfFormalized(); }
            return false;
        }

        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDohotel> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppDohotel) { return OptionalThing.of((AppDohotel)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDohotel> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppDohotel codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppDohotel) { return (AppDohotel)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppDohotel nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppDohotel> listAll() {
            return new ArrayList<AppDohotel>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppDohotel> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppDohotel." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppDohotel> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppDohotel> clsList = new ArrayList<AppDohotel>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDohotel> listOfServiceAvailable() {
            return new ArrayList<AppDohotel>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDohotel> listOfShortOfFormalized() {
            return new ArrayList<AppDohotel>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppDohotel> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            return new ArrayList<AppDohotel>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of including sub-item and sisters when implicit classification
     */
    public enum AppFlg implements SelfclientCDef {
        /** Yes: means valid */
        True("1", "Yes", new String[] {"true"})
        ,
        /** No: means invalid */
        False("0", "No", new String[] {"false"})
        ;
        private static final Map<String, AppFlg> _codeClsMap = new HashMap<String, AppFlg>();
        private static final Map<String, AppFlg> _nameClsMap = new HashMap<String, AppFlg>();
        static {
            for (AppFlg value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
        private AppFlg(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppFlg; }

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
        public static OptionalThing<AppFlg> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppFlg) { return OptionalThing.of((AppFlg)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppFlg> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppFlg codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppFlg) { return (AppFlg)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppFlg nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppFlg> listAll() {
            return new ArrayList<AppFlg>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppFlg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: AppFlg." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppFlg> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppFlg> clsList = new ArrayList<AppFlg>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppFlg> groupOf(String groupName) {
            return new ArrayList<AppFlg>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of including grouping map when implicit classification
     */
    public enum AppPaymentMethod implements SelfclientCDef {
        /** by hand: payment by hand, face-to-face */
        ByHand("HAN", "by hand", emptyStrings())
        ,
        /** bank transfer: bank transfer payment */
        BankTransfer("BAK", "bank transfer", emptyStrings())
        ,
        /** credit card: credit card payment */
        CreditCard("CRC", "credit card", emptyStrings())
        ;
        private static final Map<String, AppPaymentMethod> _codeClsMap = new HashMap<String, AppPaymentMethod>();
        private static final Map<String, AppPaymentMethod> _nameClsMap = new HashMap<String, AppPaymentMethod>();
        static {
            for (AppPaymentMethod value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private AppPaymentMethod(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppPaymentMethod; }

        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<AppPaymentMethod> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof AppPaymentMethod) { return OptionalThing.of((AppPaymentMethod)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppPaymentMethod> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppPaymentMethod codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof AppPaymentMethod) { return (AppPaymentMethod)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static AppPaymentMethod nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppPaymentMethod> listAll() {
            return new ArrayList<AppPaymentMethod>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<AppPaymentMethod> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("recommended".equalsIgnoreCase(groupName)) { return listOfRecommended(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppPaymentMethod." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<AppPaymentMethod> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<AppPaymentMethod> clsList = new ArrayList<AppPaymentMethod>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[ByHand]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPaymentMethod> listOfRecommended() {
            return new ArrayList<AppPaymentMethod>(Arrays.asList(ByHand));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<AppPaymentMethod> groupOf(String groupName) {
            if ("recommended".equals(groupName)) { return listOfRecommended(); }
            return new ArrayList<AppPaymentMethod>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of groupingMap when literal only
     */
    public enum DeepWxLiteralGrouping implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase", emptyStrings())
        ,
        /** Castle: Provisional */
        Parade("PRV", "Castle", emptyStrings())
        ,
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean", emptyStrings())
        ;
        private static final Map<String, DeepWxLiteralGrouping> _codeClsMap = new HashMap<String, DeepWxLiteralGrouping>();
        private static final Map<String, DeepWxLiteralGrouping> _nameClsMap = new HashMap<String, DeepWxLiteralGrouping>();
        static {
            for (DeepWxLiteralGrouping value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeepWxLiteralGrouping(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.DeepWxLiteralGrouping; }

        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan, Parade]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return OneMan.equals(this) || Parade.equals(this);
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
        public static OptionalThing<DeepWxLiteralGrouping> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof DeepWxLiteralGrouping) { return OptionalThing.of((DeepWxLiteralGrouping)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxLiteralGrouping> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeepWxLiteralGrouping codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeepWxLiteralGrouping) { return (DeepWxLiteralGrouping)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeepWxLiteralGrouping nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeepWxLiteralGrouping> listAll() {
            return new ArrayList<DeepWxLiteralGrouping>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<DeepWxLiteralGrouping> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeepWxLiteralGrouping." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<DeepWxLiteralGrouping> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<DeepWxLiteralGrouping> clsList = new ArrayList<DeepWxLiteralGrouping>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan, Parade]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxLiteralGrouping> listOfServiceAvailable() {
            return new ArrayList<DeepWxLiteralGrouping>(Arrays.asList(OneMan, Parade));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<DeepWxLiteralGrouping> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            return new ArrayList<DeepWxLiteralGrouping>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of deprecated classification top
     */
    public enum DeepWxDeprecatedCls implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ,
        /** All Statuses: without status filter */
        All("ALL", "All Statuses", emptyStrings())
        ;
        private static final Map<String, DeepWxDeprecatedCls> _codeClsMap = new HashMap<String, DeepWxDeprecatedCls>();
        private static final Map<String, DeepWxDeprecatedCls> _nameClsMap = new HashMap<String, DeepWxDeprecatedCls>();
        static {
            for (DeepWxDeprecatedCls value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                _subItemMapMap.put(All.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeepWxDeprecatedCls(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.DeepWxDeprecatedCls; }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<DeepWxDeprecatedCls> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof DeepWxDeprecatedCls) { return OptionalThing.of((DeepWxDeprecatedCls)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxDeprecatedCls> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeepWxDeprecatedCls codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeepWxDeprecatedCls) { return (DeepWxDeprecatedCls)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeepWxDeprecatedCls nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listAll() {
            return new ArrayList<DeepWxDeprecatedCls>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<DeepWxDeprecatedCls> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeepWxDeprecatedCls." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<DeepWxDeprecatedCls> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<DeepWxDeprecatedCls> clsList = new ArrayList<DeepWxDeprecatedCls>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfServiceAvailable() {
            return new ArrayList<DeepWxDeprecatedCls>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfShortOfFormalized() {
            return new ArrayList<DeepWxDeprecatedCls>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfUnauthorized() {
            return new ArrayList<DeepWxDeprecatedCls>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<DeepWxDeprecatedCls> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<DeepWxDeprecatedCls>(4);
        }

        @Override public String toString() { return code(); }
    }

    /**
     * test of deprecatedMap
     */
    public enum DeepWxDeprecatedElement implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"})
        ,
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"})
        ,
        /** Provisional: first status after entry, allowed to use only part of service (deprecated: test of deprecated) */
        @Deprecated
        Provisional("PRV", "Provisional", new String[] {"Provisional"})
        ,
        /** All Statuses: without status filter (deprecated: and also test of deprecated) */
        @Deprecated
        All("ALL", "All Statuses", emptyStrings())
        ;
        private static final Map<String, DeepWxDeprecatedElement> _codeClsMap = new HashMap<String, DeepWxDeprecatedElement>();
        private static final Map<String, DeepWxDeprecatedElement> _nameClsMap = new HashMap<String, DeepWxDeprecatedElement>();
        static {
            for (DeepWxDeprecatedElement value : values()) {
                _codeClsMap.put(value.code().toLowerCase(), value);
                for (String sister : value.sisterSet()) { _codeClsMap.put(sister.toLowerCase(), value); }
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
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                _subItemMapMap.put(All.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias; private Set<String> _sisterSet;
        private DeepWxDeprecatedElement(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = Collections.unmodifiableSet(new LinkedHashSet<String>(Arrays.asList(sisters))); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.DeepWxDeprecatedElement; }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() {
            return Formalized.equals(this) || Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() {
            return Provisional.equals(this);
        }

        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<DeepWxDeprecatedElement> of(Object code) {
            if (code == null) { return OptionalThing.ofNullable(null, () -> { throw new ClassificationNotFoundException("null code specified"); }); }
            if (code instanceof DeepWxDeprecatedElement) { return OptionalThing.of((DeepWxDeprecatedElement)code); }
            if (code instanceof OptionalThing<?>) { return of(((OptionalThing<?>)code).orElse(null)); }
            return OptionalThing.ofNullable(_codeClsMap.get(code.toString().toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification code: " + code);
            });
        }

        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxDeprecatedElement> byName(String name) {
            if (name == null) { throw new IllegalArgumentException("The argument 'name' should not be null."); }
            return OptionalThing.ofNullable(_nameClsMap.get(name.toLowerCase()), () ->{
                throw new ClassificationNotFoundException("Unknown classification name: " + name);
            });
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span> <br>
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeepWxDeprecatedElement codeOf(Object code) {
            if (code == null) { return null; }
            if (code instanceof DeepWxDeprecatedElement) { return (DeepWxDeprecatedElement)code; }
            return _codeClsMap.get(code.toString().toLowerCase());
        }

        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use byName(name).</span> <br>
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        public static DeepWxDeprecatedElement nameOf(String name) {
            if (name == null) { return null; }
            try { return valueOf(name); } catch (RuntimeException ignored) { return null; }
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listAll() {
            return new ArrayList<DeepWxDeprecatedElement>(Arrays.asList(values()));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if not found, throws exception)
         */
        public static List<DeepWxDeprecatedElement> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeepWxDeprecatedElement." + groupName);
        }

        /**
         * Get the list of classification elements corresponding to the specified codes. (returns new copied list) <br>
         * @param codeList The list of plain code, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the code list. (NotNull, EmptyAllowed: when empty specified)
         */
        public static List<DeepWxDeprecatedElement> listOf(Collection<String> codeList) {
            if (codeList == null) { throw new IllegalArgumentException("The argument 'codeList' should not be null."); }
            List<DeepWxDeprecatedElement> clsList = new ArrayList<DeepWxDeprecatedElement>(codeList.size());
            for (String code : codeList) { clsList.add(of(code).get()); }
            return clsList;
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfServiceAvailable() {
            return new ArrayList<DeepWxDeprecatedElement>(Arrays.asList(Formalized, Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfShortOfFormalized() {
            return new ArrayList<DeepWxDeprecatedElement>(Arrays.asList(Provisional));
        }

        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfUnauthorized() {
            return new ArrayList<DeepWxDeprecatedElement>(Arrays.asList(Withdrawal));
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br>
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The snapshot list of classification elements in the group. (NotNull, EmptyAllowed: if the group is not found)
         */
        public static List<DeepWxDeprecatedElement> groupOf(String groupName) {
            if ("serviceAvailable".equals(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equals(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equals(groupName)) { return listOfUnauthorized(); }
            return new ArrayList<DeepWxDeprecatedElement>(4);
        }

        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** test of included, expects grouping, sub-item, sisters */
        AppSea
        ,
        /** test of exists, expects no grouping, no sub-item, sisters */
        AppLand
        ,
        /** test of matches, expects no grouping, no sub-item, sisters */
        AppPiari
        ,
        /** test of manual grouping map using refCls as included, expects overridden, added */
        AppBonvo
        ,
        /** test of manual grouping map using refCls as exists, expects new grouping is available */
        AppDstore
        ,
        /** test of manual sub-item and sisters as included, expects merged, only order() exists */
        AppAmba
        ,
        /** test of manual sub-item and sisters as exists, expects new only here */
        AppMiraco
        ,
        /** test of referring group, expects grouped elements only and sub-item, sisters exist */
        AppDohotel
        ,
        /** test of including sub-item and sisters when implicit classification */
        AppFlg
        ,
        /** test of including grouping map when implicit classification */
        AppPaymentMethod
        ,
        /** test of groupingMap when literal only */
        DeepWxLiteralGrouping
        ,
        /** test of deprecated classification top */
        DeepWxDeprecatedCls
        ,
        /** test of deprecatedMap */
        DeepWxDeprecatedElement
        ;
        public String classificationName() {
            return name(); // same as definition name
        }

        public OptionalThing<? extends Classification> of(Object code) {
            if (AppSea.name().equals(name())) { return SelfclientCDef.AppSea.of(code); }
            if (AppLand.name().equals(name())) { return SelfclientCDef.AppLand.of(code); }
            if (AppPiari.name().equals(name())) { return SelfclientCDef.AppPiari.of(code); }
            if (AppBonvo.name().equals(name())) { return SelfclientCDef.AppBonvo.of(code); }
            if (AppDstore.name().equals(name())) { return SelfclientCDef.AppDstore.of(code); }
            if (AppAmba.name().equals(name())) { return SelfclientCDef.AppAmba.of(code); }
            if (AppMiraco.name().equals(name())) { return SelfclientCDef.AppMiraco.of(code); }
            if (AppDohotel.name().equals(name())) { return SelfclientCDef.AppDohotel.of(code); }
            if (AppFlg.name().equals(name())) { return SelfclientCDef.AppFlg.of(code); }
            if (AppPaymentMethod.name().equals(name())) { return SelfclientCDef.AppPaymentMethod.of(code); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return SelfclientCDef.DeepWxLiteralGrouping.of(code); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedCls.of(code); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedElement.of(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public OptionalThing<? extends Classification> byName(String name) {
            if (AppSea.name().equals(name())) { return SelfclientCDef.AppSea.byName(name); }
            if (AppLand.name().equals(name())) { return SelfclientCDef.AppLand.byName(name); }
            if (AppPiari.name().equals(name())) { return SelfclientCDef.AppPiari.byName(name); }
            if (AppBonvo.name().equals(name())) { return SelfclientCDef.AppBonvo.byName(name); }
            if (AppDstore.name().equals(name())) { return SelfclientCDef.AppDstore.byName(name); }
            if (AppAmba.name().equals(name())) { return SelfclientCDef.AppAmba.byName(name); }
            if (AppMiraco.name().equals(name())) { return SelfclientCDef.AppMiraco.byName(name); }
            if (AppDohotel.name().equals(name())) { return SelfclientCDef.AppDohotel.byName(name); }
            if (AppFlg.name().equals(name())) { return SelfclientCDef.AppFlg.byName(name); }
            if (AppPaymentMethod.name().equals(name())) { return SelfclientCDef.AppPaymentMethod.byName(name); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return SelfclientCDef.DeepWxLiteralGrouping.byName(name); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedCls.byName(name); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedElement.byName(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification codeOf(Object code) { // null if not found, old style so use of(code)
            if (AppSea.name().equals(name())) { return SelfclientCDef.AppSea.codeOf(code); }
            if (AppLand.name().equals(name())) { return SelfclientCDef.AppLand.codeOf(code); }
            if (AppPiari.name().equals(name())) { return SelfclientCDef.AppPiari.codeOf(code); }
            if (AppBonvo.name().equals(name())) { return SelfclientCDef.AppBonvo.codeOf(code); }
            if (AppDstore.name().equals(name())) { return SelfclientCDef.AppDstore.codeOf(code); }
            if (AppAmba.name().equals(name())) { return SelfclientCDef.AppAmba.codeOf(code); }
            if (AppMiraco.name().equals(name())) { return SelfclientCDef.AppMiraco.codeOf(code); }
            if (AppDohotel.name().equals(name())) { return SelfclientCDef.AppDohotel.codeOf(code); }
            if (AppFlg.name().equals(name())) { return SelfclientCDef.AppFlg.codeOf(code); }
            if (AppPaymentMethod.name().equals(name())) { return SelfclientCDef.AppPaymentMethod.codeOf(code); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return SelfclientCDef.DeepWxLiteralGrouping.codeOf(code); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedCls.codeOf(code); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedElement.codeOf(code); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public Classification nameOf(String name) { // null if not found, old style so use byName(name)
            if (AppSea.name().equals(name())) { return SelfclientCDef.AppSea.valueOf(name); }
            if (AppLand.name().equals(name())) { return SelfclientCDef.AppLand.valueOf(name); }
            if (AppPiari.name().equals(name())) { return SelfclientCDef.AppPiari.valueOf(name); }
            if (AppBonvo.name().equals(name())) { return SelfclientCDef.AppBonvo.valueOf(name); }
            if (AppDstore.name().equals(name())) { return SelfclientCDef.AppDstore.valueOf(name); }
            if (AppAmba.name().equals(name())) { return SelfclientCDef.AppAmba.valueOf(name); }
            if (AppMiraco.name().equals(name())) { return SelfclientCDef.AppMiraco.valueOf(name); }
            if (AppDohotel.name().equals(name())) { return SelfclientCDef.AppDohotel.valueOf(name); }
            if (AppFlg.name().equals(name())) { return SelfclientCDef.AppFlg.valueOf(name); }
            if (AppPaymentMethod.name().equals(name())) { return SelfclientCDef.AppPaymentMethod.valueOf(name); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return SelfclientCDef.DeepWxLiteralGrouping.valueOf(name); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedCls.valueOf(name); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return SelfclientCDef.DeepWxDeprecatedElement.valueOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listAll() {
            if (AppSea.name().equals(name())) { return toClsList(SelfclientCDef.AppSea.listAll()); }
            if (AppLand.name().equals(name())) { return toClsList(SelfclientCDef.AppLand.listAll()); }
            if (AppPiari.name().equals(name())) { return toClsList(SelfclientCDef.AppPiari.listAll()); }
            if (AppBonvo.name().equals(name())) { return toClsList(SelfclientCDef.AppBonvo.listAll()); }
            if (AppDstore.name().equals(name())) { return toClsList(SelfclientCDef.AppDstore.listAll()); }
            if (AppAmba.name().equals(name())) { return toClsList(SelfclientCDef.AppAmba.listAll()); }
            if (AppMiraco.name().equals(name())) { return toClsList(SelfclientCDef.AppMiraco.listAll()); }
            if (AppDohotel.name().equals(name())) { return toClsList(SelfclientCDef.AppDohotel.listAll()); }
            if (AppFlg.name().equals(name())) { return toClsList(SelfclientCDef.AppFlg.listAll()); }
            if (AppPaymentMethod.name().equals(name())) { return toClsList(SelfclientCDef.AppPaymentMethod.listAll()); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxLiteralGrouping.listAll()); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedCls.listAll()); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedElement.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> listByGroup(String groupName) { // exception if not found
            if (AppSea.name().equals(name())) { return toClsList(SelfclientCDef.AppSea.listByGroup(groupName)); }
            if (AppLand.name().equals(name())) { return toClsList(SelfclientCDef.AppLand.listByGroup(groupName)); }
            if (AppPiari.name().equals(name())) { return toClsList(SelfclientCDef.AppPiari.listByGroup(groupName)); }
            if (AppBonvo.name().equals(name())) { return toClsList(SelfclientCDef.AppBonvo.listByGroup(groupName)); }
            if (AppDstore.name().equals(name())) { return toClsList(SelfclientCDef.AppDstore.listByGroup(groupName)); }
            if (AppAmba.name().equals(name())) { return toClsList(SelfclientCDef.AppAmba.listByGroup(groupName)); }
            if (AppMiraco.name().equals(name())) { return toClsList(SelfclientCDef.AppMiraco.listByGroup(groupName)); }
            if (AppDohotel.name().equals(name())) { return toClsList(SelfclientCDef.AppDohotel.listByGroup(groupName)); }
            if (AppFlg.name().equals(name())) { return toClsList(SelfclientCDef.AppFlg.listByGroup(groupName)); }
            if (AppPaymentMethod.name().equals(name())) { return toClsList(SelfclientCDef.AppPaymentMethod.listByGroup(groupName)); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxLiteralGrouping.listByGroup(groupName)); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedCls.listByGroup(groupName)); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedElement.listByGroup(groupName)); }
            throw new IllegalStateException("Unknown groupName: " + groupName + ", " + this); // basically unreachable
        }

        public List<Classification> listOf(Collection<String> codeList) {
            if (AppSea.name().equals(name())) { return toClsList(SelfclientCDef.AppSea.listOf(codeList)); }
            if (AppLand.name().equals(name())) { return toClsList(SelfclientCDef.AppLand.listOf(codeList)); }
            if (AppPiari.name().equals(name())) { return toClsList(SelfclientCDef.AppPiari.listOf(codeList)); }
            if (AppBonvo.name().equals(name())) { return toClsList(SelfclientCDef.AppBonvo.listOf(codeList)); }
            if (AppDstore.name().equals(name())) { return toClsList(SelfclientCDef.AppDstore.listOf(codeList)); }
            if (AppAmba.name().equals(name())) { return toClsList(SelfclientCDef.AppAmba.listOf(codeList)); }
            if (AppMiraco.name().equals(name())) { return toClsList(SelfclientCDef.AppMiraco.listOf(codeList)); }
            if (AppDohotel.name().equals(name())) { return toClsList(SelfclientCDef.AppDohotel.listOf(codeList)); }
            if (AppFlg.name().equals(name())) { return toClsList(SelfclientCDef.AppFlg.listOf(codeList)); }
            if (AppPaymentMethod.name().equals(name())) { return toClsList(SelfclientCDef.AppPaymentMethod.listOf(codeList)); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxLiteralGrouping.listOf(codeList)); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedCls.listOf(codeList)); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedElement.listOf(codeList)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        public List<Classification> groupOf(String groupName) { // old style
            if (AppSea.name().equals(name())) { return toClsList(SelfclientCDef.AppSea.groupOf(groupName)); }
            if (AppLand.name().equals(name())) { return toClsList(SelfclientCDef.AppLand.groupOf(groupName)); }
            if (AppPiari.name().equals(name())) { return toClsList(SelfclientCDef.AppPiari.groupOf(groupName)); }
            if (AppBonvo.name().equals(name())) { return toClsList(SelfclientCDef.AppBonvo.groupOf(groupName)); }
            if (AppDstore.name().equals(name())) { return toClsList(SelfclientCDef.AppDstore.groupOf(groupName)); }
            if (AppAmba.name().equals(name())) { return toClsList(SelfclientCDef.AppAmba.groupOf(groupName)); }
            if (AppMiraco.name().equals(name())) { return toClsList(SelfclientCDef.AppMiraco.groupOf(groupName)); }
            if (AppDohotel.name().equals(name())) { return toClsList(SelfclientCDef.AppDohotel.groupOf(groupName)); }
            if (AppFlg.name().equals(name())) { return toClsList(SelfclientCDef.AppFlg.groupOf(groupName)); }
            if (AppPaymentMethod.name().equals(name())) { return toClsList(SelfclientCDef.AppPaymentMethod.groupOf(groupName)); }
            if (DeepWxLiteralGrouping.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxLiteralGrouping.groupOf(groupName)); }
            if (DeepWxDeprecatedCls.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedCls.groupOf(groupName)); }
            if (DeepWxDeprecatedElement.name().equals(name())) { return toClsList(SelfclientCDef.DeepWxDeprecatedElement.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        @SuppressWarnings("unchecked")
        private List<Classification> toClsList(List<?> clsList) {
            return (List<Classification>)clsList;
        }

        public ClassificationCodeType codeType() {
            if (AppSea.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppLand.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppPiari.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppBonvo.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppDstore.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppAmba.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppMiraco.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppDohotel.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppFlg.name().equals(name())) { return ClassificationCodeType.String; }
            if (AppPaymentMethod.name().equals(name())) { return ClassificationCodeType.String; }
            if (DeepWxLiteralGrouping.name().equals(name())) { return ClassificationCodeType.String; }
            if (DeepWxDeprecatedCls.name().equals(name())) { return ClassificationCodeType.String; }
            if (DeepWxDeprecatedElement.name().equals(name())) { return ClassificationCodeType.String; }
            return ClassificationCodeType.String; // as default
        }

        public ClassificationUndefinedHandlingType undefinedHandlingType() {
            if (AppSea.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppLand.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppPiari.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppBonvo.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppDstore.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppAmba.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppMiraco.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppDohotel.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppFlg.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (AppPaymentMethod.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (DeepWxLiteralGrouping.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (DeepWxDeprecatedCls.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            if (DeepWxDeprecatedElement.name().equals(name())) { return ClassificationUndefinedHandlingType.LOGGING; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }

        public static OptionalThing<SelfclientCDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (AppSea.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppSea); }
            if (AppLand.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppLand); }
            if (AppPiari.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppPiari); }
            if (AppBonvo.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppBonvo); }
            if (AppDstore.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppDstore); }
            if (AppAmba.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppAmba); }
            if (AppMiraco.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppMiraco); }
            if (AppDohotel.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppDohotel); }
            if (AppFlg.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppFlg); }
            if (AppPaymentMethod.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.AppPaymentMethod); }
            if (DeepWxLiteralGrouping.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.DeepWxLiteralGrouping); }
            if (DeepWxDeprecatedCls.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.DeepWxDeprecatedCls); }
            if (DeepWxDeprecatedElement.name().equalsIgnoreCase(classificationName)) { return OptionalThing.of(SelfclientCDef.DefMeta.DeepWxDeprecatedElement); }
            return OptionalThing.ofNullable(null, () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }

        public static SelfclientCDef.DefMeta meta(String classificationName) { // old style so use find(name)
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            if (AppSea.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppSea; }
            if (AppLand.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppLand; }
            if (AppPiari.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppPiari; }
            if (AppBonvo.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppBonvo; }
            if (AppDstore.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppDstore; }
            if (AppAmba.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppAmba; }
            if (AppMiraco.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppMiraco; }
            if (AppDohotel.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppDohotel; }
            if (AppFlg.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppFlg; }
            if (AppPaymentMethod.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.AppPaymentMethod; }
            if (DeepWxLiteralGrouping.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.DeepWxLiteralGrouping; }
            if (DeepWxDeprecatedCls.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.DeepWxDeprecatedCls; }
            if (DeepWxDeprecatedElement.name().equalsIgnoreCase(classificationName)) { return SelfclientCDef.DefMeta.DeepWxDeprecatedElement; }
            throw new IllegalStateException("Unknown classification: " + classificationName);
        }

        @SuppressWarnings("unused")
        private String[] xinternalEmptyString() {
            return emptyStrings(); // to suppress 'unused' warning of import statement
        }
    }
}
