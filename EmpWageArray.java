import java.util.Scanner;
public class EmpWageArray{
                public static final int PartTime=1;
                public static final int FullTime=2;
                private int numofcompany=0;
                private EmpWageBuilder[] EmpWageBuilderArray;
                public EmpWageArray(){
                EmpWageBuilderArray = new EmpWageBuilder[5];
                }

        private void addEmpWageBuilder(String Company,int EmpRateperhour,int NumberOfworkingdays, int Maxhoursinmonth){
                EmpWageBuilderArray(numofcompany) = new EmpWageBuilder(Company,EmpRateperhour,NumberOfworkingdays,Maxhoursinmonth);
                numofcompany++;
        }
        private void compEmpWage(){
                for(int i=0;i<numofcompany;i++){
                        EmpWageBuilderArray[i].setTotalEmpWage(this.compEmpWage(EmpWageBuilderArray[i]));
                        System.out.println(EmpWageBuilderArray[i]);
                        }
        }
       private int compEmpWage(EmpWageuc10 EmpWageuc10){
       int NumberOfworkingdays=0,Maxhoursinmonth=0,TotalEmployeeHours=0, TotalEmpWage=0, TotalWorkingDays=0;
       while (TotalEmployeeHours<=Maxhoursinmonth && TotalWorkingDays<NumberOfworkingdays){
       int EmpHours=0, EmpWage=0;
       TotalWorkingDays++;
       int randomVar=(int)Math.floor(Math.random()*10)%3;
       switch (randomVar){
        case  PartTime:
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
            return TotalEmployeeHours*EmpWageuc10.EmpRateperhour;
}

     public static void main(String[] args){
        EmpWageArray EmpWage=new EmpWageArray();
        EmpWage.addEmpWageBuilder("Flipkart", 25,2,10);
        EmpWage.addEmpWageBuilder("Amazon", 15,4,15);
        EmpWage.EmpWageBuilder();
      }
}
