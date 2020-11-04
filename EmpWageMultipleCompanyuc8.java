import java.util.Scanner;
public class EmpWageMultipleCompanyuc8{
   public static final int PartTime=1;
   public static final int FullTime=2;
   public static int computeEmpWage(String Company,int EmpRateperhour,int NumberOfworkingdays,int Maxhoursinmonth) {
       int TotalEmployeeHours=0, TotalEmpWage=0, TotalWorkingDays=0;
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
            TotalEmployeeHours += EmpHours;
            System.out.println("Day#:" +TotalWorkingDays +"EmpHours:"+EmpHours);
}
            TotalEmpWage=TotalEmployeeHours*EmpRateperhour;
            System.out.println("Total Emp Wage for company:" +Company+ "is:"+TotalEmpWage);
            return TotalEmpWage;
}
            public static void main(String[] args){
            computeEmpWage("Flipkart", 25,2,10);
				computeEmpWage("Amazon", 15,4,15);
				}
}
