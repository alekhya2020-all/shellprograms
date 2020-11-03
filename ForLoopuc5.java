import java.util.Scanner;
public class ForLoopuc5{
   public static final int PartTime=1;
   public static final int FullTime=2;
   public static final int EmpRateperhour=20;
	public static final int NumberOfworkingdays=2;

   public static void main(String[] args){
       int EmpHours=0,  EmpWage=0,  TotalEmployeeWage=0;
       for(int day=0;day<NumberOfworkingdays;day++){
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
            EmpWage = EmpHours * EmpRateperhour;
            TotalEmployeeWage += EmpWage;
		      System.out.println("EmpWage:"+EmpWage);
}
				System.out.println("TotalEmployeeWage:"+TotalEmployeeWage);
}
}


