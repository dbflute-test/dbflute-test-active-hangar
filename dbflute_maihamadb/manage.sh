#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=$1
SECOND_ARG=$2

echo "...Overriding DBFlute Engine templates for application customization"
cp -R ./extplates/om $DBFLUTE_HOME/templates

sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH $FIRST_ARG $SECOND_ARG
taskReturnCode=$?

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi
