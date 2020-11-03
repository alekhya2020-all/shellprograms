import java.util.Scanner;
public class ForLoop{
public static void main(String args[]){
	int PartTime=1;
   int FullTime=2;
   int TotalSalary=0;
	int EmpRateperhour=20;
	int numberofworkingdays=20;
   int day=0;
	for ( day=1;day<=numberofworkingdays;day++ ){
	double randomVar=Math.floor(Math.random()*10)%3;
   System.out.println(+randomVar);
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

