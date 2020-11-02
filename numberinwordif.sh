#!/bin/bash -x
echo "please enter a single digit number"
read digitnum
if [ $digitnum -eq 1 ]
then
   echo "one"
elif [ $digitnum -eq 2 ]
then
   echo "two"
elif [ $digitnum -eq 3 ]
then
   echo "three"
elif [ $digitnum -eq 4 ]
then 
   echo "four"
elif [ $digit num -lt 1 ]
then 
   echo "zero"
else
   echo "a number is two digit number"
fi;
