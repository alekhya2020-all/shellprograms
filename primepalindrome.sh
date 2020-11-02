#!/bin/bash -x
$n=number
echo $number
read number
prime() {
f=0
for((i=2;i<=n/2;i++))
do
  if [ $((n%i)) -eq 0 ]
  then
  		f=1
		break
  fi
done
if [ $f -eq 0 ]
then
echo "prime"
fi
}
#read n
prime "$n";

palindrome() {

on=$n
rev=0
s=0
while [ $n -gt 0 ]
do
echo $n
    s=$(( $n % 10 ))
    rev=$((($rev*10)+$s))
    n=$(($n/10))
echo $rev
done
if [ $on -ne $rev ]
then
	#echo "number is palindrome"
	break
else
	echo "palindrome"
fi
}
#read n
palindrome "$n";

primepalindrome(){

if prime && palindrome;
then
echo "primepalindrome"
fi
}
#read n
primepalindrome

