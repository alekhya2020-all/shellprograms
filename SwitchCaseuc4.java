import java.util.Scanner;
public class SwitchCaseuc4{
	public static final int PartTime=1;
	public static final int FullTime=2;
	public static final int EmpRateperhour=20;

	public static void main(String[] args){
	    int EmpHours=0;
		 int EmpWage=0;
		 double randomVar=Math.floor(Math.random()*10%3);
		 System.out.println("random:"+randomVar);
		 switch ((int)randomVar){
		 case PartTime:
				EmpHours=4;
				break;
  		 case FullTime:
				EmpHours=8;
				break;

		 default:
				EmpHours=0;
			}
				EmpWage = EmpHours * EmpRateperhour;
				System.out.println("EmpWage:"+EmpWage);
}
}
