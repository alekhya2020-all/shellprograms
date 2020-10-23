#!/bin/bash -x
declare -A dice
for((i=1;i<=6;i++))
do
	dice+=([$i]=0)
done
echo ${dice[@]}

count=1
w=0
while [ $count -gt 0 ]
do
((w++))
count=$(( RANDOM%6+1 ))
echo "$count value is:" $count
((dice[$count]++))
if [ ${dice[$count]} -eq 10 ]
then
break
fi
done
echo ""
echo -e "dice\tcounting"
echo ""
for((i=1;i<=6;i++))
do
echo -e "$i\t\t${dice[$i]}"
done
echo ""
echo "maximum number of counts: "$count
min=${dice[1]}
count=1
for((i=2;i<=6;i++))
do
if [ ${dice[$i]} -lt $min ]
then
	min=${dice[$i]}
	count=$i
fi
done
echo "minimum number of counts:"$count
