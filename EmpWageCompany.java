public class Wage implements EmpWage {
      public static final int PartTime=1;
      public static final int FullTime=2;

      private int numofcompany=0;
      private LinkedList<EmpWagecompany> EmpWagecompanyList;
      private Map<String,EmpWagecompany>EmpWagecompanyMap;
      public Wage(){
         EmpWagecompanyList=new LinkedList<>();
         EmpWagecompanyMap=new Map<>();
         }
      public void addEmpWagecompany(String Company,int EmpRateperhour,int NumOfworkingdays,int MaxHourspermonth);
         EmpWagecompany empWagecompany=new EmpWagecompany( Company, EmpRateperhour, NumOfworkingdays, MaxHourspermonth);

         EmpWagecompanyList.add(EpWagecompany);
         EmpWagecompanyMap.put(Company,EmpWagecompany);
         }
   public void EmpWageuc(){
         for(int i=0;i<EmpWagecompanyList.size();i++){
         EmpWagecompany empwagecompany=EmpWagecompanyList.get(i);
         EmpWagecompany.setTotalEmpWage(this.EmpWagecompany(EmpWagecompany));
         System.out.println(EmpWagecompany);
         }
}
   @Override
public int getTotalEmpWage(String Company){
         return EmpWagecompanyMap.get(Company).TotalEmpWage;
}
   public int EmpWageuc(EmpWagecompany empWagecompany){...}

   public static void main(String[] args){
         EmpWage Wage=new Wage();
         Wage.addEmpWagecompany(Company "Flipkart",EmpRateperhour 25,NumberOfworkingdays 3,Maxhourspermonth 15);
         Wage.addEmpWagecompany(Company "Amazon",EmpRateperhour 30,NumberOfworkingdays 5,Maxhourspermonth 25); 
         Wage.EmpWageuc();
         System.out.println("total wage flipkart company:"+Wage.getTotalWage(company "Flipkart"));
         }
}



