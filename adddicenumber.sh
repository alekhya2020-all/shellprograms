#!/bin/bash -x
echo -n "enter the first number : "
read num1
echo -n "enter the second number : "
read num2
sum= $(($num1+$num2))
echo "sum of two values is $sum"
