#!/bin/bash -x

for ((i=1;i<=50;i++))
do
   value=$((RANDOM%50))
   individuals[i]=$value
   echo ${individuals[@]}
done

for ((j=1;j<=12;j++))
do
   value1=$((RANDOM%12))
   month[j]=$value1
   echo ${month[@]}
done

