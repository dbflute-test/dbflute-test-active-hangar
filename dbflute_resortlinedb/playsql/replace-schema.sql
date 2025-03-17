
create table STATION(
    STATION_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    STATION_NAME VARCHAR(200) NOT NULL,
    BIRTHDATE DATE,
    FORMALIZED_DATETIME DATETIME,
    HOME_COUNT INTEGER,
    WORKING_KILOMETER DECIMAL(4,2)
);



-- test of split way by other schema
-- (only part of MEMBER table's relationships are split target)

create table MEMBER(
    MEMBER_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_NAME VARCHAR(200) NOT NULL,
    MEMBER_ACCOUNT VARCHAR(50) NOT NULL,
    MEMBER_STATUS_CODE CHAR(3) NOT NULL,
    FORMALIZED_DATETIME DATETIME,
    BIRTHDATE DATE,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);

create table MEMBER_SECURITY(
    MEMBER_ID INTEGER NOT NULL PRIMARY KEY,
    LOGIN_PASSWORD VARCHAR(100) NOT NULL,
    REMINDER_QUESTION VARCHAR(50) NOT NULL,
    REMINDER_ANSWER VARCHAR(50) NOT NULL,
    REMINDER_USE_COUNT INTEGER NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);

create table PURCHASE(
    PURCHASE_ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
    MEMBER_ID INTEGER NOT NULL,
    PRODUCT_ID INTEGER NOT NULL,
    PURCHASE_DATETIME DATETIME NOT NULL,
    PURCHASE_COUNT INTEGER NOT NULL,
    PURCHASE_PRICE INTEGER NOT NULL,
    PAYMENT_COMPLETE_FLG INTEGER NOT NULL,
    REGISTER_DATETIME DATETIME NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATETIME NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO BIGINT NOT NULL
);

alter table PURCHASE add constraint FK_PURCHASE_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_SECURITY add constraint FK_MEMBER_SECURITY_MEMBER 
    foreign key (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER add constraint UQ_MEMBER_MEMBER_ACCOUNT UNIQUE (MEMBER_ACCOUNT);
alter table PURCHASE add constraint UQ_PURCHASE UNIQUE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME);

create index IX_MEMBER_MEMBER_NAME on MEMBER(MEMBER_NAME);
create index IX_MEMBER_FORMALIZED_DATETIME on MEMBER(FORMALIZED_DATETIME);
create index IX_PURCHASE_PRODUCT_DATETIME on PURCHASE(PRODUCT_ID, PURCHASE_DATETIME);
create index IX_PURCHASE_DATETIME_MEMBER on PURCHASE(PURCHASE_DATETIME, MEMBER_ID);
create index IX_PURCHASE_PRICE on PURCHASE(PURCHASE_PRICE);
