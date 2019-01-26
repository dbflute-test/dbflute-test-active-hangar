-- #df:checkEnv(spolicy)#
alter table PRODUCT add PRODUCT_ONSALES_FLG integer not null after PRODUCT_STATUS_CODE;
alter table PRODUCT add ONSALES_APPLICABLE_SERVICE_RANK char(3) after PRODUCT_ONSALES_FLG;
