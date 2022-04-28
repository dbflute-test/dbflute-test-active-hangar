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
import org.docksidestage.hangar.dbflute.allcommon.CDef;

/**
 * The definition of vinci classification.
 * @author FreeGen
 */
public interface VinciCDef extends Classification {

    /**
     * Sea Cls
     */
    public enum DaSea implements VinciCDef {
        /** Formalized: as formal member, allowed to use all service */
        Formalized("FML", "Formalized", new String[] {"Formalized"}),
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        Withdrawal("WDL", "Withdrawal", new String[] {"Withdrawal"}),
        /** Provisional: first status after entry, allowed to use only part of service */
        Provisional("PRV", "Provisional", new String[] {"Provisional"});
        private static ZzzoneSlimmer<DaSea> _slimmer = new ZzzoneSlimmer<>(DaSea.class, values());
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
        private DaSea(String code, String alias, String[] sisters)
        { _code = code; _alias = alias; _sisterSet = ZzzoneSlimmer.toSisterSet(sisters); }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return _sisterSet; }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return VinciCDef.DefMeta.DaSea; }
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
        public static OptionalThing<DaSea> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DaSea> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DaSea codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DaSea> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DaSea> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DaSea." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[Formalized, Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaSea> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(Formalized, Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Provisional]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaSea> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Provisional));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[Withdrawal]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaSea> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(Withdrawal));
        }
        /**
         * @param refCls The DB classification to find. (NullAllowed: if null, returns empty)
         * @return The the app classification corresponding to the DB classification. (NotNull, EmptyAllowed: when null specified, not found)
         */
        public static OptionalThing<DaSea> fromDBCls(CDef.MemberStatus refCls) {
            String refCode = refCls != null ? refCls.code() : null;
            return OptionalThing.ofNullable(of(refCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert CDef.MemberStatus to DaSea by the referred code: " + refCode);
            });
        }
        /**
         * @return The DB classification corresponding to the app classification. (NotNull, EmptyAllowed: when no-related to DB)
         */
        public OptionalThing<CDef.MemberStatus> toDBCls() {
            String appCode = code();
            return OptionalThing.ofNullable(CDef.MemberStatus.of(appCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert DaSea to MemberStatus by the app code: " + appCode);
            });
        }
        @Override public String toString() { return code(); }
    }

    /**
     * Land Cls
     */
    public enum DaLand implements VinciCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase"),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean");
        private static ZzzoneSlimmer<DaLand> _slimmer = new ZzzoneSlimmer<>(DaLand.class, values());
        private static final Map<String, Map<String, Object>> _subItemMapMap = new HashMap<String, Map<String, Object>>();
        static {
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("keyword", "shining");
                _subItemMapMap.put(OneMan.code(), Collections.unmodifiableMap(subItemMap));
            }
            {
                Map<String, Object> subItemMap = new HashMap<String, Object>();
                subItemMap.put("keyword", "party");
                _subItemMapMap.put(MiniO.code(), Collections.unmodifiableMap(subItemMap));
            }
        }
        private String _code; private String _alias;
        private DaLand(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return _subItemMapMap.get(code()); }
        public ClassificationMeta meta() { return VinciCDef.DefMeta.DaLand; }
        public String keyword() {
            return (String)subItemMap().get("keyword");
        }
        /**
         * Is the classification in the group? <br>
         * means member that can use services <br>
         * The group elements:[OneMan]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return OneMan.equals(this); }
        /**
         * Is the classification in the group? <br>
         * cannot auth <br>
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
        public static OptionalThing<DaLand> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DaLand> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DaLand codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DaLand> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DaLand> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DaLand." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[OneMan]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaLand> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaLand> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(MiniO));
        }
        /**
         * @param refCls The DB classification to find. (NullAllowed: if null, returns empty)
         * @return The the app classification corresponding to the DB classification. (NotNull, EmptyAllowed: when null specified, not found)
         */
        public static OptionalThing<DaLand> fromDBCls(CDef.MemberStatus refCls) {
            String refCode = refCls != null ? refCls.code() : null;
            return OptionalThing.ofNullable(of(refCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert CDef.MemberStatus to DaLand by the referred code: " + refCode);
            });
        }
        /**
         * @return The DB classification corresponding to the app classification. (NotNull, EmptyAllowed: when no-related to DB)
         */
        public OptionalThing<CDef.MemberStatus> toDBCls() {
            String appCode = code();
            return OptionalThing.ofNullable(CDef.MemberStatus.of(appCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert DaLand to MemberStatus by the app code: " + appCode);
            });
        }
        @Override public String toString() { return code(); }
    }

    /**
     * test of namedcls referring namedcls by same classification name
     */
    public enum DaPiari implements VinciCDef {
        /** ShowBase: Formalized */
        OneMan("FML", "ShowBase"),
        /** Dstore: Provisional */
        Dstore("PRV", "Dstore"),
        /** Orlean: Withdrawal */
        MiniO("WDL", "Orlean");
        private static ZzzoneSlimmer<DaPiari> _slimmer = new ZzzoneSlimmer<>(DaPiari.class, values());
        private String _code; private String _alias;
        private DaPiari(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public Set<String> sisterSet() { return Collections.emptySet(); }
        public Map<String, Object> subItemMap() { return Collections.emptyMap(); }
        public ClassificationMeta meta() { return VinciCDef.DefMeta.DaPiari; }
        /**
         * Is the classification in the group? <br>
         * means member that can use services <br>
         * The group elements:[OneMan, Dstore]
         * @return The determination, true or false.
         */
        public boolean isServiceAvailable() { return OneMan.equals(this) || Dstore.equals(this); }
        /**
         * Is the classification in the group? <br>
         * Members are not formalized yet <br>
         * The group elements:[Dstore]
         * @return The determination, true or false.
         */
        public boolean isShortOfFormalized() { return Dstore.equals(this); }
        /**
         * Is the classification in the group? <br>
         * cannot auth <br>
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
        public static OptionalThing<DaPiari> of(Object code) { return _slimmer.of(code); }
        /**
         * Find the classification by the name. (CaseInsensitive)
         * @param name The string of name, which is case-insensitive. (NotNull)
         * @return The optional classification corresponding to the name. (NotNull, EmptyAllowed: if not found, returns empty)
         */
        public static OptionalThing<DaPiari> byName(String name) { return _slimmer.byName(name); }
        /**
         * <span style="color: #AD4747; font-size: 120%">Old style so use of(code).</span>
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        public static DaPiari codeOf(Object code) { return _slimmer.codeOf(code); }
        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The snapshot list of all classification elements. (NotNull)
         */
        public static List<DaPiari> listAll() { return _slimmer.listAll(values()); }
        /**
         * Get the list of classification elements in the specified group. (returns new copied list)
         * @param groupName The string of group name, which is case-insensitive. (NotNull)
         * @return The snapshot list of classification elements in the group. (NotNull)
         * @throws ClassificationNotFoundException When the group is not found.
         */
        public static List<DaPiari> listByGroup(String groupName) {
            if (groupName == null) { throw new IllegalArgumentException("The argument 'groupName' should not be null."); }
            if ("serviceAvailable".equalsIgnoreCase(groupName)) { return listOfServiceAvailable(); }
            if ("shortOfFormalized".equalsIgnoreCase(groupName)) { return listOfShortOfFormalized(); }
            if ("unauthorized".equalsIgnoreCase(groupName)) { return listOfUnauthorized(); }
            throw new ClassificationNotFoundException("Unknown classification group: DaPiari." + groupName);
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * means member that can use services <br>
         * The group elements:[OneMan, Dstore]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaPiari> listOfServiceAvailable() {
            return new ArrayList<>(Arrays.asList(OneMan, Dstore));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * Members are not formalized yet <br>
         * The group elements:[Dstore]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaPiari> listOfShortOfFormalized() {
            return new ArrayList<>(Arrays.asList(Dstore));
        }
        /**
         * Get the list of group classification elements. (returns new copied list) <br>
         * cannot auth <br>
         * The group elements:[MiniO]
         * @return The snapshot list of classification elements in the group. (NotNull)
         */
        public static List<DaPiari> listOfUnauthorized() {
            return new ArrayList<>(Arrays.asList(MiniO));
        }
        /**
         * @param refCls The referred classification to find. (NullAllowed: if null, returns empty)
         * @return The the app classification corresponding to the DB classification. (NotNull, EmptyAllowed: when null specified, not found)
         */
        public static OptionalThing<DaPiari> fromRefCls(LeonardoCDef.DaPiari refCls) {
            String refCode = refCls != null ? refCls.code() : null;
            return OptionalThing.ofNullable(of(refCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert LeonardoCDef.DaPiari to DaPiari by the referred code: " + refCode);
            });
        }
        /**
         * @return The referred classification corresponding to the app classification. (NotNull, EmptyAllowed: when no-related to DB)
         */
        public OptionalThing<LeonardoCDef.DaPiari> toRefCls() {
            String appCode = code();
            return OptionalThing.ofNullable(LeonardoCDef.DaPiari.of(appCode).orElse(null), () -> {
                throw new IllegalStateException("Cannot convert DaPiari to DaPiari by the app code: " + appCode);
            });
        }
        @Override public String toString() { return code(); }
    }

    public enum DefMeta implements ClassificationMeta {
        /** Sea Cls */
        DaSea(cd -> VinciCDef.DaSea.of(cd), nm -> VinciCDef.DaSea.byName(nm)
        , () -> VinciCDef.DaSea.listAll(), gp -> VinciCDef.DaSea.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** Land Cls */
        DaLand(cd -> VinciCDef.DaLand.of(cd), nm -> VinciCDef.DaLand.byName(nm)
        , () -> VinciCDef.DaLand.listAll(), gp -> VinciCDef.DaLand.listByGroup(gp)
        , ClassificationCodeType.String, ClassificationUndefinedHandlingType.LOGGING),

        /** test of namedcls referring namedcls by same classification name */
        DaPiari(cd -> VinciCDef.DaPiari.of(cd), nm -> VinciCDef.DaPiari.byName(nm)
        , () -> VinciCDef.DaPiari.listAll(), gp -> VinciCDef.DaPiari.listByGroup(gp)
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

        public static OptionalThing<VinciCDef.DefMeta> find(String classificationName) { // instead of valueOf()
            if (classificationName == null) { throw new IllegalArgumentException("The argument 'classificationName' should not be null."); }
            return OptionalThing.ofNullable(_nameMetaMap.get(classificationName.toLowerCase()), () -> {
                throw new ClassificationNotFoundException("Unknown classification: " + classificationName);
            });
        }
        public static VinciCDef.DefMeta meta(String classificationName) { // old style so use find(name)
            return find(classificationName).orElseTranslatingThrow(cause -> {
                return new IllegalStateException("Unknown classification: " + classificationName);
            });
        }
    }

    public static class ZzzoneSlimmer<CLS extends VinciCDef> {

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
