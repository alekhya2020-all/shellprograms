#!/bin/bash -x
read n
for((i=2;n>1;i++))
do
	while [ $((n%i)) -eq 0 ]
	do
		echo "prime number:"$i
		n=$((n/i))
	done
done

