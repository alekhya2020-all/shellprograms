import java.util.Scanner;
public class DailyEmployeeWage{
	public static void main(String args[]){
	double randomVar=Math.floor(Math.random()*10)%2;
	System.out.println(+randomVar);
	if(randomVar==1)
	{
	int EmpRateperhour=20;
	int Emphours=8;
	int Salary=Emphours*EmpRateperhour;
	System.out.println("Salary:"+Salary);
	}
	else{
	int Salary=0;
	System.out.println("Salary:"+Salary);
	}
	}
}
