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
package org.docksidestage.hangar.dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.core.InvokerAssistant;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.docksidestage.hangar.dbflute.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteModule extends AbstractModule {

    protected final DataSource dataSource;

    public DBFluteModule(DataSource dataSource) {
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
        ImplementedBehaviorSelector behaviorSelector = createImplementedBehaviorSelector();
        BehaviorCommandInvoker behaviorCommandInvoker = createBehaviorCommandInvoker();
        ImplementedInvokerAssistant invokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        ImplementedCommonColumnAutoSetupper commonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();

        bind(BehaviorSelector.class).toInstance(behaviorSelector);
        bind(BehaviorCommandInvoker.class).toInstance(behaviorCommandInvoker);
        bind(InvokerAssistant.class).toInstance(invokerAssistant);
        bind(CommonColumnAutoSetupper.class).toInstance(commonColumnAutoSetupper);

        // The components of Behavior.
        setupBehavior(behaviorCommandInvoker, behaviorSelector, commonColumnAutoSetupper);
    }

    protected DBFluteInitializer createDBFluteInitializer() {
        return new org.docksidestage.hangar.dbflute.nogen.ExtendedDBFluteInitializer();
    }

    protected ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        return new ImplementedBehaviorSelector();
    }

    protected BehaviorCommandInvoker createBehaviorCommandInvoker() {
        return new BehaviorCommandInvoker();
    }

    protected ImplementedInvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant invokerAssistant = new org.docksidestage.hangar.dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new org.docksidestage.hangar.dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected void setupBehavior(BehaviorCommandInvoker ker, BehaviorSelector tor, CommonColumnAutoSetupper per) {
        {
            MemberBhv bhv = new MemberBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberBhv.class).toInstance(bhv);
        }
        {
            MemberAddressBhv bhv = new MemberAddressBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberAddressBhv.class).toInstance(bhv);
        }
        {
            MemberFollowingBhv bhv = new MemberFollowingBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberFollowingBhv.class).toInstance(bhv);
        }
        {
            MemberLoginBhv bhv = new MemberLoginBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberLoginBhv.class).toInstance(bhv);
        }
        {
            MemberSecurityBhv bhv = new MemberSecurityBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberSecurityBhv.class).toInstance(bhv);
        }
        {
            MemberServiceBhv bhv = new MemberServiceBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberServiceBhv.class).toInstance(bhv);
        }
        {
            MemberStatusBhv bhv = new MemberStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberStatusBhv.class).toInstance(bhv);
        }
        {
            MemberWithdrawalBhv bhv = new MemberWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberWithdrawalBhv.class).toInstance(bhv);
        }
        {
            ProductBhv bhv = new ProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductBhv.class).toInstance(bhv);
        }
        {
            ProductCategoryBhv bhv = new ProductCategoryBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductCategoryBhv.class).toInstance(bhv);
        }
        {
            ProductStatusBhv bhv = new ProductStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductStatusBhv.class).toInstance(bhv);
        }
        {
            PurchaseBhv bhv = new PurchaseBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(PurchaseBhv.class).toInstance(bhv);
        }
        {
            PurchasePaymentBhv bhv = new PurchasePaymentBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(PurchasePaymentBhv.class).toInstance(bhv);
        }
        {
            RegionBhv bhv = new RegionBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(RegionBhv.class).toInstance(bhv);
        }
        {
            ServiceRankBhv bhv = new ServiceRankBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ServiceRankBhv.class).toInstance(bhv);
        }
        {
            SummaryProductBhv bhv = new SummaryProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SummaryProductBhv.class).toInstance(bhv);
        }
        {
            SummaryWithdrawalBhv bhv = new SummaryWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(SummaryWithdrawalBhv.class).toInstance(bhv);
        }
        {
            Vendor$DollarBhv bhv = new Vendor$DollarBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(Vendor$DollarBhv.class).toInstance(bhv);
        }
        {
            VendorCheckBhv bhv = new VendorCheckBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorCheckBhv.class).toInstance(bhv);
        }
        {
            VendorIdentityOnlyBhv bhv = new VendorIdentityOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorIdentityOnlyBhv.class).toInstance(bhv);
        }
        {
            VendorPrimaryKeyOnlyBhv bhv = new VendorPrimaryKeyOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorPrimaryKeyOnlyBhv.class).toInstance(bhv);
        }
        {
            VendorTheLongAndWindingTableAndColumnBhv bhv = new VendorTheLongAndWindingTableAndColumnBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorTheLongAndWindingTableAndColumnBhv.class).toInstance(bhv);
        }
        {
            VendorTheLongAndWindingTableAndColumnRefBhv bhv = new VendorTheLongAndWindingTableAndColumnRefBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorTheLongAndWindingTableAndColumnRefBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseBhv bhv = new WhiteBaseBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne01SeaBhv bhv = new WhiteBaseOne01SeaBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne01SeaBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne01SeaBroadwayBhv bhv = new WhiteBaseOne01SeaBroadwayBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne01SeaBroadwayBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne01SeaDocksideBhv bhv = new WhiteBaseOne01SeaDocksideBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne01SeaDocksideBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne01SeaHangarBhv bhv = new WhiteBaseOne01SeaHangarBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne01SeaHangarBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne01SeaMagiclampBhv bhv = new WhiteBaseOne01SeaMagiclampBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne01SeaMagiclampBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne02LandBhv bhv = new WhiteBaseOne02LandBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne02LandBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne03PiariBhv bhv = new WhiteBaseOne03PiariBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne03PiariBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne04BonvoBhv bhv = new WhiteBaseOne04BonvoBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne04BonvoBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne04BonvoParksideBhv bhv = new WhiteBaseOne04BonvoParksideBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne04BonvoParksideBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne04BonvoStationsideBhv bhv = new WhiteBaseOne04BonvoStationsideBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne04BonvoStationsideBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne05DstoreBhv bhv = new WhiteBaseOne05DstoreBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne05DstoreBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne06AmbaBhv bhv = new WhiteBaseOne06AmbaBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne06AmbaBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne07MiracoBhv bhv = new WhiteBaseOne07MiracoBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne07MiracoBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne08DohotelBhv bhv = new WhiteBaseOne08DohotelBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne08DohotelBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne09PalmBhv bhv = new WhiteBaseOne09PalmBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne09PalmBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne10CelebBhv bhv = new WhiteBaseOne10CelebBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne10CelebBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne11CirqueBhv bhv = new WhiteBaseOne11CirqueBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne11CirqueBhv.class).toInstance(bhv);
        }
        {
            WhiteBaseOne12AmphiBhv bhv = new WhiteBaseOne12AmphiBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteBaseOne12AmphiBhv.class).toInstance(bhv);
        }
        {
            WhiteClassificationDeploymentBhv bhv = new WhiteClassificationDeploymentBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteClassificationDeploymentBhv.class).toInstance(bhv);
        }
        {
            WhiteCompoundPkBhv bhv = new WhiteCompoundPkBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteCompoundPkBhv.class).toInstance(bhv);
        }
        {
            WhiteCompoundPkRefPhysicalBhv bhv = new WhiteCompoundPkRefPhysicalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteCompoundPkRefPhysicalBhv.class).toInstance(bhv);
        }
        {
            WhiteCompoundPkRefVirtualBhv bhv = new WhiteCompoundPkRefVirtualBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteCompoundPkRefVirtualBhv.class).toInstance(bhv);
        }
        {
            WhiteDateTermBhv bhv = new WhiteDateTermBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDateTermBhv.class).toInstance(bhv);
        }
        {
            WhiteDbCommentBhv bhv = new WhiteDbCommentBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDbCommentBhv.class).toInstance(bhv);
        }
        {
            WhiteDbCommentAdditionalBhv bhv = new WhiteDbCommentAdditionalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDbCommentAdditionalBhv.class).toInstance(bhv);
        }
        {
            WhiteDeprecatedBhv bhv = new WhiteDeprecatedBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDeprecatedBhv.class).toInstance(bhv);
        }
        {
            WhiteDeprecatedRefBhv bhv = new WhiteDeprecatedRefBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDeprecatedRefBhv.class).toInstance(bhv);
        }
        {
            WhiteDeprecatedSelectByPkuqBhv bhv = new WhiteDeprecatedSelectByPkuqBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDeprecatedSelectByPkuqBhv.class).toInstance(bhv);
        }
        {
            WhiteDeprecatedSpecifyBatchColumnBhv bhv = new WhiteDeprecatedSpecifyBatchColumnBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteDeprecatedSpecifyBatchColumnBhv.class).toInstance(bhv);
        }
        {
            WhiteFirstDateBhv bhv = new WhiteFirstDateBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteFirstDateBhv.class).toInstance(bhv);
        }
        {
            WhiteNotNullBhv bhv = new WhiteNotNullBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteNotNullBhv.class).toInstance(bhv);
        }
        {
            WhiteOnParadeBhv bhv = new WhiteOnParadeBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteOnParadeBhv.class).toInstance(bhv);
        }
        {
            WhiteOnParadeNullableToManyBhv bhv = new WhiteOnParadeNullableToManyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteOnParadeNullableToManyBhv.class).toInstance(bhv);
        }
        {
            WhiteOnParadeRefBhv bhv = new WhiteOnParadeRefBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteOnParadeRefBhv.class).toInstance(bhv);
        }
        {
            WhiteReadOnlyBhv bhv = new WhiteReadOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(WhiteReadOnlyBhv.class).toInstance(bhv);
        }
        {
            WhiteSchemaDiffBhv bhv = new WhiteSchemaDiffBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteSchemaDiffBhv.class).toInstance(bhv);
        }
        {
            WhiteSelfReferenceBhv bhv = new WhiteSelfReferenceBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteSelfReferenceBhv.class).toInstance(bhv);
        }
        {
            WhiteSimpleDtoExceptBhv bhv = new WhiteSimpleDtoExceptBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteSimpleDtoExceptBhv.class).toInstance(bhv);
        }
        {
            WhiteSinglePkBhv bhv = new WhiteSinglePkBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteSinglePkBhv.class).toInstance(bhv);
        }
        {
            WhiteTsvLoadingBhv bhv = new WhiteTsvLoadingBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteTsvLoadingBhv.class).toInstance(bhv);
        }
        {
            WhiteTypeMappingBhv bhv = new WhiteTypeMappingBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WhiteTypeMappingBhv.class).toInstance(bhv);
        }
    }
}
