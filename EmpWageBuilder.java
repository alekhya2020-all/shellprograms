import java.util.Scanner;
public class EmpWageBuilder{
   public final String Company;
   public final int EmpRateperhour;
   public final int NumberOfworkingdays;
   public final int Maxhoursinmonth;
   public int TotalEmpWage;

   public EmpWageBuilder(String Company,int EmpRateperhour,int NumberOfworkingdays,int Maxhoursinmonth) {
       this.Company=Company;
       this.EmpRateperhour=EmpRateperhour;
       this.NumberOfworkingdays=NumberOfworkingdays;
       this.Maxhoursinmonth=Maxhoursinmonth;
}
       }
//   public void setTotalEmpWage(int TotalEmpWage){
//		this.TotalEmpWage=TotalEmpWage;
//		}
  //    @Override
    //  public String toString(){
      //return "Total Emp Wage for company:" +Company+ "is:"+TotalEmpWage;
      //}
//}

