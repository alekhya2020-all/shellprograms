#!/bin/bash -x
echo "n"
read n
sum=0
for ((i=1;i<=n;i++))
do
   harmonicnumber=`awk 'BEGIN{print 1/'$i'}'`
   sum=$(echo "$sum + $harmonicnumber" | bc)

echo $sum
done

