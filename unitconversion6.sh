#!/bin/bash -x
declare -i f
i=inch
f=FEET
read -p "Enter INCH: "  INCH

FEET =$(echo $INCH /12 | bc -l)
echo $FEET


