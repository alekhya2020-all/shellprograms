#!/bin/bash -x
declare -m f
m=METERS
f=FEET

METERS=$(echo "2400/3.2808" |bc -l)
echo $METERS
