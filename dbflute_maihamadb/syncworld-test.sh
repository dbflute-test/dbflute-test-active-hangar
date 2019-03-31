#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=$1

if [ "$FIRST_ARG" = "clean" ];then
  echo "...Cleaning existing resources"
  rm ./output/doc/syncworld-sync-check-result.html
fi

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=diffready

. manage.sh replace-schema

rm ./dfprop/syncworld/syncworlddb.mv.db
cp ./dfprop/diffworld/diffworlddb.mv.db ./dfprop/syncworld/syncworlddb.mv.db

export DBFLUTE_ENVIRONMENT_TYPE=syncworld

. manage.sh schema-sync-check

unset DBFLUTE_ENVIRONMENT_TYPE

. manage.sh refresh
