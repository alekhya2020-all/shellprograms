#!/bin/bash -x
A=("val1" "val2" "val3")
echo ${A[@]}
read val1
read val2
read val3

if [ $(("$val1"+"$val2"+"$val3")) -eq 0 ]
then
	echo "sum of the values is zero"
fi

