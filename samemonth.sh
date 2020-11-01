#!/bin/bash -x
declare -A bornin92
declare -A bornin93
for((i=1;i<=12;i++))
do
bornin92[$i]=0
bornin93[$i]=0
done
for((i=1;i<=50;i++))
do
count=$((RANDOM%12+1))
((bornin92[$count]++))
roll=$((RANDOM%12+1))
((bornin93[$count]++))
done
echo "born in 92:"
for((i=1;i<=12;i++))
do
echo -n "$bornin92[$i]}"
done
echo ""
echo "born in 93:"
for((i=1;i<=12;i++))
do
echo -n "$bornin93[$i]}"
done
echo ""

echo -e "month\t\t1992\t\t1993"

for((i=1;i<=12;i++))
do
case $i in
1)
m="jan" ;;
2)
m="feb" ;;
3)
m="mar" ;;
4)
m="apr" ;;
5)
m="may" ;;
6)
m="june" ;;
7)
m="july" ;;
8)
m="aug" ;;
9)
m="sep" ;;
10)
m="oct" ;;
11)
m="nov" ;;
12)
m="dec" ;;
esac

echo -e "$m\t\t${bornin92[$i]}\t\t${bornin93[$i]}"
done
