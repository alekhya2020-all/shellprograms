#!/bin/bash -x
Hello(){
   echo "hello" $1 $2
   name=$1
   echo $name
   return 10
}
echo "enter your name"
read name
Hello $name codinclub
returnvalue=$?
echo $returnvalue
