#!/bin/bash -x

value=$((RANDOM%100))
echo $value

if [ $(( value%11 )) -eq 0 ]
then
	echo "repeated twice"
fi
