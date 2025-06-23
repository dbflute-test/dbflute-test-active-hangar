
-- =======================================================================================
--                                                                     Whitebox Constraint
--                                                                     ===================

-- #df:assertListZero#
-- /- - - - - - - - - - - - - - - - - - - - - - -
-- test of tsv loading with large text file map
-- - - - - - - - - - -/
select *
  from WHITE_TSV_LOADING
 where LARGE_FROM_FILE like '%.dfmail%'
;

-- #df:assertCountExists@ut#
-- /- - - - - - - - - - - - - - - - - - - - - - -
-- test of tsv loading with empty string
-- - - - - - - - - - -/
select *
  from WHITE_TSV_LOADING
 where EMPTY_STRING_ALLOWED = ''
;
