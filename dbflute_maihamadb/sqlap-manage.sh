#!/bin/bash

cd `dirname $0`
. _project.sh

# #for_now needs ApplicationOutsideSql test project but already rare function? by jflute (2022/05/15)
echo *ApplicationBehavior environment is not complete so cannot execute it
exit 0;

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=sqlap

FIRST_ARG=$1
SECOND_ARG=$2

sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH $FIRST_ARG $SECOND_ARG
taskReturnCode=$?

unset DBFLUTE_ENVIRONMENT_TYPE

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi
