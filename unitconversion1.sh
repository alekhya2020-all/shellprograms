#!/bin/bash -x
declare -i f
i=INCHES
f=FEET

FEET =$(echo "42/12" |bc -l)
echo $FEET
