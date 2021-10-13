import java.util.Scanner;

public class CheckArithmeticExcep {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter dividend and divisor");
		int a=sc.nextInt(), b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println("the result is: "+result);
}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception!");
		}
	}
}