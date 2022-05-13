/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.hangar.dbflute.dtomapper.customize;

import java.util.Map;
import org.dbflute.Entity;
import org.docksidestage.hangar.dbflute.dtomapper.bs.customize.BsUnpaidSummaryMemberDtoMapper;

/**
 * The DTO mapper of UnpaidSummaryMember.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class UnpaidSummaryMemberDtoMapper extends BsUnpaidSummaryMemberDtoMapper {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public UnpaidSummaryMemberDtoMapper() {
    }

    public UnpaidSummaryMemberDtoMapper(Map<Entity, Object> relationDtoMap, Map<Object, Entity> relationEntityMap) {
        super(relationDtoMap, relationEntityMap);
    }
}
