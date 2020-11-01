public class IfElse{
	public static void main(String args[]){
	double randomVar=Math.floor(Math.random()*10)%2;
	System.out.println(+randomVar);
	if(randomVar==1)
	{
	System.out.println("Head");
	}
	else{
	System.out.println("Tail");
	}
	}
}
