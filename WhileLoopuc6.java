import java.util.Scanner;
public class WhileLoopuc6{
   public static final int PartTime=1;
   public static final int FullTime=2;
   public static final int EmpRateperhour=20;
   public static final int NumberOfworkingdays=2;
	public static final int Maxhoursinmonth=10;
   public static void main(String[] args){
       int TotalEmployeeHours=0,  TotalEmpWage=0,  TotalWorkingDays=0;
  		 while (TotalEmployeeHours<=Maxhoursinmonth && TotalWorkingDays < NumberOfworkingdays){
		 int EmpHours=0, EmpWage=0;
		 TotalWorkingDays++;
       int randomVar=(int)Math.floor(Math.random()*10)%3;
       switch (randomVar){
       case PartTime:
            EmpHours=4;
            break;
       case FullTime:
            EmpHours=8;
            break;
       default:
            EmpHours=0;
         }
				EmpWage=EmpHours*EmpRateperhour;
            TotalEmpWage += EmpWage;
            System.out.println("EmpWage:"+EmpWage);
}
            System.out.println("TotalEmpWage:"+TotalEmpWage);
}
}



