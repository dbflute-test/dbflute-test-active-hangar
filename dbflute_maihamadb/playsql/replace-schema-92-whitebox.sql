
-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of classification deployment
-- = = = = = = = = = =/
CREATE TABLE WHITE_CLASSIFICATION_DEPLOYMENT (
	DEPLOYMENT_ID NUMERIC(16) NOT NULL,
	SEA_FLG INTEGER NOT NULL,
	DEPLOYMENT_TYPE_CODE CHAR(3) NOT NULL,
	PRIMARY KEY(DEPLOYMENT_ID)
);

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of compound PK
-- = = = = = = = = = =/
CREATE TABLE WHITE_COMPOUND_PK (
	PK_FIRST_ID NUMERIC(16) NOT NULL,
	PK_SECOND_ID NUMERIC(16) NOT NULL,
	COMPOUND_PK_NAME VARCHAR(200) NOT NULL,
	REFERRED_ID INTEGER NOT NULL,
	PRIMARY KEY(PK_FIRST_ID, PK_SECOND_ID)
);

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
-- for the test of DB comment
-- = = = = = = = = = =/
CREATE TABLE WHITE_DB_COMMENT (
	DB_COMMENT_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	DB_COMMENT_NAME VARCHAR(200) NOT NULL
);

comment on table WHITE_DB_COMMENT is 'DBコメント: テーブルコメントのエスケープのテスト...
_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
o (table)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ 
o (table)mapStyle, map:\{ sea \= mystic \; land \= oneman \} エスケープされてても大丈夫？ 
o (table)DBコメントで、ベタッと ''シングルクォーテーション'' で囲うけど大丈夫？
o (table)DBコメントで、ベタッと <span>HTMLタグ</span> で囲うけど大丈夫？
o (table)DBコメントで、ベタッと &lt;HTMLエスケープ表現&gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)
o (table)あと、DBコメントは、"JavaDoc" でも使われるし、DBMetaで "文字列リテラル" で使われるけど大丈夫？
o (table)なので、@author jflute とか入ってても大丈夫？ あと、改行 "\n" とか、エスケエスケ "\\" とか大丈夫？
_/_/_/_/_/_/_/_/_/_/
';

comment on column WHITE_DB_COMMENT.DB_COMMENT_NAME is 'DBコメント: カラムコメントのエスケープのテスト...
_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
o (column)mapStyle, map:{ sea = mystic ; land = oneman } そのまま書いても大丈夫？ 
o (column)mapStyle, map:\{ sea \= mystic \; land \= oneman \} エスケープされてても大丈夫？ 
o (column)DBコメントで、ベタッと ''シングルクォーテーション'' で囲うけど大丈夫？
o (column)DBコメントで、ベタッと <span>HTMLタグ</span> で囲うけど大丈夫？
o (column)DBコメントで、ベタッと &lt;HTMLエスケープ表現&gt; で囲うけど大丈夫？ (もともとSchemaHTML的にダメみたい!?)
o (column)あと、DBコメントは、"JavaDoc" でも使われるし、DBMetaで "文字列リテラル" で使われるけど大丈夫？
o (column)なので、@author jflute とか入ってても大丈夫？ あと、改行 "\n" とか、エスケエスケ "\\" とか大丈夫？
_/_/_/_/_/_/_/_/_/_/
';

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
-- for the test of first date
-- = = = = = = = = = =/
CREATE TABLE WHITE_FIRST_DATE (
	FIRST_DATE_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	FIRST_DATE_NAME VARCHAR(200) NOT NULL,
	ADDED_AT_TABLE_SAME_DATE DATE NOT NULL
);

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of various
-- = = = = = = = = = =/
CREATE TABLE WHITE_ON_PARADE (
	ON_PARADE_ID NUMERIC(16) NOT NULL,
	ON_PARADE_NAME VARCHAR(100) NOT NULL,
	PRIMARY KEY(ON_PARADE_ID)
);

CREATE TABLE WHITE_ON_PARADE_REF (
	REF_ID NUMERIC(16) NOT NULL,
	REF_NAME VARCHAR(100) NOT NULL,
	NULLABLE_FK_ON_PARADE_ID NUMERIC(16),
	NULLABLE_FK_TO_MANY_ID NUMERIC(16),
	PRIMARY KEY(REF_ID)
);

CREATE TABLE WHITE_ON_PARADE_NULLABLE_TO_MANY (
	MANY_ID NUMERIC(16) NOT NULL,
	MANY_NAME VARCHAR(100) NOT NULL,
	PRIMARY KEY(MANY_ID)
);

ALTER TABLE WHITE_ON_PARADE_REF ADD CONSTRAINT FK_WHITE_ON_PARADE_REF_ON_PARADE
	FOREIGN KEY (NULLABLE_FK_ON_PARADE_ID)
	REFERENCES WHITE_ON_PARADE (ON_PARADE_ID) ;

ALTER TABLE WHITE_ON_PARADE_REF ADD CONSTRAINT FK_WHITE_ON_PARADE_REF_MANY_MANY
	FOREIGN KEY (NULLABLE_FK_TO_MANY_ID)
	REFERENCES WHITE_ON_PARADE_NULLABLE_TO_MANY (MANY_ID) ;

-- /= = = = = = = = = = = = = =
-- for the test of schema diff
-- = = = = = = = = = =/
CREATE TABLE WHITE_SCHEMA_DIFF (
	SCHEMA_DIFF_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SCHEMA_DIFF_NAME VARCHAR(200) NOT NULL,
	SCHEMA_DIFF_DATE DATE NOT NULL
);

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of self reference
-- = = = = = = = = = =/
CREATE TABLE WHITE_SELF_REFERENCE (
	SELF_REFERENCE_ID INTEGER NOT NULL,
	SELF_REFERENCE_NAME VARCHAR(200) NOT NULL,
	PARENT_ID INTEGER,
	PRIMARY KEY(SELF_REFERENCE_ID)
);

ALTER TABLE WHITE_SELF_REFERENCE ADD CONSTRAINT FK_WHITE_SELF_REFERENCE_PARENT_ID
	FOREIGN KEY (PARENT_ID)
	REFERENCES WHITE_SELF_REFERENCE (SELF_REFERENCE_ID) ;

-- /= = = = = = = = = = = = = =
-- for the test of simple dto
-- = = = = = = = = = =/
CREATE TABLE WHITE_SIMPLE_DTO_EXCEPT (
	SIMPLE_DTO_EXCEPT_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	SIMPLE_DTO_EXCEPT_NAME VARCHAR(200) NOT NULL
);

-- /= = = = = = = = = = = = = = = = = = = = =
-- for the test of single PK
-- = = = = = = = = = =/
CREATE TABLE WHITE_SINGLE_PK (
	ONLY_ONE_PK_ID NUMERIC(16) NOT NULL,
	SINGLE_PK_NAME VARCHAR(200) NOT NULL,
	REFERRED_ID INTEGER NOT NULL,
	PRIMARY KEY(ONLY_ONE_PK_ID)
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
