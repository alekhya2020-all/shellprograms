
#!/bin/bash -x

echo "enter a number"
read n
case $n in
        1) echo -n "sunday " ;;
        2) echo -n "monday " ;;
        3) echo -n "tuesday " ;;
        4) echo -n "wednesday " ;;
        5) echo -n "thursday " ;;
        6) echo -n "friday " ;;
        7) echo -n "saturday " ;;
        *) echo -n "enter value between 1 to 7";;    
esac























 
            printf("Invalid input! Please enter week number between 1-7.");

