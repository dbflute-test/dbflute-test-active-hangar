
-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of fixed-only biz-one-to-one
-- = = = = = = = = = =/
CREATE TABLE WHITE_DATE_TERM (
	DATE_TERM_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	DATE_TERM_VALUE VARCHAR(200) NOT NULL,
	BEGIN_DATE DATE NOT NULL,
	END_DATE DATE NOT NULL
);

-- /= = = = = = = = = = = = = =
-- for the test of tsv loading
-- = = = = = = = = = =/
CREATE TABLE WHITE_TSV_LOADING (
	TSV_LOADING_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	TSV_LOADING_NAME VARCHAR(200) NOT NULL,
	LOADING_COUNT INTEGER,
	LOADING_DATE DATE NOT NULL,
	BEGIN_DATETIME DATETIME NOT NULL,
	END_DATETIME DATETIME,
	LARGE_FROM_FILE VARCHAR(500) NULL,
	DONE_FLG BOOLEAN NOT NULL
);

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of deprecated select-by-pk-uq
-- = = = = = = = = = =/
CREATE TABLE WHITE_DEPRECATED_SELECT_BY_PKUQ (
	SELECT_BY_PKUQ_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SELECT_BY_PKUQ_NAME VARCHAR(200) NOT NULL,
	SELECT_BY_PKUQ_CODE VARCHAR(16) NOT NULL
);

alter table WHITE_DEPRECATED_SELECT_BY_PKUQ add constraint UQ_WHITE_DEPRECATED_SELECT_BY_PKUQ UNIQUE (SELECT_BY_PKUQ_CODE);

-- /= = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of deprecated specify batch-column
-- = = = = = = = = = =/
CREATE TABLE WHITE_DEPRECATED_SPECIFY_BATCH_COLUMN (
	SPECIFY_BATCH_COLUMN_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SPECIFY_BATCH_COLUMN_NAME VARCHAR(200) NOT NULL
);


-- /= = = = = = = = = = = = = =
-- for the test of simple dto
-- = = = = = = = = = =/
CREATE TABLE WHITE_SIMPLE_DTO_EXCEPT (
	SIMPLE_DTO_EXCEPT_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SIMPLE_DTO_EXCEPT_NAME VARCHAR(200) NOT NULL
);

