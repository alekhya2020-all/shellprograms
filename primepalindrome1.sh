#!/bin/bash -x
prime() {

for((i=2;i<=n/2;i++))
do
  if [ $((n%i)) -eq 0 ]
  then
    echo "$n is not a prime number."
	 break
	 fi
	 echo "$n is a prime number."
done
}
read n
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
if [ $on -eq $rev ]
then
  echo "number is palindrome"
else
  echo "number is not palindrome."
fi
}
read n
palindrome "$n";

primepalindrome() {
if prime && palindrome;
then
echo "primepalindrome"
fi
}
read n
primepalindrome
