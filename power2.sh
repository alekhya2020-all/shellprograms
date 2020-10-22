#!/bin/bash -x
echo "n"
read n
for ((i=0;i<=n;i++))
do
     value=$((2**$i))
     echo $value
 done
echo $value

