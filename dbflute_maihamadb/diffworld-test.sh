#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=$1

if [ "$FIRST_ARG" = "clean" ];then
  echo "...Cleaning existing resources"
  rm -Rf ./dfprop/diffworld/diffworlddb.*.db
  rm -Rf ./output/doc/diffworld-*.html
  rm -Rf ./output/doc/craftdiff/diffworld
  rm -Rf ./playsql/migration/alter
  rm -Rf ./playsql/migration/schema
  rm -Rf ./schema/project-sync-*
  rm -Rf ./schema/diffworld
  rm -Rf ./schema/craftdiff/diffworld
fi

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=diffready

. replace-schema.sh
. jdbc.sh

export DBFLUTE_ENVIRONMENT_TYPE=diffworld

. replace-schema.sh
. jdbc.sh
. doc.sh

# call by native not to stop by failure 
sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH schema-sync-check
sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH alter-check

unset DBFLUTE_ENVIRONMENT_TYPE

. manage.sh refresh
