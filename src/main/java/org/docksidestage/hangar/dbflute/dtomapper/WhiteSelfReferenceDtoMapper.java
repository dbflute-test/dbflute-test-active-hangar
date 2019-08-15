package org.docksidestage.hangar.dbflute.dtomapper;

import java.util.Map;
import org.dbflute.Entity;
import org.docksidestage.hangar.dbflute.dtomapper.bs.BsWhiteSelfReferenceDtoMapper;

/**
 * The DTO mapper of WHITE_SELF_REFERENCE.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceDtoMapper extends BsWhiteSelfReferenceDtoMapper {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public WhiteSelfReferenceDtoMapper() {
    }

    public WhiteSelfReferenceDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
