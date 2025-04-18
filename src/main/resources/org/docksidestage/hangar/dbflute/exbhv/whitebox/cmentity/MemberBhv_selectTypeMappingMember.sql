/*
 [df:title]
 test of typeMapping for Sql2Entity
 
 [df:description]
 e.g. point mapping
*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

select mapping.TYPE_MAPPING_ID
     , mapping.TYPE_MAPPING_NAME
     , mapping.TYPE_MAPPING_COUNT
     , mapping.TYPE_MAPPING_DATE
     , mapping.TYPE_MAPPING_DATETIME
     , mapping.POINT_MAPPING_DATE
  from WHITE_TYPE_MAPPING mapping
