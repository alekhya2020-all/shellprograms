#!/bin/bash -x

read -p "enter a value:" a
read -p "enter b value:" b
read -p "enter c value:" c

val1=$(( $a+$b*$c ))
echo "$val1"
val2=$(($a%$b+$c))
echo "$val2"
val3=$(($c+$a/$b))
echo "$val3"
val4=$(($a*$b+$c))
echo "$val4"

echo $val1 $val2 $val3 $val4
if [ $val1 -gt $val2 -a  $val1 -gt $val3 -a  $val1 -gt $val4 ]
then
echo "$val1 is maximum"
elif [ $val2 -gt $val1 -a  $val2 -gt $val3 -a  $val1 -gt $val4 ]
then
echo "$val2 is maximum"
elif [ $val3 -gt $val1 -a  $val3 -gt $val2 -a $val3 -gt $val4 ]
then
echo "$val3 is maximum"
else
echo "$val4 is maximum"
fi

if [ $val1 -lt $val2 -a  $val1 -lt $val3 -a  $val1 -lt $val4 ]
then
echo "$val1 is minimum"
elif [ $val2 -lt $val1 -a  $val2 -lt $val3 -a $val1 -lt $val4 ]
then
echo "$val2 is minimum"
elif [ $val3 -lt $val1 -a  $val3 -lt $val2 -a  $val3 -lt $val4 ]
then
echo "$val3 is minimum"
else
echo "$val4 is minimum"
fi


