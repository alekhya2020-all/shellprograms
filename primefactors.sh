#!/bin/bash -x
read n
for((i=2;n>1;i++))
do
   while [ $((n%i)) -eq 0 ]
   do
      echo "prime numbers:"$i
		array[i]=$i
		echo ${array[i]}
		n=$((n/i))
	done
done
