-- #df:checkEnv(spolicy)#

-- violation of classification
alter table PRODUCT add PRODUCT_ONSALES_FLG BIGINT not null after PRODUCT_STATUS_CODE;
alter table PRODUCT add PRODUCT_ONSALES_FLAG integer not null after PRODUCT_STATUS_CODE;
alter table PRODUCT add ONSALES_APPLICABLE_RANK_CODE char(3) after PRODUCT_ONSALES_FLG;

-- violation of sameColumnDbTypeIfSameColumnName
alter table PRODUCT add DISPLAY_ORDER varchar(3) after PRODUCT_NAME;

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of first date and so on...
-- = = = = = = = = = =/
-- first dates of these tables are current
CREATE TABLE SPOLICY_NEW_CREATED (
	NEW_CREATED_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	NEW_CREATED_NAME VARCHAR(200) NOT NULL,
	SAME_NAME_WITH_UNIQUE VARCHAR(20)
);

alter table SPOLICY_NEW_CREATED add constraint SAME_NAME_WITH_UNIQUE UNIQUE (SAME_NAME_WITH_UNIQUE);

CREATE TABLE SPOLICY_NEW_CREATED_REF (
	REF_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	REF_NAME VARCHAR(200) NOT NULL,
	NEW_CREATED_ID NUMERIC(16) NOT NULL
);

alter table SPOLICY_NEW_CREATED_REF add constraint VIOLATION_FK_NAME 
    foreign key (NEW_CREATED_ID) references SPOLICY_NEW_CREATED (NEW_CREATED_ID);
