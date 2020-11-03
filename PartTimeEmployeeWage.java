import java.util.Scanner;
public class PartTimeEmployeeWage{
   public static void main(String args[]){
	int PartTime=1;
	int FullTime=2;
   int EmpRateperhour=20;
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
	}
}

