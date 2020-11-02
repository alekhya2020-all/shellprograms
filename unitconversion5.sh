#!/bin/bash -x
declare -m f
m=METER
f=FEET
read -p "Enter FEET: "  FEET

METER =$(echo $FEET *0.3048 | bc -l)
echo $METER

