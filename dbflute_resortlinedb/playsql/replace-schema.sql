
create table STATION(
    STATION_ID INTEGER IDENTITY NOT NULL PRIMARY KEY,
    STATION_NAME VARCHAR(200) NOT NULL,
    BIRTHDATE DATE,
    FORMALIZED_DATETIME DATETIME,
    HOME_COUNT INTEGER,
    WORKING_KILOMETER DECIMAL(4,2)
);
