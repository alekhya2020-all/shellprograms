public class IfElse{
	public static void main(String args[]){
	double randomVar=Math.floor(Math.random()*10)%6+1;
	System.out.println(+randomVar);
	if(randomVar==0)
	{
	System.out.println("Sunday");
	}
	else if(randomVar==1){
	System.out.println("Monday");
	}
	else if(randomVar==2){
	System.out.println("Tuesday");
	}
        else if(randomVar==3){        
        System.out.println("Wednesday");
        }
 	else if(randomVar==4){        
        System.out.println("Thursday");
        }
	 else if(randomVar==2){        
        System.out.println("Friday");
        }
 	else if(randomVar==2){        
        System.out.println("Saturday");
        }
	 else{        
        System.out.println("Not a day");
        }

}
}
