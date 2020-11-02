#!/bin/bash -x
declare -m f
m=METER
f=FEET
read -p "Enter METER: "  METER

case "$METER" in
FEET =$(echo "$METER" /0.3048 | bc -l)
echo $FEET
esac
