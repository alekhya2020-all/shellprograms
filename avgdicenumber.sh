#!/bin/bash -x
randomnumber=$((RANDOM))
s=0
for v in $(shuf -i 10-99 -n 5)

do
echo "number $v"
s=$(($s+$v))
done

echo "sum : $s"
avg=$(echo "scale=2; $s/5" | bc -l )
printf "avg : %.2f\n" $avg
