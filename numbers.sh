#!/bin/bash -x
read -p "enter the number n"
echo "s,y,z,x"
while [ n -ne 0 ]
do
s=n%10

n=n/10

y=n%10

n=n/10

z=n%10
n=n/10

x=n%10
done

echo $s -eq ones
echo $y -eq tens
echo $z -eq hundred
echo $x -eq thousand
