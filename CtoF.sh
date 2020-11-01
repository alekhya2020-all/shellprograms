#!/bin/bash -x
CtoF() {
echo "1. Convert Celsius temperature into Fahrenheit"
echo "2. Convert Fahrenheit temperatures into Celsius"
echo -n "Select your choice (1-2) : "
read choice

if [ $choice -eq 1 ]
then
	echo -n "Enter temperature (C): "
	read tc
	if [[ "$tc" -ge 0 && "$tc" -le 100 ]];
	then
	tf=$(echo "scale=2;((9/5) * $tc) + 32" |bc)
	echo "$tc C = $tf F"
	else
	echo "not in range"
	fi

elif [ $choice -eq 2 ]
then
	echo -n "Enter temperature (F): "
	read tf
	if  [[ "$tf" -ge 32 && "$tf" -le 212 ]];
	then
	tc=$(echo "scale=2;(5/9)*($tf-32)" |bc)
	else
	echo "not in range"
	fi

fi
}
read $1
read $2
CtoF "$1"
CtoF "$2"
