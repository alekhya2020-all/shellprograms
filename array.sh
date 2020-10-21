#!/bin/bash -x
for ((i=0;i<=9;i++))
do
   value=$((RANDOM%900+100))
	#array[i]=$value
	A[i]=$value
	echo ${A[@]}
done
largest=${A[0]}
smallest=${A[0]}
for i in ${A[@]}
do
	  if [[ $i -gt $largest ]]
     then
        largest="$i"
		fi
	  if [[ $i -lt $smallest ]]
	  then
			smallest="$i"
	  fi
done
echo "The largest number is $largest"
echo "The smallest number is $smallest"


