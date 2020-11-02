#!/bin/bash -x
declare -i f
i=INCHES
f=FEET
read -p "Enter FEET: "  FEET

INCHES =$(echo $FEET *12 | bc -l)
echo $INCHES
