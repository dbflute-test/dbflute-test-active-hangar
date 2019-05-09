-- #df:checkEnv(spolicy)#
alter table PRODUCT add PRODUCT_ONSALES_FLG BIGINT not null after PRODUCT_STATUS_CODE;
alter table PRODUCT add PRODUCT_ONSALES_FLAG integer not null after PRODUCT_STATUS_CODE;
alter table PRODUCT add ONSALES_APPLICABLE_RANK_CODE char(3) after PRODUCT_ONSALES_FLG;
