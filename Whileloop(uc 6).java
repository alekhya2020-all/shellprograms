import java.util.Scanner;
public class Whileloop{
public static void main(String args[]){
   int PartTime=1;
   int FullTime=2;
   int TotalSalary=0;
   int EmpRateperhour=20;
   int numberofworkingdays=20;
	int maxhoursinmonth=4;
	int totalemployeehours=0;
   int totalworkingdays=0;
while ( totalemployeehours < maxhoursinmonth && totalworkingdays < numberofworkingdays ){
	totalworkingdays++;
		  double randomVar=Math.floor(Math.random()*10)%3;
	     System.out.println(+randomVar);
	 if (FullTime==randomVar)
   {
   int emphours=8;
   int Salary=emphours*EmpRateperhour;
   System.out.println("salary"+Salary);
   }
   else if (PartTime==randomVar)
   {
   int emphours=4;
   int Salary=emphours*EmpRateperhour;
   System.out.println("salary"+Salary);
   }
   else{
   int emphours=0;
   }

switch((int)randomVar){
   case 1:
   int emphours=4;
   int Salary=emphours*EmpRateperhour;
   System.out.println("Salary"+Salary);
   break;
   case 2:
   int empHours=8;
   int salary=empHours*EmpRateperhour;
   System.out.println("salary"+salary);
   break;
   case 3:
   int EmpHours=0;
   break;
   default:
   System.out.println("default");
	}
	}
}
}
