#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=$1

if [ "$FIRST_ARG" = "clean" ];then
  echo "...Cleaning existing resources"
fi

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=spolicy

. replace-schema.sh
. jdbc.sh
. doc.sh

unset DBFLUTE_ENVIRONMENT_TYPE

. manage.sh refresh

