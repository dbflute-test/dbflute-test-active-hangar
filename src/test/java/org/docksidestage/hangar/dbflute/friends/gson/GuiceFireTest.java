package org.docksidestage.hangar.dbflute.friends.gson;

import java.util.Map;

import org.docksidestage.hangar.dbflute.friends.gson.GuiceFireTest.Maihama.Land;
import org.docksidestage.hangar.dbflute.friends.gson.GuiceFireTest.Maihama.Sea;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

import com.google.gson.Gson;

import io.gsonfire.GsonFireBuilder;

/**
 * @author jflute
 */
public class GuiceFireTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                               Plain
    //                                                                               =====
    // -----------------------------------------------------
    //                                                Object
    //                                                ------
    public void test_plain_fromJson_object_seaOnly() {
        // ## Arrange ##
        Gson gson = new GsonFireBuilder().createGson();
        String json = "{\"sea\" : { \"harborName\" : \"medi\", \"nameLength\" : 3 }}";

        // ## Act ##
        Maihama maihama = gson.fromJson(json, Maihama.class);

        // ## Assert ##
        log(maihama);
        Sea sea = maihama.sea;
        assertEquals("medi", sea.harborName);
        assertEquals(3, sea.nameLength);
        Land land = maihama.land;
        assertNull(land);
        log(gson.toJson(maihama)); // visual check
    }

    // -----------------------------------------------------
    //                                            Simple Map
    //                                            ----------
    public void test_plain_fromJson_map() {
        // ## Arrange ##
        Gson gson = new GsonFireBuilder().createGson();
        String json = "{\"sea\" : \"mystic\"}";

        // ## Act ##
        Map<?, ?> map = gson.fromJson(json, Map.class);

        // ## Assert ##
        log(map);
        assertEquals("{sea=mystic}", map.toString());
        log(gson.toJson(map)); // visual check
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    public static class Maihama {

        public Sea sea;

        public static class Sea {

            public String harborName;
            public Integer nameLength;

            @Override
            public String toString() {
                return "{" + harborName + ", " + nameLength + "}";
            }
        }

        public Land land;

        public static class Land {

            public String castleName;
            public Integer nameLength;

            @Override
            public String toString() {
                return "{" + castleName + ", " + nameLength + "}";
            }
        }

        @Override
        public String toString() {
            return "{" + sea + ", " + land + "}";
        }
    }
}
