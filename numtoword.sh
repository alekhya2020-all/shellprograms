#!/bin/bash -x
echo "Please enter a one digit number"
read digitnum

case $digitnum in
   1)echo "1";;
   2)echo "2";;
   3)echo "3";;
   4)echo "4";;
   *)echo "a number is greater than or equal to four";;
esac
