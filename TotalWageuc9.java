import java.util.Scanner;
public class TotalWageuc9{
   public static final int PartTime=1;
   public static final int FullTime=2;
	private final String Company;
	private final int EmpRateperhour;
	private final int NumberOfworkingdays;
	private final int Maxhoursinmonth;
	private int TotalEmpWage;

	public TotalWageuc9(String Company,int EmpRateperhour,int NumberOfworkingdays,int Maxhoursinmonth) {
   	 this.Company=Company;
		 this.EmpRateperhour=EmpRateperhour;
		 this.NumberOfworkingdays=NumberOfworkingdays;
		 this.Maxhoursinmonth=Maxhoursinmonth;
		 }
	public void compEmpWage(){
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
}
				@Override
				public String toString(){
            return "Total Emp Wage for company:" +Company+ "is:"+TotalEmpWage;
				}
            public static void main(String[] args){
            TotalWageuc9 Flipkart= new TotalWageuc9("Flipkart", 25,2,10);
            TotalWageuc9 Amazon=new TotalWageuc9("Amazon", 15,4,15);
            Flipkart.compEmpWage();
				System.out.println(Flipkart);
				Amazon.compEmpWage();
				System.out.println(Amazon);
				}
}


