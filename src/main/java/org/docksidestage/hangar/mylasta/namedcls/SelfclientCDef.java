package org.docksidestage.hangar.mylasta.namedcls;

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
 * The definition of selfclient classification.
 * @author FreeGen
 */
public interface SelfclientCDef extends Classification {

    /**
     * test of included, expects grouping, sub-item, sisters
     */
    public enum AppSea implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"});
        private static ZzzoneSlimmer<AppSea> _slimmer = new ZzzoneSlimmer<>(AppSea.class, values());
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
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
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
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<AppSea> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppSea> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppSea codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppSea> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppSea> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppSea." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppSea> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppSea> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppSea> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of exists, expects no grouping, no sub-item, sisters
     */
    public enum AppLand implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase"),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean");
        private static ZzzoneSlimmer<AppLand> _slimmer = new ZzzoneSlimmer<>(AppLand.class, values());
        private String _code; private String _alias;
        private AppLand(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppLand; }
        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return OneMan.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() { return MiniO.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return isUnauthorized(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppLand> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppLand> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppLand codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppLand> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppLand> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppLand." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppLand> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppLand> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(MiniO));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of matches, expects no grouping, no sub-item, sisters
     */
    public enum AppPiari implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase"),
        /** Castle: Provisional */
        Parade("PRV", "Castle"),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean");
        private static ZzzoneSlimmer<AppPiari> _slimmer = new ZzzoneSlimmer<>(AppPiari.class, values());
        private String _code; private String _alias;
        private AppPiari(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppPiari; }
        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan, Parade]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return OneMan.equals(this) || Parade.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Parade]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Parade.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() { return MiniO.equals(this); }
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
        public static OptionalThing<AppPiari> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppPiari> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppPiari codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppPiari> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppPiari> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppPiari." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan, Parade]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPiari> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan, Parade));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Parade]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPiari> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Parade));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPiari> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(MiniO));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of manual grouping map using refCls as included, expects overridden, added
     */
    public enum AppBonvo implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"}),
        /** Hangar: Rhythms */
        Mystic("MYS", "Hangar", emptyStrings());
        private static String[] emptyStrings() { return new String[0]; }
        private static ZzzoneSlimmer<AppBonvo> _slimmer = new ZzzoneSlimmer<>(AppBonvo.class, values());
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
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
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
        public boolean isAppNewLiteralAvailable() { return Formalized.equals(this) || Provisional.equals(this) || Mystic.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The determination, true or false.
         */
        public boolean isAppNewRefExistingGroupAvailable() { return Formalized.equals(this) || Provisional.equals(this) || Mystic.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Withdrawal]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() { return Withdrawal.equals(this); }
        public boolean inGroup(String groupName) {
            if ("appNewLiteralAvailable".equalsIgnoreCase(groupName)) { return isAppNewLiteralAvailable(); }
            if ("appNewRefExistingGroupAvailable".equalsIgnoreCase(groupName)) { return isAppNewRefExistingGroupAvailable(); }
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
        public static OptionalThing<AppBonvo> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppBonvo> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppBonvo codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppBonvo> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
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
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfAppNewLiteralAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional, Mystic));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional, Mystic]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfAppNewRefExistingGroupAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional, Mystic));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppBonvo> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of manual grouping map using refCls as exists, expects new grouping is available
     */
    public enum AppDstore implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase"),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean");
        private static ZzzoneSlimmer<AppDstore> _slimmer = new ZzzoneSlimmer<>(AppDstore.class, values());
        private String _code; private String _alias;
        private AppDstore(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppDstore; }
        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan, MiniO]
         * @return The determination, true or false.
         */
        public boolean isAppNewAvailable() { return OneMan.equals(this) || MiniO.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return OneMan.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() { return MiniO.equals(this); }
        public boolean inGroup(String groupName) {
            if ("appNewAvailable".equalsIgnoreCase(groupName)) { return isAppNewAvailable(); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return isUnauthorized(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDstore> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDstore> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppDstore codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppDstore> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppDstore> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("appNewAvailable".equalsIgnoreCase(groupName)) { return listOfAppNewAvailable(); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppDstore." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan, MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDstore> listOfAppNewAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan, MiniO));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDstore> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDstore> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(MiniO));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of manual sub-item and sisters as included, expects merged, only order() exists
     */
    public enum AppAmba implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"}),
        /** Hangar: Rhythms */
        Mystic("MYS", "Hangar", new String[] {"Choucho"});
        private static ZzzoneSlimmer<AppAmba> _slimmer = new ZzzoneSlimmer<>(AppAmba.class, values());
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
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
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
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<AppAmba> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppAmba> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppAmba codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppAmba> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppAmba> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppAmba." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppAmba> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppAmba> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppAmba> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of manual sub-item and sisters as exists, expects new only here
     */
    public enum AppMiraco implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase", new String[] {"ONE"}),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean", new String[] {"MIN"});
        private static ZzzoneSlimmer<AppMiraco> _slimmer = new ZzzoneSlimmer<>(AppMiraco.class, values());
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
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
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
        public boolean isServiceAvailable() { return OneMan.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[MiniO]
         * @return The determination, true or false.
         */
        public boolean isUnauthorized() { return MiniO.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return isUnauthorized(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppMiraco> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppMiraco> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppMiraco codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppMiraco> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppMiraco> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppMiraco." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppMiraco> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppMiraco> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(MiniO));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of referring group, expects grouped elements only and sub-item, sisters exist
     */
    public enum AppDohotel implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"});
        private static ZzzoneSlimmer<AppDohotel> _slimmer = new ZzzoneSlimmer<>(AppDohotel.class, values());
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
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
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
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return isShortOfFormalized(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDohotel> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppDohotel> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppDohotel codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppDohotel> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppDohotel> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppDohotel." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDohotel> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppDohotel> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of including sub-item and sisters when implicit classification
     */
    public enum AppFlg implements SelfclientCDef {
        /** Yes: means valid */
        True("1", "Yes", new String[] {"true"}),
        /** No: means invalid */
        False("0", "No", new String[] {"false"});
        private static ZzzoneSlimmer<AppFlg> _slimmer = new ZzzoneSlimmer<>(AppFlg.class, values());
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
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppFlg; }
        public String key1() {
            return (String)subItemMap().get("key1");
        }
        public boolean inGroup(String groupName) { return false; }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppFlg> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppFlg> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppFlg codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppFlg> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppFlg> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            throw new ClassificationNotFoundException("Unknown classification group: AppFlg." + groupName);
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of including grouping map when implicit classification
     */
    public enum AppPaymentMethod implements SelfclientCDef {
        /** by hand: payment by hand, face-to-face */
        ByHand("HAN", "by hand"),
        /** bank transfer: bank transfer payment */
        BankTransfer("BAK", "bank transfer"),
        /** credit card: credit card payment */
        CreditCard("CRC", "credit card");
        private static ZzzoneSlimmer<AppPaymentMethod> _slimmer = new ZzzoneSlimmer<>(AppPaymentMethod.class, values());
        private String _code; private String _alias;
        private AppPaymentMethod(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.AppPaymentMethod; }
        /**
         * Is the classification in the group? <br>
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
        public static OptionalThing<AppPaymentMethod> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<AppPaymentMethod> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static AppPaymentMethod codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<AppPaymentMethod> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<AppPaymentMethod> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("recommended".equalsIgnoreCase(groupName)) { return listOfRecommended(); }
            throw new ClassificationNotFoundException("Unknown classification group: AppPaymentMethod." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[ByHand]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<AppPaymentMethod> listOfRecommended() {
            return new ArrayList<>(Arrays.asList(ByHand));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of groupingMap when literal only
     */
    public enum DeepWxLiteralGrouping implements SelfclientCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase"),
        /** Castle: Provisional */
        Parade("PRV", "Castle"),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean");
        private static ZzzoneSlimmer<DeepWxLiteralGrouping> _slimmer = new ZzzoneSlimmer<>(DeepWxLiteralGrouping.class, values());
        private String _code; private String _alias;
        private DeepWxLiteralGrouping(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.DeepWxLiteralGrouping; }
        /**
         * Is the classification in the group? <br>
         * The group elements:[OneMan, Parade]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return OneMan.equals(this) || Parade.equals(this); }
        public boolean inGroup(String groupName) {
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return isServiceAvailable(); }
            return false;
        }
        /**
         * Get the classification of the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns empty)
         * @return The optional classification corresponding to the code. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxLiteralGrouping> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DeepWxLiteralGrouping> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeepWxLiteralGrouping codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DeepWxLiteralGrouping> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DeepWxLiteralGrouping> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            throw new ClassificationNotFoundException("Unknown classification group: DeepWxLiteralGrouping." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[OneMan, Parade]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxLiteralGrouping> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan, Parade));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of deprecated classification top
     */
    public enum DeepWxDeprecatedCls implements SelfclientCDef {
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
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.DeepWxDeprecatedCls; }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
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
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeepWxDeprecatedCls codeOf(Object code) { return _slimmer.codeOf(code); }
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
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedCls> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of deprecatedMap
     */
    public enum DeepWxDeprecatedElement implements SelfclientCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service (deprecated: test of deprecated) */
        @Deprecated
        Provisional("PRV", "Provisional", new String[] {"Provisional"}),
        /** All Statuses: without status filter (deprecated: and also test of deprecated) */
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
        public ClassificationMeta meta() { return SelfclientCDef.DefMeta.DeepWxDeprecatedElement; }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Formalized, Provisional]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return Formalized.equals(this) || Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
         * The group elements:[Provisional]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Provisional.equals(this); }
        /**
         * Is the classification in the group? <br>
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
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DeepWxDeprecatedElement codeOf(Object code) { return _slimmer.codeOf(code); }
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
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DeepWxDeprecatedElement> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** test of included, expects grouping, sub-item, sisters */
        AppSea(cd -> SelfclientCDef.AppSea.of(cd), nm -> SelfclientCDef.AppSea.byName(nm)
        , () -> SelfclientCDef.AppSea.listAll(), gp -> SelfclientCDef.AppSea.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of exists, expects no grouping, no sub-item, sisters */
        AppLand(cd -> SelfclientCDef.AppLand.of(cd), nm -> SelfclientCDef.AppLand.byName(nm)
        , () -> SelfclientCDef.AppLand.listAll(), gp -> SelfclientCDef.AppLand.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of matches, expects no grouping, no sub-item, sisters */
        AppPiari(cd -> SelfclientCDef.AppPiari.of(cd), nm -> SelfclientCDef.AppPiari.byName(nm)
        , () -> SelfclientCDef.AppPiari.listAll(), gp -> SelfclientCDef.AppPiari.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of manual grouping map using refCls as included, expects overridden, added */
        AppBonvo(cd -> SelfclientCDef.AppBonvo.of(cd), nm -> SelfclientCDef.AppBonvo.byName(nm)
        , () -> SelfclientCDef.AppBonvo.listAll(), gp -> SelfclientCDef.AppBonvo.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of manual grouping map using refCls as exists, expects new grouping is available */
        AppDstore(cd -> SelfclientCDef.AppDstore.of(cd), nm -> SelfclientCDef.AppDstore.byName(nm)
        , () -> SelfclientCDef.AppDstore.listAll(), gp -> SelfclientCDef.AppDstore.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of manual sub-item and sisters as included, expects merged, only order() exists */
        AppAmba(cd -> SelfclientCDef.AppAmba.of(cd), nm -> SelfclientCDef.AppAmba.byName(nm)
        , () -> SelfclientCDef.AppAmba.listAll(), gp -> SelfclientCDef.AppAmba.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of manual sub-item and sisters as exists, expects new only here */
        AppMiraco(cd -> SelfclientCDef.AppMiraco.of(cd), nm -> SelfclientCDef.AppMiraco.byName(nm)
        , () -> SelfclientCDef.AppMiraco.listAll(), gp -> SelfclientCDef.AppMiraco.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of referring group, expects grouped elements only and sub-item, sisters exist */
        AppDohotel(cd -> SelfclientCDef.AppDohotel.of(cd), nm -> SelfclientCDef.AppDohotel.byName(nm)
        , () -> SelfclientCDef.AppDohotel.listAll(), gp -> SelfclientCDef.AppDohotel.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of including sub-item and sisters when implicit classification */
        AppFlg(cd -> SelfclientCDef.AppFlg.of(cd), nm -> SelfclientCDef.AppFlg.byName(nm)
        , () -> SelfclientCDef.AppFlg.listAll(), gp -> SelfclientCDef.AppFlg.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of including grouping map when implicit classification */
        AppPaymentMethod(cd -> SelfclientCDef.AppPaymentMethod.of(cd), nm -> SelfclientCDef.AppPaymentMethod.byName(nm)
        , () -> SelfclientCDef.AppPaymentMethod.listAll(), gp -> SelfclientCDef.AppPaymentMethod.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of groupingMap when literal only */
        DeepWxLiteralGrouping(cd -> SelfclientCDef.DeepWxLiteralGrouping.of(cd), nm -> SelfclientCDef.DeepWxLiteralGrouping.byName(nm)
        , () -> SelfclientCDef.DeepWxLiteralGrouping.listAll(), gp -> SelfclientCDef.DeepWxLiteralGrouping.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of deprecated classification top */
        DeepWxDeprecatedCls(cd -> SelfclientCDef.DeepWxDeprecatedCls.of(cd), nm -> SelfclientCDef.DeepWxDeprecatedCls.byName(nm)
        , () -> SelfclientCDef.DeepWxDeprecatedCls.listAll(), gp -> SelfclientCDef.DeepWxDeprecatedCls.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of deprecatedMap */
        DeepWxDeprecatedElement(cd -> SelfclientCDef.DeepWxDeprecatedElement.of(cd), nm -> SelfclientCDef.DeepWxDeprecatedElement.byName(nm)
        , () -> SelfclientCDef.DeepWxDeprecatedElement.listAll(), gp -> SelfclientCDef.DeepWxDeprecatedElement.listByGroup(gp)
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

        public static OptionalThing<SelfclientCDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            return OptionalThing.ofNullable(_nameMetaMap.get(classificationName.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }
        public static SelfclientCDef.DefMeta meta(String classificationName) { // old style so use find(name)
            return find(classificationName).orElseTranslatingThrow(cause -> {
                return new IllegalStateException("Unknown classification: " + classificationName);
            });
        }
    }

    public static class ZzzoneSlimmer<CLS extends SelfclientCDef> {

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
