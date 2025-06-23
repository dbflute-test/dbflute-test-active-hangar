
-- =======================================================================================
--                                                                     TestData Constraint
--                                                                     ===================
-- /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
-- These tables should have at least one record at ut and should not have at real.
-- - - - - - - - - - -/
-- #df:assertCountExists@ut#
-- #df:assertCountZero@real#
select count(*) from MEMBER member
;
-- #df:assertCountExists@ut#
-- #df:assertCountZero@real#
select count(*) from MEMBER_LOGIN login
;
