public class ForloopExample{
	public static void main(String args[]){
	double randomVar=Math.floor(Math.random()*10)%8;
	System.out.println(randomVar);
	double harmonium=0;
	for (double i = 1;i <= randomVar;i++) {
	System.out.println(i);
	harmonium=1/i;
	System.out.println("harmonium number is:" +harmonium);
	}
	}
}
