#!/bin/bash -x
declare -A sounds
sounds[dog]="bark"
sounds[cow]="moo"
sounds[birds]="tweet"
sounds[wolf]="houl"

#echo "sound of dog -->  "${sounds[dog]}
#echo "animal-->"${!sounds[@]}
#echo "sounds-->"${sounds[@]}
#echo "no. of animals-->"${#sounds[@]}
#unset sounds[cow]
#echo ${sounds[@]}

for i in "${!sounds[@]}"
do
	echo $i
done
