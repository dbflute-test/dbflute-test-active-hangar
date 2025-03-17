package org.docksidestage.hangar.dbflute.whitebox.multipledb.splitway;

import java.util.List;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.dbmeta.info.ForeignInfo;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.Srl;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberSecurityDbm;
import org.docksidestage.hangar.dbflute.nogen.splitway.UnifiedEntity;

import scala.collection.mutable.StringBuilder;

/**
 * @author jflute
 * @since DBFlute-1.2.8 (2025/03/18 Tuesday at ichihara)
 */
public class WxUnifiedInterfaceMakingTest extends PlainTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                              Making
    //                                                                              ======
    public void test_makeInterfaceString_Member() {
        // ## Arrange ##
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        String interfaceString = buildInterfaceString(dbm);

        // ## Assert ##
        log(ln() + interfaceString);
    }

    public void test_makeInterfaceString_MemberSecurity() {
        // ## Arrange ##
        MemberSecurityDbm dbm = MemberSecurityDbm.getInstance();

        // ## Act ##
        String interfaceString = buildInterfaceString(dbm);

        // ## Assert ##
        log(ln() + interfaceString);
    }

    // ===================================================================================
    //                                                                      Building Logic
    //                                                                      ==============
    private String buildInterfaceString(DBMeta dbmeta) {
        StringBuilder sb = new StringBuilder();

        sb.append("public interface Unified").append(dbmeta.getEntityType().getSimpleName()).append(" {");
        sb.append(ln());
        String indent = "    ";

        List<ColumnInfo> columnInfoList = dbmeta.getColumnInfoList();
        doBuildColumnDef(sb, columnInfoList, indent);

        List<ForeignInfo> foreignInfoList = dbmeta.getForeignInfoList();
        doBuildForeignDef(sb, indent, foreignInfoList);

        sb.append("}");
        return sb.toString();
    }

    private void doBuildColumnDef(StringBuilder sb, List<ColumnInfo> columnInfoList, String indent) {
        for (ColumnInfo columnInfo : columnInfoList) {
            // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
            // e.g.
            //  String getMemberName();
            //  Long getVersionNo();
            // _/_/_/_/_/_/_/_/_/_/
            sb.append(ln()); // line before javadoc

            // beginning of javadoc
            String columnAlias = columnInfo.getColumnAlias();
            sb.append(indent).append("/**").append(ln());

            // first line on javadoc
            sb.append(indent).append(" * ");
            if (columnAlias != null) {
                sb.append(columnAlias).append(": ");
            }
            String columnDbType = columnInfo.getColumnDbType();
            sb.append(columnDbType);
            Integer columnSize = columnInfo.getColumnSize();
            if (columnSize != null) {
                sb.append("(").append(columnSize).append(")");
            }
            sb.append(columnInfo.isNotNull() ? " not null" : " null allowed");
            sb.append(" <br>").append(ln());

            // second line on javadoc
            String columnComment = columnInfo.getColumnComment();
            if (Srl.is_NotNull_and_NotTrimmedEmpty(columnComment)) {
                String filtered = Srl.replace(columnComment, "\n", " <br>\n" + indent + " * ");
                sb.append(indent).append(" * ").append(filtered).append(ln());
            }

            // third line on javadoc
            String columnDbName = columnInfo.getColumnDbName();
            sb.append(indent).append(" * @return The value of the column '");
            sb.append(columnDbName).append("'. ");
            if (columnInfo.isNotNull()) { // same as DBFlute entity
                sb.append("(basically NotNull if selected: for the constraint)");
            } else {
                sb.append("(NullAllowed even if selected: for no constraint)");
            }
            sb.append(ln());

            // ending of javadoc
            sb.append(indent).append(" */");
            sb.append(ln());

            // method definition
            sb.append(indent);
            sb.append(columnInfo.getPropertyAccessType().getSimpleName()); // return type
            sb.append(" get").append(Srl.initCap(columnInfo.getPropertyName())).append("();");
            sb.append(ln());
        }
    }

    private void doBuildForeignDef(StringBuilder sb, String indent, List<ForeignInfo> foreignInfoList) {
        for (ForeignInfo foreignInfo : foreignInfoList) {
            DBMeta foreignDBMeta = foreignInfo.getForeignDBMeta();
            Class<? extends Entity> foreignEntityType = foreignDBMeta.getEntityType();
            String foreignPropertyName = foreignInfo.getForeignPropertyName();

            String unifiedPrefix = "Unified";
            boolean unified = UnifiedEntity.class.isAssignableFrom(foreignEntityType);

            // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
            // e.g.
            //  OptionalEntity<Member> getMember();
            //   or
            //  OptionalEntity<? extends UnifiedMember> getUnifiedMember();
            // _/_/_/_/_/_/_/_/_/_/
            sb.append(ln()); // line before javadoc

            // beginning of javadoc
            sb.append(indent).append("/**").append(ln());

            // first line
            String tableAlias = foreignDBMeta.getTableAlias();
            sb.append(indent).append(" * ").append(tableAlias);
            String tableComment = foreignDBMeta.getTableComment();
            if (tableComment != null) {
                String filtered = Srl.replace(tableComment, "\n", " <br>\n" + indent + " * ");
                sb.append(": ").append(filtered);
            }
            sb.append(ln());

            // second line: has small differences with DBFlute entity (but no problem)
            sb.append(indent).append(" * @return The entity of foreign property '");
            sb.append(foreignPropertyName).append("'. ");
            if (foreignInfo.isReferrerAsOne()) { // almost same as DBFlute entity
                sb.append("(NotNull, EmptyAllowed: when e.g. no data, no setupSelect)");
            } else {
                sb.append("(NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)");
            }
            sb.append(ln());

            // ending of javadoc
            sb.append(indent).append(" */");
            sb.append(ln());

            // method definition
            sb.append(indent);
            sb.append("OptionalEntity<");
            if (unified) {
                sb.append("? extends ");
            }
            String genericTypeName = foreignEntityType.getSimpleName();
            if (unified) {
                genericTypeName = unifiedPrefix + genericTypeName;
            }
            sb.append(genericTypeName).append(">");

            String getterKeyword = Srl.initCap(foreignPropertyName);
            if (unified) {
                getterKeyword = unifiedPrefix + getterKeyword;
            }

            sb.append(" get").append(getterKeyword).append("();");
            sb.append(ln());
        }
    }
}
