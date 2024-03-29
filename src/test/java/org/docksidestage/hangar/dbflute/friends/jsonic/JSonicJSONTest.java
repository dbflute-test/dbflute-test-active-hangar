package org.docksidestage.hangar.dbflute.friends.jsonic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfResourceUtil;
import org.docksidestage.hangar.dbflute.allcommon.CDef;

import net.arnx.jsonic.JSON;

/**
 * @author jflute
 */
public class JSonicJSONTest extends PlainTestCase {

    public void test_decode() throws Exception {
        // ## Arrange ##
        FileInputStream ins = getSelectionJsonStream();

        // ## Act ##
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) JSON.decode(ins);

        // ## Assert ##
        // key = categories -> map.key, 
        log(map);
        for (Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("langs".equals(key)) {
                @SuppressWarnings("unchecked")
                List<String> value = (List<String>) entry.getValue();
                log(key, value);
            } else if ("categories".equals(key)) {
                @SuppressWarnings("unchecked")
                Map<String, Object> categoriesMap = (Map<String, Object>) entry.getValue();
                for (Entry<String, Object> categoriesEntry : categoriesMap.entrySet()) {
                    String categoryName = categoriesEntry.getKey();
                    log(categoryName);
                    @SuppressWarnings("unchecked")
                    List<Map<String, Object>> elementList = (List<Map<String, Object>>) categoriesEntry.getValue();
                    for (Map<String, Object> elementMap : elementList) {
                        log("  " + elementMap);
                    }
                }
            }
        }
    }

    protected FileInputStream getSelectionJsonStream() throws FileNotFoundException {
        File buildDir = DfResourceUtil.getBuildDir(CDef.class);
        FileInputStream ins = new FileInputStream(buildDir.getPath() + "/json/jsonic_decode_test.json");
        return ins;
    }
}
