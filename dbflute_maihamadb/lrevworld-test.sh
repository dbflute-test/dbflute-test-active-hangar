#!/bin/bash

cd `dirname $0`
. _project.sh

FIRST_ARG=$1

if [ "$FIRST_ARG" = "clean" ];then
  echo "...Cleaning existing resources"
  rm -Rf ./output/doc/data
fi

export answer=y

. manage.sh load-data-reverse
