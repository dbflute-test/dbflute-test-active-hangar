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
package org.docksidestage.hangar.dbflute.resola.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.docksidestage.hangar.dbflute.resola.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class ResolaDBFluteModule extends AbstractModule {

    protected final DataSource dataSource;

    public ResolaDBFluteModule(DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        this.dataSource = dataSource;
    }

    @Override
    protected void configure() {
        createDBFluteInitializer(); // initialized by only a creation

        // The components of DBFlute Runtime.
        ResolaImplementedBehaviorSelector behaviorSelector = createImplementedBehaviorSelector();
        BehaviorCommandInvoker behaviorCommandInvoker = createBehaviorCommandInvoker();
        ResolaImplementedInvokerAssistant invokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        ResolaImplementedCommonColumnAutoSetupper commonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();

        bind(BehaviorSelector.class).annotatedWith(Names.named("resola")).toInstance(behaviorSelector);
        bind(BehaviorCommandInvoker.class).annotatedWith(Names.named("resola")).toInstance(behaviorCommandInvoker);
        bind(InvokerAssistant.class).annotatedWith(Names.named("resola")).toInstance(invokerAssistant);
        bind(CommonColumnAutoSetupper.class).annotatedWith(Names.named("resola")).toInstance(commonColumnAutoSetupper);

        // The components of Behavior.
        setupBehavior(behaviorCommandInvoker, behaviorSelector, commonColumnAutoSetupper);
    }

    protected ResolaDBFluteInitializer createDBFluteInitializer() {
        return new org.docksidestage.hangar.dbflute.resola.allcommon.ResolaDBFluteInitializer();
    }

    protected ResolaImplementedBehaviorSelector createImplementedBehaviorSelector() {
        return new ResolaImplementedBehaviorSelector();
    }

    protected BehaviorCommandInvoker createBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    protected ResolaImplementedInvokerAssistant createImplementedInvokerAssistant() {
        ResolaImplementedInvokerAssistant invokerAssistant = new org.docksidestage.hangar.dbflute.resola.allcommon.ResolaImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected ResolaImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new org.docksidestage.hangar.dbflute.resola.allcommon.ResolaImplementedCommonColumnAutoSetupper();
    }

    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        {
            ResolaStationBhv bhv = new ResolaStationBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ResolaStationBhv.class).toInstance(bhv);
        }
    }
}
