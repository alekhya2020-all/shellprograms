#!/bin/bash -x

read -p "value" n
 ones=$(($n%10))
 tens=$(((($n/10))%10))
 hundreds=$(((($n/100))%10))
 thousands=$(($n/1000 ))


read number
case $number in
1)echo -n "$ones";;
2)echo -n "$tens";;
3)echo -n "$hundreds";;
4)echo -n "$thousands";;
esac
