#!/bin/bash -x
declare -A dice
for((i=1;i<=30;i++))
do
	A[1]=0
	A[2]=0
	A[3]=0
	A[4]=0
	A[5]=0
	A[6]=0

	A[dice]=$((RANDOM%6))
	echo "$A[dice]"
	  if [ $i -lt 1 -a $i -gt 10 ]
	  then
			if A[dice] -eq 1
			then
				A[1]+=1
			elif A[dice] -eq 2
			then
				A[2]+=1
			elif A[dice] -eq 3
         then
            A[3]+=1
			elif A[dice] -eq 4
         then
            A[4]+=1
			elif A[dice] -eq 5
         then
            A[5]+=1
			elif A[dice] -eq 6
         then
            A[6]+=1

fi
fi
echo "$A[1]+"=ones
done
