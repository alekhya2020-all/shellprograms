#!/bin/bash -x
randomnumber=$((RANDOM))
for integers in $(shuf -i 100-999 -n 5)
do
echo "$integers"

#read -a integers
biggest=${integers[0]}
smallest=${integers[0]}

for i in ${integers[@]}
do
     if [[ $i -gt $biggest ]]
     then
        biggest="$i"
     fi

     if [[ $i -lt $smallest ]]
     then
        smallest="$i"
     fi
done
echo "The largest number is $biggest"
echo "The smallest number is $smallest"
done
