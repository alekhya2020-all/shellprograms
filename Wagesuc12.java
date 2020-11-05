import java.util.Scanner;
public class Wagesuc12{
   public static final int PartTime=1;
   public static final int FullTime=2;
   private static int Salary=0, EmpHours=0;

   public static int computeEmpWage(String Company,int EmpRateperhour,int NumberOfworkingdays,int Maxhoursinmonth,int EmpHours) {

		 int TotalEmployeeHours=0, TotalEmpWage=0, TotalWorkingDays=0;
       while (TotalEmployeeHours<=Maxhoursinmonth && TotalWorkingDays < NumberOfworkingdays){
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
		      TotalEmployeeHours += EmpHours;
            System.out.println("Day#:" +TotalWorkingDays +"EmpHours:"+EmpHours);
}
			   Salary=EmpHours*EmpRateperhour;
				System.out.println("Salary is:"+Salary);
				return Salary;

				TotalEmpWage=TotalEmployeeHours*EmpRateperhour;
            System.out.println("TotalEmpWage:"+TotalEmpWage);
            return TotalEmpWage;
}
            public static void main(String[] args){
            computeEmpWage("Flipkart" ,25,2,10,8);
            computeEmpWage("Amazon" ,15,4,15,9);
            }
}

