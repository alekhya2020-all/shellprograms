public interface EmpWage{
	public void addEmpWage(String Company,int EmpRateperhour,int NumOfworkingdays,int MaxHourspermonth);
	public void EmpWage();
	public void grtTotalWage(String Company);
}
public class EmpWageuc13{
	public final String Company;
	public final int EmpRateperhour;
	public final int MaxHourspermonth;
	public int TotalEmpWage;

	public EmpWageuc13(String Company,int EmpRateperhour,int NumOfworkingdays,int MaxHourspermonth);
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
	public class Wage implements EmpWage {
		public static final int PartTime=1;
		public static final int FullTime=2;

		private int numofcompany=0;
		private LinkedList<EmpWageuc13> EmpWageuc13List;
		private Map<String,EmpWageuc13>EmpWageuc13Map;
		public Wage(){
			EmpWageuc13List=new LinkedList<>();
			EmpWageuc13Map=new Map<>();
			}
		public void addEmpWageuc13(String Company,int EmpRateperhour,int NumOfworkingdays,int MaxHourspermonth);
			EmpWageuc13 empWageuc13=new EmpWageuc13( Company, EmpRateperhour, NumOfworkingdays, MaxHourspermonth);

			EmpWageuc13List.add(EpWageuc13);
         EmpWageuc13Map.put(Company,EmpWageuc13);
         }
	public void EmpWageuc(){
			for(int i=0;i<EmpWageuc13List.size();i++){
			EmpWageuc13 empwageuc13=EmpWageuc13List.get(i);
			EmpWageuc13.setTotalEmpWage(this.EmpWageuc13(EmpWageuc13));
			System.out.println(EmpWageuc13);
		   }
}
	@Override
	public int getTotalEmpWage(String Company){
			return EmpWageuc13Map.get(Company).TotalEmpWage;
}
	public int EmpWageuc(EmpWageuc13 empWageuc13){...}

	public static void main(String[] args){
			EmpWage Wage=new Wage();
			Wage.addEmpWageuc13(Company "Flipkart",EmpRateperhour 25,NumberOfworkingdays 3,Maxhourspermonth 15);
			Wage.addEmpWageuc13(Company "Amazon",EmpRateperhour 30,NumberOfworkingdays 5,Maxhourspermonth 25); 
			Wage.EmpWageuc();
			System.out.println("total wage flipkart company:"+Wage.getTotalWage(company "Flipkart"));
			}
}

