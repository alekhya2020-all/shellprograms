#!/bin/bash -x
for ((i=0;i<=9;i++))
do
   value=$((RANDOM%900+100))
   A[i]=$value
   echo ${A[@]}
done

for((i=0;i<10;i++))
do
	for((j=0;j<10-i-1;j++))
	do
		if [ ${A[j]} -gt ${A[$((j+1))]} ]
		then
				T=${A[j]}
				A[$j]=${A[$((j+1))]}
				A[$((j+1))]=$T
		fi
	done
done

echo "array in sorted order"
echo "${A[@]}"
echo "second smallest:"${A[1]}
echo "second largest:"${A[8]}

