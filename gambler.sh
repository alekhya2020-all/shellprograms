#!/bin/bash -x
start=100
win=0
loose=0

while [ $start -le 200 -a $start -ge 1 ]
do
random=$(expr $RANDOM%2)

if [ $random == 0 ]
then
	start=$(($start+1))
	win=$(($win+1))
else [ $random == 1 ]
	loose=$(($loose+1))
	start=$(($start-1))
fi
done

if [ $random == 200 ]
then
	echo "gambler wins"
else
	echo "gambler loses"
fi
echo "$win"
echo "$loose"
echo "$start"
