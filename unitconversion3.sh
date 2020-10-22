#!/bin/bash -x
declare -f a
f=FEET
a=ACRES

ACRES=$(echo "60000/43560"|bc -l)
echo $ACRES
