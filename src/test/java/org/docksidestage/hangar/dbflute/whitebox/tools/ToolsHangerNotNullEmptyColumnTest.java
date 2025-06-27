package org.docksidestage.hangar.dbflute.whitebox.tools;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.dbflute.bhv.BehaviorReadable;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class ToolsHangerNotNullEmptyColumnTest extends UnitContainerTestCase {

    private BehaviorSelector behaviorSelector;

    /**
     * 全テーブルのNotNull制約のあるカラムに空文字入ってるもの一覧。<br>
     * convertValueMap.dataprop にコピーすることを前提とした出力形式。
     */
    public void test_NotNull_but_EmptyString() {
        final Map<String, DBMeta> dbmetaMap = DBMetaInstanceHandler.getUnmodifiableDBMetaMap();
        final Map<String, List<ColumnInfo>> emptyColumnMap = newLinkedHashMap();
        final int limit = 3; // tables (change it as you like it)
        int tableCount = 0;
        for (Entry<String, DBMeta> entry : dbmetaMap.entrySet()) {
            final String tableDbName = entry.getKey();
            final DBMeta dbmeta = entry.getValue();
            log("...Analyzing table: {}", tableDbName);
            final List<ColumnInfo> emptyColumnList = analyzeEmptyColumnList(dbmeta);
            if (!emptyColumnList.isEmpty()) {
                emptyColumnMap.put(tableDbName, emptyColumnList);
            }
            ++tableCount;
            if (tableCount == limit) {
                log("*Over Limit: {}", tableCount);
                break;
            }
        }
        log("The End!");
        final StringBuilder sb = new StringBuilder();
        emptyColumnMap.forEach((tableDbName, emptyColumnList) -> {
            for (ColumnInfo columnInfo : emptyColumnList) {
                if (sb.length() >= 1) { // second or more
                    sb.append(ln());
                }
                sb.append("    ; "); // indent
                sb.append(tableDbName).append(".").append(columnInfo.getColumnDbName());
                sb.append(" = map:{ $$null$$ = $$empty$$ }"); // for convertValueMap.dataprop
            }
        });
        sb.insert(0, "map:{" + ln());
        sb.append(ln()).append("}");
        log("convertValueMap.dataprop style:" + ln() + sb.toString());
    }

    private List<ColumnInfo> analyzeEmptyColumnList(DBMeta dbmeta) {
        String behaviorTypeName = dbmeta.getBehaviorTypeName();
        @SuppressWarnings("unchecked")
        Class<BehaviorReadable> behaviorType = (Class<BehaviorReadable>) DfReflectionUtil.forName(behaviorTypeName);
        BehaviorReadable readable = behaviorSelector.select(behaviorType);
        List<ColumnInfo> targetTypeColumnList = dbmeta.getColumnInfoList()
                .stream()
                .filter(col -> col.isNotNull())
                .filter(col -> col.isObjectNativeTypeString())
                .collect(Collectors.toList());
        List<ColumnInfo> emptyColumnList = newArrayList();
        for (ColumnInfo targetTypeColumn : targetTypeColumnList) {
            ConditionBean cb = readable.newConditionBean();
            cb.enableEmptyStringQuery(() -> {
                cb.localCQ().invokeQueryEqual(targetTypeColumn.getColumnDbName(), "");
            });
            int count = readable.readCount(cb);
            if (count >= 1) {
                emptyColumnList.add(targetTypeColumn);
            }
        }
        return emptyColumnList;
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
