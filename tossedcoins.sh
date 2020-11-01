#!/bin/bash -x
read tossedcoin
if [ $tossedcoin -eq 1 ]
then
    echo "tossedcoin is head"
else [$tossedcoin -ne 1 ]
    echo "tossedcoin is tail"
fi 
