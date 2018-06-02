#!/bin/bash

cd `dirname $0`
. _project.sh

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=diffready

. replace-schema.sh

rm ./output/doc/syncworld-sync-check-result.html
rm ./dfprop/syncworld/syncworlddb.mv.db
cp ./dfprop/diffworld/diffworlddb.mv.db ./dfprop/syncworld/syncworlddb.mv.db

export DBFLUTE_ENVIRONMENT_TYPE=syncworld

. manage.sh schema-sync-check

unset DBFLUTE_ENVIRONMENT_TYPE

. manage.sh refresh
