#! bin/bash -x
randomnumber=$((RANDOM))
echo $((RANDOM % (99-10+1)+10))
