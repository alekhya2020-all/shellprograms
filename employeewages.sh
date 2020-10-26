#!/bin/bash -x

WELCOME

present=1
randomval=$((RANDOM%2))
if [ $present -eq $randomval ]
then
	echo "employee is present"
else
	echo "employee is absent"
fi

totalemployeehours=0;
tatalworkingdays=0;

parttime=1;
fulltime=2;
max_hours_in_month=4;
emp_rate_per_hour=20;
number_of_working_days=20;

declare -A dailywage

function getworkhours(){
local $empcheck=$1
case $empcheck in
$fulltime)
 employeehours=8;;
$parttime)
 employeehours=4;;
*)employeehours=0;;
esac
echo $employeehours
}

function getemployeewage(){
local $employeehours=$1
echo $(($employeehours*emp_rate_per_hour))
}


while [[ $totalemployeehours -lt $max_hours_in_month && $totalworkingdays -lt $number_of_working_days ]]
do
	((totalworkingdays++))
	empcheck=$((RANDOM%3));
	employeehours="$( getworkhours $empcheck )"
	totalemployeehours=$(($totalemployeehours+$employeehours))
	dailywage["day" "$totalworkingdays"]="$( getemployeewage  $emphours )"
done

totalsalary=$(($totalemployeehours*$emp_rate_per_hour));
echo ${dailywage[@]}
echo ${!dailywage[@]}

