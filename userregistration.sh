#!/bin/bash -x
function firstname(){
pat="^[a-zA-Z]{3,}$"
echo "give a input"
if [[ $input =~ $pat ]]
then
        echo "matching"
else
        echo "not matching"
fi
}
read input
firstname "$input";

function lastname(){
match="$( firstname )"
}
read input
lastname "$input";

function email(){
pat="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)+@[0-9a-zA-Z]+.[a-zA-Z]{2,4}+([.][a-zA-Z]{2})$"
echo "i"
if [[ $i =~ $pat ]]
then
        echo "matching"
else
        echo "not matching"
fi
}
read i
email "$i";

function mobile(){
pat="^91\\s?[0-9]{10}$"
echo "i"
if [[ $i =~ $pat ]]
then
        echo "matching"
else
        echo "not matching"
fi
}
read i
mobile "$i";

function password(){
pat="^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#@$?])(?=.*?[a-z]).{8,}$"
echo "i"
if [[ $i =~ $pat ]]
then
        echo "matching"
else
        echo "not matching"
fi
}
read i
password "$i";

function postalcode(){
pat="^[0-9]{3}\\s?[0-9]{3}$"
echo "i"
if [[ $i =~ $pat ]]
then
        echo "matching"
else
        echo "not matching"

fi
}
read i
postalcode "$i";


