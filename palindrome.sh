#!/bin/bash -x
palindrome() {
on=$n1
rev=0
s=0
while [ $n1 -gt 0 ]
do
echo $n1
    s=$(( $n1 % 10 ))
    rev=$((($rev*10)+$s))
	 n1=$(($n1/10))
echo $rev
done

if [ $on -eq $rev ]
then
  echo "Number is palindrome"
else
  echo "Number is NOT palindrome"
fi


on=$n2
rev=0
s=0
while [ $n2 -gt 0 ]
do
echo $n2
    s=$(( $n2 % 10 ))
    rev=$((($rev*10)+$s))
    n2=$(($n2/10))
echo $rev
done
if [ $on -eq $rev ]
then
  echo "Number is palindrome"
else
  echo "Number is NOT palindrome"
fi
}
read n1
read n2
palindrome "$n1"
palindrome "$n2"
