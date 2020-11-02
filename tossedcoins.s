#!/bin/bash -x
read tossedcoin
if ["$tossedcoin	"==1 ];
then
echo tossedcoin=$"head"
else
echo tossedcoin=$"tail"
fi;
