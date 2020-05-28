package org.docksidestage.hangar.dbflute.dtomapper;

import java.util.Map;
import org.dbflute.Entity;
import org.docksidestage.hangar.dbflute.dtomapper.bs.BsWhiteReadOnlyDtoMapper;

/**
 * The DTO mapper of WHITE_READ_ONLY.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WhiteReadOnlyDtoMapper extends BsWhiteReadOnlyDtoMapper {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public WhiteReadOnlyDtoMapper() {
    }

    public WhiteReadOnlyDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
