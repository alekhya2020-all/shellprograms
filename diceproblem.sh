#!/bin/bash -x
declare -A dice
array=("keyword" "keyword1")
for i in "${array[@]}"
#for((i=1;i<=6;i++))
do
#value=$((RANDOM%3))
dice+=([$i]=0)
done
echo ${dice[@]}
echo ${!dice[@]}
