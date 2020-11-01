read n
if [ $n -ge 100 -a $n -le 999 ]
then
for((i=2;n>1;i++))
do
	while [ $((n%i)) -eq 0 ]
   do
      echo "prime number:"$i
      n=$((n/i))
   done
done
fi


    for((i=1;i<=n;i++))
	 do
        if [ $((n%i)) -eq 0 ]
      then
		echo "factors:"$i
	array[i]=$i
echo ${array[i]}
echo ${array[@]}
fi
done


    for((i=1;i<=n;i++))
    do
        if [ $((n%i)) -eq 0 ]
      then
      echo "factors:"$i
echo ${array[i]}
if [ $((i%2)) -eq 0 ]
then
echo "even factors:"$i
echo ${evenfactors[i]}
elif [ $((i%2)) -ne 0 ]
then
echo "odd factors:" $i 
echo ${oddfactors[i]}
fi
fi
done

on=$n
rev=0
s=0
while [ $n -gt 0 ]
do
    s=$(($n%10))
    rev=$((($rev*10)+$s))
    n=$(($n/10))
echo $rev
done
if [ $on -eq $rev ]
then
  echo "Number is palindrome"
else
  echo "Number is NOT palindrome"
fi
