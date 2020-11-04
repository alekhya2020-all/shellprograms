import java.util.Scanner;
public class EmpWageuc10{
   public final String Company;
   public final int EmpRateperhour;
   public final int NumberOfworkingdays;
   public final int Maxhoursinmonth;
   public int TotalEmpWage;

   public EmpWageuc10(String Company,int EmpRateperhour,int NumberOfworkingdays,int Maxhoursinmonth) {
       this.Company=Company;
       this.EmpRateperhour=EmpRateperhour;
       this.NumberOfworkingdays=NumberOfworkingdays;
       this.Maxhoursinmonth=Maxhoursinmonth;
       }
   public void TotalEmpWage(int TotalEmpWage){
		this.TotalEmpWage=TotalEmpWage;
		}
      @Override
      public String toString(){
      return "Total Emp Wage for company:" +Company+ "is:"+TotalEmpWage;
      }
}
	public class EmpWageArray{
		public static final PartTime=1;
		public static final FullTime=2;
		private int numofcompany=0;
		private EmpWageuc10[] EmpWageuc10Array;
		public EmpWageArray(){
		EmpWageuc10Array=new EmpWageuc10[5];
		}
	private void addEmpWageuc10(String Company,int EmpRateperhour,NumberOfworkingdays,Maxhoursinmonth);
		EmpWageuc10Array(numofcompany)=new EmpWageuc10(company,EmpRateperhour,NumberOfworkingdays,Maxhoursinmonth);
		numofcompany++;
	}
	private void compEmpWage(){
		for(int i=0;i<numofcompany;i++){
			EmpWageuc10Array[i].setTotalEmpWage(this.compEmpWage(EmpWageuc10Array[i]));
			System.out.println(EmpWageMultipleCompaniesArray[i]);
		}
	}
	private int compEmpWage(EmpWageuc10 EmpWage uc10){
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
            return TotalEmployeeHours*CompanyEmpWage.EmpRateperhour;
}

    public static void main(String[] args){
		EmpWageArray EmpWage=new EmpWageArray();
      EmpWage.addEmpWageuc10("Flipkart", 25,2,10);
      EmpWage.addEmpWageuc10("Amazon", 15,4,15);
      EmpWage.EmpWageuc10();
      }


