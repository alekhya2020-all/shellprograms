#!/bin/bash -x
echo "enter a number to find root"
read root
for ((i=0;i<=root;i++))
do
  value=$((2**$i))
  harmoniumval=`awk 'BEGIN{print 1/'$i'}'`
  echo $i $value
done
echo $harmoniumval
