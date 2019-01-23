#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=$1

if [ "$FIRST_ARG" = "clean" ];then
  echo "...Cleaning existing resources"
fi

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=spolicy

# call by native not to stop by failure 
sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH replace-schema

unset DBFLUTE_ENVIRONMENT_TYPE

. manage.sh refresh

