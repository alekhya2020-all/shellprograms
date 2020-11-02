#!/bin/bash -x
for ((i=0;i<=9;i++))
do
   value=$((RANDOM%900+100))
   A[i]=$value
   echo ${A[@]}
done

if [[ ${A[0]} -gt ${A[1]} ]]
then
	largest=${A[0]}
	second=${A[1]}
else
	largest=${A[1]}
	second=${A[0]}
fi

for ((i=2;i<10;i++))
do
	if [[ $largest -lt ${A[i]} ]]
	then
	second=$largest
	largest=${A[i]}
	elif [[ $second -lt ${A[i]} ]]
	then
	second=${A[i]}
	fi
done
echo "largest number"$largest
echo "second largest number"$second

if [[ ${A[0]} -lt ${A[1]} ]]
then
   smallest=${A[0]}
   secondsmallest=${A[1]}
else
   smallest=${A[1]}
   secondsmallest=${A[0]}
fi

for ((i=2;i<10;i++))
do
   if [[ $smallest -gt ${A[i]} ]]
   then
   secondnumber=$smallest
   smallest=${A[i]}
   elif [[ $secondsmallest -gt ${A[i]} ]]
   then
	secondsmallest=${A[i]}
   fi
done
echo "smallestnumber"$smallest
echo "second smallest number"$secondnumber
