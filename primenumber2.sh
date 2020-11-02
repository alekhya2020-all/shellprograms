#!/bin/bash -x
read a
read b
for((i=a;i<=b;i++))
do
	for((j=2; j<=i; j++))
	do
 		 if [ $((i%j)) -eq 0 ]
  		then
    	break
 		 fi
	done

		if [ $i -eq $j ]
		then
		echo "it is a prime number." 
		echo $j
		fi
done

