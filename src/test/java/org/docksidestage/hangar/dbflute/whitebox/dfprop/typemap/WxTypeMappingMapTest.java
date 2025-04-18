package org.docksidestage.hangar.dbflute.whitebox.dfprop.typemap;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.docksidestage.hangar.dbflute.exentity.WhiteTypeMapping;
import org.docksidestage.hangar.dbflute.exentity.customize.TypeMappingMember;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.9 (2025/04/18 Friday at ichihara)
 */
public class WxTypeMappingMapTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                               Point
    //                                                                               =====
    public void test_pointMapping_domainEntity() { // expects compile-success
        WhiteTypeMapping mapping = new WhiteTypeMapping();
        LocalDate mappingDate = mapping.getTypeMappingDate();
        LocalDateTime mappingDatetime = mapping.getTypeMappingDatetime();
        LocalDate pointMappingDate = mapping.getPointMappingDate(); // changed by dfprop
        log(mappingDate, mappingDatetime, pointMappingDate);
    }

    public void test_pointMapping_sql2entity() { // expects compile-success
        TypeMappingMember member = new TypeMappingMember();
        LocalDate mappingDate = member.getTypeMappingDate();
        LocalDateTime mappingDatetime = member.getTypeMappingDatetime();
        LocalDate pointMappingDate = member.getPointMappingDate();
        log(mappingDate, mappingDatetime, pointMappingDate); // changed by dfprop (since 1.2.9)
    }
}
