#!/bin/bash

cd `dirname $0`
. _project.sh

rm -Rf ./output/doc/data

export answer=y

. manage.sh load-data-reverse
