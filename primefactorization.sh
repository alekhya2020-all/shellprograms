#!/bin/bash -x
read n
for((i=2;i<=n;i++))
do
   if [ $((n%i)) -eq 0 ]
   then
k=1
   for((j=2; j<=i/2; j++))
   do
       if [ $((i%j)) -eq 0 ]
      then
			k=0
      break
       fi
   done
   
     # if [ $i -eq $j ]
if(k==1)      
then
      echo "it is a prime number."
      echo $j
      fi
fi
done

