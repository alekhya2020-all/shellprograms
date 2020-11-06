public interface EmpWage{
   public void addEmpWagecompany(String Company,int EmpRateperhour,int NumOfworkingdays,int MaxHourspermonth);
   public void compEmpWage();
   public void getTotalWage(String Company);
}
public class EmpWagecompany{
   public final String Company;
   public final int EmpRateperhour;
   public final int NumberOfworkingdays;
   public final int MaxHourspermonth;
   public int TotalEmpWage;

   public EmpWagecompany(String Company,int EmpRateperhour,int NumOfworkingdays,int MaxHourspermonth){
       this.Company=Company;
       this.EmpRateperhour=EmpRateperhour;
       this.NumberOfworkingdays=NumberOfworkingdays;
       this.Maxhourspermonth=Maxhourspermonth;
       TotalEmpWage=0;
       }
   public void setTotalEmpWage(int TotalEmpWage){
      this.TotalEmpWage=TotalEmpWage;
      }
      @Override
      public String toString(){
      return "Total Emp Wage for company:" +Company+ "is:"+TotalEmpWage;
      }
}








