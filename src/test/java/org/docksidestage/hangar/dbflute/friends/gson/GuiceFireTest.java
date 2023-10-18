package org.docksidestage.hangar.dbflute.friends.gson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.docksidestage.hangar.dbflute.friends.gson.GuiceFireTest.Maihama.Land;
import org.docksidestage.hangar.dbflute.friends.gson.GuiceFireTest.Maihama.Sea;
import org.docksidestage.hangar.dbflute.friends.gson.GuiceFireTest.Maihama.Stage;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

/**
 * Does the gson-fire work with latest Gson? <br>
 * (Supposing LastaFlute dependency conflict)
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
        Gson gson = createPlainFire().createGson();
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

    public void test_plain_toJson_object_full() {
        // ## Arrange ##
        Gson gson = createPlainFire().createGson();
        Maihama maihama = new Maihama();
        {
            Sea sea = new Sea();
            sea.harborName = "mystic";
            sea.nameLength = 3;
            List<Stage> stageList = new ArrayList<Stage>();
            {
                Stage stage = new Stage();
                stage.stageName = "dockside";
                stage.beginingDate = LocalDate.of(2010, 10, 28);
                stageList.add(stage);
            }
            {
                Stage stage = new Stage();
                stage.stageName = "hangar";
                stage.beginingDate = LocalDate.of(2016, 3, 5);
                stageList.add(stage);
            }
            sea.stageList = stageList;
            maihama.sea = sea;
        }
        {
            Land land = new Land();
            land.castleName = "cinderella";
            land.nameLength = 4;
            List<Stage> stageList = new ArrayList<Stage>();
            {
                Stage stage = new Stage();
                stage.stageName = "showbase";
                stage.beginingDate = LocalDate.of(2023, 8, 25);
                stageList.add(stage);
            }
            {
                Stage stage = new Stage();
                stage.stageName = "orleans";
                stage.beginingDate = LocalDate.of(2020, 1, 9);
                stageList.add(stage);
            }
            land.stageList = stageList;
            maihama.land = land;
        }

        // ## Act ##
        String json = gson.toJson(maihama);

        // ## Assert ##
        log(json);
        Maihama reversed = gson.fromJson(json, Maihama.class);
        log(reversed); // visual check, stageList cannot be reverted
    }

    // -----------------------------------------------------
    //                                            Simple Map
    //                                            ----------
    public void test_plain_fromJson_map() {
        // ## Arrange ##
        Gson gson = createPlainFire().createGson();
        String json = "{\"sea\" : \"mystic\"}";

        // ## Act ##
        Map<?, ?> map = gson.fromJson(json, Map.class);

        // ## Assert ##
        log(map);
        assertEquals("{sea=mystic}", map.toString());
        log(gson.toJson(map)); // visual check
    }

    // ===================================================================================
    //                                                                               Typed
    //                                                                               =====
    public void test_typed_fromJson_object_seaOnly() {
        // ## Arrange ##
        Gson gson = createPlainFire().createGson();
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

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private GsonFireBuilder createPlainFire() {
        return new GsonFireBuilder();
    }

    private GsonFireBuilder createTypedFire() {
        GsonFireBuilder builder = new GsonFireBuilder();
        builder.registerTypeSelector(LocalDate.class, new TypeSelector<LocalDate>() {
            public Class<? extends LocalDate> getClassForElement(JsonElement readElement) {
                // TODO jflute xxxxxxx (2023/08/25)
                return null;
            }
        });
        return builder;
    }
    
    public static class Maihama {

        public Sea sea;

        public static class Sea {

            public String harborName;
            public Integer nameLength;
            public List<Stage> stageList;

            @Override
            public String toString() {
                return "{" + harborName + ", " + nameLength + "}";
            }
        }

        public Land land;

        public static class Land {

            public String castleName;
            public Integer nameLength;
            public List<Stage> stageList;

            @Override
            public String toString() {
                return "{" + castleName + ", " + nameLength + "}";
            }
        }

        /**
         * @author jflute
         */
        public static class Stage {

            public String stageName;
            public LocalDate beginingDate;
        }

        @Override
        public String toString() {
            return "{" + sea + ", " + land + "}";
        }
    }
}
