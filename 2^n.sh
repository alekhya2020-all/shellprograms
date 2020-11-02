#!/bin/bash -x
read n
i=0

while [ $i -le $n ]
do
     value=$((2**$i))
     ((i=i+1))

    if [ $i -gt 8 ]
      then
      break
    fi
     echo $value
done
