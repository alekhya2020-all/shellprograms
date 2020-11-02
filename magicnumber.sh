#!/bin/bash -x
min=0
max=100
randomnumber=$((RANDOM%100))
echo $randomnumber

   if [ $randomnumber -gt 50 ]
	then
	echo "number is greater than 50"
	else
	echo "number is less than 50"
	fi
